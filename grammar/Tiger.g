grammar Tiger;

options {
	language = Java;
	backtrack = no;
	k = 1;
	output = AST;
}

/////////////////////////////////////////////////////////////////////
// AST Nodes
/////////////////////////////////////////////////////////////////////

tokens {
	PROGRAM;
	CONSTANT;
	TYPES;
	FUNCS;
	FUNC;
	MAIN;
	BLOCKS;
	BLOCK;
	STATEMENTS;
	PARAMS;
	PARAM;
	EXPR;
	EXPRS;
	IDS;
	INVOKE;
	STATEMENTS;
	REFERENCE;
	VARS;
	VAR;
	DIMENSION;
}

/////////////////////////////////////////////////////////////////////
// Error Handling
/////////////////////////////////////////////////////////////////////

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
	: (type_declaration_list function_declaration_list EOF) -> ^(PROGRAM ^(TYPES type_declaration_list?) ^(FUNCS function_declaration_list))
	;

/////////////////////////////////////////////////////////////////////
// Block Declaration Segments
/////////////////////////////////////////////////////////////////////

type_declaration_list
	:	(TYPE ID EQ type SEMI type_declaration_list) -> ^(TYPE ID type) type_declaration_list?
	|
	;

function_declaration_list
	:	(return_type (FUNCTION name=ID | name=MAIN) LPAREN param_list RPAREN BEGIN block_list END SEMI) function_declaration_list -> ^(FUNC return_type $name ^(PARAMS param_list?) ^(BLOCKS block_list)) function_declaration_list?
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
	:	ID COLON type_id param_list_tail  -> ^(PARAM ID type_id) param_list_tail?
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
	:	(BEGIN type_declaration_list var_declaration_list stat_list END SEMI) -> ^(BLOCK ^(TYPES type_declaration_list?) ^(VARS var_declaration_list?) ^(STATEMENTS stat_list))
	;

/////////////////////////////////////////////////////////////////////
// Types
/////////////////////////////////////////////////////////////////////

type
	:	base_type
	|	ARRAY LBRACK rows=INTLIT RBRACK (LBRACK columns=INTLIT RBRACK)? OF base_type -> base_type $rows $columns?
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
	:	expr_2 ((AND | OR)^ expr_2)*
	;

expr_2
	:	expr_3 ((EQ | NEQ | LESSER | GREATER | LEQ | GEQ)^ expr_3)*
	;

expr_3
	:	expr_4 ((PLUS | MINUS)^ expr_4)*
	;

expr_4
	:	expr_atom ((MULT | DIV)^ expr_atom)*
	;

expr_atom
	:	constant							-> ^(CONSTANT constant)
	|	LPAREN expr RPAREN 					-> expr
	|	ID	(
			:	optional_subscript			-> ^(REFERENCE ID optional_subscript?)
			|	LPAREN expr_list RPAREN		-> ^(INVOKE ID ^(EXPRS expr_list?))
			)
	;

constant
	:	INTLIT
	|	FIXEDPTLIT
	;

/////////////////////////////////////////////////////////////////////
// Statements
/////////////////////////////////////////////////////////////////////

stat_list
	:	statement stat_tail
	;

stat_tail
	:	statement stat_tail -> statement stat_tail?
	|
	;


//
// Because of special cases this whole thing has to be factored significantly ................ AGHHHHHHHHHHHHHH
// 

statement
	:	IF expr THEN iftrue=stat_list (options {greedy=true;}: ELSE iffalse=stat_list)? ENDIF SEMI -> ^(IF expr ^(STATEMENTS $iftrue) ^(STATEMENTS $iffalse?))
	|	WHILE expr DO stat_list ENDDO SEMI -> ^(WHILE expr ^(STATEMENTS stat_list))
	|	FOR ID ASSIGN (start=index_expr TO stop=index_expr) DO stat_list ENDDO SEMI -> ^(FOR ID $start $stop ^(STATEMENTS stat_list))
	|	BREAK SEMI -> BREAK
	|	RETURN expr SEMI -> ^(RETURN expr)
	|	block
	|	ID 	(
			:	LPAREN expr_list RPAREN 						-> ^(INVOKE ID ^(EXPRS expr_list?))										// Function Call
			|	optional_subscript ASSIGN expr 					-> ^(ASSIGN ^(REFERENCE ID optional_subscript?) expr)		// Assignment
			) SEMI
	;

/////////////////////////////////////////////////////////////////////
// Array References
/////////////////////////////////////////////////////////////////////

optional_subscript
	:	LBRACK row=index_expr RBRACK (LBRACK width=index_expr RBRACK)? -> $row $width?
	|	
	;

index_expr
	:	index_expr_2 ((PLUS^ | MINUS^) index_expr_2)* 
	;

index_expr_2
	:	index_expr_atom (MULT^ index_expr_atom)*
	;

index_expr_atom
	:	INTLIT -> ^(CONSTANT INTLIT)
	|	ID -> ^(REFERENCE ID)
	;

/////////////////////////////////////////////////////////////////////
// Lexer
/////////////////////////////////////////////////////////////////////

FUNCTION	: 'function';
MAIN		: 'main';
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
