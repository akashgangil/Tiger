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
	STATEMENTS;
	REFERENCE;
	VARIABLES;
}

//add new members to generated lexer
@lexer::members {
    private  java.util.List<String> errors = new java.util.LinkedList<String>();
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        errors.add(hdr + " " + msg +  "           Character at which the error occurred: " +  "['" + Character.toString((char)e.c) + "']");
    }
    public  java.util.List<String> getErrors() {
        return errors;
    }
}

//add new members to generated parser
@parser::members {
    private  java.util.List<String> errors = new java.util.LinkedList<String>();
    public   void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        errors.add(hdr + " " + msg + "            Character at which the error occurred: " +  "['" + Character.toString((char)e.c) + "']");
    }
    public java.util.List<String> getErrors() {
        return errors;
    }
}


/////////////////////////////////////////////////////////////////////
// Parser
/////////////////////////////////////////////////////////////////////

tiger_program
	: (type_declaration_list function_declaration_list EOF) -> ^(PROGRAM type_declaration_list? function_declaration_list)
	;

type_declaration_list
	:	(type_declaration_tail) -> ^(TYPES type_declaration_tail?)
	;

type_declaration_tail
	:	type_declaration type_declaration_tail
	|
	;

type_declaration
	:	(TYPE ID EQ type SEMI) -> ^(TYPE ID type)
	;

function_declaration_list
	:	function_declaration_tail -> ^(FUNCTIONS function_declaration_tail?)
	;

function_declaration_tail
	:	function_definition function_declaration_tail
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
	:	(FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI) -> ID param_list block_list
	;
	
function_definition_main
	:	(MAIN LPAREN RPAREN block_list) -> MAIN PARAMS block_list
	;

param_list
	:	param_list_internal -> ^(PARAMS param_list_internal?)
	;

param_list_internal
	:	param param_list_tail
	|	
	;
	
param_list_tail
	:	(COMMA param param_list_tail) -> param param_list_tail?
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
	:	(BEGIN declaration_segment stat_seq END SEMI) -> ^(BLOCK declaration_segment? stat_seq)
	;

declaration_segment
	:	type_declaration_list var_declaration_list
	;

var_declaration_list
	:	var_declaration_tail -> ^(VARIABLES var_declaration_tail?)
	;

var_declaration_tail
	:	var_declaration var_declaration_tail
	|
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
	:	(id_list_head) -> ^(IDS id_list_head)
	;

id_list_head
	:	(ID id_list_tail) -> ID id_list_tail?
	;

id_list_tail
	:	COMMA id_list_head -> id_list_head
	|
	;

optional_int
	:	ASSIGN constant -> constant
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
	:	binary_operator expr
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
			:	LPAREN expr_list RPAREN 		-> ^(INVOKE ID expr_list?)
			|	optional_subscript ASSIGN statement_assignment -> ^(ASSIGN ID statement_assignment)
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
	:	ID statement_assignment_id
	|	expr_head_base expr_tail
	;

statement_assignment_id
	:	LPAREN expr_list RPAREN 
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
