grammar Expr;
prog: (expr NEWLINE)* ;
expr: expr ('*'|'/')expr
    | expr ('+'|'-')expr
    |INT
    |'(' expr ')'
    |CHAR
    |'(' expr ')'
    |ID1
    |'(' expr ')'
    |'(' expr ')'
    ;
NEWLINE  :[\r\n]+;
INT      : [0-9]+;
CHAR     : [A-Z]+;
ID1      :[thread.sleep( )]+;



//ignore whitespaces
WS: [\t\r\n]+-> skip;

