grammar ScientificCalc;

prog
    : stat+ EOF
    ;

stat
    : expr NEWLINE # printExpr
    | ID '=' expr NEWLINE # assign
    | NEWLINE # blank
    ;

expr
    : <assoc=right> expr '^' expr # power
    | op=('+'|'-') expr # unary
    | expr op=('*'|'/') expr # mulDiv
    | expr op=('+'|'-') expr # addSub
    | function '(' expr ')' # functionCall
    | NUMBER # number
    | ID # id
    | '(' expr ')' # parens
    ;

function
    : 'sin'
    | 'cos'
    | 'tan'
    | 'sqrt'
    | 'log'
    | 'ln'
    | 'abs'
    | 'exp'
    ;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
POW : '^';

NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NEWLINE
    : '\r'? '\n'
    ;

WS
    : [ \t]+ -> skip
    ;
