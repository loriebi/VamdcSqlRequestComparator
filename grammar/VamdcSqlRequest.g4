// Define a grammar called VamdcSqlRequest
grammar VamdcSqlRequest;


@header {
package vamdcsqlcomparator;
}


// Define Select command
select : 'select' (selectList = list | '*' | 'all'  ) (where = 'where' expr)? EOF;


// Define expression
expr  : factor | expr 'or' factor;
factor : term 'and' factor | term;
term : name | compexp | '(' expr ')';
compexp : left = name  BOOLEAN_OP right = name;


// List of boolean operations
BOOLEAN_OP
    : '<'
    | '>'
    | '='
    | '<='
    | '>='
    | 'in'
    | 'like'
    ;


list : ID | (ID ',' list);
name : ID | NUM | (ID '.' name) | '(' name ')' | (ID ',' name);


NUM : [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)? | '\'' NUM '\'';
ID : ('^')?('a'..'z')('a'..'z'|'0'..'9'|'-')*('%')? | '\'' ID '\'';
WS : [ \t\r\n]+ -> skip;

