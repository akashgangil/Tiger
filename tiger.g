grammar tiger;

options {
  output = AST;
  language = Java;
}

/////////////////////////////////////////////////////////////////////
// Parser
/////////////////////////////////////////////////////////////////////

tiger_program: type_declaration_list funct_declaration_list main_function;

type_declaration_list
	:	type_declaration type_declaration_list
	|	
	;

type_declaration
	:	TYPE ID EQ type SEMI
	;

funct_declaration_list
	:	funct_declaration funct_declaration_list
	|	
	;

funct_declaration
	:	ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
	;
	
main_function
	:	VOID MAIN LPAREN RPAREN block_list EOF
	;
	
ret_type
	: 	VOID
	| 	type_id
	;

param_list
	:	param param_list_tail
	|	
	;
	
param_list_tail
	:	COMMA param param_list_tail
	|	
	;
	
param	
	:	ID COLON type_id
	;
	
block_list
	:	block block_tail
	;

block_tail
	:	block block_tail
	;

block
	:	BEGIN declaration_segment stat_seq END SEMI
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
	|	ARRAY LBRACK INTLIT RBRACK OF base_type
	|	ARRAY LBRACK INTLIT RBRACK LPAREN INTLIT RPAREN OF base_type
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
	:	VAR id_list COLON type_id optional_init SEMI
	;

optional_init
	:	ASSIGN constant
	|	
	;

id_list
	:	ID
	|	ID COMMA id_list
	;

optional_int
	:	ASSIGN constant
	|	
	;

stat_seq
	:	(stat)*
	;

expr
	:	(constant | value | LPAREN expr RPAREN) (options{greedy=true;}:binary_operator expr)*
	;

expr_list
	:	expr expr_list_tail
	|	
	;

expr_list_tail
	:	COMMA expr expr_list_tail
	|	
	;

stat
	:	value ASSIGN (expr SEMI | IF LPAREN expr_list RPAREN SEMI)
	|	if_stmt
	|	WHILE expr DO stat_seq ENDDO SEMI
	|	FOR ID ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI
	|	BREAK SEMI
	|	RETURN expr SEMI
	|	block_list
	|	funct_call SEMI
	;

if_stmt
	:	IF expr THEN stat_seq if_tail
	;

if_tail
	:	ELSE stat_seq ENDIF SEMI
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
	|	LESSER
	|	GREATER
	|	LESSER EQ
	|	GREATER EQ
	|	AND
	|	OR
	;

value
	:	ID value_tail
	;

value_tail
	:	LBRACK index_expr RBRACK (LBRACK index_expr RBRACK)?
	|	
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
	: ID LPAREN id_list RPAREN
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
