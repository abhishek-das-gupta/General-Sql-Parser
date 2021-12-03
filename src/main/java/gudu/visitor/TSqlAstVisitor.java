package gudu.visitor;

import gudu.antlr.TeradataCreateTableBaseVisitor;
import gudu.antlr.TeradataCreateTableParser;
import gudu.parser.TParseTree;
import gudu.parser.table.TCreateTableSqlStatement;
import gudu.parser.table.column.TColumnDefinition;
import gudu.parser.table.column.TColumnDefinitionList;
import gudu.parser.table.column.attribute.TCaseSpecificAttribute;
import gudu.parser.table.column.attribute.TCharacterSetAttribute;
import gudu.parser.table.column.attribute.TColumnAttribute;
import gudu.parser.table.column.attribute.TColumnAttributeList;
import gudu.parser.table.column.attribute.TCompressAttribute;
import gudu.parser.table.column.attribute.TFormatAttribute;
import gudu.parser.table.column.attribute.TIdentityAttribute;
import gudu.parser.table.column.attribute.TNotNullAttribute;
import gudu.parser.table.expression.EOperatorToken;
import gudu.parser.table.expression.TBinaryExpression;
import gudu.parser.table.expression.TExpression;
import gudu.parser.table.expression.TExpressionList;
import gudu.parser.table.expression.TLiteral;
import gudu.parser.table.expression.TLoadExpression;
import gudu.parser.table.index.TNoPrimaryIndex;
import gudu.parser.table.index.TPTNode;
import gudu.parser.table.index.TPrimaryAmpIndex;
import gudu.parser.table.index.TUniquePrimaryIndex;
import gudu.parser.table.index.TUniqueSecondaryIndex;
import gudu.parser.table.option.TAfterJournalTableOption;
import gudu.parser.table.option.TBeforeJournalOption;
import gudu.parser.table.option.TBlockMergeRatioOption;
import gudu.parser.table.option.TChecksumOption;
import gudu.parser.table.option.TFallBackOption;
import gudu.parser.table.option.TTableOption;
import gudu.parser.table.option.TTableOptionList;
import gudu.parser.table.partition.TCaseNPartition;
import gudu.parser.table.partition.TPTNodeList;
import gudu.parser.table.partition.TPartitionExpression;
import gudu.parser.table.partition.TPartitionExpressionList;
import gudu.parser.table.partition.TRangeNPartition;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Visitor that does all the grunt work to create a proper object binding.
 */

public class TSqlAstVisitor extends TeradataCreateTableBaseVisitor<TParseTree> {

  private final TCreateTableSqlStatement.Builder builder;
  private final Map<String, TColumnDefinition> columnDefinitionMap;

  public TSqlAstVisitor() {
    this.builder = new TCreateTableSqlStatement.Builder();
    this.columnDefinitionMap = new HashMap<>();
  }

  @Override
  public TParseTree visitParseCreateTable(TeradataCreateTableParser.ParseCreateTableContext ctx) {
    return visit(ctx.getChild(0));
  }

  @Override
  public TParseTree visitCreateTable(TeradataCreateTableParser.CreateTableContext ctx) {
    return builder
      .withTableName((TLiteral) visit(ctx.tableName()))
      .withDatabase(ctx.DATABASE_NAME() != null ? new TLiteral(ctx.DATABASE_NAME().getText(), false, null) : null)
      .withSchema(ctx.USER_NAME() != null ? new TLiteral(ctx.DATABASE_NAME().getText(), false, null) : null)
      .withSet(ctx.SET() != null)
      .withMultiSet(ctx.MULTISET() != null)
      .withGTT(ctx.GLOBAL() != null && ctx.TEMPORARY() != null)
      .withVolatile(ctx.VOLATILE() != null)
      .withTableOptionList(ctx.tableOptionList() != null ? (TTableOptionList) visit(ctx.tableOptionList()) : null)
      .withTColumnDefinitionList((TColumnDefinitionList) visit(ctx.columnDefinitionList()))
      .withTPTNodeList(ctx.indexDefinitions() != null ? (TPTNodeList) visit(ctx.indexDefinitions()) : null)
      .build();
  }

  @Override
  public TParseTree visitTableName(TeradataCreateTableParser.TableNameContext ctx) {
    return new TLiteral(ctx.NAME().getText(), false, null);
  }

  @Override
  public TParseTree visitColumnDefinitionList(TeradataCreateTableParser.ColumnDefinitionListContext ctx) {
    List<TColumnDefinition> columnDefinitions = new ArrayList<>();
    for (TeradataCreateTableParser.ColumnDefinitionContext colDef : ctx.columnDefinition()) {
      TColumnDefinition columnDefinition = (TColumnDefinition) visit(colDef);
      String name = columnDefinition.getColumnName().getVal();
      columnDefinitionMap.putIfAbsent(name, columnDefinition);
      columnDefinitions.add(columnDefinition);
    }
    return new TColumnDefinitionList(columnDefinitions);
  }

  @Override
  public TParseTree visitColumnDefinition(TeradataCreateTableParser.ColumnDefinitionContext ctx) {
    return new TColumnDefinition((TLiteral) visit(ctx.columnName()),
      (TLiteral) visit(ctx.dataType()), (TColumnAttributeList) visit(ctx.columnAttributeList()));
  }

  public TParseTree visitTerminal(TerminalNode node) {
    return new TLiteral(node.getText(), false, null);
  }

  @Override
  public TParseTree visitColumnName(TeradataCreateTableParser.ColumnNameContext ctx) {
    return new TLiteral(ctx.NAME().getText(), false, null);
  }

  @Override
  public TParseTree visitDataType(TeradataCreateTableParser.DataTypeContext ctx) {
    return new TLiteral(ctx.NAME().getText(), false, null);
  }

  @Override
  public TParseTree visitIndexDefinitions(TeradataCreateTableParser.IndexDefinitionsContext ctx) {
    if (ctx.children == null) {
      return null;
    }
    List<TPTNode> tptNodes = new ArrayList<>();
    for (int i = 0; i < ctx.children.size(); ++i) {
      tptNodes.add((TPTNode) visit(ctx.getChild(i)));
    }
    return new TPTNodeList(tptNodes);
  }

  @Override
  public TParseTree visitUniquePrimaryIndex(TeradataCreateTableParser.UniquePrimaryIndexContext ctx) {
    boolean isUnique = ctx.UNIQUE() != null, isPrimary = ctx.PRIMARY() != null;
    TLiteral indexName = ctx.indexName() != null ? (TLiteral) visit(ctx.indexName()) : null;
    TColumnDefinitionList indexDefinitionList = (TColumnDefinitionList) visit(ctx.indexColumnList());
    if (isPrimary) {
      TUniquePrimaryIndex.Builder indexBuilder = new TUniquePrimaryIndex.Builder();
      return indexBuilder
        .withIsUnique(isUnique)
        .withIsPrimary(isPrimary)
        .withIndexName(indexName)
        .withIndexColumnList(indexDefinitionList)
        .build();
    } else if (isUnique) {
      return new TUniqueSecondaryIndex(indexName, indexDefinitionList,
        ctx.loading() != null ? (TLoadExpression) visit(ctx.loading()) : null);
    } else {
      return null;
    }
  }

  @Override
  public TParseTree visitNoPrimaryIndex(TeradataCreateTableParser.NoPrimaryIndexContext ctx) {
    return new TNoPrimaryIndex();
  }

  @Override
  public TParseTree visitPrimaryAmpIndex(TeradataCreateTableParser.PrimaryAmpIndexContext ctx) {
    return new TPrimaryAmpIndex(ctx.INDEX() != null, (TColumnDefinitionList) visit(ctx.indexColumnList()));
  }

  @Override
  public TParseTree visitIndexName(TeradataCreateTableParser.IndexNameContext ctx) {
    return new TLiteral(ctx.NAME().getText(), false, null);
  }

  @Override
  public TParseTree visitIndexColumnList(TeradataCreateTableParser.IndexColumnListContext ctx) {
    List<TColumnDefinition> indexColumns = new ArrayList<>();
    for (TeradataCreateTableParser.ColumnNameContext columnName : ctx.columnName()) {
      indexColumns.add(columnDefinitionMap.get(columnName.getText()));
    }
    return new TColumnDefinitionList(indexColumns);
  }

  @Override
  public TParseTree visitLoading(TeradataCreateTableParser.LoadingContext ctx) {
    return new TLoadExpression(ctx.NO() != null);
  }

  @Override
  public TParseTree visitOrdering(TeradataCreateTableParser.OrderingContext ctx) {
    return super.visitOrdering(ctx);
  }

  @Override
  public TParseTree visitOrderColumnName(TeradataCreateTableParser.OrderColumnNameContext ctx) {
    return super.visitOrderColumnName(ctx);
  }

  @Override
  public TParseTree visitPartitionExpressionList(TeradataCreateTableParser.PartitionExpressionListContext ctx) {
    if (ctx.children == null) {
      return null;
    }
    List<TPartitionExpression> partitionExpressions = new ArrayList<>();
    for (TeradataCreateTableParser.PartitionExpressionContext ctx_ : ctx.partitionExpression()) {
      partitionExpressions.add((TPartitionExpression) visit(ctx_));
    }
    return new TPartitionExpressionList(partitionExpressions);
  }

  @Override
  public TParseTree visitPartitionExpression(TeradataCreateTableParser.PartitionExpressionContext ctx) {
    return visit(ctx.getChild(0));
  }

  @Override
  public TParseTree visitSimplePartition(TeradataCreateTableParser.SimplePartitionContext ctx) {
    return super.visitSimplePartition(ctx);
  }

  @Override
  public TParseTree visitCaseNPartition(TeradataCreateTableParser.CaseNPartitionContext ctx) {
    TExpressionList caseExpressionList = (TExpressionList) visit(ctx.conditionalExpressionList());
    return new TCaseNPartition(caseExpressionList, ctx.NO_CASE() != null, ctx.UNKNOWN() != null);
  }

  @Override
  public TParseTree visitConditionalExpressionList(TeradataCreateTableParser.ConditionalExpressionListContext ctx) {
    List<TExpression> tExpressions = new ArrayList<>();
    for (TeradataCreateTableParser.ConditionalExpressionContext ctx_ : ctx.conditionalExpression()) {
      tExpressions.add((TExpression) visit(ctx_));
    }
    return new TExpressionList(tExpressions);
  }

  @Override
  public TParseTree visitConditionalExpression(TeradataCreateTableParser.ConditionalExpressionContext ctx) {
    return visit(ctx.tExpression());
  }

  @Override
  public TParseTree visitTExpression(TeradataCreateTableParser.TExpressionContext ctx) {
    if (ctx.AND() != null || ctx.BETWEEN() != null || ctx.operator() != null) {
      EOperatorToken operator = EOperatorToken.getOperatorEnum(getOperatorFromTExpression(ctx));
      TExpression leftExpr = (TExpression) visit(ctx.tExpression(0));
      TExpression rightExpr = (TExpression) visit(ctx.tExpression(1));
      return new TBinaryExpression(leftExpr, operator, rightExpr);
    } else if (ctx.expressionString() != null) {
      return visit(ctx.expressionString());
    } else if (ctx.columnExpression() != null) {
      return visit(ctx.columnExpression());
    } else if (ctx.columnName() != null) {
      return visit(ctx.columnName());
    } else if (ctx.INT2() != null) {
      return new TLiteral(ctx.INT2().getText(), false, null);
    } else if (ctx.INT4() != null) {
      return new TLiteral(ctx.INT4().getText(), false, null);
    } else if (ctx.FLOAT() != null) {
      return new TLiteral(ctx.FLOAT().getText(), false, null);
    } else {
      return new TLiteral(ctx.NUM().getText(), false, null);
    }
  }

  private String getOperatorFromTExpression(TeradataCreateTableParser.TExpressionContext ctx) {
    if (ctx.AND() != null) {
      return ctx.AND().getText();
    } else if (ctx.BETWEEN() != null) {
      return ctx.BETWEEN().getText();
    } else {
      return ctx.operator().getText();
    }
  }

  @Override
  public TParseTree visitOperator(TeradataCreateTableParser.OperatorContext ctx) {
    return super.visitOperator(ctx);
  }

  @Override
  public TParseTree visitExpressionString(TeradataCreateTableParser.ExpressionStringContext ctx) {
    String val = ctx.NAME() != null ?
      ctx.NAME().getText() : ctx.FLOAT() != null ?
      ctx.FLOAT().getText() : ctx.NUM() != null ?
      ctx.NUM().getText() : null;
    if (val == null) {
      val = ctx.date().getText();
    }
    String castToken = null;
    if (ctx.castToken() != null) {
      castToken = ctx.castToken().getText();
    }
    return new TLiteral(val, ctx.SINGLE_QUOTE() != null, castToken);
  }

  @Override
  public TParseTree visitRangeNPartition(TeradataCreateTableParser.RangeNPartitionContext ctx) {
    TExpression partitionColumn = null;
    if (ctx.columnExpression() != null) {
      partitionColumn = (TExpression) visit(ctx.columnExpression());
    }
    if (ctx.rangeList() != null) {
      return new TRangeNPartition(partitionColumn, (TRangeNPartition.TRangeExpressionList) visit(ctx.rangeList()));
    }
    TExpression startExpression = null, endExpression = null;
    List<TRangeNPartition.TRangeExpression> rangeExpressions = new ArrayList<>();
    TRangeNPartition.TRangeSize rangeSize = null;
    if (ctx.STAR().size() == 2) {
      startExpression = new TLiteral(ctx.STAR(0).getText(), false, null);
      endExpression = new TLiteral(ctx.STAR(1).getText(), false, null);
    } else if (ctx.STAR().size() == 1) {
      if (ctx.startExpression() != null) {
        startExpression = (TExpression) visit(ctx.startExpression());
        endExpression = new TLiteral(ctx.STAR(0).getText(), false, null);
      } else if (ctx.endExpression() != null) {
        startExpression = new TLiteral(ctx.STAR(0).getText(), false, null);
        endExpression = (TExpression) visit(ctx.endExpression());
      }
      if (ctx.rangeSize() != null) {
        rangeSize = (TRangeNPartition.TRangeSize) visit(ctx.rangeSize());
      }
    } else {
      startExpression = (TExpression) visit(ctx.startExpression());
      endExpression = (TExpression) visit(ctx.endExpression());
      if (ctx.rangeSize() != null) {
        rangeSize = (TRangeNPartition.TRangeSize) visit(ctx.rangeSize());
      }
    }
    rangeExpressions.add(new TRangeNPartition.TRangeExpression(startExpression, endExpression, rangeSize));
    TRangeNPartition.TRangeExpressionList rangeExpressionList = new TRangeNPartition.TRangeExpressionList(rangeExpressions);
    return new TRangeNPartition(partitionColumn, rangeExpressionList);
  }

  @Override
  public TParseTree visitRangeList(TeradataCreateTableParser.RangeListContext ctx) {
    List<TRangeNPartition.TRangeExpression> rangeExpressions = new ArrayList<>();
    rangeExpressions.add(createRangeExpressions(ctx.startExpression(), ctx.endExpression(), ctx.rangeSize()));
    for (TeradataCreateTableParser.NextRangeListContext ctx_ : ctx.nextRangeList()) {
      rangeExpressions.add((TRangeNPartition.TRangeExpression) visit(ctx_));
    }
    return new TRangeNPartition.TRangeExpressionList(rangeExpressions);
  }

  private TRangeNPartition.TRangeExpression createRangeExpressions(
    TeradataCreateTableParser.StartExpressionContext startExpressionContext,
    TeradataCreateTableParser.EndExpressionContext endExpressionContext,
    TeradataCreateTableParser.RangeSizeContext rangeSizeContext) {
    TExpression startExpression = (TExpression) visit(startExpressionContext);
    TExpression endExpression = (TExpression) visit(endExpressionContext);
    TRangeNPartition.TRangeSize rangeSize = null;
    if (rangeSizeContext != null) {
      rangeSize = (TRangeNPartition.TRangeSize) visit(rangeSizeContext);
    }
    return new TRangeNPartition.TRangeExpression(startExpression, endExpression, rangeSize);
  }

  @Override
  public TParseTree visitTestExpression(TeradataCreateTableParser.TestExpressionContext ctx) {
    return super.visitTestExpression(ctx);
  }

  @Override
  public TParseTree visitStartExpression(TeradataCreateTableParser.StartExpressionContext ctx) {
    return visit(ctx.tExpression());
  }

  @Override
  public TParseTree visitEndExpression(TeradataCreateTableParser.EndExpressionContext ctx) {
    return visit(ctx.tExpression());
  }

  @Override
  public TParseTree visitRangeSize(TeradataCreateTableParser.RangeSizeContext ctx) {
    boolean isIntervalTokenPresent = ctx.INTERVAL() != null;
    TLiteral stepSize = null;
    if (ctx.stepSize() != null) {
      stepSize = (TLiteral) visit(ctx.stepSize());
    } else if (ctx.expressionString() != null) {
      stepSize = (TLiteral) visit(ctx.expressionString());
    }
    TLiteral stepType = null;
    if (ctx.stepType() != null) {
      stepType = (TLiteral) visit(ctx.stepType());
    }
    return new TRangeNPartition.TRangeSize(isIntervalTokenPresent, stepSize, stepType);
  }

  @Override
  public TParseTree visitArithmeticPartition(TeradataCreateTableParser.ArithmeticPartitionContext ctx) {
    return super.visitArithmeticPartition(ctx);
  }

  @Override
  public TParseTree visitFunctionPartition(TeradataCreateTableParser.FunctionPartitionContext ctx) {
    return super.visitFunctionPartition(ctx);
  }

  @Override
  public TParseTree visitExtractFunction(TeradataCreateTableParser.ExtractFunctionContext ctx) {
    return super.visitExtractFunction(ctx);
  }

  @Override
  public TParseTree visitExtractToken(TeradataCreateTableParser.ExtractTokenContext ctx) {
    return super.visitExtractToken(ctx);
  }

  @Override
  public TParseTree visitNotNull(TeradataCreateTableParser.NotNullContext ctx) {
    return new TNotNullAttribute(ctx.NOT() != null && ctx.NULL() != null);
  }

  @Override
  public TParseTree visitFormatDate(TeradataCreateTableParser.FormatDateContext ctx) {
    return new TFormatAttribute((TLiteral) visit(ctx.formatType()));
  }

  @Override
  public TParseTree visitFormatType(TeradataCreateTableParser.FormatTypeContext ctx) {
    return new TLiteral(ctx.getText(), false, null);
  }

  @Override
  public TParseTree visitColumnExpression(TeradataCreateTableParser.ColumnExpressionContext ctx) {
    if (ctx.columnName() != null) {
      return visit(ctx.columnName());
    } else {
      return null;
    }
  }

  @Override
  public TParseTree visitFunctionName(TeradataCreateTableParser.FunctionNameContext ctx) {
    return super.visitFunctionName(ctx);
  }

  @Override
  public TParseTree visitCastToken(TeradataCreateTableParser.CastTokenContext ctx) {
    return super.visitCastToken(ctx);
  }

  @Override
  public TParseTree visitNextRangeList(TeradataCreateTableParser.NextRangeListContext ctx) {
    return createRangeExpressions(ctx.startExpression(), ctx.endExpression(), ctx.rangeSize());
  }

  @Override
  public TParseTree visitStepSize(TeradataCreateTableParser.StepSizeContext ctx) {
    return new TLiteral(ctx.NUM().getText(), ctx.SINGLE_QUOTE().size() != 0, null);
  }

  @Override
  public TParseTree visitStepType(TeradataCreateTableParser.StepTypeContext ctx) {
    return super.visitStepType(ctx);
  }

  @Override
  public TParseTree visitDate(TeradataCreateTableParser.DateContext ctx) {
    return super.visitDate(ctx);
  }

  @Override
  public TParseTree visitMonth(TeradataCreateTableParser.MonthContext ctx) {
    return super.visitMonth(ctx);
  }

  @Override
  public TParseTree visitColumnAttributeList(TeradataCreateTableParser.ColumnAttributeListContext ctx) {
    if (ctx.children == null) {
      return null;
    }
    List<TColumnAttribute> columnAttributes = new ArrayList<>();
    for (TeradataCreateTableParser.ColumnAttributeContext colAtt : ctx.columnAttribute()) {
      columnAttributes.add((TColumnAttribute) visit(colAtt));
    }
    return new TColumnAttributeList(columnAttributes);
  }

  @Override
  public TParseTree visitColumnAttribute(TeradataCreateTableParser.ColumnAttributeContext ctx) {
    return visit(ctx.children.get(0));
  }

  @Override
  public TParseTree visitCompress(TeradataCreateTableParser.CompressContext ctx) {
    return new TCompressAttribute((TExpressionList) visit(ctx.conditionalExpressionList()), ctx.OPEN_BRACKET() != null);
  }

  @Override
  public TParseTree visitIdentityConstraint(TeradataCreateTableParser.IdentityConstraintContext ctx) {
    if (ctx.identityExpression() == null) {
      return new TIdentityAttribute(ctx.ALWAYS() != null, null);
    }
    return new TIdentityAttribute(ctx.ALWAYS() != null, visit(ctx.identityExpression()));
  }

  @Override
  public TParseTree visitIdentityExpression(TeradataCreateTableParser.IdentityExpressionContext ctx) {
    return new TIdentityAttribute.IdentityExpression(visit(ctx.startWith()), visit(ctx.incrementBy()),
      ctx.minValue() != null ? visit(ctx.minValue()) : null, ctx.noMinValue() != null,
      ctx.maxValue() != null ? visit(ctx.maxValue()) : null, ctx.noMaxValue() != null, visit(ctx.isCycle()));
  }

  @Override
  public TParseTree visitStartWith(TeradataCreateTableParser.StartWithContext ctx) {
    return new TLiteral(ctx.NUM().getText(), false, null);
  }

  @Override
  public TParseTree visitIncrementBy(TeradataCreateTableParser.IncrementByContext ctx) {
    return new TLiteral(ctx.NUM().getText(), false, null);
  }

  @Override
  public TParseTree visitMinValue(TeradataCreateTableParser.MinValueContext ctx) {
    return new TLiteral(ctx.NUM().getText(), false, null);
  }

  @Override
  public TParseTree visitNoMinValue(TeradataCreateTableParser.NoMinValueContext ctx) {
    return super.visitNoMinValue(ctx);
  }

  @Override
  public TParseTree visitNoMaxValue(TeradataCreateTableParser.NoMaxValueContext ctx) {
    return super.visitNoMaxValue(ctx);
  }

  @Override
  public TParseTree visitMaxValue(TeradataCreateTableParser.MaxValueContext ctx) {
    return new TLiteral(ctx.NUM().getText(), false, null);
  }

  @Override
  public TParseTree visitIsCycle(TeradataCreateTableParser.IsCycleContext ctx) {
    return ctx.NO() != null ? new TLiteral("NO CYCLE", false, null) :
      new TLiteral("CYCLE", false, null);
  }

  @Override
  public TParseTree visitTableOptionList(TeradataCreateTableParser.TableOptionListContext ctx) {
    List<TTableOption> tableOptions = new ArrayList<>();
    for (TeradataCreateTableParser.TableOptionContext ctx_ : ctx.tableOption()) {
      tableOptions.add((TTableOption) visit(ctx_));
    }
    return new TTableOptionList(tableOptions);
  }

  @Override
  public TParseTree visitTableOption(TeradataCreateTableParser.TableOptionContext ctx) {
    return visit(ctx.getChild(0));
  }

  @Override
  public TParseTree visitFallBackOption(TeradataCreateTableParser.FallBackOptionContext ctx) {
    return new TFallBackOption(ctx.NO() != null, ctx.PROTECTION() != null);
  }

  @Override
  public TParseTree visitBeforeJournalOption(TeradataCreateTableParser.BeforeJournalOptionContext ctx) {
    return new TBeforeJournalOption(ctx.NO() != null, ctx.DUAL() != null, ctx.BEFORE() != null);
  }

  @Override
  public TParseTree visitAfterJournalOption(TeradataCreateTableParser.AfterJournalOptionContext ctx) {
    return new TAfterJournalTableOption(ctx.NO() != null, ctx.DUAL() != null);
  }

  @Override
  public TParseTree visitChecksumOption(TeradataCreateTableParser.ChecksumOptionContext ctx) {
    return new TChecksumOption();
  }

  @Override
  public TParseTree visitMergeBlockRatioOption(TeradataCreateTableParser.MergeBlockRatioOptionContext ctx) {
    return new TBlockMergeRatioOption();
  }

  @Override
  public TParseTree visitCaseSpecific(TeradataCreateTableParser.CaseSpecificContext ctx) {
    return new TCaseSpecificAttribute(ctx.NOT() == null, ctx.CS() != null);
  }

  @Override
  public TParseTree visitCharacterSet(TeradataCreateTableParser.CharacterSetContext ctx) {
    return new TCharacterSetAttribute((TLiteral) visit(ctx.phraseType()));
  }

  @Override
  public TParseTree visitPhraseType(TeradataCreateTableParser.PhraseTypeContext ctx) {
    return new TLiteral(ctx.getText(), false, null);
  }
}
