// $ANTLR 3.5.1 /Users/twb/repos/Tiger/Tiger.g 2014-10-05 10:54:48

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
	@Override public String getGrammarFileName() { return "/Users/twb/repos/Tiger/Tiger.g"; }


	public static class tiger_program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tiger_program"
	// /Users/twb/repos/Tiger/Tiger.g:31:1: tiger_program : ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ( type_declaration_list )? function_declaration_list ) ;
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
			// /Users/twb/repos/Tiger/Tiger.g:32:2: ( ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ( type_declaration_list )? function_declaration_list ) )
			// /Users/twb/repos/Tiger/Tiger.g:32:4: ( type_declaration_list function_declaration_list EOF )
			{
			// /Users/twb/repos/Tiger/Tiger.g:32:4: ( type_declaration_list function_declaration_list EOF )
			// /Users/twb/repos/Tiger/Tiger.g:32:5: type_declaration_list function_declaration_list EOF
			{
			pushFollow(FOLLOW_type_declaration_list_in_tiger_program118);
			type_declaration_list1=type_declaration_list();
			state._fsp--;

			stream_type_declaration_list.add(type_declaration_list1.getTree());
			pushFollow(FOLLOW_function_declaration_list_in_tiger_program120);
			function_declaration_list2=function_declaration_list();
			state._fsp--;

			stream_function_declaration_list.add(function_declaration_list2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_tiger_program122);  
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
			// 32:58: -> ^( PROGRAM ( type_declaration_list )? function_declaration_list )
			{
				// /Users/twb/repos/Tiger/Tiger.g:32:61: ^( PROGRAM ( type_declaration_list )? function_declaration_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// /Users/twb/repos/Tiger/Tiger.g:32:71: ( type_declaration_list )?
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
	// /Users/twb/repos/Tiger/Tiger.g:35:1: type_declaration_list : ( type_declaration_tail ) -> ^( TYPES ( type_declaration_tail )? ) ;
	public final TigerParser.type_declaration_list_return type_declaration_list() throws RecognitionException {
		TigerParser.type_declaration_list_return retval = new TigerParser.type_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_tail4 =null;

		RewriteRuleSubtreeStream stream_type_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_tail");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:36:2: ( ( type_declaration_tail ) -> ^( TYPES ( type_declaration_tail )? ) )
			// /Users/twb/repos/Tiger/Tiger.g:36:4: ( type_declaration_tail )
			{
			// /Users/twb/repos/Tiger/Tiger.g:36:4: ( type_declaration_tail )
			// /Users/twb/repos/Tiger/Tiger.g:36:5: type_declaration_tail
			{
			pushFollow(FOLLOW_type_declaration_tail_in_type_declaration_list146);
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
			// 36:28: -> ^( TYPES ( type_declaration_tail )? )
			{
				// /Users/twb/repos/Tiger/Tiger.g:36:31: ^( TYPES ( type_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);
				// /Users/twb/repos/Tiger/Tiger.g:36:39: ( type_declaration_tail )?
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
	// /Users/twb/repos/Tiger/Tiger.g:39:1: type_declaration_tail : ( type_declaration type_declaration_tail |);
	public final TigerParser.type_declaration_tail_return type_declaration_tail() throws RecognitionException {
		TigerParser.type_declaration_tail_return retval = new TigerParser.type_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration5 =null;
		ParserRuleReturnScope type_declaration_tail6 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:40:2: ( type_declaration type_declaration_tail |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TYPE) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF||LA1_0==BEGIN||LA1_0==BREAK||(LA1_0 >= ELSE && LA1_0 <= ENDIF)||LA1_0==FIXEDPT||LA1_0==FOR||LA1_0==ID||(LA1_0 >= IF && LA1_0 <= INT)||LA1_0==RETURN||LA1_0==VAR||(LA1_0 >= VOID && LA1_0 <= WHILE)) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:40:4: type_declaration type_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_declaration_in_type_declaration_tail167);
					type_declaration5=type_declaration();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration5.getTree());

					pushFollow(FOLLOW_type_declaration_tail_in_type_declaration_tail169);
					type_declaration_tail6=type_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration_tail6.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:42:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:44:1: type_declaration : ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) ;
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
			// /Users/twb/repos/Tiger/Tiger.g:45:2: ( ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) )
			// /Users/twb/repos/Tiger/Tiger.g:45:4: ( TYPE ID EQ type SEMI )
			{
			// /Users/twb/repos/Tiger/Tiger.g:45:4: ( TYPE ID EQ type SEMI )
			// /Users/twb/repos/Tiger/Tiger.g:45:5: TYPE ID EQ type SEMI
			{
			TYPE7=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_declaration184);  
			stream_TYPE.add(TYPE7);

			ID8=(Token)match(input,ID,FOLLOW_ID_in_type_declaration186);  
			stream_ID.add(ID8);

			EQ9=(Token)match(input,EQ,FOLLOW_EQ_in_type_declaration188);  
			stream_EQ.add(EQ9);

			pushFollow(FOLLOW_type_in_type_declaration190);
			type10=type();
			state._fsp--;

			stream_type.add(type10.getTree());
			SEMI11=(Token)match(input,SEMI,FOLLOW_SEMI_in_type_declaration192);  
			stream_SEMI.add(SEMI11);

			}

			// AST REWRITE
			// elements: ID, TYPE, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 45:27: -> ^( TYPE ID type )
			{
				// /Users/twb/repos/Tiger/Tiger.g:45:30: ^( TYPE ID type )
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
	// /Users/twb/repos/Tiger/Tiger.g:48:1: function_declaration_list : function_declaration_tail -> ^( FUNCTIONS ( function_declaration_tail )? ) ;
	public final TigerParser.function_declaration_list_return function_declaration_list() throws RecognitionException {
		TigerParser.function_declaration_list_return retval = new TigerParser.function_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_declaration_tail12 =null;

		RewriteRuleSubtreeStream stream_function_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_tail");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:49:2: ( function_declaration_tail -> ^( FUNCTIONS ( function_declaration_tail )? ) )
			// /Users/twb/repos/Tiger/Tiger.g:49:4: function_declaration_tail
			{
			pushFollow(FOLLOW_function_declaration_tail_in_function_declaration_list214);
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
			// 49:30: -> ^( FUNCTIONS ( function_declaration_tail )? )
			{
				// /Users/twb/repos/Tiger/Tiger.g:49:33: ^( FUNCTIONS ( function_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_1);
				// /Users/twb/repos/Tiger/Tiger.g:49:45: ( function_declaration_tail )?
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
	// /Users/twb/repos/Tiger/Tiger.g:52:1: function_declaration_tail : ( function_definition function_declaration_tail |);
	public final TigerParser.function_declaration_tail_return function_declaration_tail() throws RecognitionException {
		TigerParser.function_declaration_tail_return retval = new TigerParser.function_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_definition13 =null;
		ParserRuleReturnScope function_declaration_tail14 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:53:2: ( function_definition function_declaration_tail |)
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
					// /Users/twb/repos/Tiger/Tiger.g:53:4: function_definition function_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_in_function_declaration_tail234);
					function_definition13=function_definition();
					state._fsp--;

					adaptor.addChild(root_0, function_definition13.getTree());

					pushFollow(FOLLOW_function_declaration_tail_in_function_declaration_tail236);
					function_declaration_tail14=function_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, function_declaration_tail14.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:55:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:57:1: function_definition : ( ( type_id function_definition_body ) -> ^( FUNCTION type_id function_definition_body ) | ( VOID function_definition_void ) -> ^( FUNCTION VOID function_definition_void ) );
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
			// /Users/twb/repos/Tiger/Tiger.g:58:2: ( ( type_id function_definition_body ) -> ^( FUNCTION type_id function_definition_body ) | ( VOID function_definition_void ) -> ^( FUNCTION VOID function_definition_void ) )
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
					// /Users/twb/repos/Tiger/Tiger.g:58:4: ( type_id function_definition_body )
					{
					// /Users/twb/repos/Tiger/Tiger.g:58:4: ( type_id function_definition_body )
					// /Users/twb/repos/Tiger/Tiger.g:58:5: type_id function_definition_body
					{
					pushFollow(FOLLOW_type_id_in_function_definition251);
					type_id15=type_id();
					state._fsp--;

					stream_type_id.add(type_id15.getTree());
					pushFollow(FOLLOW_function_definition_body_in_function_definition253);
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
					// 58:39: -> ^( FUNCTION type_id function_definition_body )
					{
						// /Users/twb/repos/Tiger/Tiger.g:58:42: ^( FUNCTION type_id function_definition_body )
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
					// /Users/twb/repos/Tiger/Tiger.g:59:4: ( VOID function_definition_void )
					{
					// /Users/twb/repos/Tiger/Tiger.g:59:4: ( VOID function_definition_void )
					// /Users/twb/repos/Tiger/Tiger.g:59:5: VOID function_definition_void
					{
					VOID17=(Token)match(input,VOID,FOLLOW_VOID_in_function_definition270);  
					stream_VOID.add(VOID17);

					pushFollow(FOLLOW_function_definition_void_in_function_definition272);
					function_definition_void18=function_definition_void();
					state._fsp--;

					stream_function_definition_void.add(function_definition_void18.getTree());
					}

					// AST REWRITE
					// elements: function_definition_void, VOID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 59:36: -> ^( FUNCTION VOID function_definition_void )
					{
						// /Users/twb/repos/Tiger/Tiger.g:59:39: ^( FUNCTION VOID function_definition_void )
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
	// /Users/twb/repos/Tiger/Tiger.g:62:1: function_definition_void : ( function_definition_body | function_definition_main );
	public final TigerParser.function_definition_void_return function_definition_void() throws RecognitionException {
		TigerParser.function_definition_void_return retval = new TigerParser.function_definition_void_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function_definition_body19 =null;
		ParserRuleReturnScope function_definition_main20 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:63:2: ( function_definition_body | function_definition_main )
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
					// /Users/twb/repos/Tiger/Tiger.g:63:4: function_definition_body
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_body_in_function_definition_void294);
					function_definition_body19=function_definition_body();
					state._fsp--;

					adaptor.addChild(root_0, function_definition_body19.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:64:4: function_definition_main
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_definition_main_in_function_definition_void299);
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
	// /Users/twb/repos/Tiger/Tiger.g:67:1: function_definition_body : ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) -> ID param_list block_list ;
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
			// /Users/twb/repos/Tiger/Tiger.g:68:2: ( ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) -> ID param_list block_list )
			// /Users/twb/repos/Tiger/Tiger.g:68:4: ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			{
			// /Users/twb/repos/Tiger/Tiger.g:68:4: ( FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			// /Users/twb/repos/Tiger/Tiger.g:68:5: FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			FUNCTION21=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_definition_body311);  
			stream_FUNCTION.add(FUNCTION21);

			ID22=(Token)match(input,ID,FOLLOW_ID_in_function_definition_body313);  
			stream_ID.add(ID22);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_definition_body315);  
			stream_LPAREN.add(LPAREN23);

			pushFollow(FOLLOW_param_list_in_function_definition_body317);
			param_list24=param_list();
			state._fsp--;

			stream_param_list.add(param_list24.getTree());
			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition_body319);  
			stream_RPAREN.add(RPAREN25);

			BEGIN26=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_function_definition_body321);  
			stream_BEGIN.add(BEGIN26);

			pushFollow(FOLLOW_block_list_in_function_definition_body323);
			block_list27=block_list();
			state._fsp--;

			stream_block_list.add(block_list27.getTree());
			END28=(Token)match(input,END,FOLLOW_END_in_function_definition_body325);  
			stream_END.add(END28);

			SEMI29=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_definition_body327);  
			stream_SEMI.add(SEMI29);

			}

			// AST REWRITE
			// elements: block_list, param_list, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 68:69: -> ID param_list block_list
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
	// /Users/twb/repos/Tiger/Tiger.g:71:1: function_definition_main : ( MAIN LPAREN RPAREN block_list ) -> MAIN PARAMS block_list ;
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
			// /Users/twb/repos/Tiger/Tiger.g:72:2: ( ( MAIN LPAREN RPAREN block_list ) -> MAIN PARAMS block_list )
			// /Users/twb/repos/Tiger/Tiger.g:72:4: ( MAIN LPAREN RPAREN block_list )
			{
			// /Users/twb/repos/Tiger/Tiger.g:72:4: ( MAIN LPAREN RPAREN block_list )
			// /Users/twb/repos/Tiger/Tiger.g:72:5: MAIN LPAREN RPAREN block_list
			{
			MAIN30=(Token)match(input,MAIN,FOLLOW_MAIN_in_function_definition_main349);  
			stream_MAIN.add(MAIN30);

			LPAREN31=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_definition_main351);  
			stream_LPAREN.add(LPAREN31);

			RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_definition_main353);  
			stream_RPAREN.add(RPAREN32);

			pushFollow(FOLLOW_block_list_in_function_definition_main355);
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
			// 72:36: -> MAIN PARAMS block_list
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
	// /Users/twb/repos/Tiger/Tiger.g:75:1: param_list : ( param param_list_tail -> ^( PARAMS param param_list_tail ) |);
	public final TigerParser.param_list_return param_list() throws RecognitionException {
		TigerParser.param_list_return retval = new TigerParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope param34 =null;
		ParserRuleReturnScope param_list_tail35 =null;

		RewriteRuleSubtreeStream stream_param_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule param_list_tail");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:76:2: ( param param_list_tail -> ^( PARAMS param param_list_tail ) |)
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
					// /Users/twb/repos/Tiger/Tiger.g:76:4: param param_list_tail
					{
					pushFollow(FOLLOW_param_in_param_list375);
					param34=param();
					state._fsp--;

					stream_param.add(param34.getTree());
					pushFollow(FOLLOW_param_list_tail_in_param_list377);
					param_list_tail35=param_list_tail();
					state._fsp--;

					stream_param_list_tail.add(param_list_tail35.getTree());
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
					// 76:26: -> ^( PARAMS param param_list_tail )
					{
						// /Users/twb/repos/Tiger/Tiger.g:76:29: ^( PARAMS param param_list_tail )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
						adaptor.addChild(root_1, stream_param.nextTree());
						adaptor.addChild(root_1, stream_param_list_tail.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:78:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:80:1: param_list_tail : ( ( COMMA param param_list_tail ) -> param ( param_list_tail )? |);
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
			// /Users/twb/repos/Tiger/Tiger.g:81:2: ( ( COMMA param param_list_tail ) -> param ( param_list_tail )? |)
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
					// /Users/twb/repos/Tiger/Tiger.g:81:4: ( COMMA param param_list_tail )
					{
					// /Users/twb/repos/Tiger/Tiger.g:81:4: ( COMMA param param_list_tail )
					// /Users/twb/repos/Tiger/Tiger.g:81:5: COMMA param param_list_tail
					{
					COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list_tail404);  
					stream_COMMA.add(COMMA36);

					pushFollow(FOLLOW_param_in_param_list_tail406);
					param37=param();
					state._fsp--;

					stream_param.add(param37.getTree());
					pushFollow(FOLLOW_param_list_tail_in_param_list_tail408);
					param_list_tail38=param_list_tail();
					state._fsp--;

					stream_param_list_tail.add(param_list_tail38.getTree());
					}

					// AST REWRITE
					// elements: param_list_tail, param
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 81:34: -> param ( param_list_tail )?
					{
						adaptor.addChild(root_0, stream_param.nextTree());
						// /Users/twb/repos/Tiger/Tiger.g:81:43: ( param_list_tail )?
						if ( stream_param_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_param_list_tail.nextTree());
						}
						stream_param_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:83:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:85:1: param : ID COLON type_id -> ^( PARAM ID type_id ) ;
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
			// /Users/twb/repos/Tiger/Tiger.g:86:2: ( ID COLON type_id -> ^( PARAM ID type_id ) )
			// /Users/twb/repos/Tiger/Tiger.g:86:4: ID COLON type_id
			{
			ID39=(Token)match(input,ID,FOLLOW_ID_in_param433);  
			stream_ID.add(ID39);

			COLON40=(Token)match(input,COLON,FOLLOW_COLON_in_param435);  
			stream_COLON.add(COLON40);

			pushFollow(FOLLOW_type_id_in_param437);
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
			// 86:21: -> ^( PARAM ID type_id )
			{
				// /Users/twb/repos/Tiger/Tiger.g:86:24: ^( PARAM ID type_id )
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
	// /Users/twb/repos/Tiger/Tiger.g:89:1: block_list : block block_tail ;
	public final TigerParser.block_list_return block_list() throws RecognitionException {
		TigerParser.block_list_return retval = new TigerParser.block_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block42 =null;
		ParserRuleReturnScope block_tail43 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:90:2: ( block block_tail )
			// /Users/twb/repos/Tiger/Tiger.g:90:4: block block_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_block_list459);
			block42=block();
			state._fsp--;

			adaptor.addChild(root_0, block42.getTree());

			pushFollow(FOLLOW_block_tail_in_block_list461);
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
	// /Users/twb/repos/Tiger/Tiger.g:93:1: block_tail : ( block block_tail |);
	public final TigerParser.block_tail_return block_tail() throws RecognitionException {
		TigerParser.block_tail_return retval = new TigerParser.block_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block44 =null;
		ParserRuleReturnScope block_tail45 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:94:2: ( block block_tail |)
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
					// /Users/twb/repos/Tiger/Tiger.g:94:4: block block_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_block_tail472);
					block44=block();
					state._fsp--;

					adaptor.addChild(root_0, block44.getTree());

					pushFollow(FOLLOW_block_tail_in_block_tail474);
					block_tail45=block_tail();
					state._fsp--;

					adaptor.addChild(root_0, block_tail45.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:96:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:98:1: block : ( BEGIN declaration_segment stat_seq END SEMI ) -> ^( BLOCK ( declaration_segment )? stat_seq ) ;
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
			// /Users/twb/repos/Tiger/Tiger.g:99:2: ( ( BEGIN declaration_segment stat_seq END SEMI ) -> ^( BLOCK ( declaration_segment )? stat_seq ) )
			// /Users/twb/repos/Tiger/Tiger.g:99:4: ( BEGIN declaration_segment stat_seq END SEMI )
			{
			// /Users/twb/repos/Tiger/Tiger.g:99:4: ( BEGIN declaration_segment stat_seq END SEMI )
			// /Users/twb/repos/Tiger/Tiger.g:99:5: BEGIN declaration_segment stat_seq END SEMI
			{
			BEGIN46=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block490);  
			stream_BEGIN.add(BEGIN46);

			pushFollow(FOLLOW_declaration_segment_in_block492);
			declaration_segment47=declaration_segment();
			state._fsp--;

			stream_declaration_segment.add(declaration_segment47.getTree());
			pushFollow(FOLLOW_stat_seq_in_block494);
			stat_seq48=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq48.getTree());
			END49=(Token)match(input,END,FOLLOW_END_in_block496);  
			stream_END.add(END49);

			SEMI50=(Token)match(input,SEMI,FOLLOW_SEMI_in_block498);  
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
			// 99:50: -> ^( BLOCK ( declaration_segment )? stat_seq )
			{
				// /Users/twb/repos/Tiger/Tiger.g:99:53: ^( BLOCK ( declaration_segment )? stat_seq )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/twb/repos/Tiger/Tiger.g:99:61: ( declaration_segment )?
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
	// /Users/twb/repos/Tiger/Tiger.g:102:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final TigerParser.declaration_segment_return declaration_segment() throws RecognitionException {
		TigerParser.declaration_segment_return retval = new TigerParser.declaration_segment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_list51 =null;
		ParserRuleReturnScope var_declaration_list52 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:103:2: ( type_declaration_list var_declaration_list )
			// /Users/twb/repos/Tiger/Tiger.g:103:4: type_declaration_list var_declaration_list
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_declaration_list_in_declaration_segment521);
			type_declaration_list51=type_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, type_declaration_list51.getTree());

			pushFollow(FOLLOW_var_declaration_list_in_declaration_segment523);
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
	// /Users/twb/repos/Tiger/Tiger.g:106:1: var_declaration_list : var_declaration_tail -> ^( VARIABLES ( var_declaration_tail )? ) ;
	public final TigerParser.var_declaration_list_return var_declaration_list() throws RecognitionException {
		TigerParser.var_declaration_list_return retval = new TigerParser.var_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration_tail53 =null;

		RewriteRuleSubtreeStream stream_var_declaration_tail=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration_tail");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:107:2: ( var_declaration_tail -> ^( VARIABLES ( var_declaration_tail )? ) )
			// /Users/twb/repos/Tiger/Tiger.g:107:4: var_declaration_tail
			{
			pushFollow(FOLLOW_var_declaration_tail_in_var_declaration_list534);
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
			// 107:25: -> ^( VARIABLES ( var_declaration_tail )? )
			{
				// /Users/twb/repos/Tiger/Tiger.g:107:28: ^( VARIABLES ( var_declaration_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				// /Users/twb/repos/Tiger/Tiger.g:107:40: ( var_declaration_tail )?
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
	// /Users/twb/repos/Tiger/Tiger.g:110:1: var_declaration_tail : ( var_declaration var_declaration_tail |);
	public final TigerParser.var_declaration_tail_return var_declaration_tail() throws RecognitionException {
		TigerParser.var_declaration_tail_return retval = new TigerParser.var_declaration_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration54 =null;
		ParserRuleReturnScope var_declaration_tail55 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:111:2: ( var_declaration var_declaration_tail |)
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			else if ( (LA8_0==BEGIN||LA8_0==BREAK||(LA8_0 >= ELSE && LA8_0 <= ENDIF)||LA8_0==FOR||LA8_0==ID||LA8_0==IF||LA8_0==RETURN||LA8_0==WHILE) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:111:4: var_declaration var_declaration_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_var_declaration_tail554);
					var_declaration54=var_declaration();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration54.getTree());

					pushFollow(FOLLOW_var_declaration_tail_in_var_declaration_tail556);
					var_declaration_tail55=var_declaration_tail();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration_tail55.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:113:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:115:1: type : ( base_type | ( ARRAY array_dimension OF base_type ) -> ^( ARRAY array_dimension base_type ) );
	public final TigerParser.type_return type() throws RecognitionException {
		TigerParser.type_return retval = new TigerParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ARRAY57=null;
		Token OF59=null;
		ParserRuleReturnScope base_type56 =null;
		ParserRuleReturnScope array_dimension58 =null;
		ParserRuleReturnScope base_type60 =null;

		Object ARRAY57_tree=null;
		Object OF59_tree=null;
		RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
		RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
		RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
		RewriteRuleSubtreeStream stream_array_dimension=new RewriteRuleSubtreeStream(adaptor,"rule array_dimension");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:116:2: ( base_type | ( ARRAY array_dimension OF base_type ) -> ^( ARRAY array_dimension base_type ) )
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
					// /Users/twb/repos/Tiger/Tiger.g:116:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type570);
					base_type56=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type56.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:117:4: ( ARRAY array_dimension OF base_type )
					{
					// /Users/twb/repos/Tiger/Tiger.g:117:4: ( ARRAY array_dimension OF base_type )
					// /Users/twb/repos/Tiger/Tiger.g:117:5: ARRAY array_dimension OF base_type
					{
					ARRAY57=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type576);  
					stream_ARRAY.add(ARRAY57);

					pushFollow(FOLLOW_array_dimension_in_type578);
					array_dimension58=array_dimension();
					state._fsp--;

					stream_array_dimension.add(array_dimension58.getTree());
					OF59=(Token)match(input,OF,FOLLOW_OF_in_type580);  
					stream_OF.add(OF59);

					pushFollow(FOLLOW_base_type_in_type582);
					base_type60=base_type();
					state._fsp--;

					stream_base_type.add(base_type60.getTree());
					}

					// AST REWRITE
					// elements: ARRAY, array_dimension, base_type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:41: -> ^( ARRAY array_dimension base_type )
					{
						// /Users/twb/repos/Tiger/Tiger.g:117:44: ^( ARRAY array_dimension base_type )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);
						adaptor.addChild(root_1, stream_array_dimension.nextTree());
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
	// /Users/twb/repos/Tiger/Tiger.g:120:1: type_id : ( base_type | ID );
	public final TigerParser.type_id_return type_id() throws RecognitionException {
		TigerParser.type_id_return retval = new TigerParser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID62=null;
		ParserRuleReturnScope base_type61 =null;

		Object ID62_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:121:2: ( base_type | ID )
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
					// /Users/twb/repos/Tiger/Tiger.g:121:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type_id604);
					base_type61=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type61.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:122:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID62=(Token)match(input,ID,FOLLOW_ID_in_type_id609); 
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
	// /Users/twb/repos/Tiger/Tiger.g:125:1: base_type : ( INT | FIXEDPT );
	public final TigerParser.base_type_return base_type() throws RecognitionException {
		TigerParser.base_type_return retval = new TigerParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set63=null;

		Object set63_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:126:2: ( INT | FIXEDPT )
			// /Users/twb/repos/Tiger/Tiger.g:
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
	// /Users/twb/repos/Tiger/Tiger.g:130:1: var_declaration : ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id optional_init ) ;
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
			// /Users/twb/repos/Tiger/Tiger.g:131:2: ( ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id optional_init ) )
			// /Users/twb/repos/Tiger/Tiger.g:131:4: ( VAR id_list COLON type_id optional_init SEMI )
			{
			// /Users/twb/repos/Tiger/Tiger.g:131:4: ( VAR id_list COLON type_id optional_init SEMI )
			// /Users/twb/repos/Tiger/Tiger.g:131:5: VAR id_list COLON type_id optional_init SEMI
			{
			VAR64=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration637);  
			stream_VAR.add(VAR64);

			pushFollow(FOLLOW_id_list_in_var_declaration639);
			id_list65=id_list();
			state._fsp--;

			stream_id_list.add(id_list65.getTree());
			COLON66=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration641);  
			stream_COLON.add(COLON66);

			pushFollow(FOLLOW_type_id_in_var_declaration643);
			type_id67=type_id();
			state._fsp--;

			stream_type_id.add(type_id67.getTree());
			pushFollow(FOLLOW_optional_init_in_var_declaration645);
			optional_init68=optional_init();
			state._fsp--;

			stream_optional_init.add(optional_init68.getTree());
			SEMI69=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration647);  
			stream_SEMI.add(SEMI69);

			}

			// AST REWRITE
			// elements: type_id, id_list, optional_init, VAR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 131:51: -> ^( VAR id_list type_id optional_init )
			{
				// /Users/twb/repos/Tiger/Tiger.g:131:54: ^( VAR id_list type_id optional_init )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id_list.nextTree());
				adaptor.addChild(root_1, stream_type_id.nextTree());
				adaptor.addChild(root_1, stream_optional_init.nextTree());
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
	// /Users/twb/repos/Tiger/Tiger.g:134:1: optional_init : ( ASSIGN constant -> constant |);
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
			// /Users/twb/repos/Tiger/Tiger.g:135:2: ( ASSIGN constant -> constant |)
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
					// /Users/twb/repos/Tiger/Tiger.g:135:4: ASSIGN constant
					{
					ASSIGN70=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init671);  
					stream_ASSIGN.add(ASSIGN70);

					pushFollow(FOLLOW_constant_in_optional_init673);
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
					// 135:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:137:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:139:1: id_list : ( id_list_head ) -> ^( IDS id_list_head ) ;
	public final TigerParser.id_list_return id_list() throws RecognitionException {
		TigerParser.id_list_return retval = new TigerParser.id_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope id_list_head72 =null;

		RewriteRuleSubtreeStream stream_id_list_head=new RewriteRuleSubtreeStream(adaptor,"rule id_list_head");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:140:2: ( ( id_list_head ) -> ^( IDS id_list_head ) )
			// /Users/twb/repos/Tiger/Tiger.g:140:4: ( id_list_head )
			{
			// /Users/twb/repos/Tiger/Tiger.g:140:4: ( id_list_head )
			// /Users/twb/repos/Tiger/Tiger.g:140:5: id_list_head
			{
			pushFollow(FOLLOW_id_list_head_in_id_list693);
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
			// 140:19: -> ^( IDS id_list_head )
			{
				// /Users/twb/repos/Tiger/Tiger.g:140:22: ^( IDS id_list_head )
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
	// /Users/twb/repos/Tiger/Tiger.g:143:1: id_list_head : ( ID id_list_tail ) -> ID ( id_list_tail )? ;
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
			// /Users/twb/repos/Tiger/Tiger.g:144:2: ( ( ID id_list_tail ) -> ID ( id_list_tail )? )
			// /Users/twb/repos/Tiger/Tiger.g:144:4: ( ID id_list_tail )
			{
			// /Users/twb/repos/Tiger/Tiger.g:144:4: ( ID id_list_tail )
			// /Users/twb/repos/Tiger/Tiger.g:144:5: ID id_list_tail
			{
			ID73=(Token)match(input,ID,FOLLOW_ID_in_id_list_head714);  
			stream_ID.add(ID73);

			pushFollow(FOLLOW_id_list_tail_in_id_list_head716);
			id_list_tail74=id_list_tail();
			state._fsp--;

			stream_id_list_tail.add(id_list_tail74.getTree());
			}

			// AST REWRITE
			// elements: ID, id_list_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 144:22: -> ID ( id_list_tail )?
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
				// /Users/twb/repos/Tiger/Tiger.g:144:28: ( id_list_tail )?
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
	// /Users/twb/repos/Tiger/Tiger.g:147:1: id_list_tail : ( COMMA id_list_head -> id_list_head |);
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
			// /Users/twb/repos/Tiger/Tiger.g:148:2: ( COMMA id_list_head -> id_list_head |)
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==COMMA) ) {
				alt12=1;
			}
			else if ( (LA12_0==COLON||LA12_0==RPAREN) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:148:4: COMMA id_list_head
					{
					COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list_tail735);  
					stream_COMMA.add(COMMA75);

					pushFollow(FOLLOW_id_list_head_in_id_list_tail737);
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
					// 148:23: -> id_list_head
					{
						adaptor.addChild(root_0, stream_id_list_head.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:150:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:152:1: optional_int : ( ASSIGN constant -> constant |);
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
			// /Users/twb/repos/Tiger/Tiger.g:153:2: ( ASSIGN constant -> constant |)
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
					// /Users/twb/repos/Tiger/Tiger.g:153:4: ASSIGN constant
					{
					ASSIGN77=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_int755);  
					stream_ASSIGN.add(ASSIGN77);

					pushFollow(FOLLOW_constant_in_optional_int757);
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
					// 153:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:155:2: 
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


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/twb/repos/Tiger/Tiger.g:157:1: expr : ( constant | value | LPAREN ! expr RPAREN !) ( options {greedy=true; } : binary_operator ^ expr )* ;
	public final TigerParser.expr_return expr() throws RecognitionException {
		TigerParser.expr_return retval = new TigerParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN81=null;
		Token RPAREN83=null;
		ParserRuleReturnScope constant79 =null;
		ParserRuleReturnScope value80 =null;
		ParserRuleReturnScope expr82 =null;
		ParserRuleReturnScope binary_operator84 =null;
		ParserRuleReturnScope expr85 =null;

		Object LPAREN81_tree=null;
		Object RPAREN83_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:158:2: ( ( constant | value | LPAREN ! expr RPAREN !) ( options {greedy=true; } : binary_operator ^ expr )* )
			// /Users/twb/repos/Tiger/Tiger.g:158:4: ( constant | value | LPAREN ! expr RPAREN !) ( options {greedy=true; } : binary_operator ^ expr )*
			{
			root_0 = (Object)adaptor.nil();


			// /Users/twb/repos/Tiger/Tiger.g:158:4: ( constant | value | LPAREN ! expr RPAREN !)
			int alt14=3;
			switch ( input.LA(1) ) {
			case FIXEDPTLIT:
			case INTLIT:
				{
				alt14=1;
				}
				break;
			case ID:
				{
				alt14=2;
				}
				break;
			case LPAREN:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:158:5: constant
					{
					pushFollow(FOLLOW_constant_in_expr777);
					constant79=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant79.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:158:16: value
					{
					pushFollow(FOLLOW_value_in_expr781);
					value80=value();
					state._fsp--;

					adaptor.addChild(root_0, value80.getTree());

					}
					break;
				case 3 :
					// /Users/twb/repos/Tiger/Tiger.g:158:24: LPAREN ! expr RPAREN !
					{
					LPAREN81=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr785); 
					pushFollow(FOLLOW_expr_in_expr788);
					expr82=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr82.getTree());

					RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr790); 
					}
					break;

			}

			// /Users/twb/repos/Tiger/Tiger.g:158:46: ( options {greedy=true; } : binary_operator ^ expr )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==AND||LA15_0==DIV||LA15_0==EQ||(LA15_0 >= GEQ && LA15_0 <= GREATER)||(LA15_0 >= LEQ && LA15_0 <= LESSER)||(LA15_0 >= MINUS && LA15_0 <= NEQ)||LA15_0==OR||LA15_0==PLUS) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:158:69: binary_operator ^ expr
					{
					pushFollow(FOLLOW_binary_operator_in_expr802);
					binary_operator84=binary_operator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(binary_operator84.getTree(), root_0);
					pushFollow(FOLLOW_expr_in_expr805);
					expr85=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr85.getTree());

					}
					break;

				default :
					break loop15;
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
	// $ANTLR end "expr"


	public static class expr_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// /Users/twb/repos/Tiger/Tiger.g:161:1: expr_list : ( expr expr_list_tail -> ^( EXPRS expr expr_list_tail ) |);
	public final TigerParser.expr_list_return expr_list() throws RecognitionException {
		TigerParser.expr_list_return retval = new TigerParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr86 =null;
		ParserRuleReturnScope expr_list_tail87 =null;

		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:162:2: ( expr expr_list_tail -> ^( EXPRS expr expr_list_tail ) |)
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FIXEDPTLIT||LA16_0==ID||LA16_0==INTLIT||LA16_0==LPAREN) ) {
				alt16=1;
			}
			else if ( (LA16_0==RPAREN) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:162:4: expr expr_list_tail
					{
					pushFollow(FOLLOW_expr_in_expr_list818);
					expr86=expr();
					state._fsp--;

					stream_expr.add(expr86.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list820);
					expr_list_tail87=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail87.getTree());
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
					// 162:24: -> ^( EXPRS expr expr_list_tail )
					{
						// /Users/twb/repos/Tiger/Tiger.g:162:27: ^( EXPRS expr expr_list_tail )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_expr_list_tail.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:164:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:166:1: expr_list_tail : ( COMMA expr expr_list_tail |);
	public final TigerParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
		TigerParser.expr_list_tail_return retval = new TigerParser.expr_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA88=null;
		ParserRuleReturnScope expr89 =null;
		ParserRuleReturnScope expr_list_tail90 =null;

		Object COMMA88_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:167:2: ( COMMA expr expr_list_tail |)
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==COMMA) ) {
				alt17=1;
			}
			else if ( (LA17_0==RPAREN) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:167:4: COMMA expr expr_list_tail
					{
					root_0 = (Object)adaptor.nil();


					COMMA88=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail846); 
					COMMA88_tree = (Object)adaptor.create(COMMA88);
					adaptor.addChild(root_0, COMMA88_tree);

					pushFollow(FOLLOW_expr_in_expr_list_tail848);
					expr89=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr89.getTree());

					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail850);
					expr_list_tail90=expr_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_list_tail90.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:169:2: 
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


	public static class stat_seq_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat_seq"
	// /Users/twb/repos/Tiger/Tiger.g:171:1: stat_seq : stat_tail -> ^( STATEMENTS ( stat_tail )? ) ;
	public final TigerParser.stat_seq_return stat_seq() throws RecognitionException {
		TigerParser.stat_seq_return retval = new TigerParser.stat_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat_tail91 =null;

		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:172:2: ( stat_tail -> ^( STATEMENTS ( stat_tail )? ) )
			// /Users/twb/repos/Tiger/Tiger.g:172:4: stat_tail
			{
			pushFollow(FOLLOW_stat_tail_in_stat_seq865);
			stat_tail91=stat_tail();
			state._fsp--;

			stream_stat_tail.add(stat_tail91.getTree());
			// AST REWRITE
			// elements: stat_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 172:14: -> ^( STATEMENTS ( stat_tail )? )
			{
				// /Users/twb/repos/Tiger/Tiger.g:172:17: ^( STATEMENTS ( stat_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);
				// /Users/twb/repos/Tiger/Tiger.g:172:30: ( stat_tail )?
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
	// /Users/twb/repos/Tiger/Tiger.g:175:1: stat_tail : ( stat stat_tail -> stat ( stat_tail )? |);
	public final TigerParser.stat_tail_return stat_tail() throws RecognitionException {
		TigerParser.stat_tail_return retval = new TigerParser.stat_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat92 =null;
		ParserRuleReturnScope stat_tail93 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:176:2: ( stat stat_tail -> stat ( stat_tail )? |)
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==BEGIN||LA18_0==BREAK||LA18_0==FOR||LA18_0==ID||LA18_0==IF||LA18_0==RETURN||LA18_0==WHILE) ) {
				alt18=1;
			}
			else if ( ((LA18_0 >= ELSE && LA18_0 <= ENDIF)) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:176:4: stat stat_tail
					{
					pushFollow(FOLLOW_stat_in_stat_tail885);
					stat92=stat();
					state._fsp--;

					stream_stat.add(stat92.getTree());
					pushFollow(FOLLOW_stat_tail_in_stat_tail887);
					stat_tail93=stat_tail();
					state._fsp--;

					stream_stat_tail.add(stat_tail93.getTree());
					// AST REWRITE
					// elements: stat_tail, stat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 176:19: -> stat ( stat_tail )?
					{
						adaptor.addChild(root_0, stream_stat.nextTree());
						// /Users/twb/repos/Tiger/Tiger.g:176:27: ( stat_tail )?
						if ( stream_stat_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_stat_tail.nextTree());
						}
						stream_stat_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:178:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:180:1: stat : ( if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN id_list RPAREN -> ^( INVOKE ID id_list ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ID statement_assignment ( optional_subscript )? ) ) SEMI );
	public final TigerParser.stat_return stat() throws RecognitionException {
		TigerParser.stat_return retval = new TigerParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE95=null;
		Token DO97=null;
		Token ENDDO99=null;
		Token SEMI100=null;
		Token FOR101=null;
		Token ID102=null;
		Token ASSIGN103=null;
		Token DO105=null;
		Token ENDDO107=null;
		Token SEMI108=null;
		Token BREAK109=null;
		Token SEMI110=null;
		Token RETURN111=null;
		Token SEMI113=null;
		Token ID115=null;
		Token LPAREN116=null;
		Token RPAREN118=null;
		Token ASSIGN120=null;
		Token SEMI122=null;
		ParserRuleReturnScope if_stmt94 =null;
		ParserRuleReturnScope expr96 =null;
		ParserRuleReturnScope stat_seq98 =null;
		ParserRuleReturnScope range104 =null;
		ParserRuleReturnScope stat_seq106 =null;
		ParserRuleReturnScope expr112 =null;
		ParserRuleReturnScope block114 =null;
		ParserRuleReturnScope id_list117 =null;
		ParserRuleReturnScope optional_subscript119 =null;
		ParserRuleReturnScope statement_assignment121 =null;

		Object WHILE95_tree=null;
		Object DO97_tree=null;
		Object ENDDO99_tree=null;
		Object SEMI100_tree=null;
		Object FOR101_tree=null;
		Object ID102_tree=null;
		Object ASSIGN103_tree=null;
		Object DO105_tree=null;
		Object ENDDO107_tree=null;
		Object SEMI108_tree=null;
		Object BREAK109_tree=null;
		Object SEMI110_tree=null;
		Object RETURN111_tree=null;
		Object SEMI113_tree=null;
		Object ID115_tree=null;
		Object LPAREN116_tree=null;
		Object RPAREN118_tree=null;
		Object ASSIGN120_tree=null;
		Object SEMI122_tree=null;
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
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
		RewriteRuleSubtreeStream stream_statement_assignment=new RewriteRuleSubtreeStream(adaptor,"rule statement_assignment");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:181:2: ( if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN id_list RPAREN -> ^( INVOKE ID id_list ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ID statement_assignment ( optional_subscript )? ) ) SEMI )
			int alt20=7;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt20=1;
				}
				break;
			case WHILE:
				{
				alt20=2;
				}
				break;
			case FOR:
				{
				alt20=3;
				}
				break;
			case BREAK:
				{
				alt20=4;
				}
				break;
			case RETURN:
				{
				alt20=5;
				}
				break;
			case BEGIN:
				{
				alt20=6;
				}
				break;
			case ID:
				{
				alt20=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:181:4: if_stmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmt_in_stat908);
					if_stmt94=if_stmt();
					state._fsp--;

					adaptor.addChild(root_0, if_stmt94.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:182:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					{
					// /Users/twb/repos/Tiger/Tiger.g:182:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					// /Users/twb/repos/Tiger/Tiger.g:182:5: WHILE expr DO stat_seq ENDDO SEMI
					{
					WHILE95=(Token)match(input,WHILE,FOLLOW_WHILE_in_stat914);  
					stream_WHILE.add(WHILE95);

					pushFollow(FOLLOW_expr_in_stat916);
					expr96=expr();
					state._fsp--;

					stream_expr.add(expr96.getTree());
					DO97=(Token)match(input,DO,FOLLOW_DO_in_stat918);  
					stream_DO.add(DO97);

					pushFollow(FOLLOW_stat_seq_in_stat920);
					stat_seq98=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq98.getTree());
					ENDDO99=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat922);  
					stream_ENDDO.add(ENDDO99);

					SEMI100=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat924);  
					stream_SEMI.add(SEMI100);

					}

					// AST REWRITE
					// elements: WHILE, expr, stat_seq
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 182:40: -> ^( WHILE expr stat_seq )
					{
						// /Users/twb/repos/Tiger/Tiger.g:182:43: ^( WHILE expr stat_seq )
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
					// /Users/twb/repos/Tiger/Tiger.g:183:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					{
					// /Users/twb/repos/Tiger/Tiger.g:183:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					// /Users/twb/repos/Tiger/Tiger.g:183:5: FOR ID ASSIGN range DO stat_seq ENDDO SEMI
					{
					FOR101=(Token)match(input,FOR,FOLLOW_FOR_in_stat941);  
					stream_FOR.add(FOR101);

					ID102=(Token)match(input,ID,FOLLOW_ID_in_stat943);  
					stream_ID.add(ID102);

					ASSIGN103=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat945);  
					stream_ASSIGN.add(ASSIGN103);

					pushFollow(FOLLOW_range_in_stat947);
					range104=range();
					state._fsp--;

					stream_range.add(range104.getTree());
					DO105=(Token)match(input,DO,FOLLOW_DO_in_stat949);  
					stream_DO.add(DO105);

					pushFollow(FOLLOW_stat_seq_in_stat951);
					stat_seq106=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq106.getTree());
					ENDDO107=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat953);  
					stream_ENDDO.add(ENDDO107);

					SEMI108=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat955);  
					stream_SEMI.add(SEMI108);

					}

					// AST REWRITE
					// elements: stat_seq, range, FOR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 183:49: -> ^( FOR range stat_seq )
					{
						// /Users/twb/repos/Tiger/Tiger.g:183:52: ^( FOR range stat_seq )
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
					// /Users/twb/repos/Tiger/Tiger.g:184:4: BREAK SEMI
					{
					BREAK109=(Token)match(input,BREAK,FOLLOW_BREAK_in_stat971);  
					stream_BREAK.add(BREAK109);

					SEMI110=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat973);  
					stream_SEMI.add(SEMI110);

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
					// 184:15: -> BREAK
					{
						adaptor.addChild(root_0, stream_BREAK.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/twb/repos/Tiger/Tiger.g:185:4: RETURN expr SEMI
					{
					RETURN111=(Token)match(input,RETURN,FOLLOW_RETURN_in_stat982);  
					stream_RETURN.add(RETURN111);

					pushFollow(FOLLOW_expr_in_stat984);
					expr112=expr();
					state._fsp--;

					stream_expr.add(expr112.getTree());
					SEMI113=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat986);  
					stream_SEMI.add(SEMI113);

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
					// 185:21: -> ^( RETURN expr )
					{
						// /Users/twb/repos/Tiger/Tiger.g:185:24: ^( RETURN expr )
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
					// /Users/twb/repos/Tiger/Tiger.g:186:4: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat999);
					block114=block();
					state._fsp--;

					adaptor.addChild(root_0, block114.getTree());

					}
					break;
				case 7 :
					// /Users/twb/repos/Tiger/Tiger.g:187:4: ID ( LPAREN id_list RPAREN -> ^( INVOKE ID id_list ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ID statement_assignment ( optional_subscript )? ) ) SEMI
					{
					ID115=(Token)match(input,ID,FOLLOW_ID_in_stat1004);  
					stream_ID.add(ID115);

					// /Users/twb/repos/Tiger/Tiger.g:187:8: ( LPAREN id_list RPAREN -> ^( INVOKE ID id_list ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ID statement_assignment ( optional_subscript )? ) )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LPAREN) ) {
						alt19=1;
					}
					else if ( (LA19_0==AND||LA19_0==ASSIGN||LA19_0==COMMA||(LA19_0 >= DIV && LA19_0 <= DO)||LA19_0==EQ||(LA19_0 >= GEQ && LA19_0 <= GREATER)||(LA19_0 >= LBRACK && LA19_0 <= LESSER)||(LA19_0 >= MINUS && LA19_0 <= NEQ)||LA19_0==OR||LA19_0==PLUS||(LA19_0 >= RPAREN && LA19_0 <= SEMI)||LA19_0==THEN) ) {
						alt19=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// /Users/twb/repos/Tiger/Tiger.g:188:6: LPAREN id_list RPAREN
							{
							LPAREN116=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stat1015);  
							stream_LPAREN.add(LPAREN116);

							pushFollow(FOLLOW_id_list_in_stat1017);
							id_list117=id_list();
							state._fsp--;

							stream_id_list.add(id_list117.getTree());
							RPAREN118=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stat1019);  
							stream_RPAREN.add(RPAREN118);

							// AST REWRITE
							// elements: id_list, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 188:30: -> ^( INVOKE ID id_list )
							{
								// /Users/twb/repos/Tiger/Tiger.g:188:33: ^( INVOKE ID id_list )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INVOKE, "INVOKE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_id_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// /Users/twb/repos/Tiger/Tiger.g:189:6: optional_subscript ASSIGN statement_assignment
							{
							pushFollow(FOLLOW_optional_subscript_in_stat1038);
							optional_subscript119=optional_subscript();
							state._fsp--;

							stream_optional_subscript.add(optional_subscript119.getTree());
							ASSIGN120=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat1040);  
							stream_ASSIGN.add(ASSIGN120);

							pushFollow(FOLLOW_statement_assignment_in_stat1042);
							statement_assignment121=statement_assignment();
							state._fsp--;

							stream_statement_assignment.add(statement_assignment121.getTree());
							// AST REWRITE
							// elements: ASSIGN, ID, statement_assignment, optional_subscript
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 189:53: -> ^( ASSIGN ID statement_assignment ( optional_subscript )? )
							{
								// /Users/twb/repos/Tiger/Tiger.g:189:56: ^( ASSIGN ID statement_assignment ( optional_subscript )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								adaptor.addChild(root_1, stream_statement_assignment.nextTree());
								// /Users/twb/repos/Tiger/Tiger.g:189:89: ( optional_subscript )?
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

					SEMI122=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat1062);  
					stream_SEMI.add(SEMI122);

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


	public static class value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
	// /Users/twb/repos/Tiger/Tiger.g:193:1: value : ID ( optional_subscript -> ^( REFERENCE ID ( optional_subscript )? ) ) ;
	public final TigerParser.value_return value() throws RecognitionException {
		TigerParser.value_return retval = new TigerParser.value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID123=null;
		ParserRuleReturnScope optional_subscript124 =null;

		Object ID123_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_optional_subscript=new RewriteRuleSubtreeStream(adaptor,"rule optional_subscript");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:194:2: ( ID ( optional_subscript -> ^( REFERENCE ID ( optional_subscript )? ) ) )
			// /Users/twb/repos/Tiger/Tiger.g:194:4: ID ( optional_subscript -> ^( REFERENCE ID ( optional_subscript )? ) )
			{
			ID123=(Token)match(input,ID,FOLLOW_ID_in_value1073);  
			stream_ID.add(ID123);

			// /Users/twb/repos/Tiger/Tiger.g:194:7: ( optional_subscript -> ^( REFERENCE ID ( optional_subscript )? ) )
			// /Users/twb/repos/Tiger/Tiger.g:195:6: optional_subscript
			{
			pushFollow(FOLLOW_optional_subscript_in_value1082);
			optional_subscript124=optional_subscript();
			state._fsp--;

			stream_optional_subscript.add(optional_subscript124.getTree());
			// AST REWRITE
			// elements: optional_subscript, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 195:26: -> ^( REFERENCE ID ( optional_subscript )? )
			{
				// /Users/twb/repos/Tiger/Tiger.g:195:29: ^( REFERENCE ID ( optional_subscript )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// /Users/twb/repos/Tiger/Tiger.g:195:44: ( optional_subscript )?
				if ( stream_optional_subscript.hasNext() ) {
					adaptor.addChild(root_1, stream_optional_subscript.nextTree());
				}
				stream_optional_subscript.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "value"


	public static class optional_subscript_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optional_subscript"
	// /Users/twb/repos/Tiger/Tiger.g:199:1: optional_subscript : ( array_subscripts |);
	public final TigerParser.optional_subscript_return optional_subscript() throws RecognitionException {
		TigerParser.optional_subscript_return retval = new TigerParser.optional_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_subscripts125 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:200:2: ( array_subscripts |)
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LBRACK) ) {
				alt21=1;
			}
			else if ( (LA21_0==AND||LA21_0==ASSIGN||LA21_0==COMMA||(LA21_0 >= DIV && LA21_0 <= DO)||LA21_0==EQ||(LA21_0 >= GEQ && LA21_0 <= GREATER)||(LA21_0 >= LEQ && LA21_0 <= LESSER)||(LA21_0 >= MINUS && LA21_0 <= NEQ)||LA21_0==OR||LA21_0==PLUS||(LA21_0 >= RPAREN && LA21_0 <= SEMI)||LA21_0==THEN) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:200:4: array_subscripts
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_subscripts_in_optional_subscript1110);
					array_subscripts125=array_subscripts();
					state._fsp--;

					adaptor.addChild(root_0, array_subscripts125.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:202:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:204:1: range : (start= index_expr TO stop= index_expr ) -> $start $stop;
	public final TigerParser.range_return range() throws RecognitionException {
		TigerParser.range_return retval = new TigerParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO126=null;
		ParserRuleReturnScope start =null;
		ParserRuleReturnScope stop =null;

		Object TO126_tree=null;
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:205:2: ( (start= index_expr TO stop= index_expr ) -> $start $stop)
			// /Users/twb/repos/Tiger/Tiger.g:205:4: (start= index_expr TO stop= index_expr )
			{
			// /Users/twb/repos/Tiger/Tiger.g:205:4: (start= index_expr TO stop= index_expr )
			// /Users/twb/repos/Tiger/Tiger.g:205:5: start= index_expr TO stop= index_expr
			{
			pushFollow(FOLLOW_index_expr_in_range1128);
			start=index_expr();
			state._fsp--;

			stream_index_expr.add(start.getTree());
			TO126=(Token)match(input,TO,FOLLOW_TO_in_range1130);  
			stream_TO.add(TO126);

			pushFollow(FOLLOW_index_expr_in_range1134);
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
			// 205:42: -> $start $stop
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
	// /Users/twb/repos/Tiger/Tiger.g:208:1: statement_assignment : ( expr | IF LPAREN expr_list RPAREN -> expr_list );
	public final TigerParser.statement_assignment_return statement_assignment() throws RecognitionException {
		TigerParser.statement_assignment_return retval = new TigerParser.statement_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF128=null;
		Token LPAREN129=null;
		Token RPAREN131=null;
		ParserRuleReturnScope expr127 =null;
		ParserRuleReturnScope expr_list130 =null;

		Object IF128_tree=null;
		Object LPAREN129_tree=null;
		Object RPAREN131_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:209:2: ( expr | IF LPAREN expr_list RPAREN -> expr_list )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==FIXEDPTLIT||LA22_0==ID||LA22_0==INTLIT||LA22_0==LPAREN) ) {
				alt22=1;
			}
			else if ( (LA22_0==IF) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:209:4: expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_statement_assignment1154);
					expr127=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr127.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:210:4: IF LPAREN expr_list RPAREN
					{
					IF128=(Token)match(input,IF,FOLLOW_IF_in_statement_assignment1159);  
					stream_IF.add(IF128);

					LPAREN129=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement_assignment1161);  
					stream_LPAREN.add(LPAREN129);

					pushFollow(FOLLOW_expr_list_in_statement_assignment1163);
					expr_list130=expr_list();
					state._fsp--;

					stream_expr_list.add(expr_list130.getTree());
					RPAREN131=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement_assignment1165);  
					stream_RPAREN.add(RPAREN131);

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
					// 210:31: -> expr_list
					{
						adaptor.addChild(root_0, stream_expr_list.nextTree());
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


	public static class if_stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_stmt"
	// /Users/twb/repos/Tiger/Tiger.g:213:1: if_stmt : ( IF expr THEN stat_seq else_stmt ENDIF SEMI ) -> ^( IF expr stat_seq else_stmt ) ;
	public final TigerParser.if_stmt_return if_stmt() throws RecognitionException {
		TigerParser.if_stmt_return retval = new TigerParser.if_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF132=null;
		Token THEN134=null;
		Token ENDIF137=null;
		Token SEMI138=null;
		ParserRuleReturnScope expr133 =null;
		ParserRuleReturnScope stat_seq135 =null;
		ParserRuleReturnScope else_stmt136 =null;

		Object IF132_tree=null;
		Object THEN134_tree=null;
		Object ENDIF137_tree=null;
		Object SEMI138_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_else_stmt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmt");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:214:2: ( ( IF expr THEN stat_seq else_stmt ENDIF SEMI ) -> ^( IF expr stat_seq else_stmt ) )
			// /Users/twb/repos/Tiger/Tiger.g:214:4: ( IF expr THEN stat_seq else_stmt ENDIF SEMI )
			{
			// /Users/twb/repos/Tiger/Tiger.g:214:4: ( IF expr THEN stat_seq else_stmt ENDIF SEMI )
			// /Users/twb/repos/Tiger/Tiger.g:214:5: IF expr THEN stat_seq else_stmt ENDIF SEMI
			{
			IF132=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1181);  
			stream_IF.add(IF132);

			pushFollow(FOLLOW_expr_in_if_stmt1183);
			expr133=expr();
			state._fsp--;

			stream_expr.add(expr133.getTree());
			THEN134=(Token)match(input,THEN,FOLLOW_THEN_in_if_stmt1185);  
			stream_THEN.add(THEN134);

			pushFollow(FOLLOW_stat_seq_in_if_stmt1187);
			stat_seq135=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq135.getTree());
			pushFollow(FOLLOW_else_stmt_in_if_stmt1189);
			else_stmt136=else_stmt();
			state._fsp--;

			stream_else_stmt.add(else_stmt136.getTree());
			ENDIF137=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_stmt1191);  
			stream_ENDIF.add(ENDIF137);

			SEMI138=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_stmt1193);  
			stream_SEMI.add(SEMI138);

			}

			// AST REWRITE
			// elements: else_stmt, stat_seq, expr, IF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 214:49: -> ^( IF expr stat_seq else_stmt )
			{
				// /Users/twb/repos/Tiger/Tiger.g:214:52: ^( IF expr stat_seq else_stmt )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				adaptor.addChild(root_1, stream_else_stmt.nextTree());
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
	// /Users/twb/repos/Tiger/Tiger.g:217:1: else_stmt : ( ELSE stat_seq -> stat_seq |);
	public final TigerParser.else_stmt_return else_stmt() throws RecognitionException {
		TigerParser.else_stmt_return retval = new TigerParser.else_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE139=null;
		ParserRuleReturnScope stat_seq140 =null;

		Object ELSE139_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:218:2: ( ELSE stat_seq -> stat_seq |)
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ELSE) ) {
				alt23=1;
			}
			else if ( (LA23_0==ENDIF) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:218:4: ELSE stat_seq
					{
					ELSE139=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1218);  
					stream_ELSE.add(ELSE139);

					pushFollow(FOLLOW_stat_seq_in_else_stmt1220);
					stat_seq140=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq140.getTree());
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
					// 218:18: -> stat_seq
					{
						adaptor.addChild(root_0, stream_stat_seq.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:220:2: 
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


	public static class opt_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "opt_prefix"
	// /Users/twb/repos/Tiger/Tiger.g:222:1: opt_prefix : ( value ASSIGN |);
	public final TigerParser.opt_prefix_return opt_prefix() throws RecognitionException {
		TigerParser.opt_prefix_return retval = new TigerParser.opt_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN142=null;
		ParserRuleReturnScope value141 =null;

		Object ASSIGN142_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:223:2: ( value ASSIGN |)
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ID) ) {
				alt24=1;
			}
			else if ( (LA24_0==EOF) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:223:4: value ASSIGN
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_value_in_opt_prefix1239);
					value141=value();
					state._fsp--;

					adaptor.addChild(root_0, value141.getTree());

					ASSIGN142=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_opt_prefix1241); 
					ASSIGN142_tree = (Object)adaptor.create(ASSIGN142);
					adaptor.addChild(root_0, ASSIGN142_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:225:2: 
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
	// $ANTLR end "opt_prefix"


	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// /Users/twb/repos/Tiger/Tiger.g:227:1: constant : ( INTLIT | FIXEDPTLIT );
	public final TigerParser.constant_return constant() throws RecognitionException {
		TigerParser.constant_return retval = new TigerParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set143=null;

		Object set143_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:228:2: ( INTLIT | FIXEDPTLIT )
			// /Users/twb/repos/Tiger/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set143=input.LT(1);
			if ( input.LA(1)==FIXEDPTLIT||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set143));
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
	// /Users/twb/repos/Tiger/Tiger.g:232:1: binary_operator : ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR );
	public final TigerParser.binary_operator_return binary_operator() throws RecognitionException {
		TigerParser.binary_operator_return retval = new TigerParser.binary_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set144=null;

		Object set144_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:233:2: ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR )
			// /Users/twb/repos/Tiger/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set144=input.LT(1);
			if ( input.LA(1)==AND||input.LA(1)==DIV||input.LA(1)==EQ||(input.LA(1) >= GEQ && input.LA(1) <= GREATER)||(input.LA(1) >= LEQ && input.LA(1) <= LESSER)||(input.LA(1) >= MINUS && input.LA(1) <= NEQ)||input.LA(1)==OR||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set144));
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
	// /Users/twb/repos/Tiger/Tiger.g:247:1: array_dimensions : array_dimension ( array_dimension )? ;
	public final TigerParser.array_dimensions_return array_dimensions() throws RecognitionException {
		TigerParser.array_dimensions_return retval = new TigerParser.array_dimensions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_dimension145 =null;
		ParserRuleReturnScope array_dimension146 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:248:2: ( array_dimension ( array_dimension )? )
			// /Users/twb/repos/Tiger/Tiger.g:248:4: array_dimension ( array_dimension )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_dimension_in_array_dimensions1340);
			array_dimension145=array_dimension();
			state._fsp--;

			adaptor.addChild(root_0, array_dimension145.getTree());

			// /Users/twb/repos/Tiger/Tiger.g:248:20: ( array_dimension )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==LBRACK) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:248:20: array_dimension
					{
					pushFollow(FOLLOW_array_dimension_in_array_dimensions1342);
					array_dimension146=array_dimension();
					state._fsp--;

					adaptor.addChild(root_0, array_dimension146.getTree());

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
	// /Users/twb/repos/Tiger/Tiger.g:251:1: array_dimension : ( LBRACK INTLIT RBRACK ) -> INTLIT ;
	public final TigerParser.array_dimension_return array_dimension() throws RecognitionException {
		TigerParser.array_dimension_return retval = new TigerParser.array_dimension_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK147=null;
		Token INTLIT148=null;
		Token RBRACK149=null;

		Object LBRACK147_tree=null;
		Object INTLIT148_tree=null;
		Object RBRACK149_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:252:2: ( ( LBRACK INTLIT RBRACK ) -> INTLIT )
			// /Users/twb/repos/Tiger/Tiger.g:252:4: ( LBRACK INTLIT RBRACK )
			{
			// /Users/twb/repos/Tiger/Tiger.g:252:4: ( LBRACK INTLIT RBRACK )
			// /Users/twb/repos/Tiger/Tiger.g:252:5: LBRACK INTLIT RBRACK
			{
			LBRACK147=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_dimension1355);  
			stream_LBRACK.add(LBRACK147);

			INTLIT148=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_array_dimension1357);  
			stream_INTLIT.add(INTLIT148);

			RBRACK149=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_dimension1359);  
			stream_RBRACK.add(RBRACK149);

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
			// 252:27: -> INTLIT
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
	// /Users/twb/repos/Tiger/Tiger.g:255:1: array_subscripts : array_subscript ( array_subscript )? ;
	public final TigerParser.array_subscripts_return array_subscripts() throws RecognitionException {
		TigerParser.array_subscripts_return retval = new TigerParser.array_subscripts_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_subscript150 =null;
		ParserRuleReturnScope array_subscript151 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:256:2: ( array_subscript ( array_subscript )? )
			// /Users/twb/repos/Tiger/Tiger.g:256:4: array_subscript ( array_subscript )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_subscript_in_array_subscripts1375);
			array_subscript150=array_subscript();
			state._fsp--;

			adaptor.addChild(root_0, array_subscript150.getTree());

			// /Users/twb/repos/Tiger/Tiger.g:256:20: ( array_subscript )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LBRACK) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:256:20: array_subscript
					{
					pushFollow(FOLLOW_array_subscript_in_array_subscripts1377);
					array_subscript151=array_subscript();
					state._fsp--;

					adaptor.addChild(root_0, array_subscript151.getTree());

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
	// /Users/twb/repos/Tiger/Tiger.g:259:1: array_subscript : ( LBRACK index_expr RBRACK ) -> index_expr ;
	public final TigerParser.array_subscript_return array_subscript() throws RecognitionException {
		TigerParser.array_subscript_return retval = new TigerParser.array_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK152=null;
		Token RBRACK154=null;
		ParserRuleReturnScope index_expr153 =null;

		Object LBRACK152_tree=null;
		Object RBRACK154_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:260:2: ( ( LBRACK index_expr RBRACK ) -> index_expr )
			// /Users/twb/repos/Tiger/Tiger.g:260:4: ( LBRACK index_expr RBRACK )
			{
			// /Users/twb/repos/Tiger/Tiger.g:260:4: ( LBRACK index_expr RBRACK )
			// /Users/twb/repos/Tiger/Tiger.g:260:5: LBRACK index_expr RBRACK
			{
			LBRACK152=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_subscript1390);  
			stream_LBRACK.add(LBRACK152);

			pushFollow(FOLLOW_index_expr_in_array_subscript1392);
			index_expr153=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr153.getTree());
			RBRACK154=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_subscript1394);  
			stream_RBRACK.add(RBRACK154);

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
			// 260:31: -> index_expr
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
	// /Users/twb/repos/Tiger/Tiger.g:263:1: index_expr : ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* ;
	public final TigerParser.index_expr_return index_expr() throws RecognitionException {
		TigerParser.index_expr_return retval = new TigerParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set155=null;
		ParserRuleReturnScope index_oper156 =null;
		ParserRuleReturnScope index_expr157 =null;

		Object set155_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:264:2: ( ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* )
			// /Users/twb/repos/Tiger/Tiger.g:264:4: ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )*
			{
			root_0 = (Object)adaptor.nil();


			set155=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set155));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// /Users/twb/repos/Tiger/Tiger.g:264:18: ( options {greedy=true; } : index_oper index_expr )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= MINUS && LA27_0 <= MULT)||LA27_0==PLUS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:264:42: index_oper index_expr
					{
					pushFollow(FOLLOW_index_oper_in_index_expr1427);
					index_oper156=index_oper();
					state._fsp--;

					adaptor.addChild(root_0, index_oper156.getTree());

					pushFollow(FOLLOW_index_expr_in_index_expr1429);
					index_expr157=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr157.getTree());

					}
					break;

				default :
					break loop27;
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
	// /Users/twb/repos/Tiger/Tiger.g:267:1: index_oper : ( PLUS | MINUS | MULT );
	public final TigerParser.index_oper_return index_oper() throws RecognitionException {
		TigerParser.index_oper_return retval = new TigerParser.index_oper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set158=null;

		Object set158_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:268:2: ( PLUS | MINUS | MULT )
			// /Users/twb/repos/Tiger/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set158=input.LT(1);
			if ( (input.LA(1) >= MINUS && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set158));
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



	public static final BitSet FOLLOW_type_declaration_list_in_tiger_program118 = new BitSet(new long[]{0x1000000090200000L});
	public static final BitSet FOLLOW_function_declaration_list_in_tiger_program120 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_tiger_program122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_tail_in_type_declaration_list146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_tail167 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_type_declaration_tail_in_type_declaration_tail169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration184 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_type_declaration186 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration188 = new BitSet(new long[]{0x0000000080200020L});
	public static final BitSet FOLLOW_type_in_type_declaration190 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_tail_in_function_declaration_list214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_in_function_declaration_tail234 = new BitSet(new long[]{0x1000000090200000L});
	public static final BitSet FOLLOW_function_declaration_tail_in_function_declaration_tail236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_function_definition251 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_function_definition_body_in_function_definition253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_function_definition270 = new BitSet(new long[]{0x0000004001000000L});
	public static final BitSet FOLLOW_function_definition_void_in_function_definition272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_body_in_function_definition_void294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_main_in_function_definition_void299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_definition_body311 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_function_definition_body313 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_definition_body315 = new BitSet(new long[]{0x0008000010000000L});
	public static final BitSet FOLLOW_param_list_in_function_definition_body317 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_definition_body319 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_function_definition_body321 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_function_definition_body323 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_function_definition_body325 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_function_definition_body327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_function_definition_main349 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_definition_main351 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_definition_main353 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_function_definition_main355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list375 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail404 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_param_in_param_list_tail406 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_tail408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_param433 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_param435 = new BitSet(new long[]{0x0000000090200000L});
	public static final BitSet FOLLOW_type_id_in_param437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list459 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail472 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block490 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_declaration_segment_in_block492 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_block494 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_block496 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_list_in_declaration_segment521 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_declaration_segment523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_tail_in_var_declaration_list534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_tail554 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_var_declaration_tail_in_var_declaration_tail556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type576 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_array_dimension_in_type578 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_OF_in_type580 = new BitSet(new long[]{0x0000000080200000L});
	public static final BitSet FOLLOW_base_type_in_type582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_id609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration637 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration639 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_var_declaration641 = new BitSet(new long[]{0x0000000090200000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration643 = new BitSet(new long[]{0x0010000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration645 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init671 = new BitSet(new long[]{0x0000000100400000L});
	public static final BitSet FOLLOW_constant_in_optional_init673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_list_head_in_id_list693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list_head714 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list_head716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_id_list_tail735 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_id_list_head_in_id_list_tail737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_int755 = new BitSet(new long[]{0x0000000100400000L});
	public static final BitSet FOLLOW_constant_in_optional_int757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr777 = new BitSet(new long[]{0x00004B980C082012L});
	public static final BitSet FOLLOW_value_in_expr781 = new BitSet(new long[]{0x00004B980C082012L});
	public static final BitSet FOLLOW_LPAREN_in_expr785 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr788 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr790 = new BitSet(new long[]{0x00004B980C082012L});
	public static final BitSet FOLLOW_binary_operator_in_expr802 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr805 = new BitSet(new long[]{0x00004B980C082012L});
	public static final BitSet FOLLOW_expr_in_expr_list818 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail846 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail848 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_tail_in_stat_seq865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_tail885 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_tail_in_stat_tail887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_stat908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat914 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_stat916 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat918 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_stat920 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat922 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat941 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_stat943 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat945 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_range_in_stat947 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat949 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_stat951 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat953 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat971 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat982 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_stat984 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat1004 = new BitSet(new long[]{0x0000002400000040L});
	public static final BitSet FOLLOW_LPAREN_in_stat1015 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_id_list_in_stat1017 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat1019 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_optional_subscript_in_stat1038 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat1040 = new BitSet(new long[]{0x0000002150400000L});
	public static final BitSet FOLLOW_statement_assignment_in_stat1042 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1073 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_optional_subscript_in_value1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_subscripts_in_optional_subscript1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_range1128 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TO_in_range1130 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_range1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement_assignment1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement_assignment1159 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_statement_assignment1161 = new BitSet(new long[]{0x0008002110400000L});
	public static final BitSet FOLLOW_expr_list_in_statement_assignment1163 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_statement_assignment1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt1181 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_if_stmt1183 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_THEN_in_if_stmt1185 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_if_stmt1187 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_else_stmt_in_if_stmt1189 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDIF_in_if_stmt1191 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_stmt1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_stmt1218 = new BitSet(new long[]{0x2004000050800280L});
	public static final BitSet FOLLOW_stat_seq_in_else_stmt1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_opt_prefix1239 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_opt_prefix1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions1340 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_dimension1355 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_INTLIT_in_array_dimension1357 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_dimension1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_subscript_in_array_subscripts1375 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_array_subscript_in_array_subscripts1377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_subscript1390 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_array_subscript1392 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_subscript1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_index_expr1410 = new BitSet(new long[]{0x0000418000000002L});
	public static final BitSet FOLLOW_index_oper_in_index_expr1427 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_index_expr1429 = new BitSet(new long[]{0x0000418000000002L});
}
