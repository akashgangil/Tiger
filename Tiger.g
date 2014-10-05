grammar Tiger;

options {
  output = AST;
  language = Java;
  k = 1;
  backtrack = no;
}

tokens {
	PROGRAM;
	TYPES;
	FUNCTIONS;
	FUNCTION;
	MAIN;
	BLOCK;
	PARAMS;
	PARAM;
	EXPRS;
	IDS;
	INVOKE;
	SUBSCRIPT;
}

/////////////////////////////////////////////////////////////////////
// Parser
/////////////////////////////////////////////////////////////////////

tiger_program
	: (opt=type_declaration_list function_declaration_list EOF) 	-> {opt.getTree() != null}? 	^(PROGRAM type_declaration_list function_declaration_list)
																	->								^(PROGRAM function_declaration_list)
	;

type_declaration_list
	:	(type_declaration opt=type_declaration_list) 	-> {opt.getTree() != null}? 	^(TYPES type_declaration type_declaration_list)
														->								^(TYPES type_declaration)
	|	
	;

type_declaration
	:	(TYPE ID EQ type SEMI) -> ^(TYPE ID type)
	;

function_declaration_list
	:	(function_definition opt=function_declaration_list) 	-> {opt.getTree() != null}?		function_definition function_declaration_list
																->								function_definition
	|	
	;

function_definition
	:	(type_id function_definition_body) -> ^(FUNCTION type_id function_definition_body)
	|	(VOID function_definition_void) -> ^(FUNCTION VOID function_definition_void)
	;

function_definition_void
	:	function_definition_body
	|	function_definition_main
	;

function_definition_body
	:	(FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI) -> ^(ID param_list block_list)
	;
	
function_definition_main
	:	(MAIN LPAREN RPAREN block_list) -> ^(MAIN block_list)
	;

param_list
	:	param param_list_tail -> ^(PARAMS param param_list_tail)
	|	
	;
	
param_list_tail
	:	(COMMA param opt=param_list_tail) 	-> {opt.getTree() != null}?		param param_list_tail
											-> 								param
	|	
	;
	
param	
	:	ID COLON type_id -> ^(PARAM ID type_id)
	;
	
block_list
	:	block block_tail
	;

block_tail
	:	block block_tail
	|	
	;

block
	:	(BEGIN opt=declaration_segment stat_seq END SEMI) 	-> {opt.getTree() != null}? 	^(BLOCK $opt stat_seq)
															->								^(BLOCK stat_seq)
	;

declaration_segment
	:	type_declaration_list var_declaration_list
	;

var_declaration_list
	:	var_declaration var_declaration_list
	|	
	;

type
	:	base_type
	|	(ARRAY array_dimension OF base_type) -> ^(ARRAY array_dimension base_type)
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
	:	(VAR id_list COLON type_id optional_init SEMI) -> ^(VAR id_list type_id optional_init)
	;

optional_init
	:	ASSIGN constant -> constant
	|	
	;

id_list
	:	(id_list_head) -> ^(IDS id_list_head)
	;

id_list_head
	:	(ID opt=id_list_tail) 	-> {opt.getTree() != null}?		ID id_list_tail
								->								ID
	;

id_list_tail
	:	COMMA id_list_head -> id_list_head
	|
	;

optional_int
	:	ASSIGN constant
	|	
	;

expr
	:	(constant | value | LPAREN! expr RPAREN!) (options{greedy=true;}:binary_operator^ expr)*
	;

expr_list
	:	expr expr_list_tail -> ^(EXPRS expr expr_list_tail) 
	|	
	;

expr_list_tail
	:	COMMA expr expr_list_tail
	|	
	;

stat_seq
	:	stat*
	;

stat
	:	if_stmt
	|	(WHILE expr DO stat_seq ENDDO SEMI) -> ^(WHILE expr stat_seq)
	|	(FOR ID ASSIGN range DO stat_seq ENDDO SEMI) -> ^(FOR range stat_seq)
	|	BREAK SEMI -> BREAK
	|	RETURN expr SEMI -> ^(RETURN expr)
	|	block
	|	ID statement_ref SEMI -> ^(ID statement_ref)
	;

statement_ref
	:	LPAREN id_list RPAREN -> ^(INVOKE id_list)
	|	opt=optional_subscript ASSIGN statement_assignment 		-> {opt.getTree() != null}?		^(ASSIGN optional_subscript statement_assignment)
																->								^(ASSIGN statement_assignment)
	;

value
	:	(ID opt=optional_subscript)		-> {opt.getTree() != null}? 	^(ID optional_subscript)
										-> 								^(ID)
	;

optional_subscript
	:	(array_subscripts) -> ^(SUBSCRIPT array_subscripts)
	|	
	;

range
	:	(start=index_expr TO stop=index_expr) -> ^(TO $start $stop)
	;

statement_assignment
	:	expr
	|	IF LPAREN expr_list RPAREN -> expr_list
	;

if_stmt
	:	(IF expr THEN stat_seq else_stmt ENDIF SEMI) -> ^(IF expr stat_seq else_stmt)
	;
	
else_stmt
	:	ELSE stat_seq -> stat_seq
	|	
	;

opt_prefix
	:	value ASSIGN
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
	|	LESSER less_equality
	|	GREATER great_equality
	|	AND
	|	OR
	;

less_equality
	:	EQ
	|
	;
	
great_equality
	:	EQ
	|
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
	:	(INTLIT | ID) (options{greedy=true;}: index_oper index_expr)*
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
IF			: 'if';
THEN		: 'then';
ENDIF		: 'endif';
ELSE		: 'else';
WHILE		: 'while';
ENDDO		: 'enddo';
FOR			: 'for';
TO			: 'to';
DO			: 'do';
BREAK		: 'break';
RETURN		: 'return';

COMMA		: ',' ;
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
LESSEREQ 	: '<=';
GREATER 	: '>';
GREATEREQ  	: '>=';
AND 		: '&';
OR 			: '|';
ASSIGN		: ':=';

ID			: ('a'..'z' |'A'..'Z') ('a'..'z'| 'A'..'Z' | '0'..'9')*;
COMMENT		: '/*' .* '*/' {skip();} ;
WS			: (' ' | '\t' | '\r'| '\n') {skip();};
INTLIT		: ('0'..'9') ('0'..'9')*;
FIXEDPTLIT	: INTLIT '.' ('0'..'9') (options{greedy=true;}: ('0'..'9'))? ('0'..'9')?;
