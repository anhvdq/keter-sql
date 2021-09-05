grammar SqlBase;

@lexer::members {
  /**
   * This method will be called when we see '/*' and try to match it as a bracketed comment.
   * If the next character is '+', it should be parsed as hint later, and we cannot match
   * it as a bracketed comment.
   *
   * Returns true if the next character is '+'.
   */
  public boolean isHint() {
    int nextChar = _input.LA(1);
    if (nextChar == '+') {
      return true;
    } else {
      return false;
    }
  }
}

tokens {
    DELIMITER
}

singleStatement
    : statement ';'* EOF
    ;

singleExpression
    : namedExpression EOF
    ;

singleTableIdentifier
    : tableIdentifier EOF
    ;

singleMultipartIdentifier
    : multipartIdentifier EOF
    ;

singleFunctionIdentifier
    : functionIdentifier EOF
    ;

singleDataType
    : dataType EOF
    ;

singleTableSchema
    : colTypeList EOF
    ;

statement
    : query
    ;

query
    : ctes? queryTerm queryOrganization
    ;

ctes
    : WITH namedQuery (',' namedQuery)*
    ;

queryTerm
    : queryPrimary                                                                       #queryTermDefault    
    | left=queryTerm 
        operator=(UNION | EXCEPT | SETMINUS | INTERSECT) 
        setQuantifier? right=queryTerm                                                   #setOperation
    ;

queryOrganization
    : (ORDER BY order+=sortItem (',' order+=sortItem)*)?
      (CLUSTER BY clusterBy+=expression (',' clusterBy+=expression)*)?
      (DISTRIBUTE BY distributeBy+=expression (',' distributeBy+=expression)*)?
      (SORT BY sort+=sortItem (',' sort+=sortItem)*)?
      windowClause?
      (LIMIT (ALL | INTEGER_VALUE | QUESTION_MARK))?
    ;

sortItem
    : expression ordering=(ASC | DESC)? (NULLS nullOrdering=(FIRST | LAST))?
    ;

queryPrimary
    : querySpecification                   #queryPrimaryDefault
    | fromStatement                        #fromStmt
    | TABLE multipartIdentifier            #table
    | inlineTable                          #inlineTableDefault
    | '(' query ')'                        #subquery
    ;

querySpecification
    : transformClause
      fromClause?
      lateralView*
      whereClause?
      aggregationClause?
      havingClause?
      windowClause?                                                         #transformQuerySpecification
    | selectClause
      fromClause?
      lateralView*
      whereClause?
      aggregationClause?
      havingClause?
      windowClause?                                                         #regularQuerySpecification
    ;

fromStatement
    : fromClause fromStatementBody+
    ;

fromStatementBody
    : transformClause
      whereClause?
      queryOrganization
    | selectClause
      lateralView*
      whereClause?
      aggregationClause?
      havingClause?
      windowClause?
      queryOrganization
    ;

inlineTable
    : VALUES expression (',' expression)*
    ;

transformClause
    : (SELECT kind=TRANSFORM '(' setQuantifier? expressionSeq ')'
            | kind=MAP setQuantifier? expressionSeq
            | kind=REDUCE setQuantifier? expressionSeq)
      inRowFormat=rowFormat?
      (RECORDWRITER recordWriter=STRING)?
      USING script=STRING
      (AS (identifierSeq | colTypeList | ('(' (identifierSeq | colTypeList) ')')))?
      outRowFormat=rowFormat?
      (RECORDREADER recordReader=STRING)?
    ;

selectClause
    : SELECT setQuantifier? namedExpressionSeq
    ;

fromClause
    : FROM relation (',' relation)* lateralView* pivotClause?
    ;

relation
    : relationPrimary joinRelation*
    ;

relationPrimary
    : multipartIdentifier sample? tableAlias  #tableName
    | '(' query ')' sample? tableAlias        #aliasedQuery
    | '(' relation ')' sample? tableAlias     #aliasedRelation
    | inlineTable                             #inlineTableDefault2
    | functionTable                           #tableValuedFunction
    ;

functionTable
    : funcName=functionName '(' (expression (',' expression)*)? ')' tableAlias
    ;

sample
    : TABLESAMPLE '(' sampleMethod? ')'
    ;

sampleMethod
    : negativeSign=MINUS? percentage=(INTEGER_VALUE | DECIMAL_VALUE) PERCENTLIT   #sampleByPercentile
    | expression ROWS                                                             #sampleByRows
    | sampleType=BUCKET numerator=INTEGER_VALUE OUT OF denominator=INTEGER_VALUE
        (ON (identifier | qualifiedName '(' ')'))?                                #sampleByBucket
    | bytes=expression                                                            #sampleByBytes
    ;

pivotClause
    : PIVOT '(' aggregates=namedExpressionSeq FOR pivotColumn IN '(' pivotValues+=pivotValue (',' pivotValues+=pivotValue)* ')' ')'
    ;

pivotColumn
    : identifiers+=identifier
    | '(' identifiers+=identifier (',' identifiers+=identifier)* ')'
    ;

pivotValue
    : expression (AS? identifier)?
    ;

rowFormat
    : ROW FORMAT SERDE name=STRING (WITH SERDEPROPERTIES props=tablePropertyList)?  #rowFormatSerde
    | ROW FORMAT DELIMITED
      (FIELDS TERMINATED BY fieldsTerminatedBy=STRING (ESCAPED BY escapedBy=STRING)?)?
      (COLLECTION ITEMS TERMINATED BY collectionItemsTerminatedBy=STRING)?
      (MAP KEYS TERMINATED BY keysTerminatedBy=STRING)?
      (LINES TERMINATED BY linesSeparatedBy=STRING)?
      (NULL DEFINED AS nullDefinedAs=STRING)?                                       #rowFormatDelimited
    ;

lateralView
    : LATERAL VIEW (OUTER)? qualifiedName '(' (expression (',' expression)*)? ')' tblName=identifier (AS? colName+=identifier (',' colName+=identifier)*)?
    ;

whereClause
    : WHERE where=booleanExpression
    ;

aggregationClause
    : GROUP BY groupingExpressionsWithGroupingAnalytics+=groupByClause
        (',' groupingExpressionsWithGroupingAnalytics+=groupByClause)*
    | GROUP BY groupingExpressions+=expression (',' groupingExpressions+=expression)* (
      WITH kind=ROLLUP
    | WITH kind=CUBE
    | kind=GROUPING SETS '(' groupingSet (',' groupingSet)* ')')?
    ;

groupByClause
    : groupingAnalytics
    | expression
    ;

groupingAnalytics
    : (ROLLUP | CUBE) '(' groupingSet (',' groupingSet)* ')'
    | GROUPING SETS '(' groupingElement (',' groupingElement)* ')'
    ;

groupingElement
    : groupingAnalytics
    | groupingSet
    ;

groupingSet
    : '(' (expression (',' expression)*)? ')'
    | expression
    ;

havingClause
    : HAVING having=booleanExpression
    ;

windowClause
    : WINDOW namedWindow (',' namedWindow)*
    ;

namedWindow
    : name=identifier AS windowSpec
    ;

whenClause
    : WHEN condition=expression THEN result=expression
    ;

multipartIdentifierList
    : multipartIdentifier (',' multipartIdentifier)*
    ;

multipartIdentifier
    : parts+=identifier ('.' parts+=identifier)*
    ;

tableIdentifier
    : (db=identifier '.')? table=identifier
    ;

functionIdentifier
    : (db=identifier '.')? function=identifier
    ;

colTypeList
    : colType (',' colType)*
    ;

colType
    : colName=identifier dataType (NOT NULL)? commentSpec?
    ;

commentSpec
    : COMMENT STRING
    ;

tablePropertyList
    : '(' tableProperty (',' tableProperty)* ')'
    ;

tableProperty
    : key=tablePropertyKey (EQ? value=tablePropertyValue)?
    ;

tablePropertyKey
    : identifier ('.' identifier)*
    | STRING
    ;

tablePropertyValue
    : INTEGER_VALUE
    | DECIMAL_VALUE
    | booleanValue
    | STRING
    ;

identifierList
    : '(' identifierSeq ')'
    ;

identifierSeq
    : ident+=identifier (',' ident+=identifier)*
    ;

functionName
    : qualifiedName
    | FILTER
    | LEFT
    | RIGHT
    ;

// This should be used strictIdentifier instead of identifier
tableAlias
    : (AS? identifier identifierList?)?
    ;

joinRelation
    : (joinType) JOIN right=relationPrimary joinCriteria
    | NATURAL joinType JOIN right=relationPrimary
    ;

joinType
    : INNER?
    | CROSS
    | LEFT OUTER?
    | LEFT? SEMI
    | RIGHT OUTER?
    | FULL OUTER?
    | LEFT? ANTI
    ;

joinCriteria
    : ON booleanExpression
    | USING identifierList
    ;

namedQuery
    : name=identifier (columnAliases)? AS '(' query ')'
    ;

columnAliases
    : '(' identifier (',' identifier)* ')'
    ;

namedExpressionSeq
    : namedExpression (',' namedExpression)*
    ;

namedExpression
    : expression (AS? (name=identifier | identifierList))?
    ;

expressionSeq
    : expression (',' expression)*
    ;

expression
    : booleanExpression
    ;

booleanExpression
    : valueExpression predicate?                                   #predicated
    | NOT booleanExpression                                        #logicalNot
    | EXISTS '(' query ')'                                         #exists
    | left=booleanExpression operator=AND right=booleanExpression  #logicalBinary
    | left=booleanExpression operator=OR right=booleanExpression   #logicalBinary
    ;

predicate
    : NOT? kind=BETWEEN lower=valueExpression AND upper=valueExpression
    | NOT? kind=IN '(' expression (',' expression)* ')'
    | NOT? kind=IN '(' query ')'
    | NOT? kind=RLIKE pattern=valueExpression
    | NOT? kind=LIKE quantifier=(ANY | SOME | ALL) ('('')' | '(' expression (',' expression)* ')')
    | NOT? kind=LIKE pattern=valueExpression (ESCAPE escapeChar=STRING)?
    | IS NOT? kind=NULL
    | IS NOT? kind=(TRUE | FALSE | UNKNOWN)
    | IS NOT? kind=DISTINCT FROM right=valueExpression
    ;

valueExpression
    : primaryExpression                                                                      #valueExpressionDefault
    | operator=(MINUS | PLUS | TILDE) valueExpression                                        #arithmeticUnary
    | left=valueExpression operator=(ASTERISK | SLASH | PERCENT | DIV) right=valueExpression #arithmeticBinary
    | left=valueExpression operator=(PLUS | MINUS | CONCAT_PIPE) right=valueExpression       #arithmeticBinary
    | left=valueExpression operator=AMPERSAND right=valueExpression                          #arithmeticBinary
    | left=valueExpression operator=HAT right=valueExpression                                #arithmeticBinary
    | left=valueExpression operator=PIPE right=valueExpression                               #arithmeticBinary
    | left=valueExpression comparisonOperator right=valueExpression                          #comparison
    ;

primaryExpression
    : name=(CURRENT_DATE | CURRENT_TIMESTAMP)                                             #specialDateTimeFunction
    | name=CURRENT_USER                                                                   #currentUser
    | CASE operand=expression whenClause+ (ELSE elseExpression=expression)? END           #simpleCase
    | CASE whenClause+ (ELSE elseExpression=expression)? END                              #searchedCase
    | CAST '(' expression AS dataType ')'                                                 #cast
    | TRY_CAST '(' expression AS dataType ')'                                             #cast
    | FIRST '(' expression (IGNORE NULLS)? ')'                                            #first
    | LAST '(' expression (IGNORE NULLS)? ')'                                             #last
    | POSITION '(' valueExpression IN valueExpression ')'                                 #position
    | constant                                                                            #constantDefault
    | qualifiedName '.' ASTERISK                                                          #selectAll
    | ASTERISK                                                                            #selectAll
    | '(' expression (',' expression)+ ')'                                                #rowConstructor
    | ROW '(' expression (',' expression)* ')'                                            #rowConstructor
    | '(' query ')'                                                                       #subqueryExpression
    | functionName '(' ASTERISK ')' (FILTER '(' WHERE where=booleanExpression ')')?       
        ( OVER windowSpec)?                                                               #functionCall
    | functionName '(' (setQuantifier? argument+=expression
        (',' argument+=expression)*)? ')'
        (FILTER '(' WHERE where=booleanExpression ')')? 
        (nullsOption=(IGNORE | RESPECT) NULLS)? ( OVER windowSpec)?                       #functionCall
    | identifier '->' expression                                                          #lambda
    | '(' (identifier (',' identifier)*)? ')' '->' expression                             #lambda
    | value=primaryExpression '[' index=valueExpression ']'                               #subscript
    | identifier                                                                          #columnReference
    | base=primaryExpression '.' fieldName=identifier                                     #dereference
    | '(' expression ')'                                                                  #parenthesizedExpression
    | EXTRACT '(' identifier FROM valueExpression ')'                                     #extract
    | (SUBSTR | SUBSTRING) '(' str=valueExpression (FROM | ',') pos=valueExpression
      ((FOR | ',') len=valueExpression)? ')'                                              #substring
    | TRIM '(' trimOption=(BOTH | LEADING | TRAILING)? (trimStr=valueExpression)?
       FROM srcStr=valueExpression ')'                                                    #trim
    | OVERLAY '(' input=valueExpression PLACING replace=valueExpression
      FROM position=valueExpression (FOR length=valueExpression)? ')'                     #overlay
    //Trino
    | QUESTION_MARK                                                                       #parameter
    | ARRAY '[' (expression (',' expression)*)? ']'                                       #arrayConstructor
    | NORMALIZE '(' valueExpression (',' normalForm)? ')'                                 #normalize
    | GROUPING '(' (qualifiedName (',' qualifiedName)*)? ')'                              #groupingOperation
    ;

constant
    : NULL                                                                                #nullLiteral
    | interval                                                                            #intervalLiteral
    | identifier string                                                                   #typeConstructor
    | number                                                                              #numericLiteral
    | booleanValue                                                                        #booleanLiteral
    | string                                                                              #stringLiteral
    ;

setQuantifier
    : DISTINCT
    | ALL
    ;

windowSpec
    : name=identifier         #windowRef
    | '('name=identifier')'   #windowRef
    | '('
      ( CLUSTER BY partition+=expression (',' partition+=expression)*
      | ((PARTITION | DISTRIBUTE) BY partition+=expression (',' partition+=expression)*)?
        ((ORDER | SORT) BY sortItem (',' sortItem)*)?)
      windowFrame?
      ')'                                   #windowDef
    ;

windowFrame
    : frameType=RANGE start=frameBound
    | frameType=ROWS start=frameBound
    | frameType=RANGE BETWEEN start=frameBound AND end=frameBound
    | frameType=ROWS BETWEEN start=frameBound AND end=frameBound
    ;

frameBound
    : UNBOUNDED boundType=(PRECEDING | FOLLOWING)
    | boundType=CURRENT ROW
    | expression boundType=(PRECEDING | FOLLOWING)
    ;

qualifiedName
    : identifier ('.' identifier)*
    ;

string
    : STRING                                #basicStringLiteral
    | UNICODE_STRING (UESCAPE STRING)?      #unicodeStringLiteral
    ;

number
    : MINUS? DECIMAL_VALUE  #decimalLiteral
    | MINUS? DOUBLE_VALUE   #doubleLiteral
    | MINUS? INTEGER_VALUE  #integerLiteral
    ;

booleanValue
    : TRUE | FALSE
    ;

interval
    : INTERVAL sign=(PLUS | MINUS)? string from=intervalField (TO to=intervalField)?
    ;

intervalField
    : YEAR | MONTH | DAY | HOUR | MINUTE | SECOND
    ;

normalForm
    : NFD | NFC | NFKD | NFKC
    ;

dataType
    : ROW '(' rowField (',' rowField)* ')'                                         #rowType
    | INTERVAL from=intervalField (TO to=intervalField)?                           #intervalType
    | base=TIMESTAMP ('(' precision = typeParameter ')')? (WITHOUT TIME ZONE)?     #dateTimeType
    | base=TIMESTAMP ('(' precision = typeParameter ')')? WITH TIME ZONE           #dateTimeType
    | base=TIME ('(' precision = typeParameter ')')? (WITHOUT TIME ZONE)?          #dateTimeType
    | base=TIME ('(' precision = typeParameter ')')? WITH TIME ZONE                #dateTimeType
    | ARRAY '<' dataType '>'                                                           #legacyArrayType
    | MAP '<' keyType=dataType ',' valueType=dataType '>'                                  #legacyMapType
    | dataType ARRAY ('[' INTEGER_VALUE ']')?                                          #arrayType
    | identifier ('(' typeParameter (',' typeParameter)* ')')?                     #genericType
    ;

rowField
    : dataType
    | identifier dataType;

typeParameter
    : INTEGER_VALUE | dataType
    ;

identifier
    : IDENTIFIER             #unquotedIdentifier
    | QUOTED_IDENTIFIER      #quotedIdentifier
    | nonReserved            #unquotedIdentifier
    | BACKQUOTED_IDENTIFIER  #backQuotedIdentifier
    ;

comparisonOperator
    : EQ | NEQ | LT | LTE | GT | GTE | NSEQ
    ;

// There are 2 kinds of keywords in SQL.
// - Reserved keywords:
//     Keywords that are reserved and can't be used as identifiers for table, view, column,
//     function, alias, etc.
// - Non-reserved keywords:
//     Keywords that have a special meaning only in particular contexts and can be used as
//     identifiers in other contexts. For example, `EXPLAIN SELECT ...` is a command, but EXPLAIN
//     can be used as identifiers in other places.
// You can find the full keywords list by searching "Start of the keywords list" in this file.
// The non-reserved keywords are listed below. Keywords not in this list are reserved keywords.
// IMPORTANT: this rule must only contain tokens. Nested rules are not supported. See SqlParser.exitNonReserved
nonReserved
    : ADD | ADMIN | AFTER | ALL | ALTER | ANALYZE | AND | ANTI | ANY | ARCHIVE | ARRAY | AS | ASC | AT | AUTHORIZATION
    | BERNOULLI | BETWEEN | BOTH | BUCKET | BUCKETS | BY 
    | CACHE | CALL | CASCADE | CASE | CAST | CATALOGS | CHANGE | CHECK | CLEAR | CLUSTER | CLUSTERED | CODEGEN | COLLATE 
    | COLLECTION | COLUMN | COLUMNS | COMMENT | COMMIT | COMMITTED | COMPACT | COMPACTIONS | COMPUTE | CONCATENATE 
    | CONSTRAINT | COST | CREATE | CUBE | CURRENT | CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | CURRENT_USER 
    | DATA | DATABASE | DATABASES | DATE | DAY | DBPROPERTIES | DEFINE | DEFINED | DEFINER | DELETE | DELIMITED | DESC 
    | DESCRIBE | DFS | DIRECTORIES | DIRECTORY | DISTINCT | DISTRIBUTE | DISTRIBUTED | DIV | DOUBLE | DROP 
    | ELSE | EMPTY | END | ESCAPE | ESCAPED | EXCHANGE | EXCLUDING | EXISTS | EXPLAIN | EXPORT | EXTENDED | EXTERNAL | EXTRACT 
    | FALSE | FETCH | FIELDS | FILEFORMAT | FILTER | FINAL | FIRST | FOLLOWING | FOR | FOREIGN | FORMAT | FORMATTED 
    | FROM | FUNCTION | FUNCTIONS 
    | GLOBAL | GRANT | GRANTED | GRANTS | GRAPHVIZ | GROUP | GROUPING | GROUPS 
    | HAVING | HOUR 
    | IF | IGNORE | IMPORT | IN | INCLUDING | INDEX | INDEXES | INITIAL | INPATH | INPUT | INPUTFORMAT | INSERT 
    | INTERVAL | INTO | INVOKER | IO | IS | ISOLATION | ITEMS 
    | JSON 
    | KEYS 
    | LAST | LATERAL | LAZY | LEADING | LEVEL | LIKE | LIMIT | LINES | LIST | LOAD | LOCAL | LOCATION | LOCK | LOCKS | LOGICAL 
    | MACRO | MAP | MATCH | MATCHED | MATCHES | MATCH_RECOGNIZE | MATERIALIZED | MEASURES | MERGE | MINUTE | MONTH | MSCK 
    | NAMESPACE | NAMESPACES | NEXT | NFC | NFD | NFKC | NFKD | NO | NONE | NOT | NULL | NULLIF | NULLS 
    | OF | OFFSET | OMIT | ONE | ONLY | OPTION | OPTIONS | OR | ORDER | ORDINALITY | OUT | OUTER | OUTPUT | OUTPUTFORMAT 
    | OVER | OVERLAPS | OVERLAY | OVERWRITE 
    | PARTITION | PARTITIONED | PARTITIONS | PAST | PATH | PATTERN | PER | PERCENTLIT | PERMUTE | PIVOT | PLACING 
    | POSITION | PRECEDING | PRECISION | PRIMARY | PRINCIPALS | PRIVILEGES | PROPERTIES | PURGE 
    | QUERY 
    | RANGE | READ | RECORDREADER | RECORDWRITER | RECOVER | REDUCE | REFERENCES | REFRESH | RENAME | REPAIR | REPEATABLE 
    | REPLACE | RESET | RESPECT | RESTRICT | REVOKE | RLIKE | ROLE | ROLES | ROLLBACK | ROLLUP | ROW | ROWS | RUNNING 
    | SCHEMA | SCHEMAS | SECOND | SECURITY | SEEK | SELECT | SEMI | SEPARATED | SERDE | SERDEPROPERTIES | SERIALIZABLE 
    | SESSION | SESSION_USER | SET | SETMINUS | SETS | SHOW | SKEWED | SOME | SORT | SORTED | START | STATISTICS | STATS 
    | STORED | STRATIFY | STRUCT | SUBSET | SUBSTR | SUBSTRING | SYNC | SYSTEM | TABLE | TABLES | TABLESAMPLE 
    | TBLPROPERTIES | TEMPORARY | TERMINATED | TEXT | THEN | TIES | TIME | TIMESTAMP | TO | TOUCH | TRAILING | TRANSACTION 
    | TRANSACTIONS | TRANSFORM | TRIM | TRUE | TRUNCATE | TRY_CAST | TYPE 
    | UNARCHIVE | UNBOUNDED | UNCACHE | UNCOMMITTED | UNIQUE | UNKNOWN | UNLOCK | UNMATCHED | UNSET | UPDATE | USE | USER 
    | VALIDATE | VALUES | VERBOSE | VIEW | VIEWS 
    | WHEN | WHERE | WINDOW | WITH | WITHOUT | WORK | WRITE 
    | YEAR 
    | ZONE
    ;

//============================
// Start of the keywords list
//============================
//--SPARK-KEYWORD-LIST-START
ADD: 'ADD';
AFTER: 'AFTER';
ALL: 'ALL';
ALTER: 'ALTER';
ANALYZE: 'ANALYZE';
AND: 'AND';
ANTI: 'ANTI';
ANY: 'ANY';
ARCHIVE: 'ARCHIVE';
ARRAY: 'ARRAY';
AS: 'AS';
ASC: 'ASC';
AT: 'AT';
AUTHORIZATION: 'AUTHORIZATION';
BETWEEN: 'BETWEEN';
BOTH: 'BOTH';
BUCKET: 'BUCKET';
BUCKETS: 'BUCKETS';
BY: 'BY';
CACHE: 'CACHE';
CASCADE: 'CASCADE';
CASE: 'CASE';
CAST: 'CAST';
CHANGE: 'CHANGE';
CHECK: 'CHECK';
CLEAR: 'CLEAR';
CLUSTER: 'CLUSTER';
CLUSTERED: 'CLUSTERED';
CODEGEN: 'CODEGEN';
COLLATE: 'COLLATE';
COLLECTION: 'COLLECTION';
COLUMN: 'COLUMN';
COLUMNS: 'COLUMNS';
COMMENT: 'COMMENT';
COMMIT: 'COMMIT';
COMPACT: 'COMPACT';
COMPACTIONS: 'COMPACTIONS';
COMPUTE: 'COMPUTE';
CONCATENATE: 'CONCATENATE';
CONSTRAINT: 'CONSTRAINT';
COST: 'COST';
CREATE: 'CREATE';
CROSS: 'CROSS';
CUBE: 'CUBE';
CURRENT: 'CURRENT';
CURRENT_DATE: 'CURRENT_DATE';
CURRENT_TIME: 'CURRENT_TIME';
CURRENT_TIMESTAMP: 'CURRENT_TIMESTAMP';
CURRENT_USER: 'CURRENT_USER';
DAY: 'DAY';
DATA: 'DATA';
DATABASE: 'DATABASE';
DATABASES: 'DATABASES';
DBPROPERTIES: 'DBPROPERTIES';
DEFINED: 'DEFINED';
DELETE: 'DELETE';
DELIMITED: 'DELIMITED';
DESC: 'DESC';
DESCRIBE: 'DESCRIBE';
DFS: 'DFS';
DIRECTORIES: 'DIRECTORIES';
DIRECTORY: 'DIRECTORY';
DISTINCT: 'DISTINCT';
DISTRIBUTE: 'DISTRIBUTE';
DIV: 'DIV';
DROP: 'DROP';
ELSE: 'ELSE';
END: 'END';
ESCAPE: 'ESCAPE';
ESCAPED: 'ESCAPED';
EXCEPT: 'EXCEPT';
EXCHANGE: 'EXCHANGE';
EXISTS: 'EXISTS';
EXPLAIN: 'EXPLAIN';
EXPORT: 'EXPORT';
EXTENDED: 'EXTENDED';
EXTERNAL: 'EXTERNAL';
EXTRACT: 'EXTRACT';
FALSE: 'FALSE';
FETCH: 'FETCH';
FIELDS: 'FIELDS';
FILTER: 'FILTER';
FILEFORMAT: 'FILEFORMAT';
FIRST: 'FIRST';
FOLLOWING: 'FOLLOWING';
FOR: 'FOR';
FOREIGN: 'FOREIGN';
FORMAT: 'FORMAT';
FORMATTED: 'FORMATTED';
FROM: 'FROM';
FULL: 'FULL';
FUNCTION: 'FUNCTION';
FUNCTIONS: 'FUNCTIONS';
GLOBAL: 'GLOBAL';
GRANT: 'GRANT';
GROUP: 'GROUP';
GROUPING: 'GROUPING';
HAVING: 'HAVING';
IF: 'IF';
IGNORE: 'IGNORE';
IMPORT: 'IMPORT';
IN: 'IN';
INDEX: 'INDEX';
INDEXES: 'INDEXES';
INNER: 'INNER';
INPATH: 'INPATH';
INPUTFORMAT: 'INPUTFORMAT';
INSERT: 'INSERT';
INTERSECT: 'INTERSECT';
INTERVAL: 'INTERVAL';
INTO: 'INTO';
IS: 'IS';
ITEMS: 'ITEMS';
JOIN: 'JOIN';
KEYS: 'KEYS';
LAST: 'LAST';
LATERAL: 'LATERAL';
LAZY: 'LAZY';
LEADING: 'LEADING';
LEFT: 'LEFT';
LIKE: 'LIKE';
LIMIT: 'LIMIT';
LINES: 'LINES';
LIST: 'LIST';
LOAD: 'LOAD';
LOCAL: 'LOCAL';
LOCATION: 'LOCATION';
LOCK: 'LOCK';
LOCKS: 'LOCKS';
LOGICAL: 'LOGICAL';
MACRO: 'MACRO';
MAP: 'MAP';
MATCHED: 'MATCHED';
MERGE: 'MERGE';
MONTH: 'MONTH';
MSCK: 'MSCK';
NAMESPACE: 'NAMESPACE';
NAMESPACES: 'NAMESPACES';
NATURAL: 'NATURAL';
NO: 'NO';
NOT: 'NOT' | '!';
NULL: 'NULL';
NULLS: 'NULLS';
OF: 'OF';
ON: 'ON';
ONLY: 'ONLY';
OPTION: 'OPTION';
OPTIONS: 'OPTIONS';
OR: 'OR';
ORDER: 'ORDER';
OUT: 'OUT';
OUTER: 'OUTER';
OUTPUTFORMAT: 'OUTPUTFORMAT';
OVER: 'OVER';
OVERLAPS: 'OVERLAPS';
OVERLAY: 'OVERLAY';
OVERWRITE: 'OVERWRITE';
PARTITION: 'PARTITION';
PARTITIONED: 'PARTITIONED';
PARTITIONS: 'PARTITIONS';
PERCENTLIT: 'PERCENT';
PIVOT: 'PIVOT';
PLACING: 'PLACING';
POSITION: 'POSITION';
PRECEDING: 'PRECEDING';
PRIMARY: 'PRIMARY';
PRINCIPALS: 'PRINCIPALS';
PROPERTIES: 'PROPERTIES';
PURGE: 'PURGE';
QUERY: 'QUERY';
RANGE: 'RANGE';
RECORDREADER: 'RECORDREADER';
RECORDWRITER: 'RECORDWRITER';
RECOVER: 'RECOVER';
REDUCE: 'REDUCE';
REFERENCES: 'REFERENCES';
REFRESH: 'REFRESH';
RENAME: 'RENAME';
REPAIR: 'REPAIR';
REPLACE: 'REPLACE';
RESET: 'RESET';
RESPECT: 'RESPECT';
RESTRICT: 'RESTRICT';
REVOKE: 'REVOKE';
RIGHT: 'RIGHT';
RLIKE: 'RLIKE' | 'REGEXP';
ROLE: 'ROLE';
ROLES: 'ROLES';
ROLLBACK: 'ROLLBACK';
ROLLUP: 'ROLLUP';
ROW: 'ROW';
ROWS: 'ROWS';
SECOND: 'SECOND';
SCHEMA: 'SCHEMA';
SELECT: 'SELECT';
SEMI: 'SEMI';
SEPARATED: 'SEPARATED';
SERDE: 'SERDE';
SERDEPROPERTIES: 'SERDEPROPERTIES';
SESSION_USER: 'SESSION_USER';
SET: 'SET';
SETMINUS: 'MINUS';
SETS: 'SETS';
SHOW: 'SHOW';
SKEWED: 'SKEWED';
SOME: 'SOME';
SORT: 'SORT';
SORTED: 'SORTED';
START: 'START';
STATISTICS: 'STATISTICS';
STORED: 'STORED';
STRATIFY: 'STRATIFY';
STRUCT: 'STRUCT';
SUBSTR: 'SUBSTR';
SUBSTRING: 'SUBSTRING';
SYNC: 'SYNC';
TABLE: 'TABLE';
TABLES: 'TABLES';
TABLESAMPLE: 'TABLESAMPLE';
TBLPROPERTIES: 'TBLPROPERTIES';
TEMPORARY: 'TEMPORARY' | 'TEMP';
TERMINATED: 'TERMINATED';
THEN: 'THEN';
TIME: 'TIME';
TO: 'TO';
TOUCH: 'TOUCH';
TRAILING: 'TRAILING';
TRANSACTION: 'TRANSACTION';
TRANSACTIONS: 'TRANSACTIONS';
TRANSFORM: 'TRANSFORM';
TRIM: 'TRIM';
TRUE: 'TRUE';
TRUNCATE: 'TRUNCATE';
TRY_CAST: 'TRY_CAST';
TYPE: 'TYPE';
UNARCHIVE: 'UNARCHIVE';
UNBOUNDED: 'UNBOUNDED';
UNCACHE: 'UNCACHE';
UNION: 'UNION';
UNIQUE: 'UNIQUE';
UNKNOWN: 'UNKNOWN';
UNLOCK: 'UNLOCK';
UNSET: 'UNSET';
UPDATE: 'UPDATE';
USE: 'USE';
USER: 'USER';
USING: 'USING';
VALUES: 'VALUES';
VIEW: 'VIEW';
VIEWS: 'VIEWS';
WHEN: 'WHEN';
WHERE: 'WHERE';
WINDOW: 'WINDOW';
WITH: 'WITH';
YEAR: 'YEAR';
ZONE: 'ZONE';
//--SPARK-KEYWORD-LIST-END
//============================

//============================
//--TRINO-KEYWORD-LIST-START
ADMIN: 'ADMIN';
BERNOULLI: 'BERNOULLI';
CALL: 'CALL';
CATALOGS: 'CATALOGS';
COMMITTED: 'COMMITTED';
CURRENT_CATALOG: 'CURRENT_CATALOG';
CURRENT_PATH: 'CURRENT_PATH';
CURRENT_ROLE: 'CURRENT_ROLE';
CURRENT_SCHEMA: 'CURRENT_SCHEMA';
DATE: 'DATE';
DEALLOCATE: 'DEALLOCATE';
DEFINER: 'DEFINER';
DEFINE: 'DEFINE';
DISTRIBUTED: 'DISTRIBUTED';
DOUBLE: 'DOUBLE';
EMPTY: 'EMPTY';
EXCLUDING: 'EXCLUDING';
EXECUTE: 'EXECUTE';
FINAL: 'FINAL';
GRANTED: 'GRANTED';
GRANTS: 'GRANTS';
GRAPHVIZ: 'GRAPHVIZ';
GROUPS: 'GROUPS';
HOUR: 'HOUR';
INCLUDING: 'INCLUDING';
INITIAL: 'INITIAL';
INPUT: 'INPUT';
INVOKER: 'INVOKER';
IO: 'IO';
ISOLATION: 'ISOLATION';
JSON: 'JSON';
LEVEL: 'LEVEL';
LOCALTIME: 'LOCALTIME';
LOCALTIMESTAMP: 'LOCALTIMESTAMP';
MATCH: 'MATCH';
MATCHES: 'MATCHES';
MATCH_RECOGNIZE: 'MATCH_RECOGNIZE';
MATERIALIZED: 'MATERIALIZED';
MEASURES: 'MEASURES';
MINUTE: 'MINUTE';
NEXT: 'NEXT';
NFC : 'NFC';
NFD : 'NFD';
NFKC : 'NFKC';
NFKD : 'NFKD';
NONE: 'NONE';
NORMALIZE: 'NORMALIZE';
NULLIF: 'NULLIF';
OFFSET: 'OFFSET';
OMIT: 'OMIT';
ONE: 'ONE';
ORDINALITY: 'ORDINALITY';
OUTPUT: 'OUTPUT';
PAST: 'PAST';
PATH: 'PATH';
PATTERN: 'PATTERN';
PER: 'PER';
PERMUTE: 'PERMUTE';
PRECISION: 'PRECISION';
PREPARE: 'PREPARE';
PRIVILEGES: 'PRIVILEGES';
READ: 'READ';
RECURSIVE: 'RECURSIVE';
REPEATABLE: 'REPEATABLE';
RUNNING: 'RUNNING';
SCHEMAS: 'SCHEMAS';
SECURITY: 'SECURITY';
SEEK: 'SEEK';
SERIALIZABLE: 'SERIALIZABLE';
SESSION: 'SESSION';
STATS: 'STATS';
SUBSET: 'SUBSET';
SYSTEM: 'SYSTEM';
TEXT: 'TEXT';
TIES: 'TIES';
TIMESTAMP: 'TIMESTAMP';
UESCAPE: 'UESCAPE';
UNCOMMITTED: 'UNCOMMITTED';
UNMATCHED: 'UNMATCHED';
UNNEST: 'UNNEST';
VALIDATE: 'VALIDATE';
VERBOSE: 'VERBOSE';
WITHOUT: 'WITHOUT';
WORK: 'WORK';
WRITE: 'WRITE';
//--TRINO-KEYWORD-LIST-END
//============================
// End of the keywords list
//============================


//Symbol
EQ  : '=' | '==';
NSEQ: '<=>';
NEQ : '<>' | '!=';
LT  : '<';
LTE : '<=' | '!>';
GT  : '>';
GTE : '>=' | '!<';

PLUS: '+';
MINUS: '-';
ASTERISK: '*';
SLASH: '/';
PERCENT: '%';
TILDE: '~';
AMPERSAND: '&';
PIPE: '|';
CONCAT_PIPE: '||';
HAT: '^';
QUESTION_MARK : '?';


STRING
    : '\'' ( ~'\'' | '\'\'' )* '\''
    | '"' ( ~'"' | '""' )* '"'
    ;

UNICODE_STRING
    : 'U&\'' ( ~'\'' | '\'\'' )* '\''
    ;

INTEGER_VALUE
    : DIGIT+
    ;

DECIMAL_VALUE
    : DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;

DOUBLE_VALUE
    : DIGIT+ ('.' DIGIT*)? EXPONENT
    | '.' DIGIT+ EXPONENT
    ;

IDENTIFIER
    : (LETTER | DIGIT | '_')+
    ;

QUOTED_IDENTIFIER
    : '"' ( ~'"' | '""' )* '"'
    ;

BACKQUOTED_IDENTIFIER
    : '`' ( ~'`' | '``' )* '`'
    ;

fragment EXPONENT
    : 'E' [+-]? DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [A-Z]
    ;

SIMPLE_COMMENT
    : '--' ('\\\n' | ~[\r\n])* '\r'? '\n'? -> channel(HIDDEN)
    ;

BRACKETED_COMMENT
    : '/*' {!isHint()}? (BRACKETED_COMMENT|.)*? '*/' -> channel(HIDDEN)
    ;

WS
    : [ \r\n\t]+ -> channel(HIDDEN)
    ;

// Catch-all for anything we can't recognize.
// We use this to be able to ignore and recover all the text
// when splitting statements with DelimiterLexer
UNRECOGNIZED
    : .
    ;