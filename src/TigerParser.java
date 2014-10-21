// $ANTLR 3.5.1 grammar/Tiger.g 2014-10-21 18:30:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class TigerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "BEGIN", 
		"BLOCK", "BREAK", "COLON", "COMMA", "COMMENT", "DIV", "DO", "ELSE", "END", 
		"ENDDO", "ENDIF", "EQ", "EXPR", "EXPRS", "FIXEDPT", "FIXEDPTLIT", "FOR", 
		"FUNCTION", "FUNCTIONS", "GEQ", "GREATER", "ID", "IDS", "IF", "INT", "INTLIT", 
		"INVOKE", "LBRACK", "LEQ", "LESSER", "LPAREN", "MAIN", "MINUS", "MULT", 
		"NEQ", "OF", "OR", "PARAM", "PARAMS", "PLUS", "PROGRAM", "RBRACK", "REFERENCE", 
		"RETURN", "RPAREN", "SEMI", "STATEMENTS", "THEN", "TO", "TYPE", "TYPES", 
		"VAR", "VARIABLES", "VOID", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ARRAY=5;
	public static final int ASSIGN=6;
	public static final int BEGIN=7;
	public static final int BLOCK=8;
	public static final int BREAK=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int DIV=13;
	public static final int DO=14;
	public static final int ELSE=15;
	public static final int END=16;
	public static final int ENDDO=17;
	public static final int ENDIF=18;
	public static final int EQ=19;
	public static final int EXPR=20;
	public static final int EXPRS=21;
	public static final int FIXEDPT=22;
	public static final int FIXEDPTLIT=23;
	public static final int FOR=24;
	public static final int FUNCTION=25;
	public static final int FUNCTIONS=26;
	public static final int GEQ=27;
	public static final int GREATER=28;
	public static final int ID=29;
	public static final int IDS=30;
	public static final int IF=31;
	public static final int INT=32;
	public static final int INTLIT=33;
	public static final int INVOKE=34;
	public static final int LBRACK=35;
	public static final int LEQ=36;
	public static final int LESSER=37;
	public static final int LPAREN=38;
	public static final int MAIN=39;
	public static final int MINUS=40;
	public static final int MULT=41;
	public static final int NEQ=42;
	public static final int OF=43;
	public static final int OR=44;
	public static final int PARAM=45;
	public static final int PARAMS=46;
	public static final int PLUS=47;
	public static final int PROGRAM=48;
	public static final int RBRACK=49;
	public static final int REFERENCE=50;
	public static final int RETURN=51;
	public static final int RPAREN=52;
	public static final int SEMI=53;
	public static final int STATEMENTS=54;
	public static final int THEN=55;
	public static final int TO=56;
	public static final int TYPE=57;
	public static final int TYPES=58;
	public static final int VAR=59;
	public static final int VARIABLES=60;
	public static final int VOID=61;
	public static final int WHILE=62;
	public static final int WS=63;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TigerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TigerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return TigerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "grammar/Tiger.g"; }


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


	public static class tiger_program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tiger_program"
	// grammar/Tiger.g:61:1: tiger_program : ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ( type_declaration_list )? function_declaration_list ) ;
	public final TigerParser.tiger_program_return tiger_program() throws RecognitionException {
		TigerParser.tiger_program_return retval = new TigerParser.tiger_program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope type_declaration_list1 =null;
		ParserRuleReturnScope function_declaration_list2 =null;

		Object EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
		RewriteRuleSubtreeStream stream_type_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_list");

		try {
			// grammar/Tiger.g:62:2: ( ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ( type_declaration_list )? function_declaration_list ) )
			// grammar/Tiger.g:62:4: ( type_declaration_list function_declaration_list EOF )
			{
			// grammar/Tiger.g:62:4: ( type_declaration_list function_declaration_list EOF )
			// grammar/Tiger.g:62:5: type_declaration_list function_declaration_list EOF
			{
			pushFollow(FOLLOW_type_declaration_list_in_tiger_program143);
			type_declaration_list1=type_declaration_list();
			state._fsp--;

			stream_type_declaration_list.add(type_declaration_list1.getTree());
			pushFollow(FOLLOW_function_declaration_list_in_tiger_program145);
			function_declaration_list2=function_declaration_list();
			state._fsp--;

			stream_function_declaration_list.add(function_declaration_list2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_tiger_program147);  
			stream_EOF.add(EOF3);

			}

			// AST REWRITE
			// elements: type_declaration_list, function_declaration_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 62:58: -> ^( PROGRAM ( type_declaration_list )? function_declaration_list )
			{
				// grammar/Tiger.g:62:61: ^( PROGRAM ( type_declaration_list )? function_declaration_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// grammar/Tiger.g:62:71: ( type_declaration_list )?
				if ( stream_type_declaration_list.hasNext() ) {
					adaptor.addChild(root_1, stream_type_declaration_list.nextTree());
				}
				stream_type_declaration_list.reset();

				adaptor.addChild(root_1, stream_function_declaration_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tiger_program"


	public static class type_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_declaration_list"
	// grammar/Tiger.g:65:1: type_declaration_list : ( type_declaration_tail ) -> ^( TYPES ( type_declaration_tail )? ) ;
	public final TigerParser.type_declaration_list_return type_declaration_list() throws RecognitionException {
		TigerParser.type_declaration_list_return retval = new TigerParser.type_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_tail4 =null;

		RewriteRuleSubtreeStream stream_type_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_tail");

		try {
			// grammar/Tiger.g:66:2: ( ( type_declaration_tail ) -> ^( TYPES ( type_declaration_tail )? ) )
			// grammar/Tiger.g:66:4: ( type_declaration_tail )
			{
			// grammar/Tiger.g:66:4: ( type_declaration_tail )
			// grammar/Tiger.g:66:5: type_declaration_tail
			{
			pushFollow(FOLLOW_type_declaration_tail_in_type_declaration_list171);
			type_declaration_tail4=type_declaration_tail();
			state._fsp--;

			stream_type_declaration_tail.add(type_declaration_tail4.getTree());
			}

			// AST REWRITE
			// elements: type_declaration_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:28: -> ^( TYPES ( type_declaration_tail )? )
			{
				// grammar/Tiger.g:66:31: ^( TYPES ( type_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);
				// grammar/Tiger.g:66:39: ( type_declaration_tail )?
				if ( stream_type_declaration_tail.hasNext() ) {
					adaptor.addChild(root_1, stream_type_declaration_tail.nextTree());
				}
				stream_type_declaration_tail.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_declaration_list"


	public static class type_declaration_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_declaration_tail"
	// grammar/Tiger.g:69:1: type_declaration_tail : ( type_declaration type_declaration_tail |);
	public final TigerParser.type_declaration_tail_return type_declaration_tail() throws RecognitionException {
		TigerParser.type_declaration_tail_return retval = new TigerParser.type_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration5 =null;
		ParserRuleReturnScope type_declaration_tail6 =null;


		try {
			// grammar/Tiger.g:70:2: ( type_declaration type_declaration_tail |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TYPE) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF||LA1_0==BEGIN||LA1_0==BREAK||LA1_0==FIXEDPT||LA1_0==FOR||LA1_0==ID||(LA1_0 >= IF && LA1_0 <= INT)||LA1_0==RETURN||LA1_0==VAR||(LA1_0 >= VOID && LA1_0 <= WHILE)) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// grammar/Tiger.g:70:4: type_declaration type_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_declaration_in_type_declaration_tail192);
					type_declaration5=type_declaration();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration5.getTree());

					pushFollow(FOLLOW_type_declaration_tail_in_type_declaration_tail194);
					type_declaration_tail6=type_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration_tail6.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:72:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_declaration_tail"


	public static class type_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_declaration"
	// grammar/Tiger.g:74:1: type_declaration : ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) ;
	public final TigerParser.type_declaration_return type_declaration() throws RecognitionException {
		TigerParser.type_declaration_return retval = new TigerParser.type_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE7=null;
		Token ID8=null;
		Token EQ9=null;
		Token SEMI11=null;
		ParserRuleReturnScope type10 =null;

		Object TYPE7_tree=null;
		Object ID8_tree=null;
		Object EQ9_tree=null;
		Object SEMI11_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// grammar/Tiger.g:75:2: ( ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) )
			// grammar/Tiger.g:75:4: ( TYPE ID EQ type SEMI )
			{
			// grammar/Tiger.g:75:4: ( TYPE ID EQ type SEMI )
			// grammar/Tiger.g:75:5: TYPE ID EQ type SEMI
			{
			TYPE7=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_declaration209);  
			stream_TYPE.add(TYPE7);

			ID8=(Token)match(input,ID,FOLLOW_ID_in_type_declaration211);  
			stream_ID.add(ID8);

			EQ9=(Token)match(input,EQ,FOLLOW_EQ_in_type_declaration213);  
			stream_EQ.add(EQ9);

			pushFollow(FOLLOW_type_in_type_declaration215);
			type10=type();
			state._fsp--;

			stream_type.add(type10.getTree());
			SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_type_declaration217);  
			stream_SEMI.add(SEMI11);

			}

			// AST REWRITE
			// elements: type, TYPE, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 75:27: -> ^( TYPE ID type )
			{
				// grammar/Tiger.g:75:30: ^( TYPE ID type )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_declaration"


	public static class function_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_declaration_list"
	// grammar/Tiger.g:78:1: function_declaration_list : function_declaration_tail -> ^( FUNCTIONS ( function_declaration_tail )? ) ;
	public final TigerParser.function_declaration_list_return function_declaration_list() throws RecognitionException {
		TigerParser.function_declaration_list_return retval = new TigerParser.function_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_declaration_tail12 =null;

		RewriteRuleSubtreeStream stream_function_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_tail");

		try {
			// grammar/Tiger.g:79:2: ( function_declaration_tail -> ^( FUNCTIONS ( function_declaration_tail )? ) )
			// grammar/Tiger.g:79:4: function_declaration_tail
			{
			pushFollow(FOLLOW_function_declaration_tail_in_function_declaration_list239);
			function_declaration_tail12=function_declaration_tail();
			state._fsp--;

			stream_function_declaration_tail.add(function_declaration_tail12.getTree());
			// AST REWRITE
			// elements: function_declaration_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:30: -> ^( FUNCTIONS ( function_declaration_tail )? )
			{
				// grammar/Tiger.g:79:33: ^( FUNCTIONS ( function_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_1);
				// grammar/Tiger.g:79:45: ( function_declaration_tail )?
				if ( stream_function_declaration_tail.hasNext() ) {
					adaptor.addChild(root_1, stream_function_declaration_tail.nextTree());
				}
				stream_function_declaration_tail.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_declaration_list"


	public static class function_declaration_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_declaration_tail"
	// grammar/Tiger.g:82:1: function_declaration_tail : ( function_definition function_declaration_tail |);
	public final TigerParser.function_declaration_tail_return function_declaration_tail() throws RecognitionException {
		TigerParser.function_declaration_tail_return retval = new TigerParser.function_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_definition13 =null;
		ParserRuleReturnScope function_declaration_tail14 =null;


		try {
			// grammar/Tiger.g:83:2: ( function_definition function_declaration_tail |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FIXEDPT||LA2_0==ID||LA2_0==INT||LA2_0==VOID) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// grammar/Tiger.g:83:4: function_definition function_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_in_function_declaration_tail259);
					function_definition13=function_definition();
					state._fsp--;

					adaptor.addChild(root_0, function_definition13.getTree());

					pushFollow(FOLLOW_function_declaration_tail_in_function_declaration_tail261);
					function_declaration_tail14=function_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, function_declaration_tail14.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:85:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_declaration_tail"


	public static class function_definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_definition"
	// grammar/Tiger.g:87:1: function_definition : ( ( type_id function_definition_body ) -> ^( FUNCTION type_id function_definition_body ) | ( VOID function_definition_void ) -> ^( FUNCTION VOID function_definition_void ) );
	public final TigerParser.function_definition_return function_definition() throws RecognitionException {
		TigerParser.function_definition_return retval = new TigerParser.function_definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VOID17=null;
		ParserRuleReturnScope type_id15 =null;
		ParserRuleReturnScope function_definition_body16 =null;
		ParserRuleReturnScope function_definition_void18 =null;

		Object VOID17_tree=null;
		RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_function_definition_void=new RewriteRuleSubtreeStream(adaptor,"rule function_definition_void");
		RewriteRuleSubtreeStream stream_function_definition_body=new RewriteRuleSubtreeStream(adaptor,"rule function_definition_body");

		try {
			// grammar/Tiger.g:88:2: ( ( type_id function_definition_body ) -> ^( FUNCTION type_id function_definition_body ) | ( VOID function_definition_void ) -> ^( FUNCTION VOID function_definition_void ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==FIXEDPT||LA3_0==ID||LA3_0==INT) ) {
				alt3=1;
			}
			else if ( (LA3_0==VOID) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// grammar/Tiger.g:88:4: ( type_id function_definition_body )
					{
					// grammar/Tiger.g:88:4: ( type_id function_definition_body )
					// grammar/Tiger.g:88:5: type_id function_definition_body
					{
					pushFollow(FOLLOW_type_id_in_function_definition276);
					type_id15=type_id();
					state._fsp--;

					stream_type_id.add(type_id15.getTree());
					pushFollow(FOLLOW_function_definition_body_in_function_definition278);
					function_definition_body16=function_definition_body();
					state._fsp--;

					stream_function_definition_body.add(function_definition_body16.getTree());
					}

					// AST REWRITE
					// elements: function_definition_body, type_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 88:39: -> ^( FUNCTION type_id function_definition_body )
					{
						// grammar/Tiger.g:88:42: ^( FUNCTION type_id function_definition_body )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
						adaptor.addChild(root_1, stream_type_id.nextTree());
						adaptor.addChild(root_1, stream_function_definition_body.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:89:4: ( VOID function_definition_void )
					{
					// grammar/Tiger.g:89:4: ( VOID function_definition_void )
					// grammar/Tiger.g:89:5: VOID function_definition_void
					{
					VOID17=(Token)match(input,VOID,FOLLOW_VOID_in_function_definition295);  
					stream_VOID.add(VOID17);

					pushFollow(FOLLOW_function_definition_void_in_function_definition297);
					function_definition_void18=function_definition_void();
					state._fsp--;

					stream_function_definition_void.add(function_definition_void18.getTree());
					}

					// AST REWRITE
					// elements: VOID, function_definition_void
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:36: -> ^( FUNCTION VOID function_definition_void )
					{
						// grammar/Tiger.g:89:39: ^( FUNCTION VOID function_definition_void )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
						adaptor.addChild(root_1, stream_VOID.nextNode());
						adaptor.addChild(root_1, stream_function_definition_void.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_definition"


	public static class function_definition_void_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_definition_void"
	// grammar/Tiger.g:92:1: function_definition_void : ( function_definition_body | function_definition_main );
	public final TigerParser.function_definition_void_return function_definition_void() throws RecognitionException {
		TigerParser.function_definition_void_return retval = new TigerParser.function_definition_void_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_definition_body19 =null;
		ParserRuleReturnScope function_definition_main20 =null;


		try {
			// grammar/Tiger.g:93:2: ( function_definition_body | function_definition_main )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==FUNCTION) ) {
				alt4=1;
			}
			else if ( (LA4_0==MAIN) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// grammar/Tiger.g:93:4: function_definition_body
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_body_in_function_definition_void319);
					function_definition_body19=function_definition_body();
					state._fsp--;

					adaptor.addChild(root_0, function_definition_body19.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:94:4: function_definition_main
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_main_in_function_definition_void324);
					function_definition_main20=function_definition_main();
					state._fsp--;

					adaptor.addChild(root_0, function_definition_main20.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_definition_void"


	public static class function_definition_body_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_definition_body"
	// grammar/Tiger.g:97:1: function_definition_body : ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) -> ID ^( PARAMS ( param_list )? ) block_list ;
	public final TigerParser.function_definition_body_return function_definition_body() throws RecognitionException {
		TigerParser.function_definition_body_return retval = new TigerParser.function_definition_body_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION21=null;
		Token ID22=null;
		Token LPAREN23=null;
		Token RPAREN25=null;
		Token BEGIN26=null;
		Token END28=null;
		Token SEMI29=null;
		ParserRuleReturnScope param_list24 =null;
		ParserRuleReturnScope block_list27 =null;

		Object FUNCTION21_tree=null;
		Object ID22_tree=null;
		Object LPAREN23_tree=null;
		Object RPAREN25_tree=null;
		Object BEGIN26_tree=null;
		Object END28_tree=null;
		Object SEMI29_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_block_list=new RewriteRuleSubtreeStream(adaptor,"rule block_list");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// grammar/Tiger.g:98:2: ( ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) -> ID ^( PARAMS ( param_list )? ) block_list )
			// grammar/Tiger.g:98:4: ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			{
			// grammar/Tiger.g:98:4: ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			// grammar/Tiger.g:98:5: FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			FUNCTION21=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_definition_body336);  
			stream_FUNCTION.add(FUNCTION21);

			ID22=(Token)match(input,ID,FOLLOW_ID_in_function_definition_body338);  
			stream_ID.add(ID22);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_definition_body340);  
			stream_LPAREN.add(LPAREN23);

			pushFollow(FOLLOW_param_list_in_function_definition_body342);
			param_list24=param_list();
			state._fsp--;

			stream_param_list.add(param_list24.getTree());
			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition_body344);  
			stream_RPAREN.add(RPAREN25);

			BEGIN26=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_function_definition_body346);  
			stream_BEGIN.add(BEGIN26);

			pushFollow(FOLLOW_block_list_in_function_definition_body348);
			block_list27=block_list();
			state._fsp--;

			stream_block_list.add(block_list27.getTree());
			END28=(Token)match(input,END,FOLLOW_END_in_function_definition_body350);  
			stream_END.add(END28);

			SEMI29=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_definition_body352);  
			stream_SEMI.add(SEMI29);

			}

			// AST REWRITE
			// elements: ID, param_list, block_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 98:69: -> ID ^( PARAMS ( param_list )? ) block_list
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
				// grammar/Tiger.g:98:75: ^( PARAMS ( param_list )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
				// grammar/Tiger.g:98:84: ( param_list )?
				if ( stream_param_list.hasNext() ) {
					adaptor.addChild(root_1, stream_param_list.nextTree());
				}
				stream_param_list.reset();

				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, stream_block_list.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_definition_body"


	public static class function_definition_main_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_definition_main"
	// grammar/Tiger.g:101:1: function_definition_main : ( MAIN LPAREN RPAREN block_list ) -> MAIN PARAMS block_list ;
	public final TigerParser.function_definition_main_return function_definition_main() throws RecognitionException {
		TigerParser.function_definition_main_return retval = new TigerParser.function_definition_main_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MAIN30=null;
		Token LPAREN31=null;
		Token RPAREN32=null;
		ParserRuleReturnScope block_list33 =null;

		Object MAIN30_tree=null;
		Object LPAREN31_tree=null;
		Object RPAREN32_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_block_list=new RewriteRuleSubtreeStream(adaptor,"rule block_list");

		try {
			// grammar/Tiger.g:102:2: ( ( MAIN LPAREN RPAREN block_list ) -> MAIN PARAMS block_list )
			// grammar/Tiger.g:102:4: ( MAIN LPAREN RPAREN block_list )
			{
			// grammar/Tiger.g:102:4: ( MAIN LPAREN RPAREN block_list )
			// grammar/Tiger.g:102:5: MAIN LPAREN RPAREN block_list
			{
			MAIN30=(Token)match(input,MAIN,FOLLOW_MAIN_in_function_definition_main379);  
			stream_MAIN.add(MAIN30);

			LPAREN31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_definition_main381);  
			stream_LPAREN.add(LPAREN31);

			RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition_main383);  
			stream_RPAREN.add(RPAREN32);

			pushFollow(FOLLOW_block_list_in_function_definition_main385);
			block_list33=block_list();
			state._fsp--;

			stream_block_list.add(block_list33.getTree());
			}

			// AST REWRITE
			// elements: block_list, MAIN
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 102:36: -> MAIN PARAMS block_list
			{
				adaptor.addChild(root_0, stream_MAIN.nextNode());
				adaptor.addChild(root_0, (Object)adaptor.create(PARAMS, "PARAMS"));
				adaptor.addChild(root_0, stream_block_list.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_definition_main"


	public static class param_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list"
	// grammar/Tiger.g:105:1: param_list : ( param param_list_tail |);
	public final TigerParser.param_list_return param_list() throws RecognitionException {
		TigerParser.param_list_return retval = new TigerParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope param34 =null;
		ParserRuleReturnScope param_list_tail35 =null;


		try {
			// grammar/Tiger.g:106:2: ( param param_list_tail |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			else if ( (LA5_0==RPAREN) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// grammar/Tiger.g:106:4: param param_list_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_param_in_param_list405);
					param34=param();
					state._fsp--;

					adaptor.addChild(root_0, param34.getTree());

					pushFollow(FOLLOW_param_list_tail_in_param_list407);
					param_list_tail35=param_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, param_list_tail35.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:108:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list"


	public static class param_list_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list_tail"
	// grammar/Tiger.g:110:1: param_list_tail : ( ( COMMA param param_list_tail ) -> param ( param_list_tail )? |);
	public final TigerParser.param_list_tail_return param_list_tail() throws RecognitionException {
		TigerParser.param_list_tail_return retval = new TigerParser.param_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA36=null;
		ParserRuleReturnScope param37 =null;
		ParserRuleReturnScope param_list_tail38 =null;

		Object COMMA36_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_param_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule param_list_tail");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			// grammar/Tiger.g:111:2: ( ( COMMA param param_list_tail ) -> param ( param_list_tail )? |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==COMMA) ) {
				alt6=1;
			}
			else if ( (LA6_0==RPAREN) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// grammar/Tiger.g:111:4: ( COMMA param param_list_tail )
					{
					// grammar/Tiger.g:111:4: ( COMMA param param_list_tail )
					// grammar/Tiger.g:111:5: COMMA param param_list_tail
					{
					COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list_tail424);  
					stream_COMMA.add(COMMA36);

					pushFollow(FOLLOW_param_in_param_list_tail426);
					param37=param();
					state._fsp--;

					stream_param.add(param37.getTree());
					pushFollow(FOLLOW_param_list_tail_in_param_list_tail428);
					param_list_tail38=param_list_tail();
					state._fsp--;

					stream_param_list_tail.add(param_list_tail38.getTree());
					}

					// AST REWRITE
					// elements: param, param_list_tail
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 111:34: -> param ( param_list_tail )?
					{
						adaptor.addChild(root_0, stream_param.nextTree());
						// grammar/Tiger.g:111:43: ( param_list_tail )?
						if ( stream_param_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_param_list_tail.nextTree());
						}
						stream_param_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:113:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list_tail"


	public static class param_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param"
	// grammar/Tiger.g:115:1: param : ID COLON type_id -> ^( PARAM ID type_id ) ;
	public final TigerParser.param_return param() throws RecognitionException {
		TigerParser.param_return retval = new TigerParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID39=null;
		Token COLON40=null;
		ParserRuleReturnScope type_id41 =null;

		Object ID39_tree=null;
		Object COLON40_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");

		try {
			// grammar/Tiger.g:116:2: ( ID COLON type_id -> ^( PARAM ID type_id ) )
			// grammar/Tiger.g:116:4: ID COLON type_id
			{
			ID39=(Token)match(input,ID,FOLLOW_ID_in_param453);  
			stream_ID.add(ID39);

			COLON40=(Token)match(input,COLON,FOLLOW_COLON_in_param455);  
			stream_COLON.add(COLON40);

			pushFollow(FOLLOW_type_id_in_param457);
			type_id41=type_id();
			state._fsp--;

			stream_type_id.add(type_id41.getTree());
			// AST REWRITE
			// elements: ID, type_id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 116:21: -> ^( PARAM ID type_id )
			{
				// grammar/Tiger.g:116:24: ^( PARAM ID type_id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_type_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"


	public static class block_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_list"
	// grammar/Tiger.g:119:1: block_list : block block_tail ;
	public final TigerParser.block_list_return block_list() throws RecognitionException {
		TigerParser.block_list_return retval = new TigerParser.block_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block42 =null;
		ParserRuleReturnScope block_tail43 =null;


		try {
			// grammar/Tiger.g:120:2: ( block block_tail )
			// grammar/Tiger.g:120:4: block block_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_block_list479);
			block42=block();
			state._fsp--;

			adaptor.addChild(root_0, block42.getTree());

			pushFollow(FOLLOW_block_tail_in_block_list481);
			block_tail43=block_tail();
			state._fsp--;

			adaptor.addChild(root_0, block_tail43.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block_list"


	public static class block_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_tail"
	// grammar/Tiger.g:123:1: block_tail : ( block block_tail |);
	public final TigerParser.block_tail_return block_tail() throws RecognitionException {
		TigerParser.block_tail_return retval = new TigerParser.block_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block44 =null;
		ParserRuleReturnScope block_tail45 =null;


		try {
			// grammar/Tiger.g:124:2: ( block block_tail |)
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==BEGIN) ) {
				alt7=1;
			}
			else if ( (LA7_0==EOF||LA7_0==END||LA7_0==FIXEDPT||LA7_0==ID||LA7_0==INT||LA7_0==VOID) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// grammar/Tiger.g:124:4: block block_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_block_tail492);
					block44=block();
					state._fsp--;

					adaptor.addChild(root_0, block44.getTree());

					pushFollow(FOLLOW_block_tail_in_block_tail494);
					block_tail45=block_tail();
					state._fsp--;

					adaptor.addChild(root_0, block_tail45.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:126:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block_tail"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// grammar/Tiger.g:128:1: block : ( BEGIN declaration_segment stat_seq END SEMI ) -> ^( BLOCK ( declaration_segment )? stat_seq ) ;
	public final TigerParser.block_return block() throws RecognitionException {
		TigerParser.block_return retval = new TigerParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN46=null;
		Token END49=null;
		Token SEMI50=null;
		ParserRuleReturnScope declaration_segment47 =null;
		ParserRuleReturnScope stat_seq48 =null;

		Object BEGIN46_tree=null;
		Object END49_tree=null;
		Object SEMI50_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_declaration_segment=new RewriteRuleSubtreeStream(adaptor,"rule declaration_segment");

		try {
			// grammar/Tiger.g:129:2: ( ( BEGIN declaration_segment stat_seq END SEMI ) -> ^( BLOCK ( declaration_segment )? stat_seq ) )
			// grammar/Tiger.g:129:4: ( BEGIN declaration_segment stat_seq END SEMI )
			{
			// grammar/Tiger.g:129:4: ( BEGIN declaration_segment stat_seq END SEMI )
			// grammar/Tiger.g:129:5: BEGIN declaration_segment stat_seq END SEMI
			{
			BEGIN46=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block510);  
			stream_BEGIN.add(BEGIN46);

			pushFollow(FOLLOW_declaration_segment_in_block512);
			declaration_segment47=declaration_segment();
			state._fsp--;

			stream_declaration_segment.add(declaration_segment47.getTree());
			pushFollow(FOLLOW_stat_seq_in_block514);
			stat_seq48=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq48.getTree());
			END49=(Token)match(input,END,FOLLOW_END_in_block516);  
			stream_END.add(END49);

			SEMI50=(Token)match(input,SEMI,FOLLOW_SEMI_in_block518);  
			stream_SEMI.add(SEMI50);

			}

			// AST REWRITE
			// elements: declaration_segment, stat_seq
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 129:50: -> ^( BLOCK ( declaration_segment )? stat_seq )
			{
				// grammar/Tiger.g:129:53: ^( BLOCK ( declaration_segment )? stat_seq )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// grammar/Tiger.g:129:61: ( declaration_segment )?
				if ( stream_declaration_segment.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration_segment.nextTree());
				}
				stream_declaration_segment.reset();

				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class declaration_segment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration_segment"
	// grammar/Tiger.g:132:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final TigerParser.declaration_segment_return declaration_segment() throws RecognitionException {
		TigerParser.declaration_segment_return retval = new TigerParser.declaration_segment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_list51 =null;
		ParserRuleReturnScope var_declaration_list52 =null;


		try {
			// grammar/Tiger.g:133:2: ( type_declaration_list var_declaration_list )
			// grammar/Tiger.g:133:4: type_declaration_list var_declaration_list
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_declaration_list_in_declaration_segment541);
			type_declaration_list51=type_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, type_declaration_list51.getTree());

			pushFollow(FOLLOW_var_declaration_list_in_declaration_segment543);
			var_declaration_list52=var_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, var_declaration_list52.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration_segment"


	public static class var_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_declaration_list"
	// grammar/Tiger.g:136:1: var_declaration_list : var_declaration_tail -> ^( VARIABLES ( var_declaration_tail )? ) ;
	public final TigerParser.var_declaration_list_return var_declaration_list() throws RecognitionException {
		TigerParser.var_declaration_list_return retval = new TigerParser.var_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration_tail53 =null;

		RewriteRuleSubtreeStream stream_var_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration_tail");

		try {
			// grammar/Tiger.g:137:2: ( var_declaration_tail -> ^( VARIABLES ( var_declaration_tail )? ) )
			// grammar/Tiger.g:137:4: var_declaration_tail
			{
			pushFollow(FOLLOW_var_declaration_tail_in_var_declaration_list554);
			var_declaration_tail53=var_declaration_tail();
			state._fsp--;

			stream_var_declaration_tail.add(var_declaration_tail53.getTree());
			// AST REWRITE
			// elements: var_declaration_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 137:25: -> ^( VARIABLES ( var_declaration_tail )? )
			{
				// grammar/Tiger.g:137:28: ^( VARIABLES ( var_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				// grammar/Tiger.g:137:40: ( var_declaration_tail )?
				if ( stream_var_declaration_tail.hasNext() ) {
					adaptor.addChild(root_1, stream_var_declaration_tail.nextTree());
				}
				stream_var_declaration_tail.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_declaration_list"


	public static class var_declaration_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_declaration_tail"
	// grammar/Tiger.g:140:1: var_declaration_tail : ( var_declaration var_declaration_tail |);
	public final TigerParser.var_declaration_tail_return var_declaration_tail() throws RecognitionException {
		TigerParser.var_declaration_tail_return retval = new TigerParser.var_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration54 =null;
		ParserRuleReturnScope var_declaration_tail55 =null;


		try {
			// grammar/Tiger.g:141:2: ( var_declaration var_declaration_tail |)
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			else if ( (LA8_0==BEGIN||LA8_0==BREAK||LA8_0==FOR||LA8_0==ID||LA8_0==IF||LA8_0==RETURN||LA8_0==WHILE) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// grammar/Tiger.g:141:4: var_declaration var_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_var_declaration_tail574);
					var_declaration54=var_declaration();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration54.getTree());

					pushFollow(FOLLOW_var_declaration_tail_in_var_declaration_tail576);
					var_declaration_tail55=var_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration_tail55.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:143:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_declaration_tail"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// grammar/Tiger.g:145:1: type : ( base_type | ( ARRAY array_dimensions OF base_type ) -> ^( ARRAY array_dimensions base_type ) );
	public final TigerParser.type_return type() throws RecognitionException {
		TigerParser.type_return retval = new TigerParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ARRAY57=null;
		Token OF59=null;
		ParserRuleReturnScope base_type56 =null;
		ParserRuleReturnScope array_dimensions58 =null;
		ParserRuleReturnScope base_type60 =null;

		Object ARRAY57_tree=null;
		Object OF59_tree=null;
		RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
		RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
		RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
		RewriteRuleSubtreeStream stream_array_dimensions=new RewriteRuleSubtreeStream(adaptor,"rule array_dimensions");

		try {
			// grammar/Tiger.g:146:2: ( base_type | ( ARRAY array_dimensions OF base_type ) -> ^( ARRAY array_dimensions base_type ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FIXEDPT||LA9_0==INT) ) {
				alt9=1;
			}
			else if ( (LA9_0==ARRAY) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// grammar/Tiger.g:146:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type590);
					base_type56=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type56.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:147:4: ( ARRAY array_dimensions OF base_type )
					{
					// grammar/Tiger.g:147:4: ( ARRAY array_dimensions OF base_type )
					// grammar/Tiger.g:147:5: ARRAY array_dimensions OF base_type
					{
					ARRAY57=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type596);  
					stream_ARRAY.add(ARRAY57);

					pushFollow(FOLLOW_array_dimensions_in_type598);
					array_dimensions58=array_dimensions();
					state._fsp--;

					stream_array_dimensions.add(array_dimensions58.getTree());
					OF59=(Token)match(input,OF,FOLLOW_OF_in_type600);  
					stream_OF.add(OF59);

					pushFollow(FOLLOW_base_type_in_type602);
					base_type60=base_type();
					state._fsp--;

					stream_base_type.add(base_type60.getTree());
					}

					// AST REWRITE
					// elements: array_dimensions, ARRAY, base_type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 147:42: -> ^( ARRAY array_dimensions base_type )
					{
						// grammar/Tiger.g:147:45: ^( ARRAY array_dimensions base_type )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);
						adaptor.addChild(root_1, stream_array_dimensions.nextTree());
						adaptor.addChild(root_1, stream_base_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class type_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_id"
	// grammar/Tiger.g:150:1: type_id : ( base_type | ID );
	public final TigerParser.type_id_return type_id() throws RecognitionException {
		TigerParser.type_id_return retval = new TigerParser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID62=null;
		ParserRuleReturnScope base_type61 =null;

		Object ID62_tree=null;

		try {
			// grammar/Tiger.g:151:2: ( base_type | ID )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FIXEDPT||LA10_0==INT) ) {
				alt10=1;
			}
			else if ( (LA10_0==ID) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// grammar/Tiger.g:151:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type_id624);
					base_type61=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type61.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:152:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID62=(Token)match(input,ID,FOLLOW_ID_in_type_id629); 
					ID62_tree = (Object)adaptor.create(ID62);
					adaptor.addChild(root_0, ID62_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_id"


	public static class base_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "base_type"
	// grammar/Tiger.g:155:1: base_type : ( INT | FIXEDPT );
	public final TigerParser.base_type_return base_type() throws RecognitionException {
		TigerParser.base_type_return retval = new TigerParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set63=null;

		Object set63_tree=null;

		try {
			// grammar/Tiger.g:156:2: ( INT | FIXEDPT )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set63=input.LT(1);
			if ( input.LA(1)==FIXEDPT||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set63));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "base_type"


	public static class var_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_declaration"
	// grammar/Tiger.g:160:1: var_declaration : ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id ( optional_init )? ) ;
	public final TigerParser.var_declaration_return var_declaration() throws RecognitionException {
		TigerParser.var_declaration_return retval = new TigerParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR64=null;
		Token COLON66=null;
		Token SEMI69=null;
		ParserRuleReturnScope id_list65 =null;
		ParserRuleReturnScope type_id67 =null;
		ParserRuleReturnScope optional_init68 =null;

		Object VAR64_tree=null;
		Object COLON66_tree=null;
		Object SEMI69_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_optional_init=new RewriteRuleSubtreeStream(adaptor,"rule optional_init");

		try {
			// grammar/Tiger.g:161:2: ( ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id ( optional_init )? ) )
			// grammar/Tiger.g:161:4: ( VAR id_list COLON type_id optional_init SEMI )
			{
			// grammar/Tiger.g:161:4: ( VAR id_list COLON type_id optional_init SEMI )
			// grammar/Tiger.g:161:5: VAR id_list COLON type_id optional_init SEMI
			{
			VAR64=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration657);  
			stream_VAR.add(VAR64);

			pushFollow(FOLLOW_id_list_in_var_declaration659);
			id_list65=id_list();
			state._fsp--;

			stream_id_list.add(id_list65.getTree());
			COLON66=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration661);  
			stream_COLON.add(COLON66);

			pushFollow(FOLLOW_type_id_in_var_declaration663);
			type_id67=type_id();
			state._fsp--;

			stream_type_id.add(type_id67.getTree());
			pushFollow(FOLLOW_optional_init_in_var_declaration665);
			optional_init68=optional_init();
			state._fsp--;

			stream_optional_init.add(optional_init68.getTree());
			SEMI69=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration667);  
			stream_SEMI.add(SEMI69);

			}

			// AST REWRITE
			// elements: optional_init, VAR, type_id, id_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 161:51: -> ^( VAR id_list type_id ( optional_init )? )
			{
				// grammar/Tiger.g:161:54: ^( VAR id_list type_id ( optional_init )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id_list.nextTree());
				adaptor.addChild(root_1, stream_type_id.nextTree());
				// grammar/Tiger.g:161:76: ( optional_init )?
				if ( stream_optional_init.hasNext() ) {
					adaptor.addChild(root_1, stream_optional_init.nextTree());
				}
				stream_optional_init.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_declaration"


	public static class optional_init_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optional_init"
	// grammar/Tiger.g:164:1: optional_init : ( ASSIGN constant -> constant |);
	public final TigerParser.optional_init_return optional_init() throws RecognitionException {
		TigerParser.optional_init_return retval = new TigerParser.optional_init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN70=null;
		ParserRuleReturnScope constant71 =null;

		Object ASSIGN70_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		try {
			// grammar/Tiger.g:165:2: ( ASSIGN constant -> constant |)
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ASSIGN) ) {
				alt11=1;
			}
			else if ( (LA11_0==SEMI) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// grammar/Tiger.g:165:4: ASSIGN constant
					{
					ASSIGN70=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init692);  
					stream_ASSIGN.add(ASSIGN70);

					pushFollow(FOLLOW_constant_in_optional_init694);
					constant71=constant();
					state._fsp--;

					stream_constant.add(constant71.getTree());
					// AST REWRITE
					// elements: constant
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 165:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:167:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optional_init"


	public static class id_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id_list"
	// grammar/Tiger.g:169:1: id_list : ( id_list_head ) -> ^( IDS id_list_head ) ;
	public final TigerParser.id_list_return id_list() throws RecognitionException {
		TigerParser.id_list_return retval = new TigerParser.id_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id_list_head72 =null;

		RewriteRuleSubtreeStream stream_id_list_head=new RewriteRuleSubtreeStream(adaptor,"rule id_list_head");

		try {
			// grammar/Tiger.g:170:2: ( ( id_list_head ) -> ^( IDS id_list_head ) )
			// grammar/Tiger.g:170:4: ( id_list_head )
			{
			// grammar/Tiger.g:170:4: ( id_list_head )
			// grammar/Tiger.g:170:5: id_list_head
			{
			pushFollow(FOLLOW_id_list_head_in_id_list714);
			id_list_head72=id_list_head();
			state._fsp--;

			stream_id_list_head.add(id_list_head72.getTree());
			}

			// AST REWRITE
			// elements: id_list_head
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 170:19: -> ^( IDS id_list_head )
			{
				// grammar/Tiger.g:170:22: ^( IDS id_list_head )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDS, "IDS"), root_1);
				adaptor.addChild(root_1, stream_id_list_head.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id_list"


	public static class id_list_head_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id_list_head"
	// grammar/Tiger.g:173:1: id_list_head : ( ID id_list_tail ) -> ID ( id_list_tail )? ;
	public final TigerParser.id_list_head_return id_list_head() throws RecognitionException {
		TigerParser.id_list_head_return retval = new TigerParser.id_list_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID73=null;
		ParserRuleReturnScope id_list_tail74 =null;

		Object ID73_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_id_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule id_list_tail");

		try {
			// grammar/Tiger.g:174:2: ( ( ID id_list_tail ) -> ID ( id_list_tail )? )
			// grammar/Tiger.g:174:4: ( ID id_list_tail )
			{
			// grammar/Tiger.g:174:4: ( ID id_list_tail )
			// grammar/Tiger.g:174:5: ID id_list_tail
			{
			ID73=(Token)match(input,ID,FOLLOW_ID_in_id_list_head735);  
			stream_ID.add(ID73);

			pushFollow(FOLLOW_id_list_tail_in_id_list_head737);
			id_list_tail74=id_list_tail();
			state._fsp--;

			stream_id_list_tail.add(id_list_tail74.getTree());
			}

			// AST REWRITE
			// elements: id_list_tail, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 174:22: -> ID ( id_list_tail )?
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
				// grammar/Tiger.g:174:28: ( id_list_tail )?
				if ( stream_id_list_tail.hasNext() ) {
					adaptor.addChild(root_0, stream_id_list_tail.nextTree());
				}
				stream_id_list_tail.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id_list_head"


	public static class id_list_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id_list_tail"
	// grammar/Tiger.g:177:1: id_list_tail : ( COMMA id_list_head -> id_list_head |);
	public final TigerParser.id_list_tail_return id_list_tail() throws RecognitionException {
		TigerParser.id_list_tail_return retval = new TigerParser.id_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA75=null;
		ParserRuleReturnScope id_list_head76 =null;

		Object COMMA75_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_id_list_head=new RewriteRuleSubtreeStream(adaptor,"rule id_list_head");

		try {
			// grammar/Tiger.g:178:2: ( COMMA id_list_head -> id_list_head |)
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==COMMA) ) {
				alt12=1;
			}
			else if ( (LA12_0==COLON) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// grammar/Tiger.g:178:4: COMMA id_list_head
					{
					COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list_tail756);  
					stream_COMMA.add(COMMA75);

					pushFollow(FOLLOW_id_list_head_in_id_list_tail758);
					id_list_head76=id_list_head();
					state._fsp--;

					stream_id_list_head.add(id_list_head76.getTree());
					// AST REWRITE
					// elements: id_list_head
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 178:23: -> id_list_head
					{
						adaptor.addChild(root_0, stream_id_list_head.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:180:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id_list_tail"


	public static class optional_int_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optional_int"
	// grammar/Tiger.g:182:1: optional_int : ( ASSIGN constant -> constant |);
	public final TigerParser.optional_int_return optional_int() throws RecognitionException {
		TigerParser.optional_int_return retval = new TigerParser.optional_int_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN77=null;
		ParserRuleReturnScope constant78 =null;

		Object ASSIGN77_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		try {
			// grammar/Tiger.g:183:2: ( ASSIGN constant -> constant |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ASSIGN) ) {
				alt13=1;
			}
			else if ( (LA13_0==EOF) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// grammar/Tiger.g:183:4: ASSIGN constant
					{
					ASSIGN77=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_int776);  
					stream_ASSIGN.add(ASSIGN77);

					pushFollow(FOLLOW_constant_in_optional_int778);
					constant78=constant();
					state._fsp--;

					stream_constant.add(constant78.getTree());
					// AST REWRITE
					// elements: constant
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 183:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:185:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optional_int"


	public static class expr_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// grammar/Tiger.g:191:1: expr_list : ( expr expr_list_tail -> ^( EXPRS expr ( expr_list_tail )? ) |);
	public final TigerParser.expr_list_return expr_list() throws RecognitionException {
		TigerParser.expr_list_return retval = new TigerParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr79 =null;
		ParserRuleReturnScope expr_list_tail80 =null;

		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:192:2: ( expr expr_list_tail -> ^( EXPRS expr ( expr_list_tail )? ) |)
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==FIXEDPTLIT||LA14_0==ID||LA14_0==INTLIT||LA14_0==LPAREN) ) {
				alt14=1;
			}
			else if ( (LA14_0==RPAREN) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// grammar/Tiger.g:192:4: expr expr_list_tail
					{
					pushFollow(FOLLOW_expr_in_expr_list801);
					expr79=expr();
					state._fsp--;

					stream_expr.add(expr79.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list803);
					expr_list_tail80=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail80.getTree());
					// AST REWRITE
					// elements: expr_list_tail, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 192:24: -> ^( EXPRS expr ( expr_list_tail )? )
					{
						// grammar/Tiger.g:192:27: ^( EXPRS expr ( expr_list_tail )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						// grammar/Tiger.g:192:40: ( expr_list_tail )?
						if ( stream_expr_list_tail.hasNext() ) {
							adaptor.addChild(root_1, stream_expr_list_tail.nextTree());
						}
						stream_expr_list_tail.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:194:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class expr_list_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_list_tail"
	// grammar/Tiger.g:196:1: expr_list_tail : ( ( COMMA expr expr_list_tail ) -> expr ( expr_list_tail )? |);
	public final TigerParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
		TigerParser.expr_list_tail_return retval = new TigerParser.expr_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA81=null;
		ParserRuleReturnScope expr82 =null;
		ParserRuleReturnScope expr_list_tail83 =null;

		Object COMMA81_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:197:2: ( ( COMMA expr expr_list_tail ) -> expr ( expr_list_tail )? |)
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==COMMA) ) {
				alt15=1;
			}
			else if ( (LA15_0==RPAREN) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// grammar/Tiger.g:197:4: ( COMMA expr expr_list_tail )
					{
					// grammar/Tiger.g:197:4: ( COMMA expr expr_list_tail )
					// grammar/Tiger.g:197:5: COMMA expr expr_list_tail
					{
					COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail831);  
					stream_COMMA.add(COMMA81);

					pushFollow(FOLLOW_expr_in_expr_list_tail833);
					expr82=expr();
					state._fsp--;

					stream_expr.add(expr82.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail835);
					expr_list_tail83=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail83.getTree());
					}

					// AST REWRITE
					// elements: expr, expr_list_tail
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 197:32: -> expr ( expr_list_tail )?
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
						// grammar/Tiger.g:197:40: ( expr_list_tail )?
						if ( stream_expr_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_expr_list_tail.nextTree());
						}
						stream_expr_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:199:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list_tail"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// grammar/Tiger.g:201:1: expr : expr_head expr_tail ;
	public final TigerParser.expr_return expr() throws RecognitionException {
		TigerParser.expr_return retval = new TigerParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_head84 =null;
		ParserRuleReturnScope expr_tail85 =null;


		try {
			// grammar/Tiger.g:202:2: ( expr_head expr_tail )
			// grammar/Tiger.g:202:4: expr_head expr_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_head_in_expr858);
			expr_head84=expr_head();
			state._fsp--;

			adaptor.addChild(root_0, expr_head84.getTree());

			pushFollow(FOLLOW_expr_tail_in_expr860);
			expr_tail85=expr_tail();
			state._fsp--;

			adaptor.addChild(root_0, expr_tail85.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_tail"
	// grammar/Tiger.g:205:1: expr_tail : ( ( binary_operator expr ) -> ^( binary_operator expr ) |);
	public final TigerParser.expr_tail_return expr_tail() throws RecognitionException {
		TigerParser.expr_tail_return retval = new TigerParser.expr_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope binary_operator86 =null;
		ParserRuleReturnScope expr87 =null;

		RewriteRuleSubtreeStream stream_binary_operator=new RewriteRuleSubtreeStream(adaptor,"rule binary_operator");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:206:2: ( ( binary_operator expr ) -> ^( binary_operator expr ) |)
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==AND||LA16_0==DIV||LA16_0==EQ||(LA16_0 >= GEQ && LA16_0 <= GREATER)||(LA16_0 >= LEQ && LA16_0 <= LESSER)||(LA16_0 >= MINUS && LA16_0 <= NEQ)||LA16_0==OR||LA16_0==PLUS) ) {
				alt16=1;
			}
			else if ( (LA16_0==COMMA||LA16_0==DO||(LA16_0 >= RPAREN && LA16_0 <= SEMI)||LA16_0==THEN) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// grammar/Tiger.g:206:4: ( binary_operator expr )
					{
					// grammar/Tiger.g:206:4: ( binary_operator expr )
					// grammar/Tiger.g:206:5: binary_operator expr
					{
					pushFollow(FOLLOW_binary_operator_in_expr_tail872);
					binary_operator86=binary_operator();
					state._fsp--;

					stream_binary_operator.add(binary_operator86.getTree());
					pushFollow(FOLLOW_expr_in_expr_tail874);
					expr87=expr();
					state._fsp--;

					stream_expr.add(expr87.getTree());
					}

					// AST REWRITE
					// elements: binary_operator, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 206:27: -> ^( binary_operator expr )
					{
						// grammar/Tiger.g:206:30: ^( binary_operator expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_binary_operator.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:208:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_tail"


	public static class expr_head_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_head"
	// grammar/Tiger.g:210:1: expr_head : ( expr_head_base | ( ID optional_subscript ) -> ^( REFERENCE ID ( optional_subscript )? ) );
	public final TigerParser.expr_head_return expr_head() throws RecognitionException {
		TigerParser.expr_head_return retval = new TigerParser.expr_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID89=null;
		ParserRuleReturnScope expr_head_base88 =null;
		ParserRuleReturnScope optional_subscript90 =null;

		Object ID89_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_optional_subscript=new RewriteRuleSubtreeStream(adaptor,"rule optional_subscript");

		try {
			// grammar/Tiger.g:211:2: ( expr_head_base | ( ID optional_subscript ) -> ^( REFERENCE ID ( optional_subscript )? ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==FIXEDPTLIT||LA17_0==INTLIT||LA17_0==LPAREN) ) {
				alt17=1;
			}
			else if ( (LA17_0==ID) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// grammar/Tiger.g:211:4: expr_head_base
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_head_base_in_expr_head898);
					expr_head_base88=expr_head_base();
					state._fsp--;

					adaptor.addChild(root_0, expr_head_base88.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:212:4: ( ID optional_subscript )
					{
					// grammar/Tiger.g:212:4: ( ID optional_subscript )
					// grammar/Tiger.g:212:5: ID optional_subscript
					{
					ID89=(Token)match(input,ID,FOLLOW_ID_in_expr_head904);  
					stream_ID.add(ID89);

					pushFollow(FOLLOW_optional_subscript_in_expr_head906);
					optional_subscript90=optional_subscript();
					state._fsp--;

					stream_optional_subscript.add(optional_subscript90.getTree());
					}

					// AST REWRITE
					// elements: ID, optional_subscript
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 212:28: -> ^( REFERENCE ID ( optional_subscript )? )
					{
						// grammar/Tiger.g:212:31: ^( REFERENCE ID ( optional_subscript )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// grammar/Tiger.g:212:46: ( optional_subscript )?
						if ( stream_optional_subscript.hasNext() ) {
							adaptor.addChild(root_1, stream_optional_subscript.nextTree());
						}
						stream_optional_subscript.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_head"


	public static class expr_head_base_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_head_base"
	// grammar/Tiger.g:215:1: expr_head_base : ( constant | ( LPAREN expr RPAREN ) -> expr );
	public final TigerParser.expr_head_base_return expr_head_base() throws RecognitionException {
		TigerParser.expr_head_base_return retval = new TigerParser.expr_head_base_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN92=null;
		Token RPAREN94=null;
		ParserRuleReturnScope constant91 =null;
		ParserRuleReturnScope expr93 =null;

		Object LPAREN92_tree=null;
		Object RPAREN94_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:216:2: ( constant | ( LPAREN expr RPAREN ) -> expr )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==FIXEDPTLIT||LA18_0==INTLIT) ) {
				alt18=1;
			}
			else if ( (LA18_0==LPAREN) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// grammar/Tiger.g:216:4: constant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_in_expr_head_base929);
					constant91=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant91.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:217:4: ( LPAREN expr RPAREN )
					{
					// grammar/Tiger.g:217:4: ( LPAREN expr RPAREN )
					// grammar/Tiger.g:217:5: LPAREN expr RPAREN
					{
					LPAREN92=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_head_base935);  
					stream_LPAREN.add(LPAREN92);

					pushFollow(FOLLOW_expr_in_expr_head_base937);
					expr93=expr();
					state._fsp--;

					stream_expr.add(expr93.getTree());
					RPAREN94=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_head_base939);  
					stream_RPAREN.add(RPAREN94);

					}

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 217:25: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_head_base"


	public static class stat_seq_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat_seq"
	// grammar/Tiger.g:224:1: stat_seq : stat stat_tail -> ^( STATEMENTS stat ( stat_tail )? ) ;
	public final TigerParser.stat_seq_return stat_seq() throws RecognitionException {
		TigerParser.stat_seq_return retval = new TigerParser.stat_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat95 =null;
		ParserRuleReturnScope stat_tail96 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// grammar/Tiger.g:225:2: ( stat stat_tail -> ^( STATEMENTS stat ( stat_tail )? ) )
			// grammar/Tiger.g:225:4: stat stat_tail
			{
			pushFollow(FOLLOW_stat_in_stat_seq959);
			stat95=stat();
			state._fsp--;

			stream_stat.add(stat95.getTree());
			pushFollow(FOLLOW_stat_tail_in_stat_seq961);
			stat_tail96=stat_tail();
			state._fsp--;

			stream_stat_tail.add(stat_tail96.getTree());
			// AST REWRITE
			// elements: stat, stat_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 225:19: -> ^( STATEMENTS stat ( stat_tail )? )
			{
				// grammar/Tiger.g:225:22: ^( STATEMENTS stat ( stat_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);
				adaptor.addChild(root_1, stream_stat.nextTree());
				// grammar/Tiger.g:225:40: ( stat_tail )?
				if ( stream_stat_tail.hasNext() ) {
					adaptor.addChild(root_1, stream_stat_tail.nextTree());
				}
				stream_stat_tail.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat_seq"


	public static class stat_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat_tail"
	// grammar/Tiger.g:228:1: stat_tail : ( stat stat_tail -> stat ( stat_tail )? |);
	public final TigerParser.stat_tail_return stat_tail() throws RecognitionException {
		TigerParser.stat_tail_return retval = new TigerParser.stat_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat97 =null;
		ParserRuleReturnScope stat_tail98 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// grammar/Tiger.g:229:2: ( stat stat_tail -> stat ( stat_tail )? |)
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==BEGIN||LA19_0==BREAK||LA19_0==FOR||LA19_0==ID||LA19_0==IF||LA19_0==RETURN||LA19_0==WHILE) ) {
				alt19=1;
			}
			else if ( ((LA19_0 >= ELSE && LA19_0 <= ENDIF)) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// grammar/Tiger.g:229:4: stat stat_tail
					{
					pushFollow(FOLLOW_stat_in_stat_tail983);
					stat97=stat();
					state._fsp--;

					stream_stat.add(stat97.getTree());
					pushFollow(FOLLOW_stat_tail_in_stat_tail985);
					stat_tail98=stat_tail();
					state._fsp--;

					stream_stat_tail.add(stat_tail98.getTree());
					// AST REWRITE
					// elements: stat, stat_tail
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 229:19: -> stat ( stat_tail )?
					{
						adaptor.addChild(root_0, stream_stat.nextTree());
						// grammar/Tiger.g:229:27: ( stat_tail )?
						if ( stream_stat_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_stat_tail.nextTree());
						}
						stream_stat_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:231:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat_tail"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// grammar/Tiger.g:233:1: stat : ( if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment ) ) SEMI );
	public final TigerParser.stat_return stat() throws RecognitionException {
		TigerParser.stat_return retval = new TigerParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE100=null;
		Token DO102=null;
		Token ENDDO104=null;
		Token SEMI105=null;
		Token FOR106=null;
		Token ID107=null;
		Token ASSIGN108=null;
		Token DO110=null;
		Token ENDDO112=null;
		Token SEMI113=null;
		Token BREAK114=null;
		Token SEMI115=null;
		Token RETURN116=null;
		Token SEMI118=null;
		Token ID120=null;
		Token LPAREN121=null;
		Token RPAREN123=null;
		Token ASSIGN125=null;
		Token SEMI127=null;
		ParserRuleReturnScope if_stmt99 =null;
		ParserRuleReturnScope expr101 =null;
		ParserRuleReturnScope stat_seq103 =null;
		ParserRuleReturnScope range109 =null;
		ParserRuleReturnScope stat_seq111 =null;
		ParserRuleReturnScope expr117 =null;
		ParserRuleReturnScope block119 =null;
		ParserRuleReturnScope expr_list122 =null;
		ParserRuleReturnScope optional_subscript124 =null;
		ParserRuleReturnScope statement_assignment126 =null;

		Object WHILE100_tree=null;
		Object DO102_tree=null;
		Object ENDDO104_tree=null;
		Object SEMI105_tree=null;
		Object FOR106_tree=null;
		Object ID107_tree=null;
		Object ASSIGN108_tree=null;
		Object DO110_tree=null;
		Object ENDDO112_tree=null;
		Object SEMI113_tree=null;
		Object BREAK114_tree=null;
		Object SEMI115_tree=null;
		Object RETURN116_tree=null;
		Object SEMI118_tree=null;
		Object ID120_tree=null;
		Object LPAREN121_tree=null;
		Object RPAREN123_tree=null;
		Object ASSIGN125_tree=null;
		Object SEMI127_tree=null;
		RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
		RewriteRuleTokenStream stream_ENDDO=new RewriteRuleTokenStream(adaptor,"token ENDDO");
		RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_optional_subscript=new RewriteRuleSubtreeStream(adaptor,"rule optional_subscript");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
		RewriteRuleSubtreeStream stream_statement_assignment=new RewriteRuleSubtreeStream(adaptor,"rule statement_assignment");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");

		try {
			// grammar/Tiger.g:234:2: ( if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment ) ) SEMI )
			int alt21=7;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt21=1;
				}
				break;
			case WHILE:
				{
				alt21=2;
				}
				break;
			case FOR:
				{
				alt21=3;
				}
				break;
			case BREAK:
				{
				alt21=4;
				}
				break;
			case RETURN:
				{
				alt21=5;
				}
				break;
			case BEGIN:
				{
				alt21=6;
				}
				break;
			case ID:
				{
				alt21=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// grammar/Tiger.g:234:4: if_stmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmt_in_stat1006);
					if_stmt99=if_stmt();
					state._fsp--;

					adaptor.addChild(root_0, if_stmt99.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:235:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					{
					// grammar/Tiger.g:235:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					// grammar/Tiger.g:235:5: WHILE expr DO stat_seq ENDDO SEMI
					{
					WHILE100=(Token)match(input,WHILE,FOLLOW_WHILE_in_stat1012);  
					stream_WHILE.add(WHILE100);

					pushFollow(FOLLOW_expr_in_stat1014);
					expr101=expr();
					state._fsp--;

					stream_expr.add(expr101.getTree());
					DO102=(Token)match(input,DO,FOLLOW_DO_in_stat1016);  
					stream_DO.add(DO102);

					pushFollow(FOLLOW_stat_seq_in_stat1018);
					stat_seq103=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq103.getTree());
					ENDDO104=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat1020);  
					stream_ENDDO.add(ENDDO104);

					SEMI105=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1022);  
					stream_SEMI.add(SEMI105);

					}

					// AST REWRITE
					// elements: expr, stat_seq, WHILE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 235:40: -> ^( WHILE expr stat_seq )
					{
						// grammar/Tiger.g:235:43: ^( WHILE expr stat_seq )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_stat_seq.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// grammar/Tiger.g:236:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					{
					// grammar/Tiger.g:236:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					// grammar/Tiger.g:236:5: FOR ID ASSIGN range DO stat_seq ENDDO SEMI
					{
					FOR106=(Token)match(input,FOR,FOLLOW_FOR_in_stat1039);  
					stream_FOR.add(FOR106);

					ID107=(Token)match(input,ID,FOLLOW_ID_in_stat1041);  
					stream_ID.add(ID107);

					ASSIGN108=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1043);  
					stream_ASSIGN.add(ASSIGN108);

					pushFollow(FOLLOW_range_in_stat1045);
					range109=range();
					state._fsp--;

					stream_range.add(range109.getTree());
					DO110=(Token)match(input,DO,FOLLOW_DO_in_stat1047);  
					stream_DO.add(DO110);

					pushFollow(FOLLOW_stat_seq_in_stat1049);
					stat_seq111=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq111.getTree());
					ENDDO112=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat1051);  
					stream_ENDDO.add(ENDDO112);

					SEMI113=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1053);  
					stream_SEMI.add(SEMI113);

					}

					// AST REWRITE
					// elements: range, stat_seq, FOR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 236:49: -> ^( FOR range stat_seq )
					{
						// grammar/Tiger.g:236:52: ^( FOR range stat_seq )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);
						adaptor.addChild(root_1, stream_range.nextTree());
						adaptor.addChild(root_1, stream_stat_seq.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// grammar/Tiger.g:237:4: BREAK SEMI
					{
					BREAK114=(Token)match(input,BREAK,FOLLOW_BREAK_in_stat1069);  
					stream_BREAK.add(BREAK114);

					SEMI115=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1071);  
					stream_SEMI.add(SEMI115);

					// AST REWRITE
					// elements: BREAK
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 237:15: -> BREAK
					{
						adaptor.addChild(root_0, stream_BREAK.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// grammar/Tiger.g:238:4: RETURN expr SEMI
					{
					RETURN116=(Token)match(input,RETURN,FOLLOW_RETURN_in_stat1080);  
					stream_RETURN.add(RETURN116);

					pushFollow(FOLLOW_expr_in_stat1082);
					expr117=expr();
					state._fsp--;

					stream_expr.add(expr117.getTree());
					SEMI118=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1084);  
					stream_SEMI.add(SEMI118);

					// AST REWRITE
					// elements: expr, RETURN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 238:21: -> ^( RETURN expr )
					{
						// grammar/Tiger.g:238:24: ^( RETURN expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// grammar/Tiger.g:239:4: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat1097);
					block119=block();
					state._fsp--;

					adaptor.addChild(root_0, block119.getTree());

					}
					break;
				case 7 :
					// grammar/Tiger.g:240:4: ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment ) ) SEMI
					{
					ID120=(Token)match(input,ID,FOLLOW_ID_in_stat1102);  
					stream_ID.add(ID120);

					// grammar/Tiger.g:240:8: ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment ) )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==LPAREN) ) {
						alt20=1;
					}
					else if ( (LA20_0==AND||LA20_0==ASSIGN||LA20_0==COMMA||(LA20_0 >= DIV && LA20_0 <= DO)||LA20_0==EQ||(LA20_0 >= GEQ && LA20_0 <= GREATER)||(LA20_0 >= LBRACK && LA20_0 <= LESSER)||(LA20_0 >= MINUS && LA20_0 <= NEQ)||LA20_0==OR||LA20_0==PLUS||(LA20_0 >= RPAREN && LA20_0 <= SEMI)||LA20_0==THEN) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// grammar/Tiger.g:241:6: LPAREN expr_list RPAREN
							{
							LPAREN121=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stat1113);  
							stream_LPAREN.add(LPAREN121);

							pushFollow(FOLLOW_expr_list_in_stat1115);
							expr_list122=expr_list();
							state._fsp--;

							stream_expr_list.add(expr_list122.getTree());
							RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stat1117);  
							stream_RPAREN.add(RPAREN123);

							// AST REWRITE
							// elements: ID, expr_list
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 241:36: -> ^( INVOKE ID ( expr_list )? )
							{
								// grammar/Tiger.g:241:39: ^( INVOKE ID ( expr_list )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INVOKE, "INVOKE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								// grammar/Tiger.g:241:51: ( expr_list )?
								if ( stream_expr_list.hasNext() ) {
									adaptor.addChild(root_1, stream_expr_list.nextTree());
								}
								stream_expr_list.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// grammar/Tiger.g:242:6: optional_subscript ASSIGN statement_assignment
							{
							pushFollow(FOLLOW_optional_subscript_in_stat1141);
							optional_subscript124=optional_subscript();
							state._fsp--;

							stream_optional_subscript.add(optional_subscript124.getTree());
							ASSIGN125=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1143);  
							stream_ASSIGN.add(ASSIGN125);

							pushFollow(FOLLOW_statement_assignment_in_stat1145);
							statement_assignment126=statement_assignment();
							state._fsp--;

							stream_statement_assignment.add(statement_assignment126.getTree());
							// AST REWRITE
							// elements: ASSIGN, optional_subscript, statement_assignment, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 242:54: -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment )
							{
								// grammar/Tiger.g:242:57: ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
								// grammar/Tiger.g:242:66: ^( REFERENCE ID ( optional_subscript )? )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_2);
								adaptor.addChild(root_2, stream_ID.nextNode());
								// grammar/Tiger.g:242:81: ( optional_subscript )?
								if ( stream_optional_subscript.hasNext() ) {
									adaptor.addChild(root_2, stream_optional_subscript.nextTree());
								}
								stream_optional_subscript.reset();

								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_1, stream_statement_assignment.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					SEMI127=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1170);  
					stream_SEMI.add(SEMI127);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class optional_subscript_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optional_subscript"
	// grammar/Tiger.g:246:1: optional_subscript : ( array_subscripts |);
	public final TigerParser.optional_subscript_return optional_subscript() throws RecognitionException {
		TigerParser.optional_subscript_return retval = new TigerParser.optional_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_subscripts128 =null;


		try {
			// grammar/Tiger.g:247:2: ( array_subscripts |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LBRACK) ) {
				alt22=1;
			}
			else if ( (LA22_0==AND||LA22_0==ASSIGN||LA22_0==COMMA||(LA22_0 >= DIV && LA22_0 <= DO)||LA22_0==EQ||(LA22_0 >= GEQ && LA22_0 <= GREATER)||(LA22_0 >= LEQ && LA22_0 <= LESSER)||(LA22_0 >= MINUS && LA22_0 <= NEQ)||LA22_0==OR||LA22_0==PLUS||(LA22_0 >= RPAREN && LA22_0 <= SEMI)||LA22_0==THEN) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// grammar/Tiger.g:247:4: array_subscripts
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_subscripts_in_optional_subscript1181);
					array_subscripts128=array_subscripts();
					state._fsp--;

					adaptor.addChild(root_0, array_subscripts128.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:249:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optional_subscript"


	public static class range_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "range"
	// grammar/Tiger.g:251:1: range : (start= index_expr TO stop= index_expr ) -> $start $stop;
	public final TigerParser.range_return range() throws RecognitionException {
		TigerParser.range_return retval = new TigerParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO129=null;
		ParserRuleReturnScope start =null;
		ParserRuleReturnScope stop =null;

		Object TO129_tree=null;
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// grammar/Tiger.g:252:2: ( (start= index_expr TO stop= index_expr ) -> $start $stop)
			// grammar/Tiger.g:252:4: (start= index_expr TO stop= index_expr )
			{
			// grammar/Tiger.g:252:4: (start= index_expr TO stop= index_expr )
			// grammar/Tiger.g:252:5: start= index_expr TO stop= index_expr
			{
			pushFollow(FOLLOW_index_expr_in_range1199);
			start=index_expr();
			state._fsp--;

			stream_index_expr.add(start.getTree());
			TO129=(Token)match(input,TO,FOLLOW_TO_in_range1201);  
			stream_TO.add(TO129);

			pushFollow(FOLLOW_index_expr_in_range1205);
			stop=index_expr();
			state._fsp--;

			stream_index_expr.add(stop.getTree());
			}

			// AST REWRITE
			// elements: stop, start
			// token labels: 
			// rule labels: stop, start, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_stop=new RewriteRuleSubtreeStream(adaptor,"rule stop",stop!=null?stop.getTree():null);
			RewriteRuleSubtreeStream stream_start=new RewriteRuleSubtreeStream(adaptor,"rule start",start!=null?start.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 252:42: -> $start $stop
			{
				adaptor.addChild(root_0, stream_start.nextTree());
				adaptor.addChild(root_0, stream_stop.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range"


	public static class statement_assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement_assignment"
	// grammar/Tiger.g:255:1: statement_assignment : ( ( ID statement_assignment_id ) -> ^( EXPR ID ( statement_assignment_id )? ) | ( expr_head_base expr_tail ) -> ^( EXPR expr_head_base ( expr_tail )? ) );
	public final TigerParser.statement_assignment_return statement_assignment() throws RecognitionException {
		TigerParser.statement_assignment_return retval = new TigerParser.statement_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID130=null;
		ParserRuleReturnScope statement_assignment_id131 =null;
		ParserRuleReturnScope expr_head_base132 =null;
		ParserRuleReturnScope expr_tail133 =null;

		Object ID130_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_statement_assignment_id=new RewriteRuleSubtreeStream(adaptor,"rule statement_assignment_id");
		RewriteRuleSubtreeStream stream_expr_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_tail");
		RewriteRuleSubtreeStream stream_expr_head_base=new RewriteRuleSubtreeStream(adaptor,"rule expr_head_base");

		try {
			// grammar/Tiger.g:256:2: ( ( ID statement_assignment_id ) -> ^( EXPR ID ( statement_assignment_id )? ) | ( expr_head_base expr_tail ) -> ^( EXPR expr_head_base ( expr_tail )? ) )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ID) ) {
				alt23=1;
			}
			else if ( (LA23_0==FIXEDPTLIT||LA23_0==INTLIT||LA23_0==LPAREN) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// grammar/Tiger.g:256:4: ( ID statement_assignment_id )
					{
					// grammar/Tiger.g:256:4: ( ID statement_assignment_id )
					// grammar/Tiger.g:256:5: ID statement_assignment_id
					{
					ID130=(Token)match(input,ID,FOLLOW_ID_in_statement_assignment1226);  
					stream_ID.add(ID130);

					pushFollow(FOLLOW_statement_assignment_id_in_statement_assignment1228);
					statement_assignment_id131=statement_assignment_id();
					state._fsp--;

					stream_statement_assignment_id.add(statement_assignment_id131.getTree());
					}

					// AST REWRITE
					// elements: statement_assignment_id, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 256:33: -> ^( EXPR ID ( statement_assignment_id )? )
					{
						// grammar/Tiger.g:256:36: ^( EXPR ID ( statement_assignment_id )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// grammar/Tiger.g:256:46: ( statement_assignment_id )?
						if ( stream_statement_assignment_id.hasNext() ) {
							adaptor.addChild(root_1, stream_statement_assignment_id.nextTree());
						}
						stream_statement_assignment_id.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:257:4: ( expr_head_base expr_tail )
					{
					// grammar/Tiger.g:257:4: ( expr_head_base expr_tail )
					// grammar/Tiger.g:257:5: expr_head_base expr_tail
					{
					pushFollow(FOLLOW_expr_head_base_in_statement_assignment1246);
					expr_head_base132=expr_head_base();
					state._fsp--;

					stream_expr_head_base.add(expr_head_base132.getTree());
					pushFollow(FOLLOW_expr_tail_in_statement_assignment1248);
					expr_tail133=expr_tail();
					state._fsp--;

					stream_expr_tail.add(expr_tail133.getTree());
					}

					// AST REWRITE
					// elements: expr_head_base, expr_tail
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 257:31: -> ^( EXPR expr_head_base ( expr_tail )? )
					{
						// grammar/Tiger.g:257:34: ^( EXPR expr_head_base ( expr_tail )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
						adaptor.addChild(root_1, stream_expr_head_base.nextTree());
						// grammar/Tiger.g:257:56: ( expr_tail )?
						if ( stream_expr_tail.hasNext() ) {
							adaptor.addChild(root_1, stream_expr_tail.nextTree());
						}
						stream_expr_tail.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement_assignment"


	public static class statement_assignment_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement_assignment_id"
	// grammar/Tiger.g:260:1: statement_assignment_id : ( ( LPAREN expr_list RPAREN ) -> ( expr_list )? | optional_subscript expr_tail );
	public final TigerParser.statement_assignment_id_return statement_assignment_id() throws RecognitionException {
		TigerParser.statement_assignment_id_return retval = new TigerParser.statement_assignment_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN134=null;
		Token RPAREN136=null;
		ParserRuleReturnScope expr_list135 =null;
		ParserRuleReturnScope optional_subscript137 =null;
		ParserRuleReturnScope expr_tail138 =null;

		Object LPAREN134_tree=null;
		Object RPAREN136_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");

		try {
			// grammar/Tiger.g:261:2: ( ( LPAREN expr_list RPAREN ) -> ( expr_list )? | optional_subscript expr_tail )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LPAREN) ) {
				alt24=1;
			}
			else if ( (LA24_0==AND||LA24_0==ASSIGN||LA24_0==COMMA||(LA24_0 >= DIV && LA24_0 <= DO)||LA24_0==EQ||(LA24_0 >= GEQ && LA24_0 <= GREATER)||(LA24_0 >= LBRACK && LA24_0 <= LESSER)||(LA24_0 >= MINUS && LA24_0 <= NEQ)||LA24_0==OR||LA24_0==PLUS||(LA24_0 >= RPAREN && LA24_0 <= SEMI)||LA24_0==THEN) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// grammar/Tiger.g:261:4: ( LPAREN expr_list RPAREN )
					{
					// grammar/Tiger.g:261:4: ( LPAREN expr_list RPAREN )
					// grammar/Tiger.g:261:5: LPAREN expr_list RPAREN
					{
					LPAREN134=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement_assignment_id1272);  
					stream_LPAREN.add(LPAREN134);

					pushFollow(FOLLOW_expr_list_in_statement_assignment_id1274);
					expr_list135=expr_list();
					state._fsp--;

					stream_expr_list.add(expr_list135.getTree());
					RPAREN136=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement_assignment_id1276);  
					stream_RPAREN.add(RPAREN136);

					}

					// AST REWRITE
					// elements: expr_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 261:30: -> ( expr_list )?
					{
						// grammar/Tiger.g:261:33: ( expr_list )?
						if ( stream_expr_list.hasNext() ) {
							adaptor.addChild(root_0, stream_expr_list.nextTree());
						}
						stream_expr_list.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:262:4: optional_subscript expr_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_optional_subscript_in_statement_assignment_id1287);
					optional_subscript137=optional_subscript();
					state._fsp--;

					adaptor.addChild(root_0, optional_subscript137.getTree());

					pushFollow(FOLLOW_expr_tail_in_statement_assignment_id1289);
					expr_tail138=expr_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_tail138.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement_assignment_id"


	public static class if_stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_stmt"
	// grammar/Tiger.g:265:1: if_stmt : ( IF expr THEN stat_seq else_stmt ENDIF SEMI ) -> ^( IF expr stat_seq ( else_stmt )? ) ;
	public final TigerParser.if_stmt_return if_stmt() throws RecognitionException {
		TigerParser.if_stmt_return retval = new TigerParser.if_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF139=null;
		Token THEN141=null;
		Token ENDIF144=null;
		Token SEMI145=null;
		ParserRuleReturnScope expr140 =null;
		ParserRuleReturnScope stat_seq142 =null;
		ParserRuleReturnScope else_stmt143 =null;

		Object IF139_tree=null;
		Object THEN141_tree=null;
		Object ENDIF144_tree=null;
		Object SEMI145_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_else_stmt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmt");

		try {
			// grammar/Tiger.g:266:2: ( ( IF expr THEN stat_seq else_stmt ENDIF SEMI ) -> ^( IF expr stat_seq ( else_stmt )? ) )
			// grammar/Tiger.g:266:4: ( IF expr THEN stat_seq else_stmt ENDIF SEMI )
			{
			// grammar/Tiger.g:266:4: ( IF expr THEN stat_seq else_stmt ENDIF SEMI )
			// grammar/Tiger.g:266:5: IF expr THEN stat_seq else_stmt ENDIF SEMI
			{
			IF139=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1301);  
			stream_IF.add(IF139);

			pushFollow(FOLLOW_expr_in_if_stmt1303);
			expr140=expr();
			state._fsp--;

			stream_expr.add(expr140.getTree());
			THEN141=(Token)match(input,THEN,FOLLOW_THEN_in_if_stmt1305);  
			stream_THEN.add(THEN141);

			pushFollow(FOLLOW_stat_seq_in_if_stmt1307);
			stat_seq142=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq142.getTree());
			pushFollow(FOLLOW_else_stmt_in_if_stmt1309);
			else_stmt143=else_stmt();
			state._fsp--;

			stream_else_stmt.add(else_stmt143.getTree());
			ENDIF144=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_stmt1311);  
			stream_ENDIF.add(ENDIF144);

			SEMI145=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_stmt1313);  
			stream_SEMI.add(SEMI145);

			}

			// AST REWRITE
			// elements: else_stmt, expr, IF, stat_seq
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 266:49: -> ^( IF expr stat_seq ( else_stmt )? )
			{
				// grammar/Tiger.g:266:52: ^( IF expr stat_seq ( else_stmt )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				// grammar/Tiger.g:266:71: ( else_stmt )?
				if ( stream_else_stmt.hasNext() ) {
					adaptor.addChild(root_1, stream_else_stmt.nextTree());
				}
				stream_else_stmt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_stmt"


	public static class else_stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "else_stmt"
	// grammar/Tiger.g:269:1: else_stmt : ( ELSE stat_seq -> stat_seq |);
	public final TigerParser.else_stmt_return else_stmt() throws RecognitionException {
		TigerParser.else_stmt_return retval = new TigerParser.else_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE146=null;
		ParserRuleReturnScope stat_seq147 =null;

		Object ELSE146_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");

		try {
			// grammar/Tiger.g:270:2: ( ELSE stat_seq -> stat_seq |)
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==ELSE) ) {
				alt25=1;
			}
			else if ( (LA25_0==ENDIF) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// grammar/Tiger.g:270:4: ELSE stat_seq
					{
					ELSE146=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1339);  
					stream_ELSE.add(ELSE146);

					pushFollow(FOLLOW_stat_seq_in_else_stmt1341);
					stat_seq147=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq147.getTree());
					// AST REWRITE
					// elements: stat_seq
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 270:18: -> stat_seq
					{
						adaptor.addChild(root_0, stream_stat_seq.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:272:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "else_stmt"


	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// grammar/Tiger.g:274:1: constant : ( INTLIT | FIXEDPTLIT );
	public final TigerParser.constant_return constant() throws RecognitionException {
		TigerParser.constant_return retval = new TigerParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set148=null;

		Object set148_tree=null;

		try {
			// grammar/Tiger.g:275:2: ( INTLIT | FIXEDPTLIT )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set148=input.LT(1);
			if ( input.LA(1)==FIXEDPTLIT||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set148));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class binary_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binary_operator"
	// grammar/Tiger.g:279:1: binary_operator : ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR );
	public final TigerParser.binary_operator_return binary_operator() throws RecognitionException {
		TigerParser.binary_operator_return retval = new TigerParser.binary_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set149=null;

		Object set149_tree=null;

		try {
			// grammar/Tiger.g:280:2: ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set149=input.LT(1);
			if ( input.LA(1)==AND||input.LA(1)==DIV||input.LA(1)==EQ||(input.LA(1) >= GEQ && input.LA(1) <= GREATER)||(input.LA(1) >= LEQ && input.LA(1) <= LESSER)||(input.LA(1) >= MINUS && input.LA(1) <= NEQ)||input.LA(1)==OR||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set149));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binary_operator"


	public static class array_dimensions_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_dimensions"
	// grammar/Tiger.g:294:1: array_dimensions : array_dimension ( array_dimension )? ;
	public final TigerParser.array_dimensions_return array_dimensions() throws RecognitionException {
		TigerParser.array_dimensions_return retval = new TigerParser.array_dimensions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_dimension150 =null;
		ParserRuleReturnScope array_dimension151 =null;


		try {
			// grammar/Tiger.g:295:2: ( array_dimension ( array_dimension )? )
			// grammar/Tiger.g:295:4: array_dimension ( array_dimension )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_dimension_in_array_dimensions1443);
			array_dimension150=array_dimension();
			state._fsp--;

			adaptor.addChild(root_0, array_dimension150.getTree());

			// grammar/Tiger.g:295:20: ( array_dimension )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LBRACK) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// grammar/Tiger.g:295:20: array_dimension
					{
					pushFollow(FOLLOW_array_dimension_in_array_dimensions1445);
					array_dimension151=array_dimension();
					state._fsp--;

					adaptor.addChild(root_0, array_dimension151.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_dimensions"


	public static class array_dimension_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_dimension"
	// grammar/Tiger.g:298:1: array_dimension : ( LBRACK INTLIT RBRACK ) -> INTLIT ;
	public final TigerParser.array_dimension_return array_dimension() throws RecognitionException {
		TigerParser.array_dimension_return retval = new TigerParser.array_dimension_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK152=null;
		Token INTLIT153=null;
		Token RBRACK154=null;

		Object LBRACK152_tree=null;
		Object INTLIT153_tree=null;
		Object RBRACK154_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");

		try {
			// grammar/Tiger.g:299:2: ( ( LBRACK INTLIT RBRACK ) -> INTLIT )
			// grammar/Tiger.g:299:4: ( LBRACK INTLIT RBRACK )
			{
			// grammar/Tiger.g:299:4: ( LBRACK INTLIT RBRACK )
			// grammar/Tiger.g:299:5: LBRACK INTLIT RBRACK
			{
			LBRACK152=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_dimension1458);  
			stream_LBRACK.add(LBRACK152);

			INTLIT153=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_array_dimension1460);  
			stream_INTLIT.add(INTLIT153);

			RBRACK154=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_dimension1462);  
			stream_RBRACK.add(RBRACK154);

			}

			// AST REWRITE
			// elements: INTLIT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 299:27: -> INTLIT
			{
				adaptor.addChild(root_0, stream_INTLIT.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_dimension"


	public static class array_subscripts_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_subscripts"
	// grammar/Tiger.g:302:1: array_subscripts : array_subscript ( array_subscript )? ;
	public final TigerParser.array_subscripts_return array_subscripts() throws RecognitionException {
		TigerParser.array_subscripts_return retval = new TigerParser.array_subscripts_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_subscript155 =null;
		ParserRuleReturnScope array_subscript156 =null;


		try {
			// grammar/Tiger.g:303:2: ( array_subscript ( array_subscript )? )
			// grammar/Tiger.g:303:4: array_subscript ( array_subscript )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_subscript_in_array_subscripts1478);
			array_subscript155=array_subscript();
			state._fsp--;

			adaptor.addChild(root_0, array_subscript155.getTree());

			// grammar/Tiger.g:303:20: ( array_subscript )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==LBRACK) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// grammar/Tiger.g:303:20: array_subscript
					{
					pushFollow(FOLLOW_array_subscript_in_array_subscripts1480);
					array_subscript156=array_subscript();
					state._fsp--;

					adaptor.addChild(root_0, array_subscript156.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_subscripts"


	public static class array_subscript_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_subscript"
	// grammar/Tiger.g:306:1: array_subscript : ( LBRACK index_expr RBRACK ) -> index_expr ;
	public final TigerParser.array_subscript_return array_subscript() throws RecognitionException {
		TigerParser.array_subscript_return retval = new TigerParser.array_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK157=null;
		Token RBRACK159=null;
		ParserRuleReturnScope index_expr158 =null;

		Object LBRACK157_tree=null;
		Object RBRACK159_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// grammar/Tiger.g:307:2: ( ( LBRACK index_expr RBRACK ) -> index_expr )
			// grammar/Tiger.g:307:4: ( LBRACK index_expr RBRACK )
			{
			// grammar/Tiger.g:307:4: ( LBRACK index_expr RBRACK )
			// grammar/Tiger.g:307:5: LBRACK index_expr RBRACK
			{
			LBRACK157=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_subscript1493);  
			stream_LBRACK.add(LBRACK157);

			pushFollow(FOLLOW_index_expr_in_array_subscript1495);
			index_expr158=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr158.getTree());
			RBRACK159=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_subscript1497);  
			stream_RBRACK.add(RBRACK159);

			}

			// AST REWRITE
			// elements: index_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 307:31: -> index_expr
			{
				adaptor.addChild(root_0, stream_index_expr.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_subscript"


	public static class index_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr"
	// grammar/Tiger.g:310:1: index_expr : index_expr_head index_expr_tail -> ^( EXPR index_expr_head ( index_expr_tail )? ) ;
	public final TigerParser.index_expr_return index_expr() throws RecognitionException {
		TigerParser.index_expr_return retval = new TigerParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope index_expr_head160 =null;
		ParserRuleReturnScope index_expr_tail161 =null;

		RewriteRuleSubtreeStream stream_index_expr_head=new RewriteRuleSubtreeStream(adaptor,"rule index_expr_head");
		RewriteRuleSubtreeStream stream_index_expr_tail=new RewriteRuleSubtreeStream(adaptor,"rule index_expr_tail");

		try {
			// grammar/Tiger.g:311:2: ( index_expr_head index_expr_tail -> ^( EXPR index_expr_head ( index_expr_tail )? ) )
			// grammar/Tiger.g:311:4: index_expr_head index_expr_tail
			{
			pushFollow(FOLLOW_index_expr_head_in_index_expr1513);
			index_expr_head160=index_expr_head();
			state._fsp--;

			stream_index_expr_head.add(index_expr_head160.getTree());
			pushFollow(FOLLOW_index_expr_tail_in_index_expr1515);
			index_expr_tail161=index_expr_tail();
			state._fsp--;

			stream_index_expr_tail.add(index_expr_tail161.getTree());
			// AST REWRITE
			// elements: index_expr_tail, index_expr_head
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 311:36: -> ^( EXPR index_expr_head ( index_expr_tail )? )
			{
				// grammar/Tiger.g:311:39: ^( EXPR index_expr_head ( index_expr_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_index_expr_head.nextTree());
				// grammar/Tiger.g:311:62: ( index_expr_tail )?
				if ( stream_index_expr_tail.hasNext() ) {
					adaptor.addChild(root_1, stream_index_expr_tail.nextTree());
				}
				stream_index_expr_tail.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_expr"


	public static class index_expr_head_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr_head"
	// grammar/Tiger.g:314:1: index_expr_head : ( INTLIT | ID );
	public final TigerParser.index_expr_head_return index_expr_head() throws RecognitionException {
		TigerParser.index_expr_head_return retval = new TigerParser.index_expr_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set162=null;

		Object set162_tree=null;

		try {
			// grammar/Tiger.g:315:2: ( INTLIT | ID )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set162=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set162));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_expr_head"


	public static class index_expr_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr_tail"
	// grammar/Tiger.g:319:1: index_expr_tail : ( ( index_oper index_expr ) -> ^( index_oper index_expr ) |);
	public final TigerParser.index_expr_tail_return index_expr_tail() throws RecognitionException {
		TigerParser.index_expr_tail_return retval = new TigerParser.index_expr_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope index_oper163 =null;
		ParserRuleReturnScope index_expr164 =null;

		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_index_oper=new RewriteRuleSubtreeStream(adaptor,"rule index_oper");

		try {
			// grammar/Tiger.g:320:2: ( ( index_oper index_expr ) -> ^( index_oper index_expr ) |)
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= MINUS && LA28_0 <= MULT)||LA28_0==PLUS) ) {
				alt28=1;
			}
			else if ( (LA28_0==DO||LA28_0==RBRACK||LA28_0==TO) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// grammar/Tiger.g:320:4: ( index_oper index_expr )
					{
					// grammar/Tiger.g:320:4: ( index_oper index_expr )
					// grammar/Tiger.g:320:5: index_oper index_expr
					{
					pushFollow(FOLLOW_index_oper_in_index_expr_tail1554);
					index_oper163=index_oper();
					state._fsp--;

					stream_index_oper.add(index_oper163.getTree());
					pushFollow(FOLLOW_index_expr_in_index_expr_tail1556);
					index_expr164=index_expr();
					state._fsp--;

					stream_index_expr.add(index_expr164.getTree());
					}

					// AST REWRITE
					// elements: index_expr, index_oper
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 320:28: -> ^( index_oper index_expr )
					{
						// grammar/Tiger.g:320:31: ^( index_oper index_expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_index_oper.nextNode(), root_1);
						adaptor.addChild(root_1, stream_index_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:322:2: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_expr_tail"


	public static class index_oper_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_oper"
	// grammar/Tiger.g:324:1: index_oper : ( PLUS | MINUS | MULT );
	public final TigerParser.index_oper_return index_oper() throws RecognitionException {
		TigerParser.index_oper_return retval = new TigerParser.index_oper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set165=null;

		Object set165_tree=null;

		try {
			// grammar/Tiger.g:325:2: ( PLUS | MINUS | MULT )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set165=input.LT(1);
			if ( (input.LA(1) >= MINUS && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set165));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_oper"

	// Delegated rules



	public static final BitSet FOLLOW_type_declaration_list_in_tiger_program143 = new BitSet(new long[]{0x2000000120400000L});
	public static final BitSet FOLLOW_function_declaration_list_in_tiger_program145 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_tiger_program147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_tail_in_type_declaration_list171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_tail192 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_type_declaration_tail_in_type_declaration_tail194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration209 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_type_declaration211 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration213 = new BitSet(new long[]{0x0000000100400020L});
	public static final BitSet FOLLOW_type_in_type_declaration215 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_tail_in_function_declaration_list239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_in_function_declaration_tail259 = new BitSet(new long[]{0x2000000120400000L});
	public static final BitSet FOLLOW_function_declaration_tail_in_function_declaration_tail261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_function_definition276 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_function_definition_body_in_function_definition278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_function_definition295 = new BitSet(new long[]{0x0000008002000000L});
	public static final BitSet FOLLOW_function_definition_void_in_function_definition297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_body_in_function_definition_void319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_main_in_function_definition_void324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_definition_body336 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_function_definition_body338 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_definition_body340 = new BitSet(new long[]{0x0010000020000000L});
	public static final BitSet FOLLOW_param_list_in_function_definition_body342 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_definition_body344 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_function_definition_body346 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_function_definition_body348 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_function_definition_body350 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_function_definition_body352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_function_definition_main379 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_definition_main381 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_definition_main383 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_function_definition_main385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list405 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail424 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_param_in_param_list_tail426 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_tail428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_param453 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_param455 = new BitSet(new long[]{0x0000000120400000L});
	public static final BitSet FOLLOW_type_id_in_param457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list479 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail492 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block510 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_declaration_segment_in_block512 = new BitSet(new long[]{0x40080000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_block514 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_block516 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_list_in_declaration_segment541 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_declaration_segment543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_tail_in_var_declaration_list554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_tail574 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_var_declaration_tail_in_var_declaration_tail576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type596 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_array_dimensions_in_type598 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_OF_in_type600 = new BitSet(new long[]{0x0000000100400000L});
	public static final BitSet FOLLOW_base_type_in_type602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_id629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration657 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration659 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_var_declaration661 = new BitSet(new long[]{0x0000000120400000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration663 = new BitSet(new long[]{0x0020000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration665 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init692 = new BitSet(new long[]{0x0000000200800000L});
	public static final BitSet FOLLOW_constant_in_optional_init694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_list_head_in_id_list714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list_head735 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list_head737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_id_list_tail756 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_id_list_head_in_id_list_tail758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_int776 = new BitSet(new long[]{0x0000000200800000L});
	public static final BitSet FOLLOW_constant_in_optional_int778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list801 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail831 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail833 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_in_expr858 = new BitSet(new long[]{0x0000973018082010L});
	public static final BitSet FOLLOW_expr_tail_in_expr860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_operator_in_expr_tail872 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_expr_tail874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_base_in_expr_head898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr_head904 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_optional_subscript_in_expr_head906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_head_base929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_head_base935 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_expr_head_base937 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_head_base939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq959 = new BitSet(new long[]{0x40080000A1000280L});
	public static final BitSet FOLLOW_stat_tail_in_stat_seq961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_tail983 = new BitSet(new long[]{0x40080000A1000280L});
	public static final BitSet FOLLOW_stat_tail_in_stat_tail985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_stat1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat1012 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_stat1014 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat1016 = new BitSet(new long[]{0x40080000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_stat1018 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat1020 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat1039 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_stat1041 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1043 = new BitSet(new long[]{0x0000000220000000L});
	public static final BitSet FOLLOW_range_in_stat1045 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat1047 = new BitSet(new long[]{0x40080000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_stat1049 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat1051 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat1069 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat1080 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_stat1082 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat1102 = new BitSet(new long[]{0x0000004800000040L});
	public static final BitSet FOLLOW_LPAREN_in_stat1113 = new BitSet(new long[]{0x0010004220800000L});
	public static final BitSet FOLLOW_expr_list_in_stat1115 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat1117 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_optional_subscript_in_stat1141 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1143 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_statement_assignment_in_stat1145 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_subscripts_in_optional_subscript1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_range1199 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_TO_in_range1201 = new BitSet(new long[]{0x0000000220000000L});
	public static final BitSet FOLLOW_index_expr_in_range1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_statement_assignment1226 = new BitSet(new long[]{0x0000977818082010L});
	public static final BitSet FOLLOW_statement_assignment_id_in_statement_assignment1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_base_in_statement_assignment1246 = new BitSet(new long[]{0x0000973018082010L});
	public static final BitSet FOLLOW_expr_tail_in_statement_assignment1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_statement_assignment_id1272 = new BitSet(new long[]{0x0010004220800000L});
	public static final BitSet FOLLOW_expr_list_in_statement_assignment_id1274 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_statement_assignment_id1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_optional_subscript_in_statement_assignment_id1287 = new BitSet(new long[]{0x0000973018082010L});
	public static final BitSet FOLLOW_expr_tail_in_statement_assignment_id1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt1301 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_if_stmt1303 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_THEN_in_if_stmt1305 = new BitSet(new long[]{0x40080000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_if_stmt1307 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_else_stmt_in_if_stmt1309 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDIF_in_if_stmt1311 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_stmt1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_stmt1339 = new BitSet(new long[]{0x40080000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_else_stmt1341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions1443 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions1445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_dimension1458 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INTLIT_in_array_dimension1460 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_dimension1462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_subscript_in_array_subscripts1478 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_subscript_in_array_subscripts1480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_subscript1493 = new BitSet(new long[]{0x0000000220000000L});
	public static final BitSet FOLLOW_index_expr_in_array_subscript1495 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_subscript1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_head_in_index_expr1513 = new BitSet(new long[]{0x0000830000000000L});
	public static final BitSet FOLLOW_index_expr_tail_in_index_expr1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_oper_in_index_expr_tail1554 = new BitSet(new long[]{0x0000000220000000L});
	public static final BitSet FOLLOW_index_expr_in_index_expr_tail1556 = new BitSet(new long[]{0x0000000000000002L});
}
