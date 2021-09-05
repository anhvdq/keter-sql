// Generated from /Users/pinkeraw/Projects/keter-sql/keter-parser/src/main/antlr4/dev/keter/parser/TrinoSqlBase.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrinoSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ADD=17, 
		ADMIN=18, AFTER=19, ALL=20, ALTER=21, ANALYZE=22, AND=23, ANY=24, ARRAY=25, 
		AS=26, ASC=27, AT=28, AUTHORIZATION=29, BERNOULLI=30, BETWEEN=31, BY=32, 
		CALL=33, CASCADE=34, CASE=35, CAST=36, CATALOGS=37, COLUMN=38, COLUMNS=39, 
		COMMENT=40, COMMIT=41, COMMITTED=42, CONSTRAINT=43, CREATE=44, CROSS=45, 
		CUBE=46, CURRENT=47, CURRENT_CATALOG=48, CURRENT_DATE=49, CURRENT_PATH=50, 
		CURRENT_ROLE=51, CURRENT_SCHEMA=52, CURRENT_TIME=53, CURRENT_TIMESTAMP=54, 
		CURRENT_USER=55, DATA=56, DATE=57, DAY=58, DEALLOCATE=59, DEFINER=60, 
		DELETE=61, DESC=62, DESCRIBE=63, DEFINE=64, DISTINCT=65, DISTRIBUTED=66, 
		DOUBLE=67, DROP=68, ELSE=69, EMPTY=70, END=71, ESCAPE=72, EXCEPT=73, EXCLUDING=74, 
		EXECUTE=75, EXISTS=76, EXPLAIN=77, EXTRACT=78, FALSE=79, FETCH=80, FILTER=81, 
		FINAL=82, FIRST=83, FOLLOWING=84, FOR=85, FORMAT=86, FROM=87, FULL=88, 
		FUNCTIONS=89, GRANT=90, GRANTED=91, GRANTS=92, GRAPHVIZ=93, GROUP=94, 
		GROUPING=95, GROUPS=96, HAVING=97, HOUR=98, IF=99, IGNORE=100, IN=101, 
		INCLUDING=102, INITIAL=103, INNER=104, INPUT=105, INSERT=106, INTERSECT=107, 
		INTERVAL=108, INTO=109, INVOKER=110, IO=111, IS=112, ISOLATION=113, JOIN=114, 
		JSON=115, LAST=116, LATERAL=117, LEFT=118, LEVEL=119, LIKE=120, LIMIT=121, 
		LOCALTIME=122, LOCALTIMESTAMP=123, LOGICAL=124, MAP=125, MATCH=126, MATCHED=127, 
		MATCHES=128, MATCH_RECOGNIZE=129, MATERIALIZED=130, MEASURES=131, MERGE=132, 
		MINUTE=133, MONTH=134, NATURAL=135, NEXT=136, NFC=137, NFD=138, NFKC=139, 
		NFKD=140, NO=141, NONE=142, NORMALIZE=143, NOT=144, NULL=145, NULLIF=146, 
		NULLS=147, OFFSET=148, OMIT=149, ON=150, ONE=151, ONLY=152, OPTION=153, 
		OR=154, ORDER=155, ORDINALITY=156, OUTER=157, OUTPUT=158, OVER=159, PARTITION=160, 
		PARTITIONS=161, PAST=162, PATH=163, PATTERN=164, PER=165, PERMUTE=166, 
		POSITION=167, PRECEDING=168, PRECISION=169, PREPARE=170, PRIVILEGES=171, 
		PROPERTIES=172, RANGE=173, READ=174, RECURSIVE=175, REFRESH=176, RENAME=177, 
		REPEATABLE=178, REPLACE=179, RESET=180, RESPECT=181, RESTRICT=182, REVOKE=183, 
		RIGHT=184, ROLE=185, ROLES=186, ROLLBACK=187, ROLLUP=188, ROW=189, ROWS=190, 
		RUNNING=191, SCHEMA=192, SCHEMAS=193, SECOND=194, SECURITY=195, SEEK=196, 
		SELECT=197, SERIALIZABLE=198, SESSION=199, SET=200, SETS=201, SHOW=202, 
		SOME=203, START=204, STATS=205, SUBSET=206, SUBSTRING=207, SYSTEM=208, 
		TABLE=209, TABLES=210, TABLESAMPLE=211, TEXT=212, THEN=213, TIES=214, 
		TIME=215, TIMESTAMP=216, TO=217, TRANSACTION=218, TRUE=219, TRY_CAST=220, 
		TYPE=221, UESCAPE=222, UNBOUNDED=223, UNCOMMITTED=224, UNION=225, UNMATCHED=226, 
		UNNEST=227, UPDATE=228, USE=229, USER=230, USING=231, VALIDATE=232, VALUES=233, 
		VERBOSE=234, VIEW=235, WHEN=236, WHERE=237, WINDOW=238, WITH=239, WITHOUT=240, 
		WORK=241, WRITE=242, YEAR=243, ZONE=244, EQ=245, NEQ=246, LT=247, LTE=248, 
		GT=249, GTE=250, PLUS=251, MINUS=252, ASTERISK=253, SLASH=254, PERCENT=255, 
		CONCAT=256, QUESTION_MARK=257, STRING=258, UNICODE_STRING=259, BINARY_LITERAL=260, 
		INTEGER_VALUE=261, DECIMAL_VALUE=262, DOUBLE_VALUE=263, IDENTIFIER=264, 
		DIGIT_IDENTIFIER=265, QUOTED_IDENTIFIER=266, BACKQUOTED_IDENTIFIER=267, 
		SIMPLE_COMMENT=268, BRACKETED_COMMENT=269, WS=270, UNRECOGNIZED=271, DELIMITER=272;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standalonePathSpecification = 2, 
		RULE_standaloneType = 3, RULE_standaloneRowPattern = 4, RULE_statement = 5, 
		RULE_query = 6, RULE_with = 7, RULE_tableElement = 8, RULE_columnDefinition = 9, 
		RULE_likeClause = 10, RULE_properties = 11, RULE_property = 12, RULE_queryNoWith = 13, 
		RULE_limitRowCount = 14, RULE_rowCount = 15, RULE_queryTerm = 16, RULE_queryPrimary = 17, 
		RULE_sortItem = 18, RULE_querySpecification = 19, RULE_groupBy = 20, RULE_groupingElement = 21, 
		RULE_groupingSet = 22, RULE_windowDefinition = 23, RULE_windowSpecification = 24, 
		RULE_namedQuery = 25, RULE_setQuantifier = 26, RULE_selectItem = 27, RULE_relation = 28, 
		RULE_joinType = 29, RULE_joinCriteria = 30, RULE_sampledRelation = 31, 
		RULE_sampleType = 32, RULE_patternRecognition = 33, RULE_measureDefinition = 34, 
		RULE_rowsPerMatch = 35, RULE_emptyMatchHandling = 36, RULE_skipTo = 37, 
		RULE_subsetDefinition = 38, RULE_variableDefinition = 39, RULE_aliasedRelation = 40, 
		RULE_columnAliases = 41, RULE_relationPrimary = 42, RULE_expression = 43, 
		RULE_booleanExpression = 44, RULE_predicate = 45, RULE_valueExpression = 46, 
		RULE_primaryExpression = 47, RULE_processingMode = 48, RULE_nullTreatment = 49, 
		RULE_string = 50, RULE_timeZoneSpecifier = 51, RULE_comparisonOperator = 52, 
		RULE_comparisonQuantifier = 53, RULE_booleanValue = 54, RULE_interval = 55, 
		RULE_intervalField = 56, RULE_normalForm = 57, RULE_type = 58, RULE_rowField = 59, 
		RULE_typeParameter = 60, RULE_whenClause = 61, RULE_filter = 62, RULE_mergeCase = 63, 
		RULE_over = 64, RULE_windowFrame = 65, RULE_frameBound = 66, RULE_rowPattern = 67, 
		RULE_patternPrimary = 68, RULE_patternQuantifier = 69, RULE_updateAssignment = 70, 
		RULE_explainOption = 71, RULE_transactionMode = 72, RULE_levelOfIsolation = 73, 
		RULE_callArgument = 74, RULE_pathElement = 75, RULE_pathSpecification = 76, 
		RULE_privilege = 77, RULE_qualifiedName = 78, RULE_grantor = 79, RULE_principal = 80, 
		RULE_roles = 81, RULE_identifier = 82, RULE_number = 83, RULE_nonReserved = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "standaloneExpression", "standalonePathSpecification", 
			"standaloneType", "standaloneRowPattern", "statement", "query", "with", 
			"tableElement", "columnDefinition", "likeClause", "properties", "property", 
			"queryNoWith", "limitRowCount", "rowCount", "queryTerm", "queryPrimary", 
			"sortItem", "querySpecification", "groupBy", "groupingElement", "groupingSet", 
			"windowDefinition", "windowSpecification", "namedQuery", "setQuantifier", 
			"selectItem", "relation", "joinType", "joinCriteria", "sampledRelation", 
			"sampleType", "patternRecognition", "measureDefinition", "rowsPerMatch", 
			"emptyMatchHandling", "skipTo", "subsetDefinition", "variableDefinition", 
			"aliasedRelation", "columnAliases", "relationPrimary", "expression", 
			"booleanExpression", "predicate", "valueExpression", "primaryExpression", 
			"processingMode", "nullTreatment", "string", "timeZoneSpecifier", "comparisonOperator", 
			"comparisonQuantifier", "booleanValue", "interval", "intervalField", 
			"normalForm", "type", "rowField", "typeParameter", "whenClause", "filter", 
			"mergeCase", "over", "windowFrame", "frameBound", "rowPattern", "patternPrimary", 
			"patternQuantifier", "updateAssignment", "explainOption", "transactionMode", 
			"levelOfIsolation", "callArgument", "pathElement", "pathSpecification", 
			"privilege", "qualifiedName", "grantor", "principal", "roles", "identifier", 
			"number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "','", "'SKIP'", "'->'", "'['", "']'", "'|'", 
			"'^'", "'$'", "'{-'", "'-}'", "'{'", "'}'", "'=>'", "'ADD'", "'ADMIN'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", "'ARRAY'", 
			"'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BERNOULLI'", "'BETWEEN'", 
			"'BY'", "'CALL'", "'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", "'COLUMN'", 
			"'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", 
			"'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_CATALOG'", "'CURRENT_DATE'", 
			"'CURRENT_PATH'", "'CURRENT_ROLE'", "'CURRENT_SCHEMA'", "'CURRENT_TIME'", 
			"'CURRENT_TIMESTAMP'", "'CURRENT_USER'", "'DATA'", "'DATE'", "'DAY'", 
			"'DEALLOCATE'", "'DEFINER'", "'DELETE'", "'DESC'", "'DESCRIBE'", "'DEFINE'", 
			"'DISTINCT'", "'DISTRIBUTED'", "'DOUBLE'", "'DROP'", "'ELSE'", "'EMPTY'", 
			"'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", "'EXISTS'", 
			"'EXPLAIN'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FILTER'", "'FINAL'", 
			"'FIRST'", "'FOLLOWING'", "'FOR'", "'FORMAT'", "'FROM'", "'FULL'", "'FUNCTIONS'", 
			"'GRANT'", "'GRANTED'", "'GRANTS'", "'GRAPHVIZ'", "'GROUP'", "'GROUPING'", 
			"'GROUPS'", "'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IN'", "'INCLUDING'", 
			"'INITIAL'", "'INNER'", "'INPUT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'INVOKER'", "'IO'", "'IS'", "'ISOLATION'", "'JOIN'", "'JSON'", 
			"'LAST'", "'LATERAL'", "'LEFT'", "'LEVEL'", "'LIKE'", "'LIMIT'", "'LOCALTIME'", 
			"'LOCALTIMESTAMP'", "'LOGICAL'", "'MAP'", "'MATCH'", "'MATCHED'", "'MATCHES'", 
			"'MATCH_RECOGNIZE'", "'MATERIALIZED'", "'MEASURES'", "'MERGE'", "'MINUTE'", 
			"'MONTH'", "'NATURAL'", "'NEXT'", "'NFC'", "'NFD'", "'NFKC'", "'NFKD'", 
			"'NO'", "'NONE'", "'NORMALIZE'", "'NOT'", "'NULL'", "'NULLIF'", "'NULLS'", 
			"'OFFSET'", "'OMIT'", "'ON'", "'ONE'", "'ONLY'", "'OPTION'", "'OR'", 
			"'ORDER'", "'ORDINALITY'", "'OUTER'", "'OUTPUT'", "'OVER'", "'PARTITION'", 
			"'PARTITIONS'", "'PAST'", "'PATH'", "'PATTERN'", "'PER'", "'PERMUTE'", 
			"'POSITION'", "'PRECEDING'", "'PRECISION'", "'PREPARE'", "'PRIVILEGES'", 
			"'PROPERTIES'", "'RANGE'", "'READ'", "'RECURSIVE'", "'REFRESH'", "'RENAME'", 
			"'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", 
			"'RIGHT'", "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
			"'RUNNING'", "'SCHEMA'", "'SCHEMAS'", "'SECOND'", "'SECURITY'", "'SEEK'", 
			"'SELECT'", "'SERIALIZABLE'", "'SESSION'", "'SET'", "'SETS'", "'SHOW'", 
			"'SOME'", "'START'", "'STATS'", "'SUBSET'", "'SUBSTRING'", "'SYSTEM'", 
			"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TEXT'", "'THEN'", "'TIES'", 
			"'TIME'", "'TIMESTAMP'", "'TO'", "'TRANSACTION'", "'TRUE'", "'TRY_CAST'", 
			"'TYPE'", "'UESCAPE'", "'UNBOUNDED'", "'UNCOMMITTED'", "'UNION'", "'UNMATCHED'", 
			"'UNNEST'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALIDATE'", "'VALUES'", 
			"'VERBOSE'", "'VIEW'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'WITHOUT'", 
			"'WORK'", "'WRITE'", "'YEAR'", "'ZONE'", "'='", null, "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ADD", "ADMIN", "AFTER", "ALL", "ALTER", 
			"ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", 
			"BERNOULLI", "BETWEEN", "BY", "CALL", "CASCADE", "CASE", "CAST", "CATALOGS", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMMITTED", "CONSTRAINT", 
			"CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_CATALOG", "CURRENT_DATE", 
			"CURRENT_PATH", "CURRENT_ROLE", "CURRENT_SCHEMA", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURRENT_USER", "DATA", "DATE", "DAY", "DEALLOCATE", "DEFINER", "DELETE", 
			"DESC", "DESCRIBE", "DEFINE", "DISTINCT", "DISTRIBUTED", "DOUBLE", "DROP", 
			"ELSE", "EMPTY", "END", "ESCAPE", "EXCEPT", "EXCLUDING", "EXECUTE", "EXISTS", 
			"EXPLAIN", "EXTRACT", "FALSE", "FETCH", "FILTER", "FINAL", "FIRST", "FOLLOWING", 
			"FOR", "FORMAT", "FROM", "FULL", "FUNCTIONS", "GRANT", "GRANTED", "GRANTS", 
			"GRAPHVIZ", "GROUP", "GROUPING", "GROUPS", "HAVING", "HOUR", "IF", "IGNORE", 
			"IN", "INCLUDING", "INITIAL", "INNER", "INPUT", "INSERT", "INTERSECT", 
			"INTERVAL", "INTO", "INVOKER", "IO", "IS", "ISOLATION", "JOIN", "JSON", 
			"LAST", "LATERAL", "LEFT", "LEVEL", "LIKE", "LIMIT", "LOCALTIME", "LOCALTIMESTAMP", 
			"LOGICAL", "MAP", "MATCH", "MATCHED", "MATCHES", "MATCH_RECOGNIZE", "MATERIALIZED", 
			"MEASURES", "MERGE", "MINUTE", "MONTH", "NATURAL", "NEXT", "NFC", "NFD", 
			"NFKC", "NFKD", "NO", "NONE", "NORMALIZE", "NOT", "NULL", "NULLIF", "NULLS", 
			"OFFSET", "OMIT", "ON", "ONE", "ONLY", "OPTION", "OR", "ORDER", "ORDINALITY", 
			"OUTER", "OUTPUT", "OVER", "PARTITION", "PARTITIONS", "PAST", "PATH", 
			"PATTERN", "PER", "PERMUTE", "POSITION", "PRECEDING", "PRECISION", "PREPARE", 
			"PRIVILEGES", "PROPERTIES", "RANGE", "READ", "RECURSIVE", "REFRESH", 
			"RENAME", "REPEATABLE", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", 
			"RIGHT", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "RUNNING", 
			"SCHEMA", "SCHEMAS", "SECOND", "SECURITY", "SEEK", "SELECT", "SERIALIZABLE", 
			"SESSION", "SET", "SETS", "SHOW", "SOME", "START", "STATS", "SUBSET", 
			"SUBSTRING", "SYSTEM", "TABLE", "TABLES", "TABLESAMPLE", "TEXT", "THEN", 
			"TIES", "TIME", "TIMESTAMP", "TO", "TRANSACTION", "TRUE", "TRY_CAST", 
			"TYPE", "UESCAPE", "UNBOUNDED", "UNCOMMITTED", "UNION", "UNMATCHED", 
			"UNNEST", "UPDATE", "USE", "USER", "USING", "VALIDATE", "VALUES", "VERBOSE", 
			"VIEW", "WHEN", "WHERE", "WINDOW", "WITH", "WITHOUT", "WORK", "WRITE", 
			"YEAR", "ZONE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "CONCAT", "QUESTION_MARK", "STRING", 
			"UNICODE_STRING", "BINARY_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"DOUBLE_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED", "DELIMITER"
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
	public String getGrammarFileName() { return "TrinoSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrinoSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			statement();
			setState(171);
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

	public static class StandaloneExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public StandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneExpression; }
	}

	public final StandaloneExpressionContext standaloneExpression() throws RecognitionException {
		StandaloneExpressionContext _localctx = new StandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_standaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			expression();
			setState(174);
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

	public static class StandalonePathSpecificationContext extends ParserRuleContext {
		public PathSpecificationContext pathSpecification() {
			return getRuleContext(PathSpecificationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public StandalonePathSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePathSpecification; }
	}

	public final StandalonePathSpecificationContext standalonePathSpecification() throws RecognitionException {
		StandalonePathSpecificationContext _localctx = new StandalonePathSpecificationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standalonePathSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			pathSpecification();
			setState(177);
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

	public static class StandaloneTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public StandaloneTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneType; }
	}

	public final StandaloneTypeContext standaloneType() throws RecognitionException {
		StandaloneTypeContext _localctx = new StandaloneTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_standaloneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			type(0);
			setState(180);
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

	public static class StandaloneRowPatternContext extends ParserRuleContext {
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TrinoSqlBaseParser.EOF, 0); }
		public StandaloneRowPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneRowPattern; }
	}

	public final StandaloneRowPatternContext standaloneRowPattern() throws RecognitionException {
		StandaloneRowPatternContext _localctx = new StandaloneRowPatternContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_standaloneRowPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			rowPattern(0);
			setState(183);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(TrinoSqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(TrinoSqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(TrinoSqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(TrinoSqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropMaterializedViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public DropMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(TrinoSqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(TrinoSqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(TrinoSqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(TrinoSqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(TrinoSqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(TrinoSqlBaseParser.ADMIN, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public CreateRoleContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(TrinoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TrinoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(TrinoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(TrinoSqlBaseParser.EXISTS, i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(TrinoSqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetViewAuthorizationContext extends StatementContext {
		public QualifiedNameContext from;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SetViewAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(TrinoSqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowRolesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode ROLES() { return getToken(TrinoSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(TrinoSqlBaseParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public ShowRolesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class MergeContext extends StatementContext {
		public TerminalNode MERGE() { return getToken(TrinoSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(TrinoSqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(TrinoSqlBaseParser.USING, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<MergeCaseContext> mergeCase() {
			return getRuleContexts(MergeCaseContext.class);
		}
		public MergeCaseContext mergeCase(int i) {
			return getRuleContext(MergeCaseContext.class,i);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public MergeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(TrinoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TrinoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(TrinoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(TrinoSqlBaseParser.EXISTS, i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CommentColumnContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(TrinoSqlBaseParser.IS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public CommentColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RevokeRolesContext extends StatementContext {
		public TerminalNode REVOKE() { return getToken(TrinoSqlBaseParser.REVOKE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode ADMIN() { return getToken(TrinoSqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public TerminalNode GRANTED() { return getToken(TrinoSqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public RevokeRolesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowColumnsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(TrinoSqlBaseParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public TerminalNode DESCRIBE() { return getToken(TrinoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(TrinoSqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowRoleGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public TerminalNode GRANTS() { return getToken(TrinoSqlBaseParser.GRANTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public ShowRoleGrantsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(TrinoSqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public List<TerminalNode> IF() { return getTokens(TrinoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TrinoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(TrinoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(TrinoSqlBaseParser.EXISTS, i);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(TrinoSqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(TrinoSqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(TrinoSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(TrinoSqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowSessionContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(TrinoSqlBaseParser.SESSION, 0); }
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(TrinoSqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(TrinoSqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(TrinoSqlBaseParser.ANALYZE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetRoleContext extends StatementContext {
		public IdentifierContext role;
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(TrinoSqlBaseParser.NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(TrinoSqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(TrinoSqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(TrinoSqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetTableAuthorizationContext extends StatementContext {
		public QualifiedNameContext tableName;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SetTableAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(TrinoSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(TrinoSqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(TrinoSqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(TrinoSqlBaseParser.WITH, i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(TrinoSqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(TrinoSqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(TrinoSqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowCreateSchemaContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RevokeContext extends StatementContext {
		public PrincipalContext grantee;
		public TerminalNode REVOKE() { return getToken(TrinoSqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(TrinoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(TrinoSqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class UpdateContext extends StatementContext {
		public BooleanExpressionContext where;
		public TerminalNode UPDATE() { return getToken(TrinoSqlBaseParser.UPDATE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public List<UpdateAssignmentContext> updateAssignment() {
			return getRuleContexts(UpdateAssignmentContext.class);
		}
		public UpdateAssignmentContext updateAssignment(int i) {
			return getRuleContext(UpdateAssignmentContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(TrinoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public UpdateContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(TrinoSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(TrinoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(TrinoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(TrinoSqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(TrinoSqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateMaterializedViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(TrinoSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(TrinoSqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(TrinoSqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(TrinoSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(TrinoSqlBaseParser.REPLACE, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode SECURITY() { return getToken(TrinoSqlBaseParser.SECURITY, 0); }
		public TerminalNode DEFINER() { return getToken(TrinoSqlBaseParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(TrinoSqlBaseParser.INVOKER, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(TrinoSqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(TrinoSqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetSchemaAuthorizationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SetSchemaAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(TrinoSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(TrinoSqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CommentTableContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(TrinoSqlBaseParser.IS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RenameViewContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(TrinoSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SetPathContext extends StatementContext {
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode PATH() { return getToken(TrinoSqlBaseParser.PATH, 0); }
		public PathSpecificationContext pathSpecification() {
			return getRuleContext(PathSpecificationContext.class,0);
		}
		public SetPathContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class GrantRolesContext extends StatementContext {
		public TerminalNode GRANT() { return getToken(TrinoSqlBaseParser.GRANT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(TrinoSqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode GRANTED() { return getToken(TrinoSqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public GrantRolesContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(TrinoSqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class RefreshMaterializedViewContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(TrinoSqlBaseParser.REFRESH, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public RefreshMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowCreateMaterializedViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(TrinoSqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ShowFunctionsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(TrinoSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(TrinoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(TrinoSqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class GrantContext extends StatementContext {
		public PrincipalContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(TrinoSqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(TrinoSqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(TrinoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(USE);
				setState(187);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(USE);
				setState(189);
				((UseContext)_localctx).catalog = identifier();
				setState(190);
				match(T__0);
				setState(191);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(CREATE);
				setState(194);
				match(SCHEMA);
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(195);
					match(IF);
					setState(196);
					match(NOT);
					setState(197);
					match(EXISTS);
					}
					break;
				}
				setState(200);
				qualifiedName();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTHORIZATION) {
					{
					setState(201);
					match(AUTHORIZATION);
					setState(202);
					principal();
					}
				}

				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(205);
					match(WITH);
					setState(206);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(DROP);
				setState(210);
				match(SCHEMA);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(211);
					match(IF);
					setState(212);
					match(EXISTS);
					}
					break;
				}
				setState(215);
				qualifiedName();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(216);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				match(ALTER);
				setState(220);
				match(SCHEMA);
				setState(221);
				qualifiedName();
				setState(222);
				match(RENAME);
				setState(223);
				match(TO);
				setState(224);
				identifier();
				}
				break;
			case 7:
				_localctx = new SetSchemaAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				match(ALTER);
				setState(227);
				match(SCHEMA);
				setState(228);
				qualifiedName();
				setState(229);
				match(SET);
				setState(230);
				match(AUTHORIZATION);
				setState(231);
				principal();
				}
				break;
			case 8:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(233);
				match(CREATE);
				setState(234);
				match(TABLE);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(235);
					match(IF);
					setState(236);
					match(NOT);
					setState(237);
					match(EXISTS);
					}
					break;
				}
				setState(240);
				qualifiedName();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(241);
					columnAliases();
					}
				}

				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(244);
					match(COMMENT);
					setState(245);
					string();
					}
				}

				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(248);
					match(WITH);
					setState(249);
					properties();
					}
				}

				setState(252);
				match(AS);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(253);
					query();
					}
					break;
				case 2:
					{
					setState(254);
					match(T__1);
					setState(255);
					query();
					setState(256);
					match(T__2);
					}
					break;
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(260);
					match(WITH);
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(261);
						match(NO);
						}
					}

					setState(264);
					match(DATA);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				match(CREATE);
				setState(268);
				match(TABLE);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(269);
					match(IF);
					setState(270);
					match(NOT);
					setState(271);
					match(EXISTS);
					}
					break;
				}
				setState(274);
				qualifiedName();
				setState(275);
				match(T__1);
				setState(276);
				tableElement();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(277);
					match(T__3);
					setState(278);
					tableElement();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(T__2);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(285);
					match(COMMENT);
					setState(286);
					string();
					}
				}

				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(289);
					match(WITH);
					setState(290);
					properties();
					}
				}

				}
				break;
			case 10:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				match(DROP);
				setState(294);
				match(TABLE);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(295);
					match(IF);
					setState(296);
					match(EXISTS);
					}
					break;
				}
				setState(299);
				qualifiedName();
				}
				break;
			case 11:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(300);
				match(INSERT);
				setState(301);
				match(INTO);
				setState(302);
				qualifiedName();
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(303);
					columnAliases();
					}
					break;
				}
				setState(306);
				query();
				}
				break;
			case 12:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(308);
				match(DELETE);
				setState(309);
				match(FROM);
				setState(310);
				qualifiedName();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(311);
					match(WHERE);
					setState(312);
					booleanExpression(0);
					}
				}

				}
				break;
			case 13:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(315);
				match(ALTER);
				setState(316);
				match(TABLE);
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(317);
					match(IF);
					setState(318);
					match(EXISTS);
					}
					break;
				}
				setState(321);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(322);
				match(RENAME);
				setState(323);
				match(TO);
				setState(324);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 14:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(326);
				match(COMMENT);
				setState(327);
				match(ON);
				setState(328);
				match(TABLE);
				setState(329);
				qualifiedName();
				setState(330);
				match(IS);
				setState(333);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(331);
					string();
					}
					break;
				case NULL:
					{
					setState(332);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new CommentColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(335);
				match(COMMENT);
				setState(336);
				match(ON);
				setState(337);
				match(COLUMN);
				setState(338);
				qualifiedName();
				setState(339);
				match(IS);
				setState(342);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(340);
					string();
					}
					break;
				case NULL:
					{
					setState(341);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 16:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(344);
				match(ALTER);
				setState(345);
				match(TABLE);
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(346);
					match(IF);
					setState(347);
					match(EXISTS);
					}
					break;
				}
				setState(350);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(351);
				match(RENAME);
				setState(352);
				match(COLUMN);
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(353);
					match(IF);
					setState(354);
					match(EXISTS);
					}
					break;
				}
				setState(357);
				((RenameColumnContext)_localctx).from = identifier();
				setState(358);
				match(TO);
				setState(359);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 17:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(361);
				match(ALTER);
				setState(362);
				match(TABLE);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(363);
					match(IF);
					setState(364);
					match(EXISTS);
					}
					break;
				}
				setState(367);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(368);
				match(DROP);
				setState(369);
				match(COLUMN);
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(370);
					match(IF);
					setState(371);
					match(EXISTS);
					}
					break;
				}
				setState(374);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 18:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(376);
				match(ALTER);
				setState(377);
				match(TABLE);
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(378);
					match(IF);
					setState(379);
					match(EXISTS);
					}
					break;
				}
				setState(382);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(383);
				match(ADD);
				setState(384);
				match(COLUMN);
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(385);
					match(IF);
					setState(386);
					match(NOT);
					setState(387);
					match(EXISTS);
					}
					break;
				}
				setState(390);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 19:
				_localctx = new SetTableAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(392);
				match(ALTER);
				setState(393);
				match(TABLE);
				setState(394);
				((SetTableAuthorizationContext)_localctx).tableName = qualifiedName();
				setState(395);
				match(SET);
				setState(396);
				match(AUTHORIZATION);
				setState(397);
				principal();
				}
				break;
			case 20:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(399);
				match(ANALYZE);
				setState(400);
				qualifiedName();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(401);
					match(WITH);
					setState(402);
					properties();
					}
				}

				}
				break;
			case 21:
				_localctx = new CreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(405);
				match(CREATE);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(406);
					match(OR);
					setState(407);
					match(REPLACE);
					}
				}

				setState(410);
				match(MATERIALIZED);
				setState(411);
				match(VIEW);
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(412);
					match(IF);
					setState(413);
					match(NOT);
					setState(414);
					match(EXISTS);
					}
					break;
				}
				setState(417);
				qualifiedName();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(418);
					match(COMMENT);
					setState(419);
					string();
					}
				}

				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(422);
					match(WITH);
					setState(423);
					properties();
					}
				}

				setState(426);
				match(AS);
				setState(427);
				query();
				}
				break;
			case 22:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(429);
				match(CREATE);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(430);
					match(OR);
					setState(431);
					match(REPLACE);
					}
				}

				setState(434);
				match(VIEW);
				setState(435);
				qualifiedName();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(436);
					match(COMMENT);
					setState(437);
					string();
					}
				}

				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECURITY) {
					{
					setState(440);
					match(SECURITY);
					setState(441);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(444);
				match(AS);
				setState(445);
				query();
				}
				break;
			case 23:
				_localctx = new RefreshMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(447);
				match(REFRESH);
				setState(448);
				match(MATERIALIZED);
				setState(449);
				match(VIEW);
				setState(450);
				qualifiedName();
				}
				break;
			case 24:
				_localctx = new DropMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(451);
				match(DROP);
				setState(452);
				match(MATERIALIZED);
				setState(453);
				match(VIEW);
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(454);
					match(IF);
					setState(455);
					match(EXISTS);
					}
					break;
				}
				setState(458);
				qualifiedName();
				}
				break;
			case 25:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(459);
				match(DROP);
				setState(460);
				match(VIEW);
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(461);
					match(IF);
					setState(462);
					match(EXISTS);
					}
					break;
				}
				setState(465);
				qualifiedName();
				}
				break;
			case 26:
				_localctx = new RenameViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(466);
				match(ALTER);
				setState(467);
				match(VIEW);
				setState(468);
				((RenameViewContext)_localctx).from = qualifiedName();
				setState(469);
				match(RENAME);
				setState(470);
				match(TO);
				setState(471);
				((RenameViewContext)_localctx).to = qualifiedName();
				}
				break;
			case 27:
				_localctx = new SetViewAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(473);
				match(ALTER);
				setState(474);
				match(VIEW);
				setState(475);
				((SetViewAuthorizationContext)_localctx).from = qualifiedName();
				setState(476);
				match(SET);
				setState(477);
				match(AUTHORIZATION);
				setState(478);
				principal();
				}
				break;
			case 28:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(480);
				match(CALL);
				setState(481);
				qualifiedName();
				setState(482);
				match(T__1);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)) | (1L << (MATCHED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (RUNNING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (QUESTION_MARK - 257)) | (1L << (STRING - 257)) | (1L << (UNICODE_STRING - 257)) | (1L << (BINARY_LITERAL - 257)) | (1L << (INTEGER_VALUE - 257)) | (1L << (DECIMAL_VALUE - 257)) | (1L << (DOUBLE_VALUE - 257)) | (1L << (IDENTIFIER - 257)) | (1L << (DIGIT_IDENTIFIER - 257)) | (1L << (QUOTED_IDENTIFIER - 257)) | (1L << (BACKQUOTED_IDENTIFIER - 257)))) != 0)) {
					{
					setState(483);
					callArgument();
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(484);
						match(T__3);
						setState(485);
						callArgument();
						}
						}
						setState(490);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(493);
				match(T__2);
				}
				break;
			case 29:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(495);
				match(CREATE);
				setState(496);
				match(ROLE);
				setState(497);
				((CreateRoleContext)_localctx).name = identifier();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(498);
					match(WITH);
					setState(499);
					match(ADMIN);
					setState(500);
					grantor();
					}
				}

				}
				break;
			case 30:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(503);
				match(DROP);
				setState(504);
				match(ROLE);
				setState(505);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 31:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(506);
				match(GRANT);
				setState(507);
				roles();
				setState(508);
				match(TO);
				setState(509);
				principal();
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(510);
					match(T__3);
					setState(511);
					principal();
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(517);
					match(WITH);
					setState(518);
					match(ADMIN);
					setState(519);
					match(OPTION);
					}
				}

				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(522);
					match(GRANTED);
					setState(523);
					match(BY);
					setState(524);
					grantor();
					}
				}

				}
				break;
			case 32:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(527);
				match(REVOKE);
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(528);
					match(ADMIN);
					setState(529);
					match(OPTION);
					setState(530);
					match(FOR);
					}
					break;
				}
				setState(533);
				roles();
				setState(534);
				match(FROM);
				setState(535);
				principal();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(536);
					match(T__3);
					setState(537);
					principal();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(543);
					match(GRANTED);
					setState(544);
					match(BY);
					setState(545);
					grantor();
					}
				}

				}
				break;
			case 33:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(548);
				match(SET);
				setState(549);
				match(ROLE);
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(550);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(551);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(552);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 34:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(555);
				match(GRANT);
				setState(566);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
					{
					setState(556);
					privilege();
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(557);
						match(T__3);
						setState(558);
						privilege();
						}
						}
						setState(563);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(564);
					match(ALL);
					setState(565);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(568);
				match(ON);
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(569);
					_la = _input.LA(1);
					if ( !(_la==SCHEMA || _la==TABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(572);
				qualifiedName();
				setState(573);
				match(TO);
				setState(574);
				((GrantContext)_localctx).grantee = principal();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(575);
					match(WITH);
					setState(576);
					match(GRANT);
					setState(577);
					match(OPTION);
					}
				}

				}
				break;
			case 35:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(580);
				match(REVOKE);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(581);
					match(GRANT);
					setState(582);
					match(OPTION);
					setState(583);
					match(FOR);
					}
				}

				setState(596);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
					{
					setState(586);
					privilege();
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(587);
						match(T__3);
						setState(588);
						privilege();
						}
						}
						setState(593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(594);
					match(ALL);
					setState(595);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(598);
				match(ON);
				setState(600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(599);
					_la = _input.LA(1);
					if ( !(_la==SCHEMA || _la==TABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(602);
				qualifiedName();
				setState(603);
				match(FROM);
				setState(604);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 36:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(606);
				match(SHOW);
				setState(607);
				match(GRANTS);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(608);
					match(ON);
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(609);
						match(TABLE);
						}
					}

					setState(612);
					qualifiedName();
					}
				}

				}
				break;
			case 37:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(615);
				match(EXPLAIN);
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(616);
					match(ANALYZE);
					}
					break;
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(619);
					match(VERBOSE);
					}
				}

				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(622);
					match(T__1);
					setState(623);
					explainOption();
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(624);
						match(T__3);
						setState(625);
						explainOption();
						}
						}
						setState(630);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(631);
					match(T__2);
					}
					break;
				}
				setState(635);
				statement();
				}
				break;
			case 38:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(636);
				match(SHOW);
				setState(637);
				match(CREATE);
				setState(638);
				match(TABLE);
				setState(639);
				qualifiedName();
				}
				break;
			case 39:
				_localctx = new ShowCreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(640);
				match(SHOW);
				setState(641);
				match(CREATE);
				setState(642);
				match(SCHEMA);
				setState(643);
				qualifiedName();
				}
				break;
			case 40:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(644);
				match(SHOW);
				setState(645);
				match(CREATE);
				setState(646);
				match(VIEW);
				setState(647);
				qualifiedName();
				}
				break;
			case 41:
				_localctx = new ShowCreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(648);
				match(SHOW);
				setState(649);
				match(CREATE);
				setState(650);
				match(MATERIALIZED);
				setState(651);
				match(VIEW);
				setState(652);
				qualifiedName();
				}
				break;
			case 42:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(653);
				match(SHOW);
				setState(654);
				match(TABLES);
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(655);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(656);
					qualifiedName();
					}
				}

				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(659);
					match(LIKE);
					setState(660);
					((ShowTablesContext)_localctx).pattern = string();
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(661);
						match(ESCAPE);
						setState(662);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 43:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(667);
				match(SHOW);
				setState(668);
				match(SCHEMAS);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(669);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(670);
					identifier();
					}
				}

				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(673);
					match(LIKE);
					setState(674);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(675);
						match(ESCAPE);
						setState(676);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 44:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(681);
				match(SHOW);
				setState(682);
				match(CATALOGS);
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(683);
					match(LIKE);
					setState(684);
					((ShowCatalogsContext)_localctx).pattern = string();
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(685);
						match(ESCAPE);
						setState(686);
						((ShowCatalogsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 45:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(691);
				match(SHOW);
				setState(692);
				match(COLUMNS);
				setState(693);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADMIN - 17)) | (1L << (AFTER - 17)) | (1L << (ALL - 17)) | (1L << (ANALYZE - 17)) | (1L << (ANY - 17)) | (1L << (ARRAY - 17)) | (1L << (ASC - 17)) | (1L << (AT - 17)) | (1L << (AUTHORIZATION - 17)) | (1L << (BERNOULLI - 17)) | (1L << (CALL - 17)) | (1L << (CASCADE - 17)) | (1L << (CATALOGS - 17)) | (1L << (COLUMN - 17)) | (1L << (COLUMNS - 17)) | (1L << (COMMENT - 17)) | (1L << (COMMIT - 17)) | (1L << (COMMITTED - 17)) | (1L << (CURRENT - 17)) | (1L << (DATA - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)) | (1L << (DEFINER - 17)) | (1L << (DESC - 17)) | (1L << (DEFINE - 17)) | (1L << (DISTRIBUTED - 17)) | (1L << (DOUBLE - 17)) | (1L << (EMPTY - 17)) | (1L << (EXCLUDING - 17)) | (1L << (EXPLAIN - 17)) | (1L << (FETCH - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FILTER - 81)) | (1L << (FINAL - 81)) | (1L << (FIRST - 81)) | (1L << (FOLLOWING - 81)) | (1L << (FORMAT - 81)) | (1L << (FUNCTIONS - 81)) | (1L << (GRANT - 81)) | (1L << (GRANTED - 81)) | (1L << (GRANTS - 81)) | (1L << (GRAPHVIZ - 81)) | (1L << (GROUPS - 81)) | (1L << (HOUR - 81)) | (1L << (IF - 81)) | (1L << (IGNORE - 81)) | (1L << (INCLUDING - 81)) | (1L << (INITIAL - 81)) | (1L << (INPUT - 81)) | (1L << (INTERVAL - 81)) | (1L << (INVOKER - 81)) | (1L << (IO - 81)) | (1L << (ISOLATION - 81)) | (1L << (JSON - 81)) | (1L << (LAST - 81)) | (1L << (LATERAL - 81)) | (1L << (LEVEL - 81)) | (1L << (LIMIT - 81)) | (1L << (LOGICAL - 81)) | (1L << (MAP - 81)) | (1L << (MATCH - 81)) | (1L << (MATCHED - 81)) | (1L << (MATCHES - 81)) | (1L << (MATCH_RECOGNIZE - 81)) | (1L << (MATERIALIZED - 81)) | (1L << (MEASURES - 81)) | (1L << (MERGE - 81)) | (1L << (MINUTE - 81)) | (1L << (MONTH - 81)) | (1L << (NEXT - 81)) | (1L << (NFC - 81)) | (1L << (NFD - 81)) | (1L << (NFKC - 81)) | (1L << (NFKD - 81)) | (1L << (NO - 81)) | (1L << (NONE - 81)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (NULLIF - 146)) | (1L << (NULLS - 146)) | (1L << (OFFSET - 146)) | (1L << (OMIT - 146)) | (1L << (ONE - 146)) | (1L << (ONLY - 146)) | (1L << (OPTION - 146)) | (1L << (ORDINALITY - 146)) | (1L << (OUTPUT - 146)) | (1L << (OVER - 146)) | (1L << (PARTITION - 146)) | (1L << (PARTITIONS - 146)) | (1L << (PAST - 146)) | (1L << (PATH - 146)) | (1L << (PATTERN - 146)) | (1L << (PER - 146)) | (1L << (PERMUTE - 146)) | (1L << (POSITION - 146)) | (1L << (PRECEDING - 146)) | (1L << (PRECISION - 146)) | (1L << (PRIVILEGES - 146)) | (1L << (PROPERTIES - 146)) | (1L << (RANGE - 146)) | (1L << (READ - 146)) | (1L << (REFRESH - 146)) | (1L << (RENAME - 146)) | (1L << (REPEATABLE - 146)) | (1L << (REPLACE - 146)) | (1L << (RESET - 146)) | (1L << (RESPECT - 146)) | (1L << (RESTRICT - 146)) | (1L << (REVOKE - 146)) | (1L << (ROLE - 146)) | (1L << (ROLES - 146)) | (1L << (ROLLBACK - 146)) | (1L << (ROW - 146)) | (1L << (ROWS - 146)) | (1L << (RUNNING - 146)) | (1L << (SCHEMA - 146)) | (1L << (SCHEMAS - 146)) | (1L << (SECOND - 146)) | (1L << (SECURITY - 146)) | (1L << (SEEK - 146)) | (1L << (SERIALIZABLE - 146)) | (1L << (SESSION - 146)) | (1L << (SET - 146)) | (1L << (SETS - 146)) | (1L << (SHOW - 146)) | (1L << (SOME - 146)) | (1L << (START - 146)) | (1L << (STATS - 146)) | (1L << (SUBSET - 146)) | (1L << (SUBSTRING - 146)) | (1L << (SYSTEM - 146)))) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (TABLES - 210)) | (1L << (TABLESAMPLE - 210)) | (1L << (TEXT - 210)) | (1L << (TIES - 210)) | (1L << (TIME - 210)) | (1L << (TIMESTAMP - 210)) | (1L << (TO - 210)) | (1L << (TRANSACTION - 210)) | (1L << (TRY_CAST - 210)) | (1L << (TYPE - 210)) | (1L << (UNBOUNDED - 210)) | (1L << (UNCOMMITTED - 210)) | (1L << (UNMATCHED - 210)) | (1L << (UPDATE - 210)) | (1L << (USE - 210)) | (1L << (USER - 210)) | (1L << (VALIDATE - 210)) | (1L << (VERBOSE - 210)) | (1L << (VIEW - 210)) | (1L << (WINDOW - 210)) | (1L << (WITHOUT - 210)) | (1L << (WORK - 210)) | (1L << (WRITE - 210)) | (1L << (YEAR - 210)) | (1L << (ZONE - 210)) | (1L << (IDENTIFIER - 210)) | (1L << (DIGIT_IDENTIFIER - 210)) | (1L << (QUOTED_IDENTIFIER - 210)) | (1L << (BACKQUOTED_IDENTIFIER - 210)))) != 0)) {
					{
					setState(694);
					qualifiedName();
					}
				}

				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(697);
					match(LIKE);
					setState(698);
					((ShowColumnsContext)_localctx).pattern = string();
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(699);
						match(ESCAPE);
						setState(700);
						((ShowColumnsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 46:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(705);
				match(SHOW);
				setState(706);
				match(STATS);
				setState(707);
				match(FOR);
				setState(708);
				qualifiedName();
				}
				break;
			case 47:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(709);
				match(SHOW);
				setState(710);
				match(STATS);
				setState(711);
				match(FOR);
				setState(712);
				match(T__1);
				setState(713);
				query();
				setState(714);
				match(T__2);
				}
				break;
			case 48:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(716);
				match(SHOW);
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(717);
					match(CURRENT);
					}
				}

				setState(720);
				match(ROLES);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(721);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(722);
					identifier();
					}
				}

				}
				break;
			case 49:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(725);
				match(SHOW);
				setState(726);
				match(ROLE);
				setState(727);
				match(GRANTS);
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(728);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(729);
					identifier();
					}
				}

				}
				break;
			case 50:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(732);
				match(DESCRIBE);
				setState(733);
				qualifiedName();
				}
				break;
			case 51:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(734);
				match(DESC);
				setState(735);
				qualifiedName();
				}
				break;
			case 52:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(736);
				match(SHOW);
				setState(737);
				match(FUNCTIONS);
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(738);
					match(LIKE);
					setState(739);
					((ShowFunctionsContext)_localctx).pattern = string();
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(740);
						match(ESCAPE);
						setState(741);
						((ShowFunctionsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 53:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(746);
				match(SHOW);
				setState(747);
				match(SESSION);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(748);
					match(LIKE);
					setState(749);
					((ShowSessionContext)_localctx).pattern = string();
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(750);
						match(ESCAPE);
						setState(751);
						((ShowSessionContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 54:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(756);
				match(SET);
				setState(757);
				match(SESSION);
				setState(758);
				qualifiedName();
				setState(759);
				match(EQ);
				setState(760);
				expression();
				}
				break;
			case 55:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(762);
				match(RESET);
				setState(763);
				match(SESSION);
				setState(764);
				qualifiedName();
				}
				break;
			case 56:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(765);
				match(START);
				setState(766);
				match(TRANSACTION);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(767);
					transactionMode();
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(768);
						match(T__3);
						setState(769);
						transactionMode();
						}
						}
						setState(774);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 57:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(777);
				match(COMMIT);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(778);
					match(WORK);
					}
				}

				}
				break;
			case 58:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(781);
				match(ROLLBACK);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(782);
					match(WORK);
					}
				}

				}
				break;
			case 59:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(785);
				match(PREPARE);
				setState(786);
				identifier();
				setState(787);
				match(FROM);
				setState(788);
				statement();
				}
				break;
			case 60:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(790);
				match(DEALLOCATE);
				setState(791);
				match(PREPARE);
				setState(792);
				identifier();
				}
				break;
			case 61:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(793);
				match(EXECUTE);
				setState(794);
				identifier();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(795);
					match(USING);
					setState(796);
					expression();
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(797);
						match(T__3);
						setState(798);
						expression();
						}
						}
						setState(803);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 62:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(806);
				match(DESCRIBE);
				setState(807);
				match(INPUT);
				setState(808);
				identifier();
				}
				break;
			case 63:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(809);
				match(DESCRIBE);
				setState(810);
				match(OUTPUT);
				setState(811);
				identifier();
				}
				break;
			case 64:
				_localctx = new SetPathContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(812);
				match(SET);
				setState(813);
				match(PATH);
				setState(814);
				pathSpecification();
				}
				break;
			case 65:
				_localctx = new UpdateContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(815);
				match(UPDATE);
				setState(816);
				qualifiedName();
				setState(817);
				match(SET);
				setState(818);
				updateAssignment();
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(819);
					match(T__3);
					setState(820);
					updateAssignment();
					}
					}
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(826);
					match(WHERE);
					setState(827);
					((UpdateContext)_localctx).where = booleanExpression(0);
					}
				}

				}
				break;
			case 66:
				_localctx = new MergeContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(830);
				match(MERGE);
				setState(831);
				match(INTO);
				setState(832);
				qualifiedName();
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADMIN - 17)) | (1L << (AFTER - 17)) | (1L << (ALL - 17)) | (1L << (ANALYZE - 17)) | (1L << (ANY - 17)) | (1L << (ARRAY - 17)) | (1L << (AS - 17)) | (1L << (ASC - 17)) | (1L << (AT - 17)) | (1L << (AUTHORIZATION - 17)) | (1L << (BERNOULLI - 17)) | (1L << (CALL - 17)) | (1L << (CASCADE - 17)) | (1L << (CATALOGS - 17)) | (1L << (COLUMN - 17)) | (1L << (COLUMNS - 17)) | (1L << (COMMENT - 17)) | (1L << (COMMIT - 17)) | (1L << (COMMITTED - 17)) | (1L << (CURRENT - 17)) | (1L << (DATA - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)) | (1L << (DEFINER - 17)) | (1L << (DESC - 17)) | (1L << (DEFINE - 17)) | (1L << (DISTRIBUTED - 17)) | (1L << (DOUBLE - 17)) | (1L << (EMPTY - 17)) | (1L << (EXCLUDING - 17)) | (1L << (EXPLAIN - 17)) | (1L << (FETCH - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FILTER - 81)) | (1L << (FINAL - 81)) | (1L << (FIRST - 81)) | (1L << (FOLLOWING - 81)) | (1L << (FORMAT - 81)) | (1L << (FUNCTIONS - 81)) | (1L << (GRANT - 81)) | (1L << (GRANTED - 81)) | (1L << (GRANTS - 81)) | (1L << (GRAPHVIZ - 81)) | (1L << (GROUPS - 81)) | (1L << (HOUR - 81)) | (1L << (IF - 81)) | (1L << (IGNORE - 81)) | (1L << (INCLUDING - 81)) | (1L << (INITIAL - 81)) | (1L << (INPUT - 81)) | (1L << (INTERVAL - 81)) | (1L << (INVOKER - 81)) | (1L << (IO - 81)) | (1L << (ISOLATION - 81)) | (1L << (JSON - 81)) | (1L << (LAST - 81)) | (1L << (LATERAL - 81)) | (1L << (LEVEL - 81)) | (1L << (LIMIT - 81)) | (1L << (LOGICAL - 81)) | (1L << (MAP - 81)) | (1L << (MATCH - 81)) | (1L << (MATCHED - 81)) | (1L << (MATCHES - 81)) | (1L << (MATCH_RECOGNIZE - 81)) | (1L << (MATERIALIZED - 81)) | (1L << (MEASURES - 81)) | (1L << (MERGE - 81)) | (1L << (MINUTE - 81)) | (1L << (MONTH - 81)) | (1L << (NEXT - 81)) | (1L << (NFC - 81)) | (1L << (NFD - 81)) | (1L << (NFKC - 81)) | (1L << (NFKD - 81)) | (1L << (NO - 81)) | (1L << (NONE - 81)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (NULLIF - 146)) | (1L << (NULLS - 146)) | (1L << (OFFSET - 146)) | (1L << (OMIT - 146)) | (1L << (ONE - 146)) | (1L << (ONLY - 146)) | (1L << (OPTION - 146)) | (1L << (ORDINALITY - 146)) | (1L << (OUTPUT - 146)) | (1L << (OVER - 146)) | (1L << (PARTITION - 146)) | (1L << (PARTITIONS - 146)) | (1L << (PAST - 146)) | (1L << (PATH - 146)) | (1L << (PATTERN - 146)) | (1L << (PER - 146)) | (1L << (PERMUTE - 146)) | (1L << (POSITION - 146)) | (1L << (PRECEDING - 146)) | (1L << (PRECISION - 146)) | (1L << (PRIVILEGES - 146)) | (1L << (PROPERTIES - 146)) | (1L << (RANGE - 146)) | (1L << (READ - 146)) | (1L << (REFRESH - 146)) | (1L << (RENAME - 146)) | (1L << (REPEATABLE - 146)) | (1L << (REPLACE - 146)) | (1L << (RESET - 146)) | (1L << (RESPECT - 146)) | (1L << (RESTRICT - 146)) | (1L << (REVOKE - 146)) | (1L << (ROLE - 146)) | (1L << (ROLES - 146)) | (1L << (ROLLBACK - 146)) | (1L << (ROW - 146)) | (1L << (ROWS - 146)) | (1L << (RUNNING - 146)) | (1L << (SCHEMA - 146)) | (1L << (SCHEMAS - 146)) | (1L << (SECOND - 146)) | (1L << (SECURITY - 146)) | (1L << (SEEK - 146)) | (1L << (SERIALIZABLE - 146)) | (1L << (SESSION - 146)) | (1L << (SET - 146)) | (1L << (SETS - 146)) | (1L << (SHOW - 146)) | (1L << (SOME - 146)) | (1L << (START - 146)) | (1L << (STATS - 146)) | (1L << (SUBSET - 146)) | (1L << (SUBSTRING - 146)) | (1L << (SYSTEM - 146)))) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (TABLES - 210)) | (1L << (TABLESAMPLE - 210)) | (1L << (TEXT - 210)) | (1L << (TIES - 210)) | (1L << (TIME - 210)) | (1L << (TIMESTAMP - 210)) | (1L << (TO - 210)) | (1L << (TRANSACTION - 210)) | (1L << (TRY_CAST - 210)) | (1L << (TYPE - 210)) | (1L << (UNBOUNDED - 210)) | (1L << (UNCOMMITTED - 210)) | (1L << (UNMATCHED - 210)) | (1L << (UPDATE - 210)) | (1L << (USE - 210)) | (1L << (USER - 210)) | (1L << (VALIDATE - 210)) | (1L << (VERBOSE - 210)) | (1L << (VIEW - 210)) | (1L << (WINDOW - 210)) | (1L << (WITHOUT - 210)) | (1L << (WORK - 210)) | (1L << (WRITE - 210)) | (1L << (YEAR - 210)) | (1L << (ZONE - 210)) | (1L << (IDENTIFIER - 210)) | (1L << (DIGIT_IDENTIFIER - 210)) | (1L << (QUOTED_IDENTIFIER - 210)) | (1L << (BACKQUOTED_IDENTIFIER - 210)))) != 0)) {
					{
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(833);
						match(AS);
						}
					}

					setState(836);
					identifier();
					}
				}

				setState(839);
				match(USING);
				setState(840);
				relation(0);
				setState(841);
				match(ON);
				setState(842);
				expression();
				setState(844); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(843);
					mergeCase();
					}
					}
					setState(846); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(850);
				with();
				}
			}

			setState(853);
			queryNoWith();
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(TrinoSqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(WITH);
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(856);
				match(RECURSIVE);
				}
			}

			setState(859);
			namedQuery();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(860);
				match(T__3);
				setState(861);
				namedQuery();
				}
				}
				setState(866);
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

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableElement);
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case AFTER:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				likeClause();
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			identifier();
			setState(872);
			type(0);
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(873);
				match(NOT);
				setState(874);
				match(NULL);
				}
			}

			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(877);
				match(COMMENT);
				setState(878);
				string();
				}
			}

			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(881);
				match(WITH);
				setState(882);
				properties();
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

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(TrinoSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(TrinoSqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(TrinoSqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(LIKE);
			setState(886);
			qualifiedName();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(887);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(888);
				match(PROPERTIES);
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

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(T__1);
			setState(892);
			property();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(893);
				match(T__3);
				setState(894);
				property();
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(900);
			match(T__2);
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

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			identifier();
			setState(903);
			match(EQ);
			setState(904);
			expression();
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public RowCountContext offset;
		public LimitRowCountContext limit;
		public RowCountContext fetchFirst;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(TrinoSqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(TrinoSqlBaseParser.OFFSET, 0); }
		public List<RowCountContext> rowCount() {
			return getRuleContexts(RowCountContext.class);
		}
		public RowCountContext rowCount(int i) {
			return getRuleContext(RowCountContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(TrinoSqlBaseParser.LIMIT, 0); }
		public TerminalNode FETCH() { return getToken(TrinoSqlBaseParser.FETCH, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(TrinoSqlBaseParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(TrinoSqlBaseParser.NEXT, 0); }
		public List<TerminalNode> ROW() { return getTokens(TrinoSqlBaseParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(TrinoSqlBaseParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(TrinoSqlBaseParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(TrinoSqlBaseParser.ROWS, i);
		}
		public TerminalNode ONLY() { return getToken(TrinoSqlBaseParser.ONLY, 0); }
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(TrinoSqlBaseParser.TIES, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			queryTerm(0);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(907);
				match(ORDER);
				setState(908);
				match(BY);
				setState(909);
				sortItem();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(910);
					match(T__3);
					setState(911);
					sortItem();
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(919);
				match(OFFSET);
				setState(920);
				((QueryNoWithContext)_localctx).offset = rowCount();
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW || _la==ROWS) {
					{
					setState(921);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
			}

			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				{
				setState(926);
				match(LIMIT);
				setState(927);
				((QueryNoWithContext)_localctx).limit = limitRowCount();
				}
				}
				break;
			case FETCH:
				{
				{
				setState(928);
				match(FETCH);
				setState(929);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION_MARK || _la==INTEGER_VALUE) {
					{
					setState(930);
					((QueryNoWithContext)_localctx).fetchFirst = rowCount();
					}
				}

				setState(933);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(937);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ONLY:
					{
					setState(934);
					match(ONLY);
					}
					break;
				case WITH:
					{
					setState(935);
					match(WITH);
					setState(936);
					match(TIES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case EOF:
			case T__2:
			case WITH:
				break;
			default:
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

	public static class LimitRowCountContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public RowCountContext rowCount() {
			return getRuleContext(RowCountContext.class,0);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_limitRowCount);
		try {
			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(ALL);
				}
				break;
			case QUESTION_MARK:
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				rowCount();
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

	public static class RowCountContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(TrinoSqlBaseParser.QUESTION_MARK, 0); }
		public RowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowCount; }
	}

	public final RowCountContext rowCount() throws RecognitionException {
		RowCountContext _localctx = new RowCountContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rowCount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_la = _input.LA(1);
			if ( !(_la==QUESTION_MARK || _la==INTEGER_VALUE) ) {
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(TrinoSqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(TrinoSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(TrinoSqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(948);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(964);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(962);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(950);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(951);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(953);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(952);
							setQuantifier();
							}
						}

						setState(955);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(956);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(957);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(959);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(958);
							setQuantifier();
							}
						}

						setState(961);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(966);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(TrinoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(TrinoSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_queryPrimary);
		try {
			int _alt;
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				match(TABLE);
				setState(969);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				match(VALUES);
				setState(971);
				expression();
				setState(976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(972);
						match(T__3);
						setState(973);
						expression();
						}
						} 
					}
					setState(978);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(979);
				match(T__1);
				setState(980);
				queryNoWith();
				setState(981);
				match(T__2);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(TrinoSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(TrinoSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TrinoSqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(TrinoSqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(TrinoSqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			expression();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(986);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(989);
				match(NULLS);
				setState(990);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(TrinoSqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(TrinoSqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(TrinoSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(TrinoSqlBaseParser.HAVING, 0); }
		public TerminalNode WINDOW() { return getToken(TrinoSqlBaseParser.WINDOW, 0); }
		public List<WindowDefinitionContext> windowDefinition() {
			return getRuleContexts(WindowDefinitionContext.class);
		}
		public WindowDefinitionContext windowDefinition(int i) {
			return getRuleContext(WindowDefinitionContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(SELECT);
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(994);
				setQuantifier();
				}
				break;
			}
			setState(997);
			selectItem();
			setState(1002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(998);
					match(T__3);
					setState(999);
					selectItem();
					}
					} 
				}
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1005);
				match(FROM);
				setState(1006);
				relation(0);
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1007);
						match(T__3);
						setState(1008);
						relation(0);
						}
						} 
					}
					setState(1013);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			}
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1016);
				match(WHERE);
				setState(1017);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1020);
				match(GROUP);
				setState(1021);
				match(BY);
				setState(1022);
				groupBy();
				}
				break;
			}
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1025);
				match(HAVING);
				setState(1026);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
			}
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1029);
				match(WINDOW);
				setState(1030);
				windowDefinition();
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1031);
						match(T__3);
						setState(1032);
						windowDefinition();
						}
						} 
					}
					setState(1037);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
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

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_groupBy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1040);
				setQuantifier();
				}
				break;
			}
			setState(1043);
			groupingElement();
			setState(1048);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1044);
					match(T__3);
					setState(1045);
					groupingElement();
					}
					} 
				}
				setState(1050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(TrinoSqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(TrinoSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(TrinoSqlBaseParser.CUBE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(TrinoSqlBaseParser.ROLLUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_groupingElement);
		int _la;
		try {
			setState(1091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				match(ROLLUP);
				setState(1053);
				match(T__1);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)) | (1L << (MATCHED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (RUNNING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (QUESTION_MARK - 257)) | (1L << (STRING - 257)) | (1L << (UNICODE_STRING - 257)) | (1L << (BINARY_LITERAL - 257)) | (1L << (INTEGER_VALUE - 257)) | (1L << (DECIMAL_VALUE - 257)) | (1L << (DOUBLE_VALUE - 257)) | (1L << (IDENTIFIER - 257)) | (1L << (DIGIT_IDENTIFIER - 257)) | (1L << (QUOTED_IDENTIFIER - 257)) | (1L << (BACKQUOTED_IDENTIFIER - 257)))) != 0)) {
					{
					setState(1054);
					expression();
					setState(1059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1055);
						match(T__3);
						setState(1056);
						expression();
						}
						}
						setState(1061);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1064);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				match(CUBE);
				setState(1066);
				match(T__1);
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)) | (1L << (MATCHED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (RUNNING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (QUESTION_MARK - 257)) | (1L << (STRING - 257)) | (1L << (UNICODE_STRING - 257)) | (1L << (BINARY_LITERAL - 257)) | (1L << (INTEGER_VALUE - 257)) | (1L << (DECIMAL_VALUE - 257)) | (1L << (DOUBLE_VALUE - 257)) | (1L << (IDENTIFIER - 257)) | (1L << (DIGIT_IDENTIFIER - 257)) | (1L << (QUOTED_IDENTIFIER - 257)) | (1L << (BACKQUOTED_IDENTIFIER - 257)))) != 0)) {
					{
					setState(1067);
					expression();
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1068);
						match(T__3);
						setState(1069);
						expression();
						}
						}
						setState(1074);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1077);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1078);
				match(GROUPING);
				setState(1079);
				match(SETS);
				setState(1080);
				match(T__1);
				setState(1081);
				groupingSet();
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1082);
					match(T__3);
					setState(1083);
					groupingSet();
					}
					}
					setState(1088);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1089);
				match(T__2);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_groupingSet);
		int _la;
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				match(T__1);
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)) | (1L << (MATCHED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (RUNNING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (QUESTION_MARK - 257)) | (1L << (STRING - 257)) | (1L << (UNICODE_STRING - 257)) | (1L << (BINARY_LITERAL - 257)) | (1L << (INTEGER_VALUE - 257)) | (1L << (DECIMAL_VALUE - 257)) | (1L << (DOUBLE_VALUE - 257)) | (1L << (IDENTIFIER - 257)) | (1L << (DIGIT_IDENTIFIER - 257)) | (1L << (QUOTED_IDENTIFIER - 257)) | (1L << (BACKQUOTED_IDENTIFIER - 257)))) != 0)) {
					{
					setState(1094);
					expression();
					setState(1099);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1095);
						match(T__3);
						setState(1096);
						expression();
						}
						}
						setState(1101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1104);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				expression();
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

	public static class WindowDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public WindowSpecificationContext windowSpecification() {
			return getRuleContext(WindowSpecificationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_windowDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			((WindowDefinitionContext)_localctx).name = identifier();
			setState(1109);
			match(AS);
			setState(1110);
			match(T__1);
			setState(1111);
			windowSpecification();
			setState(1112);
			match(T__2);
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

	public static class WindowSpecificationContext extends ParserRuleContext {
		public IdentifierContext existingWindowName;
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode PARTITION() { return getToken(TrinoSqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(TrinoSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(TrinoSqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(TrinoSqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpecification; }
	}

	public final WindowSpecificationContext windowSpecification() throws RecognitionException {
		WindowSpecificationContext _localctx = new WindowSpecificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_windowSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1114);
				((WindowSpecificationContext)_localctx).existingWindowName = identifier();
				}
				break;
			}
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1117);
				match(PARTITION);
				setState(1118);
				match(BY);
				setState(1119);
				((WindowSpecificationContext)_localctx).expression = expression();
				((WindowSpecificationContext)_localctx).partition.add(((WindowSpecificationContext)_localctx).expression);
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1120);
					match(T__3);
					setState(1121);
					((WindowSpecificationContext)_localctx).expression = expression();
					((WindowSpecificationContext)_localctx).partition.add(((WindowSpecificationContext)_localctx).expression);
					}
					}
					setState(1126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1129);
				match(ORDER);
				setState(1130);
				match(BY);
				setState(1131);
				sortItem();
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1132);
					match(T__3);
					setState(1133);
					sortItem();
					}
					}
					setState(1138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUPS || _la==RANGE || _la==ROWS) {
				{
				setState(1141);
				windowFrame();
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1145);
				columnAliases();
				}
			}

			setState(1148);
			match(AS);
			setState(1149);
			match(T__1);
			setState(1150);
			query();
			setState(1151);
			match(T__2);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(TrinoSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(TrinoSqlBaseParser.ASTERISK, 0); }
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_selectItem);
		int _la;
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				expression();
				setState(1160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1156);
						match(AS);
						}
					}

					setState(1159);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				primaryExpression(0);
				setState(1163);
				match(T__0);
				setState(1164);
				match(ASTERISK);
				setState(1167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1165);
					match(AS);
					setState(1166);
					columnAliases();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1169);
				match(ASTERISK);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(TrinoSqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(TrinoSqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(TrinoSqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1173);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(1193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(1175);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1189);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(1176);
						match(CROSS);
						setState(1177);
						match(JOIN);
						setState(1178);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(1179);
						joinType();
						setState(1180);
						match(JOIN);
						setState(1181);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(1182);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(1184);
						match(NATURAL);
						setState(1185);
						joinType();
						setState(1186);
						match(JOIN);
						setState(1187);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(TrinoSqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(TrinoSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(TrinoSqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(TrinoSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(TrinoSqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_joinType);
		int _la;
		try {
			setState(1211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1196);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				match(LEFT);
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1200);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1203);
				match(RIGHT);
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1204);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1207);
				match(FULL);
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1208);
					match(OUTER);
					}
				}

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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(TrinoSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(TrinoSqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_joinCriteria);
		int _la;
		try {
			setState(1227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				match(ON);
				setState(1214);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				match(USING);
				setState(1216);
				match(T__1);
				setState(1217);
				identifier();
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1218);
					match(T__3);
					setState(1219);
					identifier();
					}
					}
					setState(1224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1225);
				match(T__2);
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

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public PatternRecognitionContext patternRecognition() {
			return getRuleContext(PatternRecognitionContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(TrinoSqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			patternRecognition();
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1230);
				match(TABLESAMPLE);
				setState(1231);
				sampleType();
				setState(1232);
				match(T__1);
				setState(1233);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(1234);
				match(T__2);
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

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(TrinoSqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(TrinoSqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
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

	public static class PatternRecognitionContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode MATCH_RECOGNIZE() { return getToken(TrinoSqlBaseParser.MATCH_RECOGNIZE, 0); }
		public TerminalNode PATTERN() { return getToken(TrinoSqlBaseParser.PATTERN, 0); }
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public TerminalNode DEFINE() { return getToken(TrinoSqlBaseParser.DEFINE, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(TrinoSqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(TrinoSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(TrinoSqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(TrinoSqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode MEASURES() { return getToken(TrinoSqlBaseParser.MEASURES, 0); }
		public List<MeasureDefinitionContext> measureDefinition() {
			return getRuleContexts(MeasureDefinitionContext.class);
		}
		public MeasureDefinitionContext measureDefinition(int i) {
			return getRuleContext(MeasureDefinitionContext.class,i);
		}
		public RowsPerMatchContext rowsPerMatch() {
			return getRuleContext(RowsPerMatchContext.class,0);
		}
		public TerminalNode AFTER() { return getToken(TrinoSqlBaseParser.AFTER, 0); }
		public TerminalNode MATCH() { return getToken(TrinoSqlBaseParser.MATCH, 0); }
		public SkipToContext skipTo() {
			return getRuleContext(SkipToContext.class,0);
		}
		public TerminalNode SUBSET() { return getToken(TrinoSqlBaseParser.SUBSET, 0); }
		public List<SubsetDefinitionContext> subsetDefinition() {
			return getRuleContexts(SubsetDefinitionContext.class);
		}
		public SubsetDefinitionContext subsetDefinition(int i) {
			return getRuleContext(SubsetDefinitionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INITIAL() { return getToken(TrinoSqlBaseParser.INITIAL, 0); }
		public TerminalNode SEEK() { return getToken(TrinoSqlBaseParser.SEEK, 0); }
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public PatternRecognitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternRecognition; }
	}

	public final PatternRecognitionContext patternRecognition() throws RecognitionException {
		PatternRecognitionContext _localctx = new PatternRecognitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_patternRecognition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			aliasedRelation();
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1241);
				match(MATCH_RECOGNIZE);
				setState(1242);
				match(T__1);
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1243);
					match(PARTITION);
					setState(1244);
					match(BY);
					setState(1245);
					((PatternRecognitionContext)_localctx).expression = expression();
					((PatternRecognitionContext)_localctx).partition.add(((PatternRecognitionContext)_localctx).expression);
					setState(1250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1246);
						match(T__3);
						setState(1247);
						((PatternRecognitionContext)_localctx).expression = expression();
						((PatternRecognitionContext)_localctx).partition.add(((PatternRecognitionContext)_localctx).expression);
						}
						}
						setState(1252);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1255);
					match(ORDER);
					setState(1256);
					match(BY);
					setState(1257);
					sortItem();
					setState(1262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1258);
						match(T__3);
						setState(1259);
						sortItem();
						}
						}
						setState(1264);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MEASURES) {
					{
					setState(1267);
					match(MEASURES);
					setState(1268);
					measureDefinition();
					setState(1273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1269);
						match(T__3);
						setState(1270);
						measureDefinition();
						}
						}
						setState(1275);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==ONE) {
					{
					setState(1278);
					rowsPerMatch();
					}
				}

				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(1281);
					match(AFTER);
					setState(1282);
					match(MATCH);
					setState(1283);
					skipTo();
					}
				}

				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIAL || _la==SEEK) {
					{
					setState(1286);
					_la = _input.LA(1);
					if ( !(_la==INITIAL || _la==SEEK) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1289);
				match(PATTERN);
				setState(1290);
				match(T__1);
				setState(1291);
				rowPattern(0);
				setState(1292);
				match(T__2);
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBSET) {
					{
					setState(1293);
					match(SUBSET);
					setState(1294);
					subsetDefinition();
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1295);
						match(T__3);
						setState(1296);
						subsetDefinition();
						}
						}
						setState(1301);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1304);
				match(DEFINE);
				setState(1305);
				variableDefinition();
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1306);
					match(T__3);
					setState(1307);
					variableDefinition();
					}
					}
					setState(1312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1313);
				match(T__2);
				setState(1321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1314);
						match(AS);
						}
					}

					setState(1317);
					identifier();
					setState(1319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1318);
						columnAliases();
						}
						break;
					}
					}
					break;
				}
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

	public static class MeasureDefinitionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MeasureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureDefinition; }
	}

	public final MeasureDefinitionContext measureDefinition() throws RecognitionException {
		MeasureDefinitionContext _localctx = new MeasureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_measureDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			expression();
			setState(1326);
			match(AS);
			setState(1327);
			identifier();
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

	public static class RowsPerMatchContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(TrinoSqlBaseParser.ONE, 0); }
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public TerminalNode PER() { return getToken(TrinoSqlBaseParser.PER, 0); }
		public TerminalNode MATCH() { return getToken(TrinoSqlBaseParser.MATCH, 0); }
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(TrinoSqlBaseParser.ROWS, 0); }
		public EmptyMatchHandlingContext emptyMatchHandling() {
			return getRuleContext(EmptyMatchHandlingContext.class,0);
		}
		public RowsPerMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowsPerMatch; }
	}

	public final RowsPerMatchContext rowsPerMatch() throws RecognitionException {
		RowsPerMatchContext _localctx = new RowsPerMatchContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rowsPerMatch);
		int _la;
		try {
			setState(1340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				match(ONE);
				setState(1330);
				match(ROW);
				setState(1331);
				match(PER);
				setState(1332);
				match(MATCH);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				match(ALL);
				setState(1334);
				match(ROWS);
				setState(1335);
				match(PER);
				setState(1336);
				match(MATCH);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OMIT || _la==SHOW || _la==WITH) {
					{
					setState(1337);
					emptyMatchHandling();
					}
				}

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

	public static class EmptyMatchHandlingContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode EMPTY() { return getToken(TrinoSqlBaseParser.EMPTY, 0); }
		public TerminalNode MATCHES() { return getToken(TrinoSqlBaseParser.MATCHES, 0); }
		public TerminalNode OMIT() { return getToken(TrinoSqlBaseParser.OMIT, 0); }
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode UNMATCHED() { return getToken(TrinoSqlBaseParser.UNMATCHED, 0); }
		public TerminalNode ROWS() { return getToken(TrinoSqlBaseParser.ROWS, 0); }
		public EmptyMatchHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyMatchHandling; }
	}

	public final EmptyMatchHandlingContext emptyMatchHandling() throws RecognitionException {
		EmptyMatchHandlingContext _localctx = new EmptyMatchHandlingContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_emptyMatchHandling);
		try {
			setState(1351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				match(SHOW);
				setState(1343);
				match(EMPTY);
				setState(1344);
				match(MATCHES);
				}
				break;
			case OMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				match(OMIT);
				setState(1346);
				match(EMPTY);
				setState(1347);
				match(MATCHES);
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1348);
				match(WITH);
				setState(1349);
				match(UNMATCHED);
				setState(1350);
				match(ROWS);
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

	public static class SkipToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public TerminalNode NEXT() { return getToken(TrinoSqlBaseParser.NEXT, 0); }
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public TerminalNode PAST() { return getToken(TrinoSqlBaseParser.PAST, 0); }
		public TerminalNode LAST() { return getToken(TrinoSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(TrinoSqlBaseParser.FIRST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SkipToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipTo; }
	}

	public final SkipToContext skipTo() throws RecognitionException {
		SkipToContext _localctx = new SkipToContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_skipTo);
		try {
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				match(T__4);
				setState(1354);
				match(TO);
				setState(1355);
				match(NEXT);
				setState(1356);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(T__4);
				setState(1358);
				match(PAST);
				setState(1359);
				match(LAST);
				setState(1360);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1361);
				match(T__4);
				setState(1362);
				match(TO);
				setState(1363);
				match(FIRST);
				setState(1364);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1365);
				match(T__4);
				setState(1366);
				match(TO);
				setState(1367);
				match(LAST);
				setState(1368);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1369);
				match(T__4);
				setState(1370);
				match(TO);
				setState(1371);
				identifier();
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

	public static class SubsetDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext identifier;
		public List<IdentifierContext> union = new ArrayList<IdentifierContext>();
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public SubsetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsetDefinition; }
	}

	public final SubsetDefinitionContext subsetDefinition() throws RecognitionException {
		SubsetDefinitionContext _localctx = new SubsetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subsetDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			((SubsetDefinitionContext)_localctx).name = identifier();
			setState(1375);
			match(EQ);
			setState(1376);
			match(T__1);
			setState(1377);
			((SubsetDefinitionContext)_localctx).identifier = identifier();
			((SubsetDefinitionContext)_localctx).union.add(((SubsetDefinitionContext)_localctx).identifier);
			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1378);
				match(T__3);
				setState(1379);
				((SubsetDefinitionContext)_localctx).identifier = identifier();
				((SubsetDefinitionContext)_localctx).union.add(((SubsetDefinitionContext)_localctx).identifier);
				}
				}
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1385);
			match(T__2);
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			identifier();
			setState(1388);
			match(AS);
			setState(1389);
			expression();
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

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			relationPrimary();
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1392);
					match(AS);
					}
				}

				setState(1395);
				identifier();
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1396);
					columnAliases();
					}
					break;
				}
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

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(T__1);
			setState(1402);
			identifier();
			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1403);
				match(T__3);
				setState(1404);
				identifier();
				}
				}
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1410);
			match(T__2);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(TrinoSqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(TrinoSqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(TrinoSqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_relationPrimary);
		int _la;
		try {
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1412);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				match(T__1);
				setState(1414);
				query();
				setState(1415);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1417);
				match(UNNEST);
				setState(1418);
				match(T__1);
				setState(1419);
				expression();
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1420);
					match(T__3);
					setState(1421);
					expression();
					}
					}
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1427);
				match(T__2);
				setState(1430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1428);
					match(WITH);
					setState(1429);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1432);
				match(LATERAL);
				setState(1433);
				match(T__1);
				setState(1434);
				query();
				setState(1435);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1437);
				match(T__1);
				setState(1438);
				relation(0);
				setState(1439);
				match(T__2);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(TrinoSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case ADD:
			case ADMIN:
			case AFTER:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_PATH:
			case CURRENT_SCHEMA:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case QUESTION_MARK:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1446);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1447);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1450);
				match(NOT);
				setState(1451);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1454);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1455);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1456);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1457);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1458);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1459);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(TrinoSqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(TrinoSqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(TrinoSqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(TrinoSqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(TrinoSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(TrinoSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 90, RULE_predicate);
		int _la;
		try {
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				comparisonOperator();
				setState(1466);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1468);
				comparisonOperator();
				setState(1469);
				comparisonQuantifier();
				setState(1470);
				match(T__1);
				setState(1471);
				query();
				setState(1472);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1474);
					match(NOT);
					}
				}

				setState(1477);
				match(BETWEEN);
				setState(1478);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1479);
				match(AND);
				setState(1480);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1482);
					match(NOT);
					}
				}

				setState(1485);
				match(IN);
				setState(1486);
				match(T__1);
				setState(1487);
				expression();
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1488);
					match(T__3);
					setState(1489);
					expression();
					}
					}
					setState(1494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1495);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1497);
					match(NOT);
					}
				}

				setState(1500);
				match(IN);
				setState(1501);
				match(T__1);
				setState(1502);
				query();
				setState(1503);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1505);
					match(NOT);
					}
				}

				setState(1508);
				match(LIKE);
				setState(1509);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1510);
					match(ESCAPE);
					setState(1511);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1514);
				match(IS);
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1515);
					match(NOT);
					}
				}

				setState(1518);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1519);
				match(IS);
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1520);
					match(NOT);
					}
				}

				setState(1523);
				match(DISTINCT);
				setState(1524);
				match(FROM);
				setState(1525);
				((DistinctFromContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(TrinoSqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(TrinoSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(TrinoSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(TrinoSqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(TrinoSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(TrinoSqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(TrinoSqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1529);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1530);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1531);
				valueExpression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1546);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1534);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1535);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 253)) & ~0x3f) == 0 && ((1L << (_la - 253)) & ((1L << (ASTERISK - 253)) | (1L << (SLASH - 253)) | (1L << (PERCENT - 253)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1536);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1537);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1538);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1539);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1540);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1541);
						match(CONCAT);
						setState(1542);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1543);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1544);
						match(AT);
						setState(1545);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(TrinoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(TrinoSqlBaseParser.PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(TrinoSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(TrinoSqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(TrinoSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(TrinoSqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(TrinoSqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(TrinoSqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(TrinoSqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(TrinoSqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(TrinoSqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(TrinoSqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public TerminalNode QUESTION_MARK() { return getToken(TrinoSqlBaseParser.QUESTION_MARK, 0); }
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(TrinoSqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext operand;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(TrinoSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(TrinoSqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TrinoSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(TrinoSqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CurrentPathContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_PATH() { return getToken(TrinoSqlBaseParser.CURRENT_PATH, 0); }
		public CurrentPathContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(TrinoSqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(TrinoSqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(TrinoSqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TrinoSqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(TrinoSqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(TrinoSqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public ProcessingModeContext processingMode() {
			return getRuleContext(ProcessingModeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(TrinoSqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(TrinoSqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CurrentSchemaContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_SCHEMA() { return getToken(TrinoSqlBaseParser.CURRENT_SCHEMA, 0); }
		public CurrentSchemaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(TrinoSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(TrinoSqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(TrinoSqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(TrinoSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(TrinoSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TrinoSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CurrentCatalogContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_CATALOG() { return getToken(TrinoSqlBaseParser.CURRENT_CATALOG, 0); }
		public CurrentCatalogContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(TrinoSqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1552);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1553);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1554);
				identifier();
				setState(1555);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1557);
				match(DOUBLE);
				setState(1558);
				match(PRECISION);
				setState(1559);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1560);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1561);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1562);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1563);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1564);
				match(QUESTION_MARK);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1565);
				match(POSITION);
				setState(1566);
				match(T__1);
				setState(1567);
				valueExpression(0);
				setState(1568);
				match(IN);
				setState(1569);
				valueExpression(0);
				setState(1570);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1572);
				match(T__1);
				setState(1573);
				expression();
				setState(1576); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1574);
					match(T__3);
					setState(1575);
					expression();
					}
					}
					setState(1578); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1580);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1582);
				match(ROW);
				setState(1583);
				match(T__1);
				setState(1584);
				expression();
				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1585);
					match(T__3);
					setState(1586);
					expression();
					}
					}
					setState(1591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1592);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1594);
				qualifiedName();
				setState(1595);
				match(T__1);
				setState(1596);
				match(ASTERISK);
				setState(1597);
				match(T__2);
				setState(1599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1598);
					filter();
					}
					break;
				}
				setState(1602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1601);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1604);
					processingMode();
					}
					break;
				}
				setState(1607);
				qualifiedName();
				setState(1608);
				match(T__1);
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)) | (1L << (MATCHED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (RUNNING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (QUESTION_MARK - 257)) | (1L << (STRING - 257)) | (1L << (UNICODE_STRING - 257)) | (1L << (BINARY_LITERAL - 257)) | (1L << (INTEGER_VALUE - 257)) | (1L << (DECIMAL_VALUE - 257)) | (1L << (DOUBLE_VALUE - 257)) | (1L << (IDENTIFIER - 257)) | (1L << (DIGIT_IDENTIFIER - 257)) | (1L << (QUOTED_IDENTIFIER - 257)) | (1L << (BACKQUOTED_IDENTIFIER - 257)))) != 0)) {
					{
					setState(1610);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
					case 1:
						{
						setState(1609);
						setQuantifier();
						}
						break;
					}
					setState(1612);
					expression();
					setState(1617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1613);
						match(T__3);
						setState(1614);
						expression();
						}
						}
						setState(1619);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1622);
					match(ORDER);
					setState(1623);
					match(BY);
					setState(1624);
					sortItem();
					setState(1629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1625);
						match(T__3);
						setState(1626);
						sortItem();
						}
						}
						setState(1631);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1634);
				match(T__2);
				setState(1636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1635);
					filter();
					}
					break;
				}
				setState(1642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1639);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1638);
						nullTreatment();
						}
					}

					setState(1641);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1644);
				identifier();
				setState(1645);
				match(T__5);
				setState(1646);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1648);
				match(T__1);
				setState(1657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADMIN - 17)) | (1L << (AFTER - 17)) | (1L << (ALL - 17)) | (1L << (ANALYZE - 17)) | (1L << (ANY - 17)) | (1L << (ARRAY - 17)) | (1L << (ASC - 17)) | (1L << (AT - 17)) | (1L << (AUTHORIZATION - 17)) | (1L << (BERNOULLI - 17)) | (1L << (CALL - 17)) | (1L << (CASCADE - 17)) | (1L << (CATALOGS - 17)) | (1L << (COLUMN - 17)) | (1L << (COLUMNS - 17)) | (1L << (COMMENT - 17)) | (1L << (COMMIT - 17)) | (1L << (COMMITTED - 17)) | (1L << (CURRENT - 17)) | (1L << (DATA - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)) | (1L << (DEFINER - 17)) | (1L << (DESC - 17)) | (1L << (DEFINE - 17)) | (1L << (DISTRIBUTED - 17)) | (1L << (DOUBLE - 17)) | (1L << (EMPTY - 17)) | (1L << (EXCLUDING - 17)) | (1L << (EXPLAIN - 17)) | (1L << (FETCH - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FILTER - 81)) | (1L << (FINAL - 81)) | (1L << (FIRST - 81)) | (1L << (FOLLOWING - 81)) | (1L << (FORMAT - 81)) | (1L << (FUNCTIONS - 81)) | (1L << (GRANT - 81)) | (1L << (GRANTED - 81)) | (1L << (GRANTS - 81)) | (1L << (GRAPHVIZ - 81)) | (1L << (GROUPS - 81)) | (1L << (HOUR - 81)) | (1L << (IF - 81)) | (1L << (IGNORE - 81)) | (1L << (INCLUDING - 81)) | (1L << (INITIAL - 81)) | (1L << (INPUT - 81)) | (1L << (INTERVAL - 81)) | (1L << (INVOKER - 81)) | (1L << (IO - 81)) | (1L << (ISOLATION - 81)) | (1L << (JSON - 81)) | (1L << (LAST - 81)) | (1L << (LATERAL - 81)) | (1L << (LEVEL - 81)) | (1L << (LIMIT - 81)) | (1L << (LOGICAL - 81)) | (1L << (MAP - 81)) | (1L << (MATCH - 81)) | (1L << (MATCHED - 81)) | (1L << (MATCHES - 81)) | (1L << (MATCH_RECOGNIZE - 81)) | (1L << (MATERIALIZED - 81)) | (1L << (MEASURES - 81)) | (1L << (MERGE - 81)) | (1L << (MINUTE - 81)) | (1L << (MONTH - 81)) | (1L << (NEXT - 81)) | (1L << (NFC - 81)) | (1L << (NFD - 81)) | (1L << (NFKC - 81)) | (1L << (NFKD - 81)) | (1L << (NO - 81)) | (1L << (NONE - 81)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (NULLIF - 146)) | (1L << (NULLS - 146)) | (1L << (OFFSET - 146)) | (1L << (OMIT - 146)) | (1L << (ONE - 146)) | (1L << (ONLY - 146)) | (1L << (OPTION - 146)) | (1L << (ORDINALITY - 146)) | (1L << (OUTPUT - 146)) | (1L << (OVER - 146)) | (1L << (PARTITION - 146)) | (1L << (PARTITIONS - 146)) | (1L << (PAST - 146)) | (1L << (PATH - 146)) | (1L << (PATTERN - 146)) | (1L << (PER - 146)) | (1L << (PERMUTE - 146)) | (1L << (POSITION - 146)) | (1L << (PRECEDING - 146)) | (1L << (PRECISION - 146)) | (1L << (PRIVILEGES - 146)) | (1L << (PROPERTIES - 146)) | (1L << (RANGE - 146)) | (1L << (READ - 146)) | (1L << (REFRESH - 146)) | (1L << (RENAME - 146)) | (1L << (REPEATABLE - 146)) | (1L << (REPLACE - 146)) | (1L << (RESET - 146)) | (1L << (RESPECT - 146)) | (1L << (RESTRICT - 146)) | (1L << (REVOKE - 146)) | (1L << (ROLE - 146)) | (1L << (ROLES - 146)) | (1L << (ROLLBACK - 146)) | (1L << (ROW - 146)) | (1L << (ROWS - 146)) | (1L << (RUNNING - 146)) | (1L << (SCHEMA - 146)) | (1L << (SCHEMAS - 146)) | (1L << (SECOND - 146)) | (1L << (SECURITY - 146)) | (1L << (SEEK - 146)) | (1L << (SERIALIZABLE - 146)) | (1L << (SESSION - 146)) | (1L << (SET - 146)) | (1L << (SETS - 146)) | (1L << (SHOW - 146)) | (1L << (SOME - 146)) | (1L << (START - 146)) | (1L << (STATS - 146)) | (1L << (SUBSET - 146)) | (1L << (SUBSTRING - 146)) | (1L << (SYSTEM - 146)))) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (TABLES - 210)) | (1L << (TABLESAMPLE - 210)) | (1L << (TEXT - 210)) | (1L << (TIES - 210)) | (1L << (TIME - 210)) | (1L << (TIMESTAMP - 210)) | (1L << (TO - 210)) | (1L << (TRANSACTION - 210)) | (1L << (TRY_CAST - 210)) | (1L << (TYPE - 210)) | (1L << (UNBOUNDED - 210)) | (1L << (UNCOMMITTED - 210)) | (1L << (UNMATCHED - 210)) | (1L << (UPDATE - 210)) | (1L << (USE - 210)) | (1L << (USER - 210)) | (1L << (VALIDATE - 210)) | (1L << (VERBOSE - 210)) | (1L << (VIEW - 210)) | (1L << (WINDOW - 210)) | (1L << (WITHOUT - 210)) | (1L << (WORK - 210)) | (1L << (WRITE - 210)) | (1L << (YEAR - 210)) | (1L << (ZONE - 210)) | (1L << (IDENTIFIER - 210)) | (1L << (DIGIT_IDENTIFIER - 210)) | (1L << (QUOTED_IDENTIFIER - 210)) | (1L << (BACKQUOTED_IDENTIFIER - 210)))) != 0)) {
					{
					setState(1649);
					identifier();
					setState(1654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1650);
						match(T__3);
						setState(1651);
						identifier();
						}
						}
						setState(1656);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1659);
				match(T__2);
				setState(1660);
				match(T__5);
				setState(1661);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1662);
				match(T__1);
				setState(1663);
				query();
				setState(1664);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1666);
				match(EXISTS);
				setState(1667);
				match(T__1);
				setState(1668);
				query();
				setState(1669);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1671);
				match(CASE);
				setState(1672);
				((SimpleCaseContext)_localctx).operand = expression();
				setState(1674); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1673);
					whenClause();
					}
					}
					setState(1676); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1678);
					match(ELSE);
					setState(1679);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1682);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1684);
				match(CASE);
				setState(1686); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1685);
					whenClause();
					}
					}
					setState(1688); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1690);
					match(ELSE);
					setState(1691);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1694);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1696);
				match(CAST);
				setState(1697);
				match(T__1);
				setState(1698);
				expression();
				setState(1699);
				match(AS);
				setState(1700);
				type(0);
				setState(1701);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1703);
				match(TRY_CAST);
				setState(1704);
				match(T__1);
				setState(1705);
				expression();
				setState(1706);
				match(AS);
				setState(1707);
				type(0);
				setState(1708);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1710);
				match(ARRAY);
				setState(1711);
				match(T__6);
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)) | (1L << (MATCHED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (RUNNING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (QUESTION_MARK - 257)) | (1L << (STRING - 257)) | (1L << (UNICODE_STRING - 257)) | (1L << (BINARY_LITERAL - 257)) | (1L << (INTEGER_VALUE - 257)) | (1L << (DECIMAL_VALUE - 257)) | (1L << (DOUBLE_VALUE - 257)) | (1L << (IDENTIFIER - 257)) | (1L << (DIGIT_IDENTIFIER - 257)) | (1L << (QUOTED_IDENTIFIER - 257)) | (1L << (BACKQUOTED_IDENTIFIER - 257)))) != 0)) {
					{
					setState(1712);
					expression();
					setState(1717);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1713);
						match(T__3);
						setState(1714);
						expression();
						}
						}
						setState(1719);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1722);
				match(T__7);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1723);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1724);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1725);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1726);
					match(T__1);
					setState(1727);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1728);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1731);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1732);
					match(T__1);
					setState(1733);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1734);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1737);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1738);
					match(T__1);
					setState(1739);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1740);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1743);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1744);
					match(T__1);
					setState(1745);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1746);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1749);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 31:
				{
				_localctx = new CurrentCatalogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1750);
				((CurrentCatalogContext)_localctx).name = match(CURRENT_CATALOG);
				}
				break;
			case 32:
				{
				_localctx = new CurrentSchemaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1751);
				((CurrentSchemaContext)_localctx).name = match(CURRENT_SCHEMA);
				}
				break;
			case 33:
				{
				_localctx = new CurrentPathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1752);
				((CurrentPathContext)_localctx).name = match(CURRENT_PATH);
				}
				break;
			case 34:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1753);
				match(SUBSTRING);
				setState(1754);
				match(T__1);
				setState(1755);
				valueExpression(0);
				setState(1756);
				match(FROM);
				setState(1757);
				valueExpression(0);
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1758);
					match(FOR);
					setState(1759);
					valueExpression(0);
					}
				}

				setState(1762);
				match(T__2);
				}
				break;
			case 35:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1764);
				match(NORMALIZE);
				setState(1765);
				match(T__1);
				setState(1766);
				valueExpression(0);
				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1767);
					match(T__3);
					setState(1768);
					normalForm();
					}
				}

				setState(1771);
				match(T__2);
				}
				break;
			case 36:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1773);
				match(EXTRACT);
				setState(1774);
				match(T__1);
				setState(1775);
				identifier();
				setState(1776);
				match(FROM);
				setState(1777);
				valueExpression(0);
				setState(1778);
				match(T__2);
				}
				break;
			case 37:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1780);
				match(T__1);
				setState(1781);
				expression();
				setState(1782);
				match(T__2);
				}
				break;
			case 38:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1784);
				match(GROUPING);
				setState(1785);
				match(T__1);
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADMIN - 17)) | (1L << (AFTER - 17)) | (1L << (ALL - 17)) | (1L << (ANALYZE - 17)) | (1L << (ANY - 17)) | (1L << (ARRAY - 17)) | (1L << (ASC - 17)) | (1L << (AT - 17)) | (1L << (AUTHORIZATION - 17)) | (1L << (BERNOULLI - 17)) | (1L << (CALL - 17)) | (1L << (CASCADE - 17)) | (1L << (CATALOGS - 17)) | (1L << (COLUMN - 17)) | (1L << (COLUMNS - 17)) | (1L << (COMMENT - 17)) | (1L << (COMMIT - 17)) | (1L << (COMMITTED - 17)) | (1L << (CURRENT - 17)) | (1L << (DATA - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)) | (1L << (DEFINER - 17)) | (1L << (DESC - 17)) | (1L << (DEFINE - 17)) | (1L << (DISTRIBUTED - 17)) | (1L << (DOUBLE - 17)) | (1L << (EMPTY - 17)) | (1L << (EXCLUDING - 17)) | (1L << (EXPLAIN - 17)) | (1L << (FETCH - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FILTER - 81)) | (1L << (FINAL - 81)) | (1L << (FIRST - 81)) | (1L << (FOLLOWING - 81)) | (1L << (FORMAT - 81)) | (1L << (FUNCTIONS - 81)) | (1L << (GRANT - 81)) | (1L << (GRANTED - 81)) | (1L << (GRANTS - 81)) | (1L << (GRAPHVIZ - 81)) | (1L << (GROUPS - 81)) | (1L << (HOUR - 81)) | (1L << (IF - 81)) | (1L << (IGNORE - 81)) | (1L << (INCLUDING - 81)) | (1L << (INITIAL - 81)) | (1L << (INPUT - 81)) | (1L << (INTERVAL - 81)) | (1L << (INVOKER - 81)) | (1L << (IO - 81)) | (1L << (ISOLATION - 81)) | (1L << (JSON - 81)) | (1L << (LAST - 81)) | (1L << (LATERAL - 81)) | (1L << (LEVEL - 81)) | (1L << (LIMIT - 81)) | (1L << (LOGICAL - 81)) | (1L << (MAP - 81)) | (1L << (MATCH - 81)) | (1L << (MATCHED - 81)) | (1L << (MATCHES - 81)) | (1L << (MATCH_RECOGNIZE - 81)) | (1L << (MATERIALIZED - 81)) | (1L << (MEASURES - 81)) | (1L << (MERGE - 81)) | (1L << (MINUTE - 81)) | (1L << (MONTH - 81)) | (1L << (NEXT - 81)) | (1L << (NFC - 81)) | (1L << (NFD - 81)) | (1L << (NFKC - 81)) | (1L << (NFKD - 81)) | (1L << (NO - 81)) | (1L << (NONE - 81)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (NULLIF - 146)) | (1L << (NULLS - 146)) | (1L << (OFFSET - 146)) | (1L << (OMIT - 146)) | (1L << (ONE - 146)) | (1L << (ONLY - 146)) | (1L << (OPTION - 146)) | (1L << (ORDINALITY - 146)) | (1L << (OUTPUT - 146)) | (1L << (OVER - 146)) | (1L << (PARTITION - 146)) | (1L << (PARTITIONS - 146)) | (1L << (PAST - 146)) | (1L << (PATH - 146)) | (1L << (PATTERN - 146)) | (1L << (PER - 146)) | (1L << (PERMUTE - 146)) | (1L << (POSITION - 146)) | (1L << (PRECEDING - 146)) | (1L << (PRECISION - 146)) | (1L << (PRIVILEGES - 146)) | (1L << (PROPERTIES - 146)) | (1L << (RANGE - 146)) | (1L << (READ - 146)) | (1L << (REFRESH - 146)) | (1L << (RENAME - 146)) | (1L << (REPEATABLE - 146)) | (1L << (REPLACE - 146)) | (1L << (RESET - 146)) | (1L << (RESPECT - 146)) | (1L << (RESTRICT - 146)) | (1L << (REVOKE - 146)) | (1L << (ROLE - 146)) | (1L << (ROLES - 146)) | (1L << (ROLLBACK - 146)) | (1L << (ROW - 146)) | (1L << (ROWS - 146)) | (1L << (RUNNING - 146)) | (1L << (SCHEMA - 146)) | (1L << (SCHEMAS - 146)) | (1L << (SECOND - 146)) | (1L << (SECURITY - 146)) | (1L << (SEEK - 146)) | (1L << (SERIALIZABLE - 146)) | (1L << (SESSION - 146)) | (1L << (SET - 146)) | (1L << (SETS - 146)) | (1L << (SHOW - 146)) | (1L << (SOME - 146)) | (1L << (START - 146)) | (1L << (STATS - 146)) | (1L << (SUBSET - 146)) | (1L << (SUBSTRING - 146)) | (1L << (SYSTEM - 146)))) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (TABLES - 210)) | (1L << (TABLESAMPLE - 210)) | (1L << (TEXT - 210)) | (1L << (TIES - 210)) | (1L << (TIME - 210)) | (1L << (TIMESTAMP - 210)) | (1L << (TO - 210)) | (1L << (TRANSACTION - 210)) | (1L << (TRY_CAST - 210)) | (1L << (TYPE - 210)) | (1L << (UNBOUNDED - 210)) | (1L << (UNCOMMITTED - 210)) | (1L << (UNMATCHED - 210)) | (1L << (UPDATE - 210)) | (1L << (USE - 210)) | (1L << (USER - 210)) | (1L << (VALIDATE - 210)) | (1L << (VERBOSE - 210)) | (1L << (VIEW - 210)) | (1L << (WINDOW - 210)) | (1L << (WITHOUT - 210)) | (1L << (WORK - 210)) | (1L << (WRITE - 210)) | (1L << (YEAR - 210)) | (1L << (ZONE - 210)) | (1L << (IDENTIFIER - 210)) | (1L << (DIGIT_IDENTIFIER - 210)) | (1L << (QUOTED_IDENTIFIER - 210)) | (1L << (BACKQUOTED_IDENTIFIER - 210)))) != 0)) {
					{
					setState(1786);
					qualifiedName();
					setState(1791);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1787);
						match(T__3);
						setState(1788);
						qualifiedName();
						}
						}
						setState(1793);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1796);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1807);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1799);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1800);
						match(T__6);
						setState(1801);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1802);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1804);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1805);
						match(T__0);
						setState(1806);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
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

	public static class ProcessingModeContext extends ParserRuleContext {
		public TerminalNode RUNNING() { return getToken(TrinoSqlBaseParser.RUNNING, 0); }
		public TerminalNode FINAL() { return getToken(TrinoSqlBaseParser.FINAL, 0); }
		public ProcessingModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processingMode; }
	}

	public final ProcessingModeContext processingMode() throws RecognitionException {
		ProcessingModeContext _localctx = new ProcessingModeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_processingMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			_la = _input.LA(1);
			if ( !(_la==FINAL || _la==RUNNING) ) {
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

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(TrinoSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(TrinoSqlBaseParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(TrinoSqlBaseParser.RESPECT, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nullTreatment);
		try {
			setState(1818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				match(IGNORE);
				setState(1815);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1816);
				match(RESPECT);
				setState(1817);
				match(NULLS);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(TrinoSqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(TrinoSqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(TrinoSqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(TrinoSqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_string);
		try {
			setState(1826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1820);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1821);
				match(UNICODE_STRING);
				setState(1824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1822);
					match(UESCAPE);
					setState(1823);
					match(STRING);
					}
					break;
				}
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

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(TrinoSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(TrinoSqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(TrinoSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(TrinoSqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_timeZoneSpecifier);
		try {
			setState(1834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1828);
				match(TIME);
				setState(1829);
				match(ZONE);
				setState(1830);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1831);
				match(TIME);
				setState(1832);
				match(ZONE);
				setState(1833);
				string();
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(TrinoSqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(TrinoSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(TrinoSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(TrinoSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(TrinoSqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			_la = _input.LA(1);
			if ( !(((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & ((1L << (EQ - 245)) | (1L << (NEQ - 245)) | (1L << (LT - 245)) | (1L << (LTE - 245)) | (1L << (GT - 245)) | (1L << (GTE - 245)))) != 0)) ) {
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

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(TrinoSqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(TrinoSqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(TrinoSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TrinoSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(TrinoSqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(TrinoSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			match(INTERVAL);
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1843);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1846);
			string();
			setState(1847);
			((IntervalContext)_localctx).from = intervalField();
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1848);
				match(TO);
				setState(1849);
				((IntervalContext)_localctx).to = intervalField();
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(TrinoSqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(TrinoSqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(TrinoSqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(TrinoSqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(TrinoSqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(TrinoSqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (HOUR - 98)) | (1L << (MINUTE - 98)) | (1L << (MONTH - 98)))) != 0) || _la==SECOND || _la==YEAR) ) {
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

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(TrinoSqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(TrinoSqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(TrinoSqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(TrinoSqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (NFC - 137)) | (1L << (NFD - 137)) | (1L << (NFKC - 137)) | (1L << (NFKD - 137)))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowTypeContext extends TypeContext {
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public List<RowFieldContext> rowField() {
			return getRuleContexts(RowFieldContext.class);
		}
		public RowFieldContext rowField(int i) {
			return getRuleContext(RowFieldContext.class,i);
		}
		public RowTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class IntervalTypeContext extends TypeContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(TrinoSqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public IntervalTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(TrinoSqlBaseParser.ARRAY, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class DoublePrecisionTypeContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(TrinoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(TrinoSqlBaseParser.PRECISION, 0); }
		public DoublePrecisionTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class LegacyArrayTypeContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(TrinoSqlBaseParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(TrinoSqlBaseParser.LT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(TrinoSqlBaseParser.GT, 0); }
		public LegacyArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class GenericTypeContext extends TypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public GenericTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class DateTimeTypeContext extends TypeContext {
		public Token base;
		public TypeParameterContext precision;
		public TerminalNode TIMESTAMP() { return getToken(TrinoSqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode WITHOUT() { return getToken(TrinoSqlBaseParser.WITHOUT, 0); }
		public List<TerminalNode> TIME() { return getTokens(TrinoSqlBaseParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(TrinoSqlBaseParser.TIME, i);
		}
		public TerminalNode ZONE() { return getToken(TrinoSqlBaseParser.ZONE, 0); }
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TrinoSqlBaseParser.WITH, 0); }
		public DateTimeTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class LegacyMapTypeContext extends TypeContext {
		public TypeContext keyType;
		public TypeContext valueType;
		public TerminalNode MAP() { return getToken(TrinoSqlBaseParser.MAP, 0); }
		public TerminalNode LT() { return getToken(TrinoSqlBaseParser.LT, 0); }
		public TerminalNode GT() { return getToken(TrinoSqlBaseParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public LegacyMapTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				_localctx = new RowTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1857);
				match(ROW);
				setState(1858);
				match(T__1);
				setState(1859);
				rowField();
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1860);
					match(T__3);
					setState(1861);
					rowField();
					}
					}
					setState(1866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1867);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new IntervalTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1869);
				match(INTERVAL);
				setState(1870);
				((IntervalTypeContext)_localctx).from = intervalField();
				setState(1873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1871);
					match(TO);
					setState(1872);
					((IntervalTypeContext)_localctx).to = intervalField();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1875);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1876);
					match(T__1);
					setState(1877);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1878);
					match(T__2);
					}
					break;
				}
				setState(1885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1882);
					match(WITHOUT);
					setState(1883);
					match(TIME);
					setState(1884);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1887);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1888);
					match(T__1);
					setState(1889);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1890);
					match(T__2);
					}
				}

				setState(1894);
				match(WITH);
				setState(1895);
				match(TIME);
				setState(1896);
				match(ZONE);
				}
				break;
			case 5:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1897);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1898);
					match(T__1);
					setState(1899);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1900);
					match(T__2);
					}
					break;
				}
				setState(1907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1904);
					match(WITHOUT);
					setState(1905);
					match(TIME);
					setState(1906);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1909);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1910);
					match(T__1);
					setState(1911);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1912);
					match(T__2);
					}
				}

				setState(1916);
				match(WITH);
				setState(1917);
				match(TIME);
				setState(1918);
				match(ZONE);
				}
				break;
			case 7:
				{
				_localctx = new DoublePrecisionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1919);
				match(DOUBLE);
				setState(1920);
				match(PRECISION);
				}
				break;
			case 8:
				{
				_localctx = new LegacyArrayTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1921);
				match(ARRAY);
				setState(1922);
				match(LT);
				setState(1923);
				type(0);
				setState(1924);
				match(GT);
				}
				break;
			case 9:
				{
				_localctx = new LegacyMapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1926);
				match(MAP);
				setState(1927);
				match(LT);
				setState(1928);
				((LegacyMapTypeContext)_localctx).keyType = type(0);
				setState(1929);
				match(T__3);
				setState(1930);
				((LegacyMapTypeContext)_localctx).valueType = type(0);
				setState(1931);
				match(GT);
				}
				break;
			case 10:
				{
				_localctx = new GenericTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1933);
				identifier();
				setState(1945);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1934);
					match(T__1);
					setState(1935);
					typeParameter();
					setState(1940);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1936);
						match(T__3);
						setState(1937);
						typeParameter();
						}
						}
						setState(1942);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1943);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1949);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1950);
					match(ARRAY);
					setState(1954);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
					case 1:
						{
						setState(1951);
						match(T__6);
						setState(1952);
						match(INTEGER_VALUE);
						setState(1953);
						match(T__7);
						}
						break;
					}
					}
					} 
				}
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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

	public static class RowFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RowFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowField; }
	}

	public final RowFieldContext rowField() throws RecognitionException {
		RowFieldContext _localctx = new RowFieldContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_rowField);
		try {
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1961);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				identifier();
				setState(1963);
				type(0);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_typeParameter);
		try {
			setState(1969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1967);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case AFTER:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1968);
				type(0);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(TrinoSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(TrinoSqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(WHEN);
			setState(1972);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1973);
			match(THEN);
			setState(1974);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(TrinoSqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(TrinoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			match(FILTER);
			setState(1977);
			match(T__1);
			setState(1978);
			match(WHERE);
			setState(1979);
			booleanExpression(0);
			setState(1980);
			match(T__2);
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

	public static class MergeCaseContext extends ParserRuleContext {
		public MergeCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeCase; }
	 
		public MergeCaseContext() { }
		public void copyFrom(MergeCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MergeInsertContext extends MergeCaseContext {
		public ExpressionContext condition;
		public IdentifierContext identifier;
		public List<IdentifierContext> targets = new ArrayList<IdentifierContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public TerminalNode WHEN() { return getToken(TrinoSqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(TrinoSqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(TrinoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(TrinoSqlBaseParser.THEN, 0); }
		public TerminalNode INSERT() { return getToken(TrinoSqlBaseParser.INSERT, 0); }
		public TerminalNode VALUES() { return getToken(TrinoSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MergeInsertContext(MergeCaseContext ctx) { copyFrom(ctx); }
	}
	public static class MergeUpdateContext extends MergeCaseContext {
		public ExpressionContext condition;
		public IdentifierContext identifier;
		public List<IdentifierContext> targets = new ArrayList<IdentifierContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public TerminalNode WHEN() { return getToken(TrinoSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(TrinoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(TrinoSqlBaseParser.THEN, 0); }
		public TerminalNode UPDATE() { return getToken(TrinoSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public List<TerminalNode> EQ() { return getTokens(TrinoSqlBaseParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(TrinoSqlBaseParser.EQ, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public MergeUpdateContext(MergeCaseContext ctx) { copyFrom(ctx); }
	}
	public static class MergeDeleteContext extends MergeCaseContext {
		public ExpressionContext condition;
		public TerminalNode WHEN() { return getToken(TrinoSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(TrinoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(TrinoSqlBaseParser.THEN, 0); }
		public TerminalNode DELETE() { return getToken(TrinoSqlBaseParser.DELETE, 0); }
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MergeDeleteContext(MergeCaseContext ctx) { copyFrom(ctx); }
	}

	public final MergeCaseContext mergeCase() throws RecognitionException {
		MergeCaseContext _localctx = new MergeCaseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_mergeCase);
		int _la;
		try {
			setState(2046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				_localctx = new MergeUpdateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1982);
				match(WHEN);
				setState(1983);
				match(MATCHED);
				setState(1986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(1984);
					match(AND);
					setState(1985);
					((MergeUpdateContext)_localctx).condition = expression();
					}
				}

				setState(1988);
				match(THEN);
				setState(1989);
				match(UPDATE);
				setState(1990);
				match(SET);
				setState(1991);
				((MergeUpdateContext)_localctx).identifier = identifier();
				((MergeUpdateContext)_localctx).targets.add(((MergeUpdateContext)_localctx).identifier);
				setState(1992);
				match(EQ);
				setState(1993);
				((MergeUpdateContext)_localctx).expression = expression();
				((MergeUpdateContext)_localctx).values.add(((MergeUpdateContext)_localctx).expression);
				setState(2001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1994);
					match(T__3);
					setState(1995);
					((MergeUpdateContext)_localctx).identifier = identifier();
					((MergeUpdateContext)_localctx).targets.add(((MergeUpdateContext)_localctx).identifier);
					setState(1996);
					match(EQ);
					setState(1997);
					((MergeUpdateContext)_localctx).expression = expression();
					((MergeUpdateContext)_localctx).values.add(((MergeUpdateContext)_localctx).expression);
					}
					}
					setState(2003);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new MergeDeleteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2004);
				match(WHEN);
				setState(2005);
				match(MATCHED);
				setState(2008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(2006);
					match(AND);
					setState(2007);
					((MergeDeleteContext)_localctx).condition = expression();
					}
				}

				setState(2010);
				match(THEN);
				setState(2011);
				match(DELETE);
				}
				break;
			case 3:
				_localctx = new MergeInsertContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2012);
				match(WHEN);
				setState(2013);
				match(NOT);
				setState(2014);
				match(MATCHED);
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(2015);
					match(AND);
					setState(2016);
					((MergeInsertContext)_localctx).condition = expression();
					}
				}

				setState(2019);
				match(THEN);
				setState(2020);
				match(INSERT);
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2021);
					match(T__1);
					setState(2022);
					((MergeInsertContext)_localctx).identifier = identifier();
					((MergeInsertContext)_localctx).targets.add(((MergeInsertContext)_localctx).identifier);
					setState(2027);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2023);
						match(T__3);
						setState(2024);
						((MergeInsertContext)_localctx).identifier = identifier();
						((MergeInsertContext)_localctx).targets.add(((MergeInsertContext)_localctx).identifier);
						}
						}
						setState(2029);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2030);
					match(T__2);
					}
				}

				setState(2034);
				match(VALUES);
				setState(2035);
				match(T__1);
				setState(2036);
				((MergeInsertContext)_localctx).expression = expression();
				((MergeInsertContext)_localctx).values.add(((MergeInsertContext)_localctx).expression);
				setState(2041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2037);
					match(T__3);
					setState(2038);
					((MergeInsertContext)_localctx).expression = expression();
					((MergeInsertContext)_localctx).values.add(((MergeInsertContext)_localctx).expression);
					}
					}
					setState(2043);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2044);
				match(T__2);
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

	public static class OverContext extends ParserRuleContext {
		public IdentifierContext windowName;
		public TerminalNode OVER() { return getToken(TrinoSqlBaseParser.OVER, 0); }
		public WindowSpecificationContext windowSpecification() {
			return getRuleContext(WindowSpecificationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_over);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			match(OVER);
			setState(2054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case AFTER:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				setState(2049);
				((OverContext)_localctx).windowName = identifier();
				}
				break;
			case T__1:
				{
				setState(2050);
				match(T__1);
				setState(2051);
				windowSpecification();
				setState(2052);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(TrinoSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(TrinoSqlBaseParser.ROWS, 0); }
		public TerminalNode GROUPS() { return getToken(TrinoSqlBaseParser.GROUPS, 0); }
		public TerminalNode BETWEEN() { return getToken(TrinoSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(TrinoSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_windowFrame);
		try {
			setState(2080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2056);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2057);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2058);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2059);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2060);
				((WindowFrameContext)_localctx).frameType = match(GROUPS);
				setState(2061);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2062);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2063);
				match(BETWEEN);
				setState(2064);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2065);
				match(AND);
				setState(2066);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2068);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2069);
				match(BETWEEN);
				setState(2070);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2071);
				match(AND);
				setState(2072);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2074);
				((WindowFrameContext)_localctx).frameType = match(GROUPS);
				setState(2075);
				match(BETWEEN);
				setState(2076);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2077);
				match(AND);
				setState(2078);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(TrinoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(TrinoSqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(TrinoSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(TrinoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(TrinoSqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(TrinoSqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_frameBound);
		int _la;
		try {
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2082);
				match(UNBOUNDED);
				setState(2083);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2084);
				match(UNBOUNDED);
				setState(2085);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2086);
				match(CURRENT);
				setState(2087);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2088);
				expression();
				setState(2089);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class RowPatternContext extends ParserRuleContext {
		public RowPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowPattern; }
	 
		public RowPatternContext() { }
		public void copyFrom(RowPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuantifiedPrimaryContext extends RowPatternContext {
		public PatternPrimaryContext patternPrimary() {
			return getRuleContext(PatternPrimaryContext.class,0);
		}
		public PatternQuantifierContext patternQuantifier() {
			return getRuleContext(PatternQuantifierContext.class,0);
		}
		public QuantifiedPrimaryContext(RowPatternContext ctx) { copyFrom(ctx); }
	}
	public static class PatternConcatenationContext extends RowPatternContext {
		public List<RowPatternContext> rowPattern() {
			return getRuleContexts(RowPatternContext.class);
		}
		public RowPatternContext rowPattern(int i) {
			return getRuleContext(RowPatternContext.class,i);
		}
		public PatternConcatenationContext(RowPatternContext ctx) { copyFrom(ctx); }
	}
	public static class PatternAlternationContext extends RowPatternContext {
		public List<RowPatternContext> rowPattern() {
			return getRuleContexts(RowPatternContext.class);
		}
		public RowPatternContext rowPattern(int i) {
			return getRuleContext(RowPatternContext.class,i);
		}
		public PatternAlternationContext(RowPatternContext ctx) { copyFrom(ctx); }
	}

	public final RowPatternContext rowPattern() throws RecognitionException {
		return rowPattern(0);
	}

	private RowPatternContext rowPattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RowPatternContext _localctx = new RowPatternContext(_ctx, _parentState);
		RowPatternContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_rowPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QuantifiedPrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2094);
			patternPrimary();
			setState(2096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2095);
				patternQuantifier();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
					case 1:
						{
						_localctx = new PatternConcatenationContext(new RowPatternContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rowPattern);
						setState(2098);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2099);
						rowPattern(3);
						}
						break;
					case 2:
						{
						_localctx = new PatternAlternationContext(new RowPatternContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rowPattern);
						setState(2100);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2101);
						match(T__8);
						setState(2102);
						rowPattern(2);
						}
						break;
					}
					} 
				}
				setState(2107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
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

	public static class PatternPrimaryContext extends ParserRuleContext {
		public PatternPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternPrimary; }
	 
		public PatternPrimaryContext() { }
		public void copyFrom(PatternPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PatternPermutationContext extends PatternPrimaryContext {
		public TerminalNode PERMUTE() { return getToken(TrinoSqlBaseParser.PERMUTE, 0); }
		public List<RowPatternContext> rowPattern() {
			return getRuleContexts(RowPatternContext.class);
		}
		public RowPatternContext rowPattern(int i) {
			return getRuleContext(RowPatternContext.class,i);
		}
		public PatternPermutationContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class PartitionEndAnchorContext extends PatternPrimaryContext {
		public PartitionEndAnchorContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class PatternVariableContext extends PatternPrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PatternVariableContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class ExcludedPatternContext extends PatternPrimaryContext {
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public ExcludedPatternContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class PartitionStartAnchorContext extends PatternPrimaryContext {
		public PartitionStartAnchorContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyPatternContext extends PatternPrimaryContext {
		public EmptyPatternContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class GroupedPatternContext extends PatternPrimaryContext {
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public GroupedPatternContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final PatternPrimaryContext patternPrimary() throws RecognitionException {
		PatternPrimaryContext _localctx = new PatternPrimaryContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_patternPrimary);
		int _la;
		try {
			setState(2133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				_localctx = new PatternVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2108);
				identifier();
				}
				break;
			case 2:
				_localctx = new EmptyPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				match(T__1);
				setState(2110);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new PatternPermutationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2111);
				match(PERMUTE);
				setState(2112);
				match(T__1);
				setState(2113);
				rowPattern(0);
				setState(2118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2114);
					match(T__3);
					setState(2115);
					rowPattern(0);
					}
					}
					setState(2120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2121);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new GroupedPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2123);
				match(T__1);
				setState(2124);
				rowPattern(0);
				setState(2125);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new PartitionStartAnchorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2127);
				match(T__9);
				}
				break;
			case 6:
				_localctx = new PartitionEndAnchorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2128);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new ExcludedPatternContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2129);
				match(T__11);
				setState(2130);
				rowPattern(0);
				setState(2131);
				match(T__12);
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

	public static class PatternQuantifierContext extends ParserRuleContext {
		public PatternQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternQuantifier; }
	 
		public PatternQuantifierContext() { }
		public void copyFrom(PatternQuantifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZeroOrMoreQuantifierContext extends PatternQuantifierContext {
		public Token reluctant;
		public TerminalNode ASTERISK() { return getToken(TrinoSqlBaseParser.ASTERISK, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(TrinoSqlBaseParser.QUESTION_MARK, 0); }
		public ZeroOrMoreQuantifierContext(PatternQuantifierContext ctx) { copyFrom(ctx); }
	}
	public static class OneOrMoreQuantifierContext extends PatternQuantifierContext {
		public Token reluctant;
		public TerminalNode PLUS() { return getToken(TrinoSqlBaseParser.PLUS, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(TrinoSqlBaseParser.QUESTION_MARK, 0); }
		public OneOrMoreQuantifierContext(PatternQuantifierContext ctx) { copyFrom(ctx); }
	}
	public static class ZeroOrOneQuantifierContext extends PatternQuantifierContext {
		public Token reluctant;
		public List<TerminalNode> QUESTION_MARK() { return getTokens(TrinoSqlBaseParser.QUESTION_MARK); }
		public TerminalNode QUESTION_MARK(int i) {
			return getToken(TrinoSqlBaseParser.QUESTION_MARK, i);
		}
		public ZeroOrOneQuantifierContext(PatternQuantifierContext ctx) { copyFrom(ctx); }
	}
	public static class RangeQuantifierContext extends PatternQuantifierContext {
		public Token exactly;
		public Token reluctant;
		public Token atLeast;
		public Token atMost;
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(TrinoSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(TrinoSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(TrinoSqlBaseParser.QUESTION_MARK, 0); }
		public RangeQuantifierContext(PatternQuantifierContext ctx) { copyFrom(ctx); }
	}

	public final PatternQuantifierContext patternQuantifier() throws RecognitionException {
		PatternQuantifierContext _localctx = new PatternQuantifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_patternQuantifier);
		int _la;
		try {
			setState(2165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				_localctx = new ZeroOrMoreQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2135);
				match(ASTERISK);
				setState(2137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2136);
					((ZeroOrMoreQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new OneOrMoreQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2139);
				match(PLUS);
				setState(2141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2140);
					((OneOrMoreQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ZeroOrOneQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2143);
				match(QUESTION_MARK);
				setState(2145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2144);
					((ZeroOrOneQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new RangeQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2147);
				match(T__13);
				setState(2148);
				((RangeQuantifierContext)_localctx).exactly = match(INTEGER_VALUE);
				setState(2149);
				match(T__14);
				setState(2151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2150);
					((RangeQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new RangeQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2153);
				match(T__13);
				setState(2155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER_VALUE) {
					{
					setState(2154);
					((RangeQuantifierContext)_localctx).atLeast = match(INTEGER_VALUE);
					}
				}

				setState(2157);
				match(T__3);
				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER_VALUE) {
					{
					setState(2158);
					((RangeQuantifierContext)_localctx).atMost = match(INTEGER_VALUE);
					}
				}

				setState(2161);
				match(T__14);
				setState(2163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2162);
					((RangeQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
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

	public static class UpdateAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TrinoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignment; }
	}

	public final UpdateAssignmentContext updateAssignment() throws RecognitionException {
		UpdateAssignmentContext _localctx = new UpdateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_updateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			identifier();
			setState(2168);
			match(EQ);
			setState(2169);
			expression();
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

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(TrinoSqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(TrinoSqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(TrinoSqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode JSON() { return getToken(TrinoSqlBaseParser.JSON, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(TrinoSqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(TrinoSqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(TrinoSqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(TrinoSqlBaseParser.VALIDATE, 0); }
		public TerminalNode IO() { return getToken(TrinoSqlBaseParser.IO, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_explainOption);
		int _la;
		try {
			setState(2175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				match(FORMAT);
				setState(2172);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==JSON || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2173);
				match(TYPE);
				setState(2174);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DISTRIBUTED - 66)) | (1L << (IO - 66)) | (1L << (LOGICAL - 66)))) != 0) || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(TrinoSqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(TrinoSqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(TrinoSqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(TrinoSqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_transactionMode);
		int _la;
		try {
			setState(2182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2177);
				match(ISOLATION);
				setState(2178);
				match(LEVEL);
				setState(2179);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2180);
				match(READ);
				setState(2181);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(TrinoSqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(TrinoSqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(TrinoSqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(TrinoSqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_levelOfIsolation);
		try {
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2184);
				match(READ);
				setState(2185);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				match(READ);
				setState(2187);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2188);
				match(REPEATABLE);
				setState(2189);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2190);
				match(SERIALIZABLE);
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

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_callArgument);
		try {
			setState(2198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2193);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2194);
				identifier();
				setState(2195);
				match(T__15);
				setState(2196);
				expression();
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

	public static class PathElementContext extends ParserRuleContext {
		public PathElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElement; }
	 
		public PathElementContext() { }
		public void copyFrom(PathElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QualifiedArgumentContext extends PathElementContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedArgumentContext(PathElementContext ctx) { copyFrom(ctx); }
	}
	public static class UnqualifiedArgumentContext extends PathElementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnqualifiedArgumentContext(PathElementContext ctx) { copyFrom(ctx); }
	}

	public final PathElementContext pathElement() throws RecognitionException {
		PathElementContext _localctx = new PathElementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_pathElement);
		try {
			setState(2205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				_localctx = new QualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2200);
				identifier();
				setState(2201);
				match(T__0);
				setState(2202);
				identifier();
				}
				break;
			case 2:
				_localctx = new UnqualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2204);
				identifier();
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

	public static class PathSpecificationContext extends ParserRuleContext {
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public PathSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSpecification; }
	}

	public final PathSpecificationContext pathSpecification() throws RecognitionException {
		PathSpecificationContext _localctx = new PathSpecificationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_pathSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			pathElement();
			setState(2212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2208);
				match(T__3);
				setState(2209);
				pathElement();
				}
				}
				setState(2214);
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

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(TrinoSqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(TrinoSqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(TrinoSqlBaseParser.INSERT, 0); }
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_privilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==INSERT || _la==SELECT) ) {
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2217);
			identifier();
			setState(2222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2218);
					match(T__0);
					setState(2219);
					identifier();
					}
					} 
				}
				setState(2224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
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

	public static class GrantorContext extends ParserRuleContext {
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
	 
		public GrantorContext() { }
		public void copyFrom(GrantorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentUserGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_USER() { return getToken(TrinoSqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
	}
	public static class SpecifiedPrincipalContext extends GrantorContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SpecifiedPrincipalContext(GrantorContext ctx) { copyFrom(ctx); }
	}
	public static class CurrentRoleGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_ROLE() { return getToken(TrinoSqlBaseParser.CURRENT_ROLE, 0); }
		public CurrentRoleGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_grantor);
		try {
			setState(2228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case AFTER:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new SpecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2225);
				principal();
				}
				break;
			case CURRENT_USER:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2226);
				match(CURRENT_USER);
				}
				break;
			case CURRENT_ROLE:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2227);
				match(CURRENT_ROLE);
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

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnspecifiedPrincipalContext extends PrincipalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnspecifiedPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
	}
	public static class UserPrincipalContext extends PrincipalContext {
		public TerminalNode USER() { return getToken(TrinoSqlBaseParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
	}
	public static class RolePrincipalContext extends PrincipalContext {
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RolePrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_principal);
		try {
			setState(2235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2230);
				identifier();
				}
				break;
			case 2:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2231);
				match(USER);
				setState(2232);
				identifier();
				}
				break;
			case 3:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2233);
				match(ROLE);
				setState(2234);
				identifier();
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

	public static class RolesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
			identifier();
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2238);
				match(T__3);
				setState(2239);
				identifier();
				}
				}
				setState(2244);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(TrinoSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(TrinoSqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(TrinoSqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(TrinoSqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_identifier);
		try {
			setState(2250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2246);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case AFTER:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2247);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2248);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2249);
				match(DIGIT_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(TrinoSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(TrinoSqlBaseParser.DOUBLE_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(TrinoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(TrinoSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_number);
		int _la;
		try {
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2252);
					match(MINUS);
					}
				}

				setState(2255);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2256);
					match(MINUS);
					}
				}

				setState(2259);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2260);
					match(MINUS);
					}
				}

				setState(2263);
				match(INTEGER_VALUE);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(TrinoSqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(TrinoSqlBaseParser.ADMIN, 0); }
		public TerminalNode AFTER() { return getToken(TrinoSqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(TrinoSqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(TrinoSqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(TrinoSqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(TrinoSqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(TrinoSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(TrinoSqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(TrinoSqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BERNOULLI() { return getToken(TrinoSqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(TrinoSqlBaseParser.CALL, 0); }
		public TerminalNode CASCADE() { return getToken(TrinoSqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(TrinoSqlBaseParser.CATALOGS, 0); }
		public TerminalNode COLUMN() { return getToken(TrinoSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(TrinoSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(TrinoSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(TrinoSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(TrinoSqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(TrinoSqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(TrinoSqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(TrinoSqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(TrinoSqlBaseParser.DAY, 0); }
		public TerminalNode DEFINE() { return getToken(TrinoSqlBaseParser.DEFINE, 0); }
		public TerminalNode DEFINER() { return getToken(TrinoSqlBaseParser.DEFINER, 0); }
		public TerminalNode DESC() { return getToken(TrinoSqlBaseParser.DESC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(TrinoSqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode DOUBLE() { return getToken(TrinoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode EMPTY() { return getToken(TrinoSqlBaseParser.EMPTY, 0); }
		public TerminalNode EXCLUDING() { return getToken(TrinoSqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(TrinoSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FETCH() { return getToken(TrinoSqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(TrinoSqlBaseParser.FILTER, 0); }
		public TerminalNode FINAL() { return getToken(TrinoSqlBaseParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(TrinoSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(TrinoSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(TrinoSqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTIONS() { return getToken(TrinoSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(TrinoSqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(TrinoSqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(TrinoSqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(TrinoSqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode GROUPS() { return getToken(TrinoSqlBaseParser.GROUPS, 0); }
		public TerminalNode HOUR() { return getToken(TrinoSqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(TrinoSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(TrinoSqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(TrinoSqlBaseParser.INCLUDING, 0); }
		public TerminalNode INITIAL() { return getToken(TrinoSqlBaseParser.INITIAL, 0); }
		public TerminalNode INPUT() { return getToken(TrinoSqlBaseParser.INPUT, 0); }
		public TerminalNode INTERVAL() { return getToken(TrinoSqlBaseParser.INTERVAL, 0); }
		public TerminalNode INVOKER() { return getToken(TrinoSqlBaseParser.INVOKER, 0); }
		public TerminalNode IO() { return getToken(TrinoSqlBaseParser.IO, 0); }
		public TerminalNode ISOLATION() { return getToken(TrinoSqlBaseParser.ISOLATION, 0); }
		public TerminalNode JSON() { return getToken(TrinoSqlBaseParser.JSON, 0); }
		public TerminalNode LAST() { return getToken(TrinoSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(TrinoSqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(TrinoSqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(TrinoSqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(TrinoSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(TrinoSqlBaseParser.MAP, 0); }
		public TerminalNode MATCH() { return getToken(TrinoSqlBaseParser.MATCH, 0); }
		public TerminalNode MATCHED() { return getToken(TrinoSqlBaseParser.MATCHED, 0); }
		public TerminalNode MATCHES() { return getToken(TrinoSqlBaseParser.MATCHES, 0); }
		public TerminalNode MATCH_RECOGNIZE() { return getToken(TrinoSqlBaseParser.MATCH_RECOGNIZE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(TrinoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode MEASURES() { return getToken(TrinoSqlBaseParser.MEASURES, 0); }
		public TerminalNode MERGE() { return getToken(TrinoSqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(TrinoSqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(TrinoSqlBaseParser.MONTH, 0); }
		public TerminalNode NEXT() { return getToken(TrinoSqlBaseParser.NEXT, 0); }
		public TerminalNode NFC() { return getToken(TrinoSqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(TrinoSqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(TrinoSqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(TrinoSqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(TrinoSqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(TrinoSqlBaseParser.NONE, 0); }
		public TerminalNode NULLIF() { return getToken(TrinoSqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(TrinoSqlBaseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(TrinoSqlBaseParser.OFFSET, 0); }
		public TerminalNode OMIT() { return getToken(TrinoSqlBaseParser.OMIT, 0); }
		public TerminalNode ONE() { return getToken(TrinoSqlBaseParser.ONE, 0); }
		public TerminalNode ONLY() { return getToken(TrinoSqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(TrinoSqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(TrinoSqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(TrinoSqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(TrinoSqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(TrinoSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(TrinoSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PAST() { return getToken(TrinoSqlBaseParser.PAST, 0); }
		public TerminalNode PATH() { return getToken(TrinoSqlBaseParser.PATH, 0); }
		public TerminalNode PATTERN() { return getToken(TrinoSqlBaseParser.PATTERN, 0); }
		public TerminalNode PER() { return getToken(TrinoSqlBaseParser.PER, 0); }
		public TerminalNode PERMUTE() { return getToken(TrinoSqlBaseParser.PERMUTE, 0); }
		public TerminalNode POSITION() { return getToken(TrinoSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(TrinoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRECISION() { return getToken(TrinoSqlBaseParser.PRECISION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(TrinoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(TrinoSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(TrinoSqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(TrinoSqlBaseParser.READ, 0); }
		public TerminalNode REFRESH() { return getToken(TrinoSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(TrinoSqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(TrinoSqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(TrinoSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(TrinoSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(TrinoSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(TrinoSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(TrinoSqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(TrinoSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(TrinoSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(TrinoSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(TrinoSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(TrinoSqlBaseParser.ROWS, 0); }
		public TerminalNode RUNNING() { return getToken(TrinoSqlBaseParser.RUNNING, 0); }
		public TerminalNode SCHEMA() { return getToken(TrinoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(TrinoSqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(TrinoSqlBaseParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(TrinoSqlBaseParser.SECURITY, 0); }
		public TerminalNode SEEK() { return getToken(TrinoSqlBaseParser.SEEK, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(TrinoSqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(TrinoSqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(TrinoSqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(TrinoSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(TrinoSqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(TrinoSqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(TrinoSqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(TrinoSqlBaseParser.STATS, 0); }
		public TerminalNode SUBSET() { return getToken(TrinoSqlBaseParser.SUBSET, 0); }
		public TerminalNode SUBSTRING() { return getToken(TrinoSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(TrinoSqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(TrinoSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(TrinoSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEXT() { return getToken(TrinoSqlBaseParser.TEXT, 0); }
		public TerminalNode TIES() { return getToken(TrinoSqlBaseParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(TrinoSqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(TrinoSqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(TrinoSqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(TrinoSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRY_CAST() { return getToken(TrinoSqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(TrinoSqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(TrinoSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(TrinoSqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode UNMATCHED() { return getToken(TrinoSqlBaseParser.UNMATCHED, 0); }
		public TerminalNode UPDATE() { return getToken(TrinoSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(TrinoSqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(TrinoSqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(TrinoSqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(TrinoSqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(TrinoSqlBaseParser.VIEW, 0); }
		public TerminalNode WINDOW() { return getToken(TrinoSqlBaseParser.WINDOW, 0); }
		public TerminalNode WITHOUT() { return getToken(TrinoSqlBaseParser.WITHOUT, 0); }
		public TerminalNode WORK() { return getToken(TrinoSqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(TrinoSqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(TrinoSqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(TrinoSqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)) | (1L << (MATCHED - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (RUNNING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)))) != 0)) ) {
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
		case 16:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 28:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 44:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 46:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 47:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 58:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 67:
			return rowPattern_sempred((RowPatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rowPattern_sempred(RowPatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0112\u08df\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\3"+
		"\7\3\7\3\7\5\7\u00ce\n\7\3\7\3\7\5\7\u00d2\n\7\3\7\3\7\3\7\3\7\5\7\u00d8"+
		"\n\7\3\7\3\7\5\7\u00dc\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f1\n\7\3\7\3\7\5\7\u00f5\n\7\3"+
		"\7\3\7\5\7\u00f9\n\7\3\7\3\7\5\7\u00fd\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0105\n\7\3\7\3\7\5\7\u0109\n\7\3\7\5\7\u010c\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0113\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u011a\n\7\f\7\16\7\u011d\13\7\3"+
		"\7\3\7\3\7\5\7\u0122\n\7\3\7\3\7\5\7\u0126\n\7\3\7\3\7\3\7\3\7\5\7\u012c"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0133\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u013c\n\7\3\7\3\7\3\7\3\7\5\7\u0142\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0150\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0159"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u015f\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0166\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0170\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0177"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u017f\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0187\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0196"+
		"\n\7\3\7\3\7\3\7\5\7\u019b\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01a2\n\7\3\7\3"+
		"\7\3\7\5\7\u01a7\n\7\3\7\3\7\5\7\u01ab\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u01b3\n\7\3\7\3\7\3\7\3\7\5\7\u01b9\n\7\3\7\3\7\5\7\u01bd\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01cb\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u01d2\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01e9\n\7\f\7\16\7\u01ec\13\7\5\7"+
		"\u01ee\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01f8\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u0203\n\7\f\7\16\7\u0206\13\7\3\7\3\7\3\7\5"+
		"\7\u020b\n\7\3\7\3\7\3\7\5\7\u0210\n\7\3\7\3\7\3\7\3\7\5\7\u0216\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u021d\n\7\f\7\16\7\u0220\13\7\3\7\3\7\3\7\5\7\u0225"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u022c\n\7\3\7\3\7\3\7\3\7\7\7\u0232\n\7\f"+
		"\7\16\7\u0235\13\7\3\7\3\7\5\7\u0239\n\7\3\7\3\7\5\7\u023d\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0245\n\7\3\7\3\7\3\7\3\7\5\7\u024b\n\7\3\7\3\7\3"+
		"\7\7\7\u0250\n\7\f\7\16\7\u0253\13\7\3\7\3\7\5\7\u0257\n\7\3\7\3\7\5\7"+
		"\u025b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0265\n\7\3\7\5\7\u0268"+
		"\n\7\3\7\3\7\5\7\u026c\n\7\3\7\5\7\u026f\n\7\3\7\3\7\3\7\3\7\7\7\u0275"+
		"\n\7\f\7\16\7\u0278\13\7\3\7\3\7\5\7\u027c\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0294"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u029a\n\7\5\7\u029c\n\7\3\7\3\7\3\7\3\7\5\7\u02a2"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u02a8\n\7\5\7\u02aa\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u02b2\n\7\5\7\u02b4\n\7\3\7\3\7\3\7\3\7\5\7\u02ba\n\7\3\7\3\7\3"+
		"\7\3\7\5\7\u02c0\n\7\5\7\u02c2\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u02d1\n\7\3\7\3\7\3\7\5\7\u02d6\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u02dd\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u02e9"+
		"\n\7\5\7\u02eb\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u02f3\n\7\5\7\u02f5\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0305\n\7"+
		"\f\7\16\7\u0308\13\7\5\7\u030a\n\7\3\7\3\7\5\7\u030e\n\7\3\7\3\7\5\7\u0312"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0322"+
		"\n\7\f\7\16\7\u0325\13\7\5\7\u0327\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0338\n\7\f\7\16\7\u033b\13\7\3\7\3\7"+
		"\5\7\u033f\n\7\3\7\3\7\3\7\3\7\5\7\u0345\n\7\3\7\5\7\u0348\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\6\7\u034f\n\7\r\7\16\7\u0350\5\7\u0353\n\7\3\b\5\b\u0356"+
		"\n\b\3\b\3\b\3\t\3\t\5\t\u035c\n\t\3\t\3\t\3\t\7\t\u0361\n\t\f\t\16\t"+
		"\u0364\13\t\3\n\3\n\5\n\u0368\n\n\3\13\3\13\3\13\3\13\5\13\u036e\n\13"+
		"\3\13\3\13\5\13\u0372\n\13\3\13\3\13\5\13\u0376\n\13\3\f\3\f\3\f\3\f\5"+
		"\f\u037c\n\f\3\r\3\r\3\r\3\r\7\r\u0382\n\r\f\r\16\r\u0385\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0393\n\17\f\17"+
		"\16\17\u0396\13\17\5\17\u0398\n\17\3\17\3\17\3\17\5\17\u039d\n\17\5\17"+
		"\u039f\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u03a6\n\17\3\17\3\17\3\17\3"+
		"\17\5\17\u03ac\n\17\5\17\u03ae\n\17\3\20\3\20\5\20\u03b2\n\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u03bc\n\22\3\22\3\22\3\22\3\22\5\22"+
		"\u03c2\n\22\3\22\7\22\u03c5\n\22\f\22\16\22\u03c8\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u03d1\n\23\f\23\16\23\u03d4\13\23\3\23\3\23"+
		"\3\23\3\23\5\23\u03da\n\23\3\24\3\24\5\24\u03de\n\24\3\24\3\24\5\24\u03e2"+
		"\n\24\3\25\3\25\5\25\u03e6\n\25\3\25\3\25\3\25\7\25\u03eb\n\25\f\25\16"+
		"\25\u03ee\13\25\3\25\3\25\3\25\3\25\7\25\u03f4\n\25\f\25\16\25\u03f7\13"+
		"\25\5\25\u03f9\n\25\3\25\3\25\5\25\u03fd\n\25\3\25\3\25\3\25\5\25\u0402"+
		"\n\25\3\25\3\25\5\25\u0406\n\25\3\25\3\25\3\25\3\25\7\25\u040c\n\25\f"+
		"\25\16\25\u040f\13\25\5\25\u0411\n\25\3\26\5\26\u0414\n\26\3\26\3\26\3"+
		"\26\7\26\u0419\n\26\f\26\16\26\u041c\13\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u0424\n\27\f\27\16\27\u0427\13\27\5\27\u0429\n\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u0431\n\27\f\27\16\27\u0434\13\27\5\27\u0436\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u043f\n\27\f\27\16\27\u0442"+
		"\13\27\3\27\3\27\5\27\u0446\n\27\3\30\3\30\3\30\3\30\7\30\u044c\n\30\f"+
		"\30\16\30\u044f\13\30\5\30\u0451\n\30\3\30\3\30\5\30\u0455\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\5\32\u045e\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u0465\n\32\f\32\16\32\u0468\13\32\5\32\u046a\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0471\n\32\f\32\16\32\u0474\13\32\5\32\u0476\n\32\3\32"+
		"\5\32\u0479\n\32\3\33\3\33\5\33\u047d\n\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\5\35\u0488\n\35\3\35\5\35\u048b\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0492\n\35\3\35\5\35\u0495\n\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u04a8"+
		"\n\36\7\36\u04aa\n\36\f\36\16\36\u04ad\13\36\3\37\5\37\u04b0\n\37\3\37"+
		"\3\37\5\37\u04b4\n\37\3\37\3\37\5\37\u04b8\n\37\3\37\3\37\5\37\u04bc\n"+
		"\37\5\37\u04be\n\37\3 \3 \3 \3 \3 \3 \3 \7 \u04c7\n \f \16 \u04ca\13 "+
		"\3 \3 \5 \u04ce\n \3!\3!\3!\3!\3!\3!\3!\5!\u04d7\n!\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\7#\u04e3\n#\f#\16#\u04e6\13#\5#\u04e8\n#\3#\3#\3#\3#\3#"+
		"\7#\u04ef\n#\f#\16#\u04f2\13#\5#\u04f4\n#\3#\3#\3#\3#\7#\u04fa\n#\f#\16"+
		"#\u04fd\13#\5#\u04ff\n#\3#\5#\u0502\n#\3#\3#\3#\5#\u0507\n#\3#\5#\u050a"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0514\n#\f#\16#\u0517\13#\5#\u0519\n#\3"+
		"#\3#\3#\3#\7#\u051f\n#\f#\16#\u0522\13#\3#\3#\5#\u0526\n#\3#\3#\5#\u052a"+
		"\n#\5#\u052c\n#\5#\u052e\n#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%"+
		"\u053d\n%\5%\u053f\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u054a\n&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u055f\n\'\3(\3(\3(\3(\3(\3(\7(\u0567\n(\f(\16(\u056a\13(\3(\3(\3)\3)"+
		"\3)\3)\3*\3*\5*\u0574\n*\3*\3*\5*\u0578\n*\5*\u057a\n*\3+\3+\3+\3+\7+"+
		"\u0580\n+\f+\16+\u0583\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0591"+
		"\n,\f,\16,\u0594\13,\3,\3,\3,\5,\u0599\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5"+
		",\u05a4\n,\3-\3-\3.\3.\3.\5.\u05ab\n.\3.\3.\5.\u05af\n.\3.\3.\3.\3.\3"+
		".\3.\7.\u05b7\n.\f.\16.\u05ba\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u05c6"+
		"\n/\3/\3/\3/\3/\3/\3/\5/\u05ce\n/\3/\3/\3/\3/\3/\7/\u05d5\n/\f/\16/\u05d8"+
		"\13/\3/\3/\3/\5/\u05dd\n/\3/\3/\3/\3/\3/\3/\5/\u05e5\n/\3/\3/\3/\3/\5"+
		"/\u05eb\n/\3/\3/\5/\u05ef\n/\3/\3/\3/\5/\u05f4\n/\3/\3/\3/\5/\u05f9\n"+
		"/\3\60\3\60\3\60\3\60\5\60\u05ff\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\7\60\u060d\n\60\f\60\16\60\u0610\13\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\6\61\u062b\n\61"+
		"\r\61\16\61\u062c\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0636\n\61\f"+
		"\61\16\61\u0639\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0642\n"+
		"\61\3\61\5\61\u0645\n\61\3\61\5\61\u0648\n\61\3\61\3\61\3\61\5\61\u064d"+
		"\n\61\3\61\3\61\3\61\7\61\u0652\n\61\f\61\16\61\u0655\13\61\5\61\u0657"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\7\61\u065e\n\61\f\61\16\61\u0661\13\61"+
		"\5\61\u0663\n\61\3\61\3\61\5\61\u0667\n\61\3\61\5\61\u066a\n\61\3\61\5"+
		"\61\u066d\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0677\n\61"+
		"\f\61\16\61\u067a\13\61\5\61\u067c\n\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\6\61\u068d\n\61\r\61\16"+
		"\61\u068e\3\61\3\61\5\61\u0693\n\61\3\61\3\61\3\61\3\61\6\61\u0699\n\61"+
		"\r\61\16\61\u069a\3\61\3\61\5\61\u069f\n\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\7\61\u06b6\n\61\f\61\16\61\u06b9\13\61\5\61\u06bb\n\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u06c4\n\61\3\61\3\61\3\61\3\61\5\61"+
		"\u06ca\n\61\3\61\3\61\3\61\3\61\5\61\u06d0\n\61\3\61\3\61\3\61\3\61\5"+
		"\61\u06d6\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u06e3\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u06ec\n\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\7\61\u0700\n\61\f\61\16\61\u0703\13\61\5\61\u0705\n"+
		"\61\3\61\5\61\u0708\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u0712\n\61\f\61\16\61\u0715\13\61\3\62\3\62\3\63\3\63\3\63\3\63\5\63"+
		"\u071d\n\63\3\64\3\64\3\64\3\64\5\64\u0723\n\64\5\64\u0725\n\64\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\5\65\u072d\n\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\59\u0737\n9\39\39\39\39\59\u073d\n9\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\7"+
		"<\u0749\n<\f<\16<\u074c\13<\3<\3<\3<\3<\3<\3<\5<\u0754\n<\3<\3<\3<\3<"+
		"\3<\5<\u075b\n<\3<\3<\3<\5<\u0760\n<\3<\3<\3<\3<\3<\5<\u0767\n<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\5<\u0771\n<\3<\3<\3<\5<\u0776\n<\3<\3<\3<\3<\3<\5<"+
		"\u077d\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\7<\u0795\n<\f<\16<\u0798\13<\3<\3<\5<\u079c\n<\5<\u079e\n<\3<\3"+
		"<\3<\3<\3<\5<\u07a5\n<\7<\u07a7\n<\f<\16<\u07aa\13<\3=\3=\3=\3=\5=\u07b0"+
		"\n=\3>\3>\5>\u07b4\n>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\5A"+
		"\u07c5\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u07d2\nA\fA\16A\u07d5\13"+
		"A\3A\3A\3A\3A\5A\u07db\nA\3A\3A\3A\3A\3A\3A\3A\5A\u07e4\nA\3A\3A\3A\3"+
		"A\3A\3A\7A\u07ec\nA\fA\16A\u07ef\13A\3A\3A\5A\u07f3\nA\3A\3A\3A\3A\3A"+
		"\7A\u07fa\nA\fA\16A\u07fd\13A\3A\3A\5A\u0801\nA\3B\3B\3B\3B\3B\3B\5B\u0809"+
		"\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\5C\u0823\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u082e\nD\3E\3E\3E\5E"+
		"\u0833\nE\3E\3E\3E\3E\3E\7E\u083a\nE\fE\16E\u083d\13E\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\7F\u0847\nF\fF\16F\u084a\13F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\5F\u0858\nF\3G\3G\5G\u085c\nG\3G\3G\5G\u0860\nG\3G\3G\5G\u0864\nG"+
		"\3G\3G\3G\3G\5G\u086a\nG\3G\3G\5G\u086e\nG\3G\3G\5G\u0872\nG\3G\3G\5G"+
		"\u0876\nG\5G\u0878\nG\3H\3H\3H\3H\3I\3I\3I\3I\5I\u0882\nI\3J\3J\3J\3J"+
		"\3J\5J\u0889\nJ\3K\3K\3K\3K\3K\3K\3K\5K\u0892\nK\3L\3L\3L\3L\3L\5L\u0899"+
		"\nL\3M\3M\3M\3M\3M\5M\u08a0\nM\3N\3N\3N\7N\u08a5\nN\fN\16N\u08a8\13N\3"+
		"O\3O\3P\3P\3P\7P\u08af\nP\fP\16P\u08b2\13P\3Q\3Q\3Q\5Q\u08b7\nQ\3R\3R"+
		"\3R\3R\3R\5R\u08be\nR\3S\3S\3S\7S\u08c3\nS\fS\16S\u08c6\13S\3T\3T\3T\3"+
		"T\3T\5T\u08cd\nT\3U\5U\u08d0\nU\3U\3U\5U\u08d4\nU\3U\3U\5U\u08d8\nU\3"+
		"U\5U\u08db\nU\3V\3V\3V\2\t\":Z^`v\u0088W\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\2\36\4\2$$\u00b8"+
		"\u00b8\4\2>>pp\4\2\u00c2\u00c2\u00d3\u00d3\4\2YYgg\4\2LLhh\3\2\u00bf\u00c0"+
		"\4\2UU\u008a\u008a\4\2\u0103\u0103\u0107\u0107\4\2KK\u00e3\u00e3\4\2\35"+
		"\35@@\4\2UUvv\4\2\26\26CC\4\2  \u00d2\u00d2\4\2ii\u00c6\u00c6\3\2\u00fd"+
		"\u00fe\3\2\u00ff\u0101\4\2TT\u00c1\u00c1\3\2\u00f7\u00fc\5\2\26\26\32"+
		"\32\u00cd\u00cd\4\2QQ\u00dd\u00dd\7\2<<dd\u0087\u0088\u00c4\u00c4\u00f5"+
		"\u00f5\3\2\u008b\u008e\4\2VV\u00aa\u00aa\5\2__uu\u00d6\u00d6\6\2DDqq~"+
		"~\u00ea\u00ea\4\2\u009a\u009a\u00f4\u00f4\5\2??ll\u00c7\u00c7\63\2\23"+
		"\26\30\30\32\33\35 #$\',\61\61:<>>@@BBDEHHLLOORVXX[_bbdfhikknnpqssuwy"+
		"y{{~\u0088\u008a\u0090\u0094\u0097\u0099\u009b\u009e\u009e\u00a0\u00ab"+
		"\u00ad\u00b0\u00b2\u00b9\u00bb\u00bd\u00bf\u00c6\u00c8\u00d2\u00d4\u00d6"+
		"\u00d8\u00dc\u00de\u00df\u00e1\u00e2\u00e4\u00e4\u00e6\u00e8\u00ea\u00ea"+
		"\u00ec\u00ed\u00f0\u00f0\u00f2\u00f6\2\u0a4b\2\u00ac\3\2\2\2\4\u00af\3"+
		"\2\2\2\6\u00b2\3\2\2\2\b\u00b5\3\2\2\2\n\u00b8\3\2\2\2\f\u0352\3\2\2\2"+
		"\16\u0355\3\2\2\2\20\u0359\3\2\2\2\22\u0367\3\2\2\2\24\u0369\3\2\2\2\26"+
		"\u0377\3\2\2\2\30\u037d\3\2\2\2\32\u0388\3\2\2\2\34\u038c\3\2\2\2\36\u03b1"+
		"\3\2\2\2 \u03b3\3\2\2\2\"\u03b5\3\2\2\2$\u03d9\3\2\2\2&\u03db\3\2\2\2"+
		"(\u03e3\3\2\2\2*\u0413\3\2\2\2,\u0445\3\2\2\2.\u0454\3\2\2\2\60\u0456"+
		"\3\2\2\2\62\u045d\3\2\2\2\64\u047a\3\2\2\2\66\u0483\3\2\2\28\u0494\3\2"+
		"\2\2:\u0496\3\2\2\2<\u04bd\3\2\2\2>\u04cd\3\2\2\2@\u04cf\3\2\2\2B\u04d8"+
		"\3\2\2\2D\u04da\3\2\2\2F\u052f\3\2\2\2H\u053e\3\2\2\2J\u0549\3\2\2\2L"+
		"\u055e\3\2\2\2N\u0560\3\2\2\2P\u056d\3\2\2\2R\u0571\3\2\2\2T\u057b\3\2"+
		"\2\2V\u05a3\3\2\2\2X\u05a5\3\2\2\2Z\u05ae\3\2\2\2\\\u05f8\3\2\2\2^\u05fe"+
		"\3\2\2\2`\u0707\3\2\2\2b\u0716\3\2\2\2d\u071c\3\2\2\2f\u0724\3\2\2\2h"+
		"\u072c\3\2\2\2j\u072e\3\2\2\2l\u0730\3\2\2\2n\u0732\3\2\2\2p\u0734\3\2"+
		"\2\2r\u073e\3\2\2\2t\u0740\3\2\2\2v\u079d\3\2\2\2x\u07af\3\2\2\2z\u07b3"+
		"\3\2\2\2|\u07b5\3\2\2\2~\u07ba\3\2\2\2\u0080\u0800\3\2\2\2\u0082\u0802"+
		"\3\2\2\2\u0084\u0822\3\2\2\2\u0086\u082d\3\2\2\2\u0088\u082f\3\2\2\2\u008a"+
		"\u0857\3\2\2\2\u008c\u0877\3\2\2\2\u008e\u0879\3\2\2\2\u0090\u0881\3\2"+
		"\2\2\u0092\u0888\3\2\2\2\u0094\u0891\3\2\2\2\u0096\u0898\3\2\2\2\u0098"+
		"\u089f\3\2\2\2\u009a\u08a1\3\2\2\2\u009c\u08a9\3\2\2\2\u009e\u08ab\3\2"+
		"\2\2\u00a0\u08b6\3\2\2\2\u00a2\u08bd\3\2\2\2\u00a4\u08bf\3\2\2\2\u00a6"+
		"\u08cc\3\2\2\2\u00a8\u08da\3\2\2\2\u00aa\u08dc\3\2\2\2\u00ac\u00ad\5\f"+
		"\7\2\u00ad\u00ae\7\2\2\3\u00ae\3\3\2\2\2\u00af\u00b0\5X-\2\u00b0\u00b1"+
		"\7\2\2\3\u00b1\5\3\2\2\2\u00b2\u00b3\5\u009aN\2\u00b3\u00b4\7\2\2\3\u00b4"+
		"\7\3\2\2\2\u00b5\u00b6\5v<\2\u00b6\u00b7\7\2\2\3\u00b7\t\3\2\2\2\u00b8"+
		"\u00b9\5\u0088E\2\u00b9\u00ba\7\2\2\3\u00ba\13\3\2\2\2\u00bb\u0353\5\16"+
		"\b\2\u00bc\u00bd\7\u00e7\2\2\u00bd\u0353\5\u00a6T\2\u00be\u00bf\7\u00e7"+
		"\2\2\u00bf\u00c0\5\u00a6T\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5\u00a6T\2"+
		"\u00c2\u0353\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4\u00c8\7\u00c2\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\u00c7\7\u0092\2\2\u00c7\u00c9\7N\2\2\u00c8\u00c5\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\5\u009eP\2"+
		"\u00cb\u00cc\7\37\2\2\u00cc\u00ce\5\u00a2R\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\7\u00f1\2\2\u00d0\u00d2"+
		"\5\30\r\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u0353\3\2\2\2"+
		"\u00d3\u00d4\7F\2\2\u00d4\u00d7\7\u00c2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d8"+
		"\7N\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\5\u009eP\2\u00da\u00dc\t\2\2\2\u00db\u00da\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u0353\3\2\2\2\u00dd\u00de\7\27\2\2\u00de\u00df\7\u00c2"+
		"\2\2\u00df\u00e0\5\u009eP\2\u00e0\u00e1\7\u00b3\2\2\u00e1\u00e2\7\u00db"+
		"\2\2\u00e2\u00e3\5\u00a6T\2\u00e3\u0353\3\2\2\2\u00e4\u00e5\7\27\2\2\u00e5"+
		"\u00e6\7\u00c2\2\2\u00e6\u00e7\5\u009eP\2\u00e7\u00e8\7\u00ca\2\2\u00e8"+
		"\u00e9\7\37\2\2\u00e9\u00ea\5\u00a2R\2\u00ea\u0353\3\2\2\2\u00eb\u00ec"+
		"\7.\2\2\u00ec\u00f0\7\u00d3\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7\u0092"+
		"\2\2\u00ef\u00f1\7N\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\5\u009eP\2\u00f3\u00f5\5T+\2\u00f4\u00f3\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\7*\2\2\u00f7"+
		"\u00f9\5f\64\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00fb\7\u00f1\2\2\u00fb\u00fd\5\30\r\2\u00fc\u00fa\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0104\7\34\2\2\u00ff\u0105"+
		"\5\16\b\2\u0100\u0101\7\4\2\2\u0101\u0102\5\16\b\2\u0102\u0103\7\5\2\2"+
		"\u0103\u0105\3\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u010b"+
		"\3\2\2\2\u0106\u0108\7\u00f1\2\2\u0107\u0109\7\u008f\2\2\u0108\u0107\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\7:\2\2\u010b"+
		"\u0106\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0353\3\2\2\2\u010d\u010e\7."+
		"\2\2\u010e\u0112\7\u00d3\2\2\u010f\u0110\7e\2\2\u0110\u0111\7\u0092\2"+
		"\2\u0111\u0113\7N\2\2\u0112\u010f\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\5\u009eP\2\u0115\u0116\7\4\2\2\u0116\u011b\5\22\n"+
		"\2\u0117\u0118\7\6\2\2\u0118\u011a\5\22\n\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u0121\7\5\2\2\u011f\u0120\7*\2\2\u0120"+
		"\u0122\5f\64\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0124\7\u00f1\2\2\u0124\u0126\5\30\r\2\u0125\u0123\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0353\3\2\2\2\u0127\u0128\7F\2\2\u0128\u012b"+
		"\7\u00d3\2\2\u0129\u012a\7e\2\2\u012a\u012c\7N\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0353\5\u009eP\2\u012e"+
		"\u012f\7l\2\2\u012f\u0130\7o\2\2\u0130\u0132\5\u009eP\2\u0131\u0133\5"+
		"T+\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\5\16\b\2\u0135\u0353\3\2\2\2\u0136\u0137\7?\2\2\u0137\u0138\7Y"+
		"\2\2\u0138\u013b\5\u009eP\2\u0139\u013a\7\u00ef\2\2\u013a\u013c\5Z.\2"+
		"\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0353\3\2\2\2\u013d\u013e"+
		"\7\27\2\2\u013e\u0141\7\u00d3\2\2\u013f\u0140\7e\2\2\u0140\u0142\7N\2"+
		"\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144"+
		"\5\u009eP\2\u0144\u0145\7\u00b3\2\2\u0145\u0146\7\u00db\2\2\u0146\u0147"+
		"\5\u009eP\2\u0147\u0353\3\2\2\2\u0148\u0149\7*\2\2\u0149\u014a\7\u0098"+
		"\2\2\u014a\u014b\7\u00d3\2\2\u014b\u014c\5\u009eP\2\u014c\u014f\7r\2\2"+
		"\u014d\u0150\5f\64\2\u014e\u0150\7\u0093\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0353\3\2\2\2\u0151\u0152\7*\2\2\u0152\u0153\7\u0098"+
		"\2\2\u0153\u0154\7(\2\2\u0154\u0155\5\u009eP\2\u0155\u0158\7r\2\2\u0156"+
		"\u0159\5f\64\2\u0157\u0159\7\u0093\2\2\u0158\u0156\3\2\2\2\u0158\u0157"+
		"\3\2\2\2\u0159\u0353\3\2\2\2\u015a\u015b\7\27\2\2\u015b\u015e\7\u00d3"+
		"\2\2\u015c\u015d\7e\2\2\u015d\u015f\7N\2\2\u015e\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\5\u009eP\2\u0161\u0162\7\u00b3"+
		"\2\2\u0162\u0165\7(\2\2\u0163\u0164\7e\2\2\u0164\u0166\7N\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5\u00a6T"+
		"\2\u0168\u0169\7\u00db\2\2\u0169\u016a\5\u00a6T\2\u016a\u0353\3\2\2\2"+
		"\u016b\u016c\7\27\2\2\u016c\u016f\7\u00d3\2\2\u016d\u016e\7e\2\2\u016e"+
		"\u0170\7N\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\5\u009eP\2\u0172\u0173\7F\2\2\u0173\u0176\7(\2\2\u0174"+
		"\u0175\7e\2\2\u0175\u0177\7N\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2"+
		"\2\u0177\u0178\3\2\2\2\u0178\u0179\5\u009eP\2\u0179\u0353\3\2\2\2\u017a"+
		"\u017b\7\27\2\2\u017b\u017e\7\u00d3\2\2\u017c\u017d\7e\2\2\u017d\u017f"+
		"\7N\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\5\u009eP\2\u0181\u0182\7\23\2\2\u0182\u0186\7(\2\2\u0183\u0184"+
		"\7e\2\2\u0184\u0185\7\u0092\2\2\u0185\u0187\7N\2\2\u0186\u0183\3\2\2\2"+
		"\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5\24\13\2\u0189\u0353"+
		"\3\2\2\2\u018a\u018b\7\27\2\2\u018b\u018c\7\u00d3\2\2\u018c\u018d\5\u009e"+
		"P\2\u018d\u018e\7\u00ca\2\2\u018e\u018f\7\37\2\2\u018f\u0190\5\u00a2R"+
		"\2\u0190\u0353\3\2\2\2\u0191\u0192\7\30\2\2\u0192\u0195\5\u009eP\2\u0193"+
		"\u0194\7\u00f1\2\2\u0194\u0196\5\30\r\2\u0195\u0193\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0353\3\2\2\2\u0197\u019a\7.\2\2\u0198\u0199\7\u009c\2"+
		"\2\u0199\u019b\7\u00b5\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\7\u0084\2\2\u019d\u01a1\7\u00ed\2\2\u019e\u019f"+
		"\7e\2\2\u019f\u01a0\7\u0092\2\2\u01a0\u01a2\7N\2\2\u01a1\u019e\3\2\2\2"+
		"\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\5\u009eP\2\u01a4"+
		"\u01a5\7*\2\2\u01a5\u01a7\5f\64\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a9\7\u00f1\2\2\u01a9\u01ab\5\30\r\2"+
		"\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad"+
		"\7\34\2\2\u01ad\u01ae\5\16\b\2\u01ae\u0353\3\2\2\2\u01af\u01b2\7.\2\2"+
		"\u01b0\u01b1\7\u009c\2\2\u01b1\u01b3\7\u00b5\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7\u00ed\2\2\u01b5\u01b8"+
		"\5\u009eP\2\u01b6\u01b7\7*\2\2\u01b7\u01b9\5f\64\2\u01b8\u01b6\3\2\2\2"+
		"\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\7\u00c5\2\2\u01bb"+
		"\u01bd\t\3\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\7\34\2\2\u01bf\u01c0\5\16\b\2\u01c0\u0353\3\2\2\2\u01c1"+
		"\u01c2\7\u00b2\2\2\u01c2\u01c3\7\u0084\2\2\u01c3\u01c4\7\u00ed\2\2\u01c4"+
		"\u0353\5\u009eP\2\u01c5\u01c6\7F\2\2\u01c6\u01c7\7\u0084\2\2\u01c7\u01ca"+
		"\7\u00ed\2\2\u01c8\u01c9\7e\2\2\u01c9\u01cb\7N\2\2\u01ca\u01c8\3\2\2\2"+
		"\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u0353\5\u009eP\2\u01cd"+
		"\u01ce\7F\2\2\u01ce\u01d1\7\u00ed\2\2\u01cf\u01d0\7e\2\2\u01d0\u01d2\7"+
		"N\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u0353\5\u009eP\2\u01d4\u01d5\7\27\2\2\u01d5\u01d6\7\u00ed\2\2\u01d6\u01d7"+
		"\5\u009eP\2\u01d7\u01d8\7\u00b3\2\2\u01d8\u01d9\7\u00db\2\2\u01d9\u01da"+
		"\5\u009eP\2\u01da\u0353\3\2\2\2\u01db\u01dc\7\27\2\2\u01dc\u01dd\7\u00ed"+
		"\2\2\u01dd\u01de\5\u009eP\2\u01de\u01df\7\u00ca\2\2\u01df\u01e0\7\37\2"+
		"\2\u01e0\u01e1\5\u00a2R\2\u01e1\u0353\3\2\2\2\u01e2\u01e3\7#\2\2\u01e3"+
		"\u01e4\5\u009eP\2\u01e4\u01ed\7\4\2\2\u01e5\u01ea\5\u0096L\2\u01e6\u01e7"+
		"\7\6\2\2\u01e7\u01e9\5\u0096L\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2"+
		"\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ed\u01e5\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\7\5\2\2\u01f0\u0353\3\2\2\2\u01f1\u01f2\7.\2\2\u01f2\u01f3\7\u00bb"+
		"\2\2\u01f3\u01f7\5\u00a6T\2\u01f4\u01f5\7\u00f1\2\2\u01f5\u01f6\7\24\2"+
		"\2\u01f6\u01f8\5\u00a0Q\2\u01f7\u01f4\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u0353\3\2\2\2\u01f9\u01fa\7F\2\2\u01fa\u01fb\7\u00bb\2\2\u01fb\u0353"+
		"\5\u00a6T\2\u01fc\u01fd\7\\\2\2\u01fd\u01fe\5\u00a4S\2\u01fe\u01ff\7\u00db"+
		"\2\2\u01ff\u0204\5\u00a2R\2\u0200\u0201\7\6\2\2\u0201\u0203\5\u00a2R\2"+
		"\u0202\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205\u020a\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\u00f1\2"+
		"\2\u0208\u0209\7\24\2\2\u0209\u020b\7\u009b\2\2\u020a\u0207\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020f\3\2\2\2\u020c\u020d\7]\2\2\u020d\u020e\7\""+
		"\2\2\u020e\u0210\5\u00a0Q\2\u020f\u020c\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0353\3\2\2\2\u0211\u0215\7\u00b9\2\2\u0212\u0213\7\24\2\2\u0213\u0214"+
		"\7\u009b\2\2\u0214\u0216\7W\2\2\u0215\u0212\3\2\2\2\u0215\u0216\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u0218\5\u00a4S\2\u0218\u0219\7Y\2\2\u0219"+
		"\u021e\5\u00a2R\2\u021a\u021b\7\6\2\2\u021b\u021d\5\u00a2R\2\u021c\u021a"+
		"\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0224\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7]\2\2\u0222\u0223\7\""+
		"\2\2\u0223\u0225\5\u00a0Q\2\u0224\u0221\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0353\3\2\2\2\u0226\u0227\7\u00ca\2\2\u0227\u022b\7\u00bb\2\2\u0228\u022c"+
		"\7\26\2\2\u0229\u022c\7\u0090\2\2\u022a\u022c\5\u00a6T\2\u022b\u0228\3"+
		"\2\2\2\u022b\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c\u0353\3\2\2\2\u022d"+
		"\u0238\7\\\2\2\u022e\u0233\5\u009cO\2\u022f\u0230\7\6\2\2\u0230\u0232"+
		"\5\u009cO\2\u0231\u022f\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2"+
		"\2\u0233\u0234\3\2\2\2\u0234\u0239\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237"+
		"\7\26\2\2\u0237\u0239\7\u00ad\2\2\u0238\u022e\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0239\u023a\3\2\2\2\u023a\u023c\7\u0098\2\2\u023b\u023d\t\4\2\2\u023c"+
		"\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5\u009e"+
		"P\2\u023f\u0240\7\u00db\2\2\u0240\u0244\5\u00a2R\2\u0241\u0242\7\u00f1"+
		"\2\2\u0242\u0243\7\\\2\2\u0243\u0245\7\u009b\2\2\u0244\u0241\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0353\3\2\2\2\u0246\u024a\7\u00b9\2\2\u0247\u0248"+
		"\7\\\2\2\u0248\u0249\7\u009b\2\2\u0249\u024b\7W\2\2\u024a\u0247\3\2\2"+
		"\2\u024a\u024b\3\2\2\2\u024b\u0256\3\2\2\2\u024c\u0251\5\u009cO\2\u024d"+
		"\u024e\7\6\2\2\u024e\u0250\5\u009cO\2\u024f\u024d\3\2\2\2\u0250\u0253"+
		"\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0257\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0255\7\26\2\2\u0255\u0257\7\u00ad\2\2\u0256\u024c"+
		"\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\7\u0098\2"+
		"\2\u0259\u025b\t\4\2\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u025d\5\u009eP\2\u025d\u025e\7Y\2\2\u025e\u025f\5\u00a2"+
		"R\2\u025f\u0353\3\2\2\2\u0260\u0261\7\u00cc\2\2\u0261\u0267\7^\2\2\u0262"+
		"\u0264\7\u0098\2\2\u0263\u0265\7\u00d3\2\2\u0264\u0263\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\5\u009eP\2\u0267\u0262\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268\u0353\3\2\2\2\u0269\u026b\7O\2\2\u026a\u026c"+
		"\7\30\2\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2"+
		"\u026d\u026f\7\u00ec\2\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u027b\3\2\2\2\u0270\u0271\7\4\2\2\u0271\u0276\5\u0090I\2\u0272\u0273"+
		"\7\6\2\2\u0273\u0275\5\u0090I\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2"+
		"\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276"+
		"\3\2\2\2\u0279\u027a\7\5\2\2\u027a\u027c\3\2\2\2\u027b\u0270\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0353\5\f\7\2\u027e\u027f\7\u00cc"+
		"\2\2\u027f\u0280\7.\2\2\u0280\u0281\7\u00d3\2\2\u0281\u0353\5\u009eP\2"+
		"\u0282\u0283\7\u00cc\2\2\u0283\u0284\7.\2\2\u0284\u0285\7\u00c2\2\2\u0285"+
		"\u0353\5\u009eP\2\u0286\u0287\7\u00cc\2\2\u0287\u0288\7.\2\2\u0288\u0289"+
		"\7\u00ed\2\2\u0289\u0353\5\u009eP\2\u028a\u028b\7\u00cc\2\2\u028b\u028c"+
		"\7.\2\2\u028c\u028d\7\u0084\2\2\u028d\u028e\7\u00ed\2\2\u028e\u0353\5"+
		"\u009eP\2\u028f\u0290\7\u00cc\2\2\u0290\u0293\7\u00d4\2\2\u0291\u0292"+
		"\t\5\2\2\u0292\u0294\5\u009eP\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2"+
		"\2\u0294\u029b\3\2\2\2\u0295\u0296\7z\2\2\u0296\u0299\5f\64\2\u0297\u0298"+
		"\7J\2\2\u0298\u029a\5f\64\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029c\3\2\2\2\u029b\u0295\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u0353\3\2"+
		"\2\2\u029d\u029e\7\u00cc\2\2\u029e\u02a1\7\u00c3\2\2\u029f\u02a0\t\5\2"+
		"\2\u02a0\u02a2\5\u00a6T\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a9\3\2\2\2\u02a3\u02a4\7z\2\2\u02a4\u02a7\5f\64\2\u02a5\u02a6\7J\2"+
		"\2\u02a6\u02a8\5f\64\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa"+
		"\3\2\2\2\u02a9\u02a3\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u0353\3\2\2\2\u02ab"+
		"\u02ac\7\u00cc\2\2\u02ac\u02b3\7\'\2\2\u02ad\u02ae\7z\2\2\u02ae\u02b1"+
		"\5f\64\2\u02af\u02b0\7J\2\2\u02b0\u02b2\5f\64\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02ad\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\u0353\3\2\2\2\u02b5\u02b6\7\u00cc\2\2\u02b6\u02b7\7)\2\2\u02b7"+
		"\u02b9\t\5\2\2\u02b8\u02ba\5\u009eP\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba\u02c1\3\2\2\2\u02bb\u02bc\7z\2\2\u02bc\u02bf\5f\64\2\u02bd"+
		"\u02be\7J\2\2\u02be\u02c0\5f\64\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2"+
		"\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bb\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u0353\3\2\2\2\u02c3\u02c4\7\u00cc\2\2\u02c4\u02c5\7\u00cf\2\2\u02c5\u02c6"+
		"\7W\2\2\u02c6\u0353\5\u009eP\2\u02c7\u02c8\7\u00cc\2\2\u02c8\u02c9\7\u00cf"+
		"\2\2\u02c9\u02ca\7W\2\2\u02ca\u02cb\7\4\2\2\u02cb\u02cc\5\16\b\2\u02cc"+
		"\u02cd\7\5\2\2\u02cd\u0353\3\2\2\2\u02ce\u02d0\7\u00cc\2\2\u02cf\u02d1"+
		"\7\61\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2"+
		"\u02d2\u02d5\7\u00bc\2\2\u02d3\u02d4\t\5\2\2\u02d4\u02d6\5\u00a6T\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u0353\3\2\2\2\u02d7\u02d8\7\u00cc"+
		"\2\2\u02d8\u02d9\7\u00bb\2\2\u02d9\u02dc\7^\2\2\u02da\u02db\t\5\2\2\u02db"+
		"\u02dd\5\u00a6T\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u0353"+
		"\3\2\2\2\u02de\u02df\7A\2\2\u02df\u0353\5\u009eP\2\u02e0\u02e1\7@\2\2"+
		"\u02e1\u0353\5\u009eP\2\u02e2\u02e3\7\u00cc\2\2\u02e3\u02ea\7[\2\2\u02e4"+
		"\u02e5\7z\2\2\u02e5\u02e8\5f\64\2\u02e6\u02e7\7J\2\2\u02e7\u02e9\5f\64"+
		"\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e4"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0353\3\2\2\2\u02ec\u02ed\7\u00cc\2"+
		"\2\u02ed\u02f4\7\u00c9\2\2\u02ee\u02ef\7z\2\2\u02ef\u02f2\5f\64\2\u02f0"+
		"\u02f1\7J\2\2\u02f1\u02f3\5f\64\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2"+
		"\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02ee\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u0353\3\2\2\2\u02f6\u02f7\7\u00ca\2\2\u02f7\u02f8\7\u00c9\2\2\u02f8\u02f9"+
		"\5\u009eP\2\u02f9\u02fa\7\u00f7\2\2\u02fa\u02fb\5X-\2\u02fb\u0353\3\2"+
		"\2\2\u02fc\u02fd\7\u00b6\2\2\u02fd\u02fe\7\u00c9\2\2\u02fe\u0353\5\u009e"+
		"P\2\u02ff\u0300\7\u00ce\2\2\u0300\u0309\7\u00dc\2\2\u0301\u0306\5\u0092"+
		"J\2\u0302\u0303\7\6\2\2\u0303\u0305\5\u0092J\2\u0304\u0302\3\2\2\2\u0305"+
		"\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030a\3\2"+
		"\2\2\u0308\u0306\3\2\2\2\u0309\u0301\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u0353\3\2\2\2\u030b\u030d\7+\2\2\u030c\u030e\7\u00f3\2\2\u030d\u030c"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0353\3\2\2\2\u030f\u0311\7\u00bd\2"+
		"\2\u0310\u0312\7\u00f3\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0353\3\2\2\2\u0313\u0314\7\u00ac\2\2\u0314\u0315\5\u00a6T\2\u0315\u0316"+
		"\7Y\2\2\u0316\u0317\5\f\7\2\u0317\u0353\3\2\2\2\u0318\u0319\7=\2\2\u0319"+
		"\u031a\7\u00ac\2\2\u031a\u0353\5\u00a6T\2\u031b\u031c\7M\2\2\u031c\u0326"+
		"\5\u00a6T\2\u031d\u031e\7\u00e9\2\2\u031e\u0323\5X-\2\u031f\u0320\7\6"+
		"\2\2\u0320\u0322\5X-\2\u0321\u031f\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321"+
		"\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0326"+
		"\u031d\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0353\3\2\2\2\u0328\u0329\7A"+
		"\2\2\u0329\u032a\7k\2\2\u032a\u0353\5\u00a6T\2\u032b\u032c\7A\2\2\u032c"+
		"\u032d\7\u00a0\2\2\u032d\u0353\5\u00a6T\2\u032e\u032f\7\u00ca\2\2\u032f"+
		"\u0330\7\u00a5\2\2\u0330\u0353\5\u009aN\2\u0331\u0332\7\u00e6\2\2\u0332"+
		"\u0333\5\u009eP\2\u0333\u0334\7\u00ca\2\2\u0334\u0339\5\u008eH\2\u0335"+
		"\u0336\7\6\2\2\u0336\u0338\5\u008eH\2\u0337\u0335\3\2\2\2\u0338\u033b"+
		"\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033e\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033c\u033d\7\u00ef\2\2\u033d\u033f\5Z.\2\u033e\u033c\3"+
		"\2\2\2\u033e\u033f\3\2\2\2\u033f\u0353\3\2\2\2\u0340\u0341\7\u0086\2\2"+
		"\u0341\u0342\7o\2\2\u0342\u0347\5\u009eP\2\u0343\u0345\7\34\2\2\u0344"+
		"\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\5\u00a6"+
		"T\2\u0347\u0344\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034a\7\u00e9\2\2\u034a\u034b\5:\36\2\u034b\u034c\7\u0098\2\2\u034c\u034e"+
		"\5X-\2\u034d\u034f\5\u0080A\2\u034e\u034d\3\2\2\2\u034f\u0350\3\2\2\2"+
		"\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u00bb"+
		"\3\2\2\2\u0352\u00bc\3\2\2\2\u0352\u00be\3\2\2\2\u0352\u00c3\3\2\2\2\u0352"+
		"\u00d3\3\2\2\2\u0352\u00dd\3\2\2\2\u0352\u00e4\3\2\2\2\u0352\u00eb\3\2"+
		"\2\2\u0352\u010d\3\2\2\2\u0352\u0127\3\2\2\2\u0352\u012e\3\2\2\2\u0352"+
		"\u0136\3\2\2\2\u0352\u013d\3\2\2\2\u0352\u0148\3\2\2\2\u0352\u0151\3\2"+
		"\2\2\u0352\u015a\3\2\2\2\u0352\u016b\3\2\2\2\u0352\u017a\3\2\2\2\u0352"+
		"\u018a\3\2\2\2\u0352\u0191\3\2\2\2\u0352\u0197\3\2\2\2\u0352\u01af\3\2"+
		"\2\2\u0352\u01c1\3\2\2\2\u0352\u01c5\3\2\2\2\u0352\u01cd\3\2\2\2\u0352"+
		"\u01d4\3\2\2\2\u0352\u01db\3\2\2\2\u0352\u01e2\3\2\2\2\u0352\u01f1\3\2"+
		"\2\2\u0352\u01f9\3\2\2\2\u0352\u01fc\3\2\2\2\u0352\u0211\3\2\2\2\u0352"+
		"\u0226\3\2\2\2\u0352\u022d\3\2\2\2\u0352\u0246\3\2\2\2\u0352\u0260\3\2"+
		"\2\2\u0352\u0269\3\2\2\2\u0352\u027e\3\2\2\2\u0352\u0282\3\2\2\2\u0352"+
		"\u0286\3\2\2\2\u0352\u028a\3\2\2\2\u0352\u028f\3\2\2\2\u0352\u029d\3\2"+
		"\2\2\u0352\u02ab\3\2\2\2\u0352\u02b5\3\2\2\2\u0352\u02c3\3\2\2\2\u0352"+
		"\u02c7\3\2\2\2\u0352\u02ce\3\2\2\2\u0352\u02d7\3\2\2\2\u0352\u02de\3\2"+
		"\2\2\u0352\u02e0\3\2\2\2\u0352\u02e2\3\2\2\2\u0352\u02ec\3\2\2\2\u0352"+
		"\u02f6\3\2\2\2\u0352\u02fc\3\2\2\2\u0352\u02ff\3\2\2\2\u0352\u030b\3\2"+
		"\2\2\u0352\u030f\3\2\2\2\u0352\u0313\3\2\2\2\u0352\u0318\3\2\2\2\u0352"+
		"\u031b\3\2\2\2\u0352\u0328\3\2\2\2\u0352\u032b\3\2\2\2\u0352\u032e\3\2"+
		"\2\2\u0352\u0331\3\2\2\2\u0352\u0340\3\2\2\2\u0353\r\3\2\2\2\u0354\u0356"+
		"\5\20\t\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2"+
		"\u0357\u0358\5\34\17\2\u0358\17\3\2\2\2\u0359\u035b\7\u00f1\2\2\u035a"+
		"\u035c\7\u00b1\2\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d"+
		"\3\2\2\2\u035d\u0362\5\64\33\2\u035e\u035f\7\6\2\2\u035f\u0361\5\64\33"+
		"\2\u0360\u035e\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\21\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0368\5\24\13\2\u0366"+
		"\u0368\5\26\f\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368\23\3\2\2"+
		"\2\u0369\u036a\5\u00a6T\2\u036a\u036d\5v<\2\u036b\u036c\7\u0092\2\2\u036c"+
		"\u036e\7\u0093\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0371"+
		"\3\2\2\2\u036f\u0370\7*\2\2\u0370\u0372\5f\64\2\u0371\u036f\3\2\2\2\u0371"+
		"\u0372\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0374\7\u00f1\2\2\u0374\u0376"+
		"\5\30\r\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\25\3\2\2\2\u0377"+
		"\u0378\7z\2\2\u0378\u037b\5\u009eP\2\u0379\u037a\t\6\2\2\u037a\u037c\7"+
		"\u00ae\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\27\3\2\2\2\u037d"+
		"\u037e\7\4\2\2\u037e\u0383\5\32\16\2\u037f\u0380\7\6\2\2\u0380\u0382\5"+
		"\32\16\2\u0381\u037f\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u0387\7\5"+
		"\2\2\u0387\31\3\2\2\2\u0388\u0389\5\u00a6T\2\u0389\u038a\7\u00f7\2\2\u038a"+
		"\u038b\5X-\2\u038b\33\3\2\2\2\u038c\u0397\5\"\22\2\u038d\u038e\7\u009d"+
		"\2\2\u038e\u038f\7\"\2\2\u038f\u0394\5&\24\2\u0390\u0391\7\6\2\2\u0391"+
		"\u0393\5&\24\2\u0392\u0390\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2"+
		"\2\2\u0394\u0395\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0397"+
		"\u038d\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039e\3\2\2\2\u0399\u039a\7\u0096"+
		"\2\2\u039a\u039c\5 \21\2\u039b\u039d\t\7\2\2\u039c\u039b\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039d\u039f\3\2\2\2\u039e\u0399\3\2\2\2\u039e\u039f\3\2"+
		"\2\2\u039f\u03ad\3\2\2\2\u03a0\u03a1\7{\2\2\u03a1\u03ae\5\36\20\2\u03a2"+
		"\u03a3\7R\2\2\u03a3\u03a5\t\b\2\2\u03a4\u03a6\5 \21\2\u03a5\u03a4\3\2"+
		"\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03ab\t\7\2\2\u03a8"+
		"\u03ac\7\u009a\2\2\u03a9\u03aa\7\u00f1\2\2\u03aa\u03ac\7\u00d8\2\2\u03ab"+
		"\u03a8\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03a0\3\2"+
		"\2\2\u03ad\u03a2\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\35\3\2\2\2\u03af\u03b2"+
		"\7\26\2\2\u03b0\u03b2\5 \21\2\u03b1\u03af\3\2\2\2\u03b1\u03b0\3\2\2\2"+
		"\u03b2\37\3\2\2\2\u03b3\u03b4\t\t\2\2\u03b4!\3\2\2\2\u03b5\u03b6\b\22"+
		"\1\2\u03b6\u03b7\5$\23\2\u03b7\u03c6\3\2\2\2\u03b8\u03b9\f\4\2\2\u03b9"+
		"\u03bb\7m\2\2\u03ba\u03bc\5\66\34\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3"+
		"\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03c5\5\"\22\5\u03be\u03bf\f\3\2\2\u03bf"+
		"\u03c1\t\n\2\2\u03c0\u03c2\5\66\34\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3"+
		"\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\5\"\22\4\u03c4\u03b8\3\2\2\2\u03c4"+
		"\u03be\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2"+
		"\2\2\u03c7#\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03da\5(\25\2\u03ca\u03cb"+
		"\7\u00d3\2\2\u03cb\u03da\5\u009eP\2\u03cc\u03cd\7\u00eb\2\2\u03cd\u03d2"+
		"\5X-\2\u03ce\u03cf\7\6\2\2\u03cf\u03d1\5X-\2\u03d0\u03ce\3\2\2\2\u03d1"+
		"\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03da\3\2"+
		"\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6\7\4\2\2\u03d6\u03d7\5\34\17\2\u03d7"+
		"\u03d8\7\5\2\2\u03d8\u03da\3\2\2\2\u03d9\u03c9\3\2\2\2\u03d9\u03ca\3\2"+
		"\2\2\u03d9\u03cc\3\2\2\2\u03d9\u03d5\3\2\2\2\u03da%\3\2\2\2\u03db\u03dd"+
		"\5X-\2\u03dc\u03de\t\13\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03e1\3\2\2\2\u03df\u03e0\7\u0095\2\2\u03e0\u03e2\t\f\2\2\u03e1\u03df"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\'\3\2\2\2\u03e3\u03e5\7\u00c7\2\2\u03e4"+
		"\u03e6\5\66\34\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3"+
		"\2\2\2\u03e7\u03ec\58\35\2\u03e8\u03e9\7\6\2\2\u03e9\u03eb\58\35\2\u03ea"+
		"\u03e8\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2"+
		"\2\2\u03ed\u03f8\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0\7Y\2\2\u03f0"+
		"\u03f5\5:\36\2\u03f1\u03f2\7\6\2\2\u03f2\u03f4\5:\36\2\u03f3\u03f1\3\2"+
		"\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6"+
		"\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03ef\3\2\2\2\u03f8\u03f9\3\2"+
		"\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03fb\7\u00ef\2\2\u03fb\u03fd\5Z.\2\u03fc"+
		"\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0401\3\2\2\2\u03fe\u03ff\7`"+
		"\2\2\u03ff\u0400\7\"\2\2\u0400\u0402\5*\26\2\u0401\u03fe\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0404\7c\2\2\u0404\u0406\5Z."+
		"\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0410\3\2\2\2\u0407\u0408"+
		"\7\u00f0\2\2\u0408\u040d\5\60\31\2\u0409\u040a\7\6\2\2\u040a\u040c\5\60"+
		"\31\2\u040b\u0409\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0407\3\2"+
		"\2\2\u0410\u0411\3\2\2\2\u0411)\3\2\2\2\u0412\u0414\5\66\34\2\u0413\u0412"+
		"\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u041a\5,\27\2\u0416"+
		"\u0417\7\6\2\2\u0417\u0419\5,\27\2\u0418\u0416\3\2\2\2\u0419\u041c\3\2"+
		"\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b+\3\2\2\2\u041c\u041a"+
		"\3\2\2\2\u041d\u0446\5.\30\2\u041e\u041f\7\u00be\2\2\u041f\u0428\7\4\2"+
		"\2\u0420\u0425\5X-\2\u0421\u0422\7\6\2\2\u0422\u0424\5X-\2\u0423\u0421"+
		"\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426"+
		"\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0428\u0420\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429\u042a\3\2\2\2\u042a\u0446\7\5\2\2\u042b\u042c\7\60\2\2\u042c"+
		"\u0435\7\4\2\2\u042d\u0432\5X-\2\u042e\u042f\7\6\2\2\u042f\u0431\5X-\2"+
		"\u0430\u042e\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u042d\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0446\7\5\2\2\u0438\u0439\7a"+
		"\2\2\u0439\u043a\7\u00cb\2\2\u043a\u043b\7\4\2\2\u043b\u0440\5.\30\2\u043c"+
		"\u043d\7\6\2\2\u043d\u043f\5.\30\2\u043e\u043c\3\2\2\2\u043f\u0442\3\2"+
		"\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0443\3\2\2\2\u0442"+
		"\u0440\3\2\2\2\u0443\u0444\7\5\2\2\u0444\u0446\3\2\2\2\u0445\u041d\3\2"+
		"\2\2\u0445\u041e\3\2\2\2\u0445\u042b\3\2\2\2\u0445\u0438\3\2\2\2\u0446"+
		"-\3\2\2\2\u0447\u0450\7\4\2\2\u0448\u044d\5X-\2\u0449\u044a\7\6\2\2\u044a"+
		"\u044c\5X-\2\u044b\u0449\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2"+
		"\2\u044d\u044e\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0448"+
		"\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0455\7\5\2\2\u0453"+
		"\u0455\5X-\2\u0454\u0447\3\2\2\2\u0454\u0453\3\2\2\2\u0455/\3\2\2\2\u0456"+
		"\u0457\5\u00a6T\2\u0457\u0458\7\34\2\2\u0458\u0459\7\4\2\2\u0459\u045a"+
		"\5\62\32\2\u045a\u045b\7\5\2\2\u045b\61\3\2\2\2\u045c\u045e\5\u00a6T\2"+
		"\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0469\3\2\2\2\u045f\u0460"+
		"\7\u00a2\2\2\u0460\u0461\7\"\2\2\u0461\u0466\5X-\2\u0462\u0463\7\6\2\2"+
		"\u0463\u0465\5X-\2\u0464\u0462\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464"+
		"\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0469"+
		"\u045f\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u0475\3\2\2\2\u046b\u046c\7\u009d"+
		"\2\2\u046c\u046d\7\"\2\2\u046d\u0472\5&\24\2\u046e\u046f\7\6\2\2\u046f"+
		"\u0471\5&\24\2\u0470\u046e\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2"+
		"\2\2\u0472\u0473\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0475"+
		"\u046b\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\3\2\2\2\u0477\u0479\5\u0084"+
		"C\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\63\3\2\2\2\u047a\u047c"+
		"\5\u00a6T\2\u047b\u047d\5T+\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2"+
		"\u047d\u047e\3\2\2\2\u047e\u047f\7\34\2\2\u047f\u0480\7\4\2\2\u0480\u0481"+
		"\5\16\b\2\u0481\u0482\7\5\2\2\u0482\65\3\2\2\2\u0483\u0484\t\r\2\2\u0484"+
		"\67\3\2\2\2\u0485\u048a\5X-\2\u0486\u0488\7\34\2\2\u0487\u0486\3\2\2\2"+
		"\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\5\u00a6T\2\u048a"+
		"\u0487\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u0495\3\2\2\2\u048c\u048d\5`"+
		"\61\2\u048d\u048e\7\3\2\2\u048e\u0491\7\u00ff\2\2\u048f\u0490\7\34\2\2"+
		"\u0490\u0492\5T+\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0495"+
		"\3\2\2\2\u0493\u0495\7\u00ff\2\2\u0494\u0485\3\2\2\2\u0494\u048c\3\2\2"+
		"\2\u0494\u0493\3\2\2\2\u04959\3\2\2\2\u0496\u0497\b\36\1\2\u0497\u0498"+
		"\5@!\2\u0498\u04ab\3\2\2\2\u0499\u04a7\f\4\2\2\u049a\u049b\7/\2\2\u049b"+
		"\u049c\7t\2\2\u049c\u04a8\5@!\2\u049d\u049e\5<\37\2\u049e\u049f\7t\2\2"+
		"\u049f\u04a0\5:\36\2\u04a0\u04a1\5> \2\u04a1\u04a8\3\2\2\2\u04a2\u04a3"+
		"\7\u0089\2\2\u04a3\u04a4\5<\37\2\u04a4\u04a5\7t\2\2\u04a5\u04a6\5@!\2"+
		"\u04a6\u04a8\3\2\2\2\u04a7\u049a\3\2\2\2\u04a7\u049d\3\2\2\2\u04a7\u04a2"+
		"\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u0499\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab"+
		"\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac;\3\2\2\2\u04ad\u04ab\3\2\2\2"+
		"\u04ae\u04b0\7j\2\2\u04af\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04be"+
		"\3\2\2\2\u04b1\u04b3\7x\2\2\u04b2\u04b4\7\u009f\2\2\u04b3\u04b2\3\2\2"+
		"\2\u04b3\u04b4\3\2\2\2\u04b4\u04be\3\2\2\2\u04b5\u04b7\7\u00ba\2\2\u04b6"+
		"\u04b8\7\u009f\2\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04be"+
		"\3\2\2\2\u04b9\u04bb\7Z\2\2\u04ba\u04bc\7\u009f\2\2\u04bb\u04ba\3\2\2"+
		"\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd\u04af\3\2\2\2\u04bd\u04b1"+
		"\3\2\2\2\u04bd\u04b5\3\2\2\2\u04bd\u04b9\3\2\2\2\u04be=\3\2\2\2\u04bf"+
		"\u04c0\7\u0098\2\2\u04c0\u04ce\5Z.\2\u04c1\u04c2\7\u00e9\2\2\u04c2\u04c3"+
		"\7\4\2\2\u04c3\u04c8\5\u00a6T\2\u04c4\u04c5\7\6\2\2\u04c5\u04c7\5\u00a6"+
		"T\2\u04c6\u04c4\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8"+
		"\u04c9\3\2\2\2\u04c9\u04cb\3\2\2\2\u04ca\u04c8\3\2\2\2\u04cb\u04cc\7\5"+
		"\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04bf\3\2\2\2\u04cd\u04c1\3\2\2\2\u04ce"+
		"?\3\2\2\2\u04cf\u04d6\5D#\2\u04d0\u04d1\7\u00d5\2\2\u04d1\u04d2\5B\"\2"+
		"\u04d2\u04d3\7\4\2\2\u04d3\u04d4\5X-\2\u04d4\u04d5\7\5\2\2\u04d5\u04d7"+
		"\3\2\2\2\u04d6\u04d0\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7A\3\2\2\2\u04d8"+
		"\u04d9\t\16\2\2\u04d9C\3\2\2\2\u04da\u052d\5R*\2\u04db\u04dc\7\u0083\2"+
		"\2\u04dc\u04e7\7\4\2\2\u04dd\u04de\7\u00a2\2\2\u04de\u04df\7\"\2\2\u04df"+
		"\u04e4\5X-\2\u04e0\u04e1\7\6\2\2\u04e1\u04e3\5X-\2\u04e2\u04e0\3\2\2\2"+
		"\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e8"+
		"\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04dd\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u04f3\3\2\2\2\u04e9\u04ea\7\u009d\2\2\u04ea\u04eb\7\"\2\2\u04eb\u04f0"+
		"\5&\24\2\u04ec\u04ed\7\6\2\2\u04ed\u04ef\5&\24\2\u04ee\u04ec\3\2\2\2\u04ef"+
		"\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f4\3\2"+
		"\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04e9\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"\u04fe\3\2\2\2\u04f5\u04f6\7\u0085\2\2\u04f6\u04fb\5F$\2\u04f7\u04f8\7"+
		"\6\2\2\u04f8\u04fa\5F$\2\u04f9\u04f7\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb"+
		"\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2"+
		"\2\2\u04fe\u04f5\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\3\2\2\2\u0500"+
		"\u0502\5H%\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0506\3\2\2"+
		"\2\u0503\u0504\7\25\2\2\u0504\u0505\7\u0080\2\2\u0505\u0507\5L\'\2\u0506"+
		"\u0503\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0509\3\2\2\2\u0508\u050a\t\17"+
		"\2\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u050c\7\u00a6\2\2\u050c\u050d\7\4\2\2\u050d\u050e\5\u0088E\2\u050e\u0518"+
		"\7\5\2\2\u050f\u0510\7\u00d0\2\2\u0510\u0515\5N(\2\u0511\u0512\7\6\2\2"+
		"\u0512\u0514\5N(\2\u0513\u0511\3\2\2\2\u0514\u0517\3\2\2\2\u0515\u0513"+
		"\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0518"+
		"\u050f\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\7B"+
		"\2\2\u051b\u0520\5P)\2\u051c\u051d\7\6\2\2\u051d\u051f\5P)\2\u051e\u051c"+
		"\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u0523\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u052b\7\5\2\2\u0524\u0526\7\34"+
		"\2\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u0529\5\u00a6T\2\u0528\u052a\5T+\2\u0529\u0528\3\2\2\2\u0529\u052a\3"+
		"\2\2\2\u052a\u052c\3\2\2\2\u052b\u0525\3\2\2\2\u052b\u052c\3\2\2\2\u052c"+
		"\u052e\3\2\2\2\u052d\u04db\3\2\2\2\u052d\u052e\3\2\2\2\u052eE\3\2\2\2"+
		"\u052f\u0530\5X-\2\u0530\u0531\7\34\2\2\u0531\u0532\5\u00a6T\2\u0532G"+
		"\3\2\2\2\u0533\u0534\7\u0099\2\2\u0534\u0535\7\u00bf\2\2\u0535\u0536\7"+
		"\u00a7\2\2\u0536\u053f\7\u0080\2\2\u0537\u0538\7\26\2\2\u0538\u0539\7"+
		"\u00c0\2\2\u0539\u053a\7\u00a7\2\2\u053a\u053c\7\u0080\2\2\u053b\u053d"+
		"\5J&\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e"+
		"\u0533\3\2\2\2\u053e\u0537\3\2\2\2\u053fI\3\2\2\2\u0540\u0541\7\u00cc"+
		"\2\2\u0541\u0542\7H\2\2\u0542\u054a\7\u0082\2\2\u0543\u0544\7\u0097\2"+
		"\2\u0544\u0545\7H\2\2\u0545\u054a\7\u0082\2\2\u0546\u0547\7\u00f1\2\2"+
		"\u0547\u0548\7\u00e4\2\2\u0548\u054a\7\u00c0\2\2\u0549\u0540\3\2\2\2\u0549"+
		"\u0543\3\2\2\2\u0549\u0546\3\2\2\2\u054aK\3\2\2\2\u054b\u054c\7\7\2\2"+
		"\u054c\u054d\7\u00db\2\2\u054d\u054e\7\u008a\2\2\u054e\u055f\7\u00bf\2"+
		"\2\u054f\u0550\7\7\2\2\u0550\u0551\7\u00a4\2\2\u0551\u0552\7v\2\2\u0552"+
		"\u055f\7\u00bf\2\2\u0553\u0554\7\7\2\2\u0554\u0555\7\u00db\2\2\u0555\u0556"+
		"\7U\2\2\u0556\u055f\5\u00a6T\2\u0557\u0558\7\7\2\2\u0558\u0559\7\u00db"+
		"\2\2\u0559\u055a\7v\2\2\u055a\u055f\5\u00a6T\2\u055b\u055c\7\7\2\2\u055c"+
		"\u055d\7\u00db\2\2\u055d\u055f\5\u00a6T\2\u055e\u054b\3\2\2\2\u055e\u054f"+
		"\3\2\2\2\u055e\u0553\3\2\2\2\u055e\u0557\3\2\2\2\u055e\u055b\3\2\2\2\u055f"+
		"M\3\2\2\2\u0560\u0561\5\u00a6T\2\u0561\u0562\7\u00f7\2\2\u0562\u0563\7"+
		"\4\2\2\u0563\u0568\5\u00a6T\2\u0564\u0565\7\6\2\2\u0565\u0567\5\u00a6"+
		"T\2\u0566\u0564\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566\3\2\2\2\u0568"+
		"\u0569\3\2\2\2\u0569\u056b\3\2\2\2\u056a\u0568\3\2\2\2\u056b\u056c\7\5"+
		"\2\2\u056cO\3\2\2\2\u056d\u056e\5\u00a6T\2\u056e\u056f\7\34\2\2\u056f"+
		"\u0570\5X-\2\u0570Q\3\2\2\2\u0571\u0579\5V,\2\u0572\u0574\7\34\2\2\u0573"+
		"\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\5\u00a6"+
		"T\2\u0576\u0578\5T+\2\u0577\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057a"+
		"\3\2\2\2\u0579\u0573\3\2\2\2\u0579\u057a\3\2\2\2\u057aS\3\2\2\2\u057b"+
		"\u057c\7\4\2\2\u057c\u0581\5\u00a6T\2\u057d\u057e\7\6\2\2\u057e\u0580"+
		"\5\u00a6T\2\u057f\u057d\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2\2"+
		"\2\u0581\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583\u0581\3\2\2\2\u0584\u0585"+
		"\7\5\2\2\u0585U\3\2\2\2\u0586\u05a4\5\u009eP\2\u0587\u0588\7\4\2\2\u0588"+
		"\u0589\5\16\b\2\u0589\u058a\7\5\2\2\u058a\u05a4\3\2\2\2\u058b\u058c\7"+
		"\u00e5\2\2\u058c\u058d\7\4\2\2\u058d\u0592\5X-\2\u058e\u058f\7\6\2\2\u058f"+
		"\u0591\5X-\2\u0590\u058e\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2"+
		"\2\u0592\u0593\3\2\2\2\u0593\u0595\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u0598"+
		"\7\5\2\2\u0596\u0597\7\u00f1\2\2\u0597\u0599\7\u009e\2\2\u0598\u0596\3"+
		"\2\2\2\u0598\u0599\3\2\2\2\u0599\u05a4\3\2\2\2\u059a\u059b\7w\2\2\u059b"+
		"\u059c\7\4\2\2\u059c\u059d\5\16\b\2\u059d\u059e\7\5\2\2\u059e\u05a4\3"+
		"\2\2\2\u059f\u05a0\7\4\2\2\u05a0\u05a1\5:\36\2\u05a1\u05a2\7\5\2\2\u05a2"+
		"\u05a4\3\2\2\2\u05a3\u0586\3\2\2\2\u05a3\u0587\3\2\2\2\u05a3\u058b\3\2"+
		"\2\2\u05a3\u059a\3\2\2\2\u05a3\u059f\3\2\2\2\u05a4W\3\2\2\2\u05a5\u05a6"+
		"\5Z.\2\u05a6Y\3\2\2\2\u05a7\u05a8\b.\1\2\u05a8\u05aa\5^\60\2\u05a9\u05ab"+
		"\5\\/\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05af\3\2\2\2\u05ac"+
		"\u05ad\7\u0092\2\2\u05ad\u05af\5Z.\5\u05ae\u05a7\3\2\2\2\u05ae\u05ac\3"+
		"\2\2\2\u05af\u05b8\3\2\2\2\u05b0\u05b1\f\4\2\2\u05b1\u05b2\7\31\2\2\u05b2"+
		"\u05b7\5Z.\5\u05b3\u05b4\f\3\2\2\u05b4\u05b5\7\u009c\2\2\u05b5\u05b7\5"+
		"Z.\4\u05b6\u05b0\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b7\u05ba\3\2\2\2\u05b8"+
		"\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9[\3\2\2\2\u05ba\u05b8\3\2\2\2"+
		"\u05bb\u05bc\5j\66\2\u05bc\u05bd\5^\60\2\u05bd\u05f9\3\2\2\2\u05be\u05bf"+
		"\5j\66\2\u05bf\u05c0\5l\67\2\u05c0\u05c1\7\4\2\2\u05c1\u05c2\5\16\b\2"+
		"\u05c2\u05c3\7\5\2\2\u05c3\u05f9\3\2\2\2\u05c4\u05c6\7\u0092\2\2\u05c5"+
		"\u05c4\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\7!"+
		"\2\2\u05c8\u05c9\5^\60\2\u05c9\u05ca\7\31\2\2\u05ca\u05cb\5^\60\2\u05cb"+
		"\u05f9\3\2\2\2\u05cc\u05ce\7\u0092\2\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce"+
		"\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\7g\2\2\u05d0\u05d1\7\4\2\2\u05d1"+
		"\u05d6\5X-\2\u05d2\u05d3\7\6\2\2\u05d3\u05d5\5X-\2\u05d4\u05d2\3\2\2\2"+
		"\u05d5\u05d8\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9"+
		"\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9\u05da\7\5\2\2\u05da\u05f9\3\2\2\2\u05db"+
		"\u05dd\7\u0092\2\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de"+
		"\3\2\2\2\u05de\u05df\7g\2\2\u05df\u05e0\7\4\2\2\u05e0\u05e1\5\16\b\2\u05e1"+
		"\u05e2\7\5\2\2\u05e2\u05f9\3\2\2\2\u05e3\u05e5\7\u0092\2\2\u05e4\u05e3"+
		"\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\7z\2\2\u05e7"+
		"\u05ea\5^\60\2\u05e8\u05e9\7J\2\2\u05e9\u05eb\5^\60\2\u05ea\u05e8\3\2"+
		"\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05f9\3\2\2\2\u05ec\u05ee\7r\2\2\u05ed"+
		"\u05ef\7\u0092\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u05f9\7\u0093\2\2\u05f1\u05f3\7r\2\2\u05f2\u05f4\7\u0092"+
		"\2\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05f6\7C\2\2\u05f6\u05f7\7Y\2\2\u05f7\u05f9\5^\60\2\u05f8\u05bb\3\2\2"+
		"\2\u05f8\u05be\3\2\2\2\u05f8\u05c5\3\2\2\2\u05f8\u05cd\3\2\2\2\u05f8\u05dc"+
		"\3\2\2\2\u05f8\u05e4\3\2\2\2\u05f8\u05ec\3\2\2\2\u05f8\u05f1\3\2\2\2\u05f9"+
		"]\3\2\2\2\u05fa\u05fb\b\60\1\2\u05fb\u05ff\5`\61\2\u05fc\u05fd\t\20\2"+
		"\2\u05fd\u05ff\5^\60\6\u05fe\u05fa\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u060e"+
		"\3\2\2\2\u0600\u0601\f\5\2\2\u0601\u0602\t\21\2\2\u0602\u060d\5^\60\6"+
		"\u0603\u0604\f\4\2\2\u0604\u0605\t\20\2\2\u0605\u060d\5^\60\5\u0606\u0607"+
		"\f\3\2\2\u0607\u0608\7\u0102\2\2\u0608\u060d\5^\60\4\u0609\u060a\f\7\2"+
		"\2\u060a\u060b\7\36\2\2\u060b\u060d\5h\65\2\u060c\u0600\3\2\2\2\u060c"+
		"\u0603\3\2\2\2\u060c\u0606\3\2\2\2\u060c\u0609\3\2\2\2\u060d\u0610\3\2"+
		"\2\2\u060e\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060f_\3\2\2\2\u0610\u060e"+
		"\3\2\2\2\u0611\u0612\b\61\1\2\u0612\u0708\7\u0093\2\2\u0613\u0708\5p9"+
		"\2\u0614\u0615\5\u00a6T\2\u0615\u0616\5f\64\2\u0616\u0708\3\2\2\2\u0617"+
		"\u0618\7E\2\2\u0618\u0619\7\u00ab\2\2\u0619\u0708\5f\64\2\u061a\u0708"+
		"\5\u00a8U\2\u061b\u0708\5n8\2\u061c\u0708\5f\64\2\u061d\u0708\7\u0106"+
		"\2\2\u061e\u0708\7\u0103\2\2\u061f\u0620\7\u00a9\2\2\u0620\u0621\7\4\2"+
		"\2\u0621\u0622\5^\60\2\u0622\u0623\7g\2\2\u0623\u0624\5^\60\2\u0624\u0625"+
		"\7\5\2\2\u0625\u0708\3\2\2\2\u0626\u0627\7\4\2\2\u0627\u062a\5X-\2\u0628"+
		"\u0629\7\6\2\2\u0629\u062b\5X-\2\u062a\u0628\3\2\2\2\u062b\u062c\3\2\2"+
		"\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f"+
		"\7\5\2\2\u062f\u0708\3\2\2\2\u0630\u0631\7\u00bf\2\2\u0631\u0632\7\4\2"+
		"\2\u0632\u0637\5X-\2\u0633\u0634\7\6\2\2\u0634\u0636\5X-\2\u0635\u0633"+
		"\3\2\2\2\u0636\u0639\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0638\3\2\2\2\u0638"+
		"\u063a\3\2\2\2\u0639\u0637\3\2\2\2\u063a\u063b\7\5\2\2\u063b\u0708\3\2"+
		"\2\2\u063c\u063d\5\u009eP\2\u063d\u063e\7\4\2\2\u063e\u063f\7\u00ff\2"+
		"\2\u063f\u0641\7\5\2\2\u0640\u0642\5~@\2\u0641\u0640\3\2\2\2\u0641\u0642"+
		"\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0645\5\u0082B\2\u0644\u0643\3\2\2"+
		"\2\u0644\u0645\3\2\2\2\u0645\u0708\3\2\2\2\u0646\u0648\5b\62\2\u0647\u0646"+
		"\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064a\5\u009eP"+
		"\2\u064a\u0656\7\4\2\2\u064b\u064d\5\66\34\2\u064c\u064b\3\2\2\2\u064c"+
		"\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0653\5X-\2\u064f\u0650\7\6\2"+
		"\2\u0650\u0652\5X-\2\u0651\u064f\3\2\2\2\u0652\u0655\3\2\2\2\u0653\u0651"+
		"\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0657\3\2\2\2\u0655\u0653\3\2\2\2\u0656"+
		"\u064c\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0662\3\2\2\2\u0658\u0659\7\u009d"+
		"\2\2\u0659\u065a\7\"\2\2\u065a\u065f\5&\24\2\u065b\u065c\7\6\2\2\u065c"+
		"\u065e\5&\24\2\u065d\u065b\3\2\2\2\u065e\u0661\3\2\2\2\u065f\u065d\3\2"+
		"\2\2\u065f\u0660\3\2\2\2\u0660\u0663\3\2\2\2\u0661\u065f\3\2\2\2\u0662"+
		"\u0658\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0666\7\5"+
		"\2\2\u0665\u0667\5~@\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u066c"+
		"\3\2\2\2\u0668\u066a\5d\63\2\u0669\u0668\3\2\2\2\u0669\u066a\3\2\2\2\u066a"+
		"\u066b\3\2\2\2\u066b\u066d\5\u0082B\2\u066c\u0669\3\2\2\2\u066c\u066d"+
		"\3\2\2\2\u066d\u0708\3\2\2\2\u066e\u066f\5\u00a6T\2\u066f\u0670\7\b\2"+
		"\2\u0670\u0671\5X-\2\u0671\u0708\3\2\2\2\u0672\u067b\7\4\2\2\u0673\u0678"+
		"\5\u00a6T\2\u0674\u0675\7\6\2\2\u0675\u0677\5\u00a6T\2\u0676\u0674\3\2"+
		"\2\2\u0677\u067a\3\2\2\2\u0678\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679"+
		"\u067c\3\2\2\2\u067a\u0678\3\2\2\2\u067b\u0673\3\2\2\2\u067b\u067c\3\2"+
		"\2\2\u067c\u067d\3\2\2\2\u067d\u067e\7\5\2\2\u067e\u067f\7\b\2\2\u067f"+
		"\u0708\5X-\2\u0680\u0681\7\4\2\2\u0681\u0682\5\16\b\2\u0682\u0683\7\5"+
		"\2\2\u0683\u0708\3\2\2\2\u0684\u0685\7N\2\2\u0685\u0686\7\4\2\2\u0686"+
		"\u0687\5\16\b\2\u0687\u0688\7\5\2\2\u0688\u0708\3\2\2\2\u0689\u068a\7"+
		"%\2\2\u068a\u068c\5X-\2\u068b\u068d\5|?\2\u068c\u068b\3\2\2\2\u068d\u068e"+
		"\3\2\2\2\u068e\u068c\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0692\3\2\2\2\u0690"+
		"\u0691\7G\2\2\u0691\u0693\5X-\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2\2"+
		"\2\u0693\u0694\3\2\2\2\u0694\u0695\7I\2\2\u0695\u0708\3\2\2\2\u0696\u0698"+
		"\7%\2\2\u0697\u0699\5|?\2\u0698\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069d\7G"+
		"\2\2\u069d\u069f\5X-\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0"+
		"\3\2\2\2\u06a0\u06a1\7I\2\2\u06a1\u0708\3\2\2\2\u06a2\u06a3\7&\2\2\u06a3"+
		"\u06a4\7\4\2\2\u06a4\u06a5\5X-\2\u06a5\u06a6\7\34\2\2\u06a6\u06a7\5v<"+
		"\2\u06a7\u06a8\7\5\2\2\u06a8\u0708\3\2\2\2\u06a9\u06aa\7\u00de\2\2\u06aa"+
		"\u06ab\7\4\2\2\u06ab\u06ac\5X-\2\u06ac\u06ad\7\34\2\2\u06ad\u06ae\5v<"+
		"\2\u06ae\u06af\7\5\2\2\u06af\u0708\3\2\2\2\u06b0\u06b1\7\33\2\2\u06b1"+
		"\u06ba\7\t\2\2\u06b2\u06b7\5X-\2\u06b3\u06b4\7\6\2\2\u06b4\u06b6\5X-\2"+
		"\u06b5\u06b3\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8"+
		"\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba\u06b2\3\2\2\2\u06ba"+
		"\u06bb\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u0708\7\n\2\2\u06bd\u0708\5\u00a6"+
		"T\2\u06be\u0708\7\63\2\2\u06bf\u06c3\7\67\2\2\u06c0\u06c1\7\4\2\2\u06c1"+
		"\u06c2\7\u0107\2\2\u06c2\u06c4\7\5\2\2\u06c3\u06c0\3\2\2\2\u06c3\u06c4"+
		"\3\2\2\2\u06c4\u0708\3\2\2\2\u06c5\u06c9\78\2\2\u06c6\u06c7\7\4\2\2\u06c7"+
		"\u06c8\7\u0107\2\2\u06c8\u06ca\7\5\2\2\u06c9\u06c6\3\2\2\2\u06c9\u06ca"+
		"\3\2\2\2\u06ca\u0708\3\2\2\2\u06cb\u06cf\7|\2\2\u06cc\u06cd\7\4\2\2\u06cd"+
		"\u06ce\7\u0107\2\2\u06ce\u06d0\7\5\2\2\u06cf\u06cc\3\2\2\2\u06cf\u06d0"+
		"\3\2\2\2\u06d0\u0708\3\2\2\2\u06d1\u06d5\7}\2\2\u06d2\u06d3\7\4\2\2\u06d3"+
		"\u06d4\7\u0107\2\2\u06d4\u06d6\7\5\2\2\u06d5\u06d2\3\2\2\2\u06d5\u06d6"+
		"\3\2\2\2\u06d6\u0708\3\2\2\2\u06d7\u0708\79\2\2\u06d8\u0708\7\62\2\2\u06d9"+
		"\u0708\7\66\2\2\u06da\u0708\7\64\2\2\u06db\u06dc\7\u00d1\2\2\u06dc\u06dd"+
		"\7\4\2\2\u06dd\u06de\5^\60\2\u06de\u06df\7Y\2\2\u06df\u06e2\5^\60\2\u06e0"+
		"\u06e1\7W\2\2\u06e1\u06e3\5^\60\2\u06e2\u06e0\3\2\2\2\u06e2\u06e3\3\2"+
		"\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\7\5\2\2\u06e5\u0708\3\2\2\2\u06e6"+
		"\u06e7\7\u0091\2\2\u06e7\u06e8\7\4\2\2\u06e8\u06eb\5^\60\2\u06e9\u06ea"+
		"\7\6\2\2\u06ea\u06ec\5t;\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec"+
		"\u06ed\3\2\2\2\u06ed\u06ee\7\5\2\2\u06ee\u0708\3\2\2\2\u06ef\u06f0\7P"+
		"\2\2\u06f0\u06f1\7\4\2\2\u06f1\u06f2\5\u00a6T\2\u06f2\u06f3\7Y\2\2\u06f3"+
		"\u06f4\5^\60\2\u06f4\u06f5\7\5\2\2\u06f5\u0708\3\2\2\2\u06f6\u06f7\7\4"+
		"\2\2\u06f7\u06f8\5X-\2\u06f8\u06f9\7\5\2\2\u06f9\u0708\3\2\2\2\u06fa\u06fb"+
		"\7a\2\2\u06fb\u0704\7\4\2\2\u06fc\u0701\5\u009eP\2\u06fd\u06fe\7\6\2\2"+
		"\u06fe\u0700\5\u009eP\2\u06ff\u06fd\3\2\2\2\u0700\u0703\3\2\2\2\u0701"+
		"\u06ff\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2"+
		"\2\2\u0704\u06fc\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0706\3\2\2\2\u0706"+
		"\u0708\7\5\2\2\u0707\u0611\3\2\2\2\u0707\u0613\3\2\2\2\u0707\u0614\3\2"+
		"\2\2\u0707\u0617\3\2\2\2\u0707\u061a\3\2\2\2\u0707\u061b\3\2\2\2\u0707"+
		"\u061c\3\2\2\2\u0707\u061d\3\2\2\2\u0707\u061e\3\2\2\2\u0707\u061f\3\2"+
		"\2\2\u0707\u0626\3\2\2\2\u0707\u0630\3\2\2\2\u0707\u063c\3\2\2\2\u0707"+
		"\u0647\3\2\2\2\u0707\u066e\3\2\2\2\u0707\u0672\3\2\2\2\u0707\u0680\3\2"+
		"\2\2\u0707\u0684\3\2\2\2\u0707\u0689\3\2\2\2\u0707\u0696\3\2\2\2\u0707"+
		"\u06a2\3\2\2\2\u0707\u06a9\3\2\2\2\u0707\u06b0\3\2\2\2\u0707\u06bd\3\2"+
		"\2\2\u0707\u06be\3\2\2\2\u0707\u06bf\3\2\2\2\u0707\u06c5\3\2\2\2\u0707"+
		"\u06cb\3\2\2\2\u0707\u06d1\3\2\2\2\u0707\u06d7\3\2\2\2\u0707\u06d8\3\2"+
		"\2\2\u0707\u06d9\3\2\2\2\u0707\u06da\3\2\2\2\u0707\u06db\3\2\2\2\u0707"+
		"\u06e6\3\2\2\2\u0707\u06ef\3\2\2\2\u0707\u06f6\3\2\2\2\u0707\u06fa\3\2"+
		"\2\2\u0708\u0713\3\2\2\2\u0709\u070a\f\23\2\2\u070a\u070b\7\t\2\2\u070b"+
		"\u070c\5^\60\2\u070c\u070d\7\n\2\2\u070d\u0712\3\2\2\2\u070e\u070f\f\21"+
		"\2\2\u070f\u0710\7\3\2\2\u0710\u0712\5\u00a6T\2\u0711\u0709\3\2\2\2\u0711"+
		"\u070e\3\2\2\2\u0712\u0715\3\2\2\2\u0713\u0711\3\2\2\2\u0713\u0714\3\2"+
		"\2\2\u0714a\3\2\2\2\u0715\u0713\3\2\2\2\u0716\u0717\t\22\2\2\u0717c\3"+
		"\2\2\2\u0718\u0719\7f\2\2\u0719\u071d\7\u0095\2\2\u071a\u071b\7\u00b7"+
		"\2\2\u071b\u071d\7\u0095\2\2\u071c\u0718\3\2\2\2\u071c\u071a\3\2\2\2\u071d"+
		"e\3\2\2\2\u071e\u0725\7\u0104\2\2\u071f\u0722\7\u0105\2\2\u0720\u0721"+
		"\7\u00e0\2\2\u0721\u0723\7\u0104\2\2\u0722\u0720\3\2\2\2\u0722\u0723\3"+
		"\2\2\2\u0723\u0725\3\2\2\2\u0724\u071e\3\2\2\2\u0724\u071f\3\2\2\2\u0725"+
		"g\3\2\2\2\u0726\u0727\7\u00d9\2\2\u0727\u0728\7\u00f6\2\2\u0728\u072d"+
		"\5p9\2\u0729\u072a\7\u00d9\2\2\u072a\u072b\7\u00f6\2\2\u072b\u072d\5f"+
		"\64\2\u072c\u0726\3\2\2\2\u072c\u0729\3\2\2\2\u072di\3\2\2\2\u072e\u072f"+
		"\t\23\2\2\u072fk\3\2\2\2\u0730\u0731\t\24\2\2\u0731m\3\2\2\2\u0732\u0733"+
		"\t\25\2\2\u0733o\3\2\2\2\u0734\u0736\7n\2\2\u0735\u0737\t\20\2\2\u0736"+
		"\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u0739\5f"+
		"\64\2\u0739\u073c\5r:\2\u073a\u073b\7\u00db\2\2\u073b\u073d\5r:\2\u073c"+
		"\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073dq\3\2\2\2\u073e\u073f\t\26\2\2"+
		"\u073fs\3\2\2\2\u0740\u0741\t\27\2\2\u0741u\3\2\2\2\u0742\u0743\b<\1\2"+
		"\u0743\u0744\7\u00bf\2\2\u0744\u0745\7\4\2\2\u0745\u074a\5x=\2\u0746\u0747"+
		"\7\6\2\2\u0747\u0749\5x=\2\u0748\u0746\3\2\2\2\u0749\u074c\3\2\2\2\u074a"+
		"\u0748\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074d\3\2\2\2\u074c\u074a\3\2"+
		"\2\2\u074d\u074e\7\5\2\2\u074e\u079e\3\2\2\2\u074f\u0750\7n\2\2\u0750"+
		"\u0753\5r:\2\u0751\u0752\7\u00db\2\2\u0752\u0754\5r:\2\u0753\u0751\3\2"+
		"\2\2\u0753\u0754\3\2\2\2\u0754\u079e\3\2\2\2\u0755\u075a\7\u00da\2\2\u0756"+
		"\u0757\7\4\2\2\u0757\u0758\5z>\2\u0758\u0759\7\5\2\2\u0759\u075b\3\2\2"+
		"\2\u075a\u0756\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075f\3\2\2\2\u075c\u075d"+
		"\7\u00f2\2\2\u075d\u075e\7\u00d9\2\2\u075e\u0760\7\u00f6\2\2\u075f\u075c"+
		"\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u079e\3\2\2\2\u0761\u0766\7\u00da\2"+
		"\2\u0762\u0763\7\4\2\2\u0763\u0764\5z>\2\u0764\u0765\7\5\2\2\u0765\u0767"+
		"\3\2\2\2\u0766\u0762\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768\3\2\2\2\u0768"+
		"\u0769\7\u00f1\2\2\u0769\u076a\7\u00d9\2\2\u076a\u079e\7\u00f6\2\2\u076b"+
		"\u0770\7\u00d9\2\2\u076c\u076d\7\4\2\2\u076d\u076e\5z>\2\u076e\u076f\7"+
		"\5\2\2\u076f\u0771\3\2\2\2\u0770\u076c\3\2\2\2\u0770\u0771\3\2\2\2\u0771"+
		"\u0775\3\2\2\2\u0772\u0773\7\u00f2\2\2\u0773\u0774\7\u00d9\2\2\u0774\u0776"+
		"\7\u00f6\2\2\u0775\u0772\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u079e\3\2\2"+
		"\2\u0777\u077c\7\u00d9\2\2\u0778\u0779\7\4\2\2\u0779\u077a\5z>\2\u077a"+
		"\u077b\7\5\2\2\u077b\u077d\3\2\2\2\u077c\u0778\3\2\2\2\u077c\u077d\3\2"+
		"\2\2\u077d\u077e\3\2\2\2\u077e\u077f\7\u00f1\2\2\u077f\u0780\7\u00d9\2"+
		"\2\u0780\u079e\7\u00f6\2\2\u0781\u0782\7E\2\2\u0782\u079e\7\u00ab\2\2"+
		"\u0783\u0784\7\33\2\2\u0784\u0785\7\u00f9\2\2\u0785\u0786\5v<\2\u0786"+
		"\u0787\7\u00fb\2\2\u0787\u079e\3\2\2\2\u0788\u0789\7\177\2\2\u0789\u078a"+
		"\7\u00f9\2\2\u078a\u078b\5v<\2\u078b\u078c\7\6\2\2\u078c\u078d\5v<\2\u078d"+
		"\u078e\7\u00fb\2\2\u078e\u079e\3\2\2\2\u078f\u079b\5\u00a6T\2\u0790\u0791"+
		"\7\4\2\2\u0791\u0796\5z>\2\u0792\u0793\7\6\2\2\u0793\u0795\5z>\2\u0794"+
		"\u0792\3\2\2\2\u0795\u0798\3\2\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2"+
		"\2\2\u0797\u0799\3\2\2\2\u0798\u0796\3\2\2\2\u0799\u079a\7\5\2\2\u079a"+
		"\u079c\3\2\2\2\u079b\u0790\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079e\3\2"+
		"\2\2\u079d\u0742\3\2\2\2\u079d\u074f\3\2\2\2\u079d\u0755\3\2\2\2\u079d"+
		"\u0761\3\2\2\2\u079d\u076b\3\2\2\2\u079d\u0777\3\2\2\2\u079d\u0781\3\2"+
		"\2\2\u079d\u0783\3\2\2\2\u079d\u0788\3\2\2\2\u079d\u078f\3\2\2\2\u079e"+
		"\u07a8\3\2\2\2\u079f\u07a0\f\4\2\2\u07a0\u07a4\7\33\2\2\u07a1\u07a2\7"+
		"\t\2\2\u07a2\u07a3\7\u0107\2\2\u07a3\u07a5\7\n\2\2\u07a4\u07a1\3\2\2\2"+
		"\u07a4\u07a5\3\2\2\2\u07a5\u07a7\3\2\2\2\u07a6\u079f\3\2\2\2\u07a7\u07aa"+
		"\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9w\3\2\2\2\u07aa"+
		"\u07a8\3\2\2\2\u07ab\u07b0\5v<\2\u07ac\u07ad\5\u00a6T\2\u07ad\u07ae\5"+
		"v<\2\u07ae\u07b0\3\2\2\2\u07af\u07ab\3\2\2\2\u07af\u07ac\3\2\2\2\u07b0"+
		"y\3\2\2\2\u07b1\u07b4\7\u0107\2\2\u07b2\u07b4\5v<\2\u07b3\u07b1\3\2\2"+
		"\2\u07b3\u07b2\3\2\2\2\u07b4{\3\2\2\2\u07b5\u07b6\7\u00ee\2\2\u07b6\u07b7"+
		"\5X-\2\u07b7\u07b8\7\u00d7\2\2\u07b8\u07b9\5X-\2\u07b9}\3\2\2\2\u07ba"+
		"\u07bb\7S\2\2\u07bb\u07bc\7\4\2\2\u07bc\u07bd\7\u00ef\2\2\u07bd\u07be"+
		"\5Z.\2\u07be\u07bf\7\5\2\2\u07bf\177\3\2\2\2\u07c0\u07c1\7\u00ee\2\2\u07c1"+
		"\u07c4\7\u0081\2\2\u07c2\u07c3\7\31\2\2\u07c3\u07c5\5X-\2\u07c4\u07c2"+
		"\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c7\7\u00d7\2"+
		"\2\u07c7\u07c8\7\u00e6\2\2\u07c8\u07c9\7\u00ca\2\2\u07c9\u07ca\5\u00a6"+
		"T\2\u07ca\u07cb\7\u00f7\2\2\u07cb\u07d3\5X-\2\u07cc\u07cd\7\6\2\2\u07cd"+
		"\u07ce\5\u00a6T\2\u07ce\u07cf\7\u00f7\2\2\u07cf\u07d0\5X-\2\u07d0\u07d2"+
		"\3\2\2\2\u07d1\u07cc\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d3"+
		"\u07d4\3\2\2\2\u07d4\u0801\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d6\u07d7\7\u00ee"+
		"\2\2\u07d7\u07da\7\u0081\2\2\u07d8\u07d9\7\31\2\2\u07d9\u07db\5X-\2\u07da"+
		"\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\7\u00d7"+
		"\2\2\u07dd\u0801\7?\2\2\u07de\u07df\7\u00ee\2\2\u07df\u07e0\7\u0092\2"+
		"\2\u07e0\u07e3\7\u0081\2\2\u07e1\u07e2\7\31\2\2\u07e2\u07e4\5X-\2\u07e3"+
		"\u07e1\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e6\7\u00d7"+
		"\2\2\u07e6\u07f2\7l\2\2\u07e7\u07e8\7\4\2\2\u07e8\u07ed\5\u00a6T\2\u07e9"+
		"\u07ea\7\6\2\2\u07ea\u07ec\5\u00a6T\2\u07eb\u07e9\3\2\2\2\u07ec\u07ef"+
		"\3\2\2\2\u07ed\u07eb\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07f0\3\2\2\2\u07ef"+
		"\u07ed\3\2\2\2\u07f0\u07f1\7\5\2\2\u07f1\u07f3\3\2\2\2\u07f2\u07e7\3\2"+
		"\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\7\u00eb\2\2\u07f5"+
		"\u07f6\7\4\2\2\u07f6\u07fb\5X-\2\u07f7\u07f8\7\6\2\2\u07f8\u07fa\5X-\2"+
		"\u07f9\u07f7\3\2\2\2\u07fa\u07fd\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc"+
		"\3\2\2\2\u07fc\u07fe\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fe\u07ff\7\5\2\2\u07ff"+
		"\u0801\3\2\2\2\u0800\u07c0\3\2\2\2\u0800\u07d6\3\2\2\2\u0800\u07de\3\2"+
		"\2\2\u0801\u0081\3\2\2\2\u0802\u0808\7\u00a1\2\2\u0803\u0809\5\u00a6T"+
		"\2\u0804\u0805\7\4\2\2\u0805\u0806\5\62\32\2\u0806\u0807\7\5\2\2\u0807"+
		"\u0809\3\2\2\2\u0808\u0803\3\2\2\2\u0808\u0804\3\2\2\2\u0809\u0083\3\2"+
		"\2\2\u080a\u080b\7\u00af\2\2\u080b\u0823\5\u0086D\2\u080c\u080d\7\u00c0"+
		"\2\2\u080d\u0823\5\u0086D\2\u080e\u080f\7b\2\2\u080f\u0823\5\u0086D\2"+
		"\u0810\u0811\7\u00af\2\2\u0811\u0812\7!\2\2\u0812\u0813\5\u0086D\2\u0813"+
		"\u0814\7\31\2\2\u0814\u0815\5\u0086D\2\u0815\u0823\3\2\2\2\u0816\u0817"+
		"\7\u00c0\2\2\u0817\u0818\7!\2\2\u0818\u0819\5\u0086D\2\u0819\u081a\7\31"+
		"\2\2\u081a\u081b\5\u0086D\2\u081b\u0823\3\2\2\2\u081c\u081d\7b\2\2\u081d"+
		"\u081e\7!\2\2\u081e\u081f\5\u0086D\2\u081f\u0820\7\31\2\2\u0820\u0821"+
		"\5\u0086D\2\u0821\u0823\3\2\2\2\u0822\u080a\3\2\2\2\u0822\u080c\3\2\2"+
		"\2\u0822\u080e\3\2\2\2\u0822\u0810\3\2\2\2\u0822\u0816\3\2\2\2\u0822\u081c"+
		"\3\2\2\2\u0823\u0085\3\2\2\2\u0824\u0825\7\u00e1\2\2\u0825\u082e\7\u00aa"+
		"\2\2\u0826\u0827\7\u00e1\2\2\u0827\u082e\7V\2\2\u0828\u0829\7\61\2\2\u0829"+
		"\u082e\7\u00bf\2\2\u082a\u082b\5X-\2\u082b\u082c\t\30\2\2\u082c\u082e"+
		"\3\2\2\2\u082d\u0824\3\2\2\2\u082d\u0826\3\2\2\2\u082d\u0828\3\2\2\2\u082d"+
		"\u082a\3\2\2\2\u082e\u0087\3\2\2\2\u082f\u0830\bE\1\2\u0830\u0832\5\u008a"+
		"F\2\u0831\u0833\5\u008cG\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833"+
		"\u083b\3\2\2\2\u0834\u0835\f\4\2\2\u0835\u083a\5\u0088E\5\u0836\u0837"+
		"\f\3\2\2\u0837\u0838\7\13\2\2\u0838\u083a\5\u0088E\4\u0839\u0834\3\2\2"+
		"\2\u0839\u0836\3\2\2\2\u083a\u083d\3\2\2\2\u083b\u0839\3\2\2\2\u083b\u083c"+
		"\3\2\2\2\u083c\u0089\3\2\2\2\u083d\u083b\3\2\2\2\u083e\u0858\5\u00a6T"+
		"\2\u083f\u0840\7\4\2\2\u0840\u0858\7\5\2\2\u0841\u0842\7\u00a8\2\2\u0842"+
		"\u0843\7\4\2\2\u0843\u0848\5\u0088E\2\u0844\u0845\7\6\2\2\u0845\u0847"+
		"\5\u0088E\2\u0846\u0844\3\2\2\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2"+
		"\2\u0848\u0849\3\2\2\2\u0849\u084b\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u084c"+
		"\7\5\2\2\u084c\u0858\3\2\2\2\u084d\u084e\7\4\2\2\u084e\u084f\5\u0088E"+
		"\2\u084f\u0850\7\5\2\2\u0850\u0858\3\2\2\2\u0851\u0858\7\f\2\2\u0852\u0858"+
		"\7\r\2\2\u0853\u0854\7\16\2\2\u0854\u0855\5\u0088E\2\u0855\u0856\7\17"+
		"\2\2\u0856\u0858\3\2\2\2\u0857\u083e\3\2\2\2\u0857\u083f\3\2\2\2\u0857"+
		"\u0841\3\2\2\2\u0857\u084d\3\2\2\2\u0857\u0851\3\2\2\2\u0857\u0852\3\2"+
		"\2\2\u0857\u0853\3\2\2\2\u0858\u008b\3\2\2\2\u0859\u085b\7\u00ff\2\2\u085a"+
		"\u085c\7\u0103\2\2\u085b\u085a\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u0878"+
		"\3\2\2\2\u085d\u085f\7\u00fd\2\2\u085e\u0860\7\u0103\2\2\u085f\u085e\3"+
		"\2\2\2\u085f\u0860\3\2\2\2\u0860\u0878\3\2\2\2\u0861\u0863\7\u0103\2\2"+
		"\u0862\u0864\7\u0103\2\2\u0863\u0862\3\2\2\2\u0863\u0864\3\2\2\2\u0864"+
		"\u0878\3\2\2\2\u0865\u0866\7\20\2\2\u0866\u0867\7\u0107\2\2\u0867\u0869"+
		"\7\21\2\2\u0868\u086a\7\u0103\2\2\u0869\u0868\3\2\2\2\u0869\u086a\3\2"+
		"\2\2\u086a\u0878\3\2\2\2\u086b\u086d\7\20\2\2\u086c\u086e\7\u0107\2\2"+
		"\u086d\u086c\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0871"+
		"\7\6\2\2\u0870\u0872\7\u0107\2\2\u0871\u0870\3\2\2\2\u0871\u0872\3\2\2"+
		"\2\u0872\u0873\3\2\2\2\u0873\u0875\7\21\2\2\u0874\u0876\7\u0103\2\2\u0875"+
		"\u0874\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0878\3\2\2\2\u0877\u0859\3\2"+
		"\2\2\u0877\u085d\3\2\2\2\u0877\u0861\3\2\2\2\u0877\u0865\3\2\2\2\u0877"+
		"\u086b\3\2\2\2\u0878\u008d\3\2\2\2\u0879\u087a\5\u00a6T\2\u087a\u087b"+
		"\7\u00f7\2\2\u087b\u087c\5X-\2\u087c\u008f\3\2\2\2\u087d\u087e\7X\2\2"+
		"\u087e\u0882\t\31\2\2\u087f\u0880\7\u00df\2\2\u0880\u0882\t\32\2\2\u0881"+
		"\u087d\3\2\2\2\u0881\u087f\3\2\2\2\u0882\u0091\3\2\2\2\u0883\u0884\7s"+
		"\2\2\u0884\u0885\7y\2\2\u0885\u0889\5\u0094K\2\u0886\u0887\7\u00b0\2\2"+
		"\u0887\u0889\t\33\2\2\u0888\u0883\3\2\2\2\u0888\u0886\3\2\2\2\u0889\u0093"+
		"\3\2\2\2\u088a\u088b\7\u00b0\2\2\u088b\u0892\7\u00e2\2\2\u088c\u088d\7"+
		"\u00b0\2\2\u088d\u0892\7,\2\2\u088e\u088f\7\u00b4\2\2\u088f\u0892\7\u00b0"+
		"\2\2\u0890\u0892\7\u00c8\2\2\u0891\u088a\3\2\2\2\u0891\u088c\3\2\2\2\u0891"+
		"\u088e\3\2\2\2\u0891\u0890\3\2\2\2\u0892\u0095\3\2\2\2\u0893\u0899\5X"+
		"-\2\u0894\u0895\5\u00a6T\2\u0895\u0896\7\22\2\2\u0896\u0897\5X-\2\u0897"+
		"\u0899\3\2\2\2\u0898\u0893\3\2\2\2\u0898\u0894\3\2\2\2\u0899\u0097\3\2"+
		"\2\2\u089a\u089b\5\u00a6T\2\u089b\u089c\7\3\2\2\u089c\u089d\5\u00a6T\2"+
		"\u089d\u08a0\3\2\2\2\u089e\u08a0\5\u00a6T\2\u089f\u089a\3\2\2\2\u089f"+
		"\u089e\3\2\2\2\u08a0\u0099\3\2\2\2\u08a1\u08a6\5\u0098M\2\u08a2\u08a3"+
		"\7\6\2\2\u08a3\u08a5\5\u0098M\2\u08a4\u08a2\3\2\2\2\u08a5\u08a8\3\2\2"+
		"\2\u08a6\u08a4\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u009b\3\2\2\2\u08a8\u08a6"+
		"\3\2\2\2\u08a9\u08aa\t\34\2\2\u08aa\u009d\3\2\2\2\u08ab\u08b0\5\u00a6"+
		"T\2\u08ac\u08ad\7\3\2\2\u08ad\u08af\5\u00a6T\2\u08ae\u08ac\3\2\2\2\u08af"+
		"\u08b2\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u009f\3\2"+
		"\2\2\u08b2\u08b0\3\2\2\2\u08b3\u08b7\5\u00a2R\2\u08b4\u08b7\79\2\2\u08b5"+
		"\u08b7\7\65\2\2\u08b6\u08b3\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b6\u08b5\3"+
		"\2\2\2\u08b7\u00a1\3\2\2\2\u08b8\u08be\5\u00a6T\2\u08b9\u08ba\7\u00e8"+
		"\2\2\u08ba\u08be\5\u00a6T\2\u08bb\u08bc\7\u00bb\2\2\u08bc\u08be\5\u00a6"+
		"T\2\u08bd\u08b8\3\2\2\2\u08bd\u08b9\3\2\2\2\u08bd\u08bb\3\2\2\2\u08be"+
		"\u00a3\3\2\2\2\u08bf\u08c4\5\u00a6T\2\u08c0\u08c1\7\6\2\2\u08c1\u08c3"+
		"\5\u00a6T\2\u08c2\u08c0\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2\2"+
		"\2\u08c4\u08c5\3\2\2\2\u08c5\u00a5\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c7\u08cd"+
		"\7\u010a\2\2\u08c8\u08cd\7\u010c\2\2\u08c9\u08cd\5\u00aaV\2\u08ca\u08cd"+
		"\7\u010d\2\2\u08cb\u08cd\7\u010b\2\2\u08cc\u08c7\3\2\2\2\u08cc\u08c8\3"+
		"\2\2\2\u08cc\u08c9\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cb\3\2\2\2\u08cd"+
		"\u00a7\3\2\2\2\u08ce\u08d0\7\u00fe\2\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0"+
		"\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08db\7\u0108\2\2\u08d2\u08d4\7\u00fe"+
		"\2\2\u08d3\u08d2\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5"+
		"\u08db\7\u0109\2\2\u08d6\u08d8\7\u00fe\2\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8"+
		"\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08db\7\u0107\2\2\u08da\u08cf\3\2\2"+
		"\2\u08da\u08d3\3\2\2\2\u08da\u08d7\3\2\2\2\u08db\u00a9\3\2\2\2\u08dc\u08dd"+
		"\t\35\2\2\u08dd\u00ab\3\2\2\2\u0128\u00c8\u00cd\u00d1\u00d7\u00db\u00f0"+
		"\u00f4\u00f8\u00fc\u0104\u0108\u010b\u0112\u011b\u0121\u0125\u012b\u0132"+
		"\u013b\u0141\u014f\u0158\u015e\u0165\u016f\u0176\u017e\u0186\u0195\u019a"+
		"\u01a1\u01a6\u01aa\u01b2\u01b8\u01bc\u01ca\u01d1\u01ea\u01ed\u01f7\u0204"+
		"\u020a\u020f\u0215\u021e\u0224\u022b\u0233\u0238\u023c\u0244\u024a\u0251"+
		"\u0256\u025a\u0264\u0267\u026b\u026e\u0276\u027b\u0293\u0299\u029b\u02a1"+
		"\u02a7\u02a9\u02b1\u02b3\u02b9\u02bf\u02c1\u02d0\u02d5\u02dc\u02e8\u02ea"+
		"\u02f2\u02f4\u0306\u0309\u030d\u0311\u0323\u0326\u0339\u033e\u0344\u0347"+
		"\u0350\u0352\u0355\u035b\u0362\u0367\u036d\u0371\u0375\u037b\u0383\u0394"+
		"\u0397\u039c\u039e\u03a5\u03ab\u03ad\u03b1\u03bb\u03c1\u03c4\u03c6\u03d2"+
		"\u03d9\u03dd\u03e1\u03e5\u03ec\u03f5\u03f8\u03fc\u0401\u0405\u040d\u0410"+
		"\u0413\u041a\u0425\u0428\u0432\u0435\u0440\u0445\u044d\u0450\u0454\u045d"+
		"\u0466\u0469\u0472\u0475\u0478\u047c\u0487\u048a\u0491\u0494\u04a7\u04ab"+
		"\u04af\u04b3\u04b7\u04bb\u04bd\u04c8\u04cd\u04d6\u04e4\u04e7\u04f0\u04f3"+
		"\u04fb\u04fe\u0501\u0506\u0509\u0515\u0518\u0520\u0525\u0529\u052b\u052d"+
		"\u053c\u053e\u0549\u055e\u0568\u0573\u0577\u0579\u0581\u0592\u0598\u05a3"+
		"\u05aa\u05ae\u05b6\u05b8\u05c5\u05cd\u05d6\u05dc\u05e4\u05ea\u05ee\u05f3"+
		"\u05f8\u05fe\u060c\u060e\u062c\u0637\u0641\u0644\u0647\u064c\u0653\u0656"+
		"\u065f\u0662\u0666\u0669\u066c\u0678\u067b\u068e\u0692\u069a\u069e\u06b7"+
		"\u06ba\u06c3\u06c9\u06cf\u06d5\u06e2\u06eb\u0701\u0704\u0707\u0711\u0713"+
		"\u071c\u0722\u0724\u072c\u0736\u073c\u074a\u0753\u075a\u075f\u0766\u0770"+
		"\u0775\u077c\u0796\u079b\u079d\u07a4\u07a8\u07af\u07b3\u07c4\u07d3\u07da"+
		"\u07e3\u07ed\u07f2\u07fb\u0800\u0808\u0822\u082d\u0832\u0839\u083b\u0848"+
		"\u0857\u085b\u085f\u0863\u0869\u086d\u0871\u0875\u0877\u0881\u0888\u0891"+
		"\u0898\u089f\u08a6\u08b0\u08b6\u08bd\u08c4\u08cc\u08cf\u08d3\u08d7\u08da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}