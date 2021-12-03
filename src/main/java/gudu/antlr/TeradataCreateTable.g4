grammar TeradataCreateTable;

@header {
    package gudu.antlr;
}

parseCreateTable: (createTable SEMI_COLON?) EOF
                  ;

createTable: (CREATE (SET| MULTISET)? (GLOBAL TEMPORARY|VOLATILE)? TABLE | CT) (DATABASE_NAME | USER_NAME)?
            tableName
            (COMMA tableOptionList)?
            columnDefinitionList
            indexDefinitions
            ;

tableName: NAME
          ;

tableOptionList: tableOption (COMMA tableOption)*
               ;

tableOption: fallBackOption
           | beforeJournalOption
           | afterJournalOption
           | checksumOption
           | mergeBlockRatioOption
           ;

fallBackOption: NO? FALLBACK PROTECTION?
              ;

beforeJournalOption: (NO|DUAL)? BEFORE? JOURNAL
                ;

afterJournalOption: (NO|DUAL)? AFTER JOURNAL
                ;

checksumOption: CHECKSUM EQUALS DEFAULT
             ;

mergeBlockRatioOption: DEFAULT MERGEBLOCKRATIO
              ;

columnDefinitionList: OPEN_BRACKET columnDefinition (COMMA columnDefinition)* CLOSE_BRACKET
           ;

columnDefinition: columnName
                  dataType
                  columnAttributeList
       ;

columnName: NAME
            ;
dataType: NAME (OPEN_BRACKET (INT2 | INT4 | NUM) (COMMA (INT2 | INT4 | NUM))? CLOSE_BRACKET)?
        ;

columnAttributeList: columnAttribute*
                ;

columnAttribute: identityConstraint
               | notNull
               | formatDate
               | caseSpecific
               | characterSet
               | compress
            ;
notNull: NOT NULL
       ;

formatDate: FORMAT SINGLE_QUOTE formatType SINGLE_QUOTE
        ;

formatType: YYYY SEPARATOR MM SEPARATOR DD
          | DD SEPARATOR MM SEPARATOR YYYY
          ;

caseSpecific: NOT? (CASE_SPECIFIC|CS)
            ;

characterSet: CHARACTER SET phraseType
            ;

phraseType: NAME
          ;

compress: COMPRESS (OPEN_BRACKET? conditionalExpressionList CLOSE_BRACKET?)?
       ;

identityConstraint: GENERATED (ALWAYS | BY DEFAULT)? AS IDENTITY (OPEN_BRACKET identityExpression CLOSE_BRACKET)?
                ;

identityExpression: startWith incrementBy (minValue | noMinValue) (maxValue | noMaxValue) isCycle
            ;

startWith: START WITH NUM
        ;

incrementBy: INCREMENT BY NUM
        ;

minValue: MINVALUE NUM
        ;
noMinValue: NO MINVALUE
        ;
noMaxValue: NO MAXVALUE
        ;

maxValue: MAXVALUE NUM
        ;

isCycle: NO? CYCLE
        ;

indexDefinitions: (uniquePrimaryIndex | noPrimaryIndex | primaryAmpIndex | partitionExpressionList)*
        ;

uniquePrimaryIndex: UNIQUE? PRIMARY? INDEX indexName? ALL? OPEN_BRACKET indexColumnList CLOSE_BRACKET ordering? loading?
                ;
noPrimaryIndex: NO PRIMARY INDEX
              ;
primaryAmpIndex: PRIMARY AMP INDEX? indexName? OPEN_BRACKET indexColumnList CLOSE_BRACKET
            ;
indexName: NAME
        ;

indexColumnList: columnName (COMMA columnName)*
            ;

loading: WITH NO? LOAD_ENTITY
        ;
ordering: ORDER BY (VALUES | HASH)? (OPEN_BRACKET orderColumnName CLOSE_BRACKET)?
        ;

orderColumnName: NAME
        ;

partitionExpressionList: PARTITION BY
            OPEN_BRACKET? partitionExpression (COMMA partitionExpression)*
            CLOSE_BRACKET?
        ;

partitionExpression: arithmeticPartition
                   | simplePartition
                   | caseNPartition
                   | rangeNPartition
                   | functionPartition
                   ;

simplePartition: columnName
        ;

caseNPartition: CASE_N
        OPEN_BRACKET
        conditionalExpressionList
        (COMMA (NO_CASE (OR_UNKNOWN | COMMA UNKNOWN)? | UNKNOWN))?
        CLOSE_BRACKET
        ;

conditionalExpressionList: conditionalExpression (COMMA conditionalExpression)*
        ;

conditionalExpression: tExpression
        ;

tExpression:tExpression AND tExpression
           |tExpression BETWEEN tExpression
           |tExpression operator tExpression
           | expressionString
           | columnName
           | columnExpression
           | INT2
           | INT4
           | NUM
           | FLOAT
           ;

operator: BETWEEN
        | LIKE
        | LESS_THAN
        | LESS_THAN_EQUALS
        | EQUALS
        | NOT_EQUALS
        | GREATER_THAN
        | GREATER_THAN_EQUALS
        | AND
        | OR
        | ADDITION
        | STAR
        ;

columnExpression: columnName
                | functionName OPEN_BRACKET columnName AS? NAME? CLOSE_BRACKET
                ;

expressionString:(SINGLE_QUOTE (NAME| FLOAT| NUM) SINGLE_QUOTE)
                | (castToken? SINGLE_QUOTE date SINGLE_QUOTE)
        ;

functionName: NAME;

castToken: NAME
            ;

rangeNPartition: RANGE_N
                OPEN_BRACKET
                columnExpression BETWEEN
                ((startExpression AND (endExpression | STAR) (EACH rangeSize)?)
                 | (STAR AND (endExpression | STAR))
                 | rangeList
                )
                (COMMA (NO_RANGE (OR_UNKNOWN | COMMA UNKNOWN) | UNKNOWN))?
                CLOSE_BRACKET

        ;

rangeList: ((startExpression (AND endExpression) (EACH rangeSize)?)
            | (STAR (AND endExpression)?))
            (COMMA nextRangeList)*
           ;

nextRangeList: startExpression (AND (endExpression | STAR)) (EACH rangeSize)?
            ;

testExpression: tExpression
              ;
startExpression: tExpression
               ;
endExpression: tExpression
            ;
rangeSize:  INTERVAL? stepSize (expressionString)? stepType?
        ;
stepSize: SINGLE_QUOTE? NUM SINGLE_QUOTE?
        ;
stepType: DAY | WEEK | MONTH | YEAR
        ;
arithmeticPartition: tExpression
        ;

functionPartition: extractFunction
        ;
extractFunction: EXTRACT OPEN_BRACKET extractToken FROM tExpression CLOSE_BRACKET
                ;

extractToken: YEAR | MONTH | DAY | HOUR | MINUTE | SECOND | TIMEZONE_HOUR | TIMEZONE_MINUTE
            ;

date: INT4 SEPARATOR INT2 SEPARATOR INT2
     | INT2 SEPARATOR month SEPARATOR INT2
     | INT2 SEPARATOR month SEPARATOR INT4
     | INT2 SEPARATOR INT2 SEPARATOR INT4;

month : JAN | FEB | MAR | APR | MAY | JUN | JUL | AUG | SEP | OCT | NOV | DEC ;

/*Tokens*/

FLOAT : DIGIT+ '.' DIGIT+ ;
INT4 : DIGIT DIGIT DIGIT DIGIT;
INT2: DIGIT  DIGIT;
NUM: INT2 | DIGIT+;
AND: A N D;
OR: O R;
STAR: '*';
EACH: E A C H;
ADDITION: '+';
INTERVAL: I N T E R V A L;
LESS_THAN : '<';
LESS_THAN_EQUALS: '<=';
EQUALS: '=';
NOT_EQUALS: '<>';
GREATER_THAN: '>';
YYYY : Y Y Y Y;
MM : M M;
DD : D D;
GREATER_THAN_EQUALS: '>=';
CREATE: C R E A T E;
SET: S E T;
MULTISET: M U L T I S E T;
GLOBAL: G L O B A L;
TEMPORARY: T E M P O R A R Y;
TABLE: T A B L E;
VOLATILE: V O L A T I L E;
CT: C T;
GENERATED : G E N E R A T E D;
ALWAYS : A L W A Y S;
BY_DEFAULT : B Y D E F A U L T;
AS : A S;

/* table options */
DUAL : D U A L;
FALLBACK : F A L L B A C K;
PROTECTION : P R O T E C T I O N;
BEFORE : B E F O R E;
JOURNAL : J O U R N A L;
AFTER : A F T E R;
CHECKSUM : C H E C K S U M;
MERGEBLOCKRATIO : M E R G E B L O C K R A T I O;

/* atrributes */
IDENTITY : I D E N T I T Y;
NO_MIN_VALUE : N O M I N V A L U E;
NO_MAX_VALUE : N O M A X  V A L U E;
CYCLE : C Y C L E;
START : S T A R T;
INCREMENT : I N C R E M E N T;
MINVALUE : M I N V A L U E;
MAXVALUE : M A X V A L U E;
EXTRACT: E X T R A C T;
YEAR : Y E A R;
MONTH : M O N T H;
WEEK : W E E K;
DAY : D A Y;
HOUR : H O U R;
COMPRESS : C O M P R E S S;
MINUTE : M I N U T E;
SECOND : S E C O N D;
TIMEZONE_HOUR : T I M E Z O N E '_' H O U R;
TIMEZONE_MINUTE : T I M E Z O N E '_' M I N U T E;
FROM : F R O M;
NO_RANGE: 'no range' | 'NO RANGE';
NO_CASE: 'no case' | 'NO CASE';
OR_UNKNOWN: 'or unknown' | 'OR UNKNOWN';
UNKNOWN: U N K N O W N;
BETWEEN : B E T W E E N;
LIKE : L I K E;
NO: N O;
ALL: A L L;
NULL : N U L L;
WITH: W I T H;
FORMAT : F O R M A T;
VALUES: V A L U E S;
HASH: H A S H;
LOAD_ENTITY: 'LOAD ENTITY' | 'load entity';
NOT : N O T;
CHARACTER : C H A R A C T E R;
CASE_SPECIFIC: C A S E S P E C I F I C;
CS : C S;
PARTITION: P A R T I T I O N;
AMP: A M P;
RANGE_N: R A N G E '_' N;
CASE_N: C A S E '_' N;
UNIQUE: U N I Q U E;
PRIMARY: P R I M A R Y;
INDEX: I N D E X;
ORDER : O R D E R;
BY: B Y;
DOT: '.';
OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
DEFAULT: D E F A U L T;
COMMA: ',';
UPPERCASE: U P P E R C A S E | U C;
DATABASE_NAME: NAME DOT;
USER_NAME: NAME DOT;
SINGLE_QUOTE: '\'';
JAN : J A N ;
FEB : F E B ;
MAR : M A R ;
APR : A P R ;
MAY : M A Y;
JUN : J U N;
JUL : J U L;
AUG : A U G;
SEP : S E P;
OCT : O C T;
NOV : N O V;
DEC : D E C;
SEPARATOR : [/\\\-];
NAME: [a-zA-Z][a-zA-Z0-9_]*;
COMMENT: '--'  ~[\r\n]* -> skip;
WS: [ \t\n]+ -> skip;
SEMI_COLON: ';';

fragment DIGIT : [0-9];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

