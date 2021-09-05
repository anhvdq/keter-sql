// Generated from /Users/pinkeraw/Projects/keter-sql/keter-parser/src/main/antlr4/dev/keter/parser/SqlBase.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ADD=9, 
		AFTER=10, ALL=11, ALTER=12, ANALYZE=13, AND=14, ANTI=15, ANY=16, ARCHIVE=17, 
		ARRAY=18, AS=19, ASC=20, AT=21, AUTHORIZATION=22, BETWEEN=23, BOTH=24, 
		BUCKET=25, BUCKETS=26, BY=27, CACHE=28, CASCADE=29, CASE=30, CAST=31, 
		CHANGE=32, CHECK=33, CLEAR=34, CLUSTER=35, CLUSTERED=36, CODEGEN=37, COLLATE=38, 
		COLLECTION=39, COLUMN=40, COLUMNS=41, COMMENT=42, COMMIT=43, COMPACT=44, 
		COMPACTIONS=45, COMPUTE=46, CONCATENATE=47, CONSTRAINT=48, COST=49, CREATE=50, 
		CROSS=51, CUBE=52, CURRENT=53, CURRENT_DATE=54, CURRENT_TIME=55, CURRENT_TIMESTAMP=56, 
		CURRENT_USER=57, DAY=58, DATA=59, DATABASE=60, DATABASES=61, DBPROPERTIES=62, 
		DEFINED=63, DELETE=64, DELIMITED=65, DESC=66, DESCRIBE=67, DFS=68, DIRECTORIES=69, 
		DIRECTORY=70, DISTINCT=71, DISTRIBUTE=72, DIV=73, DROP=74, ELSE=75, END=76, 
		ESCAPE=77, ESCAPED=78, EXCEPT=79, EXCHANGE=80, EXISTS=81, EXPLAIN=82, 
		EXPORT=83, EXTENDED=84, EXTERNAL=85, EXTRACT=86, FALSE=87, FETCH=88, FIELDS=89, 
		FILTER=90, FILEFORMAT=91, FIRST=92, FOLLOWING=93, FOR=94, FOREIGN=95, 
		FORMAT=96, FORMATTED=97, FROM=98, FULL=99, FUNCTION=100, FUNCTIONS=101, 
		GLOBAL=102, GRANT=103, GROUP=104, GROUPING=105, HAVING=106, IF=107, IGNORE=108, 
		IMPORT=109, IN=110, INDEX=111, INDEXES=112, INNER=113, INPATH=114, INPUTFORMAT=115, 
		INSERT=116, INTERSECT=117, INTERVAL=118, INTO=119, IS=120, ITEMS=121, 
		JOIN=122, KEYS=123, LAST=124, LATERAL=125, LAZY=126, LEADING=127, LEFT=128, 
		LIKE=129, LIMIT=130, LINES=131, LIST=132, LOAD=133, LOCAL=134, LOCATION=135, 
		LOCK=136, LOCKS=137, LOGICAL=138, MACRO=139, MAP=140, MATCHED=141, MERGE=142, 
		MONTH=143, MSCK=144, NAMESPACE=145, NAMESPACES=146, NATURAL=147, NO=148, 
		NOT=149, NULL=150, NULLS=151, OF=152, ON=153, ONLY=154, OPTION=155, OPTIONS=156, 
		OR=157, ORDER=158, OUT=159, OUTER=160, OUTPUTFORMAT=161, OVER=162, OVERLAPS=163, 
		OVERLAY=164, OVERWRITE=165, PARTITION=166, PARTITIONED=167, PARTITIONS=168, 
		PERCENTLIT=169, PIVOT=170, PLACING=171, POSITION=172, PRECEDING=173, PRIMARY=174, 
		PRINCIPALS=175, PROPERTIES=176, PURGE=177, QUERY=178, RANGE=179, RECORDREADER=180, 
		RECORDWRITER=181, RECOVER=182, REDUCE=183, REFERENCES=184, REFRESH=185, 
		RENAME=186, REPAIR=187, REPLACE=188, RESET=189, RESPECT=190, RESTRICT=191, 
		REVOKE=192, RIGHT=193, RLIKE=194, ROLE=195, ROLES=196, ROLLBACK=197, ROLLUP=198, 
		ROW=199, ROWS=200, SECOND=201, SCHEMA=202, SELECT=203, SEMI=204, SEPARATED=205, 
		SERDE=206, SERDEPROPERTIES=207, SESSION_USER=208, SET=209, SETMINUS=210, 
		SETS=211, SHOW=212, SKEWED=213, SOME=214, SORT=215, SORTED=216, START=217, 
		STATISTICS=218, STORED=219, STRATIFY=220, STRUCT=221, SUBSTR=222, SUBSTRING=223, 
		SYNC=224, TABLE=225, TABLES=226, TABLESAMPLE=227, TBLPROPERTIES=228, TEMPORARY=229, 
		TERMINATED=230, THEN=231, TIME=232, TO=233, TOUCH=234, TRAILING=235, TRANSACTION=236, 
		TRANSACTIONS=237, TRANSFORM=238, TRIM=239, TRUE=240, TRUNCATE=241, TRY_CAST=242, 
		TYPE=243, UNARCHIVE=244, UNBOUNDED=245, UNCACHE=246, UNION=247, UNIQUE=248, 
		UNKNOWN=249, UNLOCK=250, UNSET=251, UPDATE=252, USE=253, USER=254, USING=255, 
		VALUES=256, VIEW=257, VIEWS=258, WHEN=259, WHERE=260, WINDOW=261, WITH=262, 
		YEAR=263, ZONE=264, ADMIN=265, BERNOULLI=266, CALL=267, CATALOGS=268, 
		COMMITTED=269, CURRENT_CATALOG=270, CURRENT_PATH=271, CURRENT_ROLE=272, 
		CURRENT_SCHEMA=273, DATE=274, DEALLOCATE=275, DEFINER=276, DEFINE=277, 
		DISTRIBUTED=278, DOUBLE=279, EMPTY=280, EXCLUDING=281, EXECUTE=282, FINAL=283, 
		GRANTED=284, GRANTS=285, GRAPHVIZ=286, GROUPS=287, HOUR=288, INCLUDING=289, 
		INITIAL=290, INPUT=291, INVOKER=292, IO=293, ISOLATION=294, JSON=295, 
		LEVEL=296, LOCALTIME=297, LOCALTIMESTAMP=298, MATCH=299, MATCHES=300, 
		MATCH_RECOGNIZE=301, MATERIALIZED=302, MEASURES=303, MINUTE=304, NEXT=305, 
		NFC=306, NFD=307, NFKC=308, NFKD=309, NONE=310, NORMALIZE=311, NULLIF=312, 
		OFFSET=313, OMIT=314, ONE=315, ORDINALITY=316, OUTPUT=317, PAST=318, PATH=319, 
		PATTERN=320, PER=321, PERMUTE=322, PRECISION=323, PREPARE=324, PRIVILEGES=325, 
		READ=326, RECURSIVE=327, REPEATABLE=328, RUNNING=329, SCHEMAS=330, SECURITY=331, 
		SEEK=332, SERIALIZABLE=333, SESSION=334, STATS=335, SUBSET=336, SYSTEM=337, 
		TEXT=338, TIES=339, TIMESTAMP=340, UESCAPE=341, UNCOMMITTED=342, UNMATCHED=343, 
		UNNEST=344, VALIDATE=345, VERBOSE=346, WITHOUT=347, WORK=348, WRITE=349, 
		EQ=350, NSEQ=351, NEQ=352, LT=353, LTE=354, GT=355, GTE=356, PLUS=357, 
		MINUS=358, ASTERISK=359, SLASH=360, PERCENT=361, TILDE=362, AMPERSAND=363, 
		PIPE=364, CONCAT_PIPE=365, HAT=366, QUESTION_MARK=367, STRING=368, UNICODE_STRING=369, 
		INTEGER_VALUE=370, DECIMAL_VALUE=371, DOUBLE_VALUE=372, IDENTIFIER=373, 
		QUOTED_IDENTIFIER=374, BACKQUOTED_IDENTIFIER=375, SIMPLE_COMMENT=376, 
		BRACKETED_COMMENT=377, WS=378, UNRECOGNIZED=379;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_query = 8, RULE_ctes = 9, RULE_queryTerm = 10, RULE_queryOrganization = 11, 
		RULE_queryPrimary = 12, RULE_querySpecification = 13, RULE_fromStatement = 14, 
		RULE_fromStatementBody = 15, RULE_inlineTable = 16, RULE_transformClause = 17, 
		RULE_selectClause = 18, RULE_fromClause = 19, RULE_relation = 20, RULE_relationPrimary = 21, 
		RULE_functionTable = 22, RULE_sample = 23, RULE_sampleMethod = 24, RULE_pivotClause = 25, 
		RULE_pivotColumn = 26, RULE_pivotValue = 27, RULE_rowFormat = 28, RULE_lateralView = 29, 
		RULE_whereClause = 30, RULE_aggregationClause = 31, RULE_groupByClause = 32, 
		RULE_groupingAnalytics = 33, RULE_groupingElement = 34, RULE_groupingSet = 35, 
		RULE_havingClause = 36, RULE_windowClause = 37, RULE_namedWindow = 38, 
		RULE_whenClause = 39, RULE_multipartIdentifierList = 40, RULE_multipartIdentifier = 41, 
		RULE_tableIdentifier = 42, RULE_functionIdentifier = 43, RULE_colTypeList = 44, 
		RULE_colType = 45, RULE_commentSpec = 46, RULE_tablePropertyList = 47, 
		RULE_tableProperty = 48, RULE_tablePropertyKey = 49, RULE_tablePropertyValue = 50, 
		RULE_errorCapturingIdentifier = 51, RULE_identifierList = 52, RULE_identifierSeq = 53, 
		RULE_errorCapturingIdentifierExtra = 54, RULE_functionName = 55, RULE_tableAlias = 56, 
		RULE_joinRelation = 57, RULE_joinType = 58, RULE_joinCriteria = 59, RULE_namedQuery = 60, 
		RULE_columnAliases = 61, RULE_namedExpressionSeq = 62, RULE_namedExpression = 63, 
		RULE_expressionSeq = 64, RULE_expression = 65, RULE_booleanExpression = 66, 
		RULE_sortItem = 67, RULE_predicate = 68, RULE_valueExpression = 69, RULE_primaryExpression = 70, 
		RULE_constant = 71, RULE_setQuantifier = 72, RULE_windowSpec = 73, RULE_windowFrame = 74, 
		RULE_frameBound = 75, RULE_qualifiedName = 76, RULE_string = 77, RULE_number = 78, 
		RULE_booleanValue = 79, RULE_interval = 80, RULE_intervalField = 81, RULE_normalForm = 82, 
		RULE_dataType = 83, RULE_rowField = 84, RULE_typeParameter = 85, RULE_identifier = 86, 
		RULE_comparisonOperator = 87, RULE_nonReserved = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"query", "ctes", "queryTerm", "queryOrganization", "queryPrimary", "querySpecification", 
			"fromStatement", "fromStatementBody", "inlineTable", "transformClause", 
			"selectClause", "fromClause", "relation", "relationPrimary", "functionTable", 
			"sample", "sampleMethod", "pivotClause", "pivotColumn", "pivotValue", 
			"rowFormat", "lateralView", "whereClause", "aggregationClause", "groupByClause", 
			"groupingAnalytics", "groupingElement", "groupingSet", "havingClause", 
			"windowClause", "namedWindow", "whenClause", "multipartIdentifierList", 
			"multipartIdentifier", "tableIdentifier", "functionIdentifier", "colTypeList", 
			"colType", "commentSpec", "tablePropertyList", "tableProperty", "tablePropertyKey", 
			"tablePropertyValue", "errorCapturingIdentifier", "identifierList", "identifierSeq", 
			"errorCapturingIdentifierExtra", "functionName", "tableAlias", "joinRelation", 
			"joinType", "joinCriteria", "namedQuery", "columnAliases", "namedExpressionSeq", 
			"namedExpression", "expressionSeq", "expression", "booleanExpression", 
			"sortItem", "predicate", "valueExpression", "primaryExpression", "constant", 
			"setQuantifier", "windowSpec", "windowFrame", "frameBound", "qualifiedName", 
			"string", "number", "booleanValue", "interval", "intervalField", "normalForm", 
			"dataType", "rowField", "typeParameter", "identifier", "comparisonOperator", 
			"nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'.'", "'->'", "'['", "']'", "'ADD'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", "'ANY'", 
			"'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BETWEEN'", 
			"'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", "'CASE'", 
			"'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DAY'", "'DATA'", "'DATABASE'", "'DATABASES'", "'DBPROPERTIES'", "'DEFINED'", 
			"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
			"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", "'DROP'", "'ELSE'", 
			"'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", 
			"'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", 
			"'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", 
			"'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", 
			"'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", 
			"'HAVING'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
			"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
			"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", 
			"'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MONTH'", "'MSCK'", "'NAMESPACE'", 
			"'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", "'OF'", 
			"'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", 
			"'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", 
			"'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", "'PIVOT'", 
			"'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", 
			null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
			"'SECOND'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", 
			"'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", 
			"'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", 
			"'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'SYNC'", 
			"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TIME'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
			"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TRY_CAST'", 
			"'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", 
			"'UNKNOWN'", "'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", 
			"'VALUES'", "'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", 
			"'YEAR'", "'ZONE'", "'ADMIN'", "'BERNOULLI'", "'CALL'", "'CATALOGS'", 
			"'COMMITTED'", "'CURRENT_CATALOG'", "'CURRENT_PATH'", "'CURRENT_ROLE'", 
			"'CURRENT_SCHEMA'", "'DATE'", "'DEALLOCATE'", "'DEFINER'", "'DEFINE'", 
			"'DISTRIBUTED'", "'DOUBLE'", "'EMPTY'", "'EXCLUDING'", "'EXECUTE'", "'FINAL'", 
			"'GRANTED'", "'GRANTS'", "'GRAPHVIZ'", "'GROUPS'", "'HOUR'", "'INCLUDING'", 
			"'INITIAL'", "'INPUT'", "'INVOKER'", "'IO'", "'ISOLATION'", "'JSON'", 
			"'LEVEL'", "'LOCALTIME'", "'LOCALTIMESTAMP'", "'MATCH'", "'MATCHES'", 
			"'MATCH_RECOGNIZE'", "'MATERIALIZED'", "'MEASURES'", "'MINUTE'", "'NEXT'", 
			"'NFC'", "'NFD'", "'NFKC'", "'NFKD'", "'NONE'", "'NORMALIZE'", "'NULLIF'", 
			"'OFFSET'", "'OMIT'", "'ONE'", "'ORDINALITY'", "'OUTPUT'", "'PAST'", 
			"'PATH'", "'PATTERN'", "'PER'", "'PERMUTE'", "'PRECISION'", "'PREPARE'", 
			"'PRIVILEGES'", "'READ'", "'RECURSIVE'", "'REPEATABLE'", "'RUNNING'", 
			"'SCHEMAS'", "'SECURITY'", "'SEEK'", "'SERIALIZABLE'", "'SESSION'", "'STATS'", 
			"'SUBSET'", "'SYSTEM'", "'TEXT'", "'TIES'", "'TIMESTAMP'", "'UESCAPE'", 
			"'UNCOMMITTED'", "'UNMATCHED'", "'UNNEST'", "'VALIDATE'", "'VERBOSE'", 
			"'WITHOUT'", "'WORK'", "'WRITE'", null, "'<=>'", null, "'<'", null, "'>'", 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", 
			"'^'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ADD", "AFTER", 
			"ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", "ARRAY", 
			"AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", "BUCKETS", 
			"BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", "CLEAR", 
			"CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", 
			"COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DAY", "DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
			"DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", 
			"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "IF", 
			"IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
			"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
			"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", 
			"LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", 
			"MAP", "MATCHED", "MERGE", "MONTH", "MSCK", "NAMESPACE", "NAMESPACES", 
			"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", 
			"OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", 
			"OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTLIT", 
			"PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", 
			"PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", 
			"RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", 
			"RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", 
			"ROLLBACK", "ROLLUP", "ROW", "ROWS", "SECOND", "SCHEMA", "SELECT", "SEMI", 
			"SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", 
			"SETS", "SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", 
			"STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "SYNC", "TABLE", 
			"TABLES", "TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", 
			"THEN", "TIME", "TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", 
			"TRANSFORM", "TRIM", "TRUE", "TRUNCATE", "TRY_CAST", "TYPE", "UNARCHIVE", 
			"UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", 
			"UPDATE", "USE", "USER", "USING", "VALUES", "VIEW", "VIEWS", "WHEN", 
			"WHERE", "WINDOW", "WITH", "YEAR", "ZONE", "ADMIN", "BERNOULLI", "CALL", 
			"CATALOGS", "COMMITTED", "CURRENT_CATALOG", "CURRENT_PATH", "CURRENT_ROLE", 
			"CURRENT_SCHEMA", "DATE", "DEALLOCATE", "DEFINER", "DEFINE", "DISTRIBUTED", 
			"DOUBLE", "EMPTY", "EXCLUDING", "EXECUTE", "FINAL", "GRANTED", "GRANTS", 
			"GRAPHVIZ", "GROUPS", "HOUR", "INCLUDING", "INITIAL", "INPUT", "INVOKER", 
			"IO", "ISOLATION", "JSON", "LEVEL", "LOCALTIME", "LOCALTIMESTAMP", "MATCH", 
			"MATCHES", "MATCH_RECOGNIZE", "MATERIALIZED", "MEASURES", "MINUTE", "NEXT", 
			"NFC", "NFD", "NFKC", "NFKD", "NONE", "NORMALIZE", "NULLIF", "OFFSET", 
			"OMIT", "ONE", "ORDINALITY", "OUTPUT", "PAST", "PATH", "PATTERN", "PER", 
			"PERMUTE", "PRECISION", "PREPARE", "PRIVILEGES", "READ", "RECURSIVE", 
			"REPEATABLE", "RUNNING", "SCHEMAS", "SECURITY", "SEEK", "SERIALIZABLE", 
			"SESSION", "STATS", "SUBSET", "SYSTEM", "TEXT", "TIES", "TIMESTAMP", 
			"UESCAPE", "UNCOMMITTED", "UNMATCHED", "UNNEST", "VALIDATE", "VERBOSE", 
			"WITHOUT", "WORK", "WRITE", "EQ", "NSEQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "TILDE", "AMPERSAND", 
			"PIPE", "CONCAT_PIPE", "HAT", "QUESTION_MARK", "STRING", "UNICODE_STRING", 
			"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "QUOTED_IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED"
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
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			statement();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(179);
				match(T__0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			namedExpression();
			setState(188);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			tableIdentifier();
			setState(191);
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

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			multipartIdentifier();
			setState(194);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			functionIdentifier();
			setState(197);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			dataType(0);
			setState(200);
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

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			colTypeList();
			setState(203);
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			query();
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
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(207);
				ctes();
				}
			}

			setState(210);
			queryTerm(0);
			setState(211);
			queryOrganization();
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(WITH);
			setState(214);
			namedQuery();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(215);
				match(T__1);
				setState(216);
				namedQuery();
				}
				}
				setState(221);
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
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(223);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(225);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(226);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(227);
						setQuantifier();
						}
					}

					setState(230);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(SqlBaseParser.QUESTION_MARK, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_queryOrganization);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(236);
				match(ORDER);
				setState(237);
				match(BY);
				setState(238);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(239);
						match(T__1);
						setState(240);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			}
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(248);
				match(CLUSTER);
				setState(249);
				match(BY);
				setState(250);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(251);
						match(T__1);
						setState(252);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			}
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(260);
				match(DISTRIBUTE);
				setState(261);
				match(BY);
				setState(262);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(263);
						match(T__1);
						setState(264);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			}
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(272);
				match(SORT);
				setState(273);
				match(BY);
				setState(274);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						match(T__1);
						setState(276);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(281);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			}
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(284);
				windowClause();
				}
				break;
			}
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(287);
				match(LIMIT);
				setState(288);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==QUESTION_MARK || _la==INTEGER_VALUE) ) {
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class InlineTableDefaultContext extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_queryPrimary);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(TABLE);
				setState(294);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefaultContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				inlineTable();
				}
				break;
			case T__2:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(T__2);
				setState(297);
				query();
				setState(298);
				match(T__3);
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_querySpecification);
		try {
			int _alt;
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				transformClause();
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(303);
					fromClause();
					}
					break;
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						lateralView();
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(312);
					whereClause();
					}
					break;
				}
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(315);
					aggregationClause();
					}
					break;
				}
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(318);
					havingClause();
					}
					break;
				}
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(321);
					windowClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				selectClause();
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(325);
					fromClause();
					}
					break;
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(328);
						lateralView();
						}
						} 
					}
					setState(333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(334);
					whereClause();
					}
					break;
				}
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(337);
					aggregationClause();
					}
					break;
				}
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(340);
					havingClause();
					}
					break;
				}
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(343);
					windowClause();
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

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			fromClause();
			setState(350); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(349);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(352); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fromStatementBody);
		try {
			int _alt;
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				transformClause();
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(355);
					whereClause();
					}
					break;
				}
				setState(358);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				selectClause();
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						lateralView();
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(367);
					whereClause();
					}
					break;
				}
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(370);
					aggregationClause();
					}
					break;
				}
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(373);
					havingClause();
					}
					break;
				}
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(376);
					windowClause();
					}
					break;
				}
				setState(379);
				queryOrganization();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(VALUES);
			setState(384);
			expression();
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					match(T__1);
					setState(386);
					expression();
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public ExpressionSeqContext expressionSeq() {
			return getRuleContext(ExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(392);
				match(SELECT);
				setState(393);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(394);
				match(T__2);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(395);
					setQuantifier();
					}
					break;
				}
				setState(398);
				expressionSeq();
				setState(399);
				match(T__3);
				}
				break;
			case MAP:
				{
				setState(401);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(402);
					setQuantifier();
					}
					break;
				}
				setState(405);
				expressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(406);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(407);
					setQuantifier();
					}
					break;
				}
				setState(410);
				expressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(413);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(416);
				match(RECORDWRITER);
				setState(417);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(420);
			match(USING);
			setState(421);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(422);
				match(AS);
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(423);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(424);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(425);
					match(T__2);
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(426);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(427);
						colTypeList();
						}
						break;
					}
					setState(430);
					match(T__3);
					}
					}
					break;
				}
				}
				break;
			}
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(436);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(439);
				match(RECORDREADER);
				setState(440);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(SELECT);
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(444);
				setQuantifier();
				}
				break;
			}
			setState(447);
			namedExpressionSeq();
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(FROM);
			setState(450);
			relation();
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					match(T__1);
					setState(452);
					relation();
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					lateralView();
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(464);
				pivotClause();
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			relationPrimary();
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					joinRelation();
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relationPrimary);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				multipartIdentifier();
				setState(476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(475);
					sample();
					}
					break;
				}
				setState(478);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(T__2);
				setState(481);
				query();
				setState(482);
				match(T__3);
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(483);
					sample();
					}
					break;
				}
				setState(486);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(T__2);
				setState(489);
				relation();
				setState(490);
				match(T__3);
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(491);
					sample();
					}
					break;
				}
				setState(494);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				functionTable();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(501);
			match(T__2);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LEFT - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)) | (1L << (REDUCE - 128)) | (1L << (REFERENCES - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REVOKE - 192)) | (1L << (RIGHT - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SECOND - 192)) | (1L << (SCHEMA - 192)) | (1L << (SELECT - 192)) | (1L << (SEMI - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETMINUS - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TIME - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (UNLOCK - 192)) | (1L << (UNSET - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (ZONE - 256)) | (1L << (ADMIN - 256)) | (1L << (BERNOULLI - 256)) | (1L << (CALL - 256)) | (1L << (CATALOGS - 256)) | (1L << (COMMITTED - 256)) | (1L << (DATE - 256)) | (1L << (DEFINER - 256)) | (1L << (DEFINE - 256)) | (1L << (DISTRIBUTED - 256)) | (1L << (DOUBLE - 256)) | (1L << (EMPTY - 256)) | (1L << (EXCLUDING - 256)) | (1L << (FINAL - 256)) | (1L << (GRANTED - 256)) | (1L << (GRANTS - 256)) | (1L << (GRAPHVIZ - 256)) | (1L << (GROUPS - 256)) | (1L << (HOUR - 256)) | (1L << (INCLUDING - 256)) | (1L << (INITIAL - 256)) | (1L << (INPUT - 256)) | (1L << (INVOKER - 256)) | (1L << (IO - 256)) | (1L << (ISOLATION - 256)) | (1L << (JSON - 256)) | (1L << (LEVEL - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHES - 256)) | (1L << (MATCH_RECOGNIZE - 256)) | (1L << (MATERIALIZED - 256)) | (1L << (MEASURES - 256)) | (1L << (MINUTE - 256)) | (1L << (NEXT - 256)) | (1L << (NFC - 256)) | (1L << (NFD - 256)) | (1L << (NFKC - 256)) | (1L << (NFKD - 256)) | (1L << (NONE - 256)) | (1L << (NORMALIZE - 256)) | (1L << (NULLIF - 256)) | (1L << (OFFSET - 256)) | (1L << (OMIT - 256)) | (1L << (ONE - 256)) | (1L << (ORDINALITY - 256)) | (1L << (OUTPUT - 256)) | (1L << (PAST - 256)) | (1L << (PATH - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PATTERN - 320)) | (1L << (PER - 320)) | (1L << (PERMUTE - 320)) | (1L << (PRECISION - 320)) | (1L << (PRIVILEGES - 320)) | (1L << (READ - 320)) | (1L << (REPEATABLE - 320)) | (1L << (RUNNING - 320)) | (1L << (SCHEMAS - 320)) | (1L << (SECURITY - 320)) | (1L << (SEEK - 320)) | (1L << (SERIALIZABLE - 320)) | (1L << (SESSION - 320)) | (1L << (STATS - 320)) | (1L << (SUBSET - 320)) | (1L << (SYSTEM - 320)) | (1L << (TEXT - 320)) | (1L << (TIES - 320)) | (1L << (TIMESTAMP - 320)) | (1L << (UNCOMMITTED - 320)) | (1L << (UNMATCHED - 320)) | (1L << (VALIDATE - 320)) | (1L << (VERBOSE - 320)) | (1L << (WITHOUT - 320)) | (1L << (WORK - 320)) | (1L << (WRITE - 320)) | (1L << (PLUS - 320)) | (1L << (MINUS - 320)) | (1L << (ASTERISK - 320)) | (1L << (TILDE - 320)) | (1L << (QUESTION_MARK - 320)) | (1L << (STRING - 320)) | (1L << (UNICODE_STRING - 320)) | (1L << (INTEGER_VALUE - 320)) | (1L << (DECIMAL_VALUE - 320)) | (1L << (DOUBLE_VALUE - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (QUOTED_IDENTIFIER - 320)) | (1L << (BACKQUOTED_IDENTIFIER - 320)))) != 0)) {
				{
				setState(502);
				expression();
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(503);
					match(T__1);
					setState(504);
					expression();
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(512);
			match(T__3);
			setState(513);
			tableAlias();
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

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(TABLESAMPLE);
			setState(516);
			match(T__2);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LEFT - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)) | (1L << (REDUCE - 128)) | (1L << (REFERENCES - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REVOKE - 192)) | (1L << (RIGHT - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SECOND - 192)) | (1L << (SCHEMA - 192)) | (1L << (SELECT - 192)) | (1L << (SEMI - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETMINUS - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TIME - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (UNLOCK - 192)) | (1L << (UNSET - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (ZONE - 256)) | (1L << (ADMIN - 256)) | (1L << (BERNOULLI - 256)) | (1L << (CALL - 256)) | (1L << (CATALOGS - 256)) | (1L << (COMMITTED - 256)) | (1L << (DATE - 256)) | (1L << (DEFINER - 256)) | (1L << (DEFINE - 256)) | (1L << (DISTRIBUTED - 256)) | (1L << (DOUBLE - 256)) | (1L << (EMPTY - 256)) | (1L << (EXCLUDING - 256)) | (1L << (FINAL - 256)) | (1L << (GRANTED - 256)) | (1L << (GRANTS - 256)) | (1L << (GRAPHVIZ - 256)) | (1L << (GROUPS - 256)) | (1L << (HOUR - 256)) | (1L << (INCLUDING - 256)) | (1L << (INITIAL - 256)) | (1L << (INPUT - 256)) | (1L << (INVOKER - 256)) | (1L << (IO - 256)) | (1L << (ISOLATION - 256)) | (1L << (JSON - 256)) | (1L << (LEVEL - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHES - 256)) | (1L << (MATCH_RECOGNIZE - 256)) | (1L << (MATERIALIZED - 256)) | (1L << (MEASURES - 256)) | (1L << (MINUTE - 256)) | (1L << (NEXT - 256)) | (1L << (NFC - 256)) | (1L << (NFD - 256)) | (1L << (NFKC - 256)) | (1L << (NFKD - 256)) | (1L << (NONE - 256)) | (1L << (NORMALIZE - 256)) | (1L << (NULLIF - 256)) | (1L << (OFFSET - 256)) | (1L << (OMIT - 256)) | (1L << (ONE - 256)) | (1L << (ORDINALITY - 256)) | (1L << (OUTPUT - 256)) | (1L << (PAST - 256)) | (1L << (PATH - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PATTERN - 320)) | (1L << (PER - 320)) | (1L << (PERMUTE - 320)) | (1L << (PRECISION - 320)) | (1L << (PRIVILEGES - 320)) | (1L << (READ - 320)) | (1L << (REPEATABLE - 320)) | (1L << (RUNNING - 320)) | (1L << (SCHEMAS - 320)) | (1L << (SECURITY - 320)) | (1L << (SEEK - 320)) | (1L << (SERIALIZABLE - 320)) | (1L << (SESSION - 320)) | (1L << (STATS - 320)) | (1L << (SUBSET - 320)) | (1L << (SYSTEM - 320)) | (1L << (TEXT - 320)) | (1L << (TIES - 320)) | (1L << (TIMESTAMP - 320)) | (1L << (UNCOMMITTED - 320)) | (1L << (UNMATCHED - 320)) | (1L << (VALIDATE - 320)) | (1L << (VERBOSE - 320)) | (1L << (WITHOUT - 320)) | (1L << (WORK - 320)) | (1L << (WRITE - 320)) | (1L << (PLUS - 320)) | (1L << (MINUS - 320)) | (1L << (ASTERISK - 320)) | (1L << (TILDE - 320)) | (1L << (QUESTION_MARK - 320)) | (1L << (STRING - 320)) | (1L << (UNICODE_STRING - 320)) | (1L << (INTEGER_VALUE - 320)) | (1L << (DECIMAL_VALUE - 320)) | (1L << (DOUBLE_VALUE - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (QUOTED_IDENTIFIER - 320)) | (1L << (BACKQUOTED_IDENTIFIER - 320)))) != 0)) {
				{
				setState(517);
				sampleMethod();
				}
			}

			setState(520);
			match(T__3);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sampleMethod);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(522);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(525);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(526);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				expression();
				setState(528);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(531);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(532);
				match(OUT);
				setState(533);
				match(OF);
				setState(534);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(535);
					match(ON);
					setState(541);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(536);
						identifier();
						}
						break;
					case 2:
						{
						setState(537);
						qualifiedName();
						setState(538);
						match(T__2);
						setState(539);
						match(T__3);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				((SampleByBytesContext)_localctx).bytes = expression();
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(PIVOT);
			setState(549);
			match(T__2);
			setState(550);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(551);
			match(FOR);
			setState(552);
			pivotColumn();
			setState(553);
			match(IN);
			setState(554);
			match(T__2);
			setState(555);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(556);
				match(T__1);
				setState(557);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			match(T__3);
			setState(564);
			match(T__3);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pivotColumn);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case AFTER:
			case ALL:
			case ALTER:
			case ANALYZE:
			case AND:
			case ANTI:
			case ANY:
			case ARCHIVE:
			case ARRAY:
			case AS:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BETWEEN:
			case BOTH:
			case BUCKET:
			case BUCKETS:
			case BY:
			case CACHE:
			case CASCADE:
			case CASE:
			case CAST:
			case CHANGE:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CLUSTERED:
			case CODEGEN:
			case COLLATE:
			case COLLECTION:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMPACT:
			case COMPACTIONS:
			case COMPUTE:
			case CONCATENATE:
			case CONSTRAINT:
			case COST:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DAY:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBPROPERTIES:
			case DEFINED:
			case DELETE:
			case DELIMITED:
			case DESC:
			case DESCRIBE:
			case DFS:
			case DIRECTORIES:
			case DIRECTORY:
			case DISTINCT:
			case DISTRIBUTE:
			case DIV:
			case DROP:
			case ELSE:
			case END:
			case ESCAPE:
			case ESCAPED:
			case EXCHANGE:
			case EXISTS:
			case EXPLAIN:
			case EXPORT:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FIELDS:
			case FILTER:
			case FILEFORMAT:
			case FIRST:
			case FOLLOWING:
			case FOR:
			case FOREIGN:
			case FORMAT:
			case FORMATTED:
			case FROM:
			case FUNCTION:
			case FUNCTIONS:
			case GLOBAL:
			case GRANT:
			case GROUP:
			case GROUPING:
			case HAVING:
			case IF:
			case IGNORE:
			case IMPORT:
			case IN:
			case INDEX:
			case INDEXES:
			case INPATH:
			case INPUTFORMAT:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case ITEMS:
			case KEYS:
			case LAST:
			case LATERAL:
			case LAZY:
			case LEADING:
			case LIKE:
			case LIMIT:
			case LINES:
			case LIST:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOCKS:
			case LOGICAL:
			case MACRO:
			case MAP:
			case MATCHED:
			case MERGE:
			case MONTH:
			case MSCK:
			case NAMESPACE:
			case NAMESPACES:
			case NO:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case ONLY:
			case OPTION:
			case OPTIONS:
			case OR:
			case ORDER:
			case OUT:
			case OUTER:
			case OUTPUTFORMAT:
			case OVER:
			case OVERLAPS:
			case OVERLAY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONS:
			case PERCENTLIT:
			case PIVOT:
			case PLACING:
			case POSITION:
			case PRECEDING:
			case PRIMARY:
			case PRINCIPALS:
			case PROPERTIES:
			case PURGE:
			case QUERY:
			case RANGE:
			case RECORDREADER:
			case RECORDWRITER:
			case RECOVER:
			case REDUCE:
			case REFERENCES:
			case REFRESH:
			case RENAME:
			case REPAIR:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case RLIKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SECOND:
			case SCHEMA:
			case SELECT:
			case SEMI:
			case SEPARATED:
			case SERDE:
			case SERDEPROPERTIES:
			case SESSION_USER:
			case SET:
			case SETMINUS:
			case SETS:
			case SHOW:
			case SKEWED:
			case SOME:
			case SORT:
			case SORTED:
			case START:
			case STATISTICS:
			case STORED:
			case STRATIFY:
			case STRUCT:
			case SUBSTR:
			case SUBSTRING:
			case SYNC:
			case TABLE:
			case TABLES:
			case TABLESAMPLE:
			case TBLPROPERTIES:
			case TEMPORARY:
			case TERMINATED:
			case THEN:
			case TIME:
			case TO:
			case TOUCH:
			case TRAILING:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRANSFORM:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNARCHIVE:
			case UNBOUNDED:
			case UNCACHE:
			case UNIQUE:
			case UNKNOWN:
			case UNLOCK:
			case UNSET:
			case UPDATE:
			case USE:
			case USER:
			case VALUES:
			case VIEW:
			case VIEWS:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case ZONE:
			case ADMIN:
			case BERNOULLI:
			case CALL:
			case CATALOGS:
			case COMMITTED:
			case DATE:
			case DEFINER:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case FINAL:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LEVEL:
			case MATCH:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MINUTE:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NONE:
			case NULLIF:
			case OFFSET:
			case OMIT:
			case ONE:
			case ORDINALITY:
			case OUTPUT:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case PRECISION:
			case PRIVILEGES:
			case READ:
			case REPEATABLE:
			case RUNNING:
			case SCHEMAS:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case STATS:
			case SUBSET:
			case SYSTEM:
			case TEXT:
			case TIES:
			case TIMESTAMP:
			case UNCOMMITTED:
			case UNMATCHED:
			case VALIDATE:
			case VERBOSE:
			case WITHOUT:
			case WORK:
			case WRITE:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(T__2);
				setState(568);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(569);
					match(T__1);
					setState(570);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(576);
				match(T__3);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pivotValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			expression();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (LIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MONTH - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NOT - 129)) | (1L << (NULL - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OUT - 129)) | (1L << (OUTER - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAPS - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIMARY - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)) | (1L << (REFERENCES - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPAIR - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (REVOKE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (RLIKE - 194)) | (1L << (ROLE - 194)) | (1L << (ROLES - 194)) | (1L << (ROLLBACK - 194)) | (1L << (ROLLUP - 194)) | (1L << (ROW - 194)) | (1L << (ROWS - 194)) | (1L << (SECOND - 194)) | (1L << (SCHEMA - 194)) | (1L << (SELECT - 194)) | (1L << (SEMI - 194)) | (1L << (SEPARATED - 194)) | (1L << (SERDE - 194)) | (1L << (SERDEPROPERTIES - 194)) | (1L << (SESSION_USER - 194)) | (1L << (SET - 194)) | (1L << (SETMINUS - 194)) | (1L << (SETS - 194)) | (1L << (SHOW - 194)) | (1L << (SKEWED - 194)) | (1L << (SOME - 194)) | (1L << (SORT - 194)) | (1L << (SORTED - 194)) | (1L << (START - 194)) | (1L << (STATISTICS - 194)) | (1L << (STORED - 194)) | (1L << (STRATIFY - 194)) | (1L << (STRUCT - 194)) | (1L << (SUBSTR - 194)) | (1L << (SUBSTRING - 194)) | (1L << (SYNC - 194)) | (1L << (TABLE - 194)) | (1L << (TABLES - 194)) | (1L << (TABLESAMPLE - 194)) | (1L << (TBLPROPERTIES - 194)) | (1L << (TEMPORARY - 194)) | (1L << (TERMINATED - 194)) | (1L << (THEN - 194)) | (1L << (TIME - 194)) | (1L << (TO - 194)) | (1L << (TOUCH - 194)) | (1L << (TRAILING - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRANSFORM - 194)) | (1L << (TRIM - 194)) | (1L << (TRUE - 194)) | (1L << (TRUNCATE - 194)) | (1L << (TRY_CAST - 194)) | (1L << (TYPE - 194)) | (1L << (UNARCHIVE - 194)) | (1L << (UNBOUNDED - 194)) | (1L << (UNCACHE - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNKNOWN - 194)) | (1L << (UNLOCK - 194)) | (1L << (UNSET - 194)) | (1L << (UPDATE - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALUES - 194)) | (1L << (VIEW - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (VIEWS - 258)) | (1L << (WHEN - 258)) | (1L << (WHERE - 258)) | (1L << (WINDOW - 258)) | (1L << (WITH - 258)) | (1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (ADMIN - 258)) | (1L << (BERNOULLI - 258)) | (1L << (CALL - 258)) | (1L << (CATALOGS - 258)) | (1L << (COMMITTED - 258)) | (1L << (DATE - 258)) | (1L << (DEFINER - 258)) | (1L << (DEFINE - 258)) | (1L << (DISTRIBUTED - 258)) | (1L << (DOUBLE - 258)) | (1L << (EMPTY - 258)) | (1L << (EXCLUDING - 258)) | (1L << (FINAL - 258)) | (1L << (GRANTED - 258)) | (1L << (GRANTS - 258)) | (1L << (GRAPHVIZ - 258)) | (1L << (GROUPS - 258)) | (1L << (HOUR - 258)) | (1L << (INCLUDING - 258)) | (1L << (INITIAL - 258)) | (1L << (INPUT - 258)) | (1L << (INVOKER - 258)) | (1L << (IO - 258)) | (1L << (ISOLATION - 258)) | (1L << (JSON - 258)) | (1L << (LEVEL - 258)) | (1L << (MATCH - 258)) | (1L << (MATCHES - 258)) | (1L << (MATCH_RECOGNIZE - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MEASURES - 258)) | (1L << (MINUTE - 258)) | (1L << (NEXT - 258)) | (1L << (NFC - 258)) | (1L << (NFD - 258)) | (1L << (NFKC - 258)) | (1L << (NFKD - 258)) | (1L << (NONE - 258)) | (1L << (NULLIF - 258)) | (1L << (OFFSET - 258)) | (1L << (OMIT - 258)) | (1L << (ONE - 258)) | (1L << (ORDINALITY - 258)) | (1L << (OUTPUT - 258)) | (1L << (PAST - 258)) | (1L << (PATH - 258)) | (1L << (PATTERN - 258)) | (1L << (PER - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PERMUTE - 322)) | (1L << (PRECISION - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (READ - 322)) | (1L << (REPEATABLE - 322)) | (1L << (RUNNING - 322)) | (1L << (SCHEMAS - 322)) | (1L << (SECURITY - 322)) | (1L << (SEEK - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SESSION - 322)) | (1L << (STATS - 322)) | (1L << (SUBSET - 322)) | (1L << (SYSTEM - 322)) | (1L << (TEXT - 322)) | (1L << (TIES - 322)) | (1L << (TIMESTAMP - 322)) | (1L << (UNCOMMITTED - 322)) | (1L << (UNMATCHED - 322)) | (1L << (VALIDATE - 322)) | (1L << (VERBOSE - 322)) | (1L << (WITHOUT - 322)) | (1L << (WORK - 322)) | (1L << (WRITE - 322)) | (1L << (IDENTIFIER - 322)) | (1L << (QUOTED_IDENTIFIER - 322)) | (1L << (BACKQUOTED_IDENTIFIER - 322)))) != 0)) {
				{
				setState(582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(581);
					match(AS);
					}
					break;
				}
				setState(584);
				identifier();
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rowFormat);
		try {
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(ROW);
				setState(588);
				match(FORMAT);
				setState(589);
				match(SERDE);
				setState(590);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(591);
					match(WITH);
					setState(592);
					match(SERDEPROPERTIES);
					setState(593);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(ROW);
				setState(597);
				match(FORMAT);
				setState(598);
				match(DELIMITED);
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(599);
					match(FIELDS);
					setState(600);
					match(TERMINATED);
					setState(601);
					match(BY);
					setState(602);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(606);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(603);
						match(ESCAPED);
						setState(604);
						match(BY);
						setState(605);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(610);
					match(COLLECTION);
					setState(611);
					match(ITEMS);
					setState(612);
					match(TERMINATED);
					setState(613);
					match(BY);
					setState(614);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(622);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(617);
					match(MAP);
					setState(618);
					match(KEYS);
					setState(619);
					match(TERMINATED);
					setState(620);
					match(BY);
					setState(621);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(624);
					match(LINES);
					setState(625);
					match(TERMINATED);
					setState(626);
					match(BY);
					setState(627);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(630);
					match(NULL);
					setState(631);
					match(DEFINED);
					setState(632);
					match(AS);
					setState(633);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(LATERAL);
			setState(639);
			match(VIEW);
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(640);
				match(OUTER);
				}
				break;
			}
			setState(643);
			qualifiedName();
			setState(644);
			match(T__2);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LEFT - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)) | (1L << (REDUCE - 128)) | (1L << (REFERENCES - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REVOKE - 192)) | (1L << (RIGHT - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SECOND - 192)) | (1L << (SCHEMA - 192)) | (1L << (SELECT - 192)) | (1L << (SEMI - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETMINUS - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TIME - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (UNLOCK - 192)) | (1L << (UNSET - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (ZONE - 256)) | (1L << (ADMIN - 256)) | (1L << (BERNOULLI - 256)) | (1L << (CALL - 256)) | (1L << (CATALOGS - 256)) | (1L << (COMMITTED - 256)) | (1L << (DATE - 256)) | (1L << (DEFINER - 256)) | (1L << (DEFINE - 256)) | (1L << (DISTRIBUTED - 256)) | (1L << (DOUBLE - 256)) | (1L << (EMPTY - 256)) | (1L << (EXCLUDING - 256)) | (1L << (FINAL - 256)) | (1L << (GRANTED - 256)) | (1L << (GRANTS - 256)) | (1L << (GRAPHVIZ - 256)) | (1L << (GROUPS - 256)) | (1L << (HOUR - 256)) | (1L << (INCLUDING - 256)) | (1L << (INITIAL - 256)) | (1L << (INPUT - 256)) | (1L << (INVOKER - 256)) | (1L << (IO - 256)) | (1L << (ISOLATION - 256)) | (1L << (JSON - 256)) | (1L << (LEVEL - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHES - 256)) | (1L << (MATCH_RECOGNIZE - 256)) | (1L << (MATERIALIZED - 256)) | (1L << (MEASURES - 256)) | (1L << (MINUTE - 256)) | (1L << (NEXT - 256)) | (1L << (NFC - 256)) | (1L << (NFD - 256)) | (1L << (NFKC - 256)) | (1L << (NFKD - 256)) | (1L << (NONE - 256)) | (1L << (NORMALIZE - 256)) | (1L << (NULLIF - 256)) | (1L << (OFFSET - 256)) | (1L << (OMIT - 256)) | (1L << (ONE - 256)) | (1L << (ORDINALITY - 256)) | (1L << (OUTPUT - 256)) | (1L << (PAST - 256)) | (1L << (PATH - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PATTERN - 320)) | (1L << (PER - 320)) | (1L << (PERMUTE - 320)) | (1L << (PRECISION - 320)) | (1L << (PRIVILEGES - 320)) | (1L << (READ - 320)) | (1L << (REPEATABLE - 320)) | (1L << (RUNNING - 320)) | (1L << (SCHEMAS - 320)) | (1L << (SECURITY - 320)) | (1L << (SEEK - 320)) | (1L << (SERIALIZABLE - 320)) | (1L << (SESSION - 320)) | (1L << (STATS - 320)) | (1L << (SUBSET - 320)) | (1L << (SYSTEM - 320)) | (1L << (TEXT - 320)) | (1L << (TIES - 320)) | (1L << (TIMESTAMP - 320)) | (1L << (UNCOMMITTED - 320)) | (1L << (UNMATCHED - 320)) | (1L << (VALIDATE - 320)) | (1L << (VERBOSE - 320)) | (1L << (WITHOUT - 320)) | (1L << (WORK - 320)) | (1L << (WRITE - 320)) | (1L << (PLUS - 320)) | (1L << (MINUS - 320)) | (1L << (ASTERISK - 320)) | (1L << (TILDE - 320)) | (1L << (QUESTION_MARK - 320)) | (1L << (STRING - 320)) | (1L << (UNICODE_STRING - 320)) | (1L << (INTEGER_VALUE - 320)) | (1L << (DECIMAL_VALUE - 320)) | (1L << (DOUBLE_VALUE - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (QUOTED_IDENTIFIER - 320)) | (1L << (BACKQUOTED_IDENTIFIER - 320)))) != 0)) {
				{
				setState(645);
				expression();
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(646);
					match(T__1);
					setState(647);
					expression();
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(655);
			match(T__3);
			setState(656);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(658);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(657);
					match(AS);
					}
					break;
				}
				setState(660);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(661);
						match(T__1);
						setState(662);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(WHERE);
			setState(671);
			((WhereClauseContext)_localctx).where = booleanExpression(0);
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

	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				match(GROUP);
				setState(674);
				match(BY);
				setState(675);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(676);
						match(T__1);
						setState(677);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(GROUP);
				setState(684);
				match(BY);
				setState(685);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(686);
						match(T__1);
						setState(687);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(692);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(693);
					match(WITH);
					setState(694);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(695);
					match(WITH);
					setState(696);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(697);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(698);
					match(SETS);
					setState(699);
					match(T__2);
					setState(700);
					groupingSet();
					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(701);
						match(T__1);
						setState(702);
						groupingSet();
						}
						}
						setState(707);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(708);
					match(T__3);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_groupByClause);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
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

	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_groupingAnalytics);
		int _la;
		try {
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(719);
				match(T__2);
				setState(720);
				groupingSet();
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(721);
					match(T__1);
					setState(722);
					groupingSet();
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(728);
				match(T__3);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				match(GROUPING);
				setState(731);
				match(SETS);
				setState(732);
				match(T__2);
				setState(733);
				groupingElement();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(734);
					match(T__1);
					setState(735);
					groupingElement();
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(741);
				match(T__3);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_groupingElement);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				groupingSet();
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
		enterRule(_localctx, 70, RULE_groupingSet);
		int _la;
		try {
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				match(T__2);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LEFT - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)) | (1L << (REDUCE - 128)) | (1L << (REFERENCES - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REVOKE - 192)) | (1L << (RIGHT - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SECOND - 192)) | (1L << (SCHEMA - 192)) | (1L << (SELECT - 192)) | (1L << (SEMI - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETMINUS - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TIME - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (UNLOCK - 192)) | (1L << (UNSET - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (ZONE - 256)) | (1L << (ADMIN - 256)) | (1L << (BERNOULLI - 256)) | (1L << (CALL - 256)) | (1L << (CATALOGS - 256)) | (1L << (COMMITTED - 256)) | (1L << (DATE - 256)) | (1L << (DEFINER - 256)) | (1L << (DEFINE - 256)) | (1L << (DISTRIBUTED - 256)) | (1L << (DOUBLE - 256)) | (1L << (EMPTY - 256)) | (1L << (EXCLUDING - 256)) | (1L << (FINAL - 256)) | (1L << (GRANTED - 256)) | (1L << (GRANTS - 256)) | (1L << (GRAPHVIZ - 256)) | (1L << (GROUPS - 256)) | (1L << (HOUR - 256)) | (1L << (INCLUDING - 256)) | (1L << (INITIAL - 256)) | (1L << (INPUT - 256)) | (1L << (INVOKER - 256)) | (1L << (IO - 256)) | (1L << (ISOLATION - 256)) | (1L << (JSON - 256)) | (1L << (LEVEL - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHES - 256)) | (1L << (MATCH_RECOGNIZE - 256)) | (1L << (MATERIALIZED - 256)) | (1L << (MEASURES - 256)) | (1L << (MINUTE - 256)) | (1L << (NEXT - 256)) | (1L << (NFC - 256)) | (1L << (NFD - 256)) | (1L << (NFKC - 256)) | (1L << (NFKD - 256)) | (1L << (NONE - 256)) | (1L << (NORMALIZE - 256)) | (1L << (NULLIF - 256)) | (1L << (OFFSET - 256)) | (1L << (OMIT - 256)) | (1L << (ONE - 256)) | (1L << (ORDINALITY - 256)) | (1L << (OUTPUT - 256)) | (1L << (PAST - 256)) | (1L << (PATH - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PATTERN - 320)) | (1L << (PER - 320)) | (1L << (PERMUTE - 320)) | (1L << (PRECISION - 320)) | (1L << (PRIVILEGES - 320)) | (1L << (READ - 320)) | (1L << (REPEATABLE - 320)) | (1L << (RUNNING - 320)) | (1L << (SCHEMAS - 320)) | (1L << (SECURITY - 320)) | (1L << (SEEK - 320)) | (1L << (SERIALIZABLE - 320)) | (1L << (SESSION - 320)) | (1L << (STATS - 320)) | (1L << (SUBSET - 320)) | (1L << (SYSTEM - 320)) | (1L << (TEXT - 320)) | (1L << (TIES - 320)) | (1L << (TIMESTAMP - 320)) | (1L << (UNCOMMITTED - 320)) | (1L << (UNMATCHED - 320)) | (1L << (VALIDATE - 320)) | (1L << (VERBOSE - 320)) | (1L << (WITHOUT - 320)) | (1L << (WORK - 320)) | (1L << (WRITE - 320)) | (1L << (PLUS - 320)) | (1L << (MINUS - 320)) | (1L << (ASTERISK - 320)) | (1L << (TILDE - 320)) | (1L << (QUESTION_MARK - 320)) | (1L << (STRING - 320)) | (1L << (UNICODE_STRING - 320)) | (1L << (INTEGER_VALUE - 320)) | (1L << (DECIMAL_VALUE - 320)) | (1L << (DOUBLE_VALUE - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (QUOTED_IDENTIFIER - 320)) | (1L << (BACKQUOTED_IDENTIFIER - 320)))) != 0)) {
					{
					setState(750);
					expression();
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(751);
						match(T__1);
						setState(752);
						expression();
						}
						}
						setState(757);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(760);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public BooleanExpressionContext having;
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(HAVING);
			setState(765);
			((HavingClauseContext)_localctx).having = booleanExpression(0);
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(WINDOW);
			setState(768);
			namedWindow();
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					match(T__1);
					setState(770);
					namedWindow();
					}
					} 
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(777);
			match(AS);
			setState(778);
			windowSpec();
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
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
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
		enterRule(_localctx, 78, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(WHEN);
			setState(781);
			((WhenClauseContext)_localctx).condition = expression();
			setState(782);
			match(THEN);
			setState(783);
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

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			multipartIdentifier();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(786);
				match(T__1);
				setState(787);
				multipartIdentifier();
				}
				}
				setState(792);
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

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(794);
					match(T__4);
					setState(795);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(801);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(802);
				match(T__4);
				}
				break;
			}
			setState(806);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(808);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(809);
				match(T__4);
				}
				break;
			}
			setState(813);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			colType();
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(816);
					match(T__1);
					setState(817);
					colType();
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(824);
			dataType(0);
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(825);
				match(NOT);
				setState(826);
				match(NULL);
				}
				break;
			}
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(829);
				commentSpec();
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

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(COMMENT);
			setState(833);
			match(STRING);
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(T__2);
			setState(836);
			tableProperty();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(837);
				match(T__1);
				setState(838);
				tableProperty();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(T__3);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || _la==TRUE || ((((_la - 350)) & ~0x3f) == 0 && ((1L << (_la - 350)) & ((1L << (EQ - 350)) | (1L << (STRING - 350)) | (1L << (INTEGER_VALUE - 350)) | (1L << (DECIMAL_VALUE - 350)))) != 0)) {
				{
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(847);
					match(EQ);
					}
				}

				setState(850);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tablePropertyKey);
		int _la;
		try {
			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case AFTER:
			case ALL:
			case ALTER:
			case ANALYZE:
			case AND:
			case ANTI:
			case ANY:
			case ARCHIVE:
			case ARRAY:
			case AS:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BETWEEN:
			case BOTH:
			case BUCKET:
			case BUCKETS:
			case BY:
			case CACHE:
			case CASCADE:
			case CASE:
			case CAST:
			case CHANGE:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CLUSTERED:
			case CODEGEN:
			case COLLATE:
			case COLLECTION:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMPACT:
			case COMPACTIONS:
			case COMPUTE:
			case CONCATENATE:
			case CONSTRAINT:
			case COST:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DAY:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBPROPERTIES:
			case DEFINED:
			case DELETE:
			case DELIMITED:
			case DESC:
			case DESCRIBE:
			case DFS:
			case DIRECTORIES:
			case DIRECTORY:
			case DISTINCT:
			case DISTRIBUTE:
			case DIV:
			case DROP:
			case ELSE:
			case END:
			case ESCAPE:
			case ESCAPED:
			case EXCHANGE:
			case EXISTS:
			case EXPLAIN:
			case EXPORT:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FIELDS:
			case FILTER:
			case FILEFORMAT:
			case FIRST:
			case FOLLOWING:
			case FOR:
			case FOREIGN:
			case FORMAT:
			case FORMATTED:
			case FROM:
			case FUNCTION:
			case FUNCTIONS:
			case GLOBAL:
			case GRANT:
			case GROUP:
			case GROUPING:
			case HAVING:
			case IF:
			case IGNORE:
			case IMPORT:
			case IN:
			case INDEX:
			case INDEXES:
			case INPATH:
			case INPUTFORMAT:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case ITEMS:
			case KEYS:
			case LAST:
			case LATERAL:
			case LAZY:
			case LEADING:
			case LIKE:
			case LIMIT:
			case LINES:
			case LIST:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOCKS:
			case LOGICAL:
			case MACRO:
			case MAP:
			case MATCHED:
			case MERGE:
			case MONTH:
			case MSCK:
			case NAMESPACE:
			case NAMESPACES:
			case NO:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case ONLY:
			case OPTION:
			case OPTIONS:
			case OR:
			case ORDER:
			case OUT:
			case OUTER:
			case OUTPUTFORMAT:
			case OVER:
			case OVERLAPS:
			case OVERLAY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONS:
			case PERCENTLIT:
			case PIVOT:
			case PLACING:
			case POSITION:
			case PRECEDING:
			case PRIMARY:
			case PRINCIPALS:
			case PROPERTIES:
			case PURGE:
			case QUERY:
			case RANGE:
			case RECORDREADER:
			case RECORDWRITER:
			case RECOVER:
			case REDUCE:
			case REFERENCES:
			case REFRESH:
			case RENAME:
			case REPAIR:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case RLIKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SECOND:
			case SCHEMA:
			case SELECT:
			case SEMI:
			case SEPARATED:
			case SERDE:
			case SERDEPROPERTIES:
			case SESSION_USER:
			case SET:
			case SETMINUS:
			case SETS:
			case SHOW:
			case SKEWED:
			case SOME:
			case SORT:
			case SORTED:
			case START:
			case STATISTICS:
			case STORED:
			case STRATIFY:
			case STRUCT:
			case SUBSTR:
			case SUBSTRING:
			case SYNC:
			case TABLE:
			case TABLES:
			case TABLESAMPLE:
			case TBLPROPERTIES:
			case TEMPORARY:
			case TERMINATED:
			case THEN:
			case TIME:
			case TO:
			case TOUCH:
			case TRAILING:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRANSFORM:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNARCHIVE:
			case UNBOUNDED:
			case UNCACHE:
			case UNIQUE:
			case UNKNOWN:
			case UNLOCK:
			case UNSET:
			case UPDATE:
			case USE:
			case USER:
			case VALUES:
			case VIEW:
			case VIEWS:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case ZONE:
			case ADMIN:
			case BERNOULLI:
			case CALL:
			case CATALOGS:
			case COMMITTED:
			case DATE:
			case DEFINER:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case FINAL:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LEVEL:
			case MATCH:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MINUTE:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NONE:
			case NULLIF:
			case OFFSET:
			case OMIT:
			case ONE:
			case ORDINALITY:
			case OUTPUT:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case PRECISION:
			case PRIVILEGES:
			case READ:
			case REPEATABLE:
			case RUNNING:
			case SCHEMAS:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case STATS:
			case SUBSET:
			case SYSTEM:
			case TEXT:
			case TIES:
			case TIMESTAMP:
			case UNCOMMITTED:
			case UNMATCHED:
			case VALIDATE:
			case VERBOSE:
			case WITHOUT:
			case WORK:
			case WRITE:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				identifier();
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(854);
					match(T__4);
					setState(855);
					identifier();
					}
					}
					setState(860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(STRING);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tablePropertyValue);
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(866);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(867);
				match(STRING);
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

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			identifier();
			setState(871);
			errorCapturingIdentifierExtra();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(T__2);
			setState(874);
			identifierSeq();
			setState(875);
			match(T__3);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(878);
					match(T__1);
					setState(879);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(887); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(885);
						match(MINUS);
						setState(886);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(889); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_functionName);
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(897);
				match(RIGHT);
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

	public static class TableAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(900);
					match(AS);
					}
					break;
				}
				setState(903);
				identifier();
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(904);
					identifierList();
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_joinRelation);
		try {
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(909);
				joinType();
				}
				setState(910);
				match(JOIN);
				setState(911);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(912);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				match(NATURAL);
				setState(916);
				joinType();
				setState(917);
				match(JOIN);
				setState(918);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_joinType);
		int _la;
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(922);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				match(LEFT);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(927);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(930);
					match(LEFT);
					}
				}

				setState(933);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(934);
				match(RIGHT);
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(935);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(938);
				match(FULL);
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(939);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(942);
					match(LEFT);
					}
				}

				setState(945);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_joinCriteria);
		try {
			setState(952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				match(ON);
				setState(949);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				match(USING);
				setState(951);
				identifierList();
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
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
		enterRule(_localctx, 120, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			((NamedQueryContext)_localctx).name = identifier();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(955);
				columnAliases();
				}
			}

			setState(958);
			match(AS);
			setState(959);
			match(T__2);
			setState(960);
			query();
			setState(961);
			match(T__3);
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
		enterRule(_localctx, 122, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(T__2);
			setState(964);
			identifier();
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(965);
				match(T__1);
				setState(966);
				identifier();
				}
				}
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(972);
			match(T__3);
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			namedExpression();
			setState(979);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(975);
					match(T__1);
					setState(976);
					namedExpression();
					}
					} 
				}
				setState(981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			expression();
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(983);
					match(AS);
					}
					break;
				}
				setState(988);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case AFTER:
				case ALL:
				case ALTER:
				case ANALYZE:
				case AND:
				case ANTI:
				case ANY:
				case ARCHIVE:
				case ARRAY:
				case AS:
				case ASC:
				case AT:
				case AUTHORIZATION:
				case BETWEEN:
				case BOTH:
				case BUCKET:
				case BUCKETS:
				case BY:
				case CACHE:
				case CASCADE:
				case CASE:
				case CAST:
				case CHANGE:
				case CHECK:
				case CLEAR:
				case CLUSTER:
				case CLUSTERED:
				case CODEGEN:
				case COLLATE:
				case COLLECTION:
				case COLUMN:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMPACT:
				case COMPACTIONS:
				case COMPUTE:
				case CONCATENATE:
				case CONSTRAINT:
				case COST:
				case CREATE:
				case CUBE:
				case CURRENT:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DAY:
				case DATA:
				case DATABASE:
				case DATABASES:
				case DBPROPERTIES:
				case DEFINED:
				case DELETE:
				case DELIMITED:
				case DESC:
				case DESCRIBE:
				case DFS:
				case DIRECTORIES:
				case DIRECTORY:
				case DISTINCT:
				case DISTRIBUTE:
				case DIV:
				case DROP:
				case ELSE:
				case END:
				case ESCAPE:
				case ESCAPED:
				case EXCHANGE:
				case EXISTS:
				case EXPLAIN:
				case EXPORT:
				case EXTENDED:
				case EXTERNAL:
				case EXTRACT:
				case FALSE:
				case FETCH:
				case FIELDS:
				case FILTER:
				case FILEFORMAT:
				case FIRST:
				case FOLLOWING:
				case FOR:
				case FOREIGN:
				case FORMAT:
				case FORMATTED:
				case FROM:
				case FUNCTION:
				case FUNCTIONS:
				case GLOBAL:
				case GRANT:
				case GROUP:
				case GROUPING:
				case HAVING:
				case IF:
				case IGNORE:
				case IMPORT:
				case IN:
				case INDEX:
				case INDEXES:
				case INPATH:
				case INPUTFORMAT:
				case INSERT:
				case INTERVAL:
				case INTO:
				case IS:
				case ITEMS:
				case KEYS:
				case LAST:
				case LATERAL:
				case LAZY:
				case LEADING:
				case LIKE:
				case LIMIT:
				case LINES:
				case LIST:
				case LOAD:
				case LOCAL:
				case LOCATION:
				case LOCK:
				case LOCKS:
				case LOGICAL:
				case MACRO:
				case MAP:
				case MATCHED:
				case MERGE:
				case MONTH:
				case MSCK:
				case NAMESPACE:
				case NAMESPACES:
				case NO:
				case NOT:
				case NULL:
				case NULLS:
				case OF:
				case ONLY:
				case OPTION:
				case OPTIONS:
				case OR:
				case ORDER:
				case OUT:
				case OUTER:
				case OUTPUTFORMAT:
				case OVER:
				case OVERLAPS:
				case OVERLAY:
				case OVERWRITE:
				case PARTITION:
				case PARTITIONED:
				case PARTITIONS:
				case PERCENTLIT:
				case PIVOT:
				case PLACING:
				case POSITION:
				case PRECEDING:
				case PRIMARY:
				case PRINCIPALS:
				case PROPERTIES:
				case PURGE:
				case QUERY:
				case RANGE:
				case RECORDREADER:
				case RECORDWRITER:
				case RECOVER:
				case REDUCE:
				case REFERENCES:
				case REFRESH:
				case RENAME:
				case REPAIR:
				case REPLACE:
				case RESET:
				case RESPECT:
				case RESTRICT:
				case REVOKE:
				case RLIKE:
				case ROLE:
				case ROLES:
				case ROLLBACK:
				case ROLLUP:
				case ROW:
				case ROWS:
				case SECOND:
				case SCHEMA:
				case SELECT:
				case SEMI:
				case SEPARATED:
				case SERDE:
				case SERDEPROPERTIES:
				case SESSION_USER:
				case SET:
				case SETMINUS:
				case SETS:
				case SHOW:
				case SKEWED:
				case SOME:
				case SORT:
				case SORTED:
				case START:
				case STATISTICS:
				case STORED:
				case STRATIFY:
				case STRUCT:
				case SUBSTR:
				case SUBSTRING:
				case SYNC:
				case TABLE:
				case TABLES:
				case TABLESAMPLE:
				case TBLPROPERTIES:
				case TEMPORARY:
				case TERMINATED:
				case THEN:
				case TIME:
				case TO:
				case TOUCH:
				case TRAILING:
				case TRANSACTION:
				case TRANSACTIONS:
				case TRANSFORM:
				case TRIM:
				case TRUE:
				case TRUNCATE:
				case TRY_CAST:
				case TYPE:
				case UNARCHIVE:
				case UNBOUNDED:
				case UNCACHE:
				case UNIQUE:
				case UNKNOWN:
				case UNLOCK:
				case UNSET:
				case UPDATE:
				case USE:
				case USER:
				case VALUES:
				case VIEW:
				case VIEWS:
				case WHEN:
				case WHERE:
				case WINDOW:
				case WITH:
				case YEAR:
				case ZONE:
				case ADMIN:
				case BERNOULLI:
				case CALL:
				case CATALOGS:
				case COMMITTED:
				case DATE:
				case DEFINER:
				case DEFINE:
				case DISTRIBUTED:
				case DOUBLE:
				case EMPTY:
				case EXCLUDING:
				case FINAL:
				case GRANTED:
				case GRANTS:
				case GRAPHVIZ:
				case GROUPS:
				case HOUR:
				case INCLUDING:
				case INITIAL:
				case INPUT:
				case INVOKER:
				case IO:
				case ISOLATION:
				case JSON:
				case LEVEL:
				case MATCH:
				case MATCHES:
				case MATCH_RECOGNIZE:
				case MATERIALIZED:
				case MEASURES:
				case MINUTE:
				case NEXT:
				case NFC:
				case NFD:
				case NFKC:
				case NFKD:
				case NONE:
				case NULLIF:
				case OFFSET:
				case OMIT:
				case ONE:
				case ORDINALITY:
				case OUTPUT:
				case PAST:
				case PATH:
				case PATTERN:
				case PER:
				case PERMUTE:
				case PRECISION:
				case PRIVILEGES:
				case READ:
				case REPEATABLE:
				case RUNNING:
				case SCHEMAS:
				case SECURITY:
				case SEEK:
				case SERIALIZABLE:
				case SESSION:
				case STATS:
				case SUBSET:
				case SYSTEM:
				case TEXT:
				case TIES:
				case TIMESTAMP:
				case UNCOMMITTED:
				case UNMATCHED:
				case VALIDATE:
				case VERBOSE:
				case WITHOUT:
				case WORK:
				case WRITE:
				case IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(986);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case T__2:
					{
					setState(987);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ExpressionSeqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSeq; }
	}

	public final ExpressionSeqContext expressionSeq() throws RecognitionException {
		ExpressionSeqContext _localctx = new ExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_expressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			expression();
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(993);
				match(T__1);
				setState(994);
				expression();
				}
				}
				setState(999);
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
		enterRule(_localctx, 130, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
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
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
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
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1003);
				valueExpression(0);
				setState(1005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1004);
					predicate();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1007);
				match(NOT);
				setState(1008);
				booleanExpression(4);
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1009);
				match(EXISTS);
				setState(1010);
				match(T__2);
				setState(1011);
				query();
				setState(1012);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1022);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1016);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1017);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1018);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1019);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1020);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1021);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			expression();
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1028);
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
				break;
			}
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1031);
				match(NULLS);
				setState(1032);
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

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_predicate);
		int _la;
		try {
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1035);
					match(NOT);
					}
				}

				setState(1038);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1039);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1040);
				match(AND);
				setState(1041);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1043);
					match(NOT);
					}
				}

				setState(1046);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1047);
				match(T__2);
				setState(1048);
				expression();
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1049);
					match(T__1);
					setState(1050);
					expression();
					}
					}
					setState(1055);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1056);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1058);
					match(NOT);
					}
				}

				setState(1061);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1062);
				match(T__2);
				setState(1063);
				query();
				setState(1064);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1066);
					match(NOT);
					}
				}

				setState(1069);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(1070);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1071);
					match(NOT);
					}
				}

				setState(1074);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(1075);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1089);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1076);
					match(T__2);
					setState(1077);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(1078);
					match(T__2);
					setState(1079);
					expression();
					setState(1084);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1080);
						match(T__1);
						setState(1081);
						expression();
						}
						}
						setState(1086);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1087);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1091);
					match(NOT);
					}
				}

				setState(1094);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(1095);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(1098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1096);
					match(ESCAPE);
					setState(1097);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1100);
				match(IS);
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1101);
					match(NOT);
					}
				}

				setState(1104);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1105);
				match(IS);
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1106);
					match(NOT);
					}
				}

				setState(1109);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1110);
				match(IS);
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1111);
					match(NOT);
					}
				}

				setState(1114);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1115);
				match(FROM);
				setState(1116);
				((PredicateContext)_localctx).right = valueExpression(0);
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
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
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
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1120);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1121);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 357)) & ~0x3f) == 0 && ((1L << (_la - 357)) & ((1L << (PLUS - 357)) | (1L << (MINUS - 357)) | (1L << (TILDE - 357)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1122);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1125);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1126);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 359)) & ~0x3f) == 0 && ((1L << (_la - 359)) & ((1L << (ASTERISK - 359)) | (1L << (SLASH - 359)) | (1L << (PERCENT - 359)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1127);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1128);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1129);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 357)) & ~0x3f) == 0 && ((1L << (_la - 357)) & ((1L << (PLUS - 357)) | (1L << (MINUS - 357)) | (1L << (CONCAT_PIPE - 357)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1130);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1131);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1132);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1133);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1134);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1135);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1136);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1137);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1138);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1139);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1140);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1141);
						comparisonOperator();
						setState(1142);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
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
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
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
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public TerminalNode QUESTION_MARK() { return getToken(SqlBaseParser.QUESTION_MARK, 0); }
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext operand;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
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
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CurrentLikeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentLikeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
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
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SelectAllContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public BooleanExpressionContext where;
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
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
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentLikeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1150);
				((CurrentLikeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURRENT_DATE) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER))) != 0)) ) {
					((CurrentLikeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1151);
				match(CASE);
				setState(1152);
				((SimpleCaseContext)_localctx).operand = expression();
				setState(1154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1153);
					whenClause();
					}
					}
					setState(1156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1158);
					match(ELSE);
					setState(1159);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1162);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1164);
				match(CASE);
				setState(1166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1165);
					whenClause();
					}
					}
					setState(1168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1170);
					match(ELSE);
					setState(1171);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1174);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1176);
				match(CAST);
				setState(1177);
				match(T__2);
				setState(1178);
				expression();
				setState(1179);
				match(AS);
				setState(1180);
				dataType(0);
				setState(1181);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1183);
				match(TRY_CAST);
				setState(1184);
				match(T__2);
				setState(1185);
				expression();
				setState(1186);
				match(AS);
				setState(1187);
				dataType(0);
				setState(1188);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1190);
				match(FIRST);
				setState(1191);
				match(T__2);
				setState(1192);
				expression();
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1193);
					match(IGNORE);
					setState(1194);
					match(NULLS);
					}
				}

				setState(1197);
				match(T__3);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1199);
				match(LAST);
				setState(1200);
				match(T__2);
				setState(1201);
				expression();
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1202);
					match(IGNORE);
					setState(1203);
					match(NULLS);
					}
				}

				setState(1206);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1208);
				match(POSITION);
				setState(1209);
				match(T__2);
				setState(1210);
				valueExpression(0);
				setState(1211);
				match(IN);
				setState(1212);
				valueExpression(0);
				setState(1213);
				match(T__3);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1215);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new SelectAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1216);
				qualifiedName();
				setState(1217);
				match(T__4);
				setState(1218);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new SelectAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1220);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1221);
				match(T__2);
				setState(1222);
				expression();
				setState(1225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1223);
					match(T__1);
					setState(1224);
					expression();
					}
					}
					setState(1227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(1229);
				match(T__3);
				}
				break;
			case 13:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1231);
				match(ROW);
				setState(1232);
				match(T__2);
				setState(1233);
				expression();
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1234);
					match(T__1);
					setState(1235);
					expression();
					}
					}
					setState(1240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1241);
				match(T__3);
				}
				break;
			case 14:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1243);
				match(T__2);
				setState(1244);
				query();
				setState(1245);
				match(T__3);
				}
				break;
			case 15:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1247);
				functionName();
				setState(1248);
				match(T__2);
				setState(1249);
				match(ASTERISK);
				setState(1250);
				match(T__3);
				setState(1257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1251);
					match(FILTER);
					setState(1252);
					match(T__2);
					setState(1253);
					match(WHERE);
					setState(1254);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(1255);
					match(T__3);
					}
					break;
				}
				setState(1261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1259);
					match(OVER);
					setState(1260);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 16:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1263);
				functionName();
				setState(1264);
				match(T__2);
				setState(1276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						setState(1265);
						setQuantifier();
						}
						break;
					}
					setState(1268);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(1273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1269);
							match(T__1);
							setState(1270);
							((FunctionCallContext)_localctx).expression = expression();
							((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
							}
							} 
						}
						setState(1275);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
					}
					}
					break;
				}
				setState(1284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1278);
					match(FILTER);
					setState(1279);
					match(T__2);
					setState(1280);
					match(WHERE);
					setState(1281);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(1282);
					match(T__3);
					}
					break;
				}
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1286);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1287);
					match(NULLS);
					}
					break;
				}
				setState(1292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1290);
					match(OVER);
					setState(1291);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 17:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1294);
				identifier();
				setState(1295);
				match(T__5);
				setState(1296);
				expression();
				}
				break;
			case 18:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1298);
				match(T__2);
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (LIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MONTH - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NOT - 129)) | (1L << (NULL - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OUT - 129)) | (1L << (OUTER - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAPS - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIMARY - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)) | (1L << (REFERENCES - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPAIR - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (REVOKE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (RLIKE - 194)) | (1L << (ROLE - 194)) | (1L << (ROLES - 194)) | (1L << (ROLLBACK - 194)) | (1L << (ROLLUP - 194)) | (1L << (ROW - 194)) | (1L << (ROWS - 194)) | (1L << (SECOND - 194)) | (1L << (SCHEMA - 194)) | (1L << (SELECT - 194)) | (1L << (SEMI - 194)) | (1L << (SEPARATED - 194)) | (1L << (SERDE - 194)) | (1L << (SERDEPROPERTIES - 194)) | (1L << (SESSION_USER - 194)) | (1L << (SET - 194)) | (1L << (SETMINUS - 194)) | (1L << (SETS - 194)) | (1L << (SHOW - 194)) | (1L << (SKEWED - 194)) | (1L << (SOME - 194)) | (1L << (SORT - 194)) | (1L << (SORTED - 194)) | (1L << (START - 194)) | (1L << (STATISTICS - 194)) | (1L << (STORED - 194)) | (1L << (STRATIFY - 194)) | (1L << (STRUCT - 194)) | (1L << (SUBSTR - 194)) | (1L << (SUBSTRING - 194)) | (1L << (SYNC - 194)) | (1L << (TABLE - 194)) | (1L << (TABLES - 194)) | (1L << (TABLESAMPLE - 194)) | (1L << (TBLPROPERTIES - 194)) | (1L << (TEMPORARY - 194)) | (1L << (TERMINATED - 194)) | (1L << (THEN - 194)) | (1L << (TIME - 194)) | (1L << (TO - 194)) | (1L << (TOUCH - 194)) | (1L << (TRAILING - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRANSFORM - 194)) | (1L << (TRIM - 194)) | (1L << (TRUE - 194)) | (1L << (TRUNCATE - 194)) | (1L << (TRY_CAST - 194)) | (1L << (TYPE - 194)) | (1L << (UNARCHIVE - 194)) | (1L << (UNBOUNDED - 194)) | (1L << (UNCACHE - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNKNOWN - 194)) | (1L << (UNLOCK - 194)) | (1L << (UNSET - 194)) | (1L << (UPDATE - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALUES - 194)) | (1L << (VIEW - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (VIEWS - 258)) | (1L << (WHEN - 258)) | (1L << (WHERE - 258)) | (1L << (WINDOW - 258)) | (1L << (WITH - 258)) | (1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (ADMIN - 258)) | (1L << (BERNOULLI - 258)) | (1L << (CALL - 258)) | (1L << (CATALOGS - 258)) | (1L << (COMMITTED - 258)) | (1L << (DATE - 258)) | (1L << (DEFINER - 258)) | (1L << (DEFINE - 258)) | (1L << (DISTRIBUTED - 258)) | (1L << (DOUBLE - 258)) | (1L << (EMPTY - 258)) | (1L << (EXCLUDING - 258)) | (1L << (FINAL - 258)) | (1L << (GRANTED - 258)) | (1L << (GRANTS - 258)) | (1L << (GRAPHVIZ - 258)) | (1L << (GROUPS - 258)) | (1L << (HOUR - 258)) | (1L << (INCLUDING - 258)) | (1L << (INITIAL - 258)) | (1L << (INPUT - 258)) | (1L << (INVOKER - 258)) | (1L << (IO - 258)) | (1L << (ISOLATION - 258)) | (1L << (JSON - 258)) | (1L << (LEVEL - 258)) | (1L << (MATCH - 258)) | (1L << (MATCHES - 258)) | (1L << (MATCH_RECOGNIZE - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MEASURES - 258)) | (1L << (MINUTE - 258)) | (1L << (NEXT - 258)) | (1L << (NFC - 258)) | (1L << (NFD - 258)) | (1L << (NFKC - 258)) | (1L << (NFKD - 258)) | (1L << (NONE - 258)) | (1L << (NULLIF - 258)) | (1L << (OFFSET - 258)) | (1L << (OMIT - 258)) | (1L << (ONE - 258)) | (1L << (ORDINALITY - 258)) | (1L << (OUTPUT - 258)) | (1L << (PAST - 258)) | (1L << (PATH - 258)) | (1L << (PATTERN - 258)) | (1L << (PER - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PERMUTE - 322)) | (1L << (PRECISION - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (READ - 322)) | (1L << (REPEATABLE - 322)) | (1L << (RUNNING - 322)) | (1L << (SCHEMAS - 322)) | (1L << (SECURITY - 322)) | (1L << (SEEK - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SESSION - 322)) | (1L << (STATS - 322)) | (1L << (SUBSET - 322)) | (1L << (SYSTEM - 322)) | (1L << (TEXT - 322)) | (1L << (TIES - 322)) | (1L << (TIMESTAMP - 322)) | (1L << (UNCOMMITTED - 322)) | (1L << (UNMATCHED - 322)) | (1L << (VALIDATE - 322)) | (1L << (VERBOSE - 322)) | (1L << (WITHOUT - 322)) | (1L << (WORK - 322)) | (1L << (WRITE - 322)) | (1L << (IDENTIFIER - 322)) | (1L << (QUOTED_IDENTIFIER - 322)) | (1L << (BACKQUOTED_IDENTIFIER - 322)))) != 0)) {
					{
					setState(1299);
					identifier();
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1300);
						match(T__1);
						setState(1301);
						identifier();
						}
						}
						setState(1306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1309);
				match(T__3);
				setState(1310);
				match(T__5);
				setState(1311);
				expression();
				}
				break;
			case 19:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1312);
				identifier();
				}
				break;
			case 20:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1313);
				match(T__2);
				setState(1314);
				expression();
				setState(1315);
				match(T__3);
				}
				break;
			case 21:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1317);
				match(EXTRACT);
				setState(1318);
				match(T__2);
				setState(1319);
				identifier();
				setState(1320);
				match(FROM);
				setState(1321);
				valueExpression(0);
				setState(1322);
				match(T__3);
				}
				break;
			case 22:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1324);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1325);
				match(T__2);
				setState(1326);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(1327);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1328);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==FOR) {
					{
					setState(1329);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1330);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(1333);
				match(T__3);
				}
				break;
			case 23:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1335);
				match(TRIM);
				setState(1336);
				match(T__2);
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1337);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1340);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(1343);
				match(FROM);
				setState(1344);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(1345);
				match(T__3);
				}
				break;
			case 24:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1347);
				match(OVERLAY);
				setState(1348);
				match(T__2);
				setState(1349);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(1350);
				match(PLACING);
				setState(1351);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(1352);
				match(FROM);
				setState(1353);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1354);
					match(FOR);
					setState(1355);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(1358);
				match(T__3);
				}
				break;
			case 25:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1360);
				match(QUESTION_MARK);
				}
				break;
			case 26:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1361);
				match(ARRAY);
				setState(1362);
				match(T__6);
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LEFT - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)) | (1L << (REDUCE - 128)) | (1L << (REFERENCES - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPAIR - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REVOKE - 192)) | (1L << (RIGHT - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SECOND - 192)) | (1L << (SCHEMA - 192)) | (1L << (SELECT - 192)) | (1L << (SEMI - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETMINUS - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYNC - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TIME - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (UNLOCK - 192)) | (1L << (UNSET - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (ZONE - 256)) | (1L << (ADMIN - 256)) | (1L << (BERNOULLI - 256)) | (1L << (CALL - 256)) | (1L << (CATALOGS - 256)) | (1L << (COMMITTED - 256)) | (1L << (DATE - 256)) | (1L << (DEFINER - 256)) | (1L << (DEFINE - 256)) | (1L << (DISTRIBUTED - 256)) | (1L << (DOUBLE - 256)) | (1L << (EMPTY - 256)) | (1L << (EXCLUDING - 256)) | (1L << (FINAL - 256)) | (1L << (GRANTED - 256)) | (1L << (GRANTS - 256)) | (1L << (GRAPHVIZ - 256)) | (1L << (GROUPS - 256)) | (1L << (HOUR - 256)) | (1L << (INCLUDING - 256)) | (1L << (INITIAL - 256)) | (1L << (INPUT - 256)) | (1L << (INVOKER - 256)) | (1L << (IO - 256)) | (1L << (ISOLATION - 256)) | (1L << (JSON - 256)) | (1L << (LEVEL - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHES - 256)) | (1L << (MATCH_RECOGNIZE - 256)) | (1L << (MATERIALIZED - 256)) | (1L << (MEASURES - 256)) | (1L << (MINUTE - 256)) | (1L << (NEXT - 256)) | (1L << (NFC - 256)) | (1L << (NFD - 256)) | (1L << (NFKC - 256)) | (1L << (NFKD - 256)) | (1L << (NONE - 256)) | (1L << (NORMALIZE - 256)) | (1L << (NULLIF - 256)) | (1L << (OFFSET - 256)) | (1L << (OMIT - 256)) | (1L << (ONE - 256)) | (1L << (ORDINALITY - 256)) | (1L << (OUTPUT - 256)) | (1L << (PAST - 256)) | (1L << (PATH - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (PATTERN - 320)) | (1L << (PER - 320)) | (1L << (PERMUTE - 320)) | (1L << (PRECISION - 320)) | (1L << (PRIVILEGES - 320)) | (1L << (READ - 320)) | (1L << (REPEATABLE - 320)) | (1L << (RUNNING - 320)) | (1L << (SCHEMAS - 320)) | (1L << (SECURITY - 320)) | (1L << (SEEK - 320)) | (1L << (SERIALIZABLE - 320)) | (1L << (SESSION - 320)) | (1L << (STATS - 320)) | (1L << (SUBSET - 320)) | (1L << (SYSTEM - 320)) | (1L << (TEXT - 320)) | (1L << (TIES - 320)) | (1L << (TIMESTAMP - 320)) | (1L << (UNCOMMITTED - 320)) | (1L << (UNMATCHED - 320)) | (1L << (VALIDATE - 320)) | (1L << (VERBOSE - 320)) | (1L << (WITHOUT - 320)) | (1L << (WORK - 320)) | (1L << (WRITE - 320)) | (1L << (PLUS - 320)) | (1L << (MINUS - 320)) | (1L << (ASTERISK - 320)) | (1L << (TILDE - 320)) | (1L << (QUESTION_MARK - 320)) | (1L << (STRING - 320)) | (1L << (UNICODE_STRING - 320)) | (1L << (INTEGER_VALUE - 320)) | (1L << (DECIMAL_VALUE - 320)) | (1L << (DOUBLE_VALUE - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (QUOTED_IDENTIFIER - 320)) | (1L << (BACKQUOTED_IDENTIFIER - 320)))) != 0)) {
					{
					setState(1363);
					expression();
					setState(1368);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1364);
						match(T__1);
						setState(1365);
						expression();
						}
						}
						setState(1370);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1373);
				match(T__7);
				}
				break;
			case 27:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1374);
				match(NORMALIZE);
				setState(1375);
				match(T__2);
				setState(1376);
				valueExpression(0);
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1377);
					match(T__1);
					setState(1378);
					normalForm();
					}
				}

				setState(1381);
				match(T__3);
				}
				break;
			case 28:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1383);
				match(GROUPING);
				setState(1384);
				match(T__2);
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (LIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MONTH - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NOT - 129)) | (1L << (NULL - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OUT - 129)) | (1L << (OUTER - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAPS - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIMARY - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)) | (1L << (REFERENCES - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPAIR - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (REVOKE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (RLIKE - 194)) | (1L << (ROLE - 194)) | (1L << (ROLES - 194)) | (1L << (ROLLBACK - 194)) | (1L << (ROLLUP - 194)) | (1L << (ROW - 194)) | (1L << (ROWS - 194)) | (1L << (SECOND - 194)) | (1L << (SCHEMA - 194)) | (1L << (SELECT - 194)) | (1L << (SEMI - 194)) | (1L << (SEPARATED - 194)) | (1L << (SERDE - 194)) | (1L << (SERDEPROPERTIES - 194)) | (1L << (SESSION_USER - 194)) | (1L << (SET - 194)) | (1L << (SETMINUS - 194)) | (1L << (SETS - 194)) | (1L << (SHOW - 194)) | (1L << (SKEWED - 194)) | (1L << (SOME - 194)) | (1L << (SORT - 194)) | (1L << (SORTED - 194)) | (1L << (START - 194)) | (1L << (STATISTICS - 194)) | (1L << (STORED - 194)) | (1L << (STRATIFY - 194)) | (1L << (STRUCT - 194)) | (1L << (SUBSTR - 194)) | (1L << (SUBSTRING - 194)) | (1L << (SYNC - 194)) | (1L << (TABLE - 194)) | (1L << (TABLES - 194)) | (1L << (TABLESAMPLE - 194)) | (1L << (TBLPROPERTIES - 194)) | (1L << (TEMPORARY - 194)) | (1L << (TERMINATED - 194)) | (1L << (THEN - 194)) | (1L << (TIME - 194)) | (1L << (TO - 194)) | (1L << (TOUCH - 194)) | (1L << (TRAILING - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRANSFORM - 194)) | (1L << (TRIM - 194)) | (1L << (TRUE - 194)) | (1L << (TRUNCATE - 194)) | (1L << (TRY_CAST - 194)) | (1L << (TYPE - 194)) | (1L << (UNARCHIVE - 194)) | (1L << (UNBOUNDED - 194)) | (1L << (UNCACHE - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNKNOWN - 194)) | (1L << (UNLOCK - 194)) | (1L << (UNSET - 194)) | (1L << (UPDATE - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALUES - 194)) | (1L << (VIEW - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (VIEWS - 258)) | (1L << (WHEN - 258)) | (1L << (WHERE - 258)) | (1L << (WINDOW - 258)) | (1L << (WITH - 258)) | (1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (ADMIN - 258)) | (1L << (BERNOULLI - 258)) | (1L << (CALL - 258)) | (1L << (CATALOGS - 258)) | (1L << (COMMITTED - 258)) | (1L << (DATE - 258)) | (1L << (DEFINER - 258)) | (1L << (DEFINE - 258)) | (1L << (DISTRIBUTED - 258)) | (1L << (DOUBLE - 258)) | (1L << (EMPTY - 258)) | (1L << (EXCLUDING - 258)) | (1L << (FINAL - 258)) | (1L << (GRANTED - 258)) | (1L << (GRANTS - 258)) | (1L << (GRAPHVIZ - 258)) | (1L << (GROUPS - 258)) | (1L << (HOUR - 258)) | (1L << (INCLUDING - 258)) | (1L << (INITIAL - 258)) | (1L << (INPUT - 258)) | (1L << (INVOKER - 258)) | (1L << (IO - 258)) | (1L << (ISOLATION - 258)) | (1L << (JSON - 258)) | (1L << (LEVEL - 258)) | (1L << (MATCH - 258)) | (1L << (MATCHES - 258)) | (1L << (MATCH_RECOGNIZE - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MEASURES - 258)) | (1L << (MINUTE - 258)) | (1L << (NEXT - 258)) | (1L << (NFC - 258)) | (1L << (NFD - 258)) | (1L << (NFKC - 258)) | (1L << (NFKD - 258)) | (1L << (NONE - 258)) | (1L << (NULLIF - 258)) | (1L << (OFFSET - 258)) | (1L << (OMIT - 258)) | (1L << (ONE - 258)) | (1L << (ORDINALITY - 258)) | (1L << (OUTPUT - 258)) | (1L << (PAST - 258)) | (1L << (PATH - 258)) | (1L << (PATTERN - 258)) | (1L << (PER - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PERMUTE - 322)) | (1L << (PRECISION - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (READ - 322)) | (1L << (REPEATABLE - 322)) | (1L << (RUNNING - 322)) | (1L << (SCHEMAS - 322)) | (1L << (SECURITY - 322)) | (1L << (SEEK - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SESSION - 322)) | (1L << (STATS - 322)) | (1L << (SUBSET - 322)) | (1L << (SYSTEM - 322)) | (1L << (TEXT - 322)) | (1L << (TIES - 322)) | (1L << (TIMESTAMP - 322)) | (1L << (UNCOMMITTED - 322)) | (1L << (UNMATCHED - 322)) | (1L << (VALIDATE - 322)) | (1L << (VERBOSE - 322)) | (1L << (WITHOUT - 322)) | (1L << (WORK - 322)) | (1L << (WRITE - 322)) | (1L << (IDENTIFIER - 322)) | (1L << (QUOTED_IDENTIFIER - 322)) | (1L << (BACKQUOTED_IDENTIFIER - 322)))) != 0)) {
					{
					setState(1385);
					qualifiedName();
					setState(1390);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1386);
						match(T__1);
						setState(1387);
						qualifiedName();
						}
						}
						setState(1392);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1395);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1406);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1398);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1399);
						match(T__6);
						setState(1400);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1401);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1403);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1404);
						match(T__4);
						setState(1405);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends ConstantContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_constant);
		try {
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				identifier();
				setState(1414);
				string();
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1416);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1417);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1418);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_windowSpec);
		int _la;
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				match(T__2);
				setState(1425);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(1426);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1428);
				match(T__2);
				setState(1463);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(1429);
					match(CLUSTER);
					setState(1430);
					match(BY);
					setState(1431);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(1436);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1432);
						match(T__1);
						setState(1433);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(1438);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__3:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(1449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(1439);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1440);
						match(BY);
						setState(1441);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(1446);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(1442);
							match(T__1);
							setState(1443);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(1448);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(1461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(1451);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1452);
						match(BY);
						setState(1453);
						sortItem();
						setState(1458);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__1) {
							{
							{
							setState(1454);
							match(T__1);
							setState(1455);
							sortItem();
							}
							}
							setState(1460);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(1465);
					windowFrame();
					}
				}

				setState(1468);
				match(T__3);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_windowFrame);
		try {
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1472);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1474);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1475);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1476);
				match(BETWEEN);
				setState(1477);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1478);
				match(AND);
				setState(1479);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1481);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1482);
				match(BETWEEN);
				setState(1483);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1484);
				match(AND);
				setState(1485);
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
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_frameBound);
		int _la;
		try {
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				match(UNBOUNDED);
				setState(1490);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(1492);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1493);
				expression();
				setState(1494);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 152, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			identifier();
			setState(1503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1499);
					match(T__4);
					setState(1500);
					identifier();
					}
					} 
				}
				setState(1505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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
		public TerminalNode UNICODE_STRING() { return getToken(SqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(SqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_string);
		try {
			setState(1512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				match(UNICODE_STRING);
				setState(1510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1508);
					match(UESCAPE);
					setState(1509);
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
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(SqlBaseParser.DOUBLE_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_number);
		int _la;
		try {
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1514);
					match(MINUS);
					}
				}

				setState(1517);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1518);
					match(MINUS);
					}
				}

				setState(1521);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1522);
					match(MINUS);
					}
				}

				setState(1525);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
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
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(INTERVAL);
			setState(1532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1531);
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

			setState(1534);
			string();
			setState(1535);
			((IntervalContext)_localctx).from = intervalField();
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1536);
				match(TO);
				setState(1537);
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
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==MONTH || _la==SECOND || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (YEAR - 263)) | (1L << (HOUR - 263)) | (1L << (MINUTE - 263)))) != 0)) ) {
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
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			_la = _input.LA(1);
			if ( !(((((_la - 306)) & ~0x3f) == 0 && ((1L << (_la - 306)) & ((1L << (NFC - 306)) | (1L << (NFD - 306)) | (1L << (NFKC - 306)) | (1L << (NFKD - 306)))) != 0)) ) {
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowTypeContext extends DataTypeContext {
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<RowFieldContext> rowField() {
			return getRuleContexts(RowFieldContext.class);
		}
		public RowFieldContext rowField(int i) {
			return getRuleContext(RowFieldContext.class,i);
		}
		public RowTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	public static class IntervalTypeContext extends DataTypeContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayTypeContext extends DataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public ArrayTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	public static class LegacyArrayTypeContext extends DataTypeContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public LegacyArrayTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	public static class GenericTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public GenericTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	public static class DateTimeTypeContext extends DataTypeContext {
		public Token base;
		public TypeParameterContext precision;
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode WITHOUT() { return getToken(SqlBaseParser.WITHOUT, 0); }
		public List<TerminalNode> TIME() { return getTokens(SqlBaseParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(SqlBaseParser.TIME, i);
		}
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public DateTimeTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}
	public static class LegacyMapTypeContext extends DataTypeContext {
		public DataTypeContext keyType;
		public DataTypeContext valueType;
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public LegacyMapTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		return dataType(0);
	}

	private DataTypeContext dataType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DataTypeContext _localctx = new DataTypeContext(_ctx, _parentState);
		DataTypeContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_dataType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				_localctx = new RowTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1545);
				match(ROW);
				setState(1546);
				match(T__2);
				setState(1547);
				rowField();
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1548);
					match(T__1);
					setState(1549);
					rowField();
					}
					}
					setState(1554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1555);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new IntervalTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1557);
				match(INTERVAL);
				setState(1558);
				((IntervalTypeContext)_localctx).from = intervalField();
				setState(1561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1559);
					match(TO);
					setState(1560);
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
				setState(1563);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1564);
					match(T__2);
					setState(1565);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1566);
					match(T__3);
					}
					break;
				}
				setState(1573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1570);
					match(WITHOUT);
					setState(1571);
					match(TIME);
					setState(1572);
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
				setState(1575);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1576);
					match(T__2);
					setState(1577);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1578);
					match(T__3);
					}
				}

				setState(1582);
				match(WITH);
				setState(1583);
				match(TIME);
				setState(1584);
				match(ZONE);
				}
				break;
			case 5:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1585);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1586);
					match(T__2);
					setState(1587);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1588);
					match(T__3);
					}
					break;
				}
				setState(1595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1592);
					match(WITHOUT);
					setState(1593);
					match(TIME);
					setState(1594);
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
				setState(1597);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1598);
					match(T__2);
					setState(1599);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1600);
					match(T__3);
					}
				}

				setState(1604);
				match(WITH);
				setState(1605);
				match(TIME);
				setState(1606);
				match(ZONE);
				}
				break;
			case 7:
				{
				_localctx = new LegacyArrayTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1607);
				match(ARRAY);
				setState(1608);
				match(LT);
				setState(1609);
				dataType(0);
				setState(1610);
				match(GT);
				}
				break;
			case 8:
				{
				_localctx = new LegacyMapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1612);
				match(MAP);
				setState(1613);
				match(LT);
				setState(1614);
				((LegacyMapTypeContext)_localctx).keyType = dataType(0);
				setState(1615);
				match(T__1);
				setState(1616);
				((LegacyMapTypeContext)_localctx).valueType = dataType(0);
				setState(1617);
				match(GT);
				}
				break;
			case 9:
				{
				_localctx = new GenericTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1619);
				identifier();
				setState(1631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1620);
					match(T__2);
					setState(1621);
					typeParameter();
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(1622);
						match(T__1);
						setState(1623);
						typeParameter();
						}
						}
						setState(1628);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1629);
					match(T__3);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new DataTypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_dataType);
					setState(1635);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1636);
					match(ARRAY);
					setState(1640);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1637);
						match(T__6);
						setState(1638);
						match(INTEGER_VALUE);
						setState(1639);
						match(T__7);
						}
						break;
					}
					}
					} 
				}
				setState(1646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
		enterRule(_localctx, 168, RULE_rowField);
		try {
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				dataType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				identifier();
				setState(1649);
				dataType(0);
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
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typeParameter);
		try {
			setState(1655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1653);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case AFTER:
			case ALL:
			case ALTER:
			case ANALYZE:
			case AND:
			case ANTI:
			case ANY:
			case ARCHIVE:
			case ARRAY:
			case AS:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BETWEEN:
			case BOTH:
			case BUCKET:
			case BUCKETS:
			case BY:
			case CACHE:
			case CASCADE:
			case CASE:
			case CAST:
			case CHANGE:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CLUSTERED:
			case CODEGEN:
			case COLLATE:
			case COLLECTION:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMPACT:
			case COMPACTIONS:
			case COMPUTE:
			case CONCATENATE:
			case CONSTRAINT:
			case COST:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DAY:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBPROPERTIES:
			case DEFINED:
			case DELETE:
			case DELIMITED:
			case DESC:
			case DESCRIBE:
			case DFS:
			case DIRECTORIES:
			case DIRECTORY:
			case DISTINCT:
			case DISTRIBUTE:
			case DIV:
			case DROP:
			case ELSE:
			case END:
			case ESCAPE:
			case ESCAPED:
			case EXCHANGE:
			case EXISTS:
			case EXPLAIN:
			case EXPORT:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FIELDS:
			case FILTER:
			case FILEFORMAT:
			case FIRST:
			case FOLLOWING:
			case FOR:
			case FOREIGN:
			case FORMAT:
			case FORMATTED:
			case FROM:
			case FUNCTION:
			case FUNCTIONS:
			case GLOBAL:
			case GRANT:
			case GROUP:
			case GROUPING:
			case HAVING:
			case IF:
			case IGNORE:
			case IMPORT:
			case IN:
			case INDEX:
			case INDEXES:
			case INPATH:
			case INPUTFORMAT:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case ITEMS:
			case KEYS:
			case LAST:
			case LATERAL:
			case LAZY:
			case LEADING:
			case LIKE:
			case LIMIT:
			case LINES:
			case LIST:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOCKS:
			case LOGICAL:
			case MACRO:
			case MAP:
			case MATCHED:
			case MERGE:
			case MONTH:
			case MSCK:
			case NAMESPACE:
			case NAMESPACES:
			case NO:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case ONLY:
			case OPTION:
			case OPTIONS:
			case OR:
			case ORDER:
			case OUT:
			case OUTER:
			case OUTPUTFORMAT:
			case OVER:
			case OVERLAPS:
			case OVERLAY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONS:
			case PERCENTLIT:
			case PIVOT:
			case PLACING:
			case POSITION:
			case PRECEDING:
			case PRIMARY:
			case PRINCIPALS:
			case PROPERTIES:
			case PURGE:
			case QUERY:
			case RANGE:
			case RECORDREADER:
			case RECORDWRITER:
			case RECOVER:
			case REDUCE:
			case REFERENCES:
			case REFRESH:
			case RENAME:
			case REPAIR:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case RLIKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SECOND:
			case SCHEMA:
			case SELECT:
			case SEMI:
			case SEPARATED:
			case SERDE:
			case SERDEPROPERTIES:
			case SESSION_USER:
			case SET:
			case SETMINUS:
			case SETS:
			case SHOW:
			case SKEWED:
			case SOME:
			case SORT:
			case SORTED:
			case START:
			case STATISTICS:
			case STORED:
			case STRATIFY:
			case STRUCT:
			case SUBSTR:
			case SUBSTRING:
			case SYNC:
			case TABLE:
			case TABLES:
			case TABLESAMPLE:
			case TBLPROPERTIES:
			case TEMPORARY:
			case TERMINATED:
			case THEN:
			case TIME:
			case TO:
			case TOUCH:
			case TRAILING:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRANSFORM:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNARCHIVE:
			case UNBOUNDED:
			case UNCACHE:
			case UNIQUE:
			case UNKNOWN:
			case UNLOCK:
			case UNSET:
			case UPDATE:
			case USE:
			case USER:
			case VALUES:
			case VIEW:
			case VIEWS:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case ZONE:
			case ADMIN:
			case BERNOULLI:
			case CALL:
			case CATALOGS:
			case COMMITTED:
			case DATE:
			case DEFINER:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case FINAL:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LEVEL:
			case MATCH:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MINUTE:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NONE:
			case NULLIF:
			case OFFSET:
			case OMIT:
			case ONE:
			case ORDINALITY:
			case OUTPUT:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case PRECISION:
			case PRIVILEGES:
			case READ:
			case REPEATABLE:
			case RUNNING:
			case SCHEMAS:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case STATS:
			case SUBSET:
			case SYSTEM:
			case TEXT:
			case TIES:
			case TIMESTAMP:
			case UNCOMMITTED:
			case UNMATCHED:
			case VALIDATE:
			case VERBOSE:
			case WITHOUT:
			case WORK:
			case WRITE:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1654);
				dataType(0);
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
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_identifier);
		try {
			setState(1661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1658);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case AFTER:
			case ALL:
			case ALTER:
			case ANALYZE:
			case AND:
			case ANTI:
			case ANY:
			case ARCHIVE:
			case ARRAY:
			case AS:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BETWEEN:
			case BOTH:
			case BUCKET:
			case BUCKETS:
			case BY:
			case CACHE:
			case CASCADE:
			case CASE:
			case CAST:
			case CHANGE:
			case CHECK:
			case CLEAR:
			case CLUSTER:
			case CLUSTERED:
			case CODEGEN:
			case COLLATE:
			case COLLECTION:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMPACT:
			case COMPACTIONS:
			case COMPUTE:
			case CONCATENATE:
			case CONSTRAINT:
			case COST:
			case CREATE:
			case CUBE:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DAY:
			case DATA:
			case DATABASE:
			case DATABASES:
			case DBPROPERTIES:
			case DEFINED:
			case DELETE:
			case DELIMITED:
			case DESC:
			case DESCRIBE:
			case DFS:
			case DIRECTORIES:
			case DIRECTORY:
			case DISTINCT:
			case DISTRIBUTE:
			case DIV:
			case DROP:
			case ELSE:
			case END:
			case ESCAPE:
			case ESCAPED:
			case EXCHANGE:
			case EXISTS:
			case EXPLAIN:
			case EXPORT:
			case EXTENDED:
			case EXTERNAL:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FIELDS:
			case FILTER:
			case FILEFORMAT:
			case FIRST:
			case FOLLOWING:
			case FOR:
			case FOREIGN:
			case FORMAT:
			case FORMATTED:
			case FROM:
			case FUNCTION:
			case FUNCTIONS:
			case GLOBAL:
			case GRANT:
			case GROUP:
			case GROUPING:
			case HAVING:
			case IF:
			case IGNORE:
			case IMPORT:
			case IN:
			case INDEX:
			case INDEXES:
			case INPATH:
			case INPUTFORMAT:
			case INSERT:
			case INTERVAL:
			case INTO:
			case IS:
			case ITEMS:
			case KEYS:
			case LAST:
			case LATERAL:
			case LAZY:
			case LEADING:
			case LIKE:
			case LIMIT:
			case LINES:
			case LIST:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCK:
			case LOCKS:
			case LOGICAL:
			case MACRO:
			case MAP:
			case MATCHED:
			case MERGE:
			case MONTH:
			case MSCK:
			case NAMESPACE:
			case NAMESPACES:
			case NO:
			case NOT:
			case NULL:
			case NULLS:
			case OF:
			case ONLY:
			case OPTION:
			case OPTIONS:
			case OR:
			case ORDER:
			case OUT:
			case OUTER:
			case OUTPUTFORMAT:
			case OVER:
			case OVERLAPS:
			case OVERLAY:
			case OVERWRITE:
			case PARTITION:
			case PARTITIONED:
			case PARTITIONS:
			case PERCENTLIT:
			case PIVOT:
			case PLACING:
			case POSITION:
			case PRECEDING:
			case PRIMARY:
			case PRINCIPALS:
			case PROPERTIES:
			case PURGE:
			case QUERY:
			case RANGE:
			case RECORDREADER:
			case RECORDWRITER:
			case RECOVER:
			case REDUCE:
			case REFERENCES:
			case REFRESH:
			case RENAME:
			case REPAIR:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case RLIKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROLLUP:
			case ROW:
			case ROWS:
			case SECOND:
			case SCHEMA:
			case SELECT:
			case SEMI:
			case SEPARATED:
			case SERDE:
			case SERDEPROPERTIES:
			case SESSION_USER:
			case SET:
			case SETMINUS:
			case SETS:
			case SHOW:
			case SKEWED:
			case SOME:
			case SORT:
			case SORTED:
			case START:
			case STATISTICS:
			case STORED:
			case STRATIFY:
			case STRUCT:
			case SUBSTR:
			case SUBSTRING:
			case SYNC:
			case TABLE:
			case TABLES:
			case TABLESAMPLE:
			case TBLPROPERTIES:
			case TEMPORARY:
			case TERMINATED:
			case THEN:
			case TIME:
			case TO:
			case TOUCH:
			case TRAILING:
			case TRANSACTION:
			case TRANSACTIONS:
			case TRANSFORM:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNARCHIVE:
			case UNBOUNDED:
			case UNCACHE:
			case UNIQUE:
			case UNKNOWN:
			case UNLOCK:
			case UNSET:
			case UPDATE:
			case USE:
			case USER:
			case VALUES:
			case VIEW:
			case VIEWS:
			case WHEN:
			case WHERE:
			case WINDOW:
			case WITH:
			case YEAR:
			case ZONE:
			case ADMIN:
			case BERNOULLI:
			case CALL:
			case CATALOGS:
			case COMMITTED:
			case DATE:
			case DEFINER:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case FINAL:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case INCLUDING:
			case INITIAL:
			case INPUT:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LEVEL:
			case MATCH:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MINUTE:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NONE:
			case NULLIF:
			case OFFSET:
			case OMIT:
			case ONE:
			case ORDINALITY:
			case OUTPUT:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case PRECISION:
			case PRIVILEGES:
			case READ:
			case REPEATABLE:
			case RUNNING:
			case SCHEMAS:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case STATS:
			case SUBSET:
			case SYSTEM:
			case TEXT:
			case TIES:
			case TIMESTAMP:
			case UNCOMMITTED:
			case UNMATCHED:
			case VALIDATE:
			case VERBOSE:
			case WITHOUT:
			case WORK:
			case WRITE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1659);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1660);
				match(BACKQUOTED_IDENTIFIER);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_la = _input.LA(1);
			if ( !(((((_la - 350)) & ~0x3f) == 0 && ((1L << (_la - 350)) & ((1L << (EQ - 350)) | (1L << (NSEQ - 350)) | (1L << (NEQ - 350)) | (1L << (LT - 350)) | (1L << (LTE - 350)) | (1L << (GT - 350)) | (1L << (GTE - 350)))) != 0)) ) {
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINE() { return getToken(SqlBaseParser.DEFINE, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DEFINER() { return getToken(SqlBaseParser.DEFINER, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DOUBLE() { return getToken(SqlBaseParser.DOUBLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode EMPTY() { return getToken(SqlBaseParser.EMPTY, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FINAL() { return getToken(SqlBaseParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode GROUPS() { return getToken(SqlBaseParser.GROUPS, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INITIAL() { return getToken(SqlBaseParser.INITIAL, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INVOKER() { return getToken(SqlBaseParser.INVOKER, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCH() { return getToken(SqlBaseParser.MATCH, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MATCHES() { return getToken(SqlBaseParser.MATCHES, 0); }
		public TerminalNode MATCH_RECOGNIZE() { return getToken(SqlBaseParser.MATCH_RECOGNIZE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode MEASURES() { return getToken(SqlBaseParser.MEASURES, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NEXT() { return getToken(SqlBaseParser.NEXT, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public TerminalNode OMIT() { return getToken(SqlBaseParser.OMIT, 0); }
		public TerminalNode ONE() { return getToken(SqlBaseParser.ONE, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PAST() { return getToken(SqlBaseParser.PAST, 0); }
		public TerminalNode PATH() { return getToken(SqlBaseParser.PATH, 0); }
		public TerminalNode PATTERN() { return getToken(SqlBaseParser.PATTERN, 0); }
		public TerminalNode PER() { return getToken(SqlBaseParser.PER, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PERMUTE() { return getToken(SqlBaseParser.PERMUTE, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRECISION() { return getToken(SqlBaseParser.PRECISION, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode RUNNING() { return getToken(SqlBaseParser.RUNNING, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(SqlBaseParser.SECURITY, 0); }
		public TerminalNode SEEK() { return getToken(SqlBaseParser.SEEK, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSET() { return getToken(SqlBaseParser.SUBSET, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIES() { return getToken(SqlBaseParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNMATCHED() { return getToken(SqlBaseParser.UNMATCHED, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(SqlBaseParser.WITHOUT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANTI) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DBPROPERTIES) | (1L << DEFINED))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LAZY - 64)) | (1L << (LEADING - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (LIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MONTH - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NOT - 129)) | (1L << (NULL - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OUT - 129)) | (1L << (OUTER - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAPS - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIMARY - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)) | (1L << (REFERENCES - 129)) | (1L << (REFRESH - 129)) | (1L << (RENAME - 129)) | (1L << (REPAIR - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (REVOKE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (RLIKE - 194)) | (1L << (ROLE - 194)) | (1L << (ROLES - 194)) | (1L << (ROLLBACK - 194)) | (1L << (ROLLUP - 194)) | (1L << (ROW - 194)) | (1L << (ROWS - 194)) | (1L << (SECOND - 194)) | (1L << (SCHEMA - 194)) | (1L << (SELECT - 194)) | (1L << (SEMI - 194)) | (1L << (SEPARATED - 194)) | (1L << (SERDE - 194)) | (1L << (SERDEPROPERTIES - 194)) | (1L << (SESSION_USER - 194)) | (1L << (SET - 194)) | (1L << (SETMINUS - 194)) | (1L << (SETS - 194)) | (1L << (SHOW - 194)) | (1L << (SKEWED - 194)) | (1L << (SOME - 194)) | (1L << (SORT - 194)) | (1L << (SORTED - 194)) | (1L << (START - 194)) | (1L << (STATISTICS - 194)) | (1L << (STORED - 194)) | (1L << (STRATIFY - 194)) | (1L << (STRUCT - 194)) | (1L << (SUBSTR - 194)) | (1L << (SUBSTRING - 194)) | (1L << (SYNC - 194)) | (1L << (TABLE - 194)) | (1L << (TABLES - 194)) | (1L << (TABLESAMPLE - 194)) | (1L << (TBLPROPERTIES - 194)) | (1L << (TEMPORARY - 194)) | (1L << (TERMINATED - 194)) | (1L << (THEN - 194)) | (1L << (TIME - 194)) | (1L << (TO - 194)) | (1L << (TOUCH - 194)) | (1L << (TRAILING - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRANSFORM - 194)) | (1L << (TRIM - 194)) | (1L << (TRUE - 194)) | (1L << (TRUNCATE - 194)) | (1L << (TRY_CAST - 194)) | (1L << (TYPE - 194)) | (1L << (UNARCHIVE - 194)) | (1L << (UNBOUNDED - 194)) | (1L << (UNCACHE - 194)) | (1L << (UNIQUE - 194)) | (1L << (UNKNOWN - 194)) | (1L << (UNLOCK - 194)) | (1L << (UNSET - 194)) | (1L << (UPDATE - 194)) | (1L << (USE - 194)) | (1L << (USER - 194)) | (1L << (VALUES - 194)) | (1L << (VIEW - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (VIEWS - 258)) | (1L << (WHEN - 258)) | (1L << (WHERE - 258)) | (1L << (WINDOW - 258)) | (1L << (WITH - 258)) | (1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (ADMIN - 258)) | (1L << (BERNOULLI - 258)) | (1L << (CALL - 258)) | (1L << (CATALOGS - 258)) | (1L << (COMMITTED - 258)) | (1L << (DATE - 258)) | (1L << (DEFINER - 258)) | (1L << (DEFINE - 258)) | (1L << (DISTRIBUTED - 258)) | (1L << (DOUBLE - 258)) | (1L << (EMPTY - 258)) | (1L << (EXCLUDING - 258)) | (1L << (FINAL - 258)) | (1L << (GRANTED - 258)) | (1L << (GRANTS - 258)) | (1L << (GRAPHVIZ - 258)) | (1L << (GROUPS - 258)) | (1L << (HOUR - 258)) | (1L << (INCLUDING - 258)) | (1L << (INITIAL - 258)) | (1L << (INPUT - 258)) | (1L << (INVOKER - 258)) | (1L << (IO - 258)) | (1L << (ISOLATION - 258)) | (1L << (JSON - 258)) | (1L << (LEVEL - 258)) | (1L << (MATCH - 258)) | (1L << (MATCHES - 258)) | (1L << (MATCH_RECOGNIZE - 258)) | (1L << (MATERIALIZED - 258)) | (1L << (MEASURES - 258)) | (1L << (MINUTE - 258)) | (1L << (NEXT - 258)) | (1L << (NFC - 258)) | (1L << (NFD - 258)) | (1L << (NFKC - 258)) | (1L << (NFKD - 258)) | (1L << (NONE - 258)) | (1L << (NULLIF - 258)) | (1L << (OFFSET - 258)) | (1L << (OMIT - 258)) | (1L << (ONE - 258)) | (1L << (ORDINALITY - 258)) | (1L << (OUTPUT - 258)) | (1L << (PAST - 258)) | (1L << (PATH - 258)) | (1L << (PATTERN - 258)) | (1L << (PER - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (PERMUTE - 322)) | (1L << (PRECISION - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (READ - 322)) | (1L << (REPEATABLE - 322)) | (1L << (RUNNING - 322)) | (1L << (SCHEMAS - 322)) | (1L << (SECURITY - 322)) | (1L << (SEEK - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SESSION - 322)) | (1L << (STATS - 322)) | (1L << (SUBSET - 322)) | (1L << (SYSTEM - 322)) | (1L << (TEXT - 322)) | (1L << (TIES - 322)) | (1L << (TIMESTAMP - 322)) | (1L << (UNCOMMITTED - 322)) | (1L << (UNMATCHED - 322)) | (1L << (VALIDATE - 322)) | (1L << (VERBOSE - 322)) | (1L << (WITHOUT - 322)) | (1L << (WORK - 322)) | (1L << (WRITE - 322)))) != 0)) ) {
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
		case 10:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 66:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 69:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 70:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 83:
			return dataType_sempred((DataTypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean dataType_sempred(DataTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017d\u0686\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\7\2\u00b7\n\2\f\2\16\2\u00ba"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\n\5\n\u00d3\n\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\7\13\u00dc\n\13\f\13\16\13\u00df\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00e7\n\f\3\f\7\f\u00ea\n\f\f\f\16\f\u00ed\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00f4\n\r\f\r\16\r\u00f7\13\r\5\r\u00f9\n\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u0100\n\r\f\r\16\r\u0103\13\r\5\r\u0105\n\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u010c\n\r\f\r\16\r\u010f\13\r\5\r\u0111\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0118"+
		"\n\r\f\r\16\r\u011b\13\r\5\r\u011d\n\r\3\r\5\r\u0120\n\r\3\r\3\r\5\r\u0124"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u012f\n\16\3\17"+
		"\3\17\5\17\u0133\n\17\3\17\7\17\u0136\n\17\f\17\16\17\u0139\13\17\3\17"+
		"\5\17\u013c\n\17\3\17\5\17\u013f\n\17\3\17\5\17\u0142\n\17\3\17\5\17\u0145"+
		"\n\17\3\17\3\17\5\17\u0149\n\17\3\17\7\17\u014c\n\17\f\17\16\17\u014f"+
		"\13\17\3\17\5\17\u0152\n\17\3\17\5\17\u0155\n\17\3\17\5\17\u0158\n\17"+
		"\3\17\5\17\u015b\n\17\5\17\u015d\n\17\3\20\3\20\6\20\u0161\n\20\r\20\16"+
		"\20\u0162\3\21\3\21\5\21\u0167\n\21\3\21\3\21\3\21\3\21\7\21\u016d\n\21"+
		"\f\21\16\21\u0170\13\21\3\21\5\21\u0173\n\21\3\21\5\21\u0176\n\21\3\21"+
		"\5\21\u0179\n\21\3\21\5\21\u017c\n\21\3\21\3\21\5\21\u0180\n\21\3\22\3"+
		"\22\3\22\3\22\7\22\u0186\n\22\f\22\16\22\u0189\13\22\3\23\3\23\3\23\3"+
		"\23\5\23\u018f\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0196\n\23\3\23\3\23"+
		"\3\23\5\23\u019b\n\23\3\23\5\23\u019e\n\23\3\23\5\23\u01a1\n\23\3\23\3"+
		"\23\5\23\u01a5\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01af"+
		"\n\23\3\23\3\23\5\23\u01b3\n\23\5\23\u01b5\n\23\3\23\5\23\u01b8\n\23\3"+
		"\23\3\23\5\23\u01bc\n\23\3\24\3\24\5\24\u01c0\n\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\7\25\u01c8\n\25\f\25\16\25\u01cb\13\25\3\25\7\25\u01ce\n\25"+
		"\f\25\16\25\u01d1\13\25\3\25\5\25\u01d4\n\25\3\26\3\26\7\26\u01d8\n\26"+
		"\f\26\16\26\u01db\13\26\3\27\3\27\5\27\u01df\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u01e7\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ef\n"+
		"\27\3\27\3\27\3\27\3\27\5\27\u01f5\n\27\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u01fc\n\30\f\30\16\30\u01ff\13\30\5\30\u0201\n\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\5\31\u0209\n\31\3\31\3\31\3\32\5\32\u020e\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0220\n\32\5\32\u0222\n\32\3\32\5\32\u0225\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0231\n\33\f\33\16\33\u0234\13\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u023e\n\34\f\34\16\34\u0241"+
		"\13\34\3\34\3\34\5\34\u0245\n\34\3\35\3\35\5\35\u0249\n\35\3\35\5\35\u024c"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0255\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0261\n\36\5\36\u0263\n\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u026a\n\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0271\n\36\3\36\3\36\3\36\3\36\5\36\u0277\n\36\3\36\3\36\3\36\3\36\5"+
		"\36\u027d\n\36\5\36\u027f\n\36\3\37\3\37\3\37\5\37\u0284\n\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u028b\n\37\f\37\16\37\u028e\13\37\5\37\u0290\n\37"+
		"\3\37\3\37\3\37\5\37\u0295\n\37\3\37\3\37\3\37\7\37\u029a\n\37\f\37\16"+
		"\37\u029d\13\37\5\37\u029f\n\37\3 \3 \3 \3!\3!\3!\3!\3!\7!\u02a9\n!\f"+
		"!\16!\u02ac\13!\3!\3!\3!\3!\3!\7!\u02b3\n!\f!\16!\u02b6\13!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\7!\u02c2\n!\f!\16!\u02c5\13!\3!\3!\5!\u02c9\n!\5!"+
		"\u02cb\n!\3\"\3\"\5\"\u02cf\n\"\3#\3#\3#\3#\3#\7#\u02d6\n#\f#\16#\u02d9"+
		"\13#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u02e3\n#\f#\16#\u02e6\13#\3#\3#\5#\u02ea"+
		"\n#\3$\3$\5$\u02ee\n$\3%\3%\3%\3%\7%\u02f4\n%\f%\16%\u02f7\13%\5%\u02f9"+
		"\n%\3%\3%\5%\u02fd\n%\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0306\n\'\f\'\16\'"+
		"\u0309\13\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\7*\u0317\n*\f*\16*\u031a"+
		"\13*\3+\3+\3+\7+\u031f\n+\f+\16+\u0322\13+\3,\3,\3,\5,\u0327\n,\3,\3,"+
		"\3-\3-\3-\5-\u032e\n-\3-\3-\3.\3.\3.\7.\u0335\n.\f.\16.\u0338\13.\3/\3"+
		"/\3/\3/\5/\u033e\n/\3/\5/\u0341\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\7\61\u034a\n\61\f\61\16\61\u034d\13\61\3\61\3\61\3\62\3\62\5\62\u0353"+
		"\n\62\3\62\5\62\u0356\n\62\3\63\3\63\3\63\7\63\u035b\n\63\f\63\16\63\u035e"+
		"\13\63\3\63\5\63\u0361\n\63\3\64\3\64\3\64\3\64\5\64\u0367\n\64\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u0373\n\67\f\67\16\67"+
		"\u0376\13\67\38\38\68\u037a\n8\r8\168\u037b\38\58\u037f\n8\39\39\39\3"+
		"9\59\u0385\n9\3:\5:\u0388\n:\3:\3:\5:\u038c\n:\5:\u038e\n:\3;\3;\3;\3"+
		";\5;\u0394\n;\3;\3;\3;\3;\3;\5;\u039b\n;\3<\5<\u039e\n<\3<\3<\3<\5<\u03a3"+
		"\n<\3<\5<\u03a6\n<\3<\3<\3<\5<\u03ab\n<\3<\3<\5<\u03af\n<\3<\5<\u03b2"+
		"\n<\3<\5<\u03b5\n<\3=\3=\3=\3=\5=\u03bb\n=\3>\3>\5>\u03bf\n>\3>\3>\3>"+
		"\3>\3>\3?\3?\3?\3?\7?\u03ca\n?\f?\16?\u03cd\13?\3?\3?\3@\3@\3@\7@\u03d4"+
		"\n@\f@\16@\u03d7\13@\3A\3A\5A\u03db\nA\3A\3A\5A\u03df\nA\5A\u03e1\nA\3"+
		"B\3B\3B\7B\u03e6\nB\fB\16B\u03e9\13B\3C\3C\3D\3D\3D\5D\u03f0\nD\3D\3D"+
		"\3D\3D\3D\3D\3D\5D\u03f9\nD\3D\3D\3D\3D\3D\3D\7D\u0401\nD\fD\16D\u0404"+
		"\13D\3E\3E\5E\u0408\nE\3E\3E\5E\u040c\nE\3F\5F\u040f\nF\3F\3F\3F\3F\3"+
		"F\3F\5F\u0417\nF\3F\3F\3F\3F\3F\7F\u041e\nF\fF\16F\u0421\13F\3F\3F\3F"+
		"\5F\u0426\nF\3F\3F\3F\3F\3F\3F\5F\u042e\nF\3F\3F\3F\5F\u0433\nF\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\7F\u043d\nF\fF\16F\u0440\13F\3F\3F\5F\u0444\nF\3F\5"+
		"F\u0447\nF\3F\3F\3F\3F\5F\u044d\nF\3F\3F\5F\u0451\nF\3F\3F\3F\5F\u0456"+
		"\nF\3F\3F\3F\5F\u045b\nF\3F\3F\3F\5F\u0460\nF\3G\3G\3G\3G\5G\u0466\nG"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u047b\nG"+
		"\fG\16G\u047e\13G\3H\3H\3H\3H\3H\6H\u0485\nH\rH\16H\u0486\3H\3H\5H\u048b"+
		"\nH\3H\3H\3H\3H\6H\u0491\nH\rH\16H\u0492\3H\3H\5H\u0497\nH\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u04ae\nH\3H\3"+
		"H\3H\3H\3H\3H\3H\5H\u04b7\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\6H\u04cc\nH\rH\16H\u04cd\3H\3H\3H\3H\3H\3H\3H\7H\u04d7"+
		"\nH\fH\16H\u04da\13H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5"+
		"H\u04ec\nH\3H\3H\5H\u04f0\nH\3H\3H\3H\5H\u04f5\nH\3H\3H\3H\7H\u04fa\n"+
		"H\fH\16H\u04fd\13H\5H\u04ff\nH\3H\3H\3H\3H\3H\3H\5H\u0507\nH\3H\3H\5H"+
		"\u050b\nH\3H\3H\5H\u050f\nH\3H\3H\3H\3H\3H\3H\3H\3H\7H\u0519\nH\fH\16"+
		"H\u051c\13H\5H\u051e\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\5H\u0536\nH\3H\3H\3H\3H\3H\5H\u053d\nH\3H\5H\u0540"+
		"\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u054f\nH\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\7H\u0559\nH\fH\16H\u055c\13H\5H\u055e\nH\3H\3H\3H\3H\3H\3H\5"+
		"H\u0566\nH\3H\3H\3H\3H\3H\3H\3H\7H\u056f\nH\fH\16H\u0572\13H\5H\u0574"+
		"\nH\3H\5H\u0577\nH\3H\3H\3H\3H\3H\3H\3H\3H\7H\u0581\nH\fH\16H\u0584\13"+
		"H\3I\3I\3I\3I\3I\3I\3I\3I\5I\u058e\nI\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\7K\u059d\nK\fK\16K\u05a0\13K\3K\3K\3K\3K\3K\7K\u05a7\nK\fK\16"+
		"K\u05aa\13K\5K\u05ac\nK\3K\3K\3K\3K\3K\7K\u05b3\nK\fK\16K\u05b6\13K\5"+
		"K\u05b8\nK\5K\u05ba\nK\3K\5K\u05bd\nK\3K\5K\u05c0\nK\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u05d2\nL\3M\3M\3M\3M\3M\3M\3M\5M\u05db"+
		"\nM\3N\3N\3N\7N\u05e0\nN\fN\16N\u05e3\13N\3O\3O\3O\3O\5O\u05e9\nO\5O\u05eb"+
		"\nO\3P\5P\u05ee\nP\3P\3P\5P\u05f2\nP\3P\3P\5P\u05f6\nP\3P\5P\u05f9\nP"+
		"\3Q\3Q\3R\3R\5R\u05ff\nR\3R\3R\3R\3R\5R\u0605\nR\3S\3S\3T\3T\3U\3U\3U"+
		"\3U\3U\3U\7U\u0611\nU\fU\16U\u0614\13U\3U\3U\3U\3U\3U\3U\5U\u061c\nU\3"+
		"U\3U\3U\3U\3U\5U\u0623\nU\3U\3U\3U\5U\u0628\nU\3U\3U\3U\3U\3U\5U\u062f"+
		"\nU\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0639\nU\3U\3U\3U\5U\u063e\nU\3U\3U\3U"+
		"\3U\3U\5U\u0645\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\7U\u065b\nU\fU\16U\u065e\13U\3U\3U\5U\u0662\nU\5U\u0664\nU\3"+
		"U\3U\3U\3U\3U\5U\u066b\nU\7U\u066d\nU\fU\16U\u0670\13U\3V\3V\3V\3V\5V"+
		"\u0676\nV\3W\3W\5W\u067a\nW\3X\3X\3X\3X\5X\u0680\nX\3Y\3Y\3Z\3Z\3Z\2\7"+
		"\26\u0086\u008c\u008e\u00a8[\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\2\35"+
		"\6\2QQww\u00d4\u00d4\u00f9\u00f9\5\2\r\r\u0171\u0171\u0174\u0174\3\2\u0174"+
		"\u0175\4\2\66\66\u00c8\u00c8\4\2\26\26DD\4\2^^~~\5\2\r\r\22\22\u00d8\u00d8"+
		"\5\2YY\u00f2\u00f2\u00fb\u00fb\4\2\u0167\u0168\u016c\u016c\4\2KK\u0169"+
		"\u016b\4\2\u0167\u0168\u016f\u016f\4\288:;\4\2nn\u00c0\u00c0\3\2\u00e0"+
		"\u00e1\4\2\4\4dd\4\2\4\4``\5\2\32\32\u0081\u0081\u00ed\u00ed\4\2\r\rI"+
		"I\4\2JJ\u00a8\u00a8\4\2\u00a0\u00a0\u00d9\u00d9\4\2__\u00af\u00af\4\2"+
		"YY\u00f2\u00f2\3\2\u0167\u0168\b\2<<\u0091\u0091\u00cb\u00cb\u0109\u0109"+
		"\u0122\u0122\u0132\u0132\3\2\u0134\u0137\3\2\u0160\u0166\30\2\13\64\66"+
		"PRdfrtvx{}\u0081\u0083\u0094\u0096\u009a\u009c\u00c2\u00c4\u00f8\u00fa"+
		"\u0100\u0102\u010f\u0114\u0114\u0116\u011b\u011d\u012a\u012d\u0138\u013a"+
		"\u0145\u0147\u0148\u014a\u0156\u0158\u0159\u015b\u015f\2\u0759\2\u00b4"+
		"\3\2\2\2\4\u00bd\3\2\2\2\6\u00c0\3\2\2\2\b\u00c3\3\2\2\2\n\u00c6\3\2\2"+
		"\2\f\u00c9\3\2\2\2\16\u00cc\3\2\2\2\20\u00cf\3\2\2\2\22\u00d2\3\2\2\2"+
		"\24\u00d7\3\2\2\2\26\u00e0\3\2\2\2\30\u00f8\3\2\2\2\32\u012e\3\2\2\2\34"+
		"\u015c\3\2\2\2\36\u015e\3\2\2\2 \u017f\3\2\2\2\"\u0181\3\2\2\2$\u019d"+
		"\3\2\2\2&\u01bd\3\2\2\2(\u01c3\3\2\2\2*\u01d5\3\2\2\2,\u01f4\3\2\2\2."+
		"\u01f6\3\2\2\2\60\u0205\3\2\2\2\62\u0224\3\2\2\2\64\u0226\3\2\2\2\66\u0244"+
		"\3\2\2\28\u0246\3\2\2\2:\u027e\3\2\2\2<\u0280\3\2\2\2>\u02a0\3\2\2\2@"+
		"\u02ca\3\2\2\2B\u02ce\3\2\2\2D\u02e9\3\2\2\2F\u02ed\3\2\2\2H\u02fc\3\2"+
		"\2\2J\u02fe\3\2\2\2L\u0301\3\2\2\2N\u030a\3\2\2\2P\u030e\3\2\2\2R\u0313"+
		"\3\2\2\2T\u031b\3\2\2\2V\u0326\3\2\2\2X\u032d\3\2\2\2Z\u0331\3\2\2\2\\"+
		"\u0339\3\2\2\2^\u0342\3\2\2\2`\u0345\3\2\2\2b\u0350\3\2\2\2d\u0360\3\2"+
		"\2\2f\u0366\3\2\2\2h\u0368\3\2\2\2j\u036b\3\2\2\2l\u036f\3\2\2\2n\u037e"+
		"\3\2\2\2p\u0384\3\2\2\2r\u038d\3\2\2\2t\u039a\3\2\2\2v\u03b4\3\2\2\2x"+
		"\u03ba\3\2\2\2z\u03bc\3\2\2\2|\u03c5\3\2\2\2~\u03d0\3\2\2\2\u0080\u03d8"+
		"\3\2\2\2\u0082\u03e2\3\2\2\2\u0084\u03ea\3\2\2\2\u0086\u03f8\3\2\2\2\u0088"+
		"\u0405\3\2\2\2\u008a\u045f\3\2\2\2\u008c\u0465\3\2\2\2\u008e\u0576\3\2"+
		"\2\2\u0090\u058d\3\2\2\2\u0092\u058f\3\2\2\2\u0094\u05bf\3\2\2\2\u0096"+
		"\u05d1\3\2\2\2\u0098\u05da\3\2\2\2\u009a\u05dc\3\2\2\2\u009c\u05ea\3\2"+
		"\2\2\u009e\u05f8\3\2\2\2\u00a0\u05fa\3\2\2\2\u00a2\u05fc\3\2\2\2\u00a4"+
		"\u0606\3\2\2\2\u00a6\u0608\3\2\2\2\u00a8\u0663\3\2\2\2\u00aa\u0675\3\2"+
		"\2\2\u00ac\u0679\3\2\2\2\u00ae\u067f\3\2\2\2\u00b0\u0681\3\2\2\2\u00b2"+
		"\u0683\3\2\2\2\u00b4\u00b8\5\20\t\2\u00b5\u00b7\7\3\2\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\2\2\3\u00bc\3\3\2\2\2"+
		"\u00bd\u00be\5\u0080A\2\u00be\u00bf\7\2\2\3\u00bf\5\3\2\2\2\u00c0\u00c1"+
		"\5V,\2\u00c1\u00c2\7\2\2\3\u00c2\7\3\2\2\2\u00c3\u00c4\5T+\2\u00c4\u00c5"+
		"\7\2\2\3\u00c5\t\3\2\2\2\u00c6\u00c7\5X-\2\u00c7\u00c8\7\2\2\3\u00c8\13"+
		"\3\2\2\2\u00c9\u00ca\5\u00a8U\2\u00ca\u00cb\7\2\2\3\u00cb\r\3\2\2\2\u00cc"+
		"\u00cd\5Z.\2\u00cd\u00ce\7\2\2\3\u00ce\17\3\2\2\2\u00cf\u00d0\5\22\n\2"+
		"\u00d0\21\3\2\2\2\u00d1\u00d3\5\24\13\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\5\30\r\2"+
		"\u00d6\23\3\2\2\2\u00d7\u00d8\7\u0108\2\2\u00d8\u00dd\5z>\2\u00d9\u00da"+
		"\7\4\2\2\u00da\u00dc\5z>\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\25\3\2\2\2\u00df\u00dd\3\2\2"+
		"\2\u00e0\u00e1\b\f\1\2\u00e1\u00e2\5\32\16\2\u00e2\u00eb\3\2\2\2\u00e3"+
		"\u00e4\f\3\2\2\u00e4\u00e6\t\2\2\2\u00e5\u00e7\5\u0092J\2\u00e6\u00e5"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\5\26\f\4"+
		"\u00e9\u00e3\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\27\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\u00a0\2\2"+
		"\u00ef\u00f0\7\35\2\2\u00f0\u00f5\5\u0088E\2\u00f1\u00f2\7\4\2\2\u00f2"+
		"\u00f4\5\u0088E\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00ee\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0104\3\2\2\2\u00fa\u00fb\7%"+
		"\2\2\u00fb\u00fc\7\35\2\2\u00fc\u0101\5\u0084C\2\u00fd\u00fe\7\4\2\2\u00fe"+
		"\u0100\5\u0084C\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u00fa\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0110\3\2\2\2\u0106\u0107\7J"+
		"\2\2\u0107\u0108\7\35\2\2\u0108\u010d\5\u0084C\2\u0109\u010a\7\4\2\2\u010a"+
		"\u010c\5\u0084C\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0106\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u011c\3\2\2\2\u0112\u0113\7\u00d9"+
		"\2\2\u0113\u0114\7\35\2\2\u0114\u0119\5\u0088E\2\u0115\u0116\7\4\2\2\u0116"+
		"\u0118\5\u0088E\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u0112\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\5L"+
		"\'\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u0122\7\u0084\2\2\u0122\u0124\t\3\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\31\3\2\2\2\u0125\u012f\5\34\17\2\u0126\u012f\5\36\20\2"+
		"\u0127\u0128\7\u00e3\2\2\u0128\u012f\5T+\2\u0129\u012f\5\"\22\2\u012a"+
		"\u012b\7\5\2\2\u012b\u012c\5\22\n\2\u012c\u012d\7\6\2\2\u012d\u012f\3"+
		"\2\2\2\u012e\u0125\3\2\2\2\u012e\u0126\3\2\2\2\u012e\u0127\3\2\2\2\u012e"+
		"\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012f\33\3\2\2\2\u0130\u0132\5$\23"+
		"\2\u0131\u0133\5(\25\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137"+
		"\3\2\2\2\u0134\u0136\5<\37\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013c\5> \2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e"+
		"\3\2\2\2\u013d\u013f\5@!\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u0142\5J&\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2"+
		"\2\u0142\u0144\3\2\2\2\u0143\u0145\5L\'\2\u0144\u0143\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u015d\3\2\2\2\u0146\u0148\5&\24\2\u0147\u0149\5(\25\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014d\3\2\2\2\u014a\u014c\5<"+
		"\37\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\5>"+
		" \2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0155\5@!\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2"+
		"\2\u0156\u0158\5J&\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u015b\5L\'\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u0130\3\2\2\2\u015c\u0146\3\2\2\2\u015d\35\3\2\2"+
		"\2\u015e\u0160\5(\25\2\u015f\u0161\5 \21\2\u0160\u015f\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\37\3\2\2\2\u0164"+
		"\u0166\5$\23\2\u0165\u0167\5> \2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2"+
		"\2\u0167\u0168\3\2\2\2\u0168\u0169\5\30\r\2\u0169\u0180\3\2\2\2\u016a"+
		"\u016e\5&\24\2\u016b\u016d\5<\37\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0173\5> \2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2"+
		"\2\u0173\u0175\3\2\2\2\u0174\u0176\5@!\2\u0175\u0174\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0179\5J&\2\u0178\u0177\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c\5L\'\2\u017b\u017a\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5\30\r\2\u017e"+
		"\u0180\3\2\2\2\u017f\u0164\3\2\2\2\u017f\u016a\3\2\2\2\u0180!\3\2\2\2"+
		"\u0181\u0182\7\u0102\2\2\u0182\u0187\5\u0084C\2\u0183\u0184\7\4\2\2\u0184"+
		"\u0186\5\u0084C\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188#\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\7\u00cd\2\2\u018b\u018c\7\u00f0\2\2\u018c\u018e\7\5\2\2\u018d\u018f"+
		"\5\u0092J\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2"+
		"\2\u0190\u0191\5\u0082B\2\u0191\u0192\7\6\2\2\u0192\u019e\3\2\2\2\u0193"+
		"\u0195\7\u008e\2\2\u0194\u0196\5\u0092J\2\u0195\u0194\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019e\5\u0082B\2\u0198\u019a\7\u00b9"+
		"\2\2\u0199\u019b\5\u0092J\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\5\u0082B\2\u019d\u018a\3\2\2\2\u019d\u0193"+
		"\3\2\2\2\u019d\u0198\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\5:\36\2\u01a0"+
		"\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a3\7\u00b7"+
		"\2\2\u01a3\u01a5\7\u0172\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\7\u0101\2\2\u01a7\u01b4\7\u0172\2\2\u01a8\u01b2"+
		"\7\25\2\2\u01a9\u01b3\5l\67\2\u01aa\u01b3\5Z.\2\u01ab\u01ae\7\5\2\2\u01ac"+
		"\u01af\5l\67\2\u01ad\u01af\5Z.\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7\6\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01a9"+
		"\3\2\2\2\u01b2\u01aa\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4"+
		"\u01a8\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b8\5:"+
		"\36\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01ba\7\u00b6\2\2\u01ba\u01bc\7\u0172\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc%\3\2\2\2\u01bd\u01bf\7\u00cd\2\2\u01be\u01c0\5\u0092J\2"+
		"\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\5~@\2\u01c2\'\3\2\2\2\u01c3\u01c4\7d\2\2\u01c4\u01c9\5*\26\2\u01c5\u01c6"+
		"\7\4\2\2\u01c6\u01c8\5*\26\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cf\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cc\u01ce\5<\37\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d2\u01d4\5\64\33\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		")\3\2\2\2\u01d5\u01d9\5,\27\2\u01d6\u01d8\5t;\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da+\3\2\2\2"+
		"\u01db\u01d9\3\2\2\2\u01dc\u01de\5T+\2\u01dd\u01df\5\60\31\2\u01de\u01dd"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5r:\2\u01e1"+
		"\u01f5\3\2\2\2\u01e2\u01e3\7\5\2\2\u01e3\u01e4\5\22\n\2\u01e4\u01e6\7"+
		"\6\2\2\u01e5\u01e7\5\60\31\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\5r:\2\u01e9\u01f5\3\2\2\2\u01ea\u01eb\7\5\2"+
		"\2\u01eb\u01ec\5*\26\2\u01ec\u01ee\7\6\2\2\u01ed\u01ef\5\60\31\2\u01ee"+
		"\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\5r"+
		":\2\u01f1\u01f5\3\2\2\2\u01f2\u01f5\5\"\22\2\u01f3\u01f5\5.\30\2\u01f4"+
		"\u01dc\3\2\2\2\u01f4\u01e2\3\2\2\2\u01f4\u01ea\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f3\3\2\2\2\u01f5-\3\2\2\2\u01f6\u01f7\5p9\2\u01f7\u0200"+
		"\7\5\2\2\u01f8\u01fd\5\u0084C\2\u01f9\u01fa\7\4\2\2\u01fa\u01fc\5\u0084"+
		"C\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u01f8\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\7\6\2\2\u0203"+
		"\u0204\5r:\2\u0204/\3\2\2\2\u0205\u0206\7\u00e5\2\2\u0206\u0208\7\5\2"+
		"\2\u0207\u0209\5\62\32\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\7\6\2\2\u020b\61\3\2\2\2\u020c\u020e\7\u0168"+
		"\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0210\t\4\2\2\u0210\u0225\7\u00ab\2\2\u0211\u0212\5\u0084C\2\u0212\u0213"+
		"\7\u00ca\2\2\u0213\u0225\3\2\2\2\u0214\u0215\7\33\2\2\u0215\u0216\7\u0174"+
		"\2\2\u0216\u0217\7\u00a1\2\2\u0217\u0218\7\u009a\2\2\u0218\u0221\7\u0174"+
		"\2\2\u0219\u021f\7\u009b\2\2\u021a\u0220\5\u00aeX\2\u021b\u021c\5\u009a"+
		"N\2\u021c\u021d\7\5\2\2\u021d\u021e\7\6\2\2\u021e\u0220\3\2\2\2\u021f"+
		"\u021a\3\2\2\2\u021f\u021b\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u0219\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0225\5\u0084C\2\u0224"+
		"\u020d\3\2\2\2\u0224\u0211\3\2\2\2\u0224\u0214\3\2\2\2\u0224\u0223\3\2"+
		"\2\2\u0225\63\3\2\2\2\u0226\u0227\7\u00ac\2\2\u0227\u0228\7\5\2\2\u0228"+
		"\u0229\5~@\2\u0229\u022a\7`\2\2\u022a\u022b\5\66\34\2\u022b\u022c\7p\2"+
		"\2\u022c\u022d\7\5\2\2\u022d\u0232\58\35\2\u022e\u022f\7\4\2\2\u022f\u0231"+
		"\58\35\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7\6"+
		"\2\2\u0236\u0237\7\6\2\2\u0237\65\3\2\2\2\u0238\u0245\5\u00aeX\2\u0239"+
		"\u023a\7\5\2\2\u023a\u023f\5\u00aeX\2\u023b\u023c\7\4\2\2\u023c\u023e"+
		"\5\u00aeX\2\u023d\u023b\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2"+
		"\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243"+
		"\7\6\2\2\u0243\u0245\3\2\2\2\u0244\u0238\3\2\2\2\u0244\u0239\3\2\2\2\u0245"+
		"\67\3\2\2\2\u0246\u024b\5\u0084C\2\u0247\u0249\7\25\2\2\u0248\u0247\3"+
		"\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\5\u00aeX\2"+
		"\u024b\u0248\3\2\2\2\u024b\u024c\3\2\2\2\u024c9\3\2\2\2\u024d\u024e\7"+
		"\u00c9\2\2\u024e\u024f\7b\2\2\u024f\u0250\7\u00d0\2\2\u0250\u0254\7\u0172"+
		"\2\2\u0251\u0252\7\u0108\2\2\u0252\u0253\7\u00d1\2\2\u0253\u0255\5`\61"+
		"\2\u0254\u0251\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u027f\3\2\2\2\u0256\u0257"+
		"\7\u00c9\2\2\u0257\u0258\7b\2\2\u0258\u0262\7C\2\2\u0259\u025a\7[\2\2"+
		"\u025a\u025b\7\u00e8\2\2\u025b\u025c\7\35\2\2\u025c\u0260\7\u0172\2\2"+
		"\u025d\u025e\7P\2\2\u025e\u025f\7\35\2\2\u025f\u0261\7\u0172\2\2\u0260"+
		"\u025d\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0259\3\2"+
		"\2\2\u0262\u0263\3\2\2\2\u0263\u0269\3\2\2\2\u0264\u0265\7)\2\2\u0265"+
		"\u0266\7{\2\2\u0266\u0267\7\u00e8\2\2\u0267\u0268\7\35\2\2\u0268\u026a"+
		"\7\u0172\2\2\u0269\u0264\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0270\3\2\2"+
		"\2\u026b\u026c\7\u008e\2\2\u026c\u026d\7}\2\2\u026d\u026e\7\u00e8\2\2"+
		"\u026e\u026f\7\35\2\2\u026f\u0271\7\u0172\2\2\u0270\u026b\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0276\3\2\2\2\u0272\u0273\7\u0085\2\2\u0273\u0274"+
		"\7\u00e8\2\2\u0274\u0275\7\35\2\2\u0275\u0277\7\u0172\2\2\u0276\u0272"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027c\3\2\2\2\u0278\u0279\7\u0098\2"+
		"\2\u0279\u027a\7A\2\2\u027a\u027b\7\25\2\2\u027b\u027d\7\u0172\2\2\u027c"+
		"\u0278\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u024d\3\2"+
		"\2\2\u027e\u0256\3\2\2\2\u027f;\3\2\2\2\u0280\u0281\7\177\2\2\u0281\u0283"+
		"\7\u0103\2\2\u0282\u0284\7\u00a2\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3"+
		"\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\5\u009aN\2\u0286\u028f\7\5\2\2"+
		"\u0287\u028c\5\u0084C\2\u0288\u0289\7\4\2\2\u0289\u028b\5\u0084C\2\u028a"+
		"\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0287\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\7\6\2\2\u0292\u029e\5\u00ae"+
		"X\2\u0293\u0295\7\25\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u029b\5\u00aeX\2\u0297\u0298\7\4\2\2\u0298\u029a"+
		"\5\u00aeX\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2"+
		"\2\u029b\u029c\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u0294"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029f=\3\2\2\2\u02a0\u02a1\7\u0106\2\2\u02a1"+
		"\u02a2\5\u0086D\2\u02a2?\3\2\2\2\u02a3\u02a4\7j\2\2\u02a4\u02a5\7\35\2"+
		"\2\u02a5\u02aa\5B\"\2\u02a6\u02a7\7\4\2\2\u02a7\u02a9\5B\"\2\u02a8\u02a6"+
		"\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02cb\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\7j\2\2\u02ae\u02af\7\35"+
		"\2\2\u02af\u02b4\5\u0084C\2\u02b0\u02b1\7\4\2\2\u02b1\u02b3\5\u0084C\2"+
		"\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\u02c8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8\7\u0108\2"+
		"\2\u02b8\u02c9\7\u00c8\2\2\u02b9\u02ba\7\u0108\2\2\u02ba\u02c9\7\66\2"+
		"\2\u02bb\u02bc\7k\2\2\u02bc\u02bd\7\u00d5\2\2\u02bd\u02be\7\5\2\2\u02be"+
		"\u02c3\5H%\2\u02bf\u02c0\7\4\2\2\u02c0\u02c2\5H%\2\u02c1\u02bf\3\2\2\2"+
		"\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6"+
		"\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\7\6\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02b7\3\2\2\2\u02c8\u02b9\3\2\2\2\u02c8\u02bb\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02a3\3\2\2\2\u02ca\u02ad\3\2\2\2\u02cb"+
		"A\3\2\2\2\u02cc\u02cf\5D#\2\u02cd\u02cf\5\u0084C\2\u02ce\u02cc\3\2\2\2"+
		"\u02ce\u02cd\3\2\2\2\u02cfC\3\2\2\2\u02d0\u02d1\t\5\2\2\u02d1\u02d2\7"+
		"\5\2\2\u02d2\u02d7\5H%\2\u02d3\u02d4\7\4\2\2\u02d4\u02d6\5H%\2\u02d5\u02d3"+
		"\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7\6\2\2\u02db\u02ea\3\2"+
		"\2\2\u02dc\u02dd\7k\2\2\u02dd\u02de\7\u00d5\2\2\u02de\u02df\7\5\2\2\u02df"+
		"\u02e4\5F$\2\u02e0\u02e1\7\4\2\2\u02e1\u02e3\5F$\2\u02e2\u02e0\3\2\2\2"+
		"\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7"+
		"\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e8\7\6\2\2\u02e8\u02ea\3\2\2\2\u02e9"+
		"\u02d0\3\2\2\2\u02e9\u02dc\3\2\2\2\u02eaE\3\2\2\2\u02eb\u02ee\5D#\2\u02ec"+
		"\u02ee\5H%\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2\2\2\u02eeG\3\2\2\2\u02ef"+
		"\u02f8\7\5\2\2\u02f0\u02f5\5\u0084C\2\u02f1\u02f2\7\4\2\2\u02f2\u02f4"+
		"\5\u0084C\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2"+
		"\2\u02f5\u02f6\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f0"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fd\7\6\2\2\u02fb"+
		"\u02fd\5\u0084C\2\u02fc\u02ef\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fdI\3\2\2"+
		"\2\u02fe\u02ff\7l\2\2\u02ff\u0300\5\u0086D\2\u0300K\3\2\2\2\u0301\u0302"+
		"\7\u0107\2\2\u0302\u0307\5N(\2\u0303\u0304\7\4\2\2\u0304\u0306\5N(\2\u0305"+
		"\u0303\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308M\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030b\5h\65\2\u030b\u030c"+
		"\7\25\2\2\u030c\u030d\5\u0094K\2\u030dO\3\2\2\2\u030e\u030f\7\u0105\2"+
		"\2\u030f\u0310\5\u0084C\2\u0310\u0311\7\u00e9\2\2\u0311\u0312\5\u0084"+
		"C\2\u0312Q\3\2\2\2\u0313\u0318\5T+\2\u0314\u0315\7\4\2\2\u0315\u0317\5"+
		"T+\2\u0316\u0314\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319S\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u0320\5h\65\2"+
		"\u031c\u031d\7\7\2\2\u031d\u031f\5h\65\2\u031e\u031c\3\2\2\2\u031f\u0322"+
		"\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321U\3\2\2\2\u0322"+
		"\u0320\3\2\2\2\u0323\u0324\5h\65\2\u0324\u0325\7\7\2\2\u0325\u0327\3\2"+
		"\2\2\u0326\u0323\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0329\5h\65\2\u0329W\3\2\2\2\u032a\u032b\5h\65\2\u032b\u032c\7\7\2\2"+
		"\u032c\u032e\3\2\2\2\u032d\u032a\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0330\5h\65\2\u0330Y\3\2\2\2\u0331\u0336\5\\/\2\u0332\u0333"+
		"\7\4\2\2\u0333\u0335\5\\/\2\u0334\u0332\3\2\2\2\u0335\u0338\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337[\3\2\2\2\u0338\u0336\3\2\2\2"+
		"\u0339\u033a\5h\65\2\u033a\u033d\5\u00a8U\2\u033b\u033c\7\u0097\2\2\u033c"+
		"\u033e\7\u0098\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340"+
		"\3\2\2\2\u033f\u0341\5^\60\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"]\3\2\2\2\u0342\u0343\7,\2\2\u0343\u0344\7\u0172\2\2\u0344_\3\2\2\2\u0345"+
		"\u0346\7\5\2\2\u0346\u034b\5b\62\2\u0347\u0348\7\4\2\2\u0348\u034a\5b"+
		"\62\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f\7\6"+
		"\2\2\u034fa\3\2\2\2\u0350\u0355\5d\63\2\u0351\u0353\7\u0160\2\2\u0352"+
		"\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\5f"+
		"\64\2\u0355\u0352\3\2\2\2\u0355\u0356\3\2\2\2\u0356c\3\2\2\2\u0357\u035c"+
		"\5\u00aeX\2\u0358\u0359\7\7\2\2\u0359\u035b\5\u00aeX\2\u035a\u0358\3\2"+
		"\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"\u0361\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0361\7\u0172\2\2\u0360\u0357"+
		"\3\2\2\2\u0360\u035f\3\2\2\2\u0361e\3\2\2\2\u0362\u0367\7\u0174\2\2\u0363"+
		"\u0367\7\u0175\2\2\u0364\u0367\5\u00a0Q\2\u0365\u0367\7\u0172\2\2\u0366"+
		"\u0362\3\2\2\2\u0366\u0363\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2"+
		"\2\2\u0367g\3\2\2\2\u0368\u0369\5\u00aeX\2\u0369\u036a\5n8\2\u036ai\3"+
		"\2\2\2\u036b\u036c\7\5\2\2\u036c\u036d\5l\67\2\u036d\u036e\7\6\2\2\u036e"+
		"k\3\2\2\2\u036f\u0374\5h\65\2\u0370\u0371\7\4\2\2\u0371\u0373\5h\65\2"+
		"\u0372\u0370\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375"+
		"\3\2\2\2\u0375m\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\7\u0168\2\2\u0378"+
		"\u037a\5\u00aeX\2\u0379\u0377\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0379"+
		"\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037f\3\2\2\2\u037e"+
		"\u0379\3\2\2\2\u037e\u037d\3\2\2\2\u037fo\3\2\2\2\u0380\u0385\5\u009a"+
		"N\2\u0381\u0385\7\\\2\2\u0382\u0385\7\u0082\2\2\u0383\u0385\7\u00c3\2"+
		"\2\u0384\u0380\3\2\2\2\u0384\u0381\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0383"+
		"\3\2\2\2\u0385q\3\2\2\2\u0386\u0388\7\25\2\2\u0387\u0386\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\5\u00aeX\2\u038a\u038c"+
		"\5j\66\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d"+
		"\u0387\3\2\2\2\u038d\u038e\3\2\2\2\u038es\3\2\2\2\u038f\u0390\5v<\2\u0390"+
		"\u0391\7|\2\2\u0391\u0393\5,\27\2\u0392\u0394\5x=\2\u0393\u0392\3\2\2"+
		"\2\u0393\u0394\3\2\2\2\u0394\u039b\3\2\2\2\u0395\u0396\7\u0095\2\2\u0396"+
		"\u0397\5v<\2\u0397\u0398\7|\2\2\u0398\u0399\5,\27\2\u0399\u039b\3\2\2"+
		"\2\u039a\u038f\3\2\2\2\u039a\u0395\3\2\2\2\u039bu\3\2\2\2\u039c\u039e"+
		"\7s\2\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03b5\3\2\2\2\u039f"+
		"\u03b5\7\65\2\2\u03a0\u03a2\7\u0082\2\2\u03a1\u03a3\7\u00a2\2\2\u03a2"+
		"\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03b5\3\2\2\2\u03a4\u03a6\7\u0082"+
		"\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03b5\7\u00ce\2\2\u03a8\u03aa\7\u00c3\2\2\u03a9\u03ab\7\u00a2\2\2\u03aa"+
		"\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03b5\3\2\2\2\u03ac\u03ae\7e"+
		"\2\2\u03ad\u03af\7\u00a2\2\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03b5\3\2\2\2\u03b0\u03b2\7\u0082\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2"+
		"\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\7\21\2\2\u03b4\u039d\3\2\2\2"+
		"\u03b4\u039f\3\2\2\2\u03b4\u03a0\3\2\2\2\u03b4\u03a5\3\2\2\2\u03b4\u03a8"+
		"\3\2\2\2\u03b4\u03ac\3\2\2\2\u03b4\u03b1\3\2\2\2\u03b5w\3\2\2\2\u03b6"+
		"\u03b7\7\u009b\2\2\u03b7\u03bb\5\u0086D\2\u03b8\u03b9\7\u0101\2\2\u03b9"+
		"\u03bb\5j\66\2\u03ba\u03b6\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bby\3\2\2\2"+
		"\u03bc\u03be\5\u00aeX\2\u03bd\u03bf\5|?\2\u03be\u03bd\3\2\2\2\u03be\u03bf"+
		"\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\7\25\2\2\u03c1\u03c2\7\5\2\2"+
		"\u03c2\u03c3\5\22\n\2\u03c3\u03c4\7\6\2\2\u03c4{\3\2\2\2\u03c5\u03c6\7"+
		"\5\2\2\u03c6\u03cb\5\u00aeX\2\u03c7\u03c8\7\4\2\2\u03c8\u03ca\5\u00ae"+
		"X\2\u03c9\u03c7\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03cf\7\6"+
		"\2\2\u03cf}\3\2\2\2\u03d0\u03d5\5\u0080A\2\u03d1\u03d2\7\4\2\2\u03d2\u03d4"+
		"\5\u0080A\2\u03d3\u03d1\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2"+
		"\2\u03d5\u03d6\3\2\2\2\u03d6\177\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03e0"+
		"\5\u0084C\2\u03d9\u03db\7\25\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2"+
		"\2\u03db\u03de\3\2\2\2\u03dc\u03df\5h\65\2\u03dd\u03df\5j\66\2\u03de\u03dc"+
		"\3\2\2\2\u03de\u03dd\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03da\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u0081\3\2\2\2\u03e2\u03e7\5\u0084C\2\u03e3\u03e4"+
		"\7\4\2\2\u03e4\u03e6\5\u0084C\2\u03e5\u03e3\3\2\2\2\u03e6\u03e9\3\2\2"+
		"\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u0083\3\2\2\2\u03e9\u03e7"+
		"\3\2\2\2\u03ea\u03eb\5\u0086D\2\u03eb\u0085\3\2\2\2\u03ec\u03ed\bD\1\2"+
		"\u03ed\u03ef\5\u008cG\2\u03ee\u03f0\5\u008aF\2\u03ef\u03ee\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u03f9\3\2\2\2\u03f1\u03f2\7\u0097\2\2\u03f2\u03f9"+
		"\5\u0086D\6\u03f3\u03f4\7S\2\2\u03f4\u03f5\7\5\2\2\u03f5\u03f6\5\22\n"+
		"\2\u03f6\u03f7\7\6\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03ec\3\2\2\2\u03f8\u03f1"+
		"\3\2\2\2\u03f8\u03f3\3\2\2\2\u03f9\u0402\3\2\2\2\u03fa\u03fb\f\4\2\2\u03fb"+
		"\u03fc\7\20\2\2\u03fc\u0401\5\u0086D\5\u03fd\u03fe\f\3\2\2\u03fe\u03ff"+
		"\7\u009f\2\2\u03ff\u0401\5\u0086D\4\u0400\u03fa\3\2\2\2\u0400\u03fd\3"+
		"\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u0087\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0407\5\u0084C\2\u0406\u0408"+
		"\t\6\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040b\3\2\2\2\u0409"+
		"\u040a\7\u0099\2\2\u040a\u040c\t\7\2\2\u040b\u0409\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u0089\3\2\2\2\u040d\u040f\7\u0097\2\2\u040e\u040d\3\2\2"+
		"\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7\31\2\2\u0411"+
		"\u0412\5\u008cG\2\u0412\u0413\7\20\2\2\u0413\u0414\5\u008cG\2\u0414\u0460"+
		"\3\2\2\2\u0415\u0417\7\u0097\2\2\u0416\u0415\3\2\2\2\u0416\u0417\3\2\2"+
		"\2\u0417\u0418\3\2\2\2\u0418\u0419\7p\2\2\u0419\u041a\7\5\2\2\u041a\u041f"+
		"\5\u0084C\2\u041b\u041c\7\4\2\2\u041c\u041e\5\u0084C\2\u041d\u041b\3\2"+
		"\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
		"\u0422\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0423\7\6\2\2\u0423\u0460\3\2"+
		"\2\2\u0424\u0426\7\u0097\2\2\u0425\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u0428\7p\2\2\u0428\u0429\7\5\2\2\u0429\u042a\5\22"+
		"\n\2\u042a\u042b\7\6\2\2\u042b\u0460\3\2\2\2\u042c\u042e\7\u0097\2\2\u042d"+
		"\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\7\u00c4"+
		"\2\2\u0430\u0460\5\u008cG\2\u0431\u0433\7\u0097\2\2\u0432\u0431\3\2\2"+
		"\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\7\u0083\2\2\u0435"+
		"\u0443\t\b\2\2\u0436\u0437\7\5\2\2\u0437\u0444\7\6\2\2\u0438\u0439\7\5"+
		"\2\2\u0439\u043e\5\u0084C\2\u043a\u043b\7\4\2\2\u043b\u043d\5\u0084C\2"+
		"\u043c\u043a\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f"+
		"\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u043e\3\2\2\2\u0441\u0442\7\6\2\2\u0442"+
		"\u0444\3\2\2\2\u0443\u0436\3\2\2\2\u0443\u0438\3\2\2\2\u0444\u0460\3\2"+
		"\2\2\u0445\u0447\7\u0097\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u0449\7\u0083\2\2\u0449\u044c\5\u008cG\2\u044a\u044b"+
		"\7O\2\2\u044b\u044d\7\u0172\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2"+
		"\2\u044d\u0460\3\2\2\2\u044e\u0450\7z\2\2\u044f\u0451\7\u0097\2\2\u0450"+
		"\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0460\7\u0098"+
		"\2\2\u0453\u0455\7z\2\2\u0454\u0456\7\u0097\2\2\u0455\u0454\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0460\t\t\2\2\u0458\u045a\7z"+
		"\2\2\u0459\u045b\7\u0097\2\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045d\7I\2\2\u045d\u045e\7d\2\2\u045e\u0460\5\u008c"+
		"G\2\u045f\u040e\3\2\2\2\u045f\u0416\3\2\2\2\u045f\u0425\3\2\2\2\u045f"+
		"\u042d\3\2\2\2\u045f\u0432\3\2\2\2\u045f\u0446\3\2\2\2\u045f\u044e\3\2"+
		"\2\2\u045f\u0453\3\2\2\2\u045f\u0458\3\2\2\2\u0460\u008b\3\2\2\2\u0461"+
		"\u0462\bG\1\2\u0462\u0466\5\u008eH\2\u0463\u0464\t\n\2\2\u0464\u0466\5"+
		"\u008cG\t\u0465\u0461\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u047c\3\2\2\2"+
		"\u0467\u0468\f\b\2\2\u0468\u0469\t\13\2\2\u0469\u047b\5\u008cG\t\u046a"+
		"\u046b\f\7\2\2\u046b\u046c\t\f\2\2\u046c\u047b\5\u008cG\b\u046d\u046e"+
		"\f\6\2\2\u046e\u046f\7\u016d\2\2\u046f\u047b\5\u008cG\7\u0470\u0471\f"+
		"\5\2\2\u0471\u0472\7\u0170\2\2\u0472\u047b\5\u008cG\6\u0473\u0474\f\4"+
		"\2\2\u0474\u0475\7\u016e\2\2\u0475\u047b\5\u008cG\5\u0476\u0477\f\3\2"+
		"\2\u0477\u0478\5\u00b0Y\2\u0478\u0479\5\u008cG\4\u0479\u047b\3\2\2\2\u047a"+
		"\u0467\3\2\2\2\u047a\u046a\3\2\2\2\u047a\u046d\3\2\2\2\u047a\u0470\3\2"+
		"\2\2\u047a\u0473\3\2\2\2\u047a\u0476\3\2\2\2\u047b\u047e\3\2\2\2\u047c"+
		"\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u008d\3\2\2\2\u047e\u047c\3\2"+
		"\2\2\u047f\u0480\bH\1\2\u0480\u0577\t\r\2\2\u0481\u0482\7 \2\2\u0482\u0484"+
		"\5\u0084C\2\u0483\u0485\5P)\2\u0484\u0483\3\2\2\2\u0485\u0486\3\2\2\2"+
		"\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0489"+
		"\7M\2\2\u0489\u048b\5\u0084C\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2"+
		"\u048b\u048c\3\2\2\2\u048c\u048d\7N\2\2\u048d\u0577\3\2\2\2\u048e\u0490"+
		"\7 \2\2\u048f\u0491\5P)\2\u0490\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492"+
		"\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0495\7M"+
		"\2\2\u0495\u0497\5\u0084C\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u0498\3\2\2\2\u0498\u0499\7N\2\2\u0499\u0577\3\2\2\2\u049a\u049b\7!\2"+
		"\2\u049b\u049c\7\5\2\2\u049c\u049d\5\u0084C\2\u049d\u049e\7\25\2\2\u049e"+
		"\u049f\5\u00a8U\2\u049f\u04a0\7\6\2\2\u04a0\u0577\3\2\2\2\u04a1\u04a2"+
		"\7\u00f4\2\2\u04a2\u04a3\7\5\2\2\u04a3\u04a4\5\u0084C\2\u04a4\u04a5\7"+
		"\25\2\2\u04a5\u04a6\5\u00a8U\2\u04a6\u04a7\7\6\2\2\u04a7\u0577\3\2\2\2"+
		"\u04a8\u04a9\7^\2\2\u04a9\u04aa\7\5\2\2\u04aa\u04ad\5\u0084C\2\u04ab\u04ac"+
		"\7n\2\2\u04ac\u04ae\7\u0099\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2"+
		"\2\u04ae\u04af\3\2\2\2\u04af\u04b0\7\6\2\2\u04b0\u0577\3\2\2\2\u04b1\u04b2"+
		"\7~\2\2\u04b2\u04b3\7\5\2\2\u04b3\u04b6\5\u0084C\2\u04b4\u04b5\7n\2\2"+
		"\u04b5\u04b7\7\u0099\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04b8\3\2\2\2\u04b8\u04b9\7\6\2\2\u04b9\u0577\3\2\2\2\u04ba\u04bb\7\u00ae"+
		"\2\2\u04bb\u04bc\7\5\2\2\u04bc\u04bd\5\u008cG\2\u04bd\u04be\7p\2\2\u04be"+
		"\u04bf\5\u008cG\2\u04bf\u04c0\7\6\2\2\u04c0\u0577\3\2\2\2\u04c1\u0577"+
		"\5\u0090I\2\u04c2\u04c3\5\u009aN\2\u04c3\u04c4\7\7\2\2\u04c4\u04c5\7\u0169"+
		"\2\2\u04c5\u0577\3\2\2\2\u04c6\u0577\7\u0169\2\2\u04c7\u04c8\7\5\2\2\u04c8"+
		"\u04cb\5\u0084C\2\u04c9\u04ca\7\4\2\2\u04ca\u04cc\5\u0084C\2\u04cb\u04c9"+
		"\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04d0\7\6\2\2\u04d0\u0577\3\2\2\2\u04d1\u04d2\7\u00c9"+
		"\2\2\u04d2\u04d3\7\5\2\2\u04d3\u04d8\5\u0084C\2\u04d4\u04d5\7\4\2\2\u04d5"+
		"\u04d7\5\u0084C\2\u04d6\u04d4\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6"+
		"\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04d8\3\2\2\2\u04db"+
		"\u04dc\7\6\2\2\u04dc\u0577\3\2\2\2\u04dd\u04de\7\5\2\2\u04de\u04df\5\22"+
		"\n\2\u04df\u04e0\7\6\2\2\u04e0\u0577\3\2\2\2\u04e1\u04e2\5p9\2\u04e2\u04e3"+
		"\7\5\2\2\u04e3\u04e4\7\u0169\2\2\u04e4\u04eb\7\6\2\2\u04e5\u04e6\7\\\2"+
		"\2\u04e6\u04e7\7\5\2\2\u04e7\u04e8\7\u0106\2\2\u04e8\u04e9\5\u0086D\2"+
		"\u04e9\u04ea\7\6\2\2\u04ea\u04ec\3\2\2\2\u04eb\u04e5\3\2\2\2\u04eb\u04ec"+
		"\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04ee\7\u00a4\2\2\u04ee\u04f0\5\u0094"+
		"K\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u0577\3\2\2\2\u04f1"+
		"\u04f2\5p9\2\u04f2\u04fe\7\5\2\2\u04f3\u04f5\5\u0092J\2\u04f4\u04f3\3"+
		"\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04fb\5\u0084C\2"+
		"\u04f7\u04f8\7\4\2\2\u04f8\u04fa\5\u0084C\2\u04f9\u04f7\3\2\2\2\u04fa"+
		"\u04fd\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04ff\3\2"+
		"\2\2\u04fd\u04fb\3\2\2\2\u04fe\u04f4\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0506\3\2\2\2\u0500\u0501\7\\\2\2\u0501\u0502\7\5\2\2\u0502\u0503\7\u0106"+
		"\2\2\u0503\u0504\5\u0086D\2\u0504\u0505\7\6\2\2\u0505\u0507\3\2\2\2\u0506"+
		"\u0500\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0509\t\16"+
		"\2\2\u0509\u050b\7\u0099\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u050e\3\2\2\2\u050c\u050d\7\u00a4\2\2\u050d\u050f\5\u0094K\2\u050e\u050c"+
		"\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0577\3\2\2\2\u0510\u0511\5\u00aeX"+
		"\2\u0511\u0512\7\b\2\2\u0512\u0513\5\u0084C\2\u0513\u0577\3\2\2\2\u0514"+
		"\u051d\7\5\2\2\u0515\u051a\5\u00aeX\2\u0516\u0517\7\4\2\2\u0517\u0519"+
		"\5\u00aeX\2\u0518\u0516\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2"+
		"\2\u051a\u051b\3\2\2\2\u051b\u051e\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u0515"+
		"\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\7\6\2\2\u0520"+
		"\u0521\7\b\2\2\u0521\u0577\5\u0084C\2\u0522\u0577\5\u00aeX\2\u0523\u0524"+
		"\7\5\2\2\u0524\u0525\5\u0084C\2\u0525\u0526\7\6\2\2\u0526\u0577\3\2\2"+
		"\2\u0527\u0528\7X\2\2\u0528\u0529\7\5\2\2\u0529\u052a\5\u00aeX\2\u052a"+
		"\u052b\7d\2\2\u052b\u052c\5\u008cG\2\u052c\u052d\7\6\2\2\u052d\u0577\3"+
		"\2\2\2\u052e\u052f\t\17\2\2\u052f\u0530\7\5\2\2\u0530\u0531\5\u008cG\2"+
		"\u0531\u0532\t\20\2\2\u0532\u0535\5\u008cG\2\u0533\u0534\t\21\2\2\u0534"+
		"\u0536\5\u008cG\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537"+
		"\3\2\2\2\u0537\u0538\7\6\2\2\u0538\u0577\3\2\2\2\u0539\u053a\7\u00f1\2"+
		"\2\u053a\u053c\7\5\2\2\u053b\u053d\t\22\2\2\u053c\u053b\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u0540\5\u008cG\2\u053f\u053e"+
		"\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\7d\2\2\u0542"+
		"\u0543\5\u008cG\2\u0543\u0544\7\6\2\2\u0544\u0577\3\2\2\2\u0545\u0546"+
		"\7\u00a6\2\2\u0546\u0547\7\5\2\2\u0547\u0548\5\u008cG\2\u0548\u0549\7"+
		"\u00ad\2\2\u0549\u054a\5\u008cG\2\u054a\u054b\7d\2\2\u054b\u054e\5\u008c"+
		"G\2\u054c\u054d\7`\2\2\u054d\u054f\5\u008cG\2\u054e\u054c\3\2\2\2\u054e"+
		"\u054f\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\7\6\2\2\u0551\u0577\3\2"+
		"\2\2\u0552\u0577\7\u0171\2\2\u0553\u0554\7\24\2\2\u0554\u055d\7\t\2\2"+
		"\u0555\u055a\5\u0084C\2\u0556\u0557\7\4\2\2\u0557\u0559\5\u0084C\2\u0558"+
		"\u0556\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2"+
		"\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u0555\3\2\2\2\u055d"+
		"\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0577\7\n\2\2\u0560\u0561\7\u0139"+
		"\2\2\u0561\u0562\7\5\2\2\u0562\u0565\5\u008cG\2\u0563\u0564\7\4\2\2\u0564"+
		"\u0566\5\u00a6T\2\u0565\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567"+
		"\3\2\2\2\u0567\u0568\7\6\2\2\u0568\u0577\3\2\2\2\u0569\u056a\7k\2\2\u056a"+
		"\u0573\7\5\2\2\u056b\u0570\5\u009aN\2\u056c\u056d\7\4\2\2\u056d\u056f"+
		"\5\u009aN\2\u056e\u056c\3\2\2\2\u056f\u0572\3\2\2\2\u0570\u056e\3\2\2"+
		"\2\u0570\u0571\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570\3\2\2\2\u0573\u056b"+
		"\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\7\6\2\2\u0576"+
		"\u047f\3\2\2\2\u0576\u0481\3\2\2\2\u0576\u048e\3\2\2\2\u0576\u049a\3\2"+
		"\2\2\u0576\u04a1\3\2\2\2\u0576\u04a8\3\2\2\2\u0576\u04b1\3\2\2\2\u0576"+
		"\u04ba\3\2\2\2\u0576\u04c1\3\2\2\2\u0576\u04c2\3\2\2\2\u0576\u04c6\3\2"+
		"\2\2\u0576\u04c7\3\2\2\2\u0576\u04d1\3\2\2\2\u0576\u04dd\3\2\2\2\u0576"+
		"\u04e1\3\2\2\2\u0576\u04f1\3\2\2\2\u0576\u0510\3\2\2\2\u0576\u0514\3\2"+
		"\2\2\u0576\u0522\3\2\2\2\u0576\u0523\3\2\2\2\u0576\u0527\3\2\2\2\u0576"+
		"\u052e\3\2\2\2\u0576\u0539\3\2\2\2\u0576\u0545\3\2\2\2\u0576\u0552\3\2"+
		"\2\2\u0576\u0553\3\2\2\2\u0576\u0560\3\2\2\2\u0576\u0569\3\2\2\2\u0577"+
		"\u0582\3\2\2\2\u0578\u0579\f\16\2\2\u0579\u057a\7\t\2\2\u057a\u057b\5"+
		"\u008cG\2\u057b\u057c\7\n\2\2\u057c\u0581\3\2\2\2\u057d\u057e\f\f\2\2"+
		"\u057e\u057f\7\7\2\2\u057f\u0581\5\u00aeX\2\u0580\u0578\3\2\2\2\u0580"+
		"\u057d\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2"+
		"\2\2\u0583\u008f\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u058e\7\u0098\2\2\u0586"+
		"\u058e\5\u00a2R\2\u0587\u0588\5\u00aeX\2\u0588\u0589\5\u009cO\2\u0589"+
		"\u058e\3\2\2\2\u058a\u058e\5\u009eP\2\u058b\u058e\5\u00a0Q\2\u058c\u058e"+
		"\5\u009cO\2\u058d\u0585\3\2\2\2\u058d\u0586\3\2\2\2\u058d\u0587\3\2\2"+
		"\2\u058d\u058a\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058c\3\2\2\2\u058e\u0091"+
		"\3\2\2\2\u058f\u0590\t\23\2\2\u0590\u0093\3\2\2\2\u0591\u05c0\5h\65\2"+
		"\u0592\u0593\7\5\2\2\u0593\u0594\5h\65\2\u0594\u0595\7\6\2\2\u0595\u05c0"+
		"\3\2\2\2\u0596\u05b9\7\5\2\2\u0597\u0598\7%\2\2\u0598\u0599\7\35\2\2\u0599"+
		"\u059e\5\u0084C\2\u059a\u059b\7\4\2\2\u059b\u059d\5\u0084C\2\u059c\u059a"+
		"\3\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f"+
		"\u05ba\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u05a2\t\24\2\2\u05a2\u05a3\7"+
		"\35\2\2\u05a3\u05a8\5\u0084C\2\u05a4\u05a5\7\4\2\2\u05a5\u05a7\5\u0084"+
		"C\2\u05a6\u05a4\3\2\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8"+
		"\u05a9\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05a1\3\2"+
		"\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05b7\3\2\2\2\u05ad\u05ae\t\25\2\2\u05ae"+
		"\u05af\7\35\2\2\u05af\u05b4\5\u0088E\2\u05b0\u05b1\7\4\2\2\u05b1\u05b3"+
		"\5\u0088E\2\u05b2\u05b0\3\2\2\2\u05b3\u05b6\3\2\2\2\u05b4\u05b2\3\2\2"+
		"\2\u05b4\u05b5\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b7\u05ad"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u0597\3\2\2\2\u05b9"+
		"\u05ab\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05bd\5\u0096L\2\u05bc\u05bb"+
		"\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05c0\7\6\2\2\u05bf"+
		"\u0591\3\2\2\2\u05bf\u0592\3\2\2\2\u05bf\u0596\3\2\2\2\u05c0\u0095\3\2"+
		"\2\2\u05c1\u05c2\7\u00b5\2\2\u05c2\u05d2\5\u0098M\2\u05c3\u05c4\7\u00ca"+
		"\2\2\u05c4\u05d2\5\u0098M\2\u05c5\u05c6\7\u00b5\2\2\u05c6\u05c7\7\31\2"+
		"\2\u05c7\u05c8\5\u0098M\2\u05c8\u05c9\7\20\2\2\u05c9\u05ca\5\u0098M\2"+
		"\u05ca\u05d2\3\2\2\2\u05cb\u05cc\7\u00ca\2\2\u05cc\u05cd\7\31\2\2\u05cd"+
		"\u05ce\5\u0098M\2\u05ce\u05cf\7\20\2\2\u05cf\u05d0\5\u0098M\2\u05d0\u05d2"+
		"\3\2\2\2\u05d1\u05c1\3\2\2\2\u05d1\u05c3\3\2\2\2\u05d1\u05c5\3\2\2\2\u05d1"+
		"\u05cb\3\2\2\2\u05d2\u0097\3\2\2\2\u05d3\u05d4\7\u00f7\2\2\u05d4\u05db"+
		"\t\26\2\2\u05d5\u05d6\7\67\2\2\u05d6\u05db\7\u00c9\2\2\u05d7\u05d8\5\u0084"+
		"C\2\u05d8\u05d9\t\26\2\2\u05d9\u05db\3\2\2\2\u05da\u05d3\3\2\2\2\u05da"+
		"\u05d5\3\2\2\2\u05da\u05d7\3\2\2\2\u05db\u0099\3\2\2\2\u05dc\u05e1\5\u00ae"+
		"X\2\u05dd\u05de\7\7\2\2\u05de\u05e0\5\u00aeX\2\u05df\u05dd\3\2\2\2\u05e0"+
		"\u05e3\3\2\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u009b\3\2"+
		"\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05eb\7\u0172\2\2\u05e5\u05e8\7\u0173\2"+
		"\2\u05e6\u05e7\7\u0157\2\2\u05e7\u05e9\7\u0172\2\2\u05e8\u05e6\3\2\2\2"+
		"\u05e8\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05e4\3\2\2\2\u05ea\u05e5"+
		"\3\2\2\2\u05eb\u009d\3\2\2\2\u05ec\u05ee\7\u0168\2\2\u05ed\u05ec\3\2\2"+
		"\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f9\7\u0175\2\2\u05f0"+
		"\u05f2\7\u0168\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3"+
		"\3\2\2\2\u05f3\u05f9\7\u0176\2\2\u05f4\u05f6\7\u0168\2\2\u05f5\u05f4\3"+
		"\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\7\u0174\2\2"+
		"\u05f8\u05ed\3\2\2\2\u05f8\u05f1\3\2\2\2\u05f8\u05f5\3\2\2\2\u05f9\u009f"+
		"\3\2\2\2\u05fa\u05fb\t\27\2\2\u05fb\u00a1\3\2\2\2\u05fc\u05fe\7x\2\2\u05fd"+
		"\u05ff\t\30\2\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\3"+
		"\2\2\2\u0600\u0601\5\u009cO\2\u0601\u0604\5\u00a4S\2\u0602\u0603\7\u00eb"+
		"\2\2\u0603\u0605\5\u00a4S\2\u0604\u0602\3\2\2\2\u0604\u0605\3\2\2\2\u0605"+
		"\u00a3\3\2\2\2\u0606\u0607\t\31\2\2\u0607\u00a5\3\2\2\2\u0608\u0609\t"+
		"\32\2\2\u0609\u00a7\3\2\2\2\u060a\u060b\bU\1\2\u060b\u060c\7\u00c9\2\2"+
		"\u060c\u060d\7\5\2\2\u060d\u0612\5\u00aaV\2\u060e\u060f\7\4\2\2\u060f"+
		"\u0611\5\u00aaV\2\u0610\u060e\3\2\2\2\u0611\u0614\3\2\2\2\u0612\u0610"+
		"\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\3\2\2\2\u0614\u0612\3\2\2\2\u0615"+
		"\u0616\7\6\2\2\u0616\u0664\3\2\2\2\u0617\u0618\7x\2\2\u0618\u061b\5\u00a4"+
		"S\2\u0619\u061a\7\u00eb\2\2\u061a\u061c\5\u00a4S\2\u061b\u0619\3\2\2\2"+
		"\u061b\u061c\3\2\2\2\u061c\u0664\3\2\2\2\u061d\u0622\7\u0156\2\2\u061e"+
		"\u061f\7\5\2\2\u061f\u0620\5\u00acW\2\u0620\u0621\7\6\2\2\u0621\u0623"+
		"\3\2\2\2\u0622\u061e\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0627\3\2\2\2\u0624"+
		"\u0625\7\u015d\2\2\u0625\u0626\7\u00ea\2\2\u0626\u0628\7\u010a\2\2\u0627"+
		"\u0624\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0664\3\2\2\2\u0629\u062e\7\u0156"+
		"\2\2\u062a\u062b\7\5\2\2\u062b\u062c\5\u00acW\2\u062c\u062d\7\6\2\2\u062d"+
		"\u062f\3\2\2\2\u062e\u062a\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630\3\2"+
		"\2\2\u0630\u0631\7\u0108\2\2\u0631\u0632\7\u00ea\2\2\u0632\u0664\7\u010a"+
		"\2\2\u0633\u0638\7\u00ea\2\2\u0634\u0635\7\5\2\2\u0635\u0636\5\u00acW"+
		"\2\u0636\u0637\7\6\2\2\u0637\u0639\3\2\2\2\u0638\u0634\3\2\2\2\u0638\u0639"+
		"\3\2\2\2\u0639\u063d\3\2\2\2\u063a\u063b\7\u015d\2\2\u063b\u063c\7\u00ea"+
		"\2\2\u063c\u063e\7\u010a\2\2\u063d\u063a\3\2\2\2\u063d\u063e\3\2\2\2\u063e"+
		"\u0664\3\2\2\2\u063f\u0644\7\u00ea\2\2\u0640\u0641\7\5\2\2\u0641\u0642"+
		"\5\u00acW\2\u0642\u0643\7\6\2\2\u0643\u0645\3\2\2\2\u0644\u0640\3\2\2"+
		"\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\7\u0108\2\2\u0647"+
		"\u0648\7\u00ea\2\2\u0648\u0664\7\u010a\2\2\u0649\u064a\7\24\2\2\u064a"+
		"\u064b\7\u0163\2\2\u064b\u064c\5\u00a8U\2\u064c\u064d\7\u0165\2\2\u064d"+
		"\u0664\3\2\2\2\u064e\u064f\7\u008e\2\2\u064f\u0650\7\u0163\2\2\u0650\u0651"+
		"\5\u00a8U\2\u0651\u0652\7\4\2\2\u0652\u0653\5\u00a8U\2\u0653\u0654\7\u0165"+
		"\2\2\u0654\u0664\3\2\2\2\u0655\u0661\5\u00aeX\2\u0656\u0657\7\5\2\2\u0657"+
		"\u065c\5\u00acW\2\u0658\u0659\7\4\2\2\u0659\u065b\5\u00acW\2\u065a\u0658"+
		"\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d"+
		"\u065f\3\2\2\2\u065e\u065c\3\2\2\2\u065f\u0660\7\6\2\2\u0660\u0662\3\2"+
		"\2\2\u0661\u0656\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0664\3\2\2\2\u0663"+
		"\u060a\3\2\2\2\u0663\u0617\3\2\2\2\u0663\u061d\3\2\2\2\u0663\u0629\3\2"+
		"\2\2\u0663\u0633\3\2\2\2\u0663\u063f\3\2\2\2\u0663\u0649\3\2\2\2\u0663"+
		"\u064e\3\2\2\2\u0663\u0655\3\2\2\2\u0664\u066e\3\2\2\2\u0665\u0666\f\4"+
		"\2\2\u0666\u066a\7\24\2\2\u0667\u0668\7\t\2\2\u0668\u0669\7\u0174\2\2"+
		"\u0669\u066b\7\n\2\2\u066a\u0667\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066d"+
		"\3\2\2\2\u066c\u0665\3\2\2\2\u066d\u0670\3\2\2\2\u066e\u066c\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u00a9\3\2\2\2\u0670\u066e\3\2\2\2\u0671\u0676\5\u00a8"+
		"U\2\u0672\u0673\5\u00aeX\2\u0673\u0674\5\u00a8U\2\u0674\u0676\3\2\2\2"+
		"\u0675\u0671\3\2\2\2\u0675\u0672\3\2\2\2\u0676\u00ab\3\2\2\2\u0677\u067a"+
		"\7\u0174\2\2\u0678\u067a\5\u00a8U\2\u0679\u0677\3\2\2\2\u0679\u0678\3"+
		"\2\2\2\u067a\u00ad\3\2\2\2\u067b\u0680\7\u0177\2\2\u067c\u0680\7\u0178"+
		"\2\2\u067d\u0680\5\u00b2Z\2\u067e\u0680\7\u0179\2\2\u067f\u067b\3\2\2"+
		"\2\u067f\u067c\3\2\2\2\u067f\u067d\3\2\2\2\u067f\u067e\3\2\2\2\u0680\u00af"+
		"\3\2\2\2\u0681\u0682\t\33\2\2\u0682\u00b1\3\2\2\2\u0683\u0684\t\34\2\2"+
		"\u0684\u00b3\3\2\2\2\u00e2\u00b8\u00d2\u00dd\u00e6\u00eb\u00f5\u00f8\u0101"+
		"\u0104\u010d\u0110\u0119\u011c\u011f\u0123\u012e\u0132\u0137\u013b\u013e"+
		"\u0141\u0144\u0148\u014d\u0151\u0154\u0157\u015a\u015c\u0162\u0166\u016e"+
		"\u0172\u0175\u0178\u017b\u017f\u0187\u018e\u0195\u019a\u019d\u01a0\u01a4"+
		"\u01ae\u01b2\u01b4\u01b7\u01bb\u01bf\u01c9\u01cf\u01d3\u01d9\u01de\u01e6"+
		"\u01ee\u01f4\u01fd\u0200\u0208\u020d\u021f\u0221\u0224\u0232\u023f\u0244"+
		"\u0248\u024b\u0254\u0260\u0262\u0269\u0270\u0276\u027c\u027e\u0283\u028c"+
		"\u028f\u0294\u029b\u029e\u02aa\u02b4\u02c3\u02c8\u02ca\u02ce\u02d7\u02e4"+
		"\u02e9\u02ed\u02f5\u02f8\u02fc\u0307\u0318\u0320\u0326\u032d\u0336\u033d"+
		"\u0340\u034b\u0352\u0355\u035c\u0360\u0366\u0374\u037b\u037e\u0384\u0387"+
		"\u038b\u038d\u0393\u039a\u039d\u03a2\u03a5\u03aa\u03ae\u03b1\u03b4\u03ba"+
		"\u03be\u03cb\u03d5\u03da\u03de\u03e0\u03e7\u03ef\u03f8\u0400\u0402\u0407"+
		"\u040b\u040e\u0416\u041f\u0425\u042d\u0432\u043e\u0443\u0446\u044c\u0450"+
		"\u0455\u045a\u045f\u0465\u047a\u047c\u0486\u048a\u0492\u0496\u04ad\u04b6"+
		"\u04cd\u04d8\u04eb\u04ef\u04f4\u04fb\u04fe\u0506\u050a\u050e\u051a\u051d"+
		"\u0535\u053c\u053f\u054e\u055a\u055d\u0565\u0570\u0573\u0576\u0580\u0582"+
		"\u058d\u059e\u05a8\u05ab\u05b4\u05b7\u05b9\u05bc\u05bf\u05d1\u05da\u05e1"+
		"\u05e8\u05ea\u05ed\u05f1\u05f5\u05f8\u05fe\u0604\u0612\u061b\u0622\u0627"+
		"\u062e\u0638\u063d\u0644\u065c\u0661\u0663\u066a\u066e\u0675\u0679\u067f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}