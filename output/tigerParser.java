// $ANTLR 3.5.1 /Users/twb/repos/Tiger/tiger.g 2014-10-03 23:45:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class tigerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "BEGIN", 
		"BLOCK", "BREAK", "COLON", "COMMA", "COMMENT", "DIV", "DO", "ELSE", "END", 
		"ENDDO", "ENDIF", "EQ", "FIXEDPT", "FIXEDPTLIT", "FOR", "FUNCTION", "GREATER", 
		"GREATEREQ", "ID", "IF", "INT", "INTLIT", "LBRACK", "LESSER", "LESSEREQ", 
		"LPAREN", "MAIN", "MINUS", "MULT", "NEQ", "OF", "OR", "PLUS", "RBRACK", 
		"RETURN", "RPAREN", "SEMI", "THEN", "TO", "TYPE", "VAR", "VOID", "WHILE", 
		"WS"
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
	public static final int FIXEDPT=20;
	public static final int FIXEDPTLIT=21;
	public static final int FOR=22;
	public static final int FUNCTION=23;
	public static final int GREATER=24;
	public static final int GREATEREQ=25;
	public static final int ID=26;
	public static final int IF=27;
	public static final int INT=28;
	public static final int INTLIT=29;
	public static final int LBRACK=30;
	public static final int LESSER=31;
	public static final int LESSEREQ=32;
	public static final int LPAREN=33;
	public static final int MAIN=34;
	public static final int MINUS=35;
	public static final int MULT=36;
	public static final int NEQ=37;
	public static final int OF=38;
	public static final int OR=39;
	public static final int PLUS=40;
	public static final int RBRACK=41;
	public static final int RETURN=42;
	public static final int RPAREN=43;
	public static final int SEMI=44;
	public static final int THEN=45;
	public static final int TO=46;
	public static final int TYPE=47;
	public static final int VAR=48;
	public static final int VOID=49;
	public static final int WHILE=50;
	public static final int WS=51;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tigerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tigerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return tigerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/twb/repos/Tiger/tiger.g"; }


	public static class tiger_program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tiger_program"
	// /Users/twb/repos/Tiger/tiger.g:16:1: tiger_program : type_declaration_list funct_declaration_list main_function ;
	public final tigerParser.tiger_program_return tiger_program() throws RecognitionException {
		tigerParser.tiger_program_return retval = new tigerParser.tiger_program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_list1 =null;
		ParserRuleReturnScope funct_declaration_list2 =null;
		ParserRuleReturnScope main_function3 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:16:14: ( type_declaration_list funct_declaration_list main_function )
			// /Users/twb/repos/Tiger/tiger.g:16:16: type_declaration_list funct_declaration_list main_function
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_declaration_list_in_tiger_program45);
			type_declaration_list1=type_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, type_declaration_list1.getTree());

			pushFollow(FOLLOW_funct_declaration_list_in_tiger_program47);
			funct_declaration_list2=funct_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, funct_declaration_list2.getTree());

			pushFollow(FOLLOW_main_function_in_tiger_program49);
			main_function3=main_function();
			state._fsp--;

			adaptor.addChild(root_0, main_function3.getTree());

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
	// /Users/twb/repos/Tiger/tiger.g:18:1: type_declaration_list : ( type_declaration type_declaration_list |);
	public final tigerParser.type_declaration_list_return type_declaration_list() throws RecognitionException {
		tigerParser.type_declaration_list_return retval = new tigerParser.type_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration4 =null;
		ParserRuleReturnScope type_declaration_list5 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:19:2: ( type_declaration type_declaration_list |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TYPE) ) {
				alt1=1;
			}
			else if ( (LA1_0==BEGIN||LA1_0==BREAK||(LA1_0 >= ELSE && LA1_0 <= ENDIF)||LA1_0==FIXEDPT||LA1_0==FOR||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==RETURN||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:19:4: type_declaration type_declaration_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_declaration_in_type_declaration_list58);
					type_declaration4=type_declaration();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration4.getTree());

					pushFollow(FOLLOW_type_declaration_list_in_type_declaration_list60);
					type_declaration_list5=type_declaration_list();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration_list5.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:21:2: 
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


	public static class type_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_declaration"
	// /Users/twb/repos/Tiger/tiger.g:23:1: type_declaration : ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) ;
	public final tigerParser.type_declaration_return type_declaration() throws RecognitionException {
		tigerParser.type_declaration_return retval = new tigerParser.type_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE6=null;
		Token ID7=null;
		Token EQ8=null;
		Token SEMI10=null;
		ParserRuleReturnScope type9 =null;

		Object TYPE6_tree=null;
		Object ID7_tree=null;
		Object EQ8_tree=null;
		Object SEMI10_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /Users/twb/repos/Tiger/tiger.g:24:2: ( ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) )
			// /Users/twb/repos/Tiger/tiger.g:24:4: ( TYPE ID EQ type SEMI )
			{
			// /Users/twb/repos/Tiger/tiger.g:24:4: ( TYPE ID EQ type SEMI )
			// /Users/twb/repos/Tiger/tiger.g:24:5: TYPE ID EQ type SEMI
			{
			TYPE6=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_declaration76);  
			stream_TYPE.add(TYPE6);

			ID7=(Token)match(input,ID,FOLLOW_ID_in_type_declaration78);  
			stream_ID.add(ID7);

			EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_type_declaration80);  
			stream_EQ.add(EQ8);

			pushFollow(FOLLOW_type_in_type_declaration82);
			type9=type();
			state._fsp--;

			stream_type.add(type9.getTree());
			SEMI10=(Token)match(input,SEMI,FOLLOW_SEMI_in_type_declaration84);  
			stream_SEMI.add(SEMI10);

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
			// 24:27: -> ^( TYPE ID type )
			{
				// /Users/twb/repos/Tiger/tiger.g:24:30: ^( TYPE ID type )
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


	public static class funct_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funct_declaration_list"
	// /Users/twb/repos/Tiger/tiger.g:27:1: funct_declaration_list : ( funct_declaration funct_declaration_list |);
	public final tigerParser.funct_declaration_list_return funct_declaration_list() throws RecognitionException {
		tigerParser.funct_declaration_list_return retval = new tigerParser.funct_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope funct_declaration11 =null;
		ParserRuleReturnScope funct_declaration_list12 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:28:2: ( funct_declaration funct_declaration_list |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VOID) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==MAIN) ) {
					alt2=2;
				}
				else if ( (LA2_1==FUNCTION) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0==FIXEDPT||LA2_0==ID||LA2_0==INT) ) {
				alt2=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:28:4: funct_declaration funct_declaration_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_funct_declaration_in_funct_declaration_list106);
					funct_declaration11=funct_declaration();
					state._fsp--;

					adaptor.addChild(root_0, funct_declaration11.getTree());

					pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list108);
					funct_declaration_list12=funct_declaration_list();
					state._fsp--;

					adaptor.addChild(root_0, funct_declaration_list12.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:30:2: 
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
	// $ANTLR end "funct_declaration_list"


	public static class funct_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funct_declaration"
	// /Users/twb/repos/Tiger/tiger.g:32:1: funct_declaration : ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ;
	public final tigerParser.funct_declaration_return funct_declaration() throws RecognitionException {
		tigerParser.funct_declaration_return retval = new tigerParser.funct_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FUNCTION14=null;
		Token ID15=null;
		Token LPAREN16=null;
		Token RPAREN18=null;
		Token BEGIN19=null;
		Token END21=null;
		Token SEMI22=null;
		ParserRuleReturnScope ret_type13 =null;
		ParserRuleReturnScope param_list17 =null;
		ParserRuleReturnScope block_list20 =null;

		Object FUNCTION14_tree=null;
		Object ID15_tree=null;
		Object LPAREN16_tree=null;
		Object RPAREN18_tree=null;
		Object BEGIN19_tree=null;
		Object END21_tree=null;
		Object SEMI22_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:33:2: ( ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			// /Users/twb/repos/Tiger/tiger.g:33:4: ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_ret_type_in_funct_declaration123);
			ret_type13=ret_type();
			state._fsp--;

			adaptor.addChild(root_0, ret_type13.getTree());

			FUNCTION14=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funct_declaration125); 
			FUNCTION14_tree = (Object)adaptor.create(FUNCTION14);
			adaptor.addChild(root_0, FUNCTION14_tree);

			ID15=(Token)match(input,ID,FOLLOW_ID_in_funct_declaration127); 
			ID15_tree = (Object)adaptor.create(ID15);
			adaptor.addChild(root_0, ID15_tree);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funct_declaration129); 
			LPAREN16_tree = (Object)adaptor.create(LPAREN16);
			adaptor.addChild(root_0, LPAREN16_tree);

			pushFollow(FOLLOW_param_list_in_funct_declaration131);
			param_list17=param_list();
			state._fsp--;

			adaptor.addChild(root_0, param_list17.getTree());

			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funct_declaration133); 
			RPAREN18_tree = (Object)adaptor.create(RPAREN18);
			adaptor.addChild(root_0, RPAREN18_tree);

			BEGIN19=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_funct_declaration135); 
			BEGIN19_tree = (Object)adaptor.create(BEGIN19);
			adaptor.addChild(root_0, BEGIN19_tree);

			pushFollow(FOLLOW_block_list_in_funct_declaration137);
			block_list20=block_list();
			state._fsp--;

			adaptor.addChild(root_0, block_list20.getTree());

			END21=(Token)match(input,END,FOLLOW_END_in_funct_declaration139); 
			END21_tree = (Object)adaptor.create(END21);
			adaptor.addChild(root_0, END21_tree);

			SEMI22=(Token)match(input,SEMI,FOLLOW_SEMI_in_funct_declaration141); 
			SEMI22_tree = (Object)adaptor.create(SEMI22);
			adaptor.addChild(root_0, SEMI22_tree);

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
	// $ANTLR end "funct_declaration"


	public static class main_function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_function"
	// /Users/twb/repos/Tiger/tiger.g:36:1: main_function : ( VOID MAIN LPAREN RPAREN block_list EOF ) -> ^( MAIN block_list ) ;
	public final tigerParser.main_function_return main_function() throws RecognitionException {
		tigerParser.main_function_return retval = new tigerParser.main_function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VOID23=null;
		Token MAIN24=null;
		Token LPAREN25=null;
		Token RPAREN26=null;
		Token EOF28=null;
		ParserRuleReturnScope block_list27 =null;

		Object VOID23_tree=null;
		Object MAIN24_tree=null;
		Object LPAREN25_tree=null;
		Object RPAREN26_tree=null;
		Object EOF28_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_block_list=new RewriteRuleSubtreeStream(adaptor,"rule block_list");

		try {
			// /Users/twb/repos/Tiger/tiger.g:37:2: ( ( VOID MAIN LPAREN RPAREN block_list EOF ) -> ^( MAIN block_list ) )
			// /Users/twb/repos/Tiger/tiger.g:37:4: ( VOID MAIN LPAREN RPAREN block_list EOF )
			{
			// /Users/twb/repos/Tiger/tiger.g:37:4: ( VOID MAIN LPAREN RPAREN block_list EOF )
			// /Users/twb/repos/Tiger/tiger.g:37:5: VOID MAIN LPAREN RPAREN block_list EOF
			{
			VOID23=(Token)match(input,VOID,FOLLOW_VOID_in_main_function154);  
			stream_VOID.add(VOID23);

			MAIN24=(Token)match(input,MAIN,FOLLOW_MAIN_in_main_function156);  
			stream_MAIN.add(MAIN24);

			LPAREN25=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_main_function158);  
			stream_LPAREN.add(LPAREN25);

			RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_main_function160);  
			stream_RPAREN.add(RPAREN26);

			pushFollow(FOLLOW_block_list_in_main_function162);
			block_list27=block_list();
			state._fsp--;

			stream_block_list.add(block_list27.getTree());
			EOF28=(Token)match(input,EOF,FOLLOW_EOF_in_main_function164);  
			stream_EOF.add(EOF28);

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
			// 37:45: -> ^( MAIN block_list )
			{
				// /Users/twb/repos/Tiger/tiger.g:37:48: ^( MAIN block_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_MAIN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_block_list.nextTree());
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
	// $ANTLR end "main_function"


	public static class ret_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ret_type"
	// /Users/twb/repos/Tiger/tiger.g:40:1: ret_type : ( VOID | type_id );
	public final tigerParser.ret_type_return ret_type() throws RecognitionException {
		tigerParser.ret_type_return retval = new tigerParser.ret_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VOID29=null;
		ParserRuleReturnScope type_id30 =null;

		Object VOID29_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:41:2: ( VOID | type_id )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VOID) ) {
				alt3=1;
			}
			else if ( (LA3_0==FIXEDPT||LA3_0==ID||LA3_0==INT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:41:5: VOID
					{
					root_0 = (Object)adaptor.nil();


					VOID29=(Token)match(input,VOID,FOLLOW_VOID_in_ret_type186); 
					VOID29_tree = (Object)adaptor.create(VOID29);
					adaptor.addChild(root_0, VOID29_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:42:5: type_id
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_id_in_ret_type192);
					type_id30=type_id();
					state._fsp--;

					adaptor.addChild(root_0, type_id30.getTree());

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
	// $ANTLR end "ret_type"


	public static class param_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list"
	// /Users/twb/repos/Tiger/tiger.g:45:1: param_list : ( param param_list_tail |);
	public final tigerParser.param_list_return param_list() throws RecognitionException {
		tigerParser.param_list_return retval = new tigerParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope param31 =null;
		ParserRuleReturnScope param_list_tail32 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:46:2: ( param param_list_tail |)
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
					// /Users/twb/repos/Tiger/tiger.g:46:4: param param_list_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_param_in_param_list203);
					param31=param();
					state._fsp--;

					adaptor.addChild(root_0, param31.getTree());

					pushFollow(FOLLOW_param_list_tail_in_param_list205);
					param_list_tail32=param_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, param_list_tail32.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:48:2: 
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
	// /Users/twb/repos/Tiger/tiger.g:50:1: param_list_tail : ( COMMA param param_list_tail |);
	public final tigerParser.param_list_tail_return param_list_tail() throws RecognitionException {
		tigerParser.param_list_tail_return retval = new tigerParser.param_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA33=null;
		ParserRuleReturnScope param34 =null;
		ParserRuleReturnScope param_list_tail35 =null;

		Object COMMA33_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:51:2: ( COMMA param param_list_tail |)
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
					// /Users/twb/repos/Tiger/tiger.g:51:4: COMMA param param_list_tail
					{
					root_0 = (Object)adaptor.nil();


					COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list_tail221); 
					COMMA33_tree = (Object)adaptor.create(COMMA33);
					adaptor.addChild(root_0, COMMA33_tree);

					pushFollow(FOLLOW_param_in_param_list_tail223);
					param34=param();
					state._fsp--;

					adaptor.addChild(root_0, param34.getTree());

					pushFollow(FOLLOW_param_list_tail_in_param_list_tail225);
					param_list_tail35=param_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, param_list_tail35.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:53:2: 
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
	// /Users/twb/repos/Tiger/tiger.g:55:1: param : ID COLON type_id ;
	public final tigerParser.param_return param() throws RecognitionException {
		tigerParser.param_return retval = new tigerParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID36=null;
		Token COLON37=null;
		ParserRuleReturnScope type_id38 =null;

		Object ID36_tree=null;
		Object COLON37_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:56:2: ( ID COLON type_id )
			// /Users/twb/repos/Tiger/tiger.g:56:4: ID COLON type_id
			{
			root_0 = (Object)adaptor.nil();


			ID36=(Token)match(input,ID,FOLLOW_ID_in_param242); 
			ID36_tree = (Object)adaptor.create(ID36);
			adaptor.addChild(root_0, ID36_tree);

			COLON37=(Token)match(input,COLON,FOLLOW_COLON_in_param244); 
			COLON37_tree = (Object)adaptor.create(COLON37);
			adaptor.addChild(root_0, COLON37_tree);

			pushFollow(FOLLOW_type_id_in_param246);
			type_id38=type_id();
			state._fsp--;

			adaptor.addChild(root_0, type_id38.getTree());

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
	// /Users/twb/repos/Tiger/tiger.g:59:1: block_list : block block_tail ;
	public final tigerParser.block_list_return block_list() throws RecognitionException {
		tigerParser.block_list_return retval = new tigerParser.block_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block39 =null;
		ParserRuleReturnScope block_tail40 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:60:2: ( block block_tail )
			// /Users/twb/repos/Tiger/tiger.g:60:4: block block_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_block_list258);
			block39=block();
			state._fsp--;

			adaptor.addChild(root_0, block39.getTree());

			pushFollow(FOLLOW_block_tail_in_block_list260);
			block_tail40=block_tail();
			state._fsp--;

			adaptor.addChild(root_0, block_tail40.getTree());

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
	// /Users/twb/repos/Tiger/tiger.g:63:1: block_tail : ( block block_tail |);
	public final tigerParser.block_tail_return block_tail() throws RecognitionException {
		tigerParser.block_tail_return retval = new tigerParser.block_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block41 =null;
		ParserRuleReturnScope block_tail42 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:64:2: ( block block_tail |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BEGIN) ) {
				alt6=1;
			}
			else if ( (LA6_0==EOF||LA6_0==END) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:64:4: block block_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_block_tail271);
					block41=block();
					state._fsp--;

					adaptor.addChild(root_0, block41.getTree());

					pushFollow(FOLLOW_block_tail_in_block_tail273);
					block_tail42=block_tail();
					state._fsp--;

					adaptor.addChild(root_0, block_tail42.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:66:2: 
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
	// /Users/twb/repos/Tiger/tiger.g:68:1: block : ( BEGIN opt= declaration_segment stat_seq END SEMI ) -> {opt.getTree() != null}? ^( BLOCK $opt stat_seq ) -> ^( BLOCK stat_seq ) ;
	public final tigerParser.block_return block() throws RecognitionException {
		tigerParser.block_return retval = new tigerParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN43=null;
		Token END45=null;
		Token SEMI46=null;
		ParserRuleReturnScope opt =null;
		ParserRuleReturnScope stat_seq44 =null;

		Object BEGIN43_tree=null;
		Object END45_tree=null;
		Object SEMI46_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_declaration_segment=new RewriteRuleSubtreeStream(adaptor,"rule declaration_segment");

		try {
			// /Users/twb/repos/Tiger/tiger.g:69:2: ( ( BEGIN opt= declaration_segment stat_seq END SEMI ) -> {opt.getTree() != null}? ^( BLOCK $opt stat_seq ) -> ^( BLOCK stat_seq ) )
			// /Users/twb/repos/Tiger/tiger.g:69:4: ( BEGIN opt= declaration_segment stat_seq END SEMI )
			{
			// /Users/twb/repos/Tiger/tiger.g:69:4: ( BEGIN opt= declaration_segment stat_seq END SEMI )
			// /Users/twb/repos/Tiger/tiger.g:69:5: BEGIN opt= declaration_segment stat_seq END SEMI
			{
			BEGIN43=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block289);  
			stream_BEGIN.add(BEGIN43);

			pushFollow(FOLLOW_declaration_segment_in_block293);
			opt=declaration_segment();
			state._fsp--;

			stream_declaration_segment.add(opt.getTree());
			pushFollow(FOLLOW_stat_seq_in_block295);
			stat_seq44=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq44.getTree());
			END45=(Token)match(input,END,FOLLOW_END_in_block297);  
			stream_END.add(END45);

			SEMI46=(Token)match(input,SEMI,FOLLOW_SEMI_in_block299);  
			stream_SEMI.add(SEMI46);

			}

			// AST REWRITE
			// elements: stat_seq, stat_seq, opt
			// token labels: 
			// rule labels: opt, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_opt=new RewriteRuleSubtreeStream(adaptor,"rule opt",opt!=null?opt.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 69:55: -> {opt.getTree() != null}? ^( BLOCK $opt stat_seq )
			if (opt.getTree() != null) {
				// /Users/twb/repos/Tiger/tiger.g:69:84: ^( BLOCK $opt stat_seq )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_opt.nextTree());
				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 70:16: -> ^( BLOCK stat_seq )
			{
				// /Users/twb/repos/Tiger/tiger.g:70:26: ^( BLOCK stat_seq )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
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
	// /Users/twb/repos/Tiger/tiger.g:73:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final tigerParser.declaration_segment_return declaration_segment() throws RecognitionException {
		tigerParser.declaration_segment_return retval = new tigerParser.declaration_segment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_list47 =null;
		ParserRuleReturnScope var_declaration_list48 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:74:2: ( type_declaration_list var_declaration_list )
			// /Users/twb/repos/Tiger/tiger.g:74:4: type_declaration_list var_declaration_list
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_declaration_list_in_declaration_segment356);
			type_declaration_list47=type_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, type_declaration_list47.getTree());

			pushFollow(FOLLOW_var_declaration_list_in_declaration_segment358);
			var_declaration_list48=var_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, var_declaration_list48.getTree());

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
	// /Users/twb/repos/Tiger/tiger.g:77:1: var_declaration_list : ( var_declaration var_declaration_list |);
	public final tigerParser.var_declaration_list_return var_declaration_list() throws RecognitionException {
		tigerParser.var_declaration_list_return retval = new tigerParser.var_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration49 =null;
		ParserRuleReturnScope var_declaration_list50 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:78:2: ( var_declaration var_declaration_list |)
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			else if ( (LA7_0==BEGIN||LA7_0==BREAK||(LA7_0 >= ELSE && LA7_0 <= ENDIF)||LA7_0==FOR||(LA7_0 >= ID && LA7_0 <= IF)||LA7_0==RETURN||LA7_0==WHILE) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:78:4: var_declaration var_declaration_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_var_declaration_list369);
					var_declaration49=var_declaration();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration49.getTree());

					pushFollow(FOLLOW_var_declaration_list_in_var_declaration_list371);
					var_declaration_list50=var_declaration_list();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration_list50.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:80:2: 
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


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /Users/twb/repos/Tiger/tiger.g:82:1: type : ( base_type | ( ARRAY array_index_const OF base_type ) -> ^( ARRAY array_index_const base_type ) | ( ARRAY width= array_index_const height= array_index_const OF base_type ) -> ^( ARRAY $width $height base_type ) );
	public final tigerParser.type_return type() throws RecognitionException {
		tigerParser.type_return retval = new tigerParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ARRAY52=null;
		Token OF54=null;
		Token ARRAY56=null;
		Token OF57=null;
		ParserRuleReturnScope width =null;
		ParserRuleReturnScope height =null;
		ParserRuleReturnScope base_type51 =null;
		ParserRuleReturnScope array_index_const53 =null;
		ParserRuleReturnScope base_type55 =null;
		ParserRuleReturnScope base_type58 =null;

		Object ARRAY52_tree=null;
		Object OF54_tree=null;
		Object ARRAY56_tree=null;
		Object OF57_tree=null;
		RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
		RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
		RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");
		RewriteRuleSubtreeStream stream_array_index_const=new RewriteRuleSubtreeStream(adaptor,"rule array_index_const");

		try {
			// /Users/twb/repos/Tiger/tiger.g:83:2: ( base_type | ( ARRAY array_index_const OF base_type ) -> ^( ARRAY array_index_const base_type ) | ( ARRAY width= array_index_const height= array_index_const OF base_type ) -> ^( ARRAY $width $height base_type ) )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==FIXEDPT||LA8_0==INT) ) {
				alt8=1;
			}
			else if ( (LA8_0==ARRAY) ) {
				int LA8_2 = input.LA(2);
				if ( (LA8_2==LBRACK) ) {
					int LA8_3 = input.LA(3);
					if ( (LA8_3==INTLIT) ) {
						int LA8_4 = input.LA(4);
						if ( (LA8_4==RBRACK) ) {
							int LA8_5 = input.LA(5);
							if ( (LA8_5==OF) ) {
								alt8=2;
							}
							else if ( (LA8_5==LBRACK) ) {
								alt8=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 8, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:83:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type386);
					base_type51=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type51.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:84:4: ( ARRAY array_index_const OF base_type )
					{
					// /Users/twb/repos/Tiger/tiger.g:84:4: ( ARRAY array_index_const OF base_type )
					// /Users/twb/repos/Tiger/tiger.g:84:5: ARRAY array_index_const OF base_type
					{
					ARRAY52=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type392);  
					stream_ARRAY.add(ARRAY52);

					pushFollow(FOLLOW_array_index_const_in_type394);
					array_index_const53=array_index_const();
					state._fsp--;

					stream_array_index_const.add(array_index_const53.getTree());
					OF54=(Token)match(input,OF,FOLLOW_OF_in_type396);  
					stream_OF.add(OF54);

					pushFollow(FOLLOW_base_type_in_type398);
					base_type55=base_type();
					state._fsp--;

					stream_base_type.add(base_type55.getTree());
					}

					// AST REWRITE
					// elements: array_index_const, ARRAY, base_type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:43: -> ^( ARRAY array_index_const base_type )
					{
						// /Users/twb/repos/Tiger/tiger.g:84:46: ^( ARRAY array_index_const base_type )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);
						adaptor.addChild(root_1, stream_array_index_const.nextTree());
						adaptor.addChild(root_1, stream_base_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/twb/repos/Tiger/tiger.g:85:4: ( ARRAY width= array_index_const height= array_index_const OF base_type )
					{
					// /Users/twb/repos/Tiger/tiger.g:85:4: ( ARRAY width= array_index_const height= array_index_const OF base_type )
					// /Users/twb/repos/Tiger/tiger.g:85:5: ARRAY width= array_index_const height= array_index_const OF base_type
					{
					ARRAY56=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type415);  
					stream_ARRAY.add(ARRAY56);

					pushFollow(FOLLOW_array_index_const_in_type419);
					width=array_index_const();
					state._fsp--;

					stream_array_index_const.add(width.getTree());
					pushFollow(FOLLOW_array_index_const_in_type423);
					height=array_index_const();
					state._fsp--;

					stream_array_index_const.add(height.getTree());
					OF57=(Token)match(input,OF,FOLLOW_OF_in_type425);  
					stream_OF.add(OF57);

					pushFollow(FOLLOW_base_type_in_type427);
					base_type58=base_type();
					state._fsp--;

					stream_base_type.add(base_type58.getTree());
					}

					// AST REWRITE
					// elements: ARRAY, height, base_type, width
					// token labels: 
					// rule labels: width, retval, height
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_width=new RewriteRuleSubtreeStream(adaptor,"rule width",width!=null?width.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_height=new RewriteRuleSubtreeStream(adaptor,"rule height",height!=null?height.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 85:74: -> ^( ARRAY $width $height base_type )
					{
						// /Users/twb/repos/Tiger/tiger.g:85:77: ^( ARRAY $width $height base_type )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);
						adaptor.addChild(root_1, stream_width.nextTree());
						adaptor.addChild(root_1, stream_height.nextTree());
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
	// /Users/twb/repos/Tiger/tiger.g:88:1: type_id : ( base_type | ID );
	public final tigerParser.type_id_return type_id() throws RecognitionException {
		tigerParser.type_id_return retval = new tigerParser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID60=null;
		ParserRuleReturnScope base_type59 =null;

		Object ID60_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:89:2: ( base_type | ID )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FIXEDPT||LA9_0==INT) ) {
				alt9=1;
			}
			else if ( (LA9_0==ID) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:89:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type_id453);
					base_type59=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type59.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:90:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID60=(Token)match(input,ID,FOLLOW_ID_in_type_id458); 
					ID60_tree = (Object)adaptor.create(ID60);
					adaptor.addChild(root_0, ID60_tree);

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
	// /Users/twb/repos/Tiger/tiger.g:93:1: base_type : ( INT | FIXEDPT );
	public final tigerParser.base_type_return base_type() throws RecognitionException {
		tigerParser.base_type_return retval = new tigerParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set61=null;

		Object set61_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:94:2: ( INT | FIXEDPT )
			// /Users/twb/repos/Tiger/tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set61=input.LT(1);
			if ( input.LA(1)==FIXEDPT||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set61));
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
	// /Users/twb/repos/Tiger/tiger.g:98:1: var_declaration : ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id optional_init ) ;
	public final tigerParser.var_declaration_return var_declaration() throws RecognitionException {
		tigerParser.var_declaration_return retval = new tigerParser.var_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR62=null;
		Token COLON64=null;
		Token SEMI67=null;
		ParserRuleReturnScope id_list63 =null;
		ParserRuleReturnScope type_id65 =null;
		ParserRuleReturnScope optional_init66 =null;

		Object VAR62_tree=null;
		Object COLON64_tree=null;
		Object SEMI67_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_optional_init=new RewriteRuleSubtreeStream(adaptor,"rule optional_init");

		try {
			// /Users/twb/repos/Tiger/tiger.g:99:2: ( ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id optional_init ) )
			// /Users/twb/repos/Tiger/tiger.g:99:4: ( VAR id_list COLON type_id optional_init SEMI )
			{
			// /Users/twb/repos/Tiger/tiger.g:99:4: ( VAR id_list COLON type_id optional_init SEMI )
			// /Users/twb/repos/Tiger/tiger.g:99:5: VAR id_list COLON type_id optional_init SEMI
			{
			VAR62=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration486);  
			stream_VAR.add(VAR62);

			pushFollow(FOLLOW_id_list_in_var_declaration488);
			id_list63=id_list();
			state._fsp--;

			stream_id_list.add(id_list63.getTree());
			COLON64=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration490);  
			stream_COLON.add(COLON64);

			pushFollow(FOLLOW_type_id_in_var_declaration492);
			type_id65=type_id();
			state._fsp--;

			stream_type_id.add(type_id65.getTree());
			pushFollow(FOLLOW_optional_init_in_var_declaration494);
			optional_init66=optional_init();
			state._fsp--;

			stream_optional_init.add(optional_init66.getTree());
			SEMI67=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration496);  
			stream_SEMI.add(SEMI67);

			}

			// AST REWRITE
			// elements: id_list, optional_init, type_id, VAR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:51: -> ^( VAR id_list type_id optional_init )
			{
				// /Users/twb/repos/Tiger/tiger.g:99:54: ^( VAR id_list type_id optional_init )
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
	// /Users/twb/repos/Tiger/tiger.g:102:1: optional_init : ( ASSIGN constant -> constant |);
	public final tigerParser.optional_init_return optional_init() throws RecognitionException {
		tigerParser.optional_init_return retval = new tigerParser.optional_init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN68=null;
		ParserRuleReturnScope constant69 =null;

		Object ASSIGN68_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		try {
			// /Users/twb/repos/Tiger/tiger.g:103:2: ( ASSIGN constant -> constant |)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ASSIGN) ) {
				alt10=1;
			}
			else if ( (LA10_0==SEMI) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:103:4: ASSIGN constant
					{
					ASSIGN68=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init520);  
					stream_ASSIGN.add(ASSIGN68);

					pushFollow(FOLLOW_constant_in_optional_init522);
					constant69=constant();
					state._fsp--;

					stream_constant.add(constant69.getTree());
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
					// 103:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:105:2: 
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
	// /Users/twb/repos/Tiger/tiger.g:107:1: id_list : ( ID | ( ID COMMA id_list ) -> ^( COMMA ID id_list ) );
	public final tigerParser.id_list_return id_list() throws RecognitionException {
		tigerParser.id_list_return retval = new tigerParser.id_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID70=null;
		Token ID71=null;
		Token COMMA72=null;
		ParserRuleReturnScope id_list73 =null;

		Object ID70_tree=null;
		Object ID71_tree=null;
		Object COMMA72_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");

		try {
			// /Users/twb/repos/Tiger/tiger.g:108:2: ( ID | ( ID COMMA id_list ) -> ^( COMMA ID id_list ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==COMMA) ) {
					alt11=2;
				}
				else if ( (LA11_1==COLON||LA11_1==RPAREN) ) {
					alt11=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:108:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID70=(Token)match(input,ID,FOLLOW_ID_in_id_list541); 
					ID70_tree = (Object)adaptor.create(ID70);
					adaptor.addChild(root_0, ID70_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:109:4: ( ID COMMA id_list )
					{
					// /Users/twb/repos/Tiger/tiger.g:109:4: ( ID COMMA id_list )
					// /Users/twb/repos/Tiger/tiger.g:109:5: ID COMMA id_list
					{
					ID71=(Token)match(input,ID,FOLLOW_ID_in_id_list547);  
					stream_ID.add(ID71);

					COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list549);  
					stream_COMMA.add(COMMA72);

					pushFollow(FOLLOW_id_list_in_id_list551);
					id_list73=id_list();
					state._fsp--;

					stream_id_list.add(id_list73.getTree());
					}

					// AST REWRITE
					// elements: id_list, ID, COMMA
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 109:23: -> ^( COMMA ID id_list )
					{
						// /Users/twb/repos/Tiger/tiger.g:109:26: ^( COMMA ID id_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_COMMA.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_id_list.nextTree());
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
	// $ANTLR end "id_list"


	public static class optional_int_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optional_int"
	// /Users/twb/repos/Tiger/tiger.g:112:1: optional_int : ( ASSIGN constant |);
	public final tigerParser.optional_int_return optional_int() throws RecognitionException {
		tigerParser.optional_int_return retval = new tigerParser.optional_int_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN74=null;
		ParserRuleReturnScope constant75 =null;

		Object ASSIGN74_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:113:2: ( ASSIGN constant |)
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ASSIGN) ) {
				alt12=1;
			}
			else if ( (LA12_0==EOF) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:113:4: ASSIGN constant
					{
					root_0 = (Object)adaptor.nil();


					ASSIGN74=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_int573); 
					ASSIGN74_tree = (Object)adaptor.create(ASSIGN74);
					adaptor.addChild(root_0, ASSIGN74_tree);

					pushFollow(FOLLOW_constant_in_optional_int575);
					constant75=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant75.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:115:2: 
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


	public static class stat_seq_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat_seq"
	// /Users/twb/repos/Tiger/tiger.g:117:1: stat_seq : ( stat )* ;
	public final tigerParser.stat_seq_return stat_seq() throws RecognitionException {
		tigerParser.stat_seq_return retval = new tigerParser.stat_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat76 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:118:2: ( ( stat )* )
			// /Users/twb/repos/Tiger/tiger.g:118:4: ( stat )*
			{
			root_0 = (Object)adaptor.nil();


			// /Users/twb/repos/Tiger/tiger.g:118:4: ( stat )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==BEGIN||LA13_0==BREAK||LA13_0==FOR||(LA13_0 >= ID && LA13_0 <= IF)||LA13_0==RETURN||LA13_0==WHILE) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:118:5: stat
					{
					pushFollow(FOLLOW_stat_in_stat_seq591);
					stat76=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat76.getTree());

					}
					break;

				default :
					break loop13;
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
	// $ANTLR end "stat_seq"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/twb/repos/Tiger/tiger.g:121:1: expr : ( constant | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator ^ expr )* ;
	public final tigerParser.expr_return expr() throws RecognitionException {
		tigerParser.expr_return retval = new tigerParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN79=null;
		Token RPAREN81=null;
		ParserRuleReturnScope constant77 =null;
		ParserRuleReturnScope value78 =null;
		ParserRuleReturnScope expr80 =null;
		ParserRuleReturnScope binary_operator82 =null;
		ParserRuleReturnScope expr83 =null;

		Object LPAREN79_tree=null;
		Object RPAREN81_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:122:2: ( ( constant | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator ^ expr )* )
			// /Users/twb/repos/Tiger/tiger.g:122:4: ( constant | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator ^ expr )*
			{
			root_0 = (Object)adaptor.nil();


			// /Users/twb/repos/Tiger/tiger.g:122:4: ( constant | value | LPAREN expr RPAREN )
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
					// /Users/twb/repos/Tiger/tiger.g:122:5: constant
					{
					pushFollow(FOLLOW_constant_in_expr605);
					constant77=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant77.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:122:16: value
					{
					pushFollow(FOLLOW_value_in_expr609);
					value78=value();
					state._fsp--;

					adaptor.addChild(root_0, value78.getTree());

					}
					break;
				case 3 :
					// /Users/twb/repos/Tiger/tiger.g:122:24: LPAREN expr RPAREN
					{
					LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr613); 
					LPAREN79_tree = (Object)adaptor.create(LPAREN79);
					adaptor.addChild(root_0, LPAREN79_tree);

					pushFollow(FOLLOW_expr_in_expr615);
					expr80=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr80.getTree());

					RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr617); 
					RPAREN81_tree = (Object)adaptor.create(RPAREN81);
					adaptor.addChild(root_0, RPAREN81_tree);

					}
					break;

			}

			// /Users/twb/repos/Tiger/tiger.g:122:44: ( options {greedy=true; } : binary_operator ^ expr )*
			loop15:
			while (true) {
				int alt15=2;
				switch ( input.LA(1) ) {
				case PLUS:
					{
					alt15=1;
					}
					break;
				case MINUS:
					{
					alt15=1;
					}
					break;
				case MULT:
					{
					alt15=1;
					}
					break;
				case DIV:
					{
					alt15=1;
					}
					break;
				case EQ:
					{
					alt15=1;
					}
					break;
				case NEQ:
					{
					alt15=1;
					}
					break;
				case LESSER:
					{
					alt15=1;
					}
					break;
				case GREATER:
					{
					alt15=1;
					}
					break;
				case AND:
					{
					alt15=1;
					}
					break;
				case OR:
					{
					alt15=1;
					}
					break;
				}
				switch (alt15) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:122:67: binary_operator ^ expr
					{
					pushFollow(FOLLOW_binary_operator_in_expr628);
					binary_operator82=binary_operator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(binary_operator82.getTree(), root_0);
					pushFollow(FOLLOW_expr_in_expr631);
					expr83=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr83.getTree());

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
	// /Users/twb/repos/Tiger/tiger.g:125:1: expr_list : ( expr expr_list_tail |);
	public final tigerParser.expr_list_return expr_list() throws RecognitionException {
		tigerParser.expr_list_return retval = new tigerParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr84 =null;
		ParserRuleReturnScope expr_list_tail85 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:126:2: ( expr expr_list_tail |)
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
					// /Users/twb/repos/Tiger/tiger.g:126:4: expr expr_list_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_expr_list644);
					expr84=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr84.getTree());

					pushFollow(FOLLOW_expr_list_tail_in_expr_list646);
					expr_list_tail85=expr_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_list_tail85.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:128:2: 
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
	// /Users/twb/repos/Tiger/tiger.g:130:1: expr_list_tail : ( COMMA expr expr_list_tail |);
	public final tigerParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
		tigerParser.expr_list_tail_return retval = new tigerParser.expr_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA86=null;
		ParserRuleReturnScope expr87 =null;
		ParserRuleReturnScope expr_list_tail88 =null;

		Object COMMA86_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:131:2: ( COMMA expr expr_list_tail |)
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
					// /Users/twb/repos/Tiger/tiger.g:131:4: COMMA expr expr_list_tail
					{
					root_0 = (Object)adaptor.nil();


					COMMA86=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail661); 
					COMMA86_tree = (Object)adaptor.create(COMMA86);
					adaptor.addChild(root_0, COMMA86_tree);

					pushFollow(FOLLOW_expr_in_expr_list_tail663);
					expr87=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr87.getTree());

					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail665);
					expr_list_tail88=expr_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_list_tail88.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:133:2: 
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


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /Users/twb/repos/Tiger/tiger.g:135:1: stat : ( value ASSIGN stat_assignment -> ^( ASSIGN value stat_assignment ) | if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI | block | funct_call SEMI -> funct_call );
	public final tigerParser.stat_return stat() throws RecognitionException {
		tigerParser.stat_return retval = new tigerParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN90=null;
		Token WHILE93=null;
		Token DO95=null;
		Token ENDDO97=null;
		Token SEMI98=null;
		Token FOR99=null;
		Token ID100=null;
		Token ASSIGN101=null;
		Token DO103=null;
		Token ENDDO105=null;
		Token SEMI106=null;
		Token BREAK107=null;
		Token SEMI108=null;
		Token RETURN109=null;
		Token SEMI111=null;
		Token SEMI114=null;
		ParserRuleReturnScope value89 =null;
		ParserRuleReturnScope stat_assignment91 =null;
		ParserRuleReturnScope if_stmt92 =null;
		ParserRuleReturnScope expr94 =null;
		ParserRuleReturnScope stat_seq96 =null;
		ParserRuleReturnScope range102 =null;
		ParserRuleReturnScope stat_seq104 =null;
		ParserRuleReturnScope expr110 =null;
		ParserRuleReturnScope block112 =null;
		ParserRuleReturnScope funct_call113 =null;

		Object ASSIGN90_tree=null;
		Object WHILE93_tree=null;
		Object DO95_tree=null;
		Object ENDDO97_tree=null;
		Object SEMI98_tree=null;
		Object FOR99_tree=null;
		Object ID100_tree=null;
		Object ASSIGN101_tree=null;
		Object DO103_tree=null;
		Object ENDDO105_tree=null;
		Object SEMI106_tree=null;
		Object BREAK107_tree=null;
		Object SEMI108_tree=null;
		Object RETURN109_tree=null;
		Object SEMI111_tree=null;
		Object SEMI114_tree=null;
		RewriteRuleTokenStream stream_ENDDO=new RewriteRuleTokenStream(adaptor,"token ENDDO");
		RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_funct_call=new RewriteRuleSubtreeStream(adaptor,"rule funct_call");
		RewriteRuleSubtreeStream stream_stat_assignment=new RewriteRuleSubtreeStream(adaptor,"rule stat_assignment");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// /Users/twb/repos/Tiger/tiger.g:136:2: ( value ASSIGN stat_assignment -> ^( ASSIGN value stat_assignment ) | if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI | block | funct_call SEMI -> funct_call )
			int alt18=8;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA18_1 = input.LA(2);
				if ( (LA18_1==LPAREN) ) {
					alt18=8;
				}
				else if ( (LA18_1==ASSIGN||LA18_1==LBRACK) ) {
					alt18=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt18=2;
				}
				break;
			case WHILE:
				{
				alt18=3;
				}
				break;
			case FOR:
				{
				alt18=4;
				}
				break;
			case BREAK:
				{
				alt18=5;
				}
				break;
			case RETURN:
				{
				alt18=6;
				}
				break;
			case BEGIN:
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
					// /Users/twb/repos/Tiger/tiger.g:136:4: value ASSIGN stat_assignment
					{
					pushFollow(FOLLOW_value_in_stat680);
					value89=value();
					state._fsp--;

					stream_value.add(value89.getTree());
					ASSIGN90=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat682);  
					stream_ASSIGN.add(ASSIGN90);

					pushFollow(FOLLOW_stat_assignment_in_stat684);
					stat_assignment91=stat_assignment();
					state._fsp--;

					stream_stat_assignment.add(stat_assignment91.getTree());
					// AST REWRITE
					// elements: stat_assignment, ASSIGN, value
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 136:33: -> ^( ASSIGN value stat_assignment )
					{
						// /Users/twb/repos/Tiger/tiger.g:136:36: ^( ASSIGN value stat_assignment )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
						adaptor.addChild(root_1, stream_value.nextTree());
						adaptor.addChild(root_1, stream_stat_assignment.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:137:4: if_stmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmt_in_stat699);
					if_stmt92=if_stmt();
					state._fsp--;

					adaptor.addChild(root_0, if_stmt92.getTree());

					}
					break;
				case 3 :
					// /Users/twb/repos/Tiger/tiger.g:138:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					{
					// /Users/twb/repos/Tiger/tiger.g:138:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					// /Users/twb/repos/Tiger/tiger.g:138:5: WHILE expr DO stat_seq ENDDO SEMI
					{
					WHILE93=(Token)match(input,WHILE,FOLLOW_WHILE_in_stat705);  
					stream_WHILE.add(WHILE93);

					pushFollow(FOLLOW_expr_in_stat707);
					expr94=expr();
					state._fsp--;

					stream_expr.add(expr94.getTree());
					DO95=(Token)match(input,DO,FOLLOW_DO_in_stat709);  
					stream_DO.add(DO95);

					pushFollow(FOLLOW_stat_seq_in_stat711);
					stat_seq96=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq96.getTree());
					ENDDO97=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat713);  
					stream_ENDDO.add(ENDDO97);

					SEMI98=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat715);  
					stream_SEMI.add(SEMI98);

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
					// 138:40: -> ^( WHILE expr stat_seq )
					{
						// /Users/twb/repos/Tiger/tiger.g:138:43: ^( WHILE expr stat_seq )
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
				case 4 :
					// /Users/twb/repos/Tiger/tiger.g:139:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					{
					// /Users/twb/repos/Tiger/tiger.g:139:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					// /Users/twb/repos/Tiger/tiger.g:139:5: FOR ID ASSIGN range DO stat_seq ENDDO SEMI
					{
					FOR99=(Token)match(input,FOR,FOLLOW_FOR_in_stat732);  
					stream_FOR.add(FOR99);

					ID100=(Token)match(input,ID,FOLLOW_ID_in_stat734);  
					stream_ID.add(ID100);

					ASSIGN101=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat736);  
					stream_ASSIGN.add(ASSIGN101);

					pushFollow(FOLLOW_range_in_stat738);
					range102=range();
					state._fsp--;

					stream_range.add(range102.getTree());
					DO103=(Token)match(input,DO,FOLLOW_DO_in_stat740);  
					stream_DO.add(DO103);

					pushFollow(FOLLOW_stat_seq_in_stat742);
					stat_seq104=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq104.getTree());
					ENDDO105=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat744);  
					stream_ENDDO.add(ENDDO105);

					SEMI106=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat746);  
					stream_SEMI.add(SEMI106);

					}

					// AST REWRITE
					// elements: stat_seq, FOR, range
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 139:49: -> ^( FOR range stat_seq )
					{
						// /Users/twb/repos/Tiger/tiger.g:139:52: ^( FOR range stat_seq )
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
				case 5 :
					// /Users/twb/repos/Tiger/tiger.g:140:4: BREAK SEMI
					{
					BREAK107=(Token)match(input,BREAK,FOLLOW_BREAK_in_stat762);  
					stream_BREAK.add(BREAK107);

					SEMI108=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat764);  
					stream_SEMI.add(SEMI108);

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
					// 140:15: -> BREAK
					{
						adaptor.addChild(root_0, stream_BREAK.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/twb/repos/Tiger/tiger.g:141:4: RETURN expr SEMI
					{
					root_0 = (Object)adaptor.nil();


					RETURN109=(Token)match(input,RETURN,FOLLOW_RETURN_in_stat773); 
					RETURN109_tree = (Object)adaptor.create(RETURN109);
					adaptor.addChild(root_0, RETURN109_tree);

					pushFollow(FOLLOW_expr_in_stat775);
					expr110=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr110.getTree());

					SEMI111=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat777); 
					SEMI111_tree = (Object)adaptor.create(SEMI111);
					adaptor.addChild(root_0, SEMI111_tree);

					}
					break;
				case 7 :
					// /Users/twb/repos/Tiger/tiger.g:142:4: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat782);
					block112=block();
					state._fsp--;

					adaptor.addChild(root_0, block112.getTree());

					}
					break;
				case 8 :
					// /Users/twb/repos/Tiger/tiger.g:143:4: funct_call SEMI
					{
					pushFollow(FOLLOW_funct_call_in_stat787);
					funct_call113=funct_call();
					state._fsp--;

					stream_funct_call.add(funct_call113.getTree());
					SEMI114=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat789);  
					stream_SEMI.add(SEMI114);

					// AST REWRITE
					// elements: funct_call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 143:20: -> funct_call
					{
						adaptor.addChild(root_0, stream_funct_call.nextTree());
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
	// $ANTLR end "stat"


	public static class range_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "range"
	// /Users/twb/repos/Tiger/tiger.g:146:1: range : (start= index_expr TO stop= index_expr ) -> ^( TO $start $stop) ;
	public final tigerParser.range_return range() throws RecognitionException {
		tigerParser.range_return retval = new tigerParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO115=null;
		ParserRuleReturnScope start =null;
		ParserRuleReturnScope stop =null;

		Object TO115_tree=null;
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// /Users/twb/repos/Tiger/tiger.g:147:2: ( (start= index_expr TO stop= index_expr ) -> ^( TO $start $stop) )
			// /Users/twb/repos/Tiger/tiger.g:147:4: (start= index_expr TO stop= index_expr )
			{
			// /Users/twb/repos/Tiger/tiger.g:147:4: (start= index_expr TO stop= index_expr )
			// /Users/twb/repos/Tiger/tiger.g:147:5: start= index_expr TO stop= index_expr
			{
			pushFollow(FOLLOW_index_expr_in_range807);
			start=index_expr();
			state._fsp--;

			stream_index_expr.add(start.getTree());
			TO115=(Token)match(input,TO,FOLLOW_TO_in_range809);  
			stream_TO.add(TO115);

			pushFollow(FOLLOW_index_expr_in_range813);
			stop=index_expr();
			state._fsp--;

			stream_index_expr.add(stop.getTree());
			}

			// AST REWRITE
			// elements: TO, start, stop
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
			// 147:42: -> ^( TO $start $stop)
			{
				// /Users/twb/repos/Tiger/tiger.g:147:45: ^( TO $start $stop)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_TO.nextNode(), root_1);
				adaptor.addChild(root_1, stream_start.nextTree());
				adaptor.addChild(root_1, stream_stop.nextTree());
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
	// $ANTLR end "range"


	public static class stat_assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat_assignment"
	// /Users/twb/repos/Tiger/tiger.g:150:1: stat_assignment : ( expr SEMI -> expr | IF LPAREN expr_list RPAREN SEMI );
	public final tigerParser.stat_assignment_return stat_assignment() throws RecognitionException {
		tigerParser.stat_assignment_return retval = new tigerParser.stat_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMI117=null;
		Token IF118=null;
		Token LPAREN119=null;
		Token RPAREN121=null;
		Token SEMI122=null;
		ParserRuleReturnScope expr116 =null;
		ParserRuleReturnScope expr_list120 =null;

		Object SEMI117_tree=null;
		Object IF118_tree=null;
		Object LPAREN119_tree=null;
		Object RPAREN121_tree=null;
		Object SEMI122_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/twb/repos/Tiger/tiger.g:151:2: ( expr SEMI -> expr | IF LPAREN expr_list RPAREN SEMI )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==FIXEDPTLIT||LA19_0==ID||LA19_0==INTLIT||LA19_0==LPAREN) ) {
				alt19=1;
			}
			else if ( (LA19_0==IF) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:151:4: expr SEMI
					{
					pushFollow(FOLLOW_expr_in_stat_assignment837);
					expr116=expr();
					state._fsp--;

					stream_expr.add(expr116.getTree());
					SEMI117=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat_assignment839);  
					stream_SEMI.add(SEMI117);

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
					// 151:14: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:152:4: IF LPAREN expr_list RPAREN SEMI
					{
					root_0 = (Object)adaptor.nil();


					IF118=(Token)match(input,IF,FOLLOW_IF_in_stat_assignment848); 
					IF118_tree = (Object)adaptor.create(IF118);
					adaptor.addChild(root_0, IF118_tree);

					LPAREN119=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stat_assignment850); 
					LPAREN119_tree = (Object)adaptor.create(LPAREN119);
					adaptor.addChild(root_0, LPAREN119_tree);

					pushFollow(FOLLOW_expr_list_in_stat_assignment852);
					expr_list120=expr_list();
					state._fsp--;

					adaptor.addChild(root_0, expr_list120.getTree());

					RPAREN121=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stat_assignment854); 
					RPAREN121_tree = (Object)adaptor.create(RPAREN121);
					adaptor.addChild(root_0, RPAREN121_tree);

					SEMI122=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat_assignment856); 
					SEMI122_tree = (Object)adaptor.create(SEMI122);
					adaptor.addChild(root_0, SEMI122_tree);

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
	// $ANTLR end "stat_assignment"


	public static class if_stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_stmt"
	// /Users/twb/repos/Tiger/tiger.g:155:1: if_stmt : IF expr THEN stat_seq if_tail ;
	public final tigerParser.if_stmt_return if_stmt() throws RecognitionException {
		tigerParser.if_stmt_return retval = new tigerParser.if_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF123=null;
		Token THEN125=null;
		ParserRuleReturnScope expr124 =null;
		ParserRuleReturnScope stat_seq126 =null;
		ParserRuleReturnScope if_tail127 =null;

		Object IF123_tree=null;
		Object THEN125_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:156:2: ( IF expr THEN stat_seq if_tail )
			// /Users/twb/repos/Tiger/tiger.g:156:4: IF expr THEN stat_seq if_tail
			{
			root_0 = (Object)adaptor.nil();


			IF123=(Token)match(input,IF,FOLLOW_IF_in_if_stmt867); 
			IF123_tree = (Object)adaptor.create(IF123);
			adaptor.addChild(root_0, IF123_tree);

			pushFollow(FOLLOW_expr_in_if_stmt869);
			expr124=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr124.getTree());

			THEN125=(Token)match(input,THEN,FOLLOW_THEN_in_if_stmt871); 
			THEN125_tree = (Object)adaptor.create(THEN125);
			adaptor.addChild(root_0, THEN125_tree);

			pushFollow(FOLLOW_stat_seq_in_if_stmt873);
			stat_seq126=stat_seq();
			state._fsp--;

			adaptor.addChild(root_0, stat_seq126.getTree());

			pushFollow(FOLLOW_if_tail_in_if_stmt875);
			if_tail127=if_tail();
			state._fsp--;

			adaptor.addChild(root_0, if_tail127.getTree());

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


	public static class if_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_tail"
	// /Users/twb/repos/Tiger/tiger.g:159:1: if_tail : ( ELSE stat_seq ENDIF SEMI | ENDIF SEMI );
	public final tigerParser.if_tail_return if_tail() throws RecognitionException {
		tigerParser.if_tail_return retval = new tigerParser.if_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE128=null;
		Token ENDIF130=null;
		Token SEMI131=null;
		Token ENDIF132=null;
		Token SEMI133=null;
		ParserRuleReturnScope stat_seq129 =null;

		Object ELSE128_tree=null;
		Object ENDIF130_tree=null;
		Object SEMI131_tree=null;
		Object ENDIF132_tree=null;
		Object SEMI133_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:160:2: ( ELSE stat_seq ENDIF SEMI | ENDIF SEMI )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ELSE) ) {
				alt20=1;
			}
			else if ( (LA20_0==ENDIF) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:160:4: ELSE stat_seq ENDIF SEMI
					{
					root_0 = (Object)adaptor.nil();


					ELSE128=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_tail886); 
					ELSE128_tree = (Object)adaptor.create(ELSE128);
					adaptor.addChild(root_0, ELSE128_tree);

					pushFollow(FOLLOW_stat_seq_in_if_tail888);
					stat_seq129=stat_seq();
					state._fsp--;

					adaptor.addChild(root_0, stat_seq129.getTree());

					ENDIF130=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_tail890); 
					ENDIF130_tree = (Object)adaptor.create(ENDIF130);
					adaptor.addChild(root_0, ENDIF130_tree);

					SEMI131=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_tail892); 
					SEMI131_tree = (Object)adaptor.create(SEMI131);
					adaptor.addChild(root_0, SEMI131_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:161:4: ENDIF SEMI
					{
					root_0 = (Object)adaptor.nil();


					ENDIF132=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_tail897); 
					ENDIF132_tree = (Object)adaptor.create(ENDIF132);
					adaptor.addChild(root_0, ENDIF132_tree);

					SEMI133=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_tail899); 
					SEMI133_tree = (Object)adaptor.create(SEMI133);
					adaptor.addChild(root_0, SEMI133_tree);

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
	// $ANTLR end "if_tail"


	public static class opt_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "opt_prefix"
	// /Users/twb/repos/Tiger/tiger.g:164:1: opt_prefix : ( value ASSIGN |);
	public final tigerParser.opt_prefix_return opt_prefix() throws RecognitionException {
		tigerParser.opt_prefix_return retval = new tigerParser.opt_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN135=null;
		ParserRuleReturnScope value134 =null;

		Object ASSIGN135_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:165:2: ( value ASSIGN |)
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ID) ) {
				alt21=1;
			}
			else if ( (LA21_0==EOF) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:165:4: value ASSIGN
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_value_in_opt_prefix910);
					value134=value();
					state._fsp--;

					adaptor.addChild(root_0, value134.getTree());

					ASSIGN135=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_opt_prefix912); 
					ASSIGN135_tree = (Object)adaptor.create(ASSIGN135);
					adaptor.addChild(root_0, ASSIGN135_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:167:2: 
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
	// /Users/twb/repos/Tiger/tiger.g:169:1: constant : ( INTLIT | FIXEDPTLIT );
	public final tigerParser.constant_return constant() throws RecognitionException {
		tigerParser.constant_return retval = new tigerParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set136=null;

		Object set136_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:170:2: ( INTLIT | FIXEDPTLIT )
			// /Users/twb/repos/Tiger/tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set136=input.LT(1);
			if ( input.LA(1)==FIXEDPTLIT||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set136));
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
	// /Users/twb/repos/Tiger/tiger.g:174:1: binary_operator : ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LESSER EQ | GREATER EQ | AND | OR );
	public final tigerParser.binary_operator_return binary_operator() throws RecognitionException {
		tigerParser.binary_operator_return retval = new tigerParser.binary_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS137=null;
		Token MINUS138=null;
		Token MULT139=null;
		Token DIV140=null;
		Token EQ141=null;
		Token NEQ142=null;
		Token LESSER143=null;
		Token GREATER144=null;
		Token LESSER145=null;
		Token EQ146=null;
		Token GREATER147=null;
		Token EQ148=null;
		Token AND149=null;
		Token OR150=null;

		Object PLUS137_tree=null;
		Object MINUS138_tree=null;
		Object MULT139_tree=null;
		Object DIV140_tree=null;
		Object EQ141_tree=null;
		Object NEQ142_tree=null;
		Object LESSER143_tree=null;
		Object GREATER144_tree=null;
		Object LESSER145_tree=null;
		Object EQ146_tree=null;
		Object GREATER147_tree=null;
		Object EQ148_tree=null;
		Object AND149_tree=null;
		Object OR150_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:175:2: ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LESSER EQ | GREATER EQ | AND | OR )
			int alt22=12;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt22=1;
				}
				break;
			case MINUS:
				{
				alt22=2;
				}
				break;
			case MULT:
				{
				alt22=3;
				}
				break;
			case DIV:
				{
				alt22=4;
				}
				break;
			case EQ:
				{
				alt22=5;
				}
				break;
			case NEQ:
				{
				alt22=6;
				}
				break;
			case LESSER:
				{
				int LA22_7 = input.LA(2);
				if ( (LA22_7==EQ) ) {
					alt22=9;
				}
				else if ( (LA22_7==FIXEDPTLIT||LA22_7==ID||LA22_7==INTLIT||LA22_7==LPAREN) ) {
					alt22=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case GREATER:
				{
				int LA22_8 = input.LA(2);
				if ( (LA22_8==EQ) ) {
					alt22=10;
				}
				else if ( (LA22_8==FIXEDPTLIT||LA22_8==ID||LA22_8==INTLIT||LA22_8==LPAREN) ) {
					alt22=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AND:
				{
				alt22=11;
				}
				break;
			case OR:
				{
				alt22=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:175:4: PLUS
					{
					root_0 = (Object)adaptor.nil();


					PLUS137=(Token)match(input,PLUS,FOLLOW_PLUS_in_binary_operator944); 
					PLUS137_tree = (Object)adaptor.create(PLUS137);
					adaptor.addChild(root_0, PLUS137_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:176:4: MINUS
					{
					root_0 = (Object)adaptor.nil();


					MINUS138=(Token)match(input,MINUS,FOLLOW_MINUS_in_binary_operator949); 
					MINUS138_tree = (Object)adaptor.create(MINUS138);
					adaptor.addChild(root_0, MINUS138_tree);

					}
					break;
				case 3 :
					// /Users/twb/repos/Tiger/tiger.g:177:4: MULT
					{
					root_0 = (Object)adaptor.nil();


					MULT139=(Token)match(input,MULT,FOLLOW_MULT_in_binary_operator954); 
					MULT139_tree = (Object)adaptor.create(MULT139);
					adaptor.addChild(root_0, MULT139_tree);

					}
					break;
				case 4 :
					// /Users/twb/repos/Tiger/tiger.g:178:4: DIV
					{
					root_0 = (Object)adaptor.nil();


					DIV140=(Token)match(input,DIV,FOLLOW_DIV_in_binary_operator959); 
					DIV140_tree = (Object)adaptor.create(DIV140);
					adaptor.addChild(root_0, DIV140_tree);

					}
					break;
				case 5 :
					// /Users/twb/repos/Tiger/tiger.g:179:4: EQ
					{
					root_0 = (Object)adaptor.nil();


					EQ141=(Token)match(input,EQ,FOLLOW_EQ_in_binary_operator964); 
					EQ141_tree = (Object)adaptor.create(EQ141);
					adaptor.addChild(root_0, EQ141_tree);

					}
					break;
				case 6 :
					// /Users/twb/repos/Tiger/tiger.g:180:4: NEQ
					{
					root_0 = (Object)adaptor.nil();


					NEQ142=(Token)match(input,NEQ,FOLLOW_NEQ_in_binary_operator969); 
					NEQ142_tree = (Object)adaptor.create(NEQ142);
					adaptor.addChild(root_0, NEQ142_tree);

					}
					break;
				case 7 :
					// /Users/twb/repos/Tiger/tiger.g:181:4: LESSER
					{
					root_0 = (Object)adaptor.nil();


					LESSER143=(Token)match(input,LESSER,FOLLOW_LESSER_in_binary_operator974); 
					LESSER143_tree = (Object)adaptor.create(LESSER143);
					adaptor.addChild(root_0, LESSER143_tree);

					}
					break;
				case 8 :
					// /Users/twb/repos/Tiger/tiger.g:182:4: GREATER
					{
					root_0 = (Object)adaptor.nil();


					GREATER144=(Token)match(input,GREATER,FOLLOW_GREATER_in_binary_operator979); 
					GREATER144_tree = (Object)adaptor.create(GREATER144);
					adaptor.addChild(root_0, GREATER144_tree);

					}
					break;
				case 9 :
					// /Users/twb/repos/Tiger/tiger.g:183:4: LESSER EQ
					{
					root_0 = (Object)adaptor.nil();


					LESSER145=(Token)match(input,LESSER,FOLLOW_LESSER_in_binary_operator984); 
					LESSER145_tree = (Object)adaptor.create(LESSER145);
					adaptor.addChild(root_0, LESSER145_tree);

					EQ146=(Token)match(input,EQ,FOLLOW_EQ_in_binary_operator986); 
					EQ146_tree = (Object)adaptor.create(EQ146);
					adaptor.addChild(root_0, EQ146_tree);

					}
					break;
				case 10 :
					// /Users/twb/repos/Tiger/tiger.g:184:4: GREATER EQ
					{
					root_0 = (Object)adaptor.nil();


					GREATER147=(Token)match(input,GREATER,FOLLOW_GREATER_in_binary_operator991); 
					GREATER147_tree = (Object)adaptor.create(GREATER147);
					adaptor.addChild(root_0, GREATER147_tree);

					EQ148=(Token)match(input,EQ,FOLLOW_EQ_in_binary_operator993); 
					EQ148_tree = (Object)adaptor.create(EQ148);
					adaptor.addChild(root_0, EQ148_tree);

					}
					break;
				case 11 :
					// /Users/twb/repos/Tiger/tiger.g:185:4: AND
					{
					root_0 = (Object)adaptor.nil();


					AND149=(Token)match(input,AND,FOLLOW_AND_in_binary_operator998); 
					AND149_tree = (Object)adaptor.create(AND149);
					adaptor.addChild(root_0, AND149_tree);

					}
					break;
				case 12 :
					// /Users/twb/repos/Tiger/tiger.g:186:4: OR
					{
					root_0 = (Object)adaptor.nil();


					OR150=(Token)match(input,OR,FOLLOW_OR_in_binary_operator1003); 
					OR150_tree = (Object)adaptor.create(OR150);
					adaptor.addChild(root_0, OR150_tree);

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
	// $ANTLR end "binary_operator"


	public static class value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
	// /Users/twb/repos/Tiger/tiger.g:189:1: value : ID value_tail ;
	public final tigerParser.value_return value() throws RecognitionException {
		tigerParser.value_return retval = new tigerParser.value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID151=null;
		ParserRuleReturnScope value_tail152 =null;

		Object ID151_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:190:2: ( ID value_tail )
			// /Users/twb/repos/Tiger/tiger.g:190:4: ID value_tail
			{
			root_0 = (Object)adaptor.nil();


			ID151=(Token)match(input,ID,FOLLOW_ID_in_value1014); 
			ID151_tree = (Object)adaptor.create(ID151);
			adaptor.addChild(root_0, ID151_tree);

			pushFollow(FOLLOW_value_tail_in_value1016);
			value_tail152=value_tail();
			state._fsp--;

			adaptor.addChild(root_0, value_tail152.getTree());

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


	public static class value_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_tail"
	// /Users/twb/repos/Tiger/tiger.g:193:1: value_tail : ( array_index ( array_index )? |);
	public final tigerParser.value_tail_return value_tail() throws RecognitionException {
		tigerParser.value_tail_return retval = new tigerParser.value_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_index153 =null;
		ParserRuleReturnScope array_index154 =null;


		try {
			// /Users/twb/repos/Tiger/tiger.g:194:2: ( array_index ( array_index )? |)
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LBRACK) ) {
				alt24=1;
			}
			else if ( (LA24_0==AND||LA24_0==ASSIGN||LA24_0==COMMA||(LA24_0 >= DIV && LA24_0 <= DO)||LA24_0==EQ||LA24_0==GREATER||LA24_0==LESSER||(LA24_0 >= MINUS && LA24_0 <= NEQ)||(LA24_0 >= OR && LA24_0 <= PLUS)||(LA24_0 >= RPAREN && LA24_0 <= THEN)) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:194:4: array_index ( array_index )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_index_in_value_tail1027);
					array_index153=array_index();
					state._fsp--;

					adaptor.addChild(root_0, array_index153.getTree());

					// /Users/twb/repos/Tiger/tiger.g:194:16: ( array_index )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LBRACK) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/twb/repos/Tiger/tiger.g:194:16: array_index
							{
							pushFollow(FOLLOW_array_index_in_value_tail1029);
							array_index154=array_index();
							state._fsp--;

							adaptor.addChild(root_0, array_index154.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/tiger.g:196:2: 
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
	// $ANTLR end "value_tail"


	public static class array_index_const_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_index_const"
	// /Users/twb/repos/Tiger/tiger.g:198:1: array_index_const : ( LBRACK INTLIT RBRACK ) -> INTLIT ;
	public final tigerParser.array_index_const_return array_index_const() throws RecognitionException {
		tigerParser.array_index_const_return retval = new tigerParser.array_index_const_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK155=null;
		Token INTLIT156=null;
		Token RBRACK157=null;

		Object LBRACK155_tree=null;
		Object INTLIT156_tree=null;
		Object RBRACK157_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");

		try {
			// /Users/twb/repos/Tiger/tiger.g:199:2: ( ( LBRACK INTLIT RBRACK ) -> INTLIT )
			// /Users/twb/repos/Tiger/tiger.g:199:4: ( LBRACK INTLIT RBRACK )
			{
			// /Users/twb/repos/Tiger/tiger.g:199:4: ( LBRACK INTLIT RBRACK )
			// /Users/twb/repos/Tiger/tiger.g:199:5: LBRACK INTLIT RBRACK
			{
			LBRACK155=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_index_const1046);  
			stream_LBRACK.add(LBRACK155);

			INTLIT156=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_array_index_const1048);  
			stream_INTLIT.add(INTLIT156);

			RBRACK157=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_index_const1050);  
			stream_RBRACK.add(RBRACK157);

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
			// 199:27: -> INTLIT
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
	// $ANTLR end "array_index_const"


	public static class array_index_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_index"
	// /Users/twb/repos/Tiger/tiger.g:202:1: array_index : ( LBRACK index_expr RBRACK ) -> index_expr ;
	public final tigerParser.array_index_return array_index() throws RecognitionException {
		tigerParser.array_index_return retval = new tigerParser.array_index_return();
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
			// /Users/twb/repos/Tiger/tiger.g:203:2: ( ( LBRACK index_expr RBRACK ) -> index_expr )
			// /Users/twb/repos/Tiger/tiger.g:203:4: ( LBRACK index_expr RBRACK )
			{
			// /Users/twb/repos/Tiger/tiger.g:203:4: ( LBRACK index_expr RBRACK )
			// /Users/twb/repos/Tiger/tiger.g:203:5: LBRACK index_expr RBRACK
			{
			LBRACK158=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_index1067);  
			stream_LBRACK.add(LBRACK158);

			pushFollow(FOLLOW_index_expr_in_array_index1069);
			index_expr159=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr159.getTree());
			RBRACK160=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_index1071);  
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
			// 203:31: -> index_expr
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
	// $ANTLR end "array_index"


	public static class index_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr"
	// /Users/twb/repos/Tiger/tiger.g:206:1: index_expr : ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* ;
	public final tigerParser.index_expr_return index_expr() throws RecognitionException {
		tigerParser.index_expr_return retval = new tigerParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set161=null;
		ParserRuleReturnScope index_oper162 =null;
		ParserRuleReturnScope index_expr163 =null;

		Object set161_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:207:2: ( ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* )
			// /Users/twb/repos/Tiger/tiger.g:207:4: ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )*
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
			// /Users/twb/repos/Tiger/tiger.g:207:18: ( options {greedy=true; } : index_oper index_expr )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= MINUS && LA25_0 <= MULT)||LA25_0==PLUS) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /Users/twb/repos/Tiger/tiger.g:207:42: index_oper index_expr
					{
					pushFollow(FOLLOW_index_oper_in_index_expr1104);
					index_oper162=index_oper();
					state._fsp--;

					adaptor.addChild(root_0, index_oper162.getTree());

					pushFollow(FOLLOW_index_expr_in_index_expr1106);
					index_expr163=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr163.getTree());

					}
					break;

				default :
					break loop25;
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
	// /Users/twb/repos/Tiger/tiger.g:210:1: index_oper : ( PLUS | MINUS | MULT );
	public final tigerParser.index_oper_return index_oper() throws RecognitionException {
		tigerParser.index_oper_return retval = new tigerParser.index_oper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set164=null;

		Object set164_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:211:2: ( PLUS | MINUS | MULT )
			// /Users/twb/repos/Tiger/tiger.g:
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


	public static class funct_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "funct_call"
	// /Users/twb/repos/Tiger/tiger.g:216:1: funct_call : ID LPAREN id_list RPAREN ;
	public final tigerParser.funct_call_return funct_call() throws RecognitionException {
		tigerParser.funct_call_return retval = new tigerParser.funct_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID165=null;
		Token LPAREN166=null;
		Token RPAREN168=null;
		ParserRuleReturnScope id_list167 =null;

		Object ID165_tree=null;
		Object LPAREN166_tree=null;
		Object RPAREN168_tree=null;

		try {
			// /Users/twb/repos/Tiger/tiger.g:217:2: ( ID LPAREN id_list RPAREN )
			// /Users/twb/repos/Tiger/tiger.g:217:4: ID LPAREN id_list RPAREN
			{
			root_0 = (Object)adaptor.nil();


			ID165=(Token)match(input,ID,FOLLOW_ID_in_funct_call1140); 
			ID165_tree = (Object)adaptor.create(ID165);
			adaptor.addChild(root_0, ID165_tree);

			LPAREN166=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funct_call1142); 
			LPAREN166_tree = (Object)adaptor.create(LPAREN166);
			adaptor.addChild(root_0, LPAREN166_tree);

			pushFollow(FOLLOW_id_list_in_funct_call1144);
			id_list167=id_list();
			state._fsp--;

			adaptor.addChild(root_0, id_list167.getTree());

			RPAREN168=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funct_call1146); 
			RPAREN168_tree = (Object)adaptor.create(RPAREN168);
			adaptor.addChild(root_0, RPAREN168_tree);

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
	// $ANTLR end "funct_call"

	// Delegated rules



	public static final BitSet FOLLOW_type_declaration_list_in_tiger_program45 = new BitSet(new long[]{0x0002000014100000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_tiger_program47 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_main_function_in_tiger_program49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_list58 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_type_declaration_list_in_type_declaration_list60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration76 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_type_declaration78 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration80 = new BitSet(new long[]{0x0000000010100020L});
	public static final BitSet FOLLOW_type_in_type_declaration82 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_declaration_in_funct_declaration_list106 = new BitSet(new long[]{0x0002000014100000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_type_in_funct_declaration123 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_FUNCTION_in_funct_declaration125 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_funct_declaration127 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_declaration129 = new BitSet(new long[]{0x0000080004000000L});
	public static final BitSet FOLLOW_param_list_in_funct_declaration131 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_declaration133 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_funct_declaration135 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_funct_declaration137 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_funct_declaration139 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_funct_declaration141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_main_function154 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_MAIN_in_main_function156 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_main_function158 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_main_function160 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_main_function162 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_main_function164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_ret_type186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_ret_type192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list203 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail221 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_param_in_param_list_tail223 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_tail225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_param242 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_param244 = new BitSet(new long[]{0x0000000014100000L});
	public static final BitSet FOLLOW_type_id_in_param246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list258 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail271 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block289 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_declaration_segment_in_block293 = new BitSet(new long[]{0x000404000C410280L});
	public static final BitSet FOLLOW_stat_seq_in_block295 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_block297 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_block299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_list_in_declaration_segment356 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_declaration_segment358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_list369 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_var_declaration_list371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type392 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_array_index_const_in_type394 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_OF_in_type396 = new BitSet(new long[]{0x0000000010100000L});
	public static final BitSet FOLLOW_base_type_in_type398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type415 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_array_index_const_in_type419 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_array_index_const_in_type423 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_OF_in_type425 = new BitSet(new long[]{0x0000000010100000L});
	public static final BitSet FOLLOW_base_type_in_type427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_id458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration486 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration488 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_var_declaration490 = new BitSet(new long[]{0x0000000014100000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration492 = new BitSet(new long[]{0x0000100000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration494 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init520 = new BitSet(new long[]{0x0000000020200000L});
	public static final BitSet FOLLOW_constant_in_optional_init522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list547 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_COMMA_in_id_list549 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_id_list_in_id_list551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_int573 = new BitSet(new long[]{0x0000000020200000L});
	public static final BitSet FOLLOW_constant_in_optional_int575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq591 = new BitSet(new long[]{0x000404000C400282L});
	public static final BitSet FOLLOW_constant_in_expr605 = new BitSet(new long[]{0x000001B881082012L});
	public static final BitSet FOLLOW_value_in_expr609 = new BitSet(new long[]{0x000001B881082012L});
	public static final BitSet FOLLOW_LPAREN_in_expr613 = new BitSet(new long[]{0x0000000224200000L});
	public static final BitSet FOLLOW_expr_in_expr615 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr617 = new BitSet(new long[]{0x000001B881082012L});
	public static final BitSet FOLLOW_binary_operator_in_expr628 = new BitSet(new long[]{0x0000000224200000L});
	public static final BitSet FOLLOW_expr_in_expr631 = new BitSet(new long[]{0x000001B881082012L});
	public static final BitSet FOLLOW_expr_in_expr_list644 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail661 = new BitSet(new long[]{0x0000000224200000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail663 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_stat680 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat682 = new BitSet(new long[]{0x000000022C200000L});
	public static final BitSet FOLLOW_stat_assignment_in_stat684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_stat699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat705 = new BitSet(new long[]{0x0000000224200000L});
	public static final BitSet FOLLOW_expr_in_stat707 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat709 = new BitSet(new long[]{0x000404000C420280L});
	public static final BitSet FOLLOW_stat_seq_in_stat711 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat713 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat732 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_stat734 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat736 = new BitSet(new long[]{0x0000000024000000L});
	public static final BitSet FOLLOW_range_in_stat738 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat740 = new BitSet(new long[]{0x000404000C420280L});
	public static final BitSet FOLLOW_stat_seq_in_stat742 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat744 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat762 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat773 = new BitSet(new long[]{0x0000000224200000L});
	public static final BitSet FOLLOW_expr_in_stat775 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_call_in_stat787 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_range807 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_TO_in_range809 = new BitSet(new long[]{0x0000000024000000L});
	public static final BitSet FOLLOW_index_expr_in_range813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_stat_assignment837 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat_assignment839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_stat_assignment848 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_stat_assignment850 = new BitSet(new long[]{0x0000080224200000L});
	public static final BitSet FOLLOW_expr_list_in_stat_assignment852 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat_assignment854 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat_assignment856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt867 = new BitSet(new long[]{0x0000000224200000L});
	public static final BitSet FOLLOW_expr_in_if_stmt869 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_THEN_in_if_stmt871 = new BitSet(new long[]{0x000404000C448280L});
	public static final BitSet FOLLOW_stat_seq_in_if_stmt873 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_if_tail_in_if_stmt875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_tail886 = new BitSet(new long[]{0x000404000C440280L});
	public static final BitSet FOLLOW_stat_seq_in_if_tail888 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDIF_in_if_tail890 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_tail892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENDIF_in_if_tail897 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_tail899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_opt_prefix910 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_opt_prefix912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_binary_operator944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_binary_operator949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_binary_operator954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIV_in_binary_operator959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_binary_operator964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_binary_operator969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_binary_operator974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_binary_operator979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_binary_operator984 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_binary_operator986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_binary_operator991 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_binary_operator993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_binary_operator998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_binary_operator1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1014 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_value_tail_in_value1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_index_in_value_tail1027 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_array_index_in_value_tail1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_index_const1046 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_INTLIT_in_array_index_const1048 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_index_const1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_index1067 = new BitSet(new long[]{0x0000000024000000L});
	public static final BitSet FOLLOW_index_expr_in_array_index1069 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_index1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_index_expr1087 = new BitSet(new long[]{0x0000011800000002L});
	public static final BitSet FOLLOW_index_oper_in_index_expr1104 = new BitSet(new long[]{0x0000000024000000L});
	public static final BitSet FOLLOW_index_expr_in_index_expr1106 = new BitSet(new long[]{0x0000011800000002L});
	public static final BitSet FOLLOW_ID_in_funct_call1140 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_call1142 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_id_list_in_funct_call1144 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_call1146 = new BitSet(new long[]{0x0000000000000002L});
}
