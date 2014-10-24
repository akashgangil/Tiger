grammar Tiger;

options {
	language = Java;
	backtrack = no;
	k = 1;
	output = AST;
}

// AST Nodes

tokens {
	PROGRAM;
	TYPES;
	FUNCTIONS;
	FUNCTION;
	MAIN;
	BLOCK;
	PARAMS;
	EXPR;
	EXPRS;
	IDS;
	INVOKE;
	STATEMENTS;
	REFERENCE;
	VARS;
	VAR;
}

/////////////////////////////////////////////////////////////////////
// Parser
/////////////////////////////////////////////////////////////////////

tiger_program
	: (type_declaration_list function_declaration_list EOF) -> ^(PROGRAM ^(TYPES type_declaration_list?) ^(FUNCTIONS function_declaration_list))
	;

/////////////////////////////////////////////////////////////////////
// Block Declaration Segments
/////////////////////////////////////////////////////////////////////

type_declaration_list
	:	(TYPE ID EQ type SEMI type_declaration_list) -> ^(TYPE ID) type type_declaration_list
	|
	;

function_declaration_list
	:	(type_id FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI) function_declaration_list -> ^(FUNCTION type_id ID ^(PARAMS param_list?)) function_declaration_list?
	|
	;

var_declaration_list
	:	(VAR id_list COLON type_id optional_init SEMI var_declaration_list) -> ^(VAR ^(IDS id_list) type_id optional_init?) var_declaration_list?
	|
	;

/////////////////////////////////////////////////////////////////////
// Functions
/////////////////////////////////////////////////////////////////////

param_list
	:	ID COLON type_id param_list_tail  -> ^(ID type_id) param_list_tail?
	|	
	;
	
param_list_tail
	:	COMMA param_list -> param_list
	|	
	;
	
block_list
	:	block block_tail
	;

block_tail
	:	block block_tail
	|	
	;

block
	:	(BEGIN type_declaration_list var_declaration_list stat_seq END SEMI) -> ^(BLOCK ^(TYPES type_declaration_list?) ^(VARS var_declaration_list?) stat_seq)
	;

type
	:	base_type
	|	(ARRAY array_dimensions OF base_type) -> ^(ARRAY array_dimensions base_type)
	;

type_id
	:	base_type
	|	ID
	;

base_type
	:	INT
	|	FIXEDPT
	;

var_declaration
	:	(VAR id_list COLON type_id optional_init SEMI) -> ^(VAR id_list type_id optional_init?)
	;

optional_init
	:	ASSIGN constant -> constant
	|	
	;

id_list
	:	ID id_list_tail
	;

id_list_tail
	:	COMMA ID id_list_tail -> ID id_list_tail?
	|
	;

/////////////////////////////////////////////////////////////////////
// Expressions
/////////////////////////////////////////////////////////////////////

expr_list
	:	expr expr_list_tail -> ^(EXPRS expr expr_list_tail?) 
	|	
	;

expr_list_tail
	:	(COMMA expr expr_list_tail) -> expr expr_list_tail?
	|	
	;

expr
	:	expr_head expr_tail
	;

expr_tail
	:	(binary_operator expr) -> ^(binary_operator expr)
	|	
	;

expr_head
	:	expr_head_base
	|	(ID	optional_subscript)	-> ^(REFERENCE ID optional_subscript?)
	;

expr_head_base
	:	constant
	|	(LPAREN expr RPAREN)	-> expr
	;

/////////////////////////////////////////////////////////////////////
// Statements
/////////////////////////////////////////////////////////////////////

stat_seq
	:	stat stat_tail -> ^(STATEMENTS stat stat_tail?)
	;

stat_tail
	:	stat stat_tail -> stat stat_tail?
	|
	;

stat
	:	if_stmt
	|	(WHILE expr DO stat_seq ENDDO SEMI) -> ^(WHILE expr stat_seq)
	|	(FOR ID ASSIGN range DO stat_seq ENDDO SEMI) -> ^(FOR range stat_seq)
	|	BREAK SEMI -> BREAK
	|	RETURN expr SEMI -> ^(RETURN expr)
	|	block
	|	ID 	(	
			:	LPAREN expr_list RPAREN 						-> ^(INVOKE ID expr_list?)
			|	optional_subscript ASSIGN statement_assignment 	-> ^(ASSIGN ^(REFERENCE ID optional_subscript?) statement_assignment)
			) SEMI
	;

optional_subscript
	:	array_subscripts
	|	
	;

range
	:	(start=index_expr TO stop=index_expr) -> $start $stop
	;

statement_assignment
	:	(ID statement_assignment_id) -> ^(EXPR ID statement_assignment_id?)
	|	(expr_head_base expr_tail) -> ^(EXPR expr_head_base expr_tail?)
	;

statement_assignment_id
	:	(LPAREN expr_list RPAREN) -> expr_list?
	|	optional_subscript expr_tail
	;

if_stmt
	:	(IF expr THEN stat_seq else_stmt ENDIF SEMI) -> ^(IF expr stat_seq else_stmt?)
	;
	
else_stmt
	:	ELSE stat_seq -> stat_seq
	|	
	;

constant
	:	INTLIT
	|	FIXEDPTLIT
	;

binary_operator
	:	PLUS
	|	MINUS
	|	MULT
	|	DIV
	|	EQ
	|	NEQ
	|	LESSER
	|	GREATER
	|	LEQ
	|	GEQ
	|	AND
	|	OR
	;
	
array_dimensions
	:	array_dimension array_dimension?
	;

array_dimension
	:	(LBRACK INTLIT RBRACK) -> INTLIT
	;

array_subscripts
	:	array_subscript array_subscript?
	;

array_subscript
	:	(LBRACK index_expr RBRACK) -> index_expr
	;

index_expr
	:	index_expr_head index_expr_tail -> ^(EXPR index_expr_head index_expr_tail?)
	;

index_expr_head
	:	INTLIT
	|	ID
	;

index_expr_tail
	:	(index_oper index_expr) -> ^(index_oper index_expr)
	|
	;

index_oper
	:	PLUS
	|	MINUS
	|	MULT
	;

/////////////////////////////////////////////////////////////////////
// Lexer
/////////////////////////////////////////////////////////////////////

FUNCTION	: 'function' ;
BEGIN		: 'begin';
END			: 'end';
VOID		: 'void';
MAIN		: 'main';
TYPE		: 'type';
ARRAY		: 'array';
OF			: 'of';
INT			: 'int';
FIXEDPT		: 'fixedpt';
VAR			: 'var';
IF			: 'if' ;
THEN		: 'then' ;
ENDIF		: 'endif';
ELSE		: 'else';
WHILE		: 'while';
ENDDO		: 'enddo';
FOR			: 'for';
TO			: 'to';
DO			: 'do';
BREAK		: 'break';
RETURN		: 'return';

COMMA		: ',';
COLON		: ':';
SEMI		: ';';
LPAREN		: '(';
RPAREN		: ')';
LBRACK		: '[';
RBRACK		: ']';
PLUS 		: '+';
MINUS 		: '-';
MULT 		: '*';
DIV 		: '/';
EQ			: '=';
NEQ 		: '<>';
LESSER 		: '<';
GREATER 	: '>';
LEQ			: '<=';
GEQ			: '>=';
AND 		: '&';
OR 			: '|';
ASSIGN		: ':=';

ID			: ('a'..'z' |'A'..'Z') ('a'..'z'| 'A'..'Z' | '0'..'9' | '_')*;
COMMENT		: '/*' .* '*/' {skip();} ;
WS			: (' ' | '\t' | '\r'| '\n') {skip();};
INTLIT		: ('0'..'9') ('0'..'9')*;
FIXEDPTLIT	: INTLIT '.' ('0'..'9') (options{greedy=true;}: ('0'..'9'))? ('0'..'9')?;
