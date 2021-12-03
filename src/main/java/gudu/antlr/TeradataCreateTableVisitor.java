// Generated from C:/Users/D/IdeaProjects/General-Sql-Parser/src/main/java/gudu/antlr\TeradataCreateTable.g4 by ANTLR 4.9.1

    package gudu.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TeradataCreateTableParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TeradataCreateTableVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#parseCreateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseCreateTable(TeradataCreateTableParser.ParseCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(TeradataCreateTableParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(TeradataCreateTableParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#tableOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionList(TeradataCreateTableParser.TableOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOption(TeradataCreateTableParser.TableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#fallBackOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallBackOption(TeradataCreateTableParser.FallBackOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#beforeJournalOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeforeJournalOption(TeradataCreateTableParser.BeforeJournalOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#afterJournalOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterJournalOption(TeradataCreateTableParser.AfterJournalOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#checksumOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecksumOption(TeradataCreateTableParser.ChecksumOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#mergeBlockRatioOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeBlockRatioOption(TeradataCreateTableParser.MergeBlockRatioOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinitionList(TeradataCreateTableParser.ColumnDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(TeradataCreateTableParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(TeradataCreateTableParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(TeradataCreateTableParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#columnAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAttributeList(TeradataCreateTableParser.ColumnAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#columnAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAttribute(TeradataCreateTableParser.ColumnAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#notNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNull(TeradataCreateTableParser.NotNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#formatDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatDate(TeradataCreateTableParser.FormatDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#formatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatType(TeradataCreateTableParser.FormatTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#caseSpecific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseSpecific(TeradataCreateTableParser.CaseSpecificContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(TeradataCreateTableParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#phraseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhraseType(TeradataCreateTableParser.PhraseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#compress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompress(TeradataCreateTableParser.CompressContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#identityConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityConstraint(TeradataCreateTableParser.IdentityConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#identityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityExpression(TeradataCreateTableParser.IdentityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#startWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartWith(TeradataCreateTableParser.StartWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#incrementBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementBy(TeradataCreateTableParser.IncrementByContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#minValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinValue(TeradataCreateTableParser.MinValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#noMinValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoMinValue(TeradataCreateTableParser.NoMinValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#noMaxValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoMaxValue(TeradataCreateTableParser.NoMaxValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#maxValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxValue(TeradataCreateTableParser.MaxValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#isCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsCycle(TeradataCreateTableParser.IsCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#indexDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDefinitions(TeradataCreateTableParser.IndexDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#uniquePrimaryIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniquePrimaryIndex(TeradataCreateTableParser.UniquePrimaryIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#noPrimaryIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPrimaryIndex(TeradataCreateTableParser.NoPrimaryIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#primaryAmpIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryAmpIndex(TeradataCreateTableParser.PrimaryAmpIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(TeradataCreateTableParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#indexColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumnList(TeradataCreateTableParser.IndexColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#loading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoading(TeradataCreateTableParser.LoadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#ordering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering(TeradataCreateTableParser.OrderingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#orderColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderColumnName(TeradataCreateTableParser.OrderColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#partitionExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpressionList(TeradataCreateTableParser.PartitionExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#partitionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionExpression(TeradataCreateTableParser.PartitionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#simplePartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePartition(TeradataCreateTableParser.SimplePartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#caseNPartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseNPartition(TeradataCreateTableParser.CaseNPartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#conditionalExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpressionList(TeradataCreateTableParser.ConditionalExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(TeradataCreateTableParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#tExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTExpression(TeradataCreateTableParser.TExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(TeradataCreateTableParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#columnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExpression(TeradataCreateTableParser.ColumnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#expressionString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionString(TeradataCreateTableParser.ExpressionStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(TeradataCreateTableParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#castToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastToken(TeradataCreateTableParser.CastTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#rangeNPartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeNPartition(TeradataCreateTableParser.RangeNPartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#rangeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeList(TeradataCreateTableParser.RangeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#nextRangeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextRangeList(TeradataCreateTableParser.NextRangeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#testExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestExpression(TeradataCreateTableParser.TestExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#startExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartExpression(TeradataCreateTableParser.StartExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#endExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndExpression(TeradataCreateTableParser.EndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#rangeSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeSize(TeradataCreateTableParser.RangeSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#stepSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepSize(TeradataCreateTableParser.StepSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#stepType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepType(TeradataCreateTableParser.StepTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#arithmeticPartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticPartition(TeradataCreateTableParser.ArithmeticPartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#functionPartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPartition(TeradataCreateTableParser.FunctionPartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(TeradataCreateTableParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#extractToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractToken(TeradataCreateTableParser.ExtractTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(TeradataCreateTableParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TeradataCreateTableParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(TeradataCreateTableParser.MonthContext ctx);
}