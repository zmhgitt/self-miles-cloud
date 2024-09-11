// 没有使用JSqlParse 框架，主要是灵活
grammar Mysql;

@header {
    package self.miles.common.antlr4.mysql;
}

options {
    caseInsensitive = true;
}

import SQLiteLexer;


//options {
////    tokenVocab = xx.tokens;
//}

//匹配一条
parse
    : (sql_stat) EOF;


sql_stat: mysql_crt_stmt;

// 不支持使用As创建
mysql_crt_stmt
    : c_table (
            OPEN_PAR c_column (COMMA c_column)*? (COMMA table_constraint)* CLOSE_PAR
            (WITHOUT_ row_ROW_ID = IDENTIFIER)?
       ) engineName tableComment?
;
c_table
    : CREAT_ (TEMP_ | TEMPORARY_)? TABLE_ (IF_ NOT_ EXISTS_)? (schema_name DOT)? tableName
    ;
c_column
    : column_name type_name ('unsigned' | 'signed')? column_constraint* (COMMENT_ commonStr)?
;
table_constraint
    :(CONSTRAINT_ identifier)? (
             (PRIMARY_ KEY_ | UNIQUE_) OPEN_PAR indexed_column (COMMA indexed_column)* CLOSE_PAR conflict_clause?
             | CHECK_ OPEN_PAR expr CLOSE_PAR
//             | FOREIGN_ KEY_ OPEN_PAR column_name (COMMA column_name)* CLOSE_PAR foreign_key_clause
         )
;
//  id int(11) PRIMARY_ KEY_
column_constraint
    :             (PRIMARY_ KEY_ asc_desc? conflict_clause? AUTOINCREMENT_?)
                  | AUTOINCREMENT_
                  | (NOT_? NULL_ | UNIQUE_) conflict_clause?
                  | CHECK_ OPEN_PAR expr CLOSE_PAR
                  | DEFAULT_ (signed_number | LETTER | OPEN_PAR expr CLOSE_PAR) update_clause?
                  | COLLATE_ collation_name
//                  | foreign_key_clause
                  | (GENERATED_ ALWAYS_)? AS_ OPEN_PAR expr CLOSE_PAR (STORED_ | VIRTUAL_)?
;

schema_name: identifier;
tableName: identifier;
column_name: identifier;
collation_name: identifier;
indexed_column: identifier;
commonStr: (string | identifier);
tableComment: COMMENT_ commonStr;
engineName: ENGINE_ ASSIGN identifier;
type_name: identifier(OPEN_PAR signed_number CLOSE_PAR | OPEN_PAR signed_number COMMA signed_number CLOSE_PAR)?;
identifier: IDENTIFIER | STRING_IDEENTIFIRE;  //identifier，指向lexer IDENTIFIER  或者parser quotedIdentifier
quotedIdentifier: BACKQUOTED_IDENTIFIER;  //quotedIdentifier,指向lexer BACKQUOTED_IDENTIFIER
signed_number: DIGIT+;
string: STRING;
asc_desc: 'ASC' | 'DESC';
conflict_clause: 'ON DELETE CASCADE' | 'ON UPDATE CASCADE' | 'ON DELETE SET NULL' | 'ON UPDATE SET NULL';
update_clause: 'ON UPDATE CURRENT_TIMESTAMP' | 'CURRENT_TIMESTAMP';

expr: ANYDL ('>'|'<'|ASSIGN) DIGIT;


