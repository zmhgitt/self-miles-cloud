// SQLiteLexer.g4
lexer grammar SQLiteLexer;

// 范围小的token一定要放前面，范围大的放后面(这点记住，网上几乎没有提示，如果不清楚debug一下追踪源码便清楚了)

// 声明一些选项，这里表名在进行词法分析时不区分大小写
// 只有最顶级的语法文件才会生效(别的语法文件import后，将 options复制过去)
// 可用的选项可以在https://github.com/antlr/antlr4/blob/master/doc/options.md查看
options {
    caseInsensitive = true;
}

// 定义sql语句中的特殊字符，如括号和算符
SCOL      : ';';
DOT       : '.';
OPEN_PAR  : '(';
CLOSE_PAR : ')';
COMMA     : ',';
ASSIGN    : '=';
STAR      : '*';
PLUS      : '+';
MINUS     : '-';

// 定义tokens
CREAT_             : 'CREATE';
TABLE_             : 'TABLE';
IF_                : 'IF';
NOT_               : 'NOT';
NULL_              : 'NULL';
UNIQUE_            : 'UNIQUE';
CHECK_             : 'CHECK';
DEFAULT_           : 'DEFAULT';
EXISTS_            : 'EXISTS';
WITHOUT_           : 'WITHOUT';
TEMP_              : 'TEMP';
TEMPORARY_         : 'TEMPORARY';
PRIMARY_           : 'PRIMARY';
KEY_               : 'KEY';
COLLATE_           : 'COLLATE';
GENERATED_         : 'GENERATED';
ALWAYS_            : 'ALWAYS';
STORED_            : 'STORED';
VIRTUAL_           : 'VIRTUAL';
CONSTRAINT_        : 'CONSTRAINT';
ABORT_             : 'ABORT';
ACTION_            : 'ACTION';
ADD_               : 'ADD';
AFTER_             : 'AFTER';
ALL_               : 'ALL';
ALTER_             : 'ALTER';
ANALYZE_           : 'ANALYZE';
AND_               : 'AND';
AS_                : 'AS';
ASC_               : 'ASC';
ATTACH_            : 'ATTACH';
AUTOINCREMENT_     : 'AUTO_INCREMENT';
BEFORE_            : 'BEFORE';
BEGIN_             : 'BEGIN';
BETWEEN_           : 'BETWEEN';
BY_                : 'BY';
CASCADE_           : 'CASCADE';
CASE_              : 'CASE';
CAST_              : 'CAST';
COMMENT_           : 'COMMENT';
ENGINE_            : 'ENGINE';
INNODB             : 'INNODB';
// Base
DIGIT:[0-9];   //匹配数字
LETTER:[a-z];  //匹配字母
ANYDL: [a-z0-9_];

STRING_IDEENTIFIRE
    : '`'IDENTIFIER'`' | '\''IDENTIFIER'\'' | '"'IDENTIFIER'"'
    ;
STRING        //匹配带引号的文本
    : '\'' ( ~('\''|'\\') | ('\\' .) )* '\''
    | '"' ( ~('"'|'\\') | ('\\' .) )* '"'
    ;
IDENTIFIER
    : LETTER(LETTER | DIGIT | '_')+
;
BACKQUOTED_IDENTIFIER   //匹配被``包裹的文本
    : '`' ( ~'`' | '``' )* '`'
;

//--hiden  定义需要隐藏的文本，指向channel(HIDDEN)就会隐藏。这里的channel可以自定义，到时在后台获取不同的channel的数据进行不同的处理
SIMPLE_COMMENT: '--' ~[\r\n]* '\r'? '\n'? -> channel(HIDDEN);   //忽略行注释
BRACKETED_EMPTY_COMMENT: '/**/' -> channel(HIDDEN);  //忽略多行注释
BRACKETED_COMMENT : '/*' ~[+] .*? '*/' -> channel(HIDDEN) ;  //忽略多行注释
WS: [ \r\n\t]+ -> channel(HIDDEN);  //忽略空白符
