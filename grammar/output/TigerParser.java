// $ANTLR 3.5.1 /Users/twb/Repos/Class/Tiger/grammar/Tiger.g 2014-10-24 17:25:00

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
		"NEQ", "OF", "OR", "PARAMS", "PLUS", "PROGRAM", "RBRACK", "REFERENCE", 
		"RETURN", "RPAREN", "SEMI", "STATEMENTS", "THEN", "TO", "TYPE", "TYPES", 
		"VAR", "VARS", "VOID", "WHILE", "WS"
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
	public static final int VARS=59;
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
	@Override public String getGrammarFileName() { return "/Users/twb/Repos/Class/Tiger/grammar/Tiger.g"; }


	public static class tiger_program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tiger_program"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:32:1: tiger_program : ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ^( TYPES ( type_declaration_list )? ) ^( FUNCTIONS function_declaration_list ) ) ;
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:33:2: ( ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ^( TYPES ( type_declaration_list )? ) ^( FUNCTIONS function_declaration_list ) ) )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:33:4: ( type_declaration_list function_declaration_list EOF )
			{
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:33:4: ( type_declaration_list function_declaration_list EOF )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:33:5: type_declaration_list function_declaration_list EOF
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
			// 33:58: -> ^( PROGRAM ^( TYPES ( type_declaration_list )? ) ^( FUNCTIONS function_declaration_list ) )
			{
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:33:61: ^( PROGRAM ^( TYPES ( type_declaration_list )? ) ^( FUNCTIONS function_declaration_list ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:33:71: ^( TYPES ( type_declaration_list )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_2);
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:33:79: ( type_declaration_list )?
				if ( stream_type_declaration_list.hasNext() ) {
					adaptor.addChild(root_2, stream_type_declaration_list.nextTree());
				}
				stream_type_declaration_list.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:33:103: ^( FUNCTIONS function_declaration_list )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_2);
				adaptor.addChild(root_2, stream_function_declaration_list.nextTree());
				adaptor.addChild(root_1, root_2);
				}

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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:40:1: type_declaration_list : ( ( TYPE ID EQ type SEMI type_declaration_list ) -> ^( TYPE ID ) type type_declaration_list |);
	public final TigerParser.type_declaration_list_return type_declaration_list() throws RecognitionException {
		TigerParser.type_declaration_list_return retval = new TigerParser.type_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE4=null;
		Token ID5=null;
		Token EQ6=null;
		Token SEMI8=null;
		ParserRuleReturnScope type7 =null;
		ParserRuleReturnScope type_declaration_list9 =null;

		Object TYPE4_tree=null;
		Object ID5_tree=null;
		Object EQ6_tree=null;
		Object SEMI8_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_type_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_list");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:41:2: ( ( TYPE ID EQ type SEMI type_declaration_list ) -> ^( TYPE ID ) type type_declaration_list |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TYPE) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF||LA1_0==BEGIN||LA1_0==BREAK||LA1_0==FIXEDPT||LA1_0==FOR||LA1_0==ID||(LA1_0 >= IF && LA1_0 <= INT)||LA1_0==RETURN||LA1_0==VAR||LA1_0==WHILE) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:41:4: ( TYPE ID EQ type SEMI type_declaration_list )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:41:4: ( TYPE ID EQ type SEMI type_declaration_list )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:41:5: TYPE ID EQ type SEMI type_declaration_list
					{
					TYPE4=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_declaration_list158);  
					stream_TYPE.add(TYPE4);

					ID5=(Token)match(input,ID,FOLLOW_ID_in_type_declaration_list160);  
					stream_ID.add(ID5);

					EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_type_declaration_list162);  
					stream_EQ.add(EQ6);

					pushFollow(FOLLOW_type_in_type_declaration_list164);
					type7=type();
					state._fsp--;

					stream_type.add(type7.getTree());
					SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_type_declaration_list166);  
					stream_SEMI.add(SEMI8);

					pushFollow(FOLLOW_type_declaration_list_in_type_declaration_list168);
					type_declaration_list9=type_declaration_list();
					state._fsp--;

					stream_type_declaration_list.add(type_declaration_list9.getTree());
					}

					// AST REWRITE
					// elements: type, TYPE, ID, type_declaration_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 41:49: -> ^( TYPE ID ) type type_declaration_list
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:41:52: ^( TYPE ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

						adaptor.addChild(root_0, stream_type.nextTree());
						adaptor.addChild(root_0, stream_type_declaration_list.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:43:2: 
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
	// $ANTLR end "type_declaration_list"


	public static class function_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_declaration_list"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:45:1: function_declaration_list : ( ( type_id FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) function_declaration_list -> ^( FUNCTION type_id ID ^( PARAMS ( param_list )? ) ) ( function_declaration_list )? |);
	public final TigerParser.function_declaration_list_return function_declaration_list() throws RecognitionException {
		TigerParser.function_declaration_list_return retval = new TigerParser.function_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION11=null;
		Token ID12=null;
		Token LPAREN13=null;
		Token RPAREN15=null;
		Token BEGIN16=null;
		Token END18=null;
		Token SEMI19=null;
		ParserRuleReturnScope type_id10 =null;
		ParserRuleReturnScope param_list14 =null;
		ParserRuleReturnScope block_list17 =null;
		ParserRuleReturnScope function_declaration_list20 =null;

		Object FUNCTION11_tree=null;
		Object ID12_tree=null;
		Object LPAREN13_tree=null;
		Object RPAREN15_tree=null;
		Object BEGIN16_tree=null;
		Object END18_tree=null;
		Object SEMI19_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_block_list=new RewriteRuleSubtreeStream(adaptor,"rule block_list");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:46:2: ( ( type_id FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) function_declaration_list -> ^( FUNCTION type_id ID ^( PARAMS ( param_list )? ) ) ( function_declaration_list )? |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FIXEDPT||LA2_0==ID||LA2_0==INT) ) {
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:46:4: ( type_id FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ) function_declaration_list
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:46:4: ( type_id FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:46:5: type_id FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
					{
					pushFollow(FOLLOW_type_id_in_function_declaration_list196);
					type_id10=type_id();
					state._fsp--;

					stream_type_id.add(type_id10.getTree());
					FUNCTION11=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_declaration_list198);  
					stream_FUNCTION.add(FUNCTION11);

					ID12=(Token)match(input,ID,FOLLOW_ID_in_function_declaration_list200);  
					stream_ID.add(ID12);

					LPAREN13=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_declaration_list202);  
					stream_LPAREN.add(LPAREN13);

					pushFollow(FOLLOW_param_list_in_function_declaration_list204);
					param_list14=param_list();
					state._fsp--;

					stream_param_list.add(param_list14.getTree());
					RPAREN15=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_declaration_list206);  
					stream_RPAREN.add(RPAREN15);

					BEGIN16=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_function_declaration_list208);  
					stream_BEGIN.add(BEGIN16);

					pushFollow(FOLLOW_block_list_in_function_declaration_list210);
					block_list17=block_list();
					state._fsp--;

					stream_block_list.add(block_list17.getTree());
					END18=(Token)match(input,END,FOLLOW_END_in_function_declaration_list212);  
					stream_END.add(END18);

					SEMI19=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_declaration_list214);  
					stream_SEMI.add(SEMI19);

					}

					pushFollow(FOLLOW_function_declaration_list_in_function_declaration_list217);
					function_declaration_list20=function_declaration_list();
					state._fsp--;

					stream_function_declaration_list.add(function_declaration_list20.getTree());
					// AST REWRITE
					// elements: FUNCTION, type_id, ID, param_list, function_declaration_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 46:103: -> ^( FUNCTION type_id ID ^( PARAMS ( param_list )? ) ) ( function_declaration_list )?
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:46:106: ^( FUNCTION type_id ID ^( PARAMS ( param_list )? ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type_id.nextTree());
						adaptor.addChild(root_1, stream_ID.nextNode());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:46:128: ^( PARAMS ( param_list )? )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:46:137: ( param_list )?
						if ( stream_param_list.hasNext() ) {
							adaptor.addChild(root_2, stream_param_list.nextTree());
						}
						stream_param_list.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:46:151: ( function_declaration_list )?
						if ( stream_function_declaration_list.hasNext() ) {
							adaptor.addChild(root_0, stream_function_declaration_list.nextTree());
						}
						stream_function_declaration_list.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:48:2: 
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
	// $ANTLR end "function_declaration_list"


	public static class var_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_declaration_list"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:50:1: var_declaration_list : ( ( VAR id_list COLON type_id optional_init SEMI var_declaration_list ) -> ^( VAR ^( IDS id_list ) type_id ( optional_init )? ) ( var_declaration_list )? |);
	public final TigerParser.var_declaration_list_return var_declaration_list() throws RecognitionException {
		TigerParser.var_declaration_list_return retval = new TigerParser.var_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR21=null;
		Token COLON23=null;
		Token SEMI26=null;
		ParserRuleReturnScope id_list22 =null;
		ParserRuleReturnScope type_id24 =null;
		ParserRuleReturnScope optional_init25 =null;
		ParserRuleReturnScope var_declaration_list27 =null;

		Object VAR21_tree=null;
		Object COLON23_tree=null;
		Object SEMI26_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
		RewriteRuleSubtreeStream stream_var_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration_list");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_optional_init=new RewriteRuleSubtreeStream(adaptor,"rule optional_init");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:51:2: ( ( VAR id_list COLON type_id optional_init SEMI var_declaration_list ) -> ^( VAR ^( IDS id_list ) type_id ( optional_init )? ) ( var_declaration_list )? |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VAR) ) {
				alt3=1;
			}
			else if ( (LA3_0==BEGIN||LA3_0==BREAK||LA3_0==FOR||LA3_0==ID||LA3_0==IF||LA3_0==RETURN||LA3_0==WHILE) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:51:4: ( VAR id_list COLON type_id optional_init SEMI var_declaration_list )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:51:4: ( VAR id_list COLON type_id optional_init SEMI var_declaration_list )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:51:5: VAR id_list COLON type_id optional_init SEMI var_declaration_list
					{
					VAR21=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration_list252);  
					stream_VAR.add(VAR21);

					pushFollow(FOLLOW_id_list_in_var_declaration_list254);
					id_list22=id_list();
					state._fsp--;

					stream_id_list.add(id_list22.getTree());
					COLON23=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration_list256);  
					stream_COLON.add(COLON23);

					pushFollow(FOLLOW_type_id_in_var_declaration_list258);
					type_id24=type_id();
					state._fsp--;

					stream_type_id.add(type_id24.getTree());
					pushFollow(FOLLOW_optional_init_in_var_declaration_list260);
					optional_init25=optional_init();
					state._fsp--;

					stream_optional_init.add(optional_init25.getTree());
					SEMI26=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration_list262);  
					stream_SEMI.add(SEMI26);

					pushFollow(FOLLOW_var_declaration_list_in_var_declaration_list264);
					var_declaration_list27=var_declaration_list();
					state._fsp--;

					stream_var_declaration_list.add(var_declaration_list27.getTree());
					}

					// AST REWRITE
					// elements: var_declaration_list, VAR, id_list, type_id, optional_init
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 51:72: -> ^( VAR ^( IDS id_list ) type_id ( optional_init )? ) ( var_declaration_list )?
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:51:75: ^( VAR ^( IDS id_list ) type_id ( optional_init )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:51:81: ^( IDS id_list )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDS, "IDS"), root_2);
						adaptor.addChild(root_2, stream_id_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_type_id.nextTree());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:51:104: ( optional_init )?
						if ( stream_optional_init.hasNext() ) {
							adaptor.addChild(root_1, stream_optional_init.nextTree());
						}
						stream_optional_init.reset();

						adaptor.addChild(root_0, root_1);
						}

						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:51:120: ( var_declaration_list )?
						if ( stream_var_declaration_list.hasNext() ) {
							adaptor.addChild(root_0, stream_var_declaration_list.nextTree());
						}
						stream_var_declaration_list.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:53:2: 
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
	// $ANTLR end "var_declaration_list"


	public static class param_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:59:1: param_list : ( ID COLON type_id param_list_tail -> ^( ID type_id ) ( param_list_tail )? |);
	public final TigerParser.param_list_return param_list() throws RecognitionException {
		TigerParser.param_list_return retval = new TigerParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID28=null;
		Token COLON29=null;
		ParserRuleReturnScope type_id30 =null;
		ParserRuleReturnScope param_list_tail31 =null;

		Object ID28_tree=null;
		Object COLON29_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_param_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule param_list_tail");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:60:2: ( ID COLON type_id param_list_tail -> ^( ID type_id ) ( param_list_tail )? |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			else if ( (LA4_0==RPAREN) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:60:4: ID COLON type_id param_list_tail
					{
					ID28=(Token)match(input,ID,FOLLOW_ID_in_param_list303);  
					stream_ID.add(ID28);

					COLON29=(Token)match(input,COLON,FOLLOW_COLON_in_param_list305);  
					stream_COLON.add(COLON29);

					pushFollow(FOLLOW_type_id_in_param_list307);
					type_id30=type_id();
					state._fsp--;

					stream_type_id.add(type_id30.getTree());
					pushFollow(FOLLOW_param_list_tail_in_param_list309);
					param_list_tail31=param_list_tail();
					state._fsp--;

					stream_param_list_tail.add(param_list_tail31.getTree());
					// AST REWRITE
					// elements: ID, param_list_tail, type_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 60:38: -> ^( ID type_id ) ( param_list_tail )?
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:60:41: ^( ID type_id )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type_id.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:60:55: ( param_list_tail )?
						if ( stream_param_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_param_list_tail.nextTree());
						}
						stream_param_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:62:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:64:1: param_list_tail : ( COMMA param_list -> param_list |);
	public final TigerParser.param_list_tail_return param_list_tail() throws RecognitionException {
		TigerParser.param_list_tail_return retval = new TigerParser.param_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA32=null;
		ParserRuleReturnScope param_list33 =null;

		Object COMMA32_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:65:2: ( COMMA param_list -> param_list |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==COMMA) ) {
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:65:4: COMMA param_list
					{
					COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list_tail337);  
					stream_COMMA.add(COMMA32);

					pushFollow(FOLLOW_param_list_in_param_list_tail339);
					param_list33=param_list();
					state._fsp--;

					stream_param_list.add(param_list33.getTree());
					// AST REWRITE
					// elements: param_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:21: -> param_list
					{
						adaptor.addChild(root_0, stream_param_list.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:67:2: 
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


	public static class block_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_list"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:69:1: block_list : block block_tail ;
	public final TigerParser.block_list_return block_list() throws RecognitionException {
		TigerParser.block_list_return retval = new TigerParser.block_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block34 =null;
		ParserRuleReturnScope block_tail35 =null;


		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:70:2: ( block block_tail )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:70:4: block block_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_block_list359);
			block34=block();
			state._fsp--;

			adaptor.addChild(root_0, block34.getTree());

			pushFollow(FOLLOW_block_tail_in_block_list361);
			block_tail35=block_tail();
			state._fsp--;

			adaptor.addChild(root_0, block_tail35.getTree());

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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:73:1: block_tail : ( block block_tail |);
	public final TigerParser.block_tail_return block_tail() throws RecognitionException {
		TigerParser.block_tail_return retval = new TigerParser.block_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block36 =null;
		ParserRuleReturnScope block_tail37 =null;


		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:74:2: ( block block_tail |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BEGIN) ) {
				alt6=1;
			}
			else if ( (LA6_0==END) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:74:4: block block_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_block_tail372);
					block36=block();
					state._fsp--;

					adaptor.addChild(root_0, block36.getTree());

					pushFollow(FOLLOW_block_tail_in_block_tail374);
					block_tail37=block_tail();
					state._fsp--;

					adaptor.addChild(root_0, block_tail37.getTree());

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:76:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:78:1: block : ( BEGIN type_declaration_list var_declaration_list stat_seq END SEMI ) -> ^( BLOCK ^( TYPES ( type_declaration_list )? ) ^( VARS ( var_declaration_list )? ) stat_seq ) ;
	public final TigerParser.block_return block() throws RecognitionException {
		TigerParser.block_return retval = new TigerParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN38=null;
		Token END42=null;
		Token SEMI43=null;
		ParserRuleReturnScope type_declaration_list39 =null;
		ParserRuleReturnScope var_declaration_list40 =null;
		ParserRuleReturnScope stat_seq41 =null;

		Object BEGIN38_tree=null;
		Object END42_tree=null;
		Object SEMI43_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_var_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration_list");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_type_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_list");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:2: ( ( BEGIN type_declaration_list var_declaration_list stat_seq END SEMI ) -> ^( BLOCK ^( TYPES ( type_declaration_list )? ) ^( VARS ( var_declaration_list )? ) stat_seq ) )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:4: ( BEGIN type_declaration_list var_declaration_list stat_seq END SEMI )
			{
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:4: ( BEGIN type_declaration_list var_declaration_list stat_seq END SEMI )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:5: BEGIN type_declaration_list var_declaration_list stat_seq END SEMI
			{
			BEGIN38=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block390);  
			stream_BEGIN.add(BEGIN38);

			pushFollow(FOLLOW_type_declaration_list_in_block392);
			type_declaration_list39=type_declaration_list();
			state._fsp--;

			stream_type_declaration_list.add(type_declaration_list39.getTree());
			pushFollow(FOLLOW_var_declaration_list_in_block394);
			var_declaration_list40=var_declaration_list();
			state._fsp--;

			stream_var_declaration_list.add(var_declaration_list40.getTree());
			pushFollow(FOLLOW_stat_seq_in_block396);
			stat_seq41=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq41.getTree());
			END42=(Token)match(input,END,FOLLOW_END_in_block398);  
			stream_END.add(END42);

			SEMI43=(Token)match(input,SEMI,FOLLOW_SEMI_in_block400);  
			stream_SEMI.add(SEMI43);

			}

			// AST REWRITE
			// elements: var_declaration_list, stat_seq, type_declaration_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:73: -> ^( BLOCK ^( TYPES ( type_declaration_list )? ) ^( VARS ( var_declaration_list )? ) stat_seq )
			{
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:76: ^( BLOCK ^( TYPES ( type_declaration_list )? ) ^( VARS ( var_declaration_list )? ) stat_seq )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:84: ^( TYPES ( type_declaration_list )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_2);
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:92: ( type_declaration_list )?
				if ( stream_type_declaration_list.hasNext() ) {
					adaptor.addChild(root_2, stream_type_declaration_list.nextTree());
				}
				stream_type_declaration_list.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:116: ^( VARS ( var_declaration_list )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_2);
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:79:123: ( var_declaration_list )?
				if ( stream_var_declaration_list.hasNext() ) {
					adaptor.addChild(root_2, stream_var_declaration_list.nextTree());
				}
				stream_var_declaration_list.reset();

				adaptor.addChild(root_1, root_2);
				}

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


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:82:1: type : ( base_type | ( ARRAY array_dimensions OF base_type ) -> ^( ARRAY array_dimensions base_type ) );
	public final TigerParser.type_return type() throws RecognitionException {
		TigerParser.type_return retval = new TigerParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ARRAY45=null;
		Token OF47=null;
		ParserRuleReturnScope base_type44 =null;
		ParserRuleReturnScope array_dimensions46 =null;
		ParserRuleReturnScope base_type48 =null;

		Object ARRAY45_tree=null;
		Object OF47_tree=null;
		RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
		RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
		RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
		RewriteRuleSubtreeStream stream_array_dimensions=new RewriteRuleSubtreeStream(adaptor,"rule array_dimensions");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:83:2: ( base_type | ( ARRAY array_dimensions OF base_type ) -> ^( ARRAY array_dimensions base_type ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==FIXEDPT||LA7_0==INT) ) {
				alt7=1;
			}
			else if ( (LA7_0==ARRAY) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:83:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type434);
					base_type44=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type44.getTree());

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:84:4: ( ARRAY array_dimensions OF base_type )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:84:4: ( ARRAY array_dimensions OF base_type )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:84:5: ARRAY array_dimensions OF base_type
					{
					ARRAY45=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type440);  
					stream_ARRAY.add(ARRAY45);

					pushFollow(FOLLOW_array_dimensions_in_type442);
					array_dimensions46=array_dimensions();
					state._fsp--;

					stream_array_dimensions.add(array_dimensions46.getTree());
					OF47=(Token)match(input,OF,FOLLOW_OF_in_type444);  
					stream_OF.add(OF47);

					pushFollow(FOLLOW_base_type_in_type446);
					base_type48=base_type();
					state._fsp--;

					stream_base_type.add(base_type48.getTree());
					}

					// AST REWRITE
					// elements: ARRAY, base_type, array_dimensions
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:42: -> ^( ARRAY array_dimensions base_type )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:84:45: ^( ARRAY array_dimensions base_type )
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:87:1: type_id : ( base_type | ID );
	public final TigerParser.type_id_return type_id() throws RecognitionException {
		TigerParser.type_id_return retval = new TigerParser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID50=null;
		ParserRuleReturnScope base_type49 =null;

		Object ID50_tree=null;

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:88:2: ( base_type | ID )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==FIXEDPT||LA8_0==INT) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:88:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type_id468);
					base_type49=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type49.getTree());

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:89:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID50=(Token)match(input,ID,FOLLOW_ID_in_type_id473); 
					ID50_tree = (Object)adaptor.create(ID50);
					adaptor.addChild(root_0, ID50_tree);

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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:92:1: base_type : ( INT | FIXEDPT );
	public final TigerParser.base_type_return base_type() throws RecognitionException {
		TigerParser.base_type_return retval = new TigerParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set51=null;

		Object set51_tree=null;

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:93:2: ( INT | FIXEDPT )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set51=input.LT(1);
			if ( input.LA(1)==FIXEDPT||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set51));
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:97:1: var_declaration : ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id ( optional_init )? ) ;
	public final TigerParser.var_declaration_return var_declaration() throws RecognitionException {
		TigerParser.var_declaration_return retval = new TigerParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR52=null;
		Token COLON54=null;
		Token SEMI57=null;
		ParserRuleReturnScope id_list53 =null;
		ParserRuleReturnScope type_id55 =null;
		ParserRuleReturnScope optional_init56 =null;

		Object VAR52_tree=null;
		Object COLON54_tree=null;
		Object SEMI57_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_optional_init=new RewriteRuleSubtreeStream(adaptor,"rule optional_init");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:98:2: ( ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id ( optional_init )? ) )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:98:4: ( VAR id_list COLON type_id optional_init SEMI )
			{
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:98:4: ( VAR id_list COLON type_id optional_init SEMI )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:98:5: VAR id_list COLON type_id optional_init SEMI
			{
			VAR52=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration501);  
			stream_VAR.add(VAR52);

			pushFollow(FOLLOW_id_list_in_var_declaration503);
			id_list53=id_list();
			state._fsp--;

			stream_id_list.add(id_list53.getTree());
			COLON54=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration505);  
			stream_COLON.add(COLON54);

			pushFollow(FOLLOW_type_id_in_var_declaration507);
			type_id55=type_id();
			state._fsp--;

			stream_type_id.add(type_id55.getTree());
			pushFollow(FOLLOW_optional_init_in_var_declaration509);
			optional_init56=optional_init();
			state._fsp--;

			stream_optional_init.add(optional_init56.getTree());
			SEMI57=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration511);  
			stream_SEMI.add(SEMI57);

			}

			// AST REWRITE
			// elements: id_list, VAR, optional_init, type_id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 98:51: -> ^( VAR id_list type_id ( optional_init )? )
			{
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:98:54: ^( VAR id_list type_id ( optional_init )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id_list.nextTree());
				adaptor.addChild(root_1, stream_type_id.nextTree());
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:98:76: ( optional_init )?
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:101:1: optional_init : ( ASSIGN constant -> constant |);
	public final TigerParser.optional_init_return optional_init() throws RecognitionException {
		TigerParser.optional_init_return retval = new TigerParser.optional_init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN58=null;
		ParserRuleReturnScope constant59 =null;

		Object ASSIGN58_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:102:2: ( ASSIGN constant -> constant |)
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ASSIGN) ) {
				alt9=1;
			}
			else if ( (LA9_0==SEMI) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:102:4: ASSIGN constant
					{
					ASSIGN58=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init536);  
					stream_ASSIGN.add(ASSIGN58);

					pushFollow(FOLLOW_constant_in_optional_init538);
					constant59=constant();
					state._fsp--;

					stream_constant.add(constant59.getTree());
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
					// 102:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:104:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:106:1: id_list : ID id_list_tail ;
	public final TigerParser.id_list_return id_list() throws RecognitionException {
		TigerParser.id_list_return retval = new TigerParser.id_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID60=null;
		ParserRuleReturnScope id_list_tail61 =null;

		Object ID60_tree=null;

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:107:2: ( ID id_list_tail )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:107:4: ID id_list_tail
			{
			root_0 = (Object)adaptor.nil();


			ID60=(Token)match(input,ID,FOLLOW_ID_in_id_list557); 
			ID60_tree = (Object)adaptor.create(ID60);
			adaptor.addChild(root_0, ID60_tree);

			pushFollow(FOLLOW_id_list_tail_in_id_list559);
			id_list_tail61=id_list_tail();
			state._fsp--;

			adaptor.addChild(root_0, id_list_tail61.getTree());

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


	public static class id_list_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id_list_tail"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:110:1: id_list_tail : ( COMMA ID id_list_tail -> ID ( id_list_tail )? |);
	public final TigerParser.id_list_tail_return id_list_tail() throws RecognitionException {
		TigerParser.id_list_tail_return retval = new TigerParser.id_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA62=null;
		Token ID63=null;
		ParserRuleReturnScope id_list_tail64 =null;

		Object COMMA62_tree=null;
		Object ID63_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_id_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule id_list_tail");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:111:2: ( COMMA ID id_list_tail -> ID ( id_list_tail )? |)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==COMMA) ) {
				alt10=1;
			}
			else if ( (LA10_0==COLON) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:111:4: COMMA ID id_list_tail
					{
					COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list_tail570);  
					stream_COMMA.add(COMMA62);

					ID63=(Token)match(input,ID,FOLLOW_ID_in_id_list_tail572);  
					stream_ID.add(ID63);

					pushFollow(FOLLOW_id_list_tail_in_id_list_tail574);
					id_list_tail64=id_list_tail();
					state._fsp--;

					stream_id_list_tail.add(id_list_tail64.getTree());
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
					// 111:26: -> ID ( id_list_tail )?
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:111:32: ( id_list_tail )?
						if ( stream_id_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_id_list_tail.nextTree());
						}
						stream_id_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:113:2: 
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


	public static class expr_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:119:1: expr_list : ( expr expr_list_tail -> ^( EXPRS expr ( expr_list_tail )? ) |);
	public final TigerParser.expr_list_return expr_list() throws RecognitionException {
		TigerParser.expr_list_return retval = new TigerParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr65 =null;
		ParserRuleReturnScope expr_list_tail66 =null;

		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:120:2: ( expr expr_list_tail -> ^( EXPRS expr ( expr_list_tail )? ) |)
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==FIXEDPTLIT||LA11_0==ID||LA11_0==INTLIT||LA11_0==LPAREN) ) {
				alt11=1;
			}
			else if ( (LA11_0==RPAREN) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:120:4: expr expr_list_tail
					{
					pushFollow(FOLLOW_expr_in_expr_list599);
					expr65=expr();
					state._fsp--;

					stream_expr.add(expr65.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list601);
					expr_list_tail66=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail66.getTree());
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
					// 120:24: -> ^( EXPRS expr ( expr_list_tail )? )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:120:27: ^( EXPRS expr ( expr_list_tail )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:120:40: ( expr_list_tail )?
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:122:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:124:1: expr_list_tail : ( ( COMMA expr expr_list_tail ) -> expr ( expr_list_tail )? |);
	public final TigerParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
		TigerParser.expr_list_tail_return retval = new TigerParser.expr_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA67=null;
		ParserRuleReturnScope expr68 =null;
		ParserRuleReturnScope expr_list_tail69 =null;

		Object COMMA67_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:125:2: ( ( COMMA expr expr_list_tail ) -> expr ( expr_list_tail )? |)
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==COMMA) ) {
				alt12=1;
			}
			else if ( (LA12_0==RPAREN) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:125:4: ( COMMA expr expr_list_tail )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:125:4: ( COMMA expr expr_list_tail )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:125:5: COMMA expr expr_list_tail
					{
					COMMA67=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail629);  
					stream_COMMA.add(COMMA67);

					pushFollow(FOLLOW_expr_in_expr_list_tail631);
					expr68=expr();
					state._fsp--;

					stream_expr.add(expr68.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail633);
					expr_list_tail69=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail69.getTree());
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
					// 125:32: -> expr ( expr_list_tail )?
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:125:40: ( expr_list_tail )?
						if ( stream_expr_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_expr_list_tail.nextTree());
						}
						stream_expr_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:127:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:129:1: expr : expr_head expr_tail ;
	public final TigerParser.expr_return expr() throws RecognitionException {
		TigerParser.expr_return retval = new TigerParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_head70 =null;
		ParserRuleReturnScope expr_tail71 =null;


		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:130:2: ( expr_head expr_tail )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:130:4: expr_head expr_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_head_in_expr656);
			expr_head70=expr_head();
			state._fsp--;

			adaptor.addChild(root_0, expr_head70.getTree());

			pushFollow(FOLLOW_expr_tail_in_expr658);
			expr_tail71=expr_tail();
			state._fsp--;

			adaptor.addChild(root_0, expr_tail71.getTree());

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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:133:1: expr_tail : ( ( binary_operator expr ) -> ^( binary_operator expr ) |);
	public final TigerParser.expr_tail_return expr_tail() throws RecognitionException {
		TigerParser.expr_tail_return retval = new TigerParser.expr_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope binary_operator72 =null;
		ParserRuleReturnScope expr73 =null;

		RewriteRuleSubtreeStream stream_binary_operator=new RewriteRuleSubtreeStream(adaptor,"rule binary_operator");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:134:2: ( ( binary_operator expr ) -> ^( binary_operator expr ) |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==AND||LA13_0==DIV||LA13_0==EQ||(LA13_0 >= GEQ && LA13_0 <= GREATER)||(LA13_0 >= LEQ && LA13_0 <= LESSER)||(LA13_0 >= MINUS && LA13_0 <= NEQ)||LA13_0==OR||LA13_0==PLUS) ) {
				alt13=1;
			}
			else if ( (LA13_0==COMMA||LA13_0==DO||(LA13_0 >= RPAREN && LA13_0 <= SEMI)||LA13_0==THEN) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:134:4: ( binary_operator expr )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:134:4: ( binary_operator expr )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:134:5: binary_operator expr
					{
					pushFollow(FOLLOW_binary_operator_in_expr_tail670);
					binary_operator72=binary_operator();
					state._fsp--;

					stream_binary_operator.add(binary_operator72.getTree());
					pushFollow(FOLLOW_expr_in_expr_tail672);
					expr73=expr();
					state._fsp--;

					stream_expr.add(expr73.getTree());
					}

					// AST REWRITE
					// elements: expr, binary_operator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:27: -> ^( binary_operator expr )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:134:30: ^( binary_operator expr )
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:136:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:138:1: expr_head : ( expr_head_base | ( ID optional_subscript ) -> ^( REFERENCE ID ( optional_subscript )? ) );
	public final TigerParser.expr_head_return expr_head() throws RecognitionException {
		TigerParser.expr_head_return retval = new TigerParser.expr_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID75=null;
		ParserRuleReturnScope expr_head_base74 =null;
		ParserRuleReturnScope optional_subscript76 =null;

		Object ID75_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_optional_subscript=new RewriteRuleSubtreeStream(adaptor,"rule optional_subscript");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:139:2: ( expr_head_base | ( ID optional_subscript ) -> ^( REFERENCE ID ( optional_subscript )? ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==FIXEDPTLIT||LA14_0==INTLIT||LA14_0==LPAREN) ) {
				alt14=1;
			}
			else if ( (LA14_0==ID) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:139:4: expr_head_base
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_head_base_in_expr_head696);
					expr_head_base74=expr_head_base();
					state._fsp--;

					adaptor.addChild(root_0, expr_head_base74.getTree());

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:140:4: ( ID optional_subscript )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:140:4: ( ID optional_subscript )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:140:5: ID optional_subscript
					{
					ID75=(Token)match(input,ID,FOLLOW_ID_in_expr_head702);  
					stream_ID.add(ID75);

					pushFollow(FOLLOW_optional_subscript_in_expr_head704);
					optional_subscript76=optional_subscript();
					state._fsp--;

					stream_optional_subscript.add(optional_subscript76.getTree());
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
					// 140:28: -> ^( REFERENCE ID ( optional_subscript )? )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:140:31: ^( REFERENCE ID ( optional_subscript )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:140:46: ( optional_subscript )?
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:143:1: expr_head_base : ( constant | ( LPAREN expr RPAREN ) -> expr );
	public final TigerParser.expr_head_base_return expr_head_base() throws RecognitionException {
		TigerParser.expr_head_base_return retval = new TigerParser.expr_head_base_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN78=null;
		Token RPAREN80=null;
		ParserRuleReturnScope constant77 =null;
		ParserRuleReturnScope expr79 =null;

		Object LPAREN78_tree=null;
		Object RPAREN80_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:144:2: ( constant | ( LPAREN expr RPAREN ) -> expr )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==FIXEDPTLIT||LA15_0==INTLIT) ) {
				alt15=1;
			}
			else if ( (LA15_0==LPAREN) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:144:4: constant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_in_expr_head_base727);
					constant77=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant77.getTree());

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:145:4: ( LPAREN expr RPAREN )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:145:4: ( LPAREN expr RPAREN )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:145:5: LPAREN expr RPAREN
					{
					LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_head_base733);  
					stream_LPAREN.add(LPAREN78);

					pushFollow(FOLLOW_expr_in_expr_head_base735);
					expr79=expr();
					state._fsp--;

					stream_expr.add(expr79.getTree());
					RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_head_base737);  
					stream_RPAREN.add(RPAREN80);

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
					// 145:25: -> expr
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:152:1: stat_seq : stat stat_tail -> ^( STATEMENTS stat ( stat_tail )? ) ;
	public final TigerParser.stat_seq_return stat_seq() throws RecognitionException {
		TigerParser.stat_seq_return retval = new TigerParser.stat_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat81 =null;
		ParserRuleReturnScope stat_tail82 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:153:2: ( stat stat_tail -> ^( STATEMENTS stat ( stat_tail )? ) )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:153:4: stat stat_tail
			{
			pushFollow(FOLLOW_stat_in_stat_seq757);
			stat81=stat();
			state._fsp--;

			stream_stat.add(stat81.getTree());
			pushFollow(FOLLOW_stat_tail_in_stat_seq759);
			stat_tail82=stat_tail();
			state._fsp--;

			stream_stat_tail.add(stat_tail82.getTree());
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
			// 153:19: -> ^( STATEMENTS stat ( stat_tail )? )
			{
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:153:22: ^( STATEMENTS stat ( stat_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);
				adaptor.addChild(root_1, stream_stat.nextTree());
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:153:40: ( stat_tail )?
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:156:1: stat_tail : ( stat stat_tail -> stat ( stat_tail )? |);
	public final TigerParser.stat_tail_return stat_tail() throws RecognitionException {
		TigerParser.stat_tail_return retval = new TigerParser.stat_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat83 =null;
		ParserRuleReturnScope stat_tail84 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:157:2: ( stat stat_tail -> stat ( stat_tail )? |)
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BEGIN||LA16_0==BREAK||LA16_0==FOR||LA16_0==ID||LA16_0==IF||LA16_0==RETURN||LA16_0==WHILE) ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= ELSE && LA16_0 <= ENDIF)) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:157:4: stat stat_tail
					{
					pushFollow(FOLLOW_stat_in_stat_tail781);
					stat83=stat();
					state._fsp--;

					stream_stat.add(stat83.getTree());
					pushFollow(FOLLOW_stat_tail_in_stat_tail783);
					stat_tail84=stat_tail();
					state._fsp--;

					stream_stat_tail.add(stat_tail84.getTree());
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
					// 157:19: -> stat ( stat_tail )?
					{
						adaptor.addChild(root_0, stream_stat.nextTree());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:157:27: ( stat_tail )?
						if ( stream_stat_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_stat_tail.nextTree());
						}
						stream_stat_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:159:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:161:1: stat : ( if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment ) ) SEMI );
	public final TigerParser.stat_return stat() throws RecognitionException {
		TigerParser.stat_return retval = new TigerParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE86=null;
		Token DO88=null;
		Token ENDDO90=null;
		Token SEMI91=null;
		Token FOR92=null;
		Token ID93=null;
		Token ASSIGN94=null;
		Token DO96=null;
		Token ENDDO98=null;
		Token SEMI99=null;
		Token BREAK100=null;
		Token SEMI101=null;
		Token RETURN102=null;
		Token SEMI104=null;
		Token ID106=null;
		Token LPAREN107=null;
		Token RPAREN109=null;
		Token ASSIGN111=null;
		Token SEMI113=null;
		ParserRuleReturnScope if_stmt85 =null;
		ParserRuleReturnScope expr87 =null;
		ParserRuleReturnScope stat_seq89 =null;
		ParserRuleReturnScope range95 =null;
		ParserRuleReturnScope stat_seq97 =null;
		ParserRuleReturnScope expr103 =null;
		ParserRuleReturnScope block105 =null;
		ParserRuleReturnScope expr_list108 =null;
		ParserRuleReturnScope optional_subscript110 =null;
		ParserRuleReturnScope statement_assignment112 =null;

		Object WHILE86_tree=null;
		Object DO88_tree=null;
		Object ENDDO90_tree=null;
		Object SEMI91_tree=null;
		Object FOR92_tree=null;
		Object ID93_tree=null;
		Object ASSIGN94_tree=null;
		Object DO96_tree=null;
		Object ENDDO98_tree=null;
		Object SEMI99_tree=null;
		Object BREAK100_tree=null;
		Object SEMI101_tree=null;
		Object RETURN102_tree=null;
		Object SEMI104_tree=null;
		Object ID106_tree=null;
		Object LPAREN107_tree=null;
		Object RPAREN109_tree=null;
		Object ASSIGN111_tree=null;
		Object SEMI113_tree=null;
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:162:2: ( if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment ) ) SEMI )
			int alt18=7;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt18=1;
				}
				break;
			case WHILE:
				{
				alt18=2;
				}
				break;
			case FOR:
				{
				alt18=3;
				}
				break;
			case BREAK:
				{
				alt18=4;
				}
				break;
			case RETURN:
				{
				alt18=5;
				}
				break;
			case BEGIN:
				{
				alt18=6;
				}
				break;
			case ID:
				{
				alt18=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:162:4: if_stmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmt_in_stat804);
					if_stmt85=if_stmt();
					state._fsp--;

					adaptor.addChild(root_0, if_stmt85.getTree());

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:163:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:163:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:163:5: WHILE expr DO stat_seq ENDDO SEMI
					{
					WHILE86=(Token)match(input,WHILE,FOLLOW_WHILE_in_stat810);  
					stream_WHILE.add(WHILE86);

					pushFollow(FOLLOW_expr_in_stat812);
					expr87=expr();
					state._fsp--;

					stream_expr.add(expr87.getTree());
					DO88=(Token)match(input,DO,FOLLOW_DO_in_stat814);  
					stream_DO.add(DO88);

					pushFollow(FOLLOW_stat_seq_in_stat816);
					stat_seq89=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq89.getTree());
					ENDDO90=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat818);  
					stream_ENDDO.add(ENDDO90);

					SEMI91=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat820);  
					stream_SEMI.add(SEMI91);

					}

					// AST REWRITE
					// elements: stat_seq, WHILE, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 163:40: -> ^( WHILE expr stat_seq )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:163:43: ^( WHILE expr stat_seq )
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:164:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:164:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:164:5: FOR ID ASSIGN range DO stat_seq ENDDO SEMI
					{
					FOR92=(Token)match(input,FOR,FOLLOW_FOR_in_stat837);  
					stream_FOR.add(FOR92);

					ID93=(Token)match(input,ID,FOLLOW_ID_in_stat839);  
					stream_ID.add(ID93);

					ASSIGN94=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat841);  
					stream_ASSIGN.add(ASSIGN94);

					pushFollow(FOLLOW_range_in_stat843);
					range95=range();
					state._fsp--;

					stream_range.add(range95.getTree());
					DO96=(Token)match(input,DO,FOLLOW_DO_in_stat845);  
					stream_DO.add(DO96);

					pushFollow(FOLLOW_stat_seq_in_stat847);
					stat_seq97=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq97.getTree());
					ENDDO98=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat849);  
					stream_ENDDO.add(ENDDO98);

					SEMI99=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat851);  
					stream_SEMI.add(SEMI99);

					}

					// AST REWRITE
					// elements: FOR, stat_seq, range
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 164:49: -> ^( FOR range stat_seq )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:164:52: ^( FOR range stat_seq )
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:165:4: BREAK SEMI
					{
					BREAK100=(Token)match(input,BREAK,FOLLOW_BREAK_in_stat867);  
					stream_BREAK.add(BREAK100);

					SEMI101=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat869);  
					stream_SEMI.add(SEMI101);

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
					// 165:15: -> BREAK
					{
						adaptor.addChild(root_0, stream_BREAK.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:166:4: RETURN expr SEMI
					{
					RETURN102=(Token)match(input,RETURN,FOLLOW_RETURN_in_stat878);  
					stream_RETURN.add(RETURN102);

					pushFollow(FOLLOW_expr_in_stat880);
					expr103=expr();
					state._fsp--;

					stream_expr.add(expr103.getTree());
					SEMI104=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat882);  
					stream_SEMI.add(SEMI104);

					// AST REWRITE
					// elements: RETURN, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 166:21: -> ^( RETURN expr )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:166:24: ^( RETURN expr )
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:167:4: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat895);
					block105=block();
					state._fsp--;

					adaptor.addChild(root_0, block105.getTree());

					}
					break;
				case 7 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:168:4: ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment ) ) SEMI
					{
					ID106=(Token)match(input,ID,FOLLOW_ID_in_stat900);  
					stream_ID.add(ID106);

					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:168:8: ( LPAREN expr_list RPAREN -> ^( INVOKE ID ( expr_list )? ) | optional_subscript ASSIGN statement_assignment -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment ) )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==LPAREN) ) {
						alt17=1;
					}
					else if ( (LA17_0==AND||LA17_0==ASSIGN||LA17_0==COMMA||(LA17_0 >= DIV && LA17_0 <= DO)||LA17_0==EQ||(LA17_0 >= GEQ && LA17_0 <= GREATER)||(LA17_0 >= LBRACK && LA17_0 <= LESSER)||(LA17_0 >= MINUS && LA17_0 <= NEQ)||LA17_0==OR||LA17_0==PLUS||(LA17_0 >= RPAREN && LA17_0 <= SEMI)||LA17_0==THEN) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:169:6: LPAREN expr_list RPAREN
							{
							LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stat911);  
							stream_LPAREN.add(LPAREN107);

							pushFollow(FOLLOW_expr_list_in_stat913);
							expr_list108=expr_list();
							state._fsp--;

							stream_expr_list.add(expr_list108.getTree());
							RPAREN109=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stat915);  
							stream_RPAREN.add(RPAREN109);

							// AST REWRITE
							// elements: expr_list, ID
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 169:36: -> ^( INVOKE ID ( expr_list )? )
							{
								// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:169:39: ^( INVOKE ID ( expr_list )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INVOKE, "INVOKE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:169:51: ( expr_list )?
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
							// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:170:6: optional_subscript ASSIGN statement_assignment
							{
							pushFollow(FOLLOW_optional_subscript_in_stat939);
							optional_subscript110=optional_subscript();
							state._fsp--;

							stream_optional_subscript.add(optional_subscript110.getTree());
							ASSIGN111=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat941);  
							stream_ASSIGN.add(ASSIGN111);

							pushFollow(FOLLOW_statement_assignment_in_stat943);
							statement_assignment112=statement_assignment();
							state._fsp--;

							stream_statement_assignment.add(statement_assignment112.getTree());
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
							// 170:54: -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment )
							{
								// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:170:57: ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) statement_assignment )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
								// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:170:66: ^( REFERENCE ID ( optional_subscript )? )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_2);
								adaptor.addChild(root_2, stream_ID.nextNode());
								// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:170:81: ( optional_subscript )?
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

					SEMI113=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat968);  
					stream_SEMI.add(SEMI113);

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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:174:1: optional_subscript : ( array_subscripts |);
	public final TigerParser.optional_subscript_return optional_subscript() throws RecognitionException {
		TigerParser.optional_subscript_return retval = new TigerParser.optional_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_subscripts114 =null;


		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:175:2: ( array_subscripts |)
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==LBRACK) ) {
				alt19=1;
			}
			else if ( (LA19_0==AND||LA19_0==ASSIGN||LA19_0==COMMA||(LA19_0 >= DIV && LA19_0 <= DO)||LA19_0==EQ||(LA19_0 >= GEQ && LA19_0 <= GREATER)||(LA19_0 >= LEQ && LA19_0 <= LESSER)||(LA19_0 >= MINUS && LA19_0 <= NEQ)||LA19_0==OR||LA19_0==PLUS||(LA19_0 >= RPAREN && LA19_0 <= SEMI)||LA19_0==THEN) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:175:4: array_subscripts
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_subscripts_in_optional_subscript979);
					array_subscripts114=array_subscripts();
					state._fsp--;

					adaptor.addChild(root_0, array_subscripts114.getTree());

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:177:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:179:1: range : (start= index_expr TO stop= index_expr ) -> $start $stop;
	public final TigerParser.range_return range() throws RecognitionException {
		TigerParser.range_return retval = new TigerParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO115=null;
		ParserRuleReturnScope start =null;
		ParserRuleReturnScope stop =null;

		Object TO115_tree=null;
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:180:2: ( (start= index_expr TO stop= index_expr ) -> $start $stop)
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:180:4: (start= index_expr TO stop= index_expr )
			{
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:180:4: (start= index_expr TO stop= index_expr )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:180:5: start= index_expr TO stop= index_expr
			{
			pushFollow(FOLLOW_index_expr_in_range997);
			start=index_expr();
			state._fsp--;

			stream_index_expr.add(start.getTree());
			TO115=(Token)match(input,TO,FOLLOW_TO_in_range999);  
			stream_TO.add(TO115);

			pushFollow(FOLLOW_index_expr_in_range1003);
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
			// 180:42: -> $start $stop
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:183:1: statement_assignment : ( ( ID statement_assignment_id ) -> ^( EXPR ID ( statement_assignment_id )? ) | ( expr_head_base expr_tail ) -> ^( EXPR expr_head_base ( expr_tail )? ) );
	public final TigerParser.statement_assignment_return statement_assignment() throws RecognitionException {
		TigerParser.statement_assignment_return retval = new TigerParser.statement_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID116=null;
		ParserRuleReturnScope statement_assignment_id117 =null;
		ParserRuleReturnScope expr_head_base118 =null;
		ParserRuleReturnScope expr_tail119 =null;

		Object ID116_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_statement_assignment_id=new RewriteRuleSubtreeStream(adaptor,"rule statement_assignment_id");
		RewriteRuleSubtreeStream stream_expr_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_tail");
		RewriteRuleSubtreeStream stream_expr_head_base=new RewriteRuleSubtreeStream(adaptor,"rule expr_head_base");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:184:2: ( ( ID statement_assignment_id ) -> ^( EXPR ID ( statement_assignment_id )? ) | ( expr_head_base expr_tail ) -> ^( EXPR expr_head_base ( expr_tail )? ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ID) ) {
				alt20=1;
			}
			else if ( (LA20_0==FIXEDPTLIT||LA20_0==INTLIT||LA20_0==LPAREN) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:184:4: ( ID statement_assignment_id )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:184:4: ( ID statement_assignment_id )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:184:5: ID statement_assignment_id
					{
					ID116=(Token)match(input,ID,FOLLOW_ID_in_statement_assignment1024);  
					stream_ID.add(ID116);

					pushFollow(FOLLOW_statement_assignment_id_in_statement_assignment1026);
					statement_assignment_id117=statement_assignment_id();
					state._fsp--;

					stream_statement_assignment_id.add(statement_assignment_id117.getTree());
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
					// 184:33: -> ^( EXPR ID ( statement_assignment_id )? )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:184:36: ^( EXPR ID ( statement_assignment_id )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:184:46: ( statement_assignment_id )?
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:185:4: ( expr_head_base expr_tail )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:185:4: ( expr_head_base expr_tail )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:185:5: expr_head_base expr_tail
					{
					pushFollow(FOLLOW_expr_head_base_in_statement_assignment1044);
					expr_head_base118=expr_head_base();
					state._fsp--;

					stream_expr_head_base.add(expr_head_base118.getTree());
					pushFollow(FOLLOW_expr_tail_in_statement_assignment1046);
					expr_tail119=expr_tail();
					state._fsp--;

					stream_expr_tail.add(expr_tail119.getTree());
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
					// 185:31: -> ^( EXPR expr_head_base ( expr_tail )? )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:185:34: ^( EXPR expr_head_base ( expr_tail )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
						adaptor.addChild(root_1, stream_expr_head_base.nextTree());
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:185:56: ( expr_tail )?
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:188:1: statement_assignment_id : ( ( LPAREN expr_list RPAREN ) -> ( expr_list )? | optional_subscript expr_tail );
	public final TigerParser.statement_assignment_id_return statement_assignment_id() throws RecognitionException {
		TigerParser.statement_assignment_id_return retval = new TigerParser.statement_assignment_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN120=null;
		Token RPAREN122=null;
		ParserRuleReturnScope expr_list121 =null;
		ParserRuleReturnScope optional_subscript123 =null;
		ParserRuleReturnScope expr_tail124 =null;

		Object LPAREN120_tree=null;
		Object RPAREN122_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:189:2: ( ( LPAREN expr_list RPAREN ) -> ( expr_list )? | optional_subscript expr_tail )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LPAREN) ) {
				alt21=1;
			}
			else if ( (LA21_0==AND||LA21_0==ASSIGN||LA21_0==COMMA||(LA21_0 >= DIV && LA21_0 <= DO)||LA21_0==EQ||(LA21_0 >= GEQ && LA21_0 <= GREATER)||(LA21_0 >= LBRACK && LA21_0 <= LESSER)||(LA21_0 >= MINUS && LA21_0 <= NEQ)||LA21_0==OR||LA21_0==PLUS||(LA21_0 >= RPAREN && LA21_0 <= SEMI)||LA21_0==THEN) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:189:4: ( LPAREN expr_list RPAREN )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:189:4: ( LPAREN expr_list RPAREN )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:189:5: LPAREN expr_list RPAREN
					{
					LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement_assignment_id1070);  
					stream_LPAREN.add(LPAREN120);

					pushFollow(FOLLOW_expr_list_in_statement_assignment_id1072);
					expr_list121=expr_list();
					state._fsp--;

					stream_expr_list.add(expr_list121.getTree());
					RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement_assignment_id1074);  
					stream_RPAREN.add(RPAREN122);

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
					// 189:30: -> ( expr_list )?
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:189:33: ( expr_list )?
						if ( stream_expr_list.hasNext() ) {
							adaptor.addChild(root_0, stream_expr_list.nextTree());
						}
						stream_expr_list.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:190:4: optional_subscript expr_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_optional_subscript_in_statement_assignment_id1085);
					optional_subscript123=optional_subscript();
					state._fsp--;

					adaptor.addChild(root_0, optional_subscript123.getTree());

					pushFollow(FOLLOW_expr_tail_in_statement_assignment_id1087);
					expr_tail124=expr_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_tail124.getTree());

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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:193:1: if_stmt : ( IF expr THEN stat_seq else_stmt ENDIF SEMI ) -> ^( IF expr stat_seq ( else_stmt )? ) ;
	public final TigerParser.if_stmt_return if_stmt() throws RecognitionException {
		TigerParser.if_stmt_return retval = new TigerParser.if_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF125=null;
		Token THEN127=null;
		Token ENDIF130=null;
		Token SEMI131=null;
		ParserRuleReturnScope expr126 =null;
		ParserRuleReturnScope stat_seq128 =null;
		ParserRuleReturnScope else_stmt129 =null;

		Object IF125_tree=null;
		Object THEN127_tree=null;
		Object ENDIF130_tree=null;
		Object SEMI131_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_else_stmt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmt");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:194:2: ( ( IF expr THEN stat_seq else_stmt ENDIF SEMI ) -> ^( IF expr stat_seq ( else_stmt )? ) )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:194:4: ( IF expr THEN stat_seq else_stmt ENDIF SEMI )
			{
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:194:4: ( IF expr THEN stat_seq else_stmt ENDIF SEMI )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:194:5: IF expr THEN stat_seq else_stmt ENDIF SEMI
			{
			IF125=(Token)match(input,IF,FOLLOW_IF_in_if_stmt1099);  
			stream_IF.add(IF125);

			pushFollow(FOLLOW_expr_in_if_stmt1101);
			expr126=expr();
			state._fsp--;

			stream_expr.add(expr126.getTree());
			THEN127=(Token)match(input,THEN,FOLLOW_THEN_in_if_stmt1103);  
			stream_THEN.add(THEN127);

			pushFollow(FOLLOW_stat_seq_in_if_stmt1105);
			stat_seq128=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq128.getTree());
			pushFollow(FOLLOW_else_stmt_in_if_stmt1107);
			else_stmt129=else_stmt();
			state._fsp--;

			stream_else_stmt.add(else_stmt129.getTree());
			ENDIF130=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_stmt1109);  
			stream_ENDIF.add(ENDIF130);

			SEMI131=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_stmt1111);  
			stream_SEMI.add(SEMI131);

			}

			// AST REWRITE
			// elements: stat_seq, else_stmt, IF, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 194:49: -> ^( IF expr stat_seq ( else_stmt )? )
			{
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:194:52: ^( IF expr stat_seq ( else_stmt )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:194:71: ( else_stmt )?
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:197:1: else_stmt : ( ELSE stat_seq -> stat_seq |);
	public final TigerParser.else_stmt_return else_stmt() throws RecognitionException {
		TigerParser.else_stmt_return retval = new TigerParser.else_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE132=null;
		ParserRuleReturnScope stat_seq133 =null;

		Object ELSE132_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:198:2: ( ELSE stat_seq -> stat_seq |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ELSE) ) {
				alt22=1;
			}
			else if ( (LA22_0==ENDIF) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:198:4: ELSE stat_seq
					{
					ELSE132=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_stmt1137);  
					stream_ELSE.add(ELSE132);

					pushFollow(FOLLOW_stat_seq_in_else_stmt1139);
					stat_seq133=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq133.getTree());
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
					// 198:18: -> stat_seq
					{
						adaptor.addChild(root_0, stream_stat_seq.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:200:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:202:1: constant : ( INTLIT | FIXEDPTLIT );
	public final TigerParser.constant_return constant() throws RecognitionException {
		TigerParser.constant_return retval = new TigerParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set134=null;

		Object set134_tree=null;

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:203:2: ( INTLIT | FIXEDPTLIT )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set134=input.LT(1);
			if ( input.LA(1)==FIXEDPTLIT||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set134));
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:207:1: binary_operator : ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR );
	public final TigerParser.binary_operator_return binary_operator() throws RecognitionException {
		TigerParser.binary_operator_return retval = new TigerParser.binary_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set135=null;

		Object set135_tree=null;

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:208:2: ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set135=input.LT(1);
			if ( input.LA(1)==AND||input.LA(1)==DIV||input.LA(1)==EQ||(input.LA(1) >= GEQ && input.LA(1) <= GREATER)||(input.LA(1) >= LEQ && input.LA(1) <= LESSER)||(input.LA(1) >= MINUS && input.LA(1) <= NEQ)||input.LA(1)==OR||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set135));
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:222:1: array_dimensions : array_dimension ( array_dimension )? ;
	public final TigerParser.array_dimensions_return array_dimensions() throws RecognitionException {
		TigerParser.array_dimensions_return retval = new TigerParser.array_dimensions_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_dimension136 =null;
		ParserRuleReturnScope array_dimension137 =null;


		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:223:2: ( array_dimension ( array_dimension )? )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:223:4: array_dimension ( array_dimension )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_dimension_in_array_dimensions1241);
			array_dimension136=array_dimension();
			state._fsp--;

			adaptor.addChild(root_0, array_dimension136.getTree());

			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:223:20: ( array_dimension )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==LBRACK) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:223:20: array_dimension
					{
					pushFollow(FOLLOW_array_dimension_in_array_dimensions1243);
					array_dimension137=array_dimension();
					state._fsp--;

					adaptor.addChild(root_0, array_dimension137.getTree());

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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:226:1: array_dimension : ( LBRACK INTLIT RBRACK ) -> INTLIT ;
	public final TigerParser.array_dimension_return array_dimension() throws RecognitionException {
		TigerParser.array_dimension_return retval = new TigerParser.array_dimension_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK138=null;
		Token INTLIT139=null;
		Token RBRACK140=null;

		Object LBRACK138_tree=null;
		Object INTLIT139_tree=null;
		Object RBRACK140_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:227:2: ( ( LBRACK INTLIT RBRACK ) -> INTLIT )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:227:4: ( LBRACK INTLIT RBRACK )
			{
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:227:4: ( LBRACK INTLIT RBRACK )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:227:5: LBRACK INTLIT RBRACK
			{
			LBRACK138=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_dimension1256);  
			stream_LBRACK.add(LBRACK138);

			INTLIT139=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_array_dimension1258);  
			stream_INTLIT.add(INTLIT139);

			RBRACK140=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_dimension1260);  
			stream_RBRACK.add(RBRACK140);

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
			// 227:27: -> INTLIT
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:230:1: array_subscripts : array_subscript ( array_subscript )? ;
	public final TigerParser.array_subscripts_return array_subscripts() throws RecognitionException {
		TigerParser.array_subscripts_return retval = new TigerParser.array_subscripts_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_subscript141 =null;
		ParserRuleReturnScope array_subscript142 =null;


		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:231:2: ( array_subscript ( array_subscript )? )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:231:4: array_subscript ( array_subscript )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_array_subscript_in_array_subscripts1276);
			array_subscript141=array_subscript();
			state._fsp--;

			adaptor.addChild(root_0, array_subscript141.getTree());

			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:231:20: ( array_subscript )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LBRACK) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:231:20: array_subscript
					{
					pushFollow(FOLLOW_array_subscript_in_array_subscripts1278);
					array_subscript142=array_subscript();
					state._fsp--;

					adaptor.addChild(root_0, array_subscript142.getTree());

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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:234:1: array_subscript : ( LBRACK index_expr RBRACK ) -> index_expr ;
	public final TigerParser.array_subscript_return array_subscript() throws RecognitionException {
		TigerParser.array_subscript_return retval = new TigerParser.array_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK143=null;
		Token RBRACK145=null;
		ParserRuleReturnScope index_expr144 =null;

		Object LBRACK143_tree=null;
		Object RBRACK145_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:235:2: ( ( LBRACK index_expr RBRACK ) -> index_expr )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:235:4: ( LBRACK index_expr RBRACK )
			{
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:235:4: ( LBRACK index_expr RBRACK )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:235:5: LBRACK index_expr RBRACK
			{
			LBRACK143=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_subscript1291);  
			stream_LBRACK.add(LBRACK143);

			pushFollow(FOLLOW_index_expr_in_array_subscript1293);
			index_expr144=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr144.getTree());
			RBRACK145=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_subscript1295);  
			stream_RBRACK.add(RBRACK145);

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
			// 235:31: -> index_expr
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:238:1: index_expr : index_expr_head index_expr_tail -> ^( EXPR index_expr_head ( index_expr_tail )? ) ;
	public final TigerParser.index_expr_return index_expr() throws RecognitionException {
		TigerParser.index_expr_return retval = new TigerParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope index_expr_head146 =null;
		ParserRuleReturnScope index_expr_tail147 =null;

		RewriteRuleSubtreeStream stream_index_expr_head=new RewriteRuleSubtreeStream(adaptor,"rule index_expr_head");
		RewriteRuleSubtreeStream stream_index_expr_tail=new RewriteRuleSubtreeStream(adaptor,"rule index_expr_tail");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:239:2: ( index_expr_head index_expr_tail -> ^( EXPR index_expr_head ( index_expr_tail )? ) )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:239:4: index_expr_head index_expr_tail
			{
			pushFollow(FOLLOW_index_expr_head_in_index_expr1311);
			index_expr_head146=index_expr_head();
			state._fsp--;

			stream_index_expr_head.add(index_expr_head146.getTree());
			pushFollow(FOLLOW_index_expr_tail_in_index_expr1313);
			index_expr_tail147=index_expr_tail();
			state._fsp--;

			stream_index_expr_tail.add(index_expr_tail147.getTree());
			// AST REWRITE
			// elements: index_expr_head, index_expr_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 239:36: -> ^( EXPR index_expr_head ( index_expr_tail )? )
			{
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:239:39: ^( EXPR index_expr_head ( index_expr_tail )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_index_expr_head.nextTree());
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:239:62: ( index_expr_tail )?
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:242:1: index_expr_head : ( INTLIT | ID );
	public final TigerParser.index_expr_head_return index_expr_head() throws RecognitionException {
		TigerParser.index_expr_head_return retval = new TigerParser.index_expr_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set148=null;

		Object set148_tree=null;

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:243:2: ( INTLIT | ID )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set148=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==INTLIT ) {
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
	// $ANTLR end "index_expr_head"


	public static class index_expr_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr_tail"
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:247:1: index_expr_tail : ( ( index_oper index_expr ) -> ^( index_oper index_expr ) |);
	public final TigerParser.index_expr_tail_return index_expr_tail() throws RecognitionException {
		TigerParser.index_expr_tail_return retval = new TigerParser.index_expr_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope index_oper149 =null;
		ParserRuleReturnScope index_expr150 =null;

		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_index_oper=new RewriteRuleSubtreeStream(adaptor,"rule index_oper");

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:248:2: ( ( index_oper index_expr ) -> ^( index_oper index_expr ) |)
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= MINUS && LA25_0 <= MULT)||LA25_0==PLUS) ) {
				alt25=1;
			}
			else if ( (LA25_0==DO||LA25_0==RBRACK||LA25_0==TO) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:248:4: ( index_oper index_expr )
					{
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:248:4: ( index_oper index_expr )
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:248:5: index_oper index_expr
					{
					pushFollow(FOLLOW_index_oper_in_index_expr_tail1352);
					index_oper149=index_oper();
					state._fsp--;

					stream_index_oper.add(index_oper149.getTree());
					pushFollow(FOLLOW_index_expr_in_index_expr_tail1354);
					index_expr150=index_expr();
					state._fsp--;

					stream_index_expr.add(index_expr150.getTree());
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
					// 248:28: -> ^( index_oper index_expr )
					{
						// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:248:31: ^( index_oper index_expr )
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:250:2: 
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
	// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:252:1: index_oper : ( PLUS | MINUS | MULT );
	public final TigerParser.index_oper_return index_oper() throws RecognitionException {
		TigerParser.index_oper_return retval = new TigerParser.index_oper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set151=null;

		Object set151_tree=null;

		try {
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:253:2: ( PLUS | MINUS | MULT )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set151=input.LT(1);
			if ( (input.LA(1) >= MINUS && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set151));
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



	public static final BitSet FOLLOW_type_declaration_list_in_tiger_program118 = new BitSet(new long[]{0x0000000120400000L});
	public static final BitSet FOLLOW_function_declaration_list_in_tiger_program120 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_tiger_program122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration_list158 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_type_declaration_list160 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration_list162 = new BitSet(new long[]{0x0000000100400020L});
	public static final BitSet FOLLOW_type_in_type_declaration_list164 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration_list166 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_type_declaration_list_in_type_declaration_list168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_function_declaration_list196 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_FUNCTION_in_function_declaration_list198 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_function_declaration_list200 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_declaration_list202 = new BitSet(new long[]{0x0008000020000000L});
	public static final BitSet FOLLOW_param_list_in_function_declaration_list204 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_declaration_list206 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_function_declaration_list208 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_function_declaration_list210 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_function_declaration_list212 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_function_declaration_list214 = new BitSet(new long[]{0x0000000120400000L});
	public static final BitSet FOLLOW_function_declaration_list_in_function_declaration_list217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration_list252 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration_list254 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_var_declaration_list256 = new BitSet(new long[]{0x0000000120400000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration_list258 = new BitSet(new long[]{0x0010000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration_list260 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration_list262 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_var_declaration_list264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_param_list303 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_param_list305 = new BitSet(new long[]{0x0000000120400000L});
	public static final BitSet FOLLOW_type_id_in_param_list307 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail337 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_param_list_in_param_list_tail339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list359 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail372 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block390 = new BitSet(new long[]{0x25040000A1000280L});
	public static final BitSet FOLLOW_type_declaration_list_in_block392 = new BitSet(new long[]{0x24040000A1000280L});
	public static final BitSet FOLLOW_var_declaration_list_in_block394 = new BitSet(new long[]{0x20040000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_block396 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_block398 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type440 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_array_dimensions_in_type442 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_OF_in_type444 = new BitSet(new long[]{0x0000000100400000L});
	public static final BitSet FOLLOW_base_type_in_type446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_id473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration501 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration503 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_var_declaration505 = new BitSet(new long[]{0x0000000120400000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration507 = new BitSet(new long[]{0x0010000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration509 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init536 = new BitSet(new long[]{0x0000000200800000L});
	public static final BitSet FOLLOW_constant_in_optional_init538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list557 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_id_list_tail570 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_id_list_tail572 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list_tail574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list599 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail629 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail631 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_in_expr656 = new BitSet(new long[]{0x0000573018082010L});
	public static final BitSet FOLLOW_expr_tail_in_expr658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_operator_in_expr_tail670 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_expr_tail672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_base_in_expr_head696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr_head702 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_optional_subscript_in_expr_head704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_head_base727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_head_base733 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_expr_head_base735 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_head_base737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq757 = new BitSet(new long[]{0x20040000A1000280L});
	public static final BitSet FOLLOW_stat_tail_in_stat_seq759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_tail781 = new BitSet(new long[]{0x20040000A1000280L});
	public static final BitSet FOLLOW_stat_tail_in_stat_tail783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_stat804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat810 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_stat812 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat814 = new BitSet(new long[]{0x20040000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_stat816 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat818 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat837 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_ID_in_stat839 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat841 = new BitSet(new long[]{0x0000000220000000L});
	public static final BitSet FOLLOW_range_in_stat843 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat845 = new BitSet(new long[]{0x20040000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_stat847 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat849 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat867 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat878 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_stat880 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat900 = new BitSet(new long[]{0x0000004800000040L});
	public static final BitSet FOLLOW_LPAREN_in_stat911 = new BitSet(new long[]{0x0008004220800000L});
	public static final BitSet FOLLOW_expr_list_in_stat913 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat915 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_optional_subscript_in_stat939 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat941 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_statement_assignment_in_stat943 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_subscripts_in_optional_subscript979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_range997 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_TO_in_range999 = new BitSet(new long[]{0x0000000220000000L});
	public static final BitSet FOLLOW_index_expr_in_range1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_statement_assignment1024 = new BitSet(new long[]{0x0000577818082010L});
	public static final BitSet FOLLOW_statement_assignment_id_in_statement_assignment1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_base_in_statement_assignment1044 = new BitSet(new long[]{0x0000573018082010L});
	public static final BitSet FOLLOW_expr_tail_in_statement_assignment1046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_statement_assignment_id1070 = new BitSet(new long[]{0x0008004220800000L});
	public static final BitSet FOLLOW_expr_list_in_statement_assignment_id1072 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_statement_assignment_id1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_optional_subscript_in_statement_assignment_id1085 = new BitSet(new long[]{0x0000573018082010L});
	public static final BitSet FOLLOW_expr_tail_in_statement_assignment_id1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt1099 = new BitSet(new long[]{0x0000004220800000L});
	public static final BitSet FOLLOW_expr_in_if_stmt1101 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_THEN_in_if_stmt1103 = new BitSet(new long[]{0x20040000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_if_stmt1105 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_else_stmt_in_if_stmt1107 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDIF_in_if_stmt1109 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_stmt1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_stmt1137 = new BitSet(new long[]{0x20040000A1000280L});
	public static final BitSet FOLLOW_stat_seq_in_else_stmt1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions1241 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_dimension_in_array_dimensions1243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_dimension1256 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INTLIT_in_array_dimension1258 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_dimension1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_subscript_in_array_subscripts1276 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_array_subscript_in_array_subscripts1278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_subscript1291 = new BitSet(new long[]{0x0000000220000000L});
	public static final BitSet FOLLOW_index_expr_in_array_subscript1293 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_subscript1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_head_in_index_expr1311 = new BitSet(new long[]{0x0000430000000000L});
	public static final BitSet FOLLOW_index_expr_tail_in_index_expr1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_oper_in_index_expr_tail1352 = new BitSet(new long[]{0x0000000220000000L});
	public static final BitSet FOLLOW_index_expr_in_index_expr_tail1354 = new BitSet(new long[]{0x0000000000000002L});
}
