// $ANTLR 3.5.1 grammar/Tiger.g 2014-10-21 17:57:58

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
		"ENDDO", "ENDIF", "EQ", "EXPRS", "FIXEDPT", "FIXEDPTLIT", "FOR", "FUNCTION", 
		"FUNCTIONS", "GEQ", "GREATER", "ID", "IDS", "IF", "INT", "INTLIT", "INVOKE", 
		"LBRACK", "LEQ", "LESSER", "LPAREN", "MAIN", "MINUS", "MULT", "NEQ", "OF", 
		"OR", "PARAM", "PARAMS", "PLUS", "PROGRAM", "RBRACK", "REFERENCE", "RETURN", 
		"RPAREN", "SEMI", "STATEMENTS", "THEN", "TO", "TYPE", "TYPES", "VAR", 
		"VARIABLES", "VOID", "WHILE", "WS"
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
	public static final int EXPRS=20;
	public static final int FIXEDPT=21;
	public static final int FIXEDPTLIT=22;
	public static final int FOR=23;
	public static final int FUNCTION=24;
	public static final int FUNCTIONS=25;
	public static final int GEQ=26;
	public static final int GREATER=27;
	public static final int ID=28;
	public static final int IDS=29;
	public static final int IF=30;
	public static final int INT=31;
	public static final int INTLIT=32;
	public static final int INVOKE=33;
	public static final int LBRACK=34;
	public static final int LEQ=35;
	public static final int LESSER=36;
	public static final int LPAREN=37;
	public static final int MAIN=38;
	public static final int MINUS=39;
	public static final int MULT=40;
	public static final int NEQ=41;
	public static final int OF=42;
	public static final int OR=43;
	public static final int PARAM=44;
	public static final int PARAMS=45;
	public static final int PLUS=46;
	public static final int PROGRAM=47;
	public static final int RBRACK=48;
	public static final int REFERENCE=49;
	public static final int RETURN=50;
	public static final int RPAREN=51;
	public static final int SEMI=52;
	public static final int STATEMENTS=53;
	public static final int THEN=54;
	public static final int TO=55;
	public static final int TYPE=56;
	public static final int TYPES=57;
	public static final int VAR=58;
	public static final int VARIABLES=59;
	public static final int VOID=60;
	public static final int WHILE=61;
	public static final int WS=62;

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
	// grammar/Tiger.g:60:1: tiger_program : ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ( type_declaration_list )? function_declaration_list ) ;
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
			// grammar/Tiger.g:61:2: ( ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ( type_declaration_list )? function_declaration_list ) )
			// grammar/Tiger.g:61:4: ( type_declaration_list function_declaration_list EOF )
			{
			// grammar/Tiger.g:61:4: ( type_declaration_list function_declaration_list EOF )
			// grammar/Tiger.g:61:5: type_declaration_list function_declaration_list EOF
			{
			pushFollow(FOLLOW_type_declaration_list_in_tiger_program139);
			type_declaration_list1=type_declaration_list();
			state._fsp--;

			stream_type_declaration_list.add(type_declaration_list1.getTree());
			pushFollow(FOLLOW_function_declaration_list_in_tiger_program141);
			function_declaration_list2=function_declaration_list();
			state._fsp--;

			stream_function_declaration_list.add(function_declaration_list2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_tiger_program143);  
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
			// 61:58: -> ^( PROGRAM ( type_declaration_list )? function_declaration_list )
			{
				// grammar/Tiger.g:61:61: ^( PROGRAM ( type_declaration_list )? function_declaration_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// grammar/Tiger.g:61:71: ( type_declaration_list )?
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
	// grammar/Tiger.g:64:1: type_declaration_list : ( type_declaration_tail ) -> ^( TYPES ( type_declaration_tail )? ) ;
	public final TigerParser.type_declaration_list_return type_declaration_list() throws RecognitionException {
		TigerParser.type_declaration_list_return retval = new TigerParser.type_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_tail4 =null;

		RewriteRuleSubtreeStream stream_type_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_tail");

		try {
			// grammar/Tiger.g:65:2: ( ( type_declaration_tail ) -> ^( TYPES ( type_declaration_tail )? ) )
			// grammar/Tiger.g:65:4: ( type_declaration_tail )
			{
			// grammar/Tiger.g:65:4: ( type_declaration_tail )
			// grammar/Tiger.g:65:5: type_declaration_tail
			{
			pushFollow(FOLLOW_type_declaration_tail_in_type_declaration_list167);
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
			// 65:28: -> ^( TYPES ( type_declaration_tail )? )
			{
				// grammar/Tiger.g:65:31: ^( TYPES ( type_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);
				// grammar/Tiger.g:65:39: ( type_declaration_tail )?
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
	// grammar/Tiger.g:68:1: type_declaration_tail : ( type_declaration type_declaration_tail |);
	public final TigerParser.type_declaration_tail_return type_declaration_tail() throws RecognitionException {
		TigerParser.type_declaration_tail_return retval = new TigerParser.type_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration5 =null;
		ParserRuleReturnScope type_declaration_tail6 =null;


		try {
			// grammar/Tiger.g:69:2: ( type_declaration type_declaration_tail |)
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
					// grammar/Tiger.g:69:4: type_declaration type_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_declaration_in_type_declaration_tail188);
					type_declaration5=type_declaration();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration5.getTree());

					pushFollow(FOLLOW_type_declaration_tail_in_type_declaration_tail190);
					type_declaration_tail6=type_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration_tail6.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:71:2: 
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
	// grammar/Tiger.g:73:1: type_declaration : ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) ;
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
			// grammar/Tiger.g:74:2: ( ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) )
			// grammar/Tiger.g:74:4: ( TYPE ID EQ type SEMI )
			{
			// grammar/Tiger.g:74:4: ( TYPE ID EQ type SEMI )
			// grammar/Tiger.g:74:5: TYPE ID EQ type SEMI
			{
			TYPE7=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_declaration205);  
			stream_TYPE.add(TYPE7);

			ID8=(Token)match(input,ID,FOLLOW_ID_in_type_declaration207);  
			stream_ID.add(ID8);

			EQ9=(Token)match(input,EQ,FOLLOW_EQ_in_type_declaration209);  
			stream_EQ.add(EQ9);

			pushFollow(FOLLOW_type_in_type_declaration211);
			type10=type();
			state._fsp--;

			stream_type.add(type10.getTree());
			SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_type_declaration213);  
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
			// 74:27: -> ^( TYPE ID type )
			{
				// grammar/Tiger.g:74:30: ^( TYPE ID type )
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
	// grammar/Tiger.g:77:1: function_declaration_list : function_declaration_tail -> ^( FUNCTIONS ( function_declaration_tail )? ) ;
	public final TigerParser.function_declaration_list_return function_declaration_list() throws RecognitionException {
		TigerParser.function_declaration_list_return retval = new TigerParser.function_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_declaration_tail12 =null;

		RewriteRuleSubtreeStream stream_function_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_tail");

		try {
			// grammar/Tiger.g:78:2: ( function_declaration_tail -> ^( FUNCTIONS ( function_declaration_tail )? ) )
			// grammar/Tiger.g:78:4: function_declaration_tail
			{
			pushFollow(FOLLOW_function_declaration_tail_in_function_declaration_list235);
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
			// 78:30: -> ^( FUNCTIONS ( function_declaration_tail )? )
			{
				// grammar/Tiger.g:78:33: ^( FUNCTIONS ( function_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_1);
				// grammar/Tiger.g:78:45: ( function_declaration_tail )?
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
	// grammar/Tiger.g:81:1: function_declaration_tail : ( function_definition function_declaration_tail |);
	public final TigerParser.function_declaration_tail_return function_declaration_tail() throws RecognitionException {
		TigerParser.function_declaration_tail_return retval = new TigerParser.function_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_definition13 =null;
		ParserRuleReturnScope function_declaration_tail14 =null;


		try {
			// grammar/Tiger.g:82:2: ( function_definition function_declaration_tail |)
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
					// grammar/Tiger.g:82:4: function_definition function_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_in_function_declaration_tail255);
					function_definition13=function_definition();
					state._fsp--;

					adaptor.addChild(root_0, function_definition13.getTree());

					pushFollow(FOLLOW_function_declaration_tail_in_function_declaration_tail257);
					function_declaration_tail14=function_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, function_declaration_tail14.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:84:2: 
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
	// grammar/Tiger.g:86:1: function_definition : ( ( type_id function_definition_body ) -> ^( FUNCTION type_id function_definition_body ) | ( VOID function_definition_void ) -> ^( FUNCTION VOID function_definition_void ) );
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
			// grammar/Tiger.g:87:2: ( ( type_id function_definition_body ) -> ^( FUNCTION type_id function_definition_body ) | ( VOID function_definition_void ) -> ^( FUNCTION VOID function_definition_void ) )
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
					// grammar/Tiger.g:87:4: ( type_id function_definition_body )
					{
					// grammar/Tiger.g:87:4: ( type_id function_definition_body )
					// grammar/Tiger.g:87:5: type_id function_definition_body
					{
					pushFollow(FOLLOW_type_id_in_function_definition272);
					type_id15=type_id();
					state._fsp--;

					stream_type_id.add(type_id15.getTree());
					pushFollow(FOLLOW_function_definition_body_in_function_definition274);
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
					// 87:39: -> ^( FUNCTION type_id function_definition_body )
					{
						// grammar/Tiger.g:87:42: ^( FUNCTION type_id function_definition_body )
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
					// grammar/Tiger.g:88:4: ( VOID function_definition_void )
					{
					// grammar/Tiger.g:88:4: ( VOID function_definition_void )
					// grammar/Tiger.g:88:5: VOID function_definition_void
					{
					VOID17=(Token)match(input,VOID,FOLLOW_VOID_in_function_definition291);  
					stream_VOID.add(VOID17);

					pushFollow(FOLLOW_function_definition_void_in_function_definition293);
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
					// 88:36: -> ^( FUNCTION VOID function_definition_void )
					{
						// grammar/Tiger.g:88:39: ^( FUNCTION VOID function_definition_void )
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
	// grammar/Tiger.g:91:1: function_definition_void : ( function_definition_body | function_definition_main );
	public final TigerParser.function_definition_void_return function_definition_void() throws RecognitionException {
		TigerParser.function_definition_void_return retval = new TigerParser.function_definition_void_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_definition_body19 =null;
		ParserRuleReturnScope function_definition_main20 =null;


		try {
			// grammar/Tiger.g:92:2: ( function_definition_body | function_definition_main )
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
					// grammar/Tiger.g:92:4: function_definition_body
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_body_in_function_definition_void315);
					function_definition_body19=function_definition_body();
					state._fsp--;

					adaptor.addChild(root_0, function_definition_body19.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:93:4: function_definition_main
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_main_in_function_definition_void320);
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
	// grammar/Tiger.g:96:1: function_definition_body : ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) -> ID param_list block_list ;
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
			// grammar/Tiger.g:97:2: ( ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) -> ID param_list block_list )
			// grammar/Tiger.g:97:4: ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			{
			// grammar/Tiger.g:97:4: ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			// grammar/Tiger.g:97:5: FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			FUNCTION21=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_definition_body332);  
			stream_FUNCTION.add(FUNCTION21);

			ID22=(Token)match(input,ID,FOLLOW_ID_in_function_definition_body334);  
			stream_ID.add(ID22);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_definition_body336);  
			stream_LPAREN.add(LPAREN23);

			pushFollow(FOLLOW_param_list_in_function_definition_body338);
			param_list24=param_list();
			state._fsp--;

			stream_param_list.add(param_list24.getTree());
			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition_body340);  
			stream_RPAREN.add(RPAREN25);

			BEGIN26=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_function_definition_body342);  
			stream_BEGIN.add(BEGIN26);

			pushFollow(FOLLOW_block_list_in_function_definition_body344);
			block_list27=block_list();
			state._fsp--;

			stream_block_list.add(block_list27.getTree());
			END28=(Token)match(input,END,FOLLOW_END_in_function_definition_body346);  
			stream_END.add(END28);

			SEMI29=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_definition_body348);  
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
			// 97:69: -> ID param_list block_list
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
				adaptor.addChild(root_0, stream_param_list.nextTree());
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
	// grammar/Tiger.g:100:1: function_definition_main : ( MAIN LPAREN RPAREN block_list ) -> MAIN PARAMS block_list ;
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
			// grammar/Tiger.g:101:2: ( ( MAIN LPAREN RPAREN block_list ) -> MAIN PARAMS block_list )
			// grammar/Tiger.g:101:4: ( MAIN LPAREN RPAREN block_list )
			{
			// grammar/Tiger.g:101:4: ( MAIN LPAREN RPAREN block_list )
			// grammar/Tiger.g:101:5: MAIN LPAREN RPAREN block_list
			{
			MAIN30=(Token)match(input,MAIN,FOLLOW_MAIN_in_function_definition_main370);  
			stream_MAIN.add(MAIN30);

			LPAREN31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_definition_main372);  
			stream_LPAREN.add(LPAREN31);

			RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition_main374);  
			stream_RPAREN.add(RPAREN32);

			pushFollow(FOLLOW_block_list_in_function_definition_main376);
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
			// 101:36: -> MAIN PARAMS block_list
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
	// grammar/Tiger.g:104:1: param_list : param_list_internal -> ^( PARAMS ( param_list_internal )? ) ;
	public final TigerParser.param_list_return param_list() throws RecognitionException {
		TigerParser.param_list_return retval = new TigerParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope param_list_internal34 =null;

		RewriteRuleSubtreeStream stream_param_list_internal=new RewriteRuleSubtreeStream(adaptor,"rule param_list_internal");

		try {
			// grammar/Tiger.g:105:2: ( param_list_internal -> ^( PARAMS ( param_list_internal )? ) )
			// grammar/Tiger.g:105:4: param_list_internal
			{
			pushFollow(FOLLOW_param_list_internal_in_param_list396);
			param_list_internal34=param_list_internal();
			state._fsp--;

			stream_param_list_internal.add(param_list_internal34.getTree());
			// AST REWRITE
			// elements: param_list_internal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 105:24: -> ^( PARAMS ( param_list_internal )? )
			{
				// grammar/Tiger.g:105:27: ^( PARAMS ( param_list_internal )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
				// grammar/Tiger.g:105:36: ( param_list_internal )?
				if ( stream_param_list_internal.hasNext() ) {
					adaptor.addChild(root_1, stream_param_list_internal.nextTree());
				}
				stream_param_list_internal.reset();

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
	// $ANTLR end "param_list"


	public static class param_list_internal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list_internal"
	// grammar/Tiger.g:108:1: param_list_internal : ( param param_list_tail |);
	public final TigerParser.param_list_internal_return param_list_internal() throws RecognitionException {
		TigerParser.param_list_internal_return retval = new TigerParser.param_list_internal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope param35 =null;
		ParserRuleReturnScope param_list_tail36 =null;


		try {
			// grammar/Tiger.g:109:2: ( param param_list_tail |)
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
					// grammar/Tiger.g:109:4: param param_list_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_param_in_param_list_internal416);
					param35=param();
					state._fsp--;

					adaptor.addChild(root_0, param35.getTree());

					pushFollow(FOLLOW_param_list_tail_in_param_list_internal418);
					param_list_tail36=param_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, param_list_tail36.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:111:2: 
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
	// $ANTLR end "param_list_internal"


	public static class param_list_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list_tail"
	// grammar/Tiger.g:113:1: param_list_tail : ( ( COMMA param param_list_tail ) -> param ( param_list_tail )? |);
	public final TigerParser.param_list_tail_return param_list_tail() throws RecognitionException {
		TigerParser.param_list_tail_return retval = new TigerParser.param_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA37=null;
		ParserRuleReturnScope param38 =null;
		ParserRuleReturnScope param_list_tail39 =null;

		Object COMMA37_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_param_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule param_list_tail");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			// grammar/Tiger.g:114:2: ( ( COMMA param param_list_tail ) -> param ( param_list_tail )? |)
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
					// grammar/Tiger.g:114:4: ( COMMA param param_list_tail )
					{
					// grammar/Tiger.g:114:4: ( COMMA param param_list_tail )
					// grammar/Tiger.g:114:5: COMMA param param_list_tail
					{
					COMMA37=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list_tail435);  
					stream_COMMA.add(COMMA37);

					pushFollow(FOLLOW_param_in_param_list_tail437);
					param38=param();
					state._fsp--;

					stream_param.add(param38.getTree());
					pushFollow(FOLLOW_param_list_tail_in_param_list_tail439);
					param_list_tail39=param_list_tail();
					state._fsp--;

					stream_param_list_tail.add(param_list_tail39.getTree());
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
					// 114:34: -> param ( param_list_tail )?
					{
						adaptor.addChild(root_0, stream_param.nextTree());
						// grammar/Tiger.g:114:43: ( param_list_tail )?
						if ( stream_param_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_param_list_tail.nextTree());
						}
						stream_param_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:116:2: 
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
	// grammar/Tiger.g:118:1: param : ID COLON type_id -> ^( PARAM ID type_id ) ;
	public final TigerParser.param_return param() throws RecognitionException {
		TigerParser.param_return retval = new TigerParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID40=null;
		Token COLON41=null;
		ParserRuleReturnScope type_id42 =null;

		Object ID40_tree=null;
		Object COLON41_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");

		try {
			// grammar/Tiger.g:119:2: ( ID COLON type_id -> ^( PARAM ID type_id ) )
			// grammar/Tiger.g:119:4: ID COLON type_id
			{
			ID40=(Token)match(input,ID,FOLLOW_ID_in_param464);  
			stream_ID.add(ID40);

			COLON41=(Token)match(input,COLON,FOLLOW_COLON_in_param466);  
			stream_COLON.add(COLON41);

			pushFollow(FOLLOW_type_id_in_param468);
			type_id42=type_id();
			state._fsp--;

			stream_type_id.add(type_id42.getTree());
			// AST REWRITE
			// elements: type_id, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 119:21: -> ^( PARAM ID type_id )
			{
				// grammar/Tiger.g:119:24: ^( PARAM ID type_id )
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
	// grammar/Tiger.g:122:1: block_list : block block_tail ;
	public final TigerParser.block_list_return block_list() throws RecognitionException {
		TigerParser.block_list_return retval = new TigerParser.block_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block43 =null;
		ParserRuleReturnScope block_tail44 =null;


		try {
			// grammar/Tiger.g:123:2: ( block block_tail )
			// grammar/Tiger.g:123:4: block block_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_block_list490);
			block43=block();
			state._fsp--;

			adaptor.addChild(root_0, block43.getTree());

			pushFollow(FOLLOW_block_tail_in_block_list492);
			block_tail44=block_tail();
			state._fsp--;

			adaptor.addChild(root_0, block_tail44.getTree());

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
	// grammar/Tiger.g:126:1: block_tail : ( block block_tail |);
	public final TigerParser.block_tail_return block_tail() throws RecognitionException {
		TigerParser.block_tail_return retval = new TigerParser.block_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block45 =null;
		ParserRuleReturnScope block_tail46 =null;


		try {
			// grammar/Tiger.g:127:2: ( block block_tail |)
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
					// grammar/Tiger.g:127:4: block block_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_block_tail503);
					block45=block();
					state._fsp--;

					adaptor.addChild(root_0, block45.getTree());

					pushFollow(FOLLOW_block_tail_in_block_tail505);
					block_tail46=block_tail();
					state._fsp--;

					adaptor.addChild(root_0, block_tail46.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:129:2: 
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
	// grammar/Tiger.g:131:1: block : ( BEGIN declaration_segment stat_seq END SEMI ) -> ^( BLOCK ( declaration_segment )? stat_seq ) ;
	public final TigerParser.block_return block() throws RecognitionException {
		TigerParser.block_return retval = new TigerParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN47=null;
		Token END50=null;
		Token SEMI51=null;
		ParserRuleReturnScope declaration_segment48 =null;
		ParserRuleReturnScope stat_seq49 =null;

		Object BEGIN47_tree=null;
		Object END50_tree=null;
		Object SEMI51_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_declaration_segment=new RewriteRuleSubtreeStream(adaptor,"rule declaration_segment");

		try {
			// grammar/Tiger.g:132:2: ( ( BEGIN declaration_segment stat_seq END SEMI ) -> ^( BLOCK ( declaration_segment )? stat_seq ) )
			// grammar/Tiger.g:132:4: ( BEGIN declaration_segment stat_seq END SEMI )
			{
			// grammar/Tiger.g:132:4: ( BEGIN declaration_segment stat_seq END SEMI )
			// grammar/Tiger.g:132:5: BEGIN declaration_segment stat_seq END SEMI
			{
			BEGIN47=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block521);  
			stream_BEGIN.add(BEGIN47);

			pushFollow(FOLLOW_declaration_segment_in_block523);
			declaration_segment48=declaration_segment();
			state._fsp--;

			stream_declaration_segment.add(declaration_segment48.getTree());
			pushFollow(FOLLOW_stat_seq_in_block525);
			stat_seq49=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq49.getTree());
			END50=(Token)match(input,END,FOLLOW_END_in_block527);  
			stream_END.add(END50);

			SEMI51=(Token)match(input,SEMI,FOLLOW_SEMI_in_block529);  
			stream_SEMI.add(SEMI51);

			}

			// AST REWRITE
			// elements: stat_seq, declaration_segment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 132:50: -> ^( BLOCK ( declaration_segment )? stat_seq )
			{
				// grammar/Tiger.g:132:53: ^( BLOCK ( declaration_segment )? stat_seq )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// grammar/Tiger.g:132:61: ( declaration_segment )?
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
	// grammar/Tiger.g:135:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final TigerParser.declaration_segment_return declaration_segment() throws RecognitionException {
		TigerParser.declaration_segment_return retval = new TigerParser.declaration_segment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_list52 =null;
		ParserRuleReturnScope var_declaration_list53 =null;


		try {
			// grammar/Tiger.g:136:2: ( type_declaration_list var_declaration_list )
			// grammar/Tiger.g:136:4: type_declaration_list var_declaration_list
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_declaration_list_in_declaration_segment552);
			type_declaration_list52=type_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, type_declaration_list52.getTree());

			pushFollow(FOLLOW_var_declaration_list_in_declaration_segment554);
			var_declaration_list53=var_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, var_declaration_list53.getTree());

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
	// grammar/Tiger.g:139:1: var_declaration_list : var_declaration_tail -> ^( VARIABLES ( var_declaration_tail )? ) ;
	public final TigerParser.var_declaration_list_return var_declaration_list() throws RecognitionException {
		TigerParser.var_declaration_list_return retval = new TigerParser.var_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration_tail54 =null;

		RewriteRuleSubtreeStream stream_var_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration_tail");

		try {
			// grammar/Tiger.g:140:2: ( var_declaration_tail -> ^( VARIABLES ( var_declaration_tail )? ) )
			// grammar/Tiger.g:140:4: var_declaration_tail
			{
			pushFollow(FOLLOW_var_declaration_tail_in_var_declaration_list565);
			var_declaration_tail54=var_declaration_tail();
			state._fsp--;

			stream_var_declaration_tail.add(var_declaration_tail54.getTree());
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
			// 140:25: -> ^( VARIABLES ( var_declaration_tail )? )
			{
				// grammar/Tiger.g:140:28: ^( VARIABLES ( var_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				// grammar/Tiger.g:140:40: ( var_declaration_tail )?
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
	// grammar/Tiger.g:143:1: var_declaration_tail : ( var_declaration var_declaration_tail |);
	public final TigerParser.var_declaration_tail_return var_declaration_tail() throws RecognitionException {
		TigerParser.var_declaration_tail_return retval = new TigerParser.var_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration55 =null;
		ParserRuleReturnScope var_declaration_tail56 =null;


		try {
			// grammar/Tiger.g:144:2: ( var_declaration var_declaration_tail |)
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
					// grammar/Tiger.g:144:4: var_declaration var_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_var_declaration_tail585);
					var_declaration55=var_declaration();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration55.getTree());

					pushFollow(FOLLOW_var_declaration_tail_in_var_declaration_tail587);
					var_declaration_tail56=var_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration_tail56.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:146:2: 
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
	// grammar/Tiger.g:148:1: type : ( base_type | ( ARRAY array_dimensions OF base_type ) -> ^( ARRAY array_dimensions base_type ) );
	public final TigerParser.type_return type() throws RecognitionException {
		TigerParser.type_return retval = new TigerParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ARRAY58=null;
		Token OF60=null;
		ParserRuleReturnScope base_type57 =null;
		ParserRuleReturnScope array_dimensions59 =null;
		ParserRuleReturnScope base_type61 =null;

		Object ARRAY58_tree=null;
		Object OF60_tree=null;
		RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
		RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
		RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
		RewriteRuleSubtreeStream stream_array_dimensions=new RewriteRuleSubtreeStream(adaptor,"rule array_dimensions");

		try {
			// grammar/Tiger.g:149:2: ( base_type | ( ARRAY array_dimensions OF base_type ) -> ^( ARRAY array_dimensions base_type ) )
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
					// grammar/Tiger.g:149:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type601);
					base_type57=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type57.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:150:4: ( ARRAY array_dimensions OF base_type )
					{
					// grammar/Tiger.g:150:4: ( ARRAY array_dimensions OF base_type )
					// grammar/Tiger.g:150:5: ARRAY array_dimensions OF base_type
					{
					ARRAY58=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type607);  
					stream_ARRAY.add(ARRAY58);

					pushFollow(FOLLOW_array_dimensions_in_type609);
					array_dimensions59=array_dimensions();
					state._fsp--;

					stream_array_dimensions.add(array_dimensions59.getTree());
					OF60=(Token)match(input,OF,FOLLOW_OF_in_type611);  
					stream_OF.add(OF60);

					pushFollow(FOLLOW_base_type_in_type613);
					base_type61=base_type();
					state._fsp--;

					stream_base_type.add(base_type61.getTree());
					}

					// AST REWRITE
					// elements: base_type, array_dimensions, ARRAY
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 150:42: -> ^( ARRAY array_dimensions base_type )
					{
						// grammar/Tiger.g:150:45: ^( ARRAY array_dimensions base_type )
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
	// grammar/Tiger.g:153:1: type_id : ( base_type | ID );
	public final TigerParser.type_id_return type_id() throws RecognitionException {
		TigerParser.type_id_return retval = new TigerParser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID63=null;
		ParserRuleReturnScope base_type62 =null;

		Object ID63_tree=null;

		try {
			// grammar/Tiger.g:154:2: ( base_type | ID )
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
					// grammar/Tiger.g:154:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type_id635);
					base_type62=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type62.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:155:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID63=(Token)match(input,ID,FOLLOW_ID_in_type_id640); 
					ID63_tree = (Object)adaptor.create(ID63);
					adaptor.addChild(root_0, ID63_tree);

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
	// grammar/Tiger.g:158:1: base_type : ( INT | FIXEDPT );
	public final TigerParser.base_type_return base_type() throws RecognitionException {
		TigerParser.base_type_return retval = new TigerParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set64=null;

		Object set64_tree=null;

		try {
			// grammar/Tiger.g:159:2: ( INT | FIXEDPT )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set64=input.LT(1);
			if ( input.LA(1)==FIXEDPT||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set64));
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
	// grammar/Tiger.g:163:1: var_declaration : ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id ( optional_init )? ) ;
	public final TigerParser.var_declaration_return var_declaration() throws RecognitionException {
		TigerParser.var_declaration_return retval = new TigerParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR65=null;
		Token COLON67=null;
		Token SEMI70=null;
		ParserRuleReturnScope id_list66 =null;
		ParserRuleReturnScope type_id68 =null;
		ParserRuleReturnScope optional_init69 =null;

		Object VAR65_tree=null;
		Object COLON67_tree=null;
		Object SEMI70_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_optional_init=new RewriteRuleSubtreeStream(adaptor,"rule optional_init");

		try {
			// grammar/Tiger.g:164:2: ( ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id ( optional_init )? ) )
			// grammar/Tiger.g:164:4: ( VAR id_list COLON type_id optional_init SEMI )
			{
			// grammar/Tiger.g:164:4: ( VAR id_list COLON type_id optional_init SEMI )
			// grammar/Tiger.g:164:5: VAR id_list COLON type_id optional_init SEMI
			{
			VAR65=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration668);  
			stream_VAR.add(VAR65);

			pushFollow(FOLLOW_id_list_in_var_declaration670);
			id_list66=id_list();
			state._fsp--;

			stream_id_list.add(id_list66.getTree());
			COLON67=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration672);  
			stream_COLON.add(COLON67);

			pushFollow(FOLLOW_type_id_in_var_declaration674);
			type_id68=type_id();
			state._fsp--;

			stream_type_id.add(type_id68.getTree());
			pushFollow(FOLLOW_optional_init_in_var_declaration676);
			optional_init69=optional_init();
			state._fsp--;

			stream_optional_init.add(optional_init69.getTree());
			SEMI70=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration678);  
			stream_SEMI.add(SEMI70);

			}

			// AST REWRITE
			// elements: id_list, type_id, VAR, optional_init
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 164:51: -> ^( VAR id_list type_id ( optional_init )? )
			{
				// grammar/Tiger.g:164:54: ^( VAR id_list type_id ( optional_init )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id_list.nextTree());
				adaptor.addChild(root_1, stream_type_id.nextTree());
				// grammar/Tiger.g:164:76: ( optional_init )?
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
	// grammar/Tiger.g:167:1: optional_init : ( ASSIGN constant -> constant |);
	public final TigerParser.optional_init_return optional_init() throws RecognitionException {
		TigerParser.optional_init_return retval = new TigerParser.optional_init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN71=null;
		ParserRuleReturnScope constant72 =null;

		Object ASSIGN71_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		try {
			// grammar/Tiger.g:168:2: ( ASSIGN constant -> constant |)
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
					// grammar/Tiger.g:168:4: ASSIGN constant
					{
					ASSIGN71=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init703);  
					stream_ASSIGN.add(ASSIGN71);

					pushFollow(FOLLOW_constant_in_optional_init705);
					constant72=constant();
					state._fsp--;

					stream_constant.add(constant72.getTree());
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
					// 168:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:170:2: 
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
	// grammar/Tiger.g:172:1: id_list : ( id_list_head ) -> ^( IDS id_list_head ) ;
	public final TigerParser.id_list_return id_list() throws RecognitionException {
		TigerParser.id_list_return retval = new TigerParser.id_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id_list_head73 =null;

		RewriteRuleSubtreeStream stream_id_list_head=new RewriteRuleSubtreeStream(adaptor,"rule id_list_head");

		try {
			// grammar/Tiger.g:173:2: ( ( id_list_head ) -> ^( IDS id_list_head ) )
			// grammar/Tiger.g:173:4: ( id_list_head )
			{
			// grammar/Tiger.g:173:4: ( id_list_head )
			// grammar/Tiger.g:173:5: id_list_head
			{
			pushFollow(FOLLOW_id_list_head_in_id_list725);
			id_list_head73=id_list_head();
			state._fsp--;

			stream_id_list_head.add(id_list_head73.getTree());
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
			// 173:19: -> ^( IDS id_list_head )
			{
				// grammar/Tiger.g:173:22: ^( IDS id_list_head )
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
	// grammar/Tiger.g:176:1: id_list_head : ( ID id_list_tail ) -> ID ( id_list_tail )? ;
	public final TigerParser.id_list_head_return id_list_head() throws RecognitionException {
		TigerParser.id_list_head_return retval = new TigerParser.id_list_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID74=null;
		ParserRuleReturnScope id_list_tail75 =null;

		Object ID74_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_id_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule id_list_tail");

		try {
			// grammar/Tiger.g:177:2: ( ( ID id_list_tail ) -> ID ( id_list_tail )? )
			// grammar/Tiger.g:177:4: ( ID id_list_tail )
			{
			// grammar/Tiger.g:177:4: ( ID id_list_tail )
			// grammar/Tiger.g:177:5: ID id_list_tail
			{
			ID74=(Token)match(input,ID,FOLLOW_ID_in_id_list_head746);  
			stream_ID.add(ID74);

			pushFollow(FOLLOW_id_list_tail_in_id_list_head748);
			id_list_tail75=id_list_tail();
			state._fsp--;

			stream_id_list_tail.add(id_list_tail75.getTree());
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
			// 177:22: -> ID ( id_list_tail )?
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
				// grammar/Tiger.g:177:28: ( id_list_tail )?
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
	// grammar/Tiger.g:180:1: id_list_tail : ( COMMA id_list_head -> id_list_head |);
	public final TigerParser.id_list_tail_return id_list_tail() throws RecognitionException {
		TigerParser.id_list_tail_return retval = new TigerParser.id_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA76=null;
		ParserRuleReturnScope id_list_head77 =null;

		Object COMMA76_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_id_list_head=new RewriteRuleSubtreeStream(adaptor,"rule id_list_head");

		try {
			// grammar/Tiger.g:181:2: ( COMMA id_list_head -> id_list_head |)
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
					// grammar/Tiger.g:181:4: COMMA id_list_head
					{
					COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list_tail767);  
					stream_COMMA.add(COMMA76);

					pushFollow(FOLLOW_id_list_head_in_id_list_tail769);
					id_list_head77=id_list_head();
					state._fsp--;

					stream_id_list_head.add(id_list_head77.getTree());
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
					// 181:23: -> id_list_head
					{
						adaptor.addChild(root_0, stream_id_list_head.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:183:2: 
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
	// grammar/Tiger.g:185:1: optional_int : ( ASSIGN constant -> constant |);
	public final TigerParser.optional_int_return optional_int() throws RecognitionException {
		TigerParser.optional_int_return retval = new TigerParser.optional_int_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN78=null;
		ParserRuleReturnScope constant79 =null;

		Object ASSIGN78_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		try {
			// grammar/Tiger.g:186:2: ( ASSIGN constant -> constant |)
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
					// grammar/Tiger.g:186:4: ASSIGN constant
					{
					ASSIGN78=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_int787);  
					stream_ASSIGN.add(ASSIGN78);

					pushFollow(FOLLOW_constant_in_optional_int789);
					constant79=constant();
					state._fsp--;

					stream_constant.add(constant79.getTree());
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
					// 186:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:188:2: 
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
	// grammar/Tiger.g:194:1: expr_list : ( expr expr_list_tail -> ^( EXPRS expr ( expr_list_tail )? ) |);
	public final TigerParser.expr_list_return expr_list() throws RecognitionException {
		TigerParser.expr_list_return retval = new TigerParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr80 =null;
		ParserRuleReturnScope expr_list_tail81 =null;

		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:195:2: ( expr expr_list_tail -> ^( EXPRS expr ( expr_list_tail )? ) |)
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
					// grammar/Tiger.g:195:4: expr expr_list_tail
					{
					pushFollow(FOLLOW_expr_in_expr_list812);
					expr80=expr();
					state._fsp--;

					stream_expr.add(expr80.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list814);
					expr_list_tail81=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail81.getTree());
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
					// 195:24: -> ^( EXPRS expr ( expr_list_tail )? )
					{
						// grammar/Tiger.g:195:27: ^( EXPRS expr ( expr_list_tail )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						// grammar/Tiger.g:195:40: ( expr_list_tail )?
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
					// grammar/Tiger.g:197:2: 
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
	// grammar/Tiger.g:199:1: expr_list_tail : ( ( COMMA expr expr_list_tail ) -> expr ( expr_list_tail )? |);
	public final TigerParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
		TigerParser.expr_list_tail_return retval = new TigerParser.expr_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA82=null;
		ParserRuleReturnScope expr83 =null;
		ParserRuleReturnScope expr_list_tail84 =null;

		Object COMMA82_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:200:2: ( ( COMMA expr expr_list_tail ) -> expr ( expr_list_tail )? |)
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
					// grammar/Tiger.g:200:4: ( COMMA expr expr_list_tail )
					{
					// grammar/Tiger.g:200:4: ( COMMA expr expr_list_tail )
					// grammar/Tiger.g:200:5: COMMA expr expr_list_tail
					{
					COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail842);  
					stream_COMMA.add(COMMA82);

					pushFollow(FOLLOW_expr_in_expr_list_tail844);
					expr83=expr();
					state._fsp--;

					stream_expr.add(expr83.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail846);
					expr_list_tail84=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail84.getTree());
					}

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
					// 200:32: -> expr ( expr_list_tail )?
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
						// grammar/Tiger.g:200:40: ( expr_list_tail )?
						if ( stream_expr_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_expr_list_tail.nextTree());
						}
						stream_expr_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:202:2: 
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
	// grammar/Tiger.g:204:1: expr : expr_head expr_tail ;
	public final TigerParser.expr_return expr() throws RecognitionException {
		TigerParser.expr_return retval = new TigerParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_head85 =null;
		ParserRuleReturnScope expr_tail86 =null;


		try {
			// grammar/Tiger.g:205:2: ( expr_head expr_tail )
			// grammar/Tiger.g:205:4: expr_head expr_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_head_in_expr869);
			expr_head85=expr_head();
			state._fsp--;

			adaptor.addChild(root_0, expr_head85.getTree());

			pushFollow(FOLLOW_expr_tail_in_expr871);
			expr_tail86=expr_tail();
			state._fsp--;

			adaptor.addChild(root_0, expr_tail86.getTree());

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
	// grammar/Tiger.g:208:1: expr_tail : ( binary_operator expr |);
	public final TigerParser.expr_tail_return expr_tail() throws RecognitionException {
		TigerParser.expr_tail_return retval = new TigerParser.expr_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope binary_operator87 =null;
		ParserRuleReturnScope expr88 =null;


		try {
			// grammar/Tiger.g:209:2: ( binary_operator expr |)
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
					// grammar/Tiger.g:209:4: binary_operator expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_binary_operator_in_expr_tail882);
					binary_operator87=binary_operator();
					state._fsp--;

					adaptor.addChild(root_0, binary_operator87.getTree());

					pushFollow(FOLLOW_expr_in_expr_tail884);
					expr88=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr88.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:211:2: 
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
	// grammar/Tiger.g:213:1: expr_head : ( expr_head_base | ( ID optional_subscript ) -> ^( REFERENCE ID ( optional_subscript )? ) );
	public final TigerParser.expr_head_return expr_head() throws RecognitionException {
		TigerParser.expr_head_return retval = new TigerParser.expr_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID90=null;
		ParserRuleReturnScope expr_head_base89 =null;
		ParserRuleReturnScope optional_subscript91 =null;

		Object ID90_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_optional_subscript=new RewriteRuleSubtreeStream(adaptor,"rule optional_subscript");

		try {
			// grammar/Tiger.g:214:2: ( expr_head_base | ( ID optional_subscript ) -> ^( REFERENCE ID ( optional_subscript )? ) )
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
					// grammar/Tiger.g:214:4: expr_head_base
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_head_base_in_expr_head899);
					expr_head_base89=expr_head_base();
					state._fsp--;

					adaptor.addChild(root_0, expr_head_base89.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:215:4: ( ID optional_subscript )
					{
					// grammar/Tiger.g:215:4: ( ID optional_subscript )
					// grammar/Tiger.g:215:5: ID optional_subscript
					{
					ID90=(Token)match(input,ID,FOLLOW_ID_in_expr_head905);  
					stream_ID.add(ID90);

					pushFollow(FOLLOW_optional_subscript_in_expr_head907);
					optional_subscript91=optional_subscript();
					state._fsp--;

					stream_optional_subscript.add(optional_subscript91.getTree());
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
					// 215:28: -> ^( REFERENCE ID ( optional_subscript )? )
					{
						// grammar/Tiger.g:215:31: ^( REFERENCE ID ( optional_subscript )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// grammar/Tiger.g:215:46: ( optional_subscript )?
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
	// grammar/Tiger.g:218:1: expr_head_base : ( constant | ( LPAREN expr RPAREN ) -> expr );
	public final TigerParser.expr_head_base_return expr_head_base() throws RecognitionException {
		TigerParser.expr_head_base_return retval = new TigerParser.expr_head_base_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN93=null;
		Token RPAREN95=null;
		ParserRuleReturnScope constant92 =null;
		ParserRuleReturnScope expr94 =null;

		Object LPAREN93_tree=null;
		Object RPAREN95_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:219:2: ( constant | ( LPAREN expr RPAREN ) -> expr )
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
					// grammar/Tiger.g:219:4: constant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_in_expr_head_base930);
					constant92=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant92.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:220:4: ( LPAREN expr RPAREN )
					{
					// grammar/Tiger.g:220:4: ( LPAREN expr RPAREN )
					// grammar/Tiger.g:220:5: LPAREN expr RPAREN
					{
					LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_head_base936);  
					stream_LPAREN.add(LPAREN93);

					pushFollow(FOLLOW_expr_in_expr_head_base938);
					expr94=expr();
					state._fsp--;

					stream_expr.add(expr94.getTree());
					RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_head_base940);  
					stream_RPAREN.add(RPAREN95);

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
					// 220:25: -> expr
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
	// grammar/Tiger.g:227:1: stat_seq : stat stat_tail -> ^( STATEMENTS stat ( stat_tail )? ) ;
	public final TigerParser.stat_seq_return stat_seq() throws RecognitionException {
		TigerParser.stat_seq_return retval = new TigerParser.stat_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat96 =null;
		ParserRuleReturnScope stat_tail97 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// grammar/Tiger.g:228:2: ( stat stat_tail -> ^( STATEMENTS stat ( stat_tail )? ) )
			// grammar/Tiger.g:228:4: stat stat_tail
			{
			pushFollow(FOLLOW_stat_in_stat_seq960);
			stat96=stat();
			state._fsp--;

			stream_stat.add(stat96.getTree());
			pushFollow(FOLLOW_stat_tail_in_stat_seq962);
			stat_tail97=stat_tail();
			state._fsp--;

			stream_stat_tail.add(stat_tail97.getTree());
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
			// 228:19: -> ^( STATEMENTS stat ( stat_tail )? )
			{
				// grammar/Tiger.g:228:22: ^( STATEMENTS stat ( stat_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);
				adaptor.addChild(root_1, stream_stat.nextTree());
				// grammar/Tiger.g:228:40: ( stat_tail )?
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
	// grammar/Tiger.g:231:1: stat_tail : ( stat stat_tail -> stat ( stat_tail )? |);
	public final TigerParser.stat_tail_return stat_tail() throws RecognitionException {
		TigerParser.stat_tail_return retval = new TigerParser.stat_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat98 =null;
		ParserRuleReturnScope stat_tail99 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// grammar/Tiger.g:232:2: ( stat stat_tail -> stat ( stat_tail )? |)
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
					// grammar/Tiger.g:232:4: stat stat_tail
					{
					pushFollow(FOLLOW_stat_in_stat_tail984);
					stat98=stat();
					state._fsp--;

					stream_stat.add(stat98.getTree());
					pushFollow(FOLLOW_stat_tail_in_stat_tail986);
					stat_tail99=stat_tail();
					state._fsp--;

					stream_stat_tail.add(stat_tail99.getTree());
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
					// 232:19: -> stat ( stat_tail )?
					{
						adaptor.addChild(root_0, stream_stat.nextTree());
						// grammar/Tiger.g:232:27: ( stat_tail )?
						if ( stream_stat_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_stat_tail.nextTree());
						}
						stream_stat_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:234:2: 
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
	// grammar/Tiger.g:236:1: stat : ( if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ID statement_assignment ) ) SEMI );
	public final TigerParser.stat_return stat() throws RecognitionException {
		TigerParser.stat_return retval = new TigerParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE101=null;
		Token DO103=null;
		Token ENDDO105=null;
		Token SEMI106=null;
		Token FOR107=null;
		Token ID108=null;
		Token ASSIGN109=null;
		Token DO111=null;
		Token ENDDO113=null;
		Token SEMI114=null;
		Token BREAK115=null;
		Token SEMI116=null;
		Token RETURN117=null;
		Token SEMI119=null;
		Token ID121=null;
		Token LPAREN122=null;
		Token RPAREN124=null;
		Token ASSIGN126=null;
		Token SEMI128=null;
		ParserRuleReturnScope if_stmt100 =null;
		ParserRuleReturnScope expr102 =null;
		ParserRuleReturnScope stat_seq104 =null;
		ParserRuleReturnScope range110 =null;
		ParserRuleReturnScope stat_seq112 =null;
		ParserRuleReturnScope expr118 =null;
		ParserRuleReturnScope block120 =null;
		ParserRuleReturnScope expr_list123 =null;
		ParserRuleReturnScope optional_subscript125 =null;
		ParserRuleReturnScope statement_assignment127 =null;

		Object WHILE101_tree=null;
		Object DO103_tree=null;
		Object ENDDO105_tree=null;
		Object SEMI106_tree=null;
		Object FOR107_tree=null;
		Object ID108_tree=null;
		Object ASSIGN109_tree=null;
		Object DO111_tree=null;
		Object ENDDO113_tree=null;
		Object SEMI114_tree=null;
		Object BREAK115_tree=null;
		Object SEMI116_tree=null;
		Object RETURN117_tree=null;
		Object SEMI119_tree=null;
		Object ID121_tree=null;
		Object LPAREN122_tree=null;
		Object RPAREN124_tree=null;
		Object ASSIGN126_tree=null;
		Object SEMI128_tree=null;
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
			// grammar/Tiger.g:237:2: ( if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ID statement_assignment ) ) SEMI )
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
					// grammar/Tiger.g:237:4: if_stmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmt_in_stat1007);
					if_stmt100=if_stmt();
					state._fsp--;

					adaptor.addChild(root_0, if_stmt100.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:238:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					{
					// grammar/Tiger.g:238:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					// grammar/Tiger.g:238:5: WHILE expr DO stat_seq ENDDO SEMI
					{
					WHILE101=(Token)match(input,WHILE,FOLLOW_WHILE_in_stat1013);  
					stream_WHILE.add(WHILE101);

					pushFollow(FOLLOW_expr_in_stat1015);
					expr102=expr();
					state._fsp--;

					stream_expr.add(expr102.getTree());
					DO103=(Token)match(input,DO,FOLLOW_DO_in_stat1017);  
					stream_DO.add(DO103);

					pushFollow(FOLLOW_stat_seq_in_stat1019);
					stat_seq104=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq104.getTree());
					ENDDO105=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat1021);  
					stream_ENDDO.add(ENDDO105);

					SEMI106=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1023);  
					stream_SEMI.add(SEMI106);

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
					// 238:40: -> ^( WHILE expr stat_seq )
					{
						// grammar/Tiger.g:238:43: ^( WHILE expr stat_seq )
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
					// grammar/Tiger.g:239:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					{
					// grammar/Tiger.g:239:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					// grammar/Tiger.g:239:5: FOR ID ASSIGN range DO stat_seq ENDDO SEMI
					{
					FOR107=(Token)match(input,FOR,FOLLOW_FOR_in_stat1040);  
					stream_FOR.add(FOR107);

					ID108=(Token)match(input,ID,FOLLOW_ID_in_stat1042);  
					stream_ID.add(ID108);

					ASSIGN109=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1044);  
					stream_ASSIGN.add(ASSIGN109);

					pushFollow(FOLLOW_range_in_stat1046);
					range110=range();
					state._fsp--;

					stream_range.add(range110.getTree());
					DO111=(Token)match(input,DO,FOLLOW_DO_in_stat1048);  
					stream_DO.add(DO111);

					pushFollow(FOLLOW_stat_seq_in_stat1050);
					stat_seq112=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq112.getTree());
					ENDDO113=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat1052);  
					stream_ENDDO.add(ENDDO113);

					SEMI114=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1054);  
					stream_SEMI.add(SEMI114);

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
					// 239:49: -> ^( FOR range stat_seq )
					{
						// grammar/Tiger.g:239:52: ^( FOR range stat_seq )
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
					// grammar/Tiger.g:240:4: BREAK SEMI
					{
					BREAK115=(Token)match(input,BREAK,FOLLOW_BREAK_in_stat1070);  
					stream_BREAK.add(BREAK115);

					SEMI116=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1072);  
					stream_SEMI.add(SEMI116);

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
					// 240:15: -> BREAK
					{
						adaptor.addChild(root_0, stream_BREAK.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// grammar/Tiger.g:241:4: RETURN expr SEMI
					{
					RETURN117=(Token)match(input,RETURN,FOLLOW_RETURN_in_stat1081);  
					stream_RETURN.add(RETURN117);

					pushFollow(FOLLOW_expr_in_stat1083);
					expr118=expr();
					state._fsp--;

					stream_expr.add(expr118.getTree());
					SEMI119=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1085);  
					stream_SEMI.add(SEMI119);

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
					// 241:21: -> ^( RETURN expr )
					{
						// grammar/Tiger.g:241:24: ^( RETURN expr )
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
					// grammar/Tiger.g:242:4: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat1098);
					block120=block();
					state._fsp--;

					adaptor.addChild(root_0, block120.getTree());

					}
					break;
				case 7 :
					// grammar/Tiger.g:243:4: ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ID statement_assignment ) ) SEMI
					{
					ID121=(Token)match(input,ID,FOLLOW_ID_in_stat1103);  
					stream_ID.add(ID121);

					// grammar/Tiger.g:243:8: ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ID statement_assignment ) )
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
							// grammar/Tiger.g:244:6: LPAREN expr_list RPAREN
							{
							LPAREN122=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stat1114);  
							stream_LPAREN.add(LPAREN122);

							pushFollow(FOLLOW_expr_list_in_stat1116);
							expr_list123=expr_list();
							state._fsp--;

							stream_expr_list.add(expr_list123.getTree());
							RPAREN124=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stat1118);  
							stream_RPAREN.add(RPAREN124);

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
							// 244:32: -> ^( INVOKE ID ( expr_list )? )
							{
								// grammar/Tiger.g:244:35: ^( INVOKE ID ( expr_list )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INVOKE, "INVOKE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								// grammar/Tiger.g:244:47: ( expr_list )?
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
							// grammar/Tiger.g:245:6: optional_subscript ASSIGN statement_assignment
							{
							pushFollow(FOLLOW_optional_subscript_in_stat1138);
							optional_subscript125=optional_subscript();
							state._fsp--;

							stream_optional_subscript.add(optional_subscript125.getTree());
							ASSIGN126=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1140);  
							stream_ASSIGN.add(ASSIGN126);

							pushFollow(FOLLOW_statement_assignment_in_stat1142);
							statement_assignment127=statement_assignment();
							state._fsp--;

							stream_statement_assignment.add(statement_assignment127.getTree());
							// AST REWRITE
							// elements: ASSIGN, statement_assignment, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 245:53: -> ^( ASSIGN ID statement_assignment )
							{
								// grammar/Tiger.g:245:56: ^( ASSIGN ID statement_assignment )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_statement_assignment.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					SEMI128=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1159);  
					stream_SEMI.add(SEMI128);

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
	// grammar/Tiger.g:249:1: optional_subscript : ( array_subscripts |);
	public final TigerParser.optional_subscript_return optional_subscript() throws RecognitionException {
		TigerParser.optional_subscript_return retval = new TigerParser.optional_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_subscripts129 =null;


		try {
			// grammar/Tiger.g:250:2: ( array_subscripts |)
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
					// grammar/Tiger.g:250:4: array_subscripts
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_subscripts_in_optional_subscript1170);
					array_subscripts129=array_subscripts();
					state._fsp--;

					adaptor.addChild(root_0, array_subscripts129.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:252:2: 
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
	// grammar/Tiger.g:254:1: range : (start= index_expr TO stop= index_expr ) -> $start $stop;
	public final TigerParser.range_return range() throws RecognitionException {
		TigerParser.range_return retval = new TigerParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO130=null;
		ParserRuleReturnScope start =null;
		ParserRuleReturnScope stop =null;

		Object TO130_tree=null;
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// grammar/Tiger.g:255:2: ( (start= index_expr TO stop= index_expr ) -> $start $stop)
			// grammar/Tiger.g:255:4: (start= index_expr TO stop= index_expr )
			{
			// grammar/Tiger.g:255:4: (start= index_expr TO stop= index_expr )
			// grammar/Tiger.g:255:5: start= index_expr TO stop= index_expr
			{
			pushFollow(FOLLOW_index_expr_in_range1188);
			start=index_expr();
			state._fsp--;

			stream_index_expr.add(start.getTree());
			TO130=(Token)match(input,TO,FOLLOW_TO_in_range1190);  
			stream_TO.add(TO130);

			pushFollow(FOLLOW_index_expr_in_range1194);
			stop=index_expr();
			state._fsp--;

			stream_index_expr.add(stop.getTree());
			}

			// AST REWRITE
			// elements: start, stop
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
			// 255:42: -> $start $stop
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
	// grammar/Tiger.g:258:1: statement_assignment : ( ID statement_assignment_id | expr_head_base expr_tail );
	public final TigerParser.statement_assignment_return statement_assignment() throws RecognitionException {
		TigerParser.statement_assignment_return retval = new TigerParser.statement_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID131=null;
		ParserRuleReturnScope statement_assignment_id132 =null;
		ParserRuleReturnScope expr_head_base133 =null;
		ParserRuleReturnScope expr_tail134 =null;

		Object ID131_tree=null;

		try {
			// grammar/Tiger.g:259:2: ( ID statement_assignment_id | expr_head_base expr_tail )
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
					// grammar/Tiger.g:259:4: ID statement_assignment_id
					{
					root_0 = (Object)adaptor.nil();


					ID131=(Token)match(input,ID,FOLLOW_ID_in_statement_assignment1214); 
					ID131_tree = (Object)adaptor.create(ID131);
					adaptor.addChild(root_0, ID131_tree);

					pushFollow(FOLLOW_statement_assignment_id_in_statement_assignment1216);
					statement_assignment_id132=statement_assignment_id();
					state._fsp--;

					adaptor.addChild(root_0, statement_assignment_id132.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:260:4: expr_head_base expr_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_head_base_in_statement_assignment1221);
					expr_head_base133=expr_head_base();
					state._fsp--;

					adaptor.addChild(root_0, expr_head_base133.getTree());

					pushFollow(FOLLOW_expr_tail_in_statement_assignment1223);
					expr_tail134=expr_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_tail134.getTree());

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
	// grammar/Tiger.g:263:1: statement_assignment_id : ( LPAREN expr_list RPAREN | optional_subscript expr_tail );
	public final TigerParser.statement_assignment_id_return statement_assignment_id() throws RecognitionException {
		TigerParser.statement_assignment_id_return retval = new TigerParser.statement_assignment_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN135=null;
		Token RPAREN137=null;
		ParserRuleReturnScope expr_list136 =null;
		ParserRuleReturnScope optional_subscript138 =null;
		ParserRuleReturnScope expr_tail139 =null;

		Object LPAREN135_tree=null;
		Object RPAREN137_tree=null;

		try {
			// grammar/Tiger.g:264:2: ( LPAREN expr_list RPAREN | optional_subscript expr_tail )
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
					// grammar/Tiger.g:264:4: LPAREN expr_list RPAREN
					{
					root_0 = (Object)adaptor.nil();


					LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement_assignment_id1234); 
					LPAREN135_tree = (Object)adaptor.create(LPAREN135);
					adaptor.addChild(root_0, LPAREN135_tree);

					pushFollow(FOLLOW_expr_list_in_statement_assignment_id1236);
					expr_list136=expr_list();
					state._fsp--;

					adaptor.addChild(root_0, expr_list136.getTree());

					RPAREN137=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement_assignment_id1238); 
					RPAREN137_tree = (Object)adaptor.create(RPAREN137);
					adaptor.addChild(root_0, RPAREN137_tree);

					}
					break;
				case 2 :
					// grammar/Tiger.g:265:4: optional_subscript expr_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_optional_subscript_in_statement_assignment_id1244);
					optional_subscript138=optional_subscript();
					state._fsp--;

					adaptor.addChild(root_0, optional_subscript138.getTree());

					pushFollow(FOLLOW_expr_tail_in_statement_assignment_id1246);
					expr_tail139=expr_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_tail139.getTree());

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
	// grammar/Tiger.g:268:1: if_stmt : ( IF expr THEN stat_seq else_stmt ENDIF SEMI ) -> ^( IF expr stat_seq ( else_stmt )? ) ;
	public final TigerParser.if_stmt_return if_stmt() throws RecognitionException {
		TigerParser.if_stmt_return retval = new TigerParser.if_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF140=null;
		Token THEN142=null;
		Token ENDIF145=null;
		Token SEMI146=null;
		ParserRuleReturnScope expr141 =null;
		ParserRuleReturnScope stat_seq143 =null;
		ParserRuleReturnScope else_stmt144 =null;

		Object IF140_tree=null;
		Object THEN142_tree=null;
		Object ENDIF145_tree=null;
		Object SEMI146_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_else_stmt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmt");

		try {
			// grammar/Tiger.g:269:2: ( ( IF expr THEN stat_seq else_stmt ENDIF SEMI ) -> ^( IF expr stat_seq ( else_stmt )? ) )
			// grammar/Tiger.g:269:4: ( IF expr THEN stat_seq else_stmt ENDIF SEMI )
			{
			// grammar/Tiger.g:269:4: ( IF expr THEN stat_seq else_stmt ENDIF SEMI )
			// grammar/Tiger.g:269:5: IF expr THEN stat_seq else_stmt ENDIF SEMI
			{
			IF140=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1258);  
			stream_IF.add(IF140);

			pushFollow(FOLLOW_expr_in_if_stmt1260);
			expr141=expr();
			state._fsp--;

			stream_expr.add(expr141.getTree());
			THEN142=(Token)match(input,THEN,FOLLOW_THEN_in_if_stmt1262);  
			stream_THEN.add(THEN142);

			pushFollow(FOLLOW_stat_seq_in_if_stmt1264);
			stat_seq143=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq143.getTree());
			pushFollow(FOLLOW_else_stmt_in_if_stmt1266);
			else_stmt144=else_stmt();
			state._fsp--;

			stream_else_stmt.add(else_stmt144.getTree());
			ENDIF145=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_stmt1268);  
			stream_ENDIF.add(ENDIF145);

			SEMI146=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_stmt1270);  
			stream_SEMI.add(SEMI146);

			}

			// AST REWRITE
			// elements: expr, else_stmt, IF, stat_seq
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 269:49: -> ^( IF expr stat_seq ( else_stmt )? )
			{
				// grammar/Tiger.g:269:52: ^( IF expr stat_seq ( else_stmt )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				// grammar/Tiger.g:269:71: ( else_stmt )?
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
	// grammar/Tiger.g:272:1: else_stmt : ( ELSE stat_seq -> stat_seq |);
	public final TigerParser.else_stmt_return else_stmt() throws RecognitionException {
		TigerParser.else_stmt_return retval = new TigerParser.else_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE147=null;
		ParserRuleReturnScope stat_seq148 =null;

		Object ELSE147_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");

		try {
			// grammar/Tiger.g:273:2: ( ELSE stat_seq -> stat_seq |)
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
					// grammar/Tiger.g:273:4: ELSE stat_seq
					{
					ELSE147=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1296);  
					stream_ELSE.add(ELSE147);

					pushFollow(FOLLOW_stat_seq_in_else_stmt1298);
					stat_seq148=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq148.getTree());
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
					// 273:18: -> stat_seq
					{
						adaptor.addChild(root_0, stream_stat_seq.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:275:2: 
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
	// grammar/Tiger.g:277:1: constant : ( INTLIT | FIXEDPTLIT );
	public final TigerParser.constant_return constant() throws RecognitionException {
		TigerParser.constant_return retval = new TigerParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set149=null;

		Object set149_tree=null;

		try {
			// grammar/Tiger.g:278:2: ( INTLIT | FIXEDPTLIT )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set149=input.LT(1);
			if ( input.LA(1)==FIXEDPTLIT||input.LA(1)==INTLIT ) {
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
	// $ANTLR end "constant"


	public static class binary_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binary_operator"
	// grammar/Tiger.g:282:1: binary_operator : ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR );
	public final TigerParser.binary_operator_return binary_operator() throws RecognitionException {
		TigerParser.binary_operator_return retval = new TigerParser.binary_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set150=null;

		Object set150_tree=null;

		try {
			// grammar/Tiger.g:283:2: ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set150=input.LT(1);
			if ( input.LA(1)==AND||input.LA(1)==DIV||input.LA(1)==EQ||(input.LA(1) >= GEQ && input.LA(1) <= GREATER)||(input.LA(1) >= LEQ && input.LA(1) <= LESSER)||(input.LA(1) >= MINUS && input.LA(1) <= NEQ)||input.LA(1)==OR||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set150));
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
	// grammar/Tiger.g:297:1: array_dimensions : array_dimension ( array_dimension )? ;
	public final TigerParser.array_dimensions_return array_dimensions() throws RecognitionException {
		TigerParser.array_dimensions_return retval = new TigerParser.array_dimensions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_dimension151 =null;
		ParserRuleReturnScope array_dimension152 =null;


		try {
			// grammar/Tiger.g:298:2: ( array_dimension ( array_dimension )? )
			// grammar/Tiger.g:298:4: array_dimension ( array_dimension )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_dimension_in_array_dimensions1400);
			array_dimension151=array_dimension();
			state._fsp--;

			adaptor.addChild(root_0, array_dimension151.getTree());

			// grammar/Tiger.g:298:20: ( array_dimension )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LBRACK) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// grammar/Tiger.g:298:20: array_dimension
					{
					pushFollow(FOLLOW_array_dimension_in_array_dimensions1402);
					array_dimension152=array_dimension();
					state._fsp--;

					adaptor.addChild(root_0, array_dimension152.getTree());

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
	// grammar/Tiger.g:301:1: array_dimension : ( LBRACK INTLIT RBRACK ) -> INTLIT ;
	public final TigerParser.array_dimension_return array_dimension() throws RecognitionException {
		TigerParser.array_dimension_return retval = new TigerParser.array_dimension_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK153=null;
		Token INTLIT154=null;
		Token RBRACK155=null;

		Object LBRACK153_tree=null;
		Object INTLIT154_tree=null;
		Object RBRACK155_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");

		try {
			// grammar/Tiger.g:302:2: ( ( LBRACK INTLIT RBRACK ) -> INTLIT )
			// grammar/Tiger.g:302:4: ( LBRACK INTLIT RBRACK )
			{
			// grammar/Tiger.g:302:4: ( LBRACK INTLIT RBRACK )
			// grammar/Tiger.g:302:5: LBRACK INTLIT RBRACK
			{
			LBRACK153=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_dimension1415);  
			stream_LBRACK.add(LBRACK153);

			INTLIT154=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_array_dimension1417);  
			stream_INTLIT.add(INTLIT154);

			RBRACK155=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_dimension1419);  
			stream_RBRACK.add(RBRACK155);

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
			// 302:27: -> INTLIT
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
	// grammar/Tiger.g:305:1: array_subscripts : array_subscript ( array_subscript )? ;
	public final TigerParser.array_subscripts_return array_subscripts() throws RecognitionException {
		TigerParser.array_subscripts_return retval = new TigerParser.array_subscripts_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_subscript156 =null;
		ParserRuleReturnScope array_subscript157 =null;


		try {
			// grammar/Tiger.g:306:2: ( array_subscript ( array_subscript )? )
			// grammar/Tiger.g:306:4: array_subscript ( array_subscript )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_subscript_in_array_subscripts1435);
			array_subscript156=array_subscript();
			state._fsp--;

			adaptor.addChild(root_0, array_subscript156.getTree());

			// grammar/Tiger.g:306:20: ( array_subscript )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==LBRACK) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// grammar/Tiger.g:306:20: array_subscript
					{
					pushFollow(FOLLOW_array_subscript_in_array_subscripts1437);
					array_subscript157=array_subscript();
					state._fsp--;

					adaptor.addChild(root_0, array_subscript157.getTree());

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
	// grammar/Tiger.g:309:1: array_subscript : ( LBRACK index_expr RBRACK ) -> index_expr ;
	public final TigerParser.array_subscript_return array_subscript() throws RecognitionException {
		TigerParser.array_subscript_return retval = new TigerParser.array_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK158=null;
		Token RBRACK160=null;
		ParserRuleReturnScope index_expr159 =null;

		Object LBRACK158_tree=null;
		Object RBRACK160_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// grammar/Tiger.g:310:2: ( ( LBRACK index_expr RBRACK ) -> index_expr )
			// grammar/Tiger.g:310:4: ( LBRACK index_expr RBRACK )
			{
			// grammar/Tiger.g:310:4: ( LBRACK index_expr RBRACK )
			// grammar/Tiger.g:310:5: LBRACK index_expr RBRACK
			{
			LBRACK158=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_subscript1450);  
			stream_LBRACK.add(LBRACK158);

			pushFollow(FOLLOW_index_expr_in_array_subscript1452);
			index_expr159=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr159.getTree());
			RBRACK160=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_subscript1454);  
			stream_RBRACK.add(RBRACK160);

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
			// 310:31: -> index_expr
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
	// grammar/Tiger.g:313:1: index_expr : ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* ;
	public final TigerParser.index_expr_return index_expr() throws RecognitionException {
		TigerParser.index_expr_return retval = new TigerParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set161=null;
		ParserRuleReturnScope index_oper162 =null;
		ParserRuleReturnScope index_expr163 =null;

		Object set161_tree=null;

		try {
			// grammar/Tiger.g:314:2: ( ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* )
			// grammar/Tiger.g:314:4: ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )*
			{
			root_0 = (Object)adaptor.nil();


			set161=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set161));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// grammar/Tiger.g:314:18: ( options {greedy=true; } : index_oper index_expr )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= MINUS && LA28_0 <= MULT)||LA28_0==PLUS) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// grammar/Tiger.g:314:42: index_oper index_expr
					{
					pushFollow(FOLLOW_index_oper_in_index_expr1487);
					index_oper162=index_oper();
					state._fsp--;

					adaptor.addChild(root_0, index_oper162.getTree());

					pushFollow(FOLLOW_index_expr_in_index_expr1489);
					index_expr163=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr163.getTree());

					}
					break;

				default :
					break loop28;
				}
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
	// $ANTLR end "index_expr"


	public static class index_oper_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_oper"
	// grammar/Tiger.g:317:1: index_oper : ( PLUS | MINUS | MULT );
	public final TigerParser.index_oper_return index_oper() throws RecognitionException {
		TigerParser.index_oper_return retval = new TigerParser.index_oper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set164=null;

		Object set164_tree=null;

		try {
			// grammar/Tiger.g:318:2: ( PLUS | MINUS | MULT )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set164=input.LT(1);
			if ( (input.LA(1) >= MINUS && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set164));
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



	public static final BitSet FOLLOW_type_declaration_list_in_tiger_program139 = new BitSet(new long[]{0x1000000090200000L});
	public static final BitSet FOLLOW_function_declaration_list_in_tiger_program141 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_tiger_program143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_tail_in_type_declaration_list167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_tail188 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_type_declaration_tail_in_type_declaration_tail190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration205 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_type_declaration207 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration209 = new BitSet(new long[]{0x0000000080200020L});
	public static final BitSet FOLLOW_type_in_type_declaration211 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_tail_in_function_declaration_list235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_in_function_declaration_tail255 = new BitSet(new long[]{0x1000000090200000L});
	public static final BitSet FOLLOW_function_declaration_tail_in_function_declaration_tail257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_function_definition272 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_function_definition_body_in_function_definition274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_function_definition291 = new BitSet(new long[]{0x0000004001000000L});
	public static final BitSet FOLLOW_function_definition_void_in_function_definition293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_body_in_function_definition_void315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_main_in_function_definition_void320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_definition_body332 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_function_definition_body334 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_definition_body336 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_param_list_in_function_definition_body338 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_definition_body340 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_function_definition_body342 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_function_definition_body344 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_function_definition_body346 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_function_definition_body348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_function_definition_main370 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_definition_main372 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_definition_main374 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_function_definition_main376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_list_internal_in_param_list396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list_internal416 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_internal418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail435 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_param_in_param_list_tail437 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_tail439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_param464 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_param466 = new BitSet(new long[]{0x0000000090200000L});
	public static final BitSet FOLLOW_type_id_in_param468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list490 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail503 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block521 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_declaration_segment_in_block523 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_block525 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_block527 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_list_in_declaration_segment552 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_declaration_segment554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_tail_in_var_declaration_list565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_tail585 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_var_declaration_tail_in_var_declaration_tail587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type607 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_array_dimensions_in_type609 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_OF_in_type611 = new BitSet(new long[]{0x0000000080200000L});
	public static final BitSet FOLLOW_base_type_in_type613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_id640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration668 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration670 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_var_declaration672 = new BitSet(new long[]{0x0000000090200000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration674 = new BitSet(new long[]{0x0010000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration676 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init703 = new BitSet(new long[]{0x0000000100400000L});
	public static final BitSet FOLLOW_constant_in_optional_init705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_list_head_in_id_list725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list_head746 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list_head748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_id_list_tail767 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_id_list_head_in_id_list_tail769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_int787 = new BitSet(new long[]{0x0000000100400000L});
	public static final BitSet FOLLOW_constant_in_optional_int789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list812 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail842 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail844 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_in_expr869 = new BitSet(new long[]{0x00004B980C082010L});
	public static final BitSet FOLLOW_expr_tail_in_expr871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_operator_in_expr_tail882 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr_tail884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_base_in_expr_head899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr_head905 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_optional_subscript_in_expr_head907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_head_base930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_head_base936 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr_head_base938 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_head_base940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq960 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_tail_in_stat_seq962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_tail984 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_tail_in_stat_tail986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_stat1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat1013 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_stat1015 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat1017 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_stat1019 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat1021 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat1040 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_stat1042 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1044 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_range_in_stat1046 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat1048 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_stat1050 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat1052 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat1070 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat1081 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_stat1083 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat1098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat1103 = new BitSet(new long[]{0x0000002400000040L});
	public static final BitSet FOLLOW_LPAREN_in_stat1114 = new BitSet(new long[]{0x0008002110400000L});
	public static final BitSet FOLLOW_expr_list_in_stat1116 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat1118 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_optional_subscript_in_stat1138 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1140 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_statement_assignment_in_stat1142 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_subscripts_in_optional_subscript1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_range1188 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TO_in_range1190 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_range1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_statement_assignment1214 = new BitSet(new long[]{0x00004BBC0C082010L});
	public static final BitSet FOLLOW_statement_assignment_id_in_statement_assignment1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_base_in_statement_assignment1221 = new BitSet(new long[]{0x00004B980C082010L});
	public static final BitSet FOLLOW_expr_tail_in_statement_assignment1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_statement_assignment_id1234 = new BitSet(new long[]{0x0008002110400000L});
	public static final BitSet FOLLOW_expr_list_in_statement_assignment_id1236 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_statement_assignment_id1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_optional_subscript_in_statement_assignment_id1244 = new BitSet(new long[]{0x00004B980C082010L});
	public static final BitSet FOLLOW_expr_tail_in_statement_assignment_id1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt1258 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_if_stmt1260 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_THEN_in_if_stmt1262 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_if_stmt1264 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_else_stmt_in_if_stmt1266 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDIF_in_if_stmt1268 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_stmt1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_stmt1296 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_else_stmt1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions1400 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_dimension1415 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_INTLIT_in_array_dimension1417 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_dimension1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_subscript_in_array_subscripts1435 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_array_subscript_in_array_subscripts1437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_subscript1450 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_array_subscript1452 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_subscript1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_index_expr1470 = new BitSet(new long[]{0x0000418000000002L});
	public static final BitSet FOLLOW_index_oper_in_index_expr1487 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_index_expr1489 = new BitSet(new long[]{0x0000418000000002L});
}
