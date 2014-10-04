// $ANTLR 3.5.1 /Users/twb/repos/Tiger/Tiger.g 2014-10-04 17:48:22

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
		"FUNCTION_DEFINITIONS", "GREATER", "GREATEREQ", "ID", "IDS", "IF", "INT", 
		"INTLIT", "INVOKE", "LBRACK", "LESSER", "LESSEREQ", "LPAREN", "MAIN", 
		"MINUS", "MULT", "NEQ", "OF", "OR", "PARAMS", "PLUS", "PROGRAM", "RBRACK", 
		"RETURN", "RPAREN", "SEMI", "THEN", "TO", "TYPE", "TYPES_DEFINITIONS", 
		"VAR", "VOID", "WHILE", "WS"
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
	public static final int FUNCTION_DEFINITIONS=25;
	public static final int GREATER=26;
	public static final int GREATEREQ=27;
	public static final int ID=28;
	public static final int IDS=29;
	public static final int IF=30;
	public static final int INT=31;
	public static final int INTLIT=32;
	public static final int INVOKE=33;
	public static final int LBRACK=34;
	public static final int LESSER=35;
	public static final int LESSEREQ=36;
	public static final int LPAREN=37;
	public static final int MAIN=38;
	public static final int MINUS=39;
	public static final int MULT=40;
	public static final int NEQ=41;
	public static final int OF=42;
	public static final int OR=43;
	public static final int PARAMS=44;
	public static final int PLUS=45;
	public static final int PROGRAM=46;
	public static final int RBRACK=47;
	public static final int RETURN=48;
	public static final int RPAREN=49;
	public static final int SEMI=50;
	public static final int THEN=51;
	public static final int TO=52;
	public static final int TYPE=53;
	public static final int TYPES_DEFINITIONS=54;
	public static final int VAR=55;
	public static final int VOID=56;
	public static final int WHILE=57;
	public static final int WS=58;

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
	// /Users/twb/repos/Tiger/Tiger.g:25:1: tiger_program : ( type_declaration_list funct_declaration_list main_function ) -> ^( PROGRAM type_declaration_list funct_declaration_list main_function ) ;
	public final TigerParser.tiger_program_return tiger_program() throws RecognitionException {
		TigerParser.tiger_program_return retval = new TigerParser.tiger_program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_list1 =null;
		ParserRuleReturnScope funct_declaration_list2 =null;
		ParserRuleReturnScope main_function3 =null;

		RewriteRuleSubtreeStream stream_main_function=new RewriteRuleSubtreeStream(adaptor,"rule main_function");
		RewriteRuleSubtreeStream stream_funct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule funct_declaration_list");
		RewriteRuleSubtreeStream stream_type_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_list");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:25:14: ( ( type_declaration_list funct_declaration_list main_function ) -> ^( PROGRAM type_declaration_list funct_declaration_list main_function ) )
			// /Users/twb/repos/Tiger/Tiger.g:25:16: ( type_declaration_list funct_declaration_list main_function )
			{
			// /Users/twb/repos/Tiger/Tiger.g:25:16: ( type_declaration_list funct_declaration_list main_function )
			// /Users/twb/repos/Tiger/Tiger.g:25:17: type_declaration_list funct_declaration_list main_function
			{
			pushFollow(FOLLOW_type_declaration_list_in_tiger_program82);
			type_declaration_list1=type_declaration_list();
			state._fsp--;

			stream_type_declaration_list.add(type_declaration_list1.getTree());
			pushFollow(FOLLOW_funct_declaration_list_in_tiger_program84);
			funct_declaration_list2=funct_declaration_list();
			state._fsp--;

			stream_funct_declaration_list.add(funct_declaration_list2.getTree());
			pushFollow(FOLLOW_main_function_in_tiger_program86);
			main_function3=main_function();
			state._fsp--;

			stream_main_function.add(main_function3.getTree());
			}

			// AST REWRITE
			// elements: type_declaration_list, funct_declaration_list, main_function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 25:77: -> ^( PROGRAM type_declaration_list funct_declaration_list main_function )
			{
				// /Users/twb/repos/Tiger/Tiger.g:25:80: ^( PROGRAM type_declaration_list funct_declaration_list main_function )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_type_declaration_list.nextTree());
				adaptor.addChild(root_1, stream_funct_declaration_list.nextTree());
				adaptor.addChild(root_1, stream_main_function.nextTree());
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
	// /Users/twb/repos/Tiger/Tiger.g:27:1: type_declaration_list : ( ( type_declaration type_declaration_list ) -> ^( TYPES_DEFINITIONS type_declaration type_declaration_list ) |);
	public final TigerParser.type_declaration_list_return type_declaration_list() throws RecognitionException {
		TigerParser.type_declaration_list_return retval = new TigerParser.type_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration4 =null;
		ParserRuleReturnScope type_declaration_list5 =null;

		RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");
		RewriteRuleSubtreeStream stream_type_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_list");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:28:2: ( ( type_declaration type_declaration_list ) -> ^( TYPES_DEFINITIONS type_declaration type_declaration_list ) |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TYPE) ) {
				alt1=1;
			}
			else if ( (LA1_0==BEGIN||LA1_0==BREAK||(LA1_0 >= ELSE && LA1_0 <= ENDIF)||LA1_0==FIXEDPT||LA1_0==FOR||LA1_0==ID||(LA1_0 >= IF && LA1_0 <= INT)||LA1_0==RETURN||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:28:4: ( type_declaration type_declaration_list )
					{
					// /Users/twb/repos/Tiger/Tiger.g:28:4: ( type_declaration type_declaration_list )
					// /Users/twb/repos/Tiger/Tiger.g:28:5: type_declaration type_declaration_list
					{
					pushFollow(FOLLOW_type_declaration_in_type_declaration_list109);
					type_declaration4=type_declaration();
					state._fsp--;

					stream_type_declaration.add(type_declaration4.getTree());
					pushFollow(FOLLOW_type_declaration_list_in_type_declaration_list111);
					type_declaration_list5=type_declaration_list();
					state._fsp--;

					stream_type_declaration_list.add(type_declaration_list5.getTree());
					}

					// AST REWRITE
					// elements: type_declaration_list, type_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 28:45: -> ^( TYPES_DEFINITIONS type_declaration type_declaration_list )
					{
						// /Users/twb/repos/Tiger/Tiger.g:28:48: ^( TYPES_DEFINITIONS type_declaration type_declaration_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES_DEFINITIONS, "TYPES_DEFINITIONS"), root_1);
						adaptor.addChild(root_1, stream_type_declaration.nextTree());
						adaptor.addChild(root_1, stream_type_declaration_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:30:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:32:1: type_declaration : ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) ;
	public final TigerParser.type_declaration_return type_declaration() throws RecognitionException {
		TigerParser.type_declaration_return retval = new TigerParser.type_declaration_return();
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
			// /Users/twb/repos/Tiger/Tiger.g:33:2: ( ( TYPE ID EQ type SEMI ) -> ^( TYPE ID type ) )
			// /Users/twb/repos/Tiger/Tiger.g:33:4: ( TYPE ID EQ type SEMI )
			{
			// /Users/twb/repos/Tiger/Tiger.g:33:4: ( TYPE ID EQ type SEMI )
			// /Users/twb/repos/Tiger/Tiger.g:33:5: TYPE ID EQ type SEMI
			{
			TYPE6=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_declaration138);  
			stream_TYPE.add(TYPE6);

			ID7=(Token)match(input,ID,FOLLOW_ID_in_type_declaration140);  
			stream_ID.add(ID7);

			EQ8=(Token)match(input,EQ,FOLLOW_EQ_in_type_declaration142);  
			stream_EQ.add(EQ8);

			pushFollow(FOLLOW_type_in_type_declaration144);
			type9=type();
			state._fsp--;

			stream_type.add(type9.getTree());
			SEMI10=(Token)match(input,SEMI,FOLLOW_SEMI_in_type_declaration146);  
			stream_SEMI.add(SEMI10);

			}

			// AST REWRITE
			// elements: ID, type, TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 33:27: -> ^( TYPE ID type )
			{
				// /Users/twb/repos/Tiger/Tiger.g:33:30: ^( TYPE ID type )
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
	// /Users/twb/repos/Tiger/Tiger.g:36:1: funct_declaration_list : ( ( funct_declaration funct_declaration_list ) -> ^( FUNCTION_DEFINITIONS funct_declaration funct_declaration_list ) |);
	public final TigerParser.funct_declaration_list_return funct_declaration_list() throws RecognitionException {
		TigerParser.funct_declaration_list_return retval = new TigerParser.funct_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope funct_declaration11 =null;
		ParserRuleReturnScope funct_declaration_list12 =null;

		RewriteRuleSubtreeStream stream_funct_declaration=new RewriteRuleSubtreeStream(adaptor,"rule funct_declaration");
		RewriteRuleSubtreeStream stream_funct_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule funct_declaration_list");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:37:2: ( ( funct_declaration funct_declaration_list ) -> ^( FUNCTION_DEFINITIONS funct_declaration funct_declaration_list ) |)
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
					// /Users/twb/repos/Tiger/Tiger.g:37:4: ( funct_declaration funct_declaration_list )
					{
					// /Users/twb/repos/Tiger/Tiger.g:37:4: ( funct_declaration funct_declaration_list )
					// /Users/twb/repos/Tiger/Tiger.g:37:5: funct_declaration funct_declaration_list
					{
					pushFollow(FOLLOW_funct_declaration_in_funct_declaration_list169);
					funct_declaration11=funct_declaration();
					state._fsp--;

					stream_funct_declaration.add(funct_declaration11.getTree());
					pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list171);
					funct_declaration_list12=funct_declaration_list();
					state._fsp--;

					stream_funct_declaration_list.add(funct_declaration_list12.getTree());
					}

					// AST REWRITE
					// elements: funct_declaration_list, funct_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 37:47: -> ^( FUNCTION_DEFINITIONS funct_declaration funct_declaration_list )
					{
						// /Users/twb/repos/Tiger/Tiger.g:37:50: ^( FUNCTION_DEFINITIONS funct_declaration funct_declaration_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_DEFINITIONS, "FUNCTION_DEFINITIONS"), root_1);
						adaptor.addChild(root_1, stream_funct_declaration.nextTree());
						adaptor.addChild(root_1, stream_funct_declaration_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:39:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:41:1: funct_declaration : ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI -> ^( FUNCTION ID param_list block_list ) ;
	public final TigerParser.funct_declaration_return funct_declaration() throws RecognitionException {
		TigerParser.funct_declaration_return retval = new TigerParser.funct_declaration_return();
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
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_ret_type=new RewriteRuleSubtreeStream(adaptor,"rule ret_type");
		RewriteRuleSubtreeStream stream_block_list=new RewriteRuleSubtreeStream(adaptor,"rule block_list");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:42:2: ( ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI -> ^( FUNCTION ID param_list block_list ) )
			// /Users/twb/repos/Tiger/Tiger.g:42:4: ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
			{
			pushFollow(FOLLOW_ret_type_in_funct_declaration197);
			ret_type13=ret_type();
			state._fsp--;

			stream_ret_type.add(ret_type13.getTree());
			FUNCTION14=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funct_declaration199);  
			stream_FUNCTION.add(FUNCTION14);

			ID15=(Token)match(input,ID,FOLLOW_ID_in_funct_declaration201);  
			stream_ID.add(ID15);

			LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funct_declaration203);  
			stream_LPAREN.add(LPAREN16);

			pushFollow(FOLLOW_param_list_in_funct_declaration205);
			param_list17=param_list();
			state._fsp--;

			stream_param_list.add(param_list17.getTree());
			RPAREN18=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funct_declaration207);  
			stream_RPAREN.add(RPAREN18);

			BEGIN19=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_funct_declaration209);  
			stream_BEGIN.add(BEGIN19);

			pushFollow(FOLLOW_block_list_in_funct_declaration211);
			block_list20=block_list();
			state._fsp--;

			stream_block_list.add(block_list20.getTree());
			END21=(Token)match(input,END,FOLLOW_END_in_funct_declaration213);  
			stream_END.add(END21);

			SEMI22=(Token)match(input,SEMI,FOLLOW_SEMI_in_funct_declaration215);  
			stream_SEMI.add(SEMI22);

			// AST REWRITE
			// elements: ID, param_list, block_list, FUNCTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 42:76: -> ^( FUNCTION ID param_list block_list )
			{
				// /Users/twb/repos/Tiger/Tiger.g:42:79: ^( FUNCTION ID param_list block_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_param_list.nextTree());
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
	// $ANTLR end "funct_declaration"


	public static class main_function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_function"
	// /Users/twb/repos/Tiger/Tiger.g:45:1: main_function : ( VOID MAIN LPAREN RPAREN block_list EOF ) -> ^( MAIN block_list ) ;
	public final TigerParser.main_function_return main_function() throws RecognitionException {
		TigerParser.main_function_return retval = new TigerParser.main_function_return();
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
			// /Users/twb/repos/Tiger/Tiger.g:46:2: ( ( VOID MAIN LPAREN RPAREN block_list EOF ) -> ^( MAIN block_list ) )
			// /Users/twb/repos/Tiger/Tiger.g:46:4: ( VOID MAIN LPAREN RPAREN block_list EOF )
			{
			// /Users/twb/repos/Tiger/Tiger.g:46:4: ( VOID MAIN LPAREN RPAREN block_list EOF )
			// /Users/twb/repos/Tiger/Tiger.g:46:5: VOID MAIN LPAREN RPAREN block_list EOF
			{
			VOID23=(Token)match(input,VOID,FOLLOW_VOID_in_main_function240);  
			stream_VOID.add(VOID23);

			MAIN24=(Token)match(input,MAIN,FOLLOW_MAIN_in_main_function242);  
			stream_MAIN.add(MAIN24);

			LPAREN25=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_main_function244);  
			stream_LPAREN.add(LPAREN25);

			RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_main_function246);  
			stream_RPAREN.add(RPAREN26);

			pushFollow(FOLLOW_block_list_in_main_function248);
			block_list27=block_list();
			state._fsp--;

			stream_block_list.add(block_list27.getTree());
			EOF28=(Token)match(input,EOF,FOLLOW_EOF_in_main_function250);  
			stream_EOF.add(EOF28);

			}

			// AST REWRITE
			// elements: MAIN, block_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 46:45: -> ^( MAIN block_list )
			{
				// /Users/twb/repos/Tiger/Tiger.g:46:48: ^( MAIN block_list )
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
	// /Users/twb/repos/Tiger/Tiger.g:49:1: ret_type : ( VOID | type_id );
	public final TigerParser.ret_type_return ret_type() throws RecognitionException {
		TigerParser.ret_type_return retval = new TigerParser.ret_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VOID29=null;
		ParserRuleReturnScope type_id30 =null;

		Object VOID29_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:50:2: ( VOID | type_id )
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
					// /Users/twb/repos/Tiger/Tiger.g:50:5: VOID
					{
					root_0 = (Object)adaptor.nil();


					VOID29=(Token)match(input,VOID,FOLLOW_VOID_in_ret_type272); 
					VOID29_tree = (Object)adaptor.create(VOID29);
					adaptor.addChild(root_0, VOID29_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:51:5: type_id
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_id_in_ret_type278);
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
	// /Users/twb/repos/Tiger/Tiger.g:54:1: param_list : ( param param_list_tail -> ^( PARAMS param param_list_tail ) |);
	public final TigerParser.param_list_return param_list() throws RecognitionException {
		TigerParser.param_list_return retval = new TigerParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope param31 =null;
		ParserRuleReturnScope param_list_tail32 =null;

		RewriteRuleSubtreeStream stream_param_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule param_list_tail");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:55:2: ( param param_list_tail -> ^( PARAMS param param_list_tail ) |)
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
					// /Users/twb/repos/Tiger/Tiger.g:55:4: param param_list_tail
					{
					pushFollow(FOLLOW_param_in_param_list289);
					param31=param();
					state._fsp--;

					stream_param.add(param31.getTree());
					pushFollow(FOLLOW_param_list_tail_in_param_list291);
					param_list_tail32=param_list_tail();
					state._fsp--;

					stream_param_list_tail.add(param_list_tail32.getTree());
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
					// 55:26: -> ^( PARAMS param param_list_tail )
					{
						// /Users/twb/repos/Tiger/Tiger.g:55:29: ^( PARAMS param param_list_tail )
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
					// /Users/twb/repos/Tiger/Tiger.g:57:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:59:1: param_list_tail : ( COMMA ! param param_list_tail |);
	public final TigerParser.param_list_tail_return param_list_tail() throws RecognitionException {
		TigerParser.param_list_tail_return retval = new TigerParser.param_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA33=null;
		ParserRuleReturnScope param34 =null;
		ParserRuleReturnScope param_list_tail35 =null;

		Object COMMA33_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:60:2: ( COMMA ! param param_list_tail |)
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
					// /Users/twb/repos/Tiger/Tiger.g:60:4: COMMA ! param param_list_tail
					{
					root_0 = (Object)adaptor.nil();


					COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list_tail317); 
					pushFollow(FOLLOW_param_in_param_list_tail320);
					param34=param();
					state._fsp--;

					adaptor.addChild(root_0, param34.getTree());

					pushFollow(FOLLOW_param_list_tail_in_param_list_tail322);
					param_list_tail35=param_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, param_list_tail35.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:62:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:64:1: param : ID COLON type_id -> ^( COLON ID type_id ) ;
	public final TigerParser.param_return param() throws RecognitionException {
		TigerParser.param_return retval = new TigerParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID36=null;
		Token COLON37=null;
		ParserRuleReturnScope type_id38 =null;

		Object ID36_tree=null;
		Object COLON37_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:65:2: ( ID COLON type_id -> ^( COLON ID type_id ) )
			// /Users/twb/repos/Tiger/Tiger.g:65:4: ID COLON type_id
			{
			ID36=(Token)match(input,ID,FOLLOW_ID_in_param340);  
			stream_ID.add(ID36);

			COLON37=(Token)match(input,COLON,FOLLOW_COLON_in_param342);  
			stream_COLON.add(COLON37);

			pushFollow(FOLLOW_type_id_in_param344);
			type_id38=type_id();
			state._fsp--;

			stream_type_id.add(type_id38.getTree());
			// AST REWRITE
			// elements: COLON, type_id, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 65:21: -> ^( COLON ID type_id )
			{
				// /Users/twb/repos/Tiger/Tiger.g:65:24: ^( COLON ID type_id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);
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
	// /Users/twb/repos/Tiger/Tiger.g:68:1: block_list : block block_tail ;
	public final TigerParser.block_list_return block_list() throws RecognitionException {
		TigerParser.block_list_return retval = new TigerParser.block_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block39 =null;
		ParserRuleReturnScope block_tail40 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:69:2: ( block block_tail )
			// /Users/twb/repos/Tiger/Tiger.g:69:4: block block_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_block_list366);
			block39=block();
			state._fsp--;

			adaptor.addChild(root_0, block39.getTree());

			pushFollow(FOLLOW_block_tail_in_block_list368);
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
	// /Users/twb/repos/Tiger/Tiger.g:72:1: block_tail : ( block block_tail |);
	public final TigerParser.block_tail_return block_tail() throws RecognitionException {
		TigerParser.block_tail_return retval = new TigerParser.block_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block41 =null;
		ParserRuleReturnScope block_tail42 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:73:2: ( block block_tail |)
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
					// /Users/twb/repos/Tiger/Tiger.g:73:4: block block_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_block_tail379);
					block41=block();
					state._fsp--;

					adaptor.addChild(root_0, block41.getTree());

					pushFollow(FOLLOW_block_tail_in_block_tail381);
					block_tail42=block_tail();
					state._fsp--;

					adaptor.addChild(root_0, block_tail42.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:75:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:77:1: block : ( BEGIN opt= declaration_segment stat_seq END SEMI ) -> {opt.getTree() != null}? ^( BLOCK $opt stat_seq ) -> ^( BLOCK stat_seq ) ;
	public final TigerParser.block_return block() throws RecognitionException {
		TigerParser.block_return retval = new TigerParser.block_return();
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
			// /Users/twb/repos/Tiger/Tiger.g:78:2: ( ( BEGIN opt= declaration_segment stat_seq END SEMI ) -> {opt.getTree() != null}? ^( BLOCK $opt stat_seq ) -> ^( BLOCK stat_seq ) )
			// /Users/twb/repos/Tiger/Tiger.g:78:4: ( BEGIN opt= declaration_segment stat_seq END SEMI )
			{
			// /Users/twb/repos/Tiger/Tiger.g:78:4: ( BEGIN opt= declaration_segment stat_seq END SEMI )
			// /Users/twb/repos/Tiger/Tiger.g:78:5: BEGIN opt= declaration_segment stat_seq END SEMI
			{
			BEGIN43=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block397);  
			stream_BEGIN.add(BEGIN43);

			pushFollow(FOLLOW_declaration_segment_in_block401);
			opt=declaration_segment();
			state._fsp--;

			stream_declaration_segment.add(opt.getTree());
			pushFollow(FOLLOW_stat_seq_in_block403);
			stat_seq44=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq44.getTree());
			END45=(Token)match(input,END,FOLLOW_END_in_block405);  
			stream_END.add(END45);

			SEMI46=(Token)match(input,SEMI,FOLLOW_SEMI_in_block407);  
			stream_SEMI.add(SEMI46);

			}

			// AST REWRITE
			// elements: stat_seq, opt, stat_seq
			// token labels: 
			// rule labels: opt, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_opt=new RewriteRuleSubtreeStream(adaptor,"rule opt",opt!=null?opt.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 78:55: -> {opt.getTree() != null}? ^( BLOCK $opt stat_seq )
			if (opt.getTree() != null) {
				// /Users/twb/repos/Tiger/Tiger.g:78:84: ^( BLOCK $opt stat_seq )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_opt.nextTree());
				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 79:16: -> ^( BLOCK stat_seq )
			{
				// /Users/twb/repos/Tiger/Tiger.g:79:26: ^( BLOCK stat_seq )
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
	// /Users/twb/repos/Tiger/Tiger.g:82:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final TigerParser.declaration_segment_return declaration_segment() throws RecognitionException {
		TigerParser.declaration_segment_return retval = new TigerParser.declaration_segment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration_list47 =null;
		ParserRuleReturnScope var_declaration_list48 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:83:2: ( type_declaration_list var_declaration_list )
			// /Users/twb/repos/Tiger/Tiger.g:83:4: type_declaration_list var_declaration_list
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_declaration_list_in_declaration_segment464);
			type_declaration_list47=type_declaration_list();
			state._fsp--;

			adaptor.addChild(root_0, type_declaration_list47.getTree());

			pushFollow(FOLLOW_var_declaration_list_in_declaration_segment466);
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
	// /Users/twb/repos/Tiger/Tiger.g:86:1: var_declaration_list : ( var_declaration var_declaration_list |);
	public final TigerParser.var_declaration_list_return var_declaration_list() throws RecognitionException {
		TigerParser.var_declaration_list_return retval = new TigerParser.var_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_declaration49 =null;
		ParserRuleReturnScope var_declaration_list50 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:87:2: ( var_declaration var_declaration_list |)
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VAR) ) {
				alt7=1;
			}
			else if ( (LA7_0==BEGIN||LA7_0==BREAK||(LA7_0 >= ELSE && LA7_0 <= ENDIF)||LA7_0==FOR||LA7_0==ID||LA7_0==IF||LA7_0==RETURN||LA7_0==WHILE) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:87:4: var_declaration var_declaration_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_declaration_in_var_declaration_list477);
					var_declaration49=var_declaration();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration49.getTree());

					pushFollow(FOLLOW_var_declaration_list_in_var_declaration_list479);
					var_declaration_list50=var_declaration_list();
					state._fsp--;

					adaptor.addChild(root_0, var_declaration_list50.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:89:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:91:1: type : ( base_type | ( ARRAY array_index_const OF base_type ) -> ^( ARRAY array_index_const base_type ) | ( ARRAY width= array_index_const height= array_index_const OF base_type ) -> ^( ARRAY $width $height base_type ) );
	public final TigerParser.type_return type() throws RecognitionException {
		TigerParser.type_return retval = new TigerParser.type_return();
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
			// /Users/twb/repos/Tiger/Tiger.g:92:2: ( base_type | ( ARRAY array_index_const OF base_type ) -> ^( ARRAY array_index_const base_type ) | ( ARRAY width= array_index_const height= array_index_const OF base_type ) -> ^( ARRAY $width $height base_type ) )
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
					// /Users/twb/repos/Tiger/Tiger.g:92:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type494);
					base_type51=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type51.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:93:4: ( ARRAY array_index_const OF base_type )
					{
					// /Users/twb/repos/Tiger/Tiger.g:93:4: ( ARRAY array_index_const OF base_type )
					// /Users/twb/repos/Tiger/Tiger.g:93:5: ARRAY array_index_const OF base_type
					{
					ARRAY52=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type500);  
					stream_ARRAY.add(ARRAY52);

					pushFollow(FOLLOW_array_index_const_in_type502);
					array_index_const53=array_index_const();
					state._fsp--;

					stream_array_index_const.add(array_index_const53.getTree());
					OF54=(Token)match(input,OF,FOLLOW_OF_in_type504);  
					stream_OF.add(OF54);

					pushFollow(FOLLOW_base_type_in_type506);
					base_type55=base_type();
					state._fsp--;

					stream_base_type.add(base_type55.getTree());
					}

					// AST REWRITE
					// elements: array_index_const, base_type, ARRAY
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 93:43: -> ^( ARRAY array_index_const base_type )
					{
						// /Users/twb/repos/Tiger/Tiger.g:93:46: ^( ARRAY array_index_const base_type )
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
					// /Users/twb/repos/Tiger/Tiger.g:94:4: ( ARRAY width= array_index_const height= array_index_const OF base_type )
					{
					// /Users/twb/repos/Tiger/Tiger.g:94:4: ( ARRAY width= array_index_const height= array_index_const OF base_type )
					// /Users/twb/repos/Tiger/Tiger.g:94:5: ARRAY width= array_index_const height= array_index_const OF base_type
					{
					ARRAY56=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type523);  
					stream_ARRAY.add(ARRAY56);

					pushFollow(FOLLOW_array_index_const_in_type527);
					width=array_index_const();
					state._fsp--;

					stream_array_index_const.add(width.getTree());
					pushFollow(FOLLOW_array_index_const_in_type531);
					height=array_index_const();
					state._fsp--;

					stream_array_index_const.add(height.getTree());
					OF57=(Token)match(input,OF,FOLLOW_OF_in_type533);  
					stream_OF.add(OF57);

					pushFollow(FOLLOW_base_type_in_type535);
					base_type58=base_type();
					state._fsp--;

					stream_base_type.add(base_type58.getTree());
					}

					// AST REWRITE
					// elements: height, ARRAY, base_type, width
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
					// 94:74: -> ^( ARRAY $width $height base_type )
					{
						// /Users/twb/repos/Tiger/Tiger.g:94:77: ^( ARRAY $width $height base_type )
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
	// /Users/twb/repos/Tiger/Tiger.g:97:1: type_id : ( base_type | ID );
	public final TigerParser.type_id_return type_id() throws RecognitionException {
		TigerParser.type_id_return retval = new TigerParser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID60=null;
		ParserRuleReturnScope base_type59 =null;

		Object ID60_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:98:2: ( base_type | ID )
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
					// /Users/twb/repos/Tiger/Tiger.g:98:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type_id561);
					base_type59=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type59.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:99:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID60=(Token)match(input,ID,FOLLOW_ID_in_type_id566); 
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
	// /Users/twb/repos/Tiger/Tiger.g:102:1: base_type : ( INT | FIXEDPT );
	public final TigerParser.base_type_return base_type() throws RecognitionException {
		TigerParser.base_type_return retval = new TigerParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set61=null;

		Object set61_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:103:2: ( INT | FIXEDPT )
			// /Users/twb/repos/Tiger/Tiger.g:
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
	// /Users/twb/repos/Tiger/Tiger.g:107:1: var_declaration : ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id optional_init ) ;
	public final TigerParser.var_declaration_return var_declaration() throws RecognitionException {
		TigerParser.var_declaration_return retval = new TigerParser.var_declaration_return();
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
			// /Users/twb/repos/Tiger/Tiger.g:108:2: ( ( VAR id_list COLON type_id optional_init SEMI ) -> ^( VAR id_list type_id optional_init ) )
			// /Users/twb/repos/Tiger/Tiger.g:108:4: ( VAR id_list COLON type_id optional_init SEMI )
			{
			// /Users/twb/repos/Tiger/Tiger.g:108:4: ( VAR id_list COLON type_id optional_init SEMI )
			// /Users/twb/repos/Tiger/Tiger.g:108:5: VAR id_list COLON type_id optional_init SEMI
			{
			VAR62=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration594);  
			stream_VAR.add(VAR62);

			pushFollow(FOLLOW_id_list_in_var_declaration596);
			id_list63=id_list();
			state._fsp--;

			stream_id_list.add(id_list63.getTree());
			COLON64=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration598);  
			stream_COLON.add(COLON64);

			pushFollow(FOLLOW_type_id_in_var_declaration600);
			type_id65=type_id();
			state._fsp--;

			stream_type_id.add(type_id65.getTree());
			pushFollow(FOLLOW_optional_init_in_var_declaration602);
			optional_init66=optional_init();
			state._fsp--;

			stream_optional_init.add(optional_init66.getTree());
			SEMI67=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration604);  
			stream_SEMI.add(SEMI67);

			}

			// AST REWRITE
			// elements: type_id, optional_init, VAR, id_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 108:51: -> ^( VAR id_list type_id optional_init )
			{
				// /Users/twb/repos/Tiger/Tiger.g:108:54: ^( VAR id_list type_id optional_init )
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
	// /Users/twb/repos/Tiger/Tiger.g:111:1: optional_init : ( ASSIGN constant -> constant |);
	public final TigerParser.optional_init_return optional_init() throws RecognitionException {
		TigerParser.optional_init_return retval = new TigerParser.optional_init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN68=null;
		ParserRuleReturnScope constant69 =null;

		Object ASSIGN68_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:112:2: ( ASSIGN constant -> constant |)
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
					// /Users/twb/repos/Tiger/Tiger.g:112:4: ASSIGN constant
					{
					ASSIGN68=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init628);  
					stream_ASSIGN.add(ASSIGN68);

					pushFollow(FOLLOW_constant_in_optional_init630);
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
					// 112:20: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:114:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:116:1: id_list : ID id_list_tail ;
	public final TigerParser.id_list_return id_list() throws RecognitionException {
		TigerParser.id_list_return retval = new TigerParser.id_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID70=null;
		ParserRuleReturnScope id_list_tail71 =null;

		Object ID70_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:117:2: ( ID id_list_tail )
			// /Users/twb/repos/Tiger/Tiger.g:117:4: ID id_list_tail
			{
			root_0 = (Object)adaptor.nil();


			ID70=(Token)match(input,ID,FOLLOW_ID_in_id_list649); 
			ID70_tree = (Object)adaptor.create(ID70);
			adaptor.addChild(root_0, ID70_tree);

			pushFollow(FOLLOW_id_list_tail_in_id_list651);
			id_list_tail71=id_list_tail();
			state._fsp--;

			adaptor.addChild(root_0, id_list_tail71.getTree());

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
	// /Users/twb/repos/Tiger/Tiger.g:120:1: id_list_tail : ( COMMA ID id_list_tail -> ID |);
	public final TigerParser.id_list_tail_return id_list_tail() throws RecognitionException {
		TigerParser.id_list_tail_return retval = new TigerParser.id_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA72=null;
		Token ID73=null;
		ParserRuleReturnScope id_list_tail74 =null;

		Object COMMA72_tree=null;
		Object ID73_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_id_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule id_list_tail");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:121:2: ( COMMA ID id_list_tail -> ID |)
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==COMMA) ) {
				alt11=1;
			}
			else if ( (LA11_0==COLON||LA11_0==RPAREN) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:121:4: COMMA ID id_list_tail
					{
					COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list_tail662);  
					stream_COMMA.add(COMMA72);

					ID73=(Token)match(input,ID,FOLLOW_ID_in_id_list_tail664);  
					stream_ID.add(ID73);

					pushFollow(FOLLOW_id_list_tail_in_id_list_tail666);
					id_list_tail74=id_list_tail();
					state._fsp--;

					stream_id_list_tail.add(id_list_tail74.getTree());
					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 121:26: -> ID
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:123:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:125:1: optional_int : ( ASSIGN constant |);
	public final TigerParser.optional_int_return optional_int() throws RecognitionException {
		TigerParser.optional_int_return retval = new TigerParser.optional_int_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN75=null;
		ParserRuleReturnScope constant76 =null;

		Object ASSIGN75_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:126:2: ( ASSIGN constant |)
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
					// /Users/twb/repos/Tiger/Tiger.g:126:4: ASSIGN constant
					{
					root_0 = (Object)adaptor.nil();


					ASSIGN75=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_int684); 
					ASSIGN75_tree = (Object)adaptor.create(ASSIGN75);
					adaptor.addChild(root_0, ASSIGN75_tree);

					pushFollow(FOLLOW_constant_in_optional_int686);
					constant76=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant76.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:128:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:130:1: stat_seq : ( stat )* ;
	public final TigerParser.stat_seq_return stat_seq() throws RecognitionException {
		TigerParser.stat_seq_return retval = new TigerParser.stat_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat77 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:131:2: ( ( stat )* )
			// /Users/twb/repos/Tiger/Tiger.g:131:4: ( stat )*
			{
			root_0 = (Object)adaptor.nil();


			// /Users/twb/repos/Tiger/Tiger.g:131:4: ( stat )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==BEGIN||LA13_0==BREAK||LA13_0==FOR||LA13_0==ID||LA13_0==IF||LA13_0==RETURN||LA13_0==WHILE) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:131:5: stat
					{
					pushFollow(FOLLOW_stat_in_stat_seq702);
					stat77=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat77.getTree());

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
	// /Users/twb/repos/Tiger/Tiger.g:134:1: expr : ( constant | value | LPAREN ! expr RPAREN !) ( options {greedy=true; } : binary_operator ^ expr )* ;
	public final TigerParser.expr_return expr() throws RecognitionException {
		TigerParser.expr_return retval = new TigerParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN80=null;
		Token RPAREN82=null;
		ParserRuleReturnScope constant78 =null;
		ParserRuleReturnScope value79 =null;
		ParserRuleReturnScope expr81 =null;
		ParserRuleReturnScope binary_operator83 =null;
		ParserRuleReturnScope expr84 =null;

		Object LPAREN80_tree=null;
		Object RPAREN82_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:135:2: ( ( constant | value | LPAREN ! expr RPAREN !) ( options {greedy=true; } : binary_operator ^ expr )* )
			// /Users/twb/repos/Tiger/Tiger.g:135:4: ( constant | value | LPAREN ! expr RPAREN !) ( options {greedy=true; } : binary_operator ^ expr )*
			{
			root_0 = (Object)adaptor.nil();


			// /Users/twb/repos/Tiger/Tiger.g:135:4: ( constant | value | LPAREN ! expr RPAREN !)
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
					// /Users/twb/repos/Tiger/Tiger.g:135:5: constant
					{
					pushFollow(FOLLOW_constant_in_expr716);
					constant78=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant78.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:135:16: value
					{
					pushFollow(FOLLOW_value_in_expr720);
					value79=value();
					state._fsp--;

					adaptor.addChild(root_0, value79.getTree());

					}
					break;
				case 3 :
					// /Users/twb/repos/Tiger/Tiger.g:135:24: LPAREN ! expr RPAREN !
					{
					LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr724); 
					pushFollow(FOLLOW_expr_in_expr727);
					expr81=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr81.getTree());

					RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr729); 
					}
					break;

			}

			// /Users/twb/repos/Tiger/Tiger.g:135:46: ( options {greedy=true; } : binary_operator ^ expr )*
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
					// /Users/twb/repos/Tiger/Tiger.g:135:69: binary_operator ^ expr
					{
					pushFollow(FOLLOW_binary_operator_in_expr741);
					binary_operator83=binary_operator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(binary_operator83.getTree(), root_0);
					pushFollow(FOLLOW_expr_in_expr744);
					expr84=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr84.getTree());

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
	// /Users/twb/repos/Tiger/Tiger.g:138:1: expr_list : ( expr expr_list_tail -> ^( EXPRS expr expr_list_tail ) |);
	public final TigerParser.expr_list_return expr_list() throws RecognitionException {
		TigerParser.expr_list_return retval = new TigerParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr85 =null;
		ParserRuleReturnScope expr_list_tail86 =null;

		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:139:2: ( expr expr_list_tail -> ^( EXPRS expr expr_list_tail ) |)
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
					// /Users/twb/repos/Tiger/Tiger.g:139:4: expr expr_list_tail
					{
					pushFollow(FOLLOW_expr_in_expr_list757);
					expr85=expr();
					state._fsp--;

					stream_expr.add(expr85.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list759);
					expr_list_tail86=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail86.getTree());
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
					// 139:24: -> ^( EXPRS expr expr_list_tail )
					{
						// /Users/twb/repos/Tiger/Tiger.g:139:27: ^( EXPRS expr expr_list_tail )
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
					// /Users/twb/repos/Tiger/Tiger.g:141:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:143:1: expr_list_tail : ( COMMA expr expr_list_tail |);
	public final TigerParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
		TigerParser.expr_list_tail_return retval = new TigerParser.expr_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA87=null;
		ParserRuleReturnScope expr88 =null;
		ParserRuleReturnScope expr_list_tail89 =null;

		Object COMMA87_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:144:2: ( COMMA expr expr_list_tail |)
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
					// /Users/twb/repos/Tiger/Tiger.g:144:4: COMMA expr expr_list_tail
					{
					root_0 = (Object)adaptor.nil();


					COMMA87=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail785); 
					COMMA87_tree = (Object)adaptor.create(COMMA87);
					adaptor.addChild(root_0, COMMA87_tree);

					pushFollow(FOLLOW_expr_in_expr_list_tail787);
					expr88=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr88.getTree());

					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail789);
					expr_list_tail89=expr_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_list_tail89.getTree());

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:146:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:148:1: stat : ( value ASSIGN stat_assignment -> ^( ASSIGN value stat_assignment ) | if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | funct_call SEMI -> funct_call );
	public final TigerParser.stat_return stat() throws RecognitionException {
		TigerParser.stat_return retval = new TigerParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN91=null;
		Token WHILE94=null;
		Token DO96=null;
		Token ENDDO98=null;
		Token SEMI99=null;
		Token FOR100=null;
		Token ID101=null;
		Token ASSIGN102=null;
		Token DO104=null;
		Token ENDDO106=null;
		Token SEMI107=null;
		Token BREAK108=null;
		Token SEMI109=null;
		Token RETURN110=null;
		Token SEMI112=null;
		Token SEMI115=null;
		ParserRuleReturnScope value90 =null;
		ParserRuleReturnScope stat_assignment92 =null;
		ParserRuleReturnScope if_stmt93 =null;
		ParserRuleReturnScope expr95 =null;
		ParserRuleReturnScope stat_seq97 =null;
		ParserRuleReturnScope range103 =null;
		ParserRuleReturnScope stat_seq105 =null;
		ParserRuleReturnScope expr111 =null;
		ParserRuleReturnScope block113 =null;
		ParserRuleReturnScope funct_call114 =null;

		Object ASSIGN91_tree=null;
		Object WHILE94_tree=null;
		Object DO96_tree=null;
		Object ENDDO98_tree=null;
		Object SEMI99_tree=null;
		Object FOR100_tree=null;
		Object ID101_tree=null;
		Object ASSIGN102_tree=null;
		Object DO104_tree=null;
		Object ENDDO106_tree=null;
		Object SEMI107_tree=null;
		Object BREAK108_tree=null;
		Object SEMI109_tree=null;
		Object RETURN110_tree=null;
		Object SEMI112_tree=null;
		Object SEMI115_tree=null;
		RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
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
			// /Users/twb/repos/Tiger/Tiger.g:149:2: ( value ASSIGN stat_assignment -> ^( ASSIGN value stat_assignment ) | if_stmt | ( WHILE expr DO stat_seq ENDDO SEMI ) -> ^( WHILE expr stat_seq ) | ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI ) -> ^( FOR range stat_seq ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | funct_call SEMI -> funct_call )
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
					// /Users/twb/repos/Tiger/Tiger.g:149:4: value ASSIGN stat_assignment
					{
					pushFollow(FOLLOW_value_in_stat804);
					value90=value();
					state._fsp--;

					stream_value.add(value90.getTree());
					ASSIGN91=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat806);  
					stream_ASSIGN.add(ASSIGN91);

					pushFollow(FOLLOW_stat_assignment_in_stat808);
					stat_assignment92=stat_assignment();
					state._fsp--;

					stream_stat_assignment.add(stat_assignment92.getTree());
					// AST REWRITE
					// elements: value, stat_assignment, ASSIGN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 149:33: -> ^( ASSIGN value stat_assignment )
					{
						// /Users/twb/repos/Tiger/Tiger.g:149:36: ^( ASSIGN value stat_assignment )
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
					// /Users/twb/repos/Tiger/Tiger.g:150:4: if_stmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_stmt_in_stat823);
					if_stmt93=if_stmt();
					state._fsp--;

					adaptor.addChild(root_0, if_stmt93.getTree());

					}
					break;
				case 3 :
					// /Users/twb/repos/Tiger/Tiger.g:151:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					{
					// /Users/twb/repos/Tiger/Tiger.g:151:4: ( WHILE expr DO stat_seq ENDDO SEMI )
					// /Users/twb/repos/Tiger/Tiger.g:151:5: WHILE expr DO stat_seq ENDDO SEMI
					{
					WHILE94=(Token)match(input,WHILE,FOLLOW_WHILE_in_stat829);  
					stream_WHILE.add(WHILE94);

					pushFollow(FOLLOW_expr_in_stat831);
					expr95=expr();
					state._fsp--;

					stream_expr.add(expr95.getTree());
					DO96=(Token)match(input,DO,FOLLOW_DO_in_stat833);  
					stream_DO.add(DO96);

					pushFollow(FOLLOW_stat_seq_in_stat835);
					stat_seq97=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq97.getTree());
					ENDDO98=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat837);  
					stream_ENDDO.add(ENDDO98);

					SEMI99=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat839);  
					stream_SEMI.add(SEMI99);

					}

					// AST REWRITE
					// elements: stat_seq, expr, WHILE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 151:40: -> ^( WHILE expr stat_seq )
					{
						// /Users/twb/repos/Tiger/Tiger.g:151:43: ^( WHILE expr stat_seq )
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
					// /Users/twb/repos/Tiger/Tiger.g:152:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					{
					// /Users/twb/repos/Tiger/Tiger.g:152:4: ( FOR ID ASSIGN range DO stat_seq ENDDO SEMI )
					// /Users/twb/repos/Tiger/Tiger.g:152:5: FOR ID ASSIGN range DO stat_seq ENDDO SEMI
					{
					FOR100=(Token)match(input,FOR,FOLLOW_FOR_in_stat856);  
					stream_FOR.add(FOR100);

					ID101=(Token)match(input,ID,FOLLOW_ID_in_stat858);  
					stream_ID.add(ID101);

					ASSIGN102=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat860);  
					stream_ASSIGN.add(ASSIGN102);

					pushFollow(FOLLOW_range_in_stat862);
					range103=range();
					state._fsp--;

					stream_range.add(range103.getTree());
					DO104=(Token)match(input,DO,FOLLOW_DO_in_stat864);  
					stream_DO.add(DO104);

					pushFollow(FOLLOW_stat_seq_in_stat866);
					stat_seq105=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq105.getTree());
					ENDDO106=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_stat868);  
					stream_ENDDO.add(ENDDO106);

					SEMI107=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat870);  
					stream_SEMI.add(SEMI107);

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
					// 152:49: -> ^( FOR range stat_seq )
					{
						// /Users/twb/repos/Tiger/Tiger.g:152:52: ^( FOR range stat_seq )
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
					// /Users/twb/repos/Tiger/Tiger.g:153:4: BREAK SEMI
					{
					BREAK108=(Token)match(input,BREAK,FOLLOW_BREAK_in_stat886);  
					stream_BREAK.add(BREAK108);

					SEMI109=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat888);  
					stream_SEMI.add(SEMI109);

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
					// 153:15: -> BREAK
					{
						adaptor.addChild(root_0, stream_BREAK.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/twb/repos/Tiger/Tiger.g:154:4: RETURN expr SEMI
					{
					RETURN110=(Token)match(input,RETURN,FOLLOW_RETURN_in_stat897);  
					stream_RETURN.add(RETURN110);

					pushFollow(FOLLOW_expr_in_stat899);
					expr111=expr();
					state._fsp--;

					stream_expr.add(expr111.getTree());
					SEMI112=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat901);  
					stream_SEMI.add(SEMI112);

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
					// 154:21: -> ^( RETURN expr )
					{
						// /Users/twb/repos/Tiger/Tiger.g:154:24: ^( RETURN expr )
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
				case 7 :
					// /Users/twb/repos/Tiger/Tiger.g:155:4: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat914);
					block113=block();
					state._fsp--;

					adaptor.addChild(root_0, block113.getTree());

					}
					break;
				case 8 :
					// /Users/twb/repos/Tiger/Tiger.g:156:4: funct_call SEMI
					{
					pushFollow(FOLLOW_funct_call_in_stat919);
					funct_call114=funct_call();
					state._fsp--;

					stream_funct_call.add(funct_call114.getTree());
					SEMI115=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat921);  
					stream_SEMI.add(SEMI115);

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
					// 156:20: -> funct_call
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
	// /Users/twb/repos/Tiger/Tiger.g:159:1: range : (start= index_expr TO stop= index_expr ) -> ^( TO $start $stop) ;
	public final TigerParser.range_return range() throws RecognitionException {
		TigerParser.range_return retval = new TigerParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO116=null;
		ParserRuleReturnScope start =null;
		ParserRuleReturnScope stop =null;

		Object TO116_tree=null;
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:160:2: ( (start= index_expr TO stop= index_expr ) -> ^( TO $start $stop) )
			// /Users/twb/repos/Tiger/Tiger.g:160:4: (start= index_expr TO stop= index_expr )
			{
			// /Users/twb/repos/Tiger/Tiger.g:160:4: (start= index_expr TO stop= index_expr )
			// /Users/twb/repos/Tiger/Tiger.g:160:5: start= index_expr TO stop= index_expr
			{
			pushFollow(FOLLOW_index_expr_in_range939);
			start=index_expr();
			state._fsp--;

			stream_index_expr.add(start.getTree());
			TO116=(Token)match(input,TO,FOLLOW_TO_in_range941);  
			stream_TO.add(TO116);

			pushFollow(FOLLOW_index_expr_in_range945);
			stop=index_expr();
			state._fsp--;

			stream_index_expr.add(stop.getTree());
			}

			// AST REWRITE
			// elements: start, stop, TO
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
			// 160:42: -> ^( TO $start $stop)
			{
				// /Users/twb/repos/Tiger/Tiger.g:160:45: ^( TO $start $stop)
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
	// /Users/twb/repos/Tiger/Tiger.g:163:1: stat_assignment : ( expr SEMI -> expr | IF LPAREN expr_list RPAREN SEMI );
	public final TigerParser.stat_assignment_return stat_assignment() throws RecognitionException {
		TigerParser.stat_assignment_return retval = new TigerParser.stat_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMI118=null;
		Token IF119=null;
		Token LPAREN120=null;
		Token RPAREN122=null;
		Token SEMI123=null;
		ParserRuleReturnScope expr117 =null;
		ParserRuleReturnScope expr_list121 =null;

		Object SEMI118_tree=null;
		Object IF119_tree=null;
		Object LPAREN120_tree=null;
		Object RPAREN122_tree=null;
		Object SEMI123_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:164:2: ( expr SEMI -> expr | IF LPAREN expr_list RPAREN SEMI )
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
					// /Users/twb/repos/Tiger/Tiger.g:164:4: expr SEMI
					{
					pushFollow(FOLLOW_expr_in_stat_assignment969);
					expr117=expr();
					state._fsp--;

					stream_expr.add(expr117.getTree());
					SEMI118=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat_assignment971);  
					stream_SEMI.add(SEMI118);

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
					// 164:14: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:165:4: IF LPAREN expr_list RPAREN SEMI
					{
					root_0 = (Object)adaptor.nil();


					IF119=(Token)match(input,IF,FOLLOW_IF_in_stat_assignment980); 
					IF119_tree = (Object)adaptor.create(IF119);
					adaptor.addChild(root_0, IF119_tree);

					LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_stat_assignment982); 
					LPAREN120_tree = (Object)adaptor.create(LPAREN120);
					adaptor.addChild(root_0, LPAREN120_tree);

					pushFollow(FOLLOW_expr_list_in_stat_assignment984);
					expr_list121=expr_list();
					state._fsp--;

					adaptor.addChild(root_0, expr_list121.getTree());

					RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_stat_assignment986); 
					RPAREN122_tree = (Object)adaptor.create(RPAREN122);
					adaptor.addChild(root_0, RPAREN122_tree);

					SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_stat_assignment988); 
					SEMI123_tree = (Object)adaptor.create(SEMI123);
					adaptor.addChild(root_0, SEMI123_tree);

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
	// /Users/twb/repos/Tiger/Tiger.g:168:1: if_stmt : IF expr then_stmt -> ^( IF expr then_stmt ) ;
	public final TigerParser.if_stmt_return if_stmt() throws RecognitionException {
		TigerParser.if_stmt_return retval = new TigerParser.if_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF124=null;
		ParserRuleReturnScope expr125 =null;
		ParserRuleReturnScope then_stmt126 =null;

		Object IF124_tree=null;
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_then_stmt=new RewriteRuleSubtreeStream(adaptor,"rule then_stmt");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:169:2: ( IF expr then_stmt -> ^( IF expr then_stmt ) )
			// /Users/twb/repos/Tiger/Tiger.g:169:4: IF expr then_stmt
			{
			IF124=(Token)match(input,IF,FOLLOW_IF_in_if_stmt999);  
			stream_IF.add(IF124);

			pushFollow(FOLLOW_expr_in_if_stmt1001);
			expr125=expr();
			state._fsp--;

			stream_expr.add(expr125.getTree());
			pushFollow(FOLLOW_then_stmt_in_if_stmt1004);
			then_stmt126=then_stmt();
			state._fsp--;

			stream_then_stmt.add(then_stmt126.getTree());
			// AST REWRITE
			// elements: IF, then_stmt, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 169:22: -> ^( IF expr then_stmt )
			{
				// /Users/twb/repos/Tiger/Tiger.g:169:25: ^( IF expr then_stmt )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_then_stmt.nextTree());
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


	public static class then_stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "then_stmt"
	// /Users/twb/repos/Tiger/Tiger.g:172:1: then_stmt : THEN stat_seq if_tail -> ^( THEN stat_seq if_tail ) ;
	public final TigerParser.then_stmt_return then_stmt() throws RecognitionException {
		TigerParser.then_stmt_return retval = new TigerParser.then_stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token THEN127=null;
		ParserRuleReturnScope stat_seq128 =null;
		ParserRuleReturnScope if_tail129 =null;

		Object THEN127_tree=null;
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");
		RewriteRuleSubtreeStream stream_if_tail=new RewriteRuleSubtreeStream(adaptor,"rule if_tail");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:173:2: ( THEN stat_seq if_tail -> ^( THEN stat_seq if_tail ) )
			// /Users/twb/repos/Tiger/Tiger.g:173:5: THEN stat_seq if_tail
			{
			THEN127=(Token)match(input,THEN,FOLLOW_THEN_in_then_stmt1026);  
			stream_THEN.add(THEN127);

			pushFollow(FOLLOW_stat_seq_in_then_stmt1028);
			stat_seq128=stat_seq();
			state._fsp--;

			stream_stat_seq.add(stat_seq128.getTree());
			pushFollow(FOLLOW_if_tail_in_then_stmt1030);
			if_tail129=if_tail();
			state._fsp--;

			stream_if_tail.add(if_tail129.getTree());
			// AST REWRITE
			// elements: THEN, if_tail, stat_seq
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 173:27: -> ^( THEN stat_seq if_tail )
			{
				// /Users/twb/repos/Tiger/Tiger.g:173:30: ^( THEN stat_seq if_tail )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_THEN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_stat_seq.nextTree());
				adaptor.addChild(root_1, stream_if_tail.nextTree());
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
	// $ANTLR end "then_stmt"


	public static class if_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_tail"
	// /Users/twb/repos/Tiger/Tiger.g:175:1: if_tail : ( ELSE stat_seq ENDIF SEMI -> ^( ELSE stat_seq ) | ENDIF SEMI );
	public final TigerParser.if_tail_return if_tail() throws RecognitionException {
		TigerParser.if_tail_return retval = new TigerParser.if_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE130=null;
		Token ENDIF132=null;
		Token SEMI133=null;
		Token ENDIF134=null;
		Token SEMI135=null;
		ParserRuleReturnScope stat_seq131 =null;

		Object ELSE130_tree=null;
		Object ENDIF132_tree=null;
		Object SEMI133_tree=null;
		Object ENDIF134_tree=null;
		Object SEMI135_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_stat_seq=new RewriteRuleSubtreeStream(adaptor,"rule stat_seq");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:176:2: ( ELSE stat_seq ENDIF SEMI -> ^( ELSE stat_seq ) | ENDIF SEMI )
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
					// /Users/twb/repos/Tiger/Tiger.g:176:4: ELSE stat_seq ENDIF SEMI
					{
					ELSE130=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_tail1050);  
					stream_ELSE.add(ELSE130);

					pushFollow(FOLLOW_stat_seq_in_if_tail1052);
					stat_seq131=stat_seq();
					state._fsp--;

					stream_stat_seq.add(stat_seq131.getTree());
					ENDIF132=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_tail1054);  
					stream_ENDIF.add(ENDIF132);

					SEMI133=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_tail1056);  
					stream_SEMI.add(SEMI133);

					// AST REWRITE
					// elements: ELSE, stat_seq
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 176:29: -> ^( ELSE stat_seq )
					{
						// /Users/twb/repos/Tiger/Tiger.g:176:32: ^( ELSE stat_seq )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_stat_seq.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:177:4: ENDIF SEMI
					{
					root_0 = (Object)adaptor.nil();


					ENDIF134=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_if_tail1069); 
					ENDIF134_tree = (Object)adaptor.create(ENDIF134);
					adaptor.addChild(root_0, ENDIF134_tree);

					SEMI135=(Token)match(input,SEMI,FOLLOW_SEMI_in_if_tail1071); 
					SEMI135_tree = (Object)adaptor.create(SEMI135);
					adaptor.addChild(root_0, SEMI135_tree);

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
	// /Users/twb/repos/Tiger/Tiger.g:180:1: opt_prefix : ( value ASSIGN |);
	public final TigerParser.opt_prefix_return opt_prefix() throws RecognitionException {
		TigerParser.opt_prefix_return retval = new TigerParser.opt_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ASSIGN137=null;
		ParserRuleReturnScope value136 =null;

		Object ASSIGN137_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:181:2: ( value ASSIGN |)
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
					// /Users/twb/repos/Tiger/Tiger.g:181:4: value ASSIGN
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_value_in_opt_prefix1082);
					value136=value();
					state._fsp--;

					adaptor.addChild(root_0, value136.getTree());

					ASSIGN137=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_opt_prefix1084); 
					ASSIGN137_tree = (Object)adaptor.create(ASSIGN137);
					adaptor.addChild(root_0, ASSIGN137_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:183:2: 
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
	// /Users/twb/repos/Tiger/Tiger.g:185:1: constant : ( INTLIT | FIXEDPTLIT );
	public final TigerParser.constant_return constant() throws RecognitionException {
		TigerParser.constant_return retval = new TigerParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set138=null;

		Object set138_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:186:2: ( INTLIT | FIXEDPTLIT )
			// /Users/twb/repos/Tiger/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set138=input.LT(1);
			if ( input.LA(1)==FIXEDPTLIT||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set138));
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
	// /Users/twb/repos/Tiger/Tiger.g:190:1: binary_operator : ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER less_equality | GREATER great_equality | AND | OR );
	public final TigerParser.binary_operator_return binary_operator() throws RecognitionException {
		TigerParser.binary_operator_return retval = new TigerParser.binary_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS139=null;
		Token MINUS140=null;
		Token MULT141=null;
		Token DIV142=null;
		Token EQ143=null;
		Token NEQ144=null;
		Token LESSER145=null;
		Token GREATER147=null;
		Token AND149=null;
		Token OR150=null;
		ParserRuleReturnScope less_equality146 =null;
		ParserRuleReturnScope great_equality148 =null;

		Object PLUS139_tree=null;
		Object MINUS140_tree=null;
		Object MULT141_tree=null;
		Object DIV142_tree=null;
		Object EQ143_tree=null;
		Object NEQ144_tree=null;
		Object LESSER145_tree=null;
		Object GREATER147_tree=null;
		Object AND149_tree=null;
		Object OR150_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:191:2: ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER less_equality | GREATER great_equality | AND | OR )
			int alt22=10;
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
				alt22=7;
				}
				break;
			case GREATER:
				{
				alt22=8;
				}
				break;
			case AND:
				{
				alt22=9;
				}
				break;
			case OR:
				{
				alt22=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:191:4: PLUS
					{
					root_0 = (Object)adaptor.nil();


					PLUS139=(Token)match(input,PLUS,FOLLOW_PLUS_in_binary_operator1116); 
					PLUS139_tree = (Object)adaptor.create(PLUS139);
					adaptor.addChild(root_0, PLUS139_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:192:4: MINUS
					{
					root_0 = (Object)adaptor.nil();


					MINUS140=(Token)match(input,MINUS,FOLLOW_MINUS_in_binary_operator1121); 
					MINUS140_tree = (Object)adaptor.create(MINUS140);
					adaptor.addChild(root_0, MINUS140_tree);

					}
					break;
				case 3 :
					// /Users/twb/repos/Tiger/Tiger.g:193:4: MULT
					{
					root_0 = (Object)adaptor.nil();


					MULT141=(Token)match(input,MULT,FOLLOW_MULT_in_binary_operator1126); 
					MULT141_tree = (Object)adaptor.create(MULT141);
					adaptor.addChild(root_0, MULT141_tree);

					}
					break;
				case 4 :
					// /Users/twb/repos/Tiger/Tiger.g:194:4: DIV
					{
					root_0 = (Object)adaptor.nil();


					DIV142=(Token)match(input,DIV,FOLLOW_DIV_in_binary_operator1131); 
					DIV142_tree = (Object)adaptor.create(DIV142);
					adaptor.addChild(root_0, DIV142_tree);

					}
					break;
				case 5 :
					// /Users/twb/repos/Tiger/Tiger.g:195:4: EQ
					{
					root_0 = (Object)adaptor.nil();


					EQ143=(Token)match(input,EQ,FOLLOW_EQ_in_binary_operator1136); 
					EQ143_tree = (Object)adaptor.create(EQ143);
					adaptor.addChild(root_0, EQ143_tree);

					}
					break;
				case 6 :
					// /Users/twb/repos/Tiger/Tiger.g:196:4: NEQ
					{
					root_0 = (Object)adaptor.nil();


					NEQ144=(Token)match(input,NEQ,FOLLOW_NEQ_in_binary_operator1141); 
					NEQ144_tree = (Object)adaptor.create(NEQ144);
					adaptor.addChild(root_0, NEQ144_tree);

					}
					break;
				case 7 :
					// /Users/twb/repos/Tiger/Tiger.g:197:4: LESSER less_equality
					{
					root_0 = (Object)adaptor.nil();


					LESSER145=(Token)match(input,LESSER,FOLLOW_LESSER_in_binary_operator1146); 
					LESSER145_tree = (Object)adaptor.create(LESSER145);
					adaptor.addChild(root_0, LESSER145_tree);

					pushFollow(FOLLOW_less_equality_in_binary_operator1148);
					less_equality146=less_equality();
					state._fsp--;

					adaptor.addChild(root_0, less_equality146.getTree());

					}
					break;
				case 8 :
					// /Users/twb/repos/Tiger/Tiger.g:198:4: GREATER great_equality
					{
					root_0 = (Object)adaptor.nil();


					GREATER147=(Token)match(input,GREATER,FOLLOW_GREATER_in_binary_operator1153); 
					GREATER147_tree = (Object)adaptor.create(GREATER147);
					adaptor.addChild(root_0, GREATER147_tree);

					pushFollow(FOLLOW_great_equality_in_binary_operator1155);
					great_equality148=great_equality();
					state._fsp--;

					adaptor.addChild(root_0, great_equality148.getTree());

					}
					break;
				case 9 :
					// /Users/twb/repos/Tiger/Tiger.g:199:4: AND
					{
					root_0 = (Object)adaptor.nil();


					AND149=(Token)match(input,AND,FOLLOW_AND_in_binary_operator1160); 
					AND149_tree = (Object)adaptor.create(AND149);
					adaptor.addChild(root_0, AND149_tree);

					}
					break;
				case 10 :
					// /Users/twb/repos/Tiger/Tiger.g:200:4: OR
					{
					root_0 = (Object)adaptor.nil();


					OR150=(Token)match(input,OR,FOLLOW_OR_in_binary_operator1165); 
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


	public static class less_equality_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "less_equality"
	// /Users/twb/repos/Tiger/Tiger.g:203:1: less_equality : ( EQ |);
	public final TigerParser.less_equality_return less_equality() throws RecognitionException {
		TigerParser.less_equality_return retval = new TigerParser.less_equality_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ151=null;

		Object EQ151_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:204:2: ( EQ |)
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EQ) ) {
				alt23=1;
			}
			else if ( (LA23_0==FIXEDPTLIT||LA23_0==ID||LA23_0==INTLIT||LA23_0==LPAREN) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:204:4: EQ
					{
					root_0 = (Object)adaptor.nil();


					EQ151=(Token)match(input,EQ,FOLLOW_EQ_in_less_equality1176); 
					EQ151_tree = (Object)adaptor.create(EQ151);
					adaptor.addChild(root_0, EQ151_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:206:2: 
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
	// $ANTLR end "less_equality"


	public static class great_equality_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "great_equality"
	// /Users/twb/repos/Tiger/Tiger.g:208:1: great_equality : ( EQ |);
	public final TigerParser.great_equality_return great_equality() throws RecognitionException {
		TigerParser.great_equality_return retval = new TigerParser.great_equality_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ152=null;

		Object EQ152_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:209:2: ( EQ |)
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==EQ) ) {
				alt24=1;
			}
			else if ( (LA24_0==FIXEDPTLIT||LA24_0==ID||LA24_0==INTLIT||LA24_0==LPAREN) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:209:4: EQ
					{
					root_0 = (Object)adaptor.nil();


					EQ152=(Token)match(input,EQ,FOLLOW_EQ_in_great_equality1191); 
					EQ152_tree = (Object)adaptor.create(EQ152);
					adaptor.addChild(root_0, EQ152_tree);

					}
					break;
				case 2 :
					// /Users/twb/repos/Tiger/Tiger.g:211:2: 
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
	// $ANTLR end "great_equality"


	public static class value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
	// /Users/twb/repos/Tiger/Tiger.g:213:1: value : ID value_tail ;
	public final TigerParser.value_return value() throws RecognitionException {
		TigerParser.value_return retval = new TigerParser.value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID153=null;
		ParserRuleReturnScope value_tail154 =null;

		Object ID153_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:214:2: ( ID value_tail )
			// /Users/twb/repos/Tiger/Tiger.g:214:4: ID value_tail
			{
			root_0 = (Object)adaptor.nil();


			ID153=(Token)match(input,ID,FOLLOW_ID_in_value1205); 
			ID153_tree = (Object)adaptor.create(ID153);
			adaptor.addChild(root_0, ID153_tree);

			pushFollow(FOLLOW_value_tail_in_value1207);
			value_tail154=value_tail();
			state._fsp--;

			adaptor.addChild(root_0, value_tail154.getTree());

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
	// /Users/twb/repos/Tiger/Tiger.g:217:1: value_tail : ( array_index ( array_index )? |);
	public final TigerParser.value_tail_return value_tail() throws RecognitionException {
		TigerParser.value_tail_return retval = new TigerParser.value_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_index155 =null;
		ParserRuleReturnScope array_index156 =null;


		try {
			// /Users/twb/repos/Tiger/Tiger.g:218:2: ( array_index ( array_index )? |)
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LBRACK) ) {
				alt26=1;
			}
			else if ( (LA26_0==AND||LA26_0==ASSIGN||LA26_0==COMMA||(LA26_0 >= DIV && LA26_0 <= DO)||LA26_0==EQ||LA26_0==GREATER||LA26_0==LESSER||(LA26_0 >= MINUS && LA26_0 <= NEQ)||LA26_0==OR||LA26_0==PLUS||(LA26_0 >= RPAREN && LA26_0 <= THEN)) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:218:4: array_index ( array_index )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_index_in_value_tail1218);
					array_index155=array_index();
					state._fsp--;

					adaptor.addChild(root_0, array_index155.getTree());

					// /Users/twb/repos/Tiger/Tiger.g:218:16: ( array_index )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==LBRACK) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/twb/repos/Tiger/Tiger.g:218:16: array_index
							{
							pushFollow(FOLLOW_array_index_in_value_tail1220);
							array_index156=array_index();
							state._fsp--;

							adaptor.addChild(root_0, array_index156.getTree());

							}
							break;

					}

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
	// $ANTLR end "value_tail"


	public static class array_index_const_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_index_const"
	// /Users/twb/repos/Tiger/Tiger.g:222:1: array_index_const : ( LBRACK INTLIT RBRACK ) -> INTLIT ;
	public final TigerParser.array_index_const_return array_index_const() throws RecognitionException {
		TigerParser.array_index_const_return retval = new TigerParser.array_index_const_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK157=null;
		Token INTLIT158=null;
		Token RBRACK159=null;

		Object LBRACK157_tree=null;
		Object INTLIT158_tree=null;
		Object RBRACK159_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:223:2: ( ( LBRACK INTLIT RBRACK ) -> INTLIT )
			// /Users/twb/repos/Tiger/Tiger.g:223:4: ( LBRACK INTLIT RBRACK )
			{
			// /Users/twb/repos/Tiger/Tiger.g:223:4: ( LBRACK INTLIT RBRACK )
			// /Users/twb/repos/Tiger/Tiger.g:223:5: LBRACK INTLIT RBRACK
			{
			LBRACK157=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_index_const1237);  
			stream_LBRACK.add(LBRACK157);

			INTLIT158=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_array_index_const1239);  
			stream_INTLIT.add(INTLIT158);

			RBRACK159=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_index_const1241);  
			stream_RBRACK.add(RBRACK159);

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
			// 223:27: -> INTLIT
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
	// /Users/twb/repos/Tiger/Tiger.g:226:1: array_index : ( LBRACK index_expr RBRACK ) -> index_expr ;
	public final TigerParser.array_index_return array_index() throws RecognitionException {
		TigerParser.array_index_return retval = new TigerParser.array_index_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK160=null;
		Token RBRACK162=null;
		ParserRuleReturnScope index_expr161 =null;

		Object LBRACK160_tree=null;
		Object RBRACK162_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:227:2: ( ( LBRACK index_expr RBRACK ) -> index_expr )
			// /Users/twb/repos/Tiger/Tiger.g:227:4: ( LBRACK index_expr RBRACK )
			{
			// /Users/twb/repos/Tiger/Tiger.g:227:4: ( LBRACK index_expr RBRACK )
			// /Users/twb/repos/Tiger/Tiger.g:227:5: LBRACK index_expr RBRACK
			{
			LBRACK160=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_array_index1258);  
			stream_LBRACK.add(LBRACK160);

			pushFollow(FOLLOW_index_expr_in_array_index1260);
			index_expr161=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr161.getTree());
			RBRACK162=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_array_index1262);  
			stream_RBRACK.add(RBRACK162);

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
			// 227:31: -> index_expr
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
	// /Users/twb/repos/Tiger/Tiger.g:230:1: index_expr : ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* ;
	public final TigerParser.index_expr_return index_expr() throws RecognitionException {
		TigerParser.index_expr_return retval = new TigerParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set163=null;
		ParserRuleReturnScope index_oper164 =null;
		ParserRuleReturnScope index_expr165 =null;

		Object set163_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:231:2: ( ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* )
			// /Users/twb/repos/Tiger/Tiger.g:231:4: ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )*
			{
			root_0 = (Object)adaptor.nil();


			set163=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set163));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// /Users/twb/repos/Tiger/Tiger.g:231:18: ( options {greedy=true; } : index_oper index_expr )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= MINUS && LA27_0 <= MULT)||LA27_0==PLUS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/twb/repos/Tiger/Tiger.g:231:42: index_oper index_expr
					{
					pushFollow(FOLLOW_index_oper_in_index_expr1295);
					index_oper164=index_oper();
					state._fsp--;

					adaptor.addChild(root_0, index_oper164.getTree());

					pushFollow(FOLLOW_index_expr_in_index_expr1297);
					index_expr165=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr165.getTree());

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
	// /Users/twb/repos/Tiger/Tiger.g:234:1: index_oper : ( PLUS | MINUS | MULT );
	public final TigerParser.index_oper_return index_oper() throws RecognitionException {
		TigerParser.index_oper_return retval = new TigerParser.index_oper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set166=null;

		Object set166_tree=null;

		try {
			// /Users/twb/repos/Tiger/Tiger.g:235:2: ( PLUS | MINUS | MULT )
			// /Users/twb/repos/Tiger/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set166=input.LT(1);
			if ( (input.LA(1) >= MINUS && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set166));
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
	// /Users/twb/repos/Tiger/Tiger.g:240:1: funct_call : ID LPAREN id_list RPAREN -> ^( INVOKE ID id_list ) ;
	public final TigerParser.funct_call_return funct_call() throws RecognitionException {
		TigerParser.funct_call_return retval = new TigerParser.funct_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID167=null;
		Token LPAREN168=null;
		Token RPAREN170=null;
		ParserRuleReturnScope id_list169 =null;

		Object ID167_tree=null;
		Object LPAREN168_tree=null;
		Object RPAREN170_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");

		try {
			// /Users/twb/repos/Tiger/Tiger.g:241:2: ( ID LPAREN id_list RPAREN -> ^( INVOKE ID id_list ) )
			// /Users/twb/repos/Tiger/Tiger.g:241:4: ID LPAREN id_list RPAREN
			{
			ID167=(Token)match(input,ID,FOLLOW_ID_in_funct_call1331);  
			stream_ID.add(ID167);

			LPAREN168=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funct_call1333);  
			stream_LPAREN.add(LPAREN168);

			pushFollow(FOLLOW_id_list_in_funct_call1335);
			id_list169=id_list();
			state._fsp--;

			stream_id_list.add(id_list169.getTree());
			RPAREN170=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funct_call1337);  
			stream_RPAREN.add(RPAREN170);

			// AST REWRITE
			// elements: ID, id_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 241:29: -> ^( INVOKE ID id_list )
			{
				// /Users/twb/repos/Tiger/Tiger.g:241:32: ^( INVOKE ID id_list )
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



	public static final BitSet FOLLOW_type_declaration_list_in_tiger_program82 = new BitSet(new long[]{0x0100000090200000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_tiger_program84 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_main_function_in_tiger_program86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_list109 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_type_declaration_list_in_type_declaration_list111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration138 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_type_declaration140 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration142 = new BitSet(new long[]{0x0000000080200020L});
	public static final BitSet FOLLOW_type_in_type_declaration144 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_declaration_in_funct_declaration_list169 = new BitSet(new long[]{0x0100000090200000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_type_in_funct_declaration197 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_in_funct_declaration199 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_funct_declaration201 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_declaration203 = new BitSet(new long[]{0x0002000010000000L});
	public static final BitSet FOLLOW_param_list_in_funct_declaration205 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_declaration207 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_funct_declaration209 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_funct_declaration211 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_funct_declaration213 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_funct_declaration215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_main_function240 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_MAIN_in_main_function242 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_main_function244 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_main_function246 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_main_function248 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_main_function250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_ret_type272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_ret_type278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list289 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail317 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_param_in_param_list_tail320 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_tail322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_param340 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_param342 = new BitSet(new long[]{0x0000000090200000L});
	public static final BitSet FOLLOW_type_id_in_param344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list366 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail379 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block397 = new BitSet(new long[]{0x00A0000000000000L});
	public static final BitSet FOLLOW_declaration_segment_in_block401 = new BitSet(new long[]{0x0201000050810280L});
	public static final BitSet FOLLOW_stat_seq_in_block403 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_END_in_block405 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_list_in_declaration_segment464 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_declaration_segment466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_list477 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_var_declaration_list479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type500 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_array_index_const_in_type502 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_OF_in_type504 = new BitSet(new long[]{0x0000000080200000L});
	public static final BitSet FOLLOW_base_type_in_type506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type523 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_array_index_const_in_type527 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_array_index_const_in_type531 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_OF_in_type533 = new BitSet(new long[]{0x0000000080200000L});
	public static final BitSet FOLLOW_base_type_in_type535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_id566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration594 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration596 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_var_declaration598 = new BitSet(new long[]{0x0000000090200000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration600 = new BitSet(new long[]{0x0004000000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration602 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init628 = new BitSet(new long[]{0x0000000100400000L});
	public static final BitSet FOLLOW_constant_in_optional_init630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list649 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_id_list_tail662 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_id_list_tail664 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list_tail666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_int684 = new BitSet(new long[]{0x0000000100400000L});
	public static final BitSet FOLLOW_constant_in_optional_int686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq702 = new BitSet(new long[]{0x0201000050800282L});
	public static final BitSet FOLLOW_constant_in_expr716 = new BitSet(new long[]{0x00002B8804082012L});
	public static final BitSet FOLLOW_value_in_expr720 = new BitSet(new long[]{0x00002B8804082012L});
	public static final BitSet FOLLOW_LPAREN_in_expr724 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr727 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr729 = new BitSet(new long[]{0x00002B8804082012L});
	public static final BitSet FOLLOW_binary_operator_in_expr741 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr744 = new BitSet(new long[]{0x00002B8804082012L});
	public static final BitSet FOLLOW_expr_in_expr_list757 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail785 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail787 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_stat804 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat806 = new BitSet(new long[]{0x0000002150400000L});
	public static final BitSet FOLLOW_stat_assignment_in_stat808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_stat823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat829 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_stat831 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat833 = new BitSet(new long[]{0x0201000050820280L});
	public static final BitSet FOLLOW_stat_seq_in_stat835 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat837 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat856 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_stat858 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat860 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_range_in_stat862 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_DO_in_stat864 = new BitSet(new long[]{0x0201000050820280L});
	public static final BitSet FOLLOW_stat_seq_in_stat866 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDDO_in_stat868 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat886 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat897 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_stat899 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_call_in_stat919 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_range939 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_TO_in_range941 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_range945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_stat_assignment969 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat_assignment971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_stat_assignment980 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_stat_assignment982 = new BitSet(new long[]{0x0002002110400000L});
	public static final BitSet FOLLOW_expr_list_in_stat_assignment984 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat_assignment986 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat_assignment988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt999 = new BitSet(new long[]{0x0000002110400000L});
	public static final BitSet FOLLOW_expr_in_if_stmt1001 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_then_stmt_in_if_stmt1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THEN_in_then_stmt1026 = new BitSet(new long[]{0x0201000050848280L});
	public static final BitSet FOLLOW_stat_seq_in_then_stmt1028 = new BitSet(new long[]{0x0000000000048000L});
	public static final BitSet FOLLOW_if_tail_in_then_stmt1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_tail1050 = new BitSet(new long[]{0x0201000050840280L});
	public static final BitSet FOLLOW_stat_seq_in_if_tail1052 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDIF_in_if_tail1054 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_tail1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENDIF_in_if_tail1069 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_tail1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_opt_prefix1082 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_opt_prefix1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_binary_operator1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_binary_operator1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_binary_operator1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIV_in_binary_operator1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_binary_operator1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_binary_operator1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_binary_operator1146 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_less_equality_in_binary_operator1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_binary_operator1153 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_great_equality_in_binary_operator1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_binary_operator1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_binary_operator1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_less_equality1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_great_equality1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1205 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_value_tail_in_value1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_index_in_value_tail1218 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_array_index_in_value_tail1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_index_const1237 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_INTLIT_in_array_index_const1239 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_index_const1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_array_index1258 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_array_index1260 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_RBRACK_in_array_index1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_index_expr1278 = new BitSet(new long[]{0x0000218000000002L});
	public static final BitSet FOLLOW_index_oper_in_index_expr1295 = new BitSet(new long[]{0x0000000110000000L});
	public static final BitSet FOLLOW_index_expr_in_index_expr1297 = new BitSet(new long[]{0x0000218000000002L});
	public static final BitSet FOLLOW_ID_in_funct_call1331 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_call1333 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_id_list_in_funct_call1335 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_call1337 = new BitSet(new long[]{0x0000000000000002L});
}
