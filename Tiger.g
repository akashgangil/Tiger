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
	EXPRS;
	IDS;
	INVOKE;
}

/////////////////////////////////////////////////////////////////////
// Parser
/////////////////////////////////////////////////////////////////////

tiger_program
	: (type_declaration_list function_declaration_list EOF) -> ^(PROGRAM type_declaration_list function_declaration_list)
	;

type_declaration_list
	:	(type_declaration type_declaration_list) -> ^(TYPES type_declaration type_declaration_list)
	|	
	;

type_declaration
	:	(TYPE ID EQ type SEMI) -> ^(TYPE ID type)
	;

function_declaration_list
	:	(function_definition function_declaration_list) -> ^(FUNCTIONS function_definition function_declaration_list) 
	|	
	;

function_definition
	:	type_id FUNCTION function_definition_body
	|	VOID function_definition_void
	;

function_definition_void
	:	FUNCTION function_definition_body
	|	MAIN function_definition_main
	;

function_definition_body
	:	(ID LPAREN param_list RPAREN BEGIN block_list END SEMI) -> ^(FUNCTION ID param_list block_list)
	;
	
function_definition_main
	:	(LPAREN RPAREN block_list) -> ^(MAIN block_list)
	;

param_list
	:	param param_list_tail -> ^(PARAMS param param_list_tail)
	|	
	;
	
param_list_tail
	:	(COMMA param param_list_tail) -> param param_list_tail
	|	
	;
	
param	
	:	ID COLON type_id -> ^(COLON ID type_id)
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
	|	(ARRAY array_index_const OF base_type) -> ^(ARRAY array_index_const base_type)
	|	(ARRAY width=array_index_const height=array_index_const OF base_type) -> ^(ARRAY $width $height base_type)
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
	:	ID id_list_tail
	;

id_list_tail
	:	COMMA ID id_list_tail -> ID
	|
	;

optional_int
	:	ASSIGN constant
	|	
	;

stat_seq
	:	(stat)*
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

stat
	:	value ASSIGN stat_assignment -> ^(ASSIGN value stat_assignment)
	|	if_stmt
	|	(WHILE expr DO stat_seq ENDDO SEMI) -> ^(WHILE expr stat_seq)
	|	(FOR ID ASSIGN range DO stat_seq ENDDO SEMI) -> ^(FOR range stat_seq)
	|	BREAK SEMI -> BREAK
	|	RETURN expr SEMI -> ^(RETURN expr)
	|	block
	|	funct_call SEMI -> funct_call
	;

range
	:	(start=index_expr TO stop=index_expr) -> ^(TO $start $stop)
	;

stat_assignment
	:	expr SEMI -> expr
	|	IF LPAREN expr_list RPAREN SEMI
	;

if_stmt
	:	IF expr  then_stmt-> ^(IF expr then_stmt)
	;
	
then_stmt
	: 	THEN stat_seq if_tail -> ^(THEN stat_seq if_tail)
	;
if_tail
	:	ELSE stat_seq ENDIF SEMI -> ^(ELSE stat_seq)
	|	ENDIF SEMI
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

value
	:	ID value_tail
	;

value_tail
	:	array_index array_index?
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

funct_call
	: ID LPAREN id_list RPAREN -> ^(INVOKE ID id_list)
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
