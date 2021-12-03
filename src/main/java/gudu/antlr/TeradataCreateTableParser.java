// Generated from C:/Users/D/IdeaProjects/General-Sql-Parser/src/main/java/gudu/antlr\TeradataCreateTable.g4 by ANTLR 4.9.1

    package gudu.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TeradataCreateTableParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, INT4=2, INT2=3, NUM=4, AND=5, OR=6, STAR=7, EACH=8, ADDITION=9, 
		INTERVAL=10, LESS_THAN=11, LESS_THAN_EQUALS=12, EQUALS=13, NOT_EQUALS=14, 
		GREATER_THAN=15, YYYY=16, MM=17, DD=18, GREATER_THAN_EQUALS=19, CREATE=20, 
		SET=21, MULTISET=22, GLOBAL=23, TEMPORARY=24, TABLE=25, VOLATILE=26, CT=27, 
		GENERATED=28, ALWAYS=29, BY_DEFAULT=30, AS=31, DUAL=32, FALLBACK=33, PROTECTION=34, 
		BEFORE=35, JOURNAL=36, AFTER=37, CHECKSUM=38, MERGEBLOCKRATIO=39, IDENTITY=40, 
		NO_MIN_VALUE=41, NO_MAX_VALUE=42, CYCLE=43, START=44, INCREMENT=45, MINVALUE=46, 
		MAXVALUE=47, EXTRACT=48, YEAR=49, MONTH=50, WEEK=51, DAY=52, HOUR=53, 
		COMPRESS=54, MINUTE=55, SECOND=56, TIMEZONE_HOUR=57, TIMEZONE_MINUTE=58, 
		FROM=59, NO_RANGE=60, NO_CASE=61, OR_UNKNOWN=62, UNKNOWN=63, BETWEEN=64, 
		LIKE=65, NO=66, ALL=67, NULL=68, WITH=69, FORMAT=70, VALUES=71, HASH=72, 
		LOAD_ENTITY=73, NOT=74, CHARACTER=75, CASE_SPECIFIC=76, CS=77, PARTITION=78, 
		AMP=79, RANGE_N=80, CASE_N=81, UNIQUE=82, PRIMARY=83, INDEX=84, ORDER=85, 
		BY=86, DOT=87, OPEN_BRACKET=88, CLOSE_BRACKET=89, DEFAULT=90, COMMA=91, 
		UPPERCASE=92, DATABASE_NAME=93, USER_NAME=94, SINGLE_QUOTE=95, JAN=96, 
		FEB=97, MAR=98, APR=99, MAY=100, JUN=101, JUL=102, AUG=103, SEP=104, OCT=105, 
		NOV=106, DEC=107, SEPARATOR=108, NAME=109, COMMENT=110, WS=111, SEMI_COLON=112;
	public static final int
		RULE_parseCreateTable = 0, RULE_createTable = 1, RULE_tableName = 2, RULE_tableOptionList = 3, 
		RULE_tableOption = 4, RULE_fallBackOption = 5, RULE_beforeJournalOption = 6, 
		RULE_afterJournalOption = 7, RULE_checksumOption = 8, RULE_mergeBlockRatioOption = 9, 
		RULE_columnDefinitionList = 10, RULE_columnDefinition = 11, RULE_columnName = 12, 
		RULE_dataType = 13, RULE_columnAttributeList = 14, RULE_columnAttribute = 15, 
		RULE_notNull = 16, RULE_formatDate = 17, RULE_formatType = 18, RULE_caseSpecific = 19, 
		RULE_characterSet = 20, RULE_phraseType = 21, RULE_compress = 22, RULE_identityConstraint = 23, 
		RULE_identityExpression = 24, RULE_startWith = 25, RULE_incrementBy = 26, 
		RULE_minValue = 27, RULE_noMinValue = 28, RULE_noMaxValue = 29, RULE_maxValue = 30, 
		RULE_isCycle = 31, RULE_indexDefinitions = 32, RULE_uniquePrimaryIndex = 33, 
		RULE_noPrimaryIndex = 34, RULE_primaryAmpIndex = 35, RULE_indexName = 36, 
		RULE_indexColumnList = 37, RULE_loading = 38, RULE_ordering = 39, RULE_orderColumnName = 40, 
		RULE_partitionExpressionList = 41, RULE_partitionExpression = 42, RULE_simplePartition = 43, 
		RULE_caseNPartition = 44, RULE_conditionalExpressionList = 45, RULE_conditionalExpression = 46, 
		RULE_tExpression = 47, RULE_operator = 48, RULE_columnExpression = 49, 
		RULE_expressionString = 50, RULE_functionName = 51, RULE_castToken = 52, 
		RULE_rangeNPartition = 53, RULE_rangeList = 54, RULE_nextRangeList = 55, 
		RULE_testExpression = 56, RULE_startExpression = 57, RULE_endExpression = 58, 
		RULE_rangeSize = 59, RULE_stepSize = 60, RULE_stepType = 61, RULE_arithmeticPartition = 62, 
		RULE_functionPartition = 63, RULE_extractFunction = 64, RULE_extractToken = 65, 
		RULE_date = 66, RULE_month = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"parseCreateTable", "createTable", "tableName", "tableOptionList", "tableOption", 
			"fallBackOption", "beforeJournalOption", "afterJournalOption", "checksumOption", 
			"mergeBlockRatioOption", "columnDefinitionList", "columnDefinition", 
			"columnName", "dataType", "columnAttributeList", "columnAttribute", "notNull", 
			"formatDate", "formatType", "caseSpecific", "characterSet", "phraseType", 
			"compress", "identityConstraint", "identityExpression", "startWith", 
			"incrementBy", "minValue", "noMinValue", "noMaxValue", "maxValue", "isCycle", 
			"indexDefinitions", "uniquePrimaryIndex", "noPrimaryIndex", "primaryAmpIndex", 
			"indexName", "indexColumnList", "loading", "ordering", "orderColumnName", 
			"partitionExpressionList", "partitionExpression", "simplePartition", 
			"caseNPartition", "conditionalExpressionList", "conditionalExpression", 
			"tExpression", "operator", "columnExpression", "expressionString", "functionName", 
			"castToken", "rangeNPartition", "rangeList", "nextRangeList", "testExpression", 
			"startExpression", "endExpression", "rangeSize", "stepSize", "stepType", 
			"arithmeticPartition", "functionPartition", "extractFunction", "extractToken", 
			"date", "month"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'*'", null, "'+'", null, "'<'", 
			"'<='", "'='", "'<>'", "'>'", null, null, null, "'>='", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'.'", "'('", "')'", null, "','", null, null, 
			null, "'''", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT", "INT4", "INT2", "NUM", "AND", "OR", "STAR", "EACH", "ADDITION", 
			"INTERVAL", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
			"GREATER_THAN", "YYYY", "MM", "DD", "GREATER_THAN_EQUALS", "CREATE", 
			"SET", "MULTISET", "GLOBAL", "TEMPORARY", "TABLE", "VOLATILE", "CT", 
			"GENERATED", "ALWAYS", "BY_DEFAULT", "AS", "DUAL", "FALLBACK", "PROTECTION", 
			"BEFORE", "JOURNAL", "AFTER", "CHECKSUM", "MERGEBLOCKRATIO", "IDENTITY", 
			"NO_MIN_VALUE", "NO_MAX_VALUE", "CYCLE", "START", "INCREMENT", "MINVALUE", 
			"MAXVALUE", "EXTRACT", "YEAR", "MONTH", "WEEK", "DAY", "HOUR", "COMPRESS", 
			"MINUTE", "SECOND", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", "FROM", "NO_RANGE", 
			"NO_CASE", "OR_UNKNOWN", "UNKNOWN", "BETWEEN", "LIKE", "NO", "ALL", "NULL", 
			"WITH", "FORMAT", "VALUES", "HASH", "LOAD_ENTITY", "NOT", "CHARACTER", 
			"CASE_SPECIFIC", "CS", "PARTITION", "AMP", "RANGE_N", "CASE_N", "UNIQUE", 
			"PRIMARY", "INDEX", "ORDER", "BY", "DOT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DEFAULT", "COMMA", "UPPERCASE", "DATABASE_NAME", "USER_NAME", "SINGLE_QUOTE", 
			"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", 
			"NOV", "DEC", "SEPARATOR", "NAME", "COMMENT", "WS", "SEMI_COLON"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TeradataCreateTable.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TeradataCreateTableParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseCreateTableContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TeradataCreateTableParser.EOF, 0); }
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(TeradataCreateTableParser.SEMI_COLON, 0); }
		public ParseCreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseCreateTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterParseCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitParseCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitParseCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseCreateTableContext parseCreateTable() throws RecognitionException {
		ParseCreateTableContext _localctx = new ParseCreateTableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseCreateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			createTable();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(137);
				match(SEMI_COLON);
				}
			}

			}
			setState(140);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnDefinitionListContext columnDefinitionList() {
			return getRuleContext(ColumnDefinitionListContext.class,0);
		}
		public IndexDefinitionsContext indexDefinitions() {
			return getRuleContext(IndexDefinitionsContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(TeradataCreateTableParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TeradataCreateTableParser.TABLE, 0); }
		public TerminalNode CT() { return getToken(TeradataCreateTableParser.CT, 0); }
		public TerminalNode COMMA() { return getToken(TeradataCreateTableParser.COMMA, 0); }
		public TableOptionListContext tableOptionList() {
			return getRuleContext(TableOptionListContext.class,0);
		}
		public TerminalNode DATABASE_NAME() { return getToken(TeradataCreateTableParser.DATABASE_NAME, 0); }
		public TerminalNode USER_NAME() { return getToken(TeradataCreateTableParser.USER_NAME, 0); }
		public TerminalNode GLOBAL() { return getToken(TeradataCreateTableParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(TeradataCreateTableParser.TEMPORARY, 0); }
		public TerminalNode VOLATILE() { return getToken(TeradataCreateTableParser.VOLATILE, 0); }
		public TerminalNode SET() { return getToken(TeradataCreateTableParser.SET, 0); }
		public TerminalNode MULTISET() { return getToken(TeradataCreateTableParser.MULTISET, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				{
				setState(142);
				match(CREATE);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET || _la==MULTISET) {
					{
					setState(143);
					_la = _input.LA(1);
					if ( !(_la==SET || _la==MULTISET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GLOBAL:
					{
					setState(146);
					match(GLOBAL);
					setState(147);
					match(TEMPORARY);
					}
					break;
				case VOLATILE:
					{
					setState(148);
					match(VOLATILE);
					}
					break;
				case TABLE:
					break;
				default:
					break;
				}
				setState(151);
				match(TABLE);
				}
				break;
			case CT:
				{
				setState(152);
				match(CT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATABASE_NAME || _la==USER_NAME) {
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==DATABASE_NAME || _la==USER_NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(158);
			tableName();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(159);
				match(COMMA);
				setState(160);
				tableOptionList();
				}
			}

			setState(163);
			columnDefinitionList();
			setState(164);
			indexDefinitions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptionListContext extends ParserRuleContext {
		public List<TableOptionContext> tableOption() {
			return getRuleContexts(TableOptionContext.class);
		}
		public TableOptionContext tableOption(int i) {
			return getRuleContext(TableOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeradataCreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataCreateTableParser.COMMA, i);
		}
		public TableOptionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterTableOptionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitTableOptionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitTableOptionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionListContext tableOptionList() throws RecognitionException {
		TableOptionListContext _localctx = new TableOptionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			tableOption();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				tableOption();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptionContext extends ParserRuleContext {
		public FallBackOptionContext fallBackOption() {
			return getRuleContext(FallBackOptionContext.class,0);
		}
		public BeforeJournalOptionContext beforeJournalOption() {
			return getRuleContext(BeforeJournalOptionContext.class,0);
		}
		public AfterJournalOptionContext afterJournalOption() {
			return getRuleContext(AfterJournalOptionContext.class,0);
		}
		public ChecksumOptionContext checksumOption() {
			return getRuleContext(ChecksumOptionContext.class,0);
		}
		public MergeBlockRatioOptionContext mergeBlockRatioOption() {
			return getRuleContext(MergeBlockRatioOptionContext.class,0);
		}
		public TableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterTableOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitTableOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionContext tableOption() throws RecognitionException {
		TableOptionContext _localctx = new TableOptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableOption);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				fallBackOption();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				beforeJournalOption();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				afterJournalOption();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				checksumOption();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				mergeBlockRatioOption();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FallBackOptionContext extends ParserRuleContext {
		public TerminalNode FALLBACK() { return getToken(TeradataCreateTableParser.FALLBACK, 0); }
		public TerminalNode NO() { return getToken(TeradataCreateTableParser.NO, 0); }
		public TerminalNode PROTECTION() { return getToken(TeradataCreateTableParser.PROTECTION, 0); }
		public FallBackOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallBackOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterFallBackOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitFallBackOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitFallBackOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FallBackOptionContext fallBackOption() throws RecognitionException {
		FallBackOptionContext _localctx = new FallBackOptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fallBackOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(183);
				match(NO);
				}
			}

			setState(186);
			match(FALLBACK);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROTECTION) {
				{
				setState(187);
				match(PROTECTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeforeJournalOptionContext extends ParserRuleContext {
		public TerminalNode JOURNAL() { return getToken(TeradataCreateTableParser.JOURNAL, 0); }
		public TerminalNode BEFORE() { return getToken(TeradataCreateTableParser.BEFORE, 0); }
		public TerminalNode NO() { return getToken(TeradataCreateTableParser.NO, 0); }
		public TerminalNode DUAL() { return getToken(TeradataCreateTableParser.DUAL, 0); }
		public BeforeJournalOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beforeJournalOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterBeforeJournalOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitBeforeJournalOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitBeforeJournalOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeforeJournalOptionContext beforeJournalOption() throws RecognitionException {
		BeforeJournalOptionContext _localctx = new BeforeJournalOptionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_beforeJournalOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DUAL || _la==NO) {
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==DUAL || _la==NO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEFORE) {
				{
				setState(193);
				match(BEFORE);
				}
			}

			setState(196);
			match(JOURNAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AfterJournalOptionContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(TeradataCreateTableParser.AFTER, 0); }
		public TerminalNode JOURNAL() { return getToken(TeradataCreateTableParser.JOURNAL, 0); }
		public TerminalNode NO() { return getToken(TeradataCreateTableParser.NO, 0); }
		public TerminalNode DUAL() { return getToken(TeradataCreateTableParser.DUAL, 0); }
		public AfterJournalOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterJournalOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterAfterJournalOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitAfterJournalOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitAfterJournalOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AfterJournalOptionContext afterJournalOption() throws RecognitionException {
		AfterJournalOptionContext _localctx = new AfterJournalOptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_afterJournalOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DUAL || _la==NO) {
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==DUAL || _la==NO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(201);
			match(AFTER);
			setState(202);
			match(JOURNAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChecksumOptionContext extends ParserRuleContext {
		public TerminalNode CHECKSUM() { return getToken(TeradataCreateTableParser.CHECKSUM, 0); }
		public TerminalNode EQUALS() { return getToken(TeradataCreateTableParser.EQUALS, 0); }
		public TerminalNode DEFAULT() { return getToken(TeradataCreateTableParser.DEFAULT, 0); }
		public ChecksumOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checksumOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterChecksumOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitChecksumOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitChecksumOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChecksumOptionContext checksumOption() throws RecognitionException {
		ChecksumOptionContext _localctx = new ChecksumOptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_checksumOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(CHECKSUM);
			setState(205);
			match(EQUALS);
			setState(206);
			match(DEFAULT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeBlockRatioOptionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(TeradataCreateTableParser.DEFAULT, 0); }
		public TerminalNode MERGEBLOCKRATIO() { return getToken(TeradataCreateTableParser.MERGEBLOCKRATIO, 0); }
		public MergeBlockRatioOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeBlockRatioOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterMergeBlockRatioOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitMergeBlockRatioOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitMergeBlockRatioOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeBlockRatioOptionContext mergeBlockRatioOption() throws RecognitionException {
		MergeBlockRatioOptionContext _localctx = new MergeBlockRatioOptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mergeBlockRatioOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DEFAULT);
			setState(209);
			match(MERGEBLOCKRATIO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionListContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TeradataCreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataCreateTableParser.COMMA, i);
		}
		public ColumnDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterColumnDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitColumnDefinitionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitColumnDefinitionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionListContext columnDefinitionList() throws RecognitionException {
		ColumnDefinitionListContext _localctx = new ColumnDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_columnDefinitionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(OPEN_BRACKET);
			setState(212);
			columnDefinition();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213);
				match(COMMA);
				setState(214);
				columnDefinition();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ColumnAttributeListContext columnAttributeList() {
			return getRuleContext(ColumnAttributeListContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			columnName();
			setState(223);
			dataType();
			setState(224);
			columnAttributeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> INT2() { return getTokens(TeradataCreateTableParser.INT2); }
		public TerminalNode INT2(int i) {
			return getToken(TeradataCreateTableParser.INT2, i);
		}
		public List<TerminalNode> INT4() { return getTokens(TeradataCreateTableParser.INT4); }
		public TerminalNode INT4(int i) {
			return getToken(TeradataCreateTableParser.INT4, i);
		}
		public List<TerminalNode> NUM() { return getTokens(TeradataCreateTableParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(TeradataCreateTableParser.NUM, i);
		}
		public TerminalNode COMMA() { return getToken(TeradataCreateTableParser.COMMA, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(NAME);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(229);
				match(OPEN_BRACKET);
				setState(230);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT4) | (1L << INT2) | (1L << NUM))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(231);
					match(COMMA);
					setState(232);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT4) | (1L << INT2) | (1L << NUM))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(235);
				match(CLOSE_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAttributeListContext extends ParserRuleContext {
		public List<ColumnAttributeContext> columnAttribute() {
			return getRuleContexts(ColumnAttributeContext.class);
		}
		public ColumnAttributeContext columnAttribute(int i) {
			return getRuleContext(ColumnAttributeContext.class,i);
		}
		public ColumnAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterColumnAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitColumnAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitColumnAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAttributeListContext columnAttributeList() throws RecognitionException {
		ColumnAttributeListContext _localctx = new ColumnAttributeListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_columnAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (GENERATED - 28)) | (1L << (COMPRESS - 28)) | (1L << (FORMAT - 28)) | (1L << (NOT - 28)) | (1L << (CHARACTER - 28)) | (1L << (CASE_SPECIFIC - 28)) | (1L << (CS - 28)))) != 0)) {
				{
				{
				setState(238);
				columnAttribute();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAttributeContext extends ParserRuleContext {
		public IdentityConstraintContext identityConstraint() {
			return getRuleContext(IdentityConstraintContext.class,0);
		}
		public NotNullContext notNull() {
			return getRuleContext(NotNullContext.class,0);
		}
		public FormatDateContext formatDate() {
			return getRuleContext(FormatDateContext.class,0);
		}
		public CaseSpecificContext caseSpecific() {
			return getRuleContext(CaseSpecificContext.class,0);
		}
		public CharacterSetContext characterSet() {
			return getRuleContext(CharacterSetContext.class,0);
		}
		public CompressContext compress() {
			return getRuleContext(CompressContext.class,0);
		}
		public ColumnAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterColumnAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitColumnAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitColumnAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAttributeContext columnAttribute() throws RecognitionException {
		ColumnAttributeContext _localctx = new ColumnAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columnAttribute);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				identityConstraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				notNull();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				formatDate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				caseSpecific();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				characterSet();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				compress();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotNullContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(TeradataCreateTableParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(TeradataCreateTableParser.NULL, 0); }
		public NotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterNotNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitNotNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitNotNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNullContext notNull() throws RecognitionException {
		NotNullContext _localctx = new NotNullContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_notNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(NOT);
			setState(253);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatDateContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(TeradataCreateTableParser.FORMAT, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(TeradataCreateTableParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(TeradataCreateTableParser.SINGLE_QUOTE, i);
		}
		public FormatTypeContext formatType() {
			return getRuleContext(FormatTypeContext.class,0);
		}
		public FormatDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterFormatDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitFormatDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitFormatDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatDateContext formatDate() throws RecognitionException {
		FormatDateContext _localctx = new FormatDateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formatDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(FORMAT);
			setState(256);
			match(SINGLE_QUOTE);
			setState(257);
			formatType();
			setState(258);
			match(SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatTypeContext extends ParserRuleContext {
		public TerminalNode YYYY() { return getToken(TeradataCreateTableParser.YYYY, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(TeradataCreateTableParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(TeradataCreateTableParser.SEPARATOR, i);
		}
		public TerminalNode MM() { return getToken(TeradataCreateTableParser.MM, 0); }
		public TerminalNode DD() { return getToken(TeradataCreateTableParser.DD, 0); }
		public FormatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterFormatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitFormatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitFormatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatTypeContext formatType() throws RecognitionException {
		FormatTypeContext _localctx = new FormatTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formatType);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YYYY:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(YYYY);
				setState(261);
				match(SEPARATOR);
				setState(262);
				match(MM);
				setState(263);
				match(SEPARATOR);
				setState(264);
				match(DD);
				}
				break;
			case DD:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(DD);
				setState(266);
				match(SEPARATOR);
				setState(267);
				match(MM);
				setState(268);
				match(SEPARATOR);
				setState(269);
				match(YYYY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseSpecificContext extends ParserRuleContext {
		public TerminalNode CASE_SPECIFIC() { return getToken(TeradataCreateTableParser.CASE_SPECIFIC, 0); }
		public TerminalNode CS() { return getToken(TeradataCreateTableParser.CS, 0); }
		public TerminalNode NOT() { return getToken(TeradataCreateTableParser.NOT, 0); }
		public CaseSpecificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseSpecific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterCaseSpecific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitCaseSpecific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitCaseSpecific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseSpecificContext caseSpecific() throws RecognitionException {
		CaseSpecificContext _localctx = new CaseSpecificContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_caseSpecific);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(272);
				match(NOT);
				}
			}

			setState(275);
			_la = _input.LA(1);
			if ( !(_la==CASE_SPECIFIC || _la==CS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterSetContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(TeradataCreateTableParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(TeradataCreateTableParser.SET, 0); }
		public PhraseTypeContext phraseType() {
			return getRuleContext(PhraseTypeContext.class,0);
		}
		public CharacterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterCharacterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitCharacterSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitCharacterSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSetContext characterSet() throws RecognitionException {
		CharacterSetContext _localctx = new CharacterSetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_characterSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CHARACTER);
			setState(278);
			match(SET);
			setState(279);
			phraseType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhraseTypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public PhraseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phraseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterPhraseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitPhraseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitPhraseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseTypeContext phraseType() throws RecognitionException {
		PhraseTypeContext _localctx = new PhraseTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_phraseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompressContext extends ParserRuleContext {
		public TerminalNode COMPRESS() { return getToken(TeradataCreateTableParser.COMPRESS, 0); }
		public ConditionalExpressionListContext conditionalExpressionList() {
			return getRuleContext(ConditionalExpressionListContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public CompressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterCompress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitCompress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitCompress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompressContext compress() throws RecognitionException {
		CompressContext _localctx = new CompressContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(COMPRESS);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT4) | (1L << INT2) | (1L << NUM))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (OPEN_BRACKET - 88)) | (1L << (SINGLE_QUOTE - 88)) | (1L << (NAME - 88)))) != 0)) {
				{
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(284);
					match(OPEN_BRACKET);
					}
				}

				setState(287);
				conditionalExpressionList();
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(288);
					match(CLOSE_BRACKET);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentityConstraintContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(TeradataCreateTableParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(TeradataCreateTableParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(TeradataCreateTableParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(TeradataCreateTableParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(TeradataCreateTableParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(TeradataCreateTableParser.DEFAULT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public IdentityExpressionContext identityExpression() {
			return getRuleContext(IdentityExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public IdentityConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterIdentityConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitIdentityConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitIdentityConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityConstraintContext identityConstraint() throws RecognitionException {
		IdentityConstraintContext _localctx = new IdentityConstraintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identityConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(GENERATED);
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS:
				{
				setState(294);
				match(ALWAYS);
				}
				break;
			case BY:
				{
				setState(295);
				match(BY);
				setState(296);
				match(DEFAULT);
				}
				break;
			case AS:
				break;
			default:
				break;
			}
			setState(299);
			match(AS);
			setState(300);
			match(IDENTITY);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(301);
				match(OPEN_BRACKET);
				setState(302);
				identityExpression();
				setState(303);
				match(CLOSE_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentityExpressionContext extends ParserRuleContext {
		public StartWithContext startWith() {
			return getRuleContext(StartWithContext.class,0);
		}
		public IncrementByContext incrementBy() {
			return getRuleContext(IncrementByContext.class,0);
		}
		public IsCycleContext isCycle() {
			return getRuleContext(IsCycleContext.class,0);
		}
		public MinValueContext minValue() {
			return getRuleContext(MinValueContext.class,0);
		}
		public NoMinValueContext noMinValue() {
			return getRuleContext(NoMinValueContext.class,0);
		}
		public MaxValueContext maxValue() {
			return getRuleContext(MaxValueContext.class,0);
		}
		public NoMaxValueContext noMaxValue() {
			return getRuleContext(NoMaxValueContext.class,0);
		}
		public IdentityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterIdentityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitIdentityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitIdentityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityExpressionContext identityExpression() throws RecognitionException {
		IdentityExpressionContext _localctx = new IdentityExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			startWith();
			setState(308);
			incrementBy();
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINVALUE:
				{
				setState(309);
				minValue();
				}
				break;
			case NO:
				{
				setState(310);
				noMinValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXVALUE:
				{
				setState(313);
				maxValue();
				}
				break;
			case NO:
				{
				setState(314);
				noMaxValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			isCycle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartWithContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(TeradataCreateTableParser.START, 0); }
		public TerminalNode WITH() { return getToken(TeradataCreateTableParser.WITH, 0); }
		public TerminalNode NUM() { return getToken(TeradataCreateTableParser.NUM, 0); }
		public StartWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterStartWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitStartWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitStartWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartWithContext startWith() throws RecognitionException {
		StartWithContext _localctx = new StartWithContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_startWith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(START);
			setState(320);
			match(WITH);
			setState(321);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementByContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(TeradataCreateTableParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(TeradataCreateTableParser.BY, 0); }
		public TerminalNode NUM() { return getToken(TeradataCreateTableParser.NUM, 0); }
		public IncrementByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterIncrementBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitIncrementBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitIncrementBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementByContext incrementBy() throws RecognitionException {
		IncrementByContext _localctx = new IncrementByContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_incrementBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(INCREMENT);
			setState(324);
			match(BY);
			setState(325);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinValueContext extends ParserRuleContext {
		public TerminalNode MINVALUE() { return getToken(TeradataCreateTableParser.MINVALUE, 0); }
		public TerminalNode NUM() { return getToken(TeradataCreateTableParser.NUM, 0); }
		public MinValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterMinValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitMinValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitMinValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinValueContext minValue() throws RecognitionException {
		MinValueContext _localctx = new MinValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_minValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(MINVALUE);
			setState(328);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoMinValueContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(TeradataCreateTableParser.NO, 0); }
		public TerminalNode MINVALUE() { return getToken(TeradataCreateTableParser.MINVALUE, 0); }
		public NoMinValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noMinValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterNoMinValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitNoMinValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitNoMinValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoMinValueContext noMinValue() throws RecognitionException {
		NoMinValueContext _localctx = new NoMinValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_noMinValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(NO);
			setState(331);
			match(MINVALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoMaxValueContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(TeradataCreateTableParser.NO, 0); }
		public TerminalNode MAXVALUE() { return getToken(TeradataCreateTableParser.MAXVALUE, 0); }
		public NoMaxValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noMaxValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterNoMaxValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitNoMaxValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitNoMaxValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoMaxValueContext noMaxValue() throws RecognitionException {
		NoMaxValueContext _localctx = new NoMaxValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_noMaxValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(NO);
			setState(334);
			match(MAXVALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaxValueContext extends ParserRuleContext {
		public TerminalNode MAXVALUE() { return getToken(TeradataCreateTableParser.MAXVALUE, 0); }
		public TerminalNode NUM() { return getToken(TeradataCreateTableParser.NUM, 0); }
		public MaxValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterMaxValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitMaxValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitMaxValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxValueContext maxValue() throws RecognitionException {
		MaxValueContext _localctx = new MaxValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_maxValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(MAXVALUE);
			setState(337);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsCycleContext extends ParserRuleContext {
		public TerminalNode CYCLE() { return getToken(TeradataCreateTableParser.CYCLE, 0); }
		public TerminalNode NO() { return getToken(TeradataCreateTableParser.NO, 0); }
		public IsCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterIsCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitIsCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitIsCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsCycleContext isCycle() throws RecognitionException {
		IsCycleContext _localctx = new IsCycleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_isCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(339);
				match(NO);
				}
			}

			setState(342);
			match(CYCLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefinitionsContext extends ParserRuleContext {
		public List<UniquePrimaryIndexContext> uniquePrimaryIndex() {
			return getRuleContexts(UniquePrimaryIndexContext.class);
		}
		public UniquePrimaryIndexContext uniquePrimaryIndex(int i) {
			return getRuleContext(UniquePrimaryIndexContext.class,i);
		}
		public List<NoPrimaryIndexContext> noPrimaryIndex() {
			return getRuleContexts(NoPrimaryIndexContext.class);
		}
		public NoPrimaryIndexContext noPrimaryIndex(int i) {
			return getRuleContext(NoPrimaryIndexContext.class,i);
		}
		public List<PrimaryAmpIndexContext> primaryAmpIndex() {
			return getRuleContexts(PrimaryAmpIndexContext.class);
		}
		public PrimaryAmpIndexContext primaryAmpIndex(int i) {
			return getRuleContext(PrimaryAmpIndexContext.class,i);
		}
		public List<PartitionExpressionListContext> partitionExpressionList() {
			return getRuleContexts(PartitionExpressionListContext.class);
		}
		public PartitionExpressionListContext partitionExpressionList(int i) {
			return getRuleContext(PartitionExpressionListContext.class,i);
		}
		public IndexDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterIndexDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitIndexDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitIndexDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexDefinitionsContext indexDefinitions() throws RecognitionException {
		IndexDefinitionsContext _localctx = new IndexDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_indexDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NO - 66)) | (1L << (PARTITION - 66)) | (1L << (UNIQUE - 66)) | (1L << (PRIMARY - 66)) | (1L << (INDEX - 66)))) != 0)) {
				{
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(344);
					uniquePrimaryIndex();
					}
					break;
				case 2:
					{
					setState(345);
					noPrimaryIndex();
					}
					break;
				case 3:
					{
					setState(346);
					primaryAmpIndex();
					}
					break;
				case 4:
					{
					setState(347);
					partitionExpressionList();
					}
					break;
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniquePrimaryIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(TeradataCreateTableParser.INDEX, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public IndexColumnListContext indexColumnList() {
			return getRuleContext(IndexColumnListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public TerminalNode UNIQUE() { return getToken(TeradataCreateTableParser.UNIQUE, 0); }
		public TerminalNode PRIMARY() { return getToken(TeradataCreateTableParser.PRIMARY, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(TeradataCreateTableParser.ALL, 0); }
		public OrderingContext ordering() {
			return getRuleContext(OrderingContext.class,0);
		}
		public LoadingContext loading() {
			return getRuleContext(LoadingContext.class,0);
		}
		public UniquePrimaryIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniquePrimaryIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterUniquePrimaryIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitUniquePrimaryIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitUniquePrimaryIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniquePrimaryIndexContext uniquePrimaryIndex() throws RecognitionException {
		UniquePrimaryIndexContext _localctx = new UniquePrimaryIndexContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_uniquePrimaryIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(353);
				match(UNIQUE);
				}
			}

			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(356);
				match(PRIMARY);
				}
			}

			setState(359);
			match(INDEX);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(360);
				indexName();
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(363);
				match(ALL);
				}
			}

			setState(366);
			match(OPEN_BRACKET);
			setState(367);
			indexColumnList();
			setState(368);
			match(CLOSE_BRACKET);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(369);
				ordering();
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(372);
				loading();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoPrimaryIndexContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(TeradataCreateTableParser.NO, 0); }
		public TerminalNode PRIMARY() { return getToken(TeradataCreateTableParser.PRIMARY, 0); }
		public TerminalNode INDEX() { return getToken(TeradataCreateTableParser.INDEX, 0); }
		public NoPrimaryIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPrimaryIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterNoPrimaryIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitNoPrimaryIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitNoPrimaryIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPrimaryIndexContext noPrimaryIndex() throws RecognitionException {
		NoPrimaryIndexContext _localctx = new NoPrimaryIndexContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_noPrimaryIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(NO);
			setState(376);
			match(PRIMARY);
			setState(377);
			match(INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryAmpIndexContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(TeradataCreateTableParser.PRIMARY, 0); }
		public TerminalNode AMP() { return getToken(TeradataCreateTableParser.AMP, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public IndexColumnListContext indexColumnList() {
			return getRuleContext(IndexColumnListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public TerminalNode INDEX() { return getToken(TeradataCreateTableParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public PrimaryAmpIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryAmpIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterPrimaryAmpIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitPrimaryAmpIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitPrimaryAmpIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryAmpIndexContext primaryAmpIndex() throws RecognitionException {
		PrimaryAmpIndexContext _localctx = new PrimaryAmpIndexContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primaryAmpIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(PRIMARY);
			setState(380);
			match(AMP);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX) {
				{
				setState(381);
				match(INDEX);
				}
			}

			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(384);
				indexName();
				}
			}

			setState(387);
			match(OPEN_BRACKET);
			setState(388);
			indexColumnList();
			setState(389);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitIndexName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexColumnListContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeradataCreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataCreateTableParser.COMMA, i);
		}
		public IndexColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColumnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterIndexColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitIndexColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitIndexColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexColumnListContext indexColumnList() throws RecognitionException {
		IndexColumnListContext _localctx = new IndexColumnListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_indexColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			columnName();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(394);
				match(COMMA);
				setState(395);
				columnName();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadingContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(TeradataCreateTableParser.WITH, 0); }
		public TerminalNode LOAD_ENTITY() { return getToken(TeradataCreateTableParser.LOAD_ENTITY, 0); }
		public TerminalNode NO() { return getToken(TeradataCreateTableParser.NO, 0); }
		public LoadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterLoading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitLoading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitLoading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadingContext loading() throws RecognitionException {
		LoadingContext _localctx = new LoadingContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_loading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(WITH);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(402);
				match(NO);
				}
			}

			setState(405);
			match(LOAD_ENTITY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderingContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(TeradataCreateTableParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(TeradataCreateTableParser.BY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public OrderColumnNameContext orderColumnName() {
			return getRuleContext(OrderColumnNameContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public TerminalNode VALUES() { return getToken(TeradataCreateTableParser.VALUES, 0); }
		public TerminalNode HASH() { return getToken(TeradataCreateTableParser.HASH, 0); }
		public OrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderingContext ordering() throws RecognitionException {
		OrderingContext _localctx = new OrderingContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(ORDER);
			setState(408);
			match(BY);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES || _la==HASH) {
				{
				setState(409);
				_la = _input.LA(1);
				if ( !(_la==VALUES || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(412);
				match(OPEN_BRACKET);
				setState(413);
				orderColumnName();
				setState(414);
				match(CLOSE_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderColumnNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public OrderColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterOrderColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitOrderColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitOrderColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderColumnNameContext orderColumnName() throws RecognitionException {
		OrderColumnNameContext _localctx = new OrderColumnNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_orderColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionExpressionListContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(TeradataCreateTableParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(TeradataCreateTableParser.BY, 0); }
		public List<PartitionExpressionContext> partitionExpression() {
			return getRuleContexts(PartitionExpressionContext.class);
		}
		public PartitionExpressionContext partitionExpression(int i) {
			return getRuleContext(PartitionExpressionContext.class,i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TeradataCreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataCreateTableParser.COMMA, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public PartitionExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterPartitionExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitPartitionExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitPartitionExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionExpressionListContext partitionExpressionList() throws RecognitionException {
		PartitionExpressionListContext _localctx = new PartitionExpressionListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_partitionExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(PARTITION);
			setState(421);
			match(BY);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(422);
				match(OPEN_BRACKET);
				}
			}

			setState(425);
			partitionExpression();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(426);
				match(COMMA);
				setState(427);
				partitionExpression();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACKET) {
				{
				setState(433);
				match(CLOSE_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionExpressionContext extends ParserRuleContext {
		public ArithmeticPartitionContext arithmeticPartition() {
			return getRuleContext(ArithmeticPartitionContext.class,0);
		}
		public SimplePartitionContext simplePartition() {
			return getRuleContext(SimplePartitionContext.class,0);
		}
		public CaseNPartitionContext caseNPartition() {
			return getRuleContext(CaseNPartitionContext.class,0);
		}
		public RangeNPartitionContext rangeNPartition() {
			return getRuleContext(RangeNPartitionContext.class,0);
		}
		public FunctionPartitionContext functionPartition() {
			return getRuleContext(FunctionPartitionContext.class,0);
		}
		public PartitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterPartitionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitPartitionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitPartitionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionExpressionContext partitionExpression() throws RecognitionException {
		PartitionExpressionContext _localctx = new PartitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_partitionExpression);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				arithmeticPartition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				simplePartition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				caseNPartition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				rangeNPartition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				functionPartition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplePartitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SimplePartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePartition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterSimplePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitSimplePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitSimplePartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePartitionContext simplePartition() throws RecognitionException {
		SimplePartitionContext _localctx = new SimplePartitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_simplePartition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseNPartitionContext extends ParserRuleContext {
		public TerminalNode CASE_N() { return getToken(TeradataCreateTableParser.CASE_N, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public ConditionalExpressionListContext conditionalExpressionList() {
			return getRuleContext(ConditionalExpressionListContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TeradataCreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataCreateTableParser.COMMA, i);
		}
		public TerminalNode NO_CASE() { return getToken(TeradataCreateTableParser.NO_CASE, 0); }
		public TerminalNode UNKNOWN() { return getToken(TeradataCreateTableParser.UNKNOWN, 0); }
		public TerminalNode OR_UNKNOWN() { return getToken(TeradataCreateTableParser.OR_UNKNOWN, 0); }
		public CaseNPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseNPartition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterCaseNPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitCaseNPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitCaseNPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseNPartitionContext caseNPartition() throws RecognitionException {
		CaseNPartitionContext _localctx = new CaseNPartitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_caseNPartition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(CASE_N);
			setState(446);
			match(OPEN_BRACKET);
			setState(447);
			conditionalExpressionList();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(448);
				match(COMMA);
				setState(456);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO_CASE:
					{
					setState(449);
					match(NO_CASE);
					setState(453);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OR_UNKNOWN:
						{
						setState(450);
						match(OR_UNKNOWN);
						}
						break;
					case COMMA:
						{
						setState(451);
						match(COMMA);
						setState(452);
						match(UNKNOWN);
						}
						break;
					case CLOSE_BRACKET:
						break;
					default:
						break;
					}
					}
					break;
				case UNKNOWN:
					{
					setState(455);
					match(UNKNOWN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(460);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionListContext extends ParserRuleContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeradataCreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataCreateTableParser.COMMA, i);
		}
		public ConditionalExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterConditionalExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitConditionalExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitConditionalExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionListContext conditionalExpressionList() throws RecognitionException {
		ConditionalExpressionListContext _localctx = new ConditionalExpressionListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_conditionalExpressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			conditionalExpression();
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(463);
					match(COMMA);
					setState(464);
					conditionalExpression();
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			tExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TExpressionContext extends ParserRuleContext {
		public ExpressionStringContext expressionString() {
			return getRuleContext(ExpressionStringContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnExpressionContext columnExpression() {
			return getRuleContext(ColumnExpressionContext.class,0);
		}
		public TerminalNode INT2() { return getToken(TeradataCreateTableParser.INT2, 0); }
		public TerminalNode INT4() { return getToken(TeradataCreateTableParser.INT4, 0); }
		public TerminalNode NUM() { return getToken(TeradataCreateTableParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(TeradataCreateTableParser.FLOAT, 0); }
		public List<TExpressionContext> tExpression() {
			return getRuleContexts(TExpressionContext.class);
		}
		public TExpressionContext tExpression(int i) {
			return getRuleContext(TExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TeradataCreateTableParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(TeradataCreateTableParser.BETWEEN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterTExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitTExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitTExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TExpressionContext tExpression() throws RecognitionException {
		return tExpression(0);
	}

	private TExpressionContext tExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TExpressionContext _localctx = new TExpressionContext(_ctx, _parentState);
		TExpressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_tExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(473);
				expressionString();
				}
				break;
			case 2:
				{
				setState(474);
				columnName();
				}
				break;
			case 3:
				{
				setState(475);
				columnExpression();
				}
				break;
			case 4:
				{
				setState(476);
				match(INT2);
				}
				break;
			case 5:
				{
				setState(477);
				match(INT4);
				}
				break;
			case 6:
				{
				setState(478);
				match(NUM);
				}
				break;
			case 7:
				{
				setState(479);
				match(FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(492);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new TExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tExpression);
						setState(482);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(483);
						match(AND);
						setState(484);
						tExpression(11);
						}
						break;
					case 2:
						{
						_localctx = new TExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tExpression);
						setState(485);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(486);
						match(BETWEEN);
						setState(487);
						tExpression(10);
						}
						break;
					case 3:
						{
						_localctx = new TExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tExpression);
						setState(488);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(489);
						operator();
						setState(490);
						tExpression(9);
						}
						break;
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(TeradataCreateTableParser.BETWEEN, 0); }
		public TerminalNode LIKE() { return getToken(TeradataCreateTableParser.LIKE, 0); }
		public TerminalNode LESS_THAN() { return getToken(TeradataCreateTableParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(TeradataCreateTableParser.LESS_THAN_EQUALS, 0); }
		public TerminalNode EQUALS() { return getToken(TeradataCreateTableParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(TeradataCreateTableParser.NOT_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(TeradataCreateTableParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(TeradataCreateTableParser.GREATER_THAN_EQUALS, 0); }
		public TerminalNode AND() { return getToken(TeradataCreateTableParser.AND, 0); }
		public TerminalNode OR() { return getToken(TeradataCreateTableParser.OR, 0); }
		public TerminalNode ADDITION() { return getToken(TeradataCreateTableParser.ADDITION, 0); }
		public TerminalNode STAR() { return getToken(TeradataCreateTableParser.STAR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (AND - 5)) | (1L << (OR - 5)) | (1L << (STAR - 5)) | (1L << (ADDITION - 5)) | (1L << (LESS_THAN - 5)) | (1L << (LESS_THAN_EQUALS - 5)) | (1L << (EQUALS - 5)) | (1L << (NOT_EQUALS - 5)) | (1L << (GREATER_THAN - 5)) | (1L << (GREATER_THAN_EQUALS - 5)) | (1L << (BETWEEN - 5)) | (1L << (LIKE - 5)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnExpressionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public TerminalNode AS() { return getToken(TeradataCreateTableParser.AS, 0); }
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public ColumnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterColumnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitColumnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitColumnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnExpressionContext columnExpression() throws RecognitionException {
		ColumnExpressionContext _localctx = new ColumnExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_columnExpression);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				columnName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				functionName();
				setState(501);
				match(OPEN_BRACKET);
				setState(502);
				columnName();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(503);
					match(AS);
					}
				}

				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(506);
					match(NAME);
					}
				}

				setState(509);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStringContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(TeradataCreateTableParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(TeradataCreateTableParser.SINGLE_QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public TerminalNode FLOAT() { return getToken(TeradataCreateTableParser.FLOAT, 0); }
		public TerminalNode NUM() { return getToken(TeradataCreateTableParser.NUM, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public CastTokenContext castToken() {
			return getRuleContext(CastTokenContext.class,0);
		}
		public ExpressionStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterExpressionString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitExpressionString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitExpressionString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStringContext expressionString() throws RecognitionException {
		ExpressionStringContext _localctx = new ExpressionStringContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionString);
		int _la;
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(513);
				match(SINGLE_QUOTE);
				setState(514);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(515);
				match(SINGLE_QUOTE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(516);
					castToken();
					}
				}

				setState(519);
				match(SINGLE_QUOTE);
				setState(520);
				date();
				setState(521);
				match(SINGLE_QUOTE);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastTokenContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TeradataCreateTableParser.NAME, 0); }
		public CastTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterCastToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitCastToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitCastToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTokenContext castToken() throws RecognitionException {
		CastTokenContext _localctx = new CastTokenContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_castToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeNPartitionContext extends ParserRuleContext {
		public TerminalNode RANGE_N() { return getToken(TeradataCreateTableParser.RANGE_N, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public ColumnExpressionContext columnExpression() {
			return getRuleContext(ColumnExpressionContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(TeradataCreateTableParser.BETWEEN, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public RangeListContext rangeList() {
			return getRuleContext(RangeListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TeradataCreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataCreateTableParser.COMMA, i);
		}
		public StartExpressionContext startExpression() {
			return getRuleContext(StartExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(TeradataCreateTableParser.AND, 0); }
		public List<TerminalNode> STAR() { return getTokens(TeradataCreateTableParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(TeradataCreateTableParser.STAR, i);
		}
		public TerminalNode NO_RANGE() { return getToken(TeradataCreateTableParser.NO_RANGE, 0); }
		public TerminalNode UNKNOWN() { return getToken(TeradataCreateTableParser.UNKNOWN, 0); }
		public EndExpressionContext endExpression() {
			return getRuleContext(EndExpressionContext.class,0);
		}
		public TerminalNode EACH() { return getToken(TeradataCreateTableParser.EACH, 0); }
		public RangeSizeContext rangeSize() {
			return getRuleContext(RangeSizeContext.class,0);
		}
		public TerminalNode OR_UNKNOWN() { return getToken(TeradataCreateTableParser.OR_UNKNOWN, 0); }
		public RangeNPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeNPartition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterRangeNPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitRangeNPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitRangeNPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeNPartitionContext rangeNPartition() throws RecognitionException {
		RangeNPartitionContext _localctx = new RangeNPartitionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_rangeNPartition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(RANGE_N);
			setState(530);
			match(OPEN_BRACKET);
			setState(531);
			columnExpression();
			setState(532);
			match(BETWEEN);
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				{
				setState(533);
				startExpression();
				setState(534);
				match(AND);
				setState(537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FLOAT:
				case INT4:
				case INT2:
				case NUM:
				case SINGLE_QUOTE:
				case NAME:
					{
					setState(535);
					endExpression();
					}
					break;
				case STAR:
					{
					setState(536);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EACH) {
					{
					setState(539);
					match(EACH);
					setState(540);
					rangeSize();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(543);
				match(STAR);
				setState(544);
				match(AND);
				setState(547);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FLOAT:
				case INT4:
				case INT2:
				case NUM:
				case SINGLE_QUOTE:
				case NAME:
					{
					setState(545);
					endExpression();
					}
					break;
				case STAR:
					{
					setState(546);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(549);
				rangeList();
				}
				break;
			}
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(552);
				match(COMMA);
				setState(560);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO_RANGE:
					{
					setState(553);
					match(NO_RANGE);
					setState(557);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OR_UNKNOWN:
						{
						setState(554);
						match(OR_UNKNOWN);
						}
						break;
					case COMMA:
						{
						setState(555);
						match(COMMA);
						setState(556);
						match(UNKNOWN);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case UNKNOWN:
					{
					setState(559);
					match(UNKNOWN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(564);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(TeradataCreateTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TeradataCreateTableParser.COMMA, i);
		}
		public List<NextRangeListContext> nextRangeList() {
			return getRuleContexts(NextRangeListContext.class);
		}
		public NextRangeListContext nextRangeList(int i) {
			return getRuleContext(NextRangeListContext.class,i);
		}
		public StartExpressionContext startExpression() {
			return getRuleContext(StartExpressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(TeradataCreateTableParser.STAR, 0); }
		public TerminalNode AND() { return getToken(TeradataCreateTableParser.AND, 0); }
		public EndExpressionContext endExpression() {
			return getRuleContext(EndExpressionContext.class,0);
		}
		public TerminalNode EACH() { return getToken(TeradataCreateTableParser.EACH, 0); }
		public RangeSizeContext rangeSize() {
			return getRuleContext(RangeSizeContext.class,0);
		}
		public RangeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterRangeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitRangeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitRangeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeListContext rangeList() throws RecognitionException {
		RangeListContext _localctx = new RangeListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_rangeList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT4:
			case INT2:
			case NUM:
			case SINGLE_QUOTE:
			case NAME:
				{
				{
				setState(566);
				startExpression();
				{
				setState(567);
				match(AND);
				setState(568);
				endExpression();
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EACH) {
					{
					setState(570);
					match(EACH);
					setState(571);
					rangeSize();
					}
				}

				}
				}
				break;
			case STAR:
				{
				{
				setState(574);
				match(STAR);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(575);
					match(AND);
					setState(576);
					endExpression();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(581);
					match(COMMA);
					setState(582);
					nextRangeList();
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NextRangeListContext extends ParserRuleContext {
		public StartExpressionContext startExpression() {
			return getRuleContext(StartExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(TeradataCreateTableParser.AND, 0); }
		public TerminalNode EACH() { return getToken(TeradataCreateTableParser.EACH, 0); }
		public RangeSizeContext rangeSize() {
			return getRuleContext(RangeSizeContext.class,0);
		}
		public EndExpressionContext endExpression() {
			return getRuleContext(EndExpressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(TeradataCreateTableParser.STAR, 0); }
		public NextRangeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextRangeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterNextRangeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitNextRangeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitNextRangeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextRangeListContext nextRangeList() throws RecognitionException {
		NextRangeListContext _localctx = new NextRangeListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_nextRangeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			startExpression();
			{
			setState(589);
			match(AND);
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT4:
			case INT2:
			case NUM:
			case SINGLE_QUOTE:
			case NAME:
				{
				setState(590);
				endExpression();
				}
				break;
			case STAR:
				{
				setState(591);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EACH) {
				{
				setState(594);
				match(EACH);
				setState(595);
				rangeSize();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestExpressionContext extends ParserRuleContext {
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
		public TestExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterTestExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitTestExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitTestExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestExpressionContext testExpression() throws RecognitionException {
		TestExpressionContext _localctx = new TestExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_testExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			tExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartExpressionContext extends ParserRuleContext {
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
		public StartExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterStartExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitStartExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitStartExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartExpressionContext startExpression() throws RecognitionException {
		StartExpressionContext _localctx = new StartExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_startExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			tExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndExpressionContext extends ParserRuleContext {
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
		public EndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterEndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitEndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitEndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndExpressionContext endExpression() throws RecognitionException {
		EndExpressionContext _localctx = new EndExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_endExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			tExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeSizeContext extends ParserRuleContext {
		public StepSizeContext stepSize() {
			return getRuleContext(StepSizeContext.class,0);
		}
		public TerminalNode INTERVAL() { return getToken(TeradataCreateTableParser.INTERVAL, 0); }
		public ExpressionStringContext expressionString() {
			return getRuleContext(ExpressionStringContext.class,0);
		}
		public StepTypeContext stepType() {
			return getRuleContext(StepTypeContext.class,0);
		}
		public RangeSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterRangeSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitRangeSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitRangeSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeSizeContext rangeSize() throws RecognitionException {
		RangeSizeContext _localctx = new RangeSizeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_rangeSize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVAL) {
				{
				setState(604);
				match(INTERVAL);
				}
			}

			setState(607);
			stepSize();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTE || _la==NAME) {
				{
				setState(608);
				expressionString();
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << WEEK) | (1L << DAY))) != 0)) {
				{
				setState(611);
				stepType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepSizeContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(TeradataCreateTableParser.NUM, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(TeradataCreateTableParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(TeradataCreateTableParser.SINGLE_QUOTE, i);
		}
		public StepSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterStepSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitStepSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitStepSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepSizeContext stepSize() throws RecognitionException {
		StepSizeContext _localctx = new StepSizeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_stepSize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTE) {
				{
				setState(614);
				match(SINGLE_QUOTE);
				}
			}

			setState(617);
			match(NUM);
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(618);
				match(SINGLE_QUOTE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepTypeContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(TeradataCreateTableParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(TeradataCreateTableParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(TeradataCreateTableParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(TeradataCreateTableParser.YEAR, 0); }
		public StepTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterStepType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitStepType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitStepType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepTypeContext stepType() throws RecognitionException {
		StepTypeContext _localctx = new StepTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_stepType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << WEEK) | (1L << DAY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticPartitionContext extends ParserRuleContext {
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
		public ArithmeticPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticPartition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterArithmeticPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitArithmeticPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitArithmeticPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticPartitionContext arithmeticPartition() throws RecognitionException {
		ArithmeticPartitionContext _localctx = new ArithmeticPartitionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arithmeticPartition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			tExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionPartitionContext extends ParserRuleContext {
		public ExtractFunctionContext extractFunction() {
			return getRuleContext(ExtractFunctionContext.class,0);
		}
		public FunctionPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPartition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterFunctionPartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitFunctionPartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitFunctionPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPartitionContext functionPartition() throws RecognitionException {
		FunctionPartitionContext _localctx = new FunctionPartitionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_functionPartition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			extractFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(TeradataCreateTableParser.EXTRACT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(TeradataCreateTableParser.OPEN_BRACKET, 0); }
		public ExtractTokenContext extractToken() {
			return getRuleContext(ExtractTokenContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TeradataCreateTableParser.FROM, 0); }
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TeradataCreateTableParser.CLOSE_BRACKET, 0); }
		public ExtractFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterExtractFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitExtractFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitExtractFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractFunctionContext extractFunction() throws RecognitionException {
		ExtractFunctionContext _localctx = new ExtractFunctionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_extractFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(EXTRACT);
			setState(628);
			match(OPEN_BRACKET);
			setState(629);
			extractToken();
			setState(630);
			match(FROM);
			setState(631);
			tExpression(0);
			setState(632);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractTokenContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(TeradataCreateTableParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(TeradataCreateTableParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(TeradataCreateTableParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(TeradataCreateTableParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(TeradataCreateTableParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(TeradataCreateTableParser.SECOND, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(TeradataCreateTableParser.TIMEZONE_HOUR, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(TeradataCreateTableParser.TIMEZONE_MINUTE, 0); }
		public ExtractTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterExtractToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitExtractToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitExtractToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractTokenContext extractToken() throws RecognitionException {
		ExtractTokenContext _localctx = new ExtractTokenContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_extractToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND) | (1L << TIMEZONE_HOUR) | (1L << TIMEZONE_MINUTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode INT4() { return getToken(TeradataCreateTableParser.INT4, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(TeradataCreateTableParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(TeradataCreateTableParser.SEPARATOR, i);
		}
		public List<TerminalNode> INT2() { return getTokens(TeradataCreateTableParser.INT2); }
		public TerminalNode INT2(int i) {
			return getToken(TeradataCreateTableParser.INT2, i);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_date);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(INT4);
				setState(637);
				match(SEPARATOR);
				setState(638);
				match(INT2);
				setState(639);
				match(SEPARATOR);
				setState(640);
				match(INT2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(INT2);
				setState(642);
				match(SEPARATOR);
				setState(643);
				month();
				setState(644);
				match(SEPARATOR);
				setState(645);
				match(INT2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				match(INT2);
				setState(648);
				match(SEPARATOR);
				setState(649);
				month();
				setState(650);
				match(SEPARATOR);
				setState(651);
				match(INT4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
				match(INT2);
				setState(654);
				match(SEPARATOR);
				setState(655);
				match(INT2);
				setState(656);
				match(SEPARATOR);
				setState(657);
				match(INT4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode JAN() { return getToken(TeradataCreateTableParser.JAN, 0); }
		public TerminalNode FEB() { return getToken(TeradataCreateTableParser.FEB, 0); }
		public TerminalNode MAR() { return getToken(TeradataCreateTableParser.MAR, 0); }
		public TerminalNode APR() { return getToken(TeradataCreateTableParser.APR, 0); }
		public TerminalNode MAY() { return getToken(TeradataCreateTableParser.MAY, 0); }
		public TerminalNode JUN() { return getToken(TeradataCreateTableParser.JUN, 0); }
		public TerminalNode JUL() { return getToken(TeradataCreateTableParser.JUL, 0); }
		public TerminalNode AUG() { return getToken(TeradataCreateTableParser.AUG, 0); }
		public TerminalNode SEP() { return getToken(TeradataCreateTableParser.SEP, 0); }
		public TerminalNode OCT() { return getToken(TeradataCreateTableParser.OCT, 0); }
		public TerminalNode NOV() { return getToken(TeradataCreateTableParser.NOV, 0); }
		public TerminalNode DEC() { return getToken(TeradataCreateTableParser.DEC, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TeradataCreateTableListener ) ((TeradataCreateTableListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TeradataCreateTableVisitor ) return ((TeradataCreateTableVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (JAN - 96)) | (1L << (FEB - 96)) | (1L << (MAR - 96)) | (1L << (APR - 96)) | (1L << (MAY - 96)) | (1L << (JUN - 96)) | (1L << (JUL - 96)) | (1L << (AUG - 96)) | (1L << (SEP - 96)) | (1L << (OCT - 96)) | (1L << (NOV - 96)) | (1L << (DEC - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 47:
			return tExpression_sempred((TExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tExpression_sempred(TExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3r\u0299\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\5\2\u008d\n\2"+
		"\3\2\3\2\3\3\3\3\5\3\u0093\n\3\3\3\3\3\3\3\5\3\u0098\n\3\3\3\3\3\5\3\u009c"+
		"\n\3\3\3\5\3\u009f\n\3\3\3\3\3\3\3\5\3\u00a4\n\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\7\5\u00ae\n\5\f\5\16\5\u00b1\13\5\3\6\3\6\3\6\3\6\3\6\5\6\u00b8"+
		"\n\6\3\7\5\7\u00bb\n\7\3\7\3\7\5\7\u00bf\n\7\3\b\5\b\u00c2\n\b\3\b\5\b"+
		"\u00c5\n\b\3\b\3\b\3\t\5\t\u00ca\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00da\n\f\f\f\16\f\u00dd\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ec\n\17\3\17"+
		"\5\17\u00ef\n\17\3\20\7\20\u00f2\n\20\f\20\16\20\u00f5\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00fd\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0111\n\24"+
		"\3\25\5\25\u0114\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\5\30\u0120\n\30\3\30\3\30\5\30\u0124\n\30\5\30\u0126\n\30\3\31\3\31\3"+
		"\31\3\31\5\31\u012c\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0134\n\31"+
		"\3\32\3\32\3\32\3\32\5\32\u013a\n\32\3\32\3\32\5\32\u013e\n\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3!\5!\u0157\n!\3!\3!\3\"\3\"\3\"\3\"\7\"\u015f"+
		"\n\"\f\"\16\"\u0162\13\"\3#\5#\u0165\n#\3#\5#\u0168\n#\3#\3#\5#\u016c"+
		"\n#\3#\5#\u016f\n#\3#\3#\3#\3#\5#\u0175\n#\3#\5#\u0178\n#\3$\3$\3$\3$"+
		"\3%\3%\3%\5%\u0181\n%\3%\5%\u0184\n%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\7\'"+
		"\u018f\n\'\f\'\16\'\u0192\13\'\3(\3(\5(\u0196\n(\3(\3(\3)\3)\3)\5)\u019d"+
		"\n)\3)\3)\3)\3)\5)\u01a3\n)\3*\3*\3+\3+\3+\5+\u01aa\n+\3+\3+\3+\7+\u01af"+
		"\n+\f+\16+\u01b2\13+\3+\5+\u01b5\n+\3,\3,\3,\3,\3,\5,\u01bc\n,\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3.\3.\5.\u01c8\n.\3.\5.\u01cb\n.\5.\u01cd\n.\3.\3.\3"+
		"/\3/\3/\7/\u01d4\n/\f/\16/\u01d7\13/\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u01e3\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u01ef\n\61\f\61\16\61\u01f2\13\61\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u01fb\n\63\3\63\5\63\u01fe\n\63\3\63\3\63\5\63\u0202"+
		"\n\63\3\64\3\64\3\64\3\64\5\64\u0208\n\64\3\64\3\64\3\64\3\64\5\64\u020e"+
		"\n\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u021c\n\67\3\67\3\67\5\67\u0220\n\67\3\67\3\67\3\67\3\67\5\67\u0226\n"+
		"\67\3\67\5\67\u0229\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u0230\n\67\3\67"+
		"\5\67\u0233\n\67\5\67\u0235\n\67\3\67\3\67\38\38\38\38\38\38\58\u023f"+
		"\n8\38\38\38\58\u0244\n8\58\u0246\n8\38\38\78\u024a\n8\f8\168\u024d\13"+
		"8\39\39\39\39\59\u0253\n9\39\39\59\u0257\n9\3:\3:\3;\3;\3<\3<\3=\5=\u0260"+
		"\n=\3=\3=\5=\u0264\n=\3=\5=\u0267\n=\3>\5>\u026a\n>\3>\3>\5>\u026e\n>"+
		"\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0295\nD\3E\3E\3E\2\3`F"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2\r\3\2\27"+
		"\30\3\2_`\4\2\"\"DD\3\2\4\6\3\2NO\3\2IJ\7\2\7\t\13\13\r\21\25\25BC\5\2"+
		"\3\3\6\6oo\3\2\63\66\5\2\63\64\66\679<\3\2bm\2\u02b9\2\u008a\3\2\2\2\4"+
		"\u009b\3\2\2\2\6\u00a8\3\2\2\2\b\u00aa\3\2\2\2\n\u00b7\3\2\2\2\f\u00ba"+
		"\3\2\2\2\16\u00c1\3\2\2\2\20\u00c9\3\2\2\2\22\u00ce\3\2\2\2\24\u00d2\3"+
		"\2\2\2\26\u00d5\3\2\2\2\30\u00e0\3\2\2\2\32\u00e4\3\2\2\2\34\u00e6\3\2"+
		"\2\2\36\u00f3\3\2\2\2 \u00fc\3\2\2\2\"\u00fe\3\2\2\2$\u0101\3\2\2\2&\u0110"+
		"\3\2\2\2(\u0113\3\2\2\2*\u0117\3\2\2\2,\u011b\3\2\2\2.\u011d\3\2\2\2\60"+
		"\u0127\3\2\2\2\62\u0135\3\2\2\2\64\u0141\3\2\2\2\66\u0145\3\2\2\28\u0149"+
		"\3\2\2\2:\u014c\3\2\2\2<\u014f\3\2\2\2>\u0152\3\2\2\2@\u0156\3\2\2\2B"+
		"\u0160\3\2\2\2D\u0164\3\2\2\2F\u0179\3\2\2\2H\u017d\3\2\2\2J\u0189\3\2"+
		"\2\2L\u018b\3\2\2\2N\u0193\3\2\2\2P\u0199\3\2\2\2R\u01a4\3\2\2\2T\u01a6"+
		"\3\2\2\2V\u01bb\3\2\2\2X\u01bd\3\2\2\2Z\u01bf\3\2\2\2\\\u01d0\3\2\2\2"+
		"^\u01d8\3\2\2\2`\u01e2\3\2\2\2b\u01f3\3\2\2\2d\u0201\3\2\2\2f\u020d\3"+
		"\2\2\2h\u020f\3\2\2\2j\u0211\3\2\2\2l\u0213\3\2\2\2n\u0245\3\2\2\2p\u024e"+
		"\3\2\2\2r\u0258\3\2\2\2t\u025a\3\2\2\2v\u025c\3\2\2\2x\u025f\3\2\2\2z"+
		"\u0269\3\2\2\2|\u026f\3\2\2\2~\u0271\3\2\2\2\u0080\u0273\3\2\2\2\u0082"+
		"\u0275\3\2\2\2\u0084\u027c\3\2\2\2\u0086\u0294\3\2\2\2\u0088\u0296\3\2"+
		"\2\2\u008a\u008c\5\4\3\2\u008b\u008d\7r\2\2\u008c\u008b\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\2\2\3\u008f\3\3\2\2\2"+
		"\u0090\u0092\7\26\2\2\u0091\u0093\t\2\2\2\u0092\u0091\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0097\3\2\2\2\u0094\u0095\7\31\2\2\u0095\u0098\7\32\2\2"+
		"\u0096\u0098\7\34\2\2\u0097\u0094\3\2\2\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\7\33\2\2\u009a\u009c\7\35\2\2"+
		"\u009b\u0090\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f"+
		"\t\3\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a3\5\6\4\2\u00a1\u00a2\7]\2\2\u00a2\u00a4\5\b\5\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\26\f\2\u00a6"+
		"\u00a7\5B\"\2\u00a7\5\3\2\2\2\u00a8\u00a9\7o\2\2\u00a9\7\3\2\2\2\u00aa"+
		"\u00af\5\n\6\2\u00ab\u00ac\7]\2\2\u00ac\u00ae\5\n\6\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\t\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b8\5\f\7\2\u00b3\u00b8\5\16\b"+
		"\2\u00b4\u00b8\5\20\t\2\u00b5\u00b8\5\22\n\2\u00b6\u00b8\5\24\13\2\u00b7"+
		"\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b6\3\2\2\2\u00b8\13\3\2\2\2\u00b9\u00bb\7D\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\7#\2\2\u00bd"+
		"\u00bf\7$\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\r\3\2\2\2"+
		"\u00c0\u00c2\t\4\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c5\7%\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\7&\2\2\u00c7\17\3\2\2\2\u00c8\u00ca\t\4\2\2"+
		"\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\7\'\2\2\u00cc\u00cd\7&\2\2\u00cd\21\3\2\2\2\u00ce\u00cf\7(\2\2\u00cf"+
		"\u00d0\7\17\2\2\u00d0\u00d1\7\\\2\2\u00d1\23\3\2\2\2\u00d2\u00d3\7\\\2"+
		"\2\u00d3\u00d4\7)\2\2\u00d4\25\3\2\2\2\u00d5\u00d6\7Z\2\2\u00d6\u00db"+
		"\5\30\r\2\u00d7\u00d8\7]\2\2\u00d8\u00da\5\30\r\2\u00d9\u00d7\3\2\2\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7[\2\2\u00df\27\3\2\2\2\u00e0"+
		"\u00e1\5\32\16\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\5\36\20\2\u00e3\31"+
		"\3\2\2\2\u00e4\u00e5\7o\2\2\u00e5\33\3\2\2\2\u00e6\u00ee\7o\2\2\u00e7"+
		"\u00e8\7Z\2\2\u00e8\u00eb\t\5\2\2\u00e9\u00ea\7]\2\2\u00ea\u00ec\t\5\2"+
		"\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef"+
		"\7[\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\35\3\2\2\2\u00f0"+
		"\u00f2\5 \21\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\37\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fd"+
		"\5\60\31\2\u00f7\u00fd\5\"\22\2\u00f8\u00fd\5$\23\2\u00f9\u00fd\5(\25"+
		"\2\u00fa\u00fd\5*\26\2\u00fb\u00fd\5.\30\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7"+
		"\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd!\3\2\2\2\u00fe\u00ff\7L\2\2\u00ff\u0100\7F\2\2\u0100"+
		"#\3\2\2\2\u0101\u0102\7H\2\2\u0102\u0103\7a\2\2\u0103\u0104\5&\24\2\u0104"+
		"\u0105\7a\2\2\u0105%\3\2\2\2\u0106\u0107\7\22\2\2\u0107\u0108\7n\2\2\u0108"+
		"\u0109\7\23\2\2\u0109\u010a\7n\2\2\u010a\u0111\7\24\2\2\u010b\u010c\7"+
		"\24\2\2\u010c\u010d\7n\2\2\u010d\u010e\7\23\2\2\u010e\u010f\7n\2\2\u010f"+
		"\u0111\7\22\2\2\u0110\u0106\3\2\2\2\u0110\u010b\3\2\2\2\u0111\'\3\2\2"+
		"\2\u0112\u0114\7L\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\t\6\2\2\u0116)\3\2\2\2\u0117\u0118\7M\2\2\u0118\u0119"+
		"\7\27\2\2\u0119\u011a\5,\27\2\u011a+\3\2\2\2\u011b\u011c\7o\2\2\u011c"+
		"-\3\2\2\2\u011d\u0125\78\2\2\u011e\u0120\7Z\2\2\u011f\u011e\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\5\\/\2\u0122\u0124\7[\2"+
		"\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u011f"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126/\3\2\2\2\u0127\u012b\7\36\2\2\u0128"+
		"\u012c\7\37\2\2\u0129\u012a\7X\2\2\u012a\u012c\7\\\2\2\u012b\u0128\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\7!\2\2\u012e\u0133\7*\2\2\u012f\u0130\7Z\2\2\u0130\u0131\5\62\32"+
		"\2\u0131\u0132\7[\2\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\61\3\2\2\2\u0135\u0136\5\64\33\2\u0136\u0139\5\66\34\2"+
		"\u0137\u013a\58\35\2\u0138\u013a\5:\36\2\u0139\u0137\3\2\2\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u013e\5> \2\u013c\u013e\5<\37\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\5@"+
		"!\2\u0140\63\3\2\2\2\u0141\u0142\7.\2\2\u0142\u0143\7G\2\2\u0143\u0144"+
		"\7\6\2\2\u0144\65\3\2\2\2\u0145\u0146\7/\2\2\u0146\u0147\7X\2\2\u0147"+
		"\u0148\7\6\2\2\u0148\67\3\2\2\2\u0149\u014a\7\60\2\2\u014a\u014b\7\6\2"+
		"\2\u014b9\3\2\2\2\u014c\u014d\7D\2\2\u014d\u014e\7\60\2\2\u014e;\3\2\2"+
		"\2\u014f\u0150\7D\2\2\u0150\u0151\7\61\2\2\u0151=\3\2\2\2\u0152\u0153"+
		"\7\61\2\2\u0153\u0154\7\6\2\2\u0154?\3\2\2\2\u0155\u0157\7D\2\2\u0156"+
		"\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7-"+
		"\2\2\u0159A\3\2\2\2\u015a\u015f\5D#\2\u015b\u015f\5F$\2\u015c\u015f\5"+
		"H%\2\u015d\u015f\5T+\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161C\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165\7T\2\2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\7U"+
		"\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\7V\2\2\u016a\u016c\5J&\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2"+
		"\2\u016c\u016e\3\2\2\2\u016d\u016f\7E\2\2\u016e\u016d\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7Z\2\2\u0171\u0172\5L\'\2\u0172"+
		"\u0174\7[\2\2\u0173\u0175\5P)\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2"+
		"\2\u0175\u0177\3\2\2\2\u0176\u0178\5N(\2\u0177\u0176\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178E\3\2\2\2\u0179\u017a\7D\2\2\u017a\u017b\7U\2\2\u017b\u017c"+
		"\7V\2\2\u017cG\3\2\2\2\u017d\u017e\7U\2\2\u017e\u0180\7Q\2\2\u017f\u0181"+
		"\7V\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0184\5J&\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2"+
		"\2\u0185\u0186\7Z\2\2\u0186\u0187\5L\'\2\u0187\u0188\7[\2\2\u0188I\3\2"+
		"\2\2\u0189\u018a\7o\2\2\u018aK\3\2\2\2\u018b\u0190\5\32\16\2\u018c\u018d"+
		"\7]\2\2\u018d\u018f\5\32\16\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2"+
		"\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191M\3\2\2\2\u0192\u0190\3"+
		"\2\2\2\u0193\u0195\7G\2\2\u0194\u0196\7D\2\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7K\2\2\u0198O\3\2\2\2\u0199"+
		"\u019a\7W\2\2\u019a\u019c\7X\2\2\u019b\u019d\t\7\2\2\u019c\u019b\3\2\2"+
		"\2\u019c\u019d\3\2\2\2\u019d\u01a2\3\2\2\2\u019e\u019f\7Z\2\2\u019f\u01a0"+
		"\5R*\2\u01a0\u01a1\7[\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019e\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3Q\3\2\2\2\u01a4\u01a5\7o\2\2\u01a5S\3\2\2\2\u01a6"+
		"\u01a7\7P\2\2\u01a7\u01a9\7X\2\2\u01a8\u01aa\7Z\2\2\u01a9\u01a8\3\2\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b0\5V,\2\u01ac\u01ad"+
		"\7]\2\2\u01ad\u01af\5V,\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b5\7[\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"U\3\2\2\2\u01b6\u01bc\5~@\2\u01b7\u01bc\5X-\2\u01b8\u01bc\5Z.\2\u01b9"+
		"\u01bc\5l\67\2\u01ba\u01bc\5\u0080A\2\u01bb\u01b6\3\2\2\2\u01bb\u01b7"+
		"\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"W\3\2\2\2\u01bd\u01be\5\32\16\2\u01beY\3\2\2\2\u01bf\u01c0\7S\2\2\u01c0"+
		"\u01c1\7Z\2\2\u01c1\u01cc\5\\/\2\u01c2\u01ca\7]\2\2\u01c3\u01c7\7?\2\2"+
		"\u01c4\u01c8\7@\2\2\u01c5\u01c6\7]\2\2\u01c6\u01c8\7A\2\2\u01c7\u01c4"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01cb\7A\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01cd\3\2"+
		"\2\2\u01cc\u01c2\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\7[\2\2\u01cf[\3\2\2\2\u01d0\u01d5\5^\60\2\u01d1\u01d2\7]\2\2\u01d2"+
		"\u01d4\5^\60\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6]\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9"+
		"\5`\61\2\u01d9_\3\2\2\2\u01da\u01db\b\61\1\2\u01db\u01e3\5f\64\2\u01dc"+
		"\u01e3\5\32\16\2\u01dd\u01e3\5d\63\2\u01de\u01e3\7\5\2\2\u01df\u01e3\7"+
		"\4\2\2\u01e0\u01e3\7\6\2\2\u01e1\u01e3\7\3\2\2\u01e2\u01da\3\2\2\2\u01e2"+
		"\u01dc\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2\u01df\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01f0\3\2\2\2\u01e4"+
		"\u01e5\f\f\2\2\u01e5\u01e6\7\7\2\2\u01e6\u01ef\5`\61\r\u01e7\u01e8\f\13"+
		"\2\2\u01e8\u01e9\7B\2\2\u01e9\u01ef\5`\61\f\u01ea\u01eb\f\n\2\2\u01eb"+
		"\u01ec\5b\62\2\u01ec\u01ed\5`\61\13\u01ed\u01ef\3\2\2\2\u01ee\u01e4\3"+
		"\2\2\2\u01ee\u01e7\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1a\3\2\2\2\u01f2\u01f0\3\2\2\2"+
		"\u01f3\u01f4\t\b\2\2\u01f4c\3\2\2\2\u01f5\u0202\5\32\16\2\u01f6\u01f7"+
		"\5h\65\2\u01f7\u01f8\7Z\2\2\u01f8\u01fa\5\32\16\2\u01f9\u01fb\7!\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fe\7o"+
		"\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0200\7[\2\2\u0200\u0202\3\2\2\2\u0201\u01f5\3\2\2\2\u0201\u01f6\3\2"+
		"\2\2\u0202e\3\2\2\2\u0203\u0204\7a\2\2\u0204\u0205\t\t\2\2\u0205\u020e"+
		"\7a\2\2\u0206\u0208\5j\66\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\7a\2\2\u020a\u020b\5\u0086D\2\u020b\u020c\7"+
		"a\2\2\u020c\u020e\3\2\2\2\u020d\u0203\3\2\2\2\u020d\u0207\3\2\2\2\u020e"+
		"g\3\2\2\2\u020f\u0210\7o\2\2\u0210i\3\2\2\2\u0211\u0212\7o\2\2\u0212k"+
		"\3\2\2\2\u0213\u0214\7R\2\2\u0214\u0215\7Z\2\2\u0215\u0216\5d\63\2\u0216"+
		"\u0228\7B\2\2\u0217\u0218\5t;\2\u0218\u021b\7\7\2\2\u0219\u021c\5v<\2"+
		"\u021a\u021c\7\t\2\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c\u021f"+
		"\3\2\2\2\u021d\u021e\7\n\2\2\u021e\u0220\5x=\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0229\3\2\2\2\u0221\u0222\7\t\2\2\u0222\u0225\7\7"+
		"\2\2\u0223\u0226\5v<\2\u0224\u0226\7\t\2\2\u0225\u0223\3\2\2\2\u0225\u0224"+
		"\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0229\5n8\2\u0228\u0217\3\2\2\2\u0228"+
		"\u0221\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u0234\3\2\2\2\u022a\u0232\7]"+
		"\2\2\u022b\u022f\7>\2\2\u022c\u0230\7@\2\2\u022d\u022e\7]\2\2\u022e\u0230"+
		"\7A\2\2\u022f\u022c\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u0233\7A\2\2\u0232\u022b\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0235\3\2"+
		"\2\2\u0234\u022a\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0237\7[\2\2\u0237m\3\2\2\2\u0238\u0239\5t;\2\u0239\u023a\7\7\2\2\u023a"+
		"\u023b\5v<\2\u023b\u023e\3\2\2\2\u023c\u023d\7\n\2\2\u023d\u023f\5x=\2"+
		"\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0246\3\2\2\2\u0240\u0243"+
		"\7\t\2\2\u0241\u0242\7\7\2\2\u0242\u0244\5v<\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0238\3\2\2\2\u0245\u0240\3\2"+
		"\2\2\u0246\u024b\3\2\2\2\u0247\u0248\7]\2\2\u0248\u024a\5p9\2\u0249\u0247"+
		"\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"o\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u024f\5t;\2\u024f\u0252\7\7\2\2\u0250"+
		"\u0253\5v<\2\u0251\u0253\7\t\2\2\u0252\u0250\3\2\2\2\u0252\u0251\3\2\2"+
		"\2\u0253\u0256\3\2\2\2\u0254\u0255\7\n\2\2\u0255\u0257\5x=\2\u0256\u0254"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257q\3\2\2\2\u0258\u0259\5`\61\2\u0259"+
		"s\3\2\2\2\u025a\u025b\5`\61\2\u025bu\3\2\2\2\u025c\u025d\5`\61\2\u025d"+
		"w\3\2\2\2\u025e\u0260\7\f\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2"+
		"\u0260\u0261\3\2\2\2\u0261\u0263\5z>\2\u0262\u0264\5f\64\2\u0263\u0262"+
		"\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0267\5|?\2\u0266"+
		"\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267y\3\2\2\2\u0268\u026a\7a\2\2\u0269"+
		"\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\7\6"+
		"\2\2\u026c\u026e\7a\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"{\3\2\2\2\u026f\u0270\t\n\2\2\u0270}\3\2\2\2\u0271\u0272\5`\61\2\u0272"+
		"\177\3\2\2\2\u0273\u0274\5\u0082B\2\u0274\u0081\3\2\2\2\u0275\u0276\7"+
		"\62\2\2\u0276\u0277\7Z\2\2\u0277\u0278\5\u0084C\2\u0278\u0279\7=\2\2\u0279"+
		"\u027a\5`\61\2\u027a\u027b\7[\2\2\u027b\u0083\3\2\2\2\u027c\u027d\t\13"+
		"\2\2\u027d\u0085\3\2\2\2\u027e\u027f\7\4\2\2\u027f\u0280\7n\2\2\u0280"+
		"\u0281\7\5\2\2\u0281\u0282\7n\2\2\u0282\u0295\7\5\2\2\u0283\u0284\7\5"+
		"\2\2\u0284\u0285\7n\2\2\u0285\u0286\5\u0088E\2\u0286\u0287\7n\2\2\u0287"+
		"\u0288\7\5\2\2\u0288\u0295\3\2\2\2\u0289\u028a\7\5\2\2\u028a\u028b\7n"+
		"\2\2\u028b\u028c\5\u0088E\2\u028c\u028d\7n\2\2\u028d\u028e\7\4\2\2\u028e"+
		"\u0295\3\2\2\2\u028f\u0290\7\5\2\2\u0290\u0291\7n\2\2\u0291\u0292\7\5"+
		"\2\2\u0292\u0293\7n\2\2\u0293\u0295\7\4\2\2\u0294\u027e\3\2\2\2\u0294"+
		"\u0283\3\2\2\2\u0294\u0289\3\2\2\2\u0294\u028f\3\2\2\2\u0295\u0087\3\2"+
		"\2\2\u0296\u0297\t\f\2\2\u0297\u0089\3\2\2\2O\u008c\u0092\u0097\u009b"+
		"\u009e\u00a3\u00af\u00b7\u00ba\u00be\u00c1\u00c4\u00c9\u00db\u00eb\u00ee"+
		"\u00f3\u00fc\u0110\u0113\u011f\u0123\u0125\u012b\u0133\u0139\u013d\u0156"+
		"\u015e\u0160\u0164\u0167\u016b\u016e\u0174\u0177\u0180\u0183\u0190\u0195"+
		"\u019c\u01a2\u01a9\u01b0\u01b4\u01bb\u01c7\u01ca\u01cc\u01d5\u01e2\u01ee"+
		"\u01f0\u01fa\u01fd\u0201\u0207\u020d\u021b\u021f\u0225\u0228\u022f\u0232"+
		"\u0234\u023e\u0243\u0245\u024b\u0252\u0256\u025f\u0263\u0266\u0269\u026d"+
		"\u0294";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}