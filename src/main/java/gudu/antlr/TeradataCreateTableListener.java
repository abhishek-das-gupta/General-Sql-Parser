// Generated from C:/Users/D/IdeaProjects/General-Sql-Parser/src/main/java/gudu/antlr\TeradataCreateTable.g4 by ANTLR 4.9.1

    package gudu.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TeradataCreateTableParser}.
 */
public interface TeradataCreateTableListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#parseCreateTable}.
	 * @param ctx the parse tree
	 */
	void enterParseCreateTable(TeradataCreateTableParser.ParseCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#parseCreateTable}.
	 * @param ctx the parse tree
	 */
	void exitParseCreateTable(TeradataCreateTableParser.ParseCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(TeradataCreateTableParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(TeradataCreateTableParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(TeradataCreateTableParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(TeradataCreateTableParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#tableOptionList}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionList(TeradataCreateTableParser.TableOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#tableOptionList}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionList(TeradataCreateTableParser.TableOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOption(TeradataCreateTableParser.TableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOption(TeradataCreateTableParser.TableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#fallBackOption}.
	 * @param ctx the parse tree
	 */
	void enterFallBackOption(TeradataCreateTableParser.FallBackOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#fallBackOption}.
	 * @param ctx the parse tree
	 */
	void exitFallBackOption(TeradataCreateTableParser.FallBackOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#beforeJournalOption}.
	 * @param ctx the parse tree
	 */
	void enterBeforeJournalOption(TeradataCreateTableParser.BeforeJournalOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#beforeJournalOption}.
	 * @param ctx the parse tree
	 */
	void exitBeforeJournalOption(TeradataCreateTableParser.BeforeJournalOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#afterJournalOption}.
	 * @param ctx the parse tree
	 */
	void enterAfterJournalOption(TeradataCreateTableParser.AfterJournalOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#afterJournalOption}.
	 * @param ctx the parse tree
	 */
	void exitAfterJournalOption(TeradataCreateTableParser.AfterJournalOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#checksumOption}.
	 * @param ctx the parse tree
	 */
	void enterChecksumOption(TeradataCreateTableParser.ChecksumOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#checksumOption}.
	 * @param ctx the parse tree
	 */
	void exitChecksumOption(TeradataCreateTableParser.ChecksumOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#mergeBlockRatioOption}.
	 * @param ctx the parse tree
	 */
	void enterMergeBlockRatioOption(TeradataCreateTableParser.MergeBlockRatioOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#mergeBlockRatioOption}.
	 * @param ctx the parse tree
	 */
	void exitMergeBlockRatioOption(TeradataCreateTableParser.MergeBlockRatioOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinitionList(TeradataCreateTableParser.ColumnDefinitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#columnDefinitionList}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinitionList(TeradataCreateTableParser.ColumnDefinitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(TeradataCreateTableParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(TeradataCreateTableParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(TeradataCreateTableParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(TeradataCreateTableParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(TeradataCreateTableParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(TeradataCreateTableParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#columnAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterColumnAttributeList(TeradataCreateTableParser.ColumnAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#columnAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitColumnAttributeList(TeradataCreateTableParser.ColumnAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#columnAttribute}.
	 * @param ctx the parse tree
	 */
	void enterColumnAttribute(TeradataCreateTableParser.ColumnAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#columnAttribute}.
	 * @param ctx the parse tree
	 */
	void exitColumnAttribute(TeradataCreateTableParser.ColumnAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#notNull}.
	 * @param ctx the parse tree
	 */
	void enterNotNull(TeradataCreateTableParser.NotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#notNull}.
	 * @param ctx the parse tree
	 */
	void exitNotNull(TeradataCreateTableParser.NotNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#formatDate}.
	 * @param ctx the parse tree
	 */
	void enterFormatDate(TeradataCreateTableParser.FormatDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#formatDate}.
	 * @param ctx the parse tree
	 */
	void exitFormatDate(TeradataCreateTableParser.FormatDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#formatType}.
	 * @param ctx the parse tree
	 */
	void enterFormatType(TeradataCreateTableParser.FormatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#formatType}.
	 * @param ctx the parse tree
	 */
	void exitFormatType(TeradataCreateTableParser.FormatTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#caseSpecific}.
	 * @param ctx the parse tree
	 */
	void enterCaseSpecific(TeradataCreateTableParser.CaseSpecificContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#caseSpecific}.
	 * @param ctx the parse tree
	 */
	void exitCaseSpecific(TeradataCreateTableParser.CaseSpecificContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(TeradataCreateTableParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(TeradataCreateTableParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#phraseType}.
	 * @param ctx the parse tree
	 */
	void enterPhraseType(TeradataCreateTableParser.PhraseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#phraseType}.
	 * @param ctx the parse tree
	 */
	void exitPhraseType(TeradataCreateTableParser.PhraseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#compress}.
	 * @param ctx the parse tree
	 */
	void enterCompress(TeradataCreateTableParser.CompressContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#compress}.
	 * @param ctx the parse tree
	 */
	void exitCompress(TeradataCreateTableParser.CompressContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#identityConstraint}.
	 * @param ctx the parse tree
	 */
	void enterIdentityConstraint(TeradataCreateTableParser.IdentityConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#identityConstraint}.
	 * @param ctx the parse tree
	 */
	void exitIdentityConstraint(TeradataCreateTableParser.IdentityConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#identityExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentityExpression(TeradataCreateTableParser.IdentityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#identityExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentityExpression(TeradataCreateTableParser.IdentityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#startWith}.
	 * @param ctx the parse tree
	 */
	void enterStartWith(TeradataCreateTableParser.StartWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#startWith}.
	 * @param ctx the parse tree
	 */
	void exitStartWith(TeradataCreateTableParser.StartWithContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#incrementBy}.
	 * @param ctx the parse tree
	 */
	void enterIncrementBy(TeradataCreateTableParser.IncrementByContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#incrementBy}.
	 * @param ctx the parse tree
	 */
	void exitIncrementBy(TeradataCreateTableParser.IncrementByContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#minValue}.
	 * @param ctx the parse tree
	 */
	void enterMinValue(TeradataCreateTableParser.MinValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#minValue}.
	 * @param ctx the parse tree
	 */
	void exitMinValue(TeradataCreateTableParser.MinValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#noMinValue}.
	 * @param ctx the parse tree
	 */
	void enterNoMinValue(TeradataCreateTableParser.NoMinValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#noMinValue}.
	 * @param ctx the parse tree
	 */
	void exitNoMinValue(TeradataCreateTableParser.NoMinValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#noMaxValue}.
	 * @param ctx the parse tree
	 */
	void enterNoMaxValue(TeradataCreateTableParser.NoMaxValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#noMaxValue}.
	 * @param ctx the parse tree
	 */
	void exitNoMaxValue(TeradataCreateTableParser.NoMaxValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#maxValue}.
	 * @param ctx the parse tree
	 */
	void enterMaxValue(TeradataCreateTableParser.MaxValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#maxValue}.
	 * @param ctx the parse tree
	 */
	void exitMaxValue(TeradataCreateTableParser.MaxValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#isCycle}.
	 * @param ctx the parse tree
	 */
	void enterIsCycle(TeradataCreateTableParser.IsCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#isCycle}.
	 * @param ctx the parse tree
	 */
	void exitIsCycle(TeradataCreateTableParser.IsCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#indexDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterIndexDefinitions(TeradataCreateTableParser.IndexDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#indexDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitIndexDefinitions(TeradataCreateTableParser.IndexDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#uniquePrimaryIndex}.
	 * @param ctx the parse tree
	 */
	void enterUniquePrimaryIndex(TeradataCreateTableParser.UniquePrimaryIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#uniquePrimaryIndex}.
	 * @param ctx the parse tree
	 */
	void exitUniquePrimaryIndex(TeradataCreateTableParser.UniquePrimaryIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#noPrimaryIndex}.
	 * @param ctx the parse tree
	 */
	void enterNoPrimaryIndex(TeradataCreateTableParser.NoPrimaryIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#noPrimaryIndex}.
	 * @param ctx the parse tree
	 */
	void exitNoPrimaryIndex(TeradataCreateTableParser.NoPrimaryIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#primaryAmpIndex}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryAmpIndex(TeradataCreateTableParser.PrimaryAmpIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#primaryAmpIndex}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryAmpIndex(TeradataCreateTableParser.PrimaryAmpIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(TeradataCreateTableParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(TeradataCreateTableParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#indexColumnList}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnList(TeradataCreateTableParser.IndexColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#indexColumnList}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnList(TeradataCreateTableParser.IndexColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#loading}.
	 * @param ctx the parse tree
	 */
	void enterLoading(TeradataCreateTableParser.LoadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#loading}.
	 * @param ctx the parse tree
	 */
	void exitLoading(TeradataCreateTableParser.LoadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#ordering}.
	 * @param ctx the parse tree
	 */
	void enterOrdering(TeradataCreateTableParser.OrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#ordering}.
	 * @param ctx the parse tree
	 */
	void exitOrdering(TeradataCreateTableParser.OrderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#orderColumnName}.
	 * @param ctx the parse tree
	 */
	void enterOrderColumnName(TeradataCreateTableParser.OrderColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#orderColumnName}.
	 * @param ctx the parse tree
	 */
	void exitOrderColumnName(TeradataCreateTableParser.OrderColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#partitionExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionExpressionList(TeradataCreateTableParser.PartitionExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#partitionExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionExpressionList(TeradataCreateTableParser.PartitionExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPartitionExpression(TeradataCreateTableParser.PartitionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#partitionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPartitionExpression(TeradataCreateTableParser.PartitionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#simplePartition}.
	 * @param ctx the parse tree
	 */
	void enterSimplePartition(TeradataCreateTableParser.SimplePartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#simplePartition}.
	 * @param ctx the parse tree
	 */
	void exitSimplePartition(TeradataCreateTableParser.SimplePartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#caseNPartition}.
	 * @param ctx the parse tree
	 */
	void enterCaseNPartition(TeradataCreateTableParser.CaseNPartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#caseNPartition}.
	 * @param ctx the parse tree
	 */
	void exitCaseNPartition(TeradataCreateTableParser.CaseNPartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#conditionalExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpressionList(TeradataCreateTableParser.ConditionalExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#conditionalExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpressionList(TeradataCreateTableParser.ConditionalExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(TeradataCreateTableParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(TeradataCreateTableParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#tExpression}.
	 * @param ctx the parse tree
	 */
	void enterTExpression(TeradataCreateTableParser.TExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#tExpression}.
	 * @param ctx the parse tree
	 */
	void exitTExpression(TeradataCreateTableParser.TExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(TeradataCreateTableParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(TeradataCreateTableParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#columnExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnExpression(TeradataCreateTableParser.ColumnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#columnExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnExpression(TeradataCreateTableParser.ColumnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#expressionString}.
	 * @param ctx the parse tree
	 */
	void enterExpressionString(TeradataCreateTableParser.ExpressionStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#expressionString}.
	 * @param ctx the parse tree
	 */
	void exitExpressionString(TeradataCreateTableParser.ExpressionStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(TeradataCreateTableParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(TeradataCreateTableParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#castToken}.
	 * @param ctx the parse tree
	 */
	void enterCastToken(TeradataCreateTableParser.CastTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#castToken}.
	 * @param ctx the parse tree
	 */
	void exitCastToken(TeradataCreateTableParser.CastTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#rangeNPartition}.
	 * @param ctx the parse tree
	 */
	void enterRangeNPartition(TeradataCreateTableParser.RangeNPartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#rangeNPartition}.
	 * @param ctx the parse tree
	 */
	void exitRangeNPartition(TeradataCreateTableParser.RangeNPartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#rangeList}.
	 * @param ctx the parse tree
	 */
	void enterRangeList(TeradataCreateTableParser.RangeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#rangeList}.
	 * @param ctx the parse tree
	 */
	void exitRangeList(TeradataCreateTableParser.RangeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#nextRangeList}.
	 * @param ctx the parse tree
	 */
	void enterNextRangeList(TeradataCreateTableParser.NextRangeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#nextRangeList}.
	 * @param ctx the parse tree
	 */
	void exitNextRangeList(TeradataCreateTableParser.NextRangeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#testExpression}.
	 * @param ctx the parse tree
	 */
	void enterTestExpression(TeradataCreateTableParser.TestExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#testExpression}.
	 * @param ctx the parse tree
	 */
	void exitTestExpression(TeradataCreateTableParser.TestExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#startExpression}.
	 * @param ctx the parse tree
	 */
	void enterStartExpression(TeradataCreateTableParser.StartExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#startExpression}.
	 * @param ctx the parse tree
	 */
	void exitStartExpression(TeradataCreateTableParser.StartExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#endExpression}.
	 * @param ctx the parse tree
	 */
	void enterEndExpression(TeradataCreateTableParser.EndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#endExpression}.
	 * @param ctx the parse tree
	 */
	void exitEndExpression(TeradataCreateTableParser.EndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#rangeSize}.
	 * @param ctx the parse tree
	 */
	void enterRangeSize(TeradataCreateTableParser.RangeSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#rangeSize}.
	 * @param ctx the parse tree
	 */
	void exitRangeSize(TeradataCreateTableParser.RangeSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#stepSize}.
	 * @param ctx the parse tree
	 */
	void enterStepSize(TeradataCreateTableParser.StepSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#stepSize}.
	 * @param ctx the parse tree
	 */
	void exitStepSize(TeradataCreateTableParser.StepSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#stepType}.
	 * @param ctx the parse tree
	 */
	void enterStepType(TeradataCreateTableParser.StepTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#stepType}.
	 * @param ctx the parse tree
	 */
	void exitStepType(TeradataCreateTableParser.StepTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#arithmeticPartition}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticPartition(TeradataCreateTableParser.ArithmeticPartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#arithmeticPartition}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticPartition(TeradataCreateTableParser.ArithmeticPartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#functionPartition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPartition(TeradataCreateTableParser.FunctionPartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#functionPartition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPartition(TeradataCreateTableParser.FunctionPartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(TeradataCreateTableParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(TeradataCreateTableParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#extractToken}.
	 * @param ctx the parse tree
	 */
	void enterExtractToken(TeradataCreateTableParser.ExtractTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#extractToken}.
	 * @param ctx the parse tree
	 */
	void exitExtractToken(TeradataCreateTableParser.ExtractTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(TeradataCreateTableParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(TeradataCreateTableParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TeradataCreateTableParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(TeradataCreateTableParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link TeradataCreateTableParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(TeradataCreateTableParser.MonthContext ctx);
}