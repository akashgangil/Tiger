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
	DIMENSION;
	RANGE;
	IFTRUE;
	IFFALSE;
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
	:	(return_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI) function_declaration_list -> ^(FUNCTION return_type ID ^(PARAMS param_list?)) function_declaration_list?
	|
	;

var_declaration_list
	:	(VAR id_list COLON type_id (ASSIGN constant)? SEMI var_declaration_list) -> ^(VAR ^(IDS id_list) type_id constant?) var_declaration_list?
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

/////////////////////////////////////////////////////////////////////
// Blocks
/////////////////////////////////////////////////////////////////////

block_list
	:	block block_tail
	;

block_tail
	:	block block_tail
	|	
	;

block
	:	(BEGIN type_declaration_list var_declaration_list stat_list END SEMI) -> ^(BLOCK ^(TYPES type_declaration_list?) ^(VARS var_declaration_list?) stat_list)
	;

/////////////////////////////////////////////////////////////////////
// Types
/////////////////////////////////////////////////////////////////////

type
	:	base_type
	|	ARRAY LBRACK rows=INTLIT RBRACK (LBRACK columns=INTLIT RBRACK)? OF base_type -> ^(ARRAY ^(DIMENSION $rows $columns) base_type)
	;

return_type
	:	type_id
	|	VOID
	;

type_id
	:	base_type
	|	ID
	;

base_type
	:	INT
	|	FIXEDPT
	;

/////////////////////////////////////////////////////////////////////
// Id
/////////////////////////////////////////////////////////////////////

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
	:	expr expr_list_tail
	|	
	;

expr_list_tail
	:	COMMA expr expr_list_tail -> expr expr_list_tail?
	|	
	;

expr
	:	expr_isolate	(
						:	binary_operator expr	-> ^(binary_operator expr_isolate expr)
						|							-> ^(expr_isolate)
						)
	;

expr_isolate
	:	constant
	|	LPAREN expr RPAREN 		-> expr
	|	ID optional_subscript	-> ^(ID optional_subscript?)
	;

/////////////////////////////////////////////////////////////////////
// Statements
/////////////////////////////////////////////////////////////////////

stat_list
	:	statement stat_tail -> ^(STATEMENTS statement stat_tail?)
	;

stat_tail
	:	statement stat_tail -> statement stat_tail?
	|
	;

statement
	:	if_stmt
	|	WHILE expr DO stat_list ENDDO SEMI -> ^(WHILE expr stat_list)
	|	FOR ID ASSIGN (start=index_expr TO stop=index_expr) DO stat_list ENDDO SEMI -> ^(FOR ^(RANGE $start $stop) stat_list)
	|	BREAK SEMI -> BREAK
	|	RETURN expr SEMI -> ^(RETURN expr)
	|	block
	|	ID 	(	
			:	LPAREN expr_list RPAREN 						-> ^(INVOKE ID expr_list?)
			|	optional_subscript ASSIGN statement_assignment 	-> ^(ASSIGN ^(REFERENCE ID optional_subscript?) statement_assignment)
			) SEMI
	;

statement_assignment
	:	ID statement_assignment_id -> ^(EXPR ID statement_assignment_id?)
	|	statement_assignment_expr_isolate	(
											:	binary_operator expr	-> ^(binary_operator statement_assignment_expr_isolate expr)
											|							-> ^(statement_assignment_expr_isolate)
											)
	;

// A base expression with the possibility of ID factored out
statement_assignment_expr_isolate
	:	constant
	|	LPAREN expr RPAREN 		-> expr
	;

statement_assignment_id
	:	LPAREN expr_list RPAREN -> expr_list?
	|	optional_subscript	(
							:	binary_operator expr	
							|	
							)
	;

if_stmt
	:	(IF expr THEN iftrue=stat_list (options {greedy=true;}: ELSE iffalse=stat_list)? ENDIF SEMI) -> ^(IF expr ^(IFTRUE $iftrue) ^(IFFALSE $iffalse?))
	;

/////////////////////////////////////////////////////////////////////
// Array References
/////////////////////////////////////////////////////////////////////

optional_subscript
	:	LBRACK row=index_expr RBRACK (LBRACK width=index_expr RBRACK)? -> $row $width
	|	
	;

constant
	:	INTLIT
	|	FIXEDPTLIT
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

/////////////////////////////////////////////////////////////////////
// Lexer
/////////////////////////////////////////////////////////////////////

FUNCTION	: 'function' ;
BEGIN		: 'begin';
END			: 'end';
VOID		: 'void';
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
