// $ANTLR 3.5.1 grammar/Tiger.g 2014-10-26 11:11:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class TigerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "BEGIN", 
		"BLOCK", "BLOCKS", "BREAK", "COLON", "COMMA", "COMMENT", "CONSTANT", "DIMENSION", 
		"DIV", "DO", "ELSE", "END", "ENDDO", "ENDIF", "EQ", "EXPR", "EXPRS", "FIXEDPT", 
		"FIXEDPTLIT", "FOR", "FUNC", "FUNCS", "FUNCTION", "GEQ", "GREATER", "ID", 
		"IDS", "IF", "INT", "INTLIT", "INVOKE", "LBRACK", "LEQ", "LESSER", "LPAREN", 
		"MAIN", "MINUS", "MULT", "NEQ", "OF", "OR", "PARAM", "PARAMS", "PLUS", 
		"PROGRAM", "RBRACK", "REFERENCE", "RETURN", "RPAREN", "SEMI", "STATEMENTS", 
		"THEN", "TO", "TYPE", "TYPES", "VAR", "VARS", "VOID", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ARRAY=5;
	public static final int ASSIGN=6;
	public static final int BEGIN=7;
	public static final int BLOCK=8;
	public static final int BLOCKS=9;
	public static final int BREAK=10;
	public static final int COLON=11;
	public static final int COMMA=12;
	public static final int COMMENT=13;
	public static final int CONSTANT=14;
	public static final int DIMENSION=15;
	public static final int DIV=16;
	public static final int DO=17;
	public static final int ELSE=18;
	public static final int END=19;
	public static final int ENDDO=20;
	public static final int ENDIF=21;
	public static final int EQ=22;
	public static final int EXPR=23;
	public static final int EXPRS=24;
	public static final int FIXEDPT=25;
	public static final int FIXEDPTLIT=26;
	public static final int FOR=27;
	public static final int FUNC=28;
	public static final int FUNCS=29;
	public static final int FUNCTION=30;
	public static final int GEQ=31;
	public static final int GREATER=32;
	public static final int ID=33;
	public static final int IDS=34;
	public static final int IF=35;
	public static final int INT=36;
	public static final int INTLIT=37;
	public static final int INVOKE=38;
	public static final int LBRACK=39;
	public static final int LEQ=40;
	public static final int LESSER=41;
	public static final int LPAREN=42;
	public static final int MAIN=43;
	public static final int MINUS=44;
	public static final int MULT=45;
	public static final int NEQ=46;
	public static final int OF=47;
	public static final int OR=48;
	public static final int PARAM=49;
	public static final int PARAMS=50;
	public static final int PLUS=51;
	public static final int PROGRAM=52;
	public static final int RBRACK=53;
	public static final int REFERENCE=54;
	public static final int RETURN=55;
	public static final int RPAREN=56;
	public static final int SEMI=57;
	public static final int STATEMENTS=58;
	public static final int THEN=59;
	public static final int TO=60;
	public static final int TYPE=61;
	public static final int TYPES=62;
	public static final int VAR=63;
	public static final int VARS=64;
	public static final int VOID=65;
	public static final int WHILE=66;
	public static final int WS=67;

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
	// grammar/Tiger.g:73:1: tiger_program : ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ^( TYPES ( type_declaration_list )? ) ^( FUNCS function_declaration_list ) ) ;
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
			// grammar/Tiger.g:74:2: ( ( type_declaration_list function_declaration_list EOF ) -> ^( PROGRAM ^( TYPES ( type_declaration_list )? ) ^( FUNCS function_declaration_list ) ) )
			// grammar/Tiger.g:74:4: ( type_declaration_list function_declaration_list EOF )
			{
			// grammar/Tiger.g:74:4: ( type_declaration_list function_declaration_list EOF )
			// grammar/Tiger.g:74:5: type_declaration_list function_declaration_list EOF
			{
			pushFollow(FOLLOW_type_declaration_list_in_tiger_program166);
			type_declaration_list1=type_declaration_list();
			state._fsp--;

			stream_type_declaration_list.add(type_declaration_list1.getTree());
			pushFollow(FOLLOW_function_declaration_list_in_tiger_program168);
			function_declaration_list2=function_declaration_list();
			state._fsp--;

			stream_function_declaration_list.add(function_declaration_list2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_tiger_program170);  
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
			// 74:58: -> ^( PROGRAM ^( TYPES ( type_declaration_list )? ) ^( FUNCS function_declaration_list ) )
			{
				// grammar/Tiger.g:74:61: ^( PROGRAM ^( TYPES ( type_declaration_list )? ) ^( FUNCS function_declaration_list ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// grammar/Tiger.g:74:71: ^( TYPES ( type_declaration_list )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_2);
				// grammar/Tiger.g:74:79: ( type_declaration_list )?
				if ( stream_type_declaration_list.hasNext() ) {
					adaptor.addChild(root_2, stream_type_declaration_list.nextTree());
				}
				stream_type_declaration_list.reset();

				adaptor.addChild(root_1, root_2);
				}

				// grammar/Tiger.g:74:103: ^( FUNCS function_declaration_list )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCS, "FUNCS"), root_2);
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
	// grammar/Tiger.g:81:1: type_declaration_list : ( ( TYPE ID EQ type SEMI type_declaration_list ) -> ^( TYPE ID type ) ( type_declaration_list )? |);
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
			// grammar/Tiger.g:82:2: ( ( TYPE ID EQ type SEMI type_declaration_list ) -> ^( TYPE ID type ) ( type_declaration_list )? |)
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
					// grammar/Tiger.g:82:4: ( TYPE ID EQ type SEMI type_declaration_list )
					{
					// grammar/Tiger.g:82:4: ( TYPE ID EQ type SEMI type_declaration_list )
					// grammar/Tiger.g:82:5: TYPE ID EQ type SEMI type_declaration_list
					{
					TYPE4=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_declaration_list206);  
					stream_TYPE.add(TYPE4);

					ID5=(Token)match(input,ID,FOLLOW_ID_in_type_declaration_list208);  
					stream_ID.add(ID5);

					EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_type_declaration_list210);  
					stream_EQ.add(EQ6);

					pushFollow(FOLLOW_type_in_type_declaration_list212);
					type7=type();
					state._fsp--;

					stream_type.add(type7.getTree());
					SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_type_declaration_list214);  
					stream_SEMI.add(SEMI8);

					pushFollow(FOLLOW_type_declaration_list_in_type_declaration_list216);
					type_declaration_list9=type_declaration_list();
					state._fsp--;

					stream_type_declaration_list.add(type_declaration_list9.getTree());
					}

					// AST REWRITE
					// elements: type, ID, type_declaration_list, TYPE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:49: -> ^( TYPE ID type ) ( type_declaration_list )?
					{
						// grammar/Tiger.g:82:52: ^( TYPE ID type )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// grammar/Tiger.g:82:68: ( type_declaration_list )?
						if ( stream_type_declaration_list.hasNext() ) {
							adaptor.addChild(root_0, stream_type_declaration_list.nextTree());
						}
						stream_type_declaration_list.reset();

					}


					retval.tree = root_0;

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
	// $ANTLR end "type_declaration_list"


	public static class function_declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_declaration_list"
	// grammar/Tiger.g:86:1: function_declaration_list : ( ( return_type ( FUNCTION name= ID |name= MAIN ) LPAREN param_list RPAREN BEGIN block_list END SEMI ) function_declaration_list -> ^( FUNC return_type $name ^( PARAMS ( param_list )? ) ^( BLOCKS block_list ) ) ( function_declaration_list )? |);
	public final TigerParser.function_declaration_list_return function_declaration_list() throws RecognitionException {
		TigerParser.function_declaration_list_return retval = new TigerParser.function_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name=null;
		Token FUNCTION11=null;
		Token LPAREN12=null;
		Token RPAREN14=null;
		Token BEGIN15=null;
		Token END17=null;
		Token SEMI18=null;
		ParserRuleReturnScope return_type10 =null;
		ParserRuleReturnScope param_list13 =null;
		ParserRuleReturnScope block_list16 =null;
		ParserRuleReturnScope function_declaration_list19 =null;

		Object name_tree=null;
		Object FUNCTION11_tree=null;
		Object LPAREN12_tree=null;
		Object RPAREN14_tree=null;
		Object BEGIN15_tree=null;
		Object END17_tree=null;
		Object SEMI18_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
		RewriteRuleSubtreeStream stream_function_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration_list");
		RewriteRuleSubtreeStream stream_block_list=new RewriteRuleSubtreeStream(adaptor,"rule block_list");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// grammar/Tiger.g:87:2: ( ( return_type ( FUNCTION name= ID |name= MAIN ) LPAREN param_list RPAREN BEGIN block_list END SEMI ) function_declaration_list -> ^( FUNC return_type $name ^( PARAMS ( param_list )? ) ^( BLOCKS block_list ) ) ( function_declaration_list )? |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==FIXEDPT||LA3_0==ID||LA3_0==INT||LA3_0==VOID) ) {
				alt3=1;
			}
			else if ( (LA3_0==EOF) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// grammar/Tiger.g:87:4: ( return_type ( FUNCTION name= ID |name= MAIN ) LPAREN param_list RPAREN BEGIN block_list END SEMI ) function_declaration_list
					{
					// grammar/Tiger.g:87:4: ( return_type ( FUNCTION name= ID |name= MAIN ) LPAREN param_list RPAREN BEGIN block_list END SEMI )
					// grammar/Tiger.g:87:5: return_type ( FUNCTION name= ID |name= MAIN ) LPAREN param_list RPAREN BEGIN block_list END SEMI
					{
					pushFollow(FOLLOW_return_type_in_function_declaration_list245);
					return_type10=return_type();
					state._fsp--;

					stream_return_type.add(return_type10.getTree());
					// grammar/Tiger.g:87:17: ( FUNCTION name= ID |name= MAIN )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==FUNCTION) ) {
						alt2=1;
					}
					else if ( (LA2_0==MAIN) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// grammar/Tiger.g:87:18: FUNCTION name= ID
							{
							FUNCTION11=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function_declaration_list248);  
							stream_FUNCTION.add(FUNCTION11);

							name=(Token)match(input,ID,FOLLOW_ID_in_function_declaration_list252);  
							stream_ID.add(name);

							}
							break;
						case 2 :
							// grammar/Tiger.g:87:37: name= MAIN
							{
							name=(Token)match(input,MAIN,FOLLOW_MAIN_in_function_declaration_list258);  
							stream_MAIN.add(name);

							}
							break;

					}

					LPAREN12=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function_declaration_list261);  
					stream_LPAREN.add(LPAREN12);

					pushFollow(FOLLOW_param_list_in_function_declaration_list263);
					param_list13=param_list();
					state._fsp--;

					stream_param_list.add(param_list13.getTree());
					RPAREN14=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_declaration_list265);  
					stream_RPAREN.add(RPAREN14);

					BEGIN15=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_function_declaration_list267);  
					stream_BEGIN.add(BEGIN15);

					pushFollow(FOLLOW_block_list_in_function_declaration_list269);
					block_list16=block_list();
					state._fsp--;

					stream_block_list.add(block_list16.getTree());
					END17=(Token)match(input,END,FOLLOW_END_in_function_declaration_list271);  
					stream_END.add(END17);

					SEMI18=(Token)match(input,SEMI,FOLLOW_SEMI_in_function_declaration_list273);  
					stream_SEMI.add(SEMI18);

					}

					pushFollow(FOLLOW_function_declaration_list_in_function_declaration_list276);
					function_declaration_list19=function_declaration_list();
					state._fsp--;

					stream_function_declaration_list.add(function_declaration_list19.getTree());
					// AST REWRITE
					// elements: param_list, block_list, return_type, name, function_declaration_list
					// token labels: name
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 87:126: -> ^( FUNC return_type $name ^( PARAMS ( param_list )? ) ^( BLOCKS block_list ) ) ( function_declaration_list )?
					{
						// grammar/Tiger.g:87:129: ^( FUNC return_type $name ^( PARAMS ( param_list )? ) ^( BLOCKS block_list ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);
						adaptor.addChild(root_1, stream_return_type.nextTree());
						adaptor.addChild(root_1, stream_name.nextNode());
						// grammar/Tiger.g:87:154: ^( PARAMS ( param_list )? )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						// grammar/Tiger.g:87:163: ( param_list )?
						if ( stream_param_list.hasNext() ) {
							adaptor.addChild(root_2, stream_param_list.nextTree());
						}
						stream_param_list.reset();

						adaptor.addChild(root_1, root_2);
						}

						// grammar/Tiger.g:87:176: ^( BLOCKS block_list )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCKS, "BLOCKS"), root_2);
						adaptor.addChild(root_2, stream_block_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

						// grammar/Tiger.g:87:198: ( function_declaration_list )?
						if ( stream_function_declaration_list.hasNext() ) {
							adaptor.addChild(root_0, stream_function_declaration_list.nextTree());
						}
						stream_function_declaration_list.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:89:2: 
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
	// grammar/Tiger.g:91:1: var_declaration_list : ( ( VAR id_list COLON type_id ( ASSIGN constant )? SEMI var_declaration_list ) -> ^( VAR ^( IDS id_list ) type_id ( constant )? ) ( var_declaration_list )? |);
	public final TigerParser.var_declaration_list_return var_declaration_list() throws RecognitionException {
		TigerParser.var_declaration_list_return retval = new TigerParser.var_declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR20=null;
		Token COLON22=null;
		Token ASSIGN24=null;
		Token SEMI26=null;
		ParserRuleReturnScope id_list21 =null;
		ParserRuleReturnScope type_id23 =null;
		ParserRuleReturnScope constant25 =null;
		ParserRuleReturnScope var_declaration_list27 =null;

		Object VAR20_tree=null;
		Object COLON22_tree=null;
		Object ASSIGN24_tree=null;
		Object SEMI26_tree=null;
		RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_var_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration_list");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");

		try {
			// grammar/Tiger.g:92:2: ( ( VAR id_list COLON type_id ( ASSIGN constant )? SEMI var_declaration_list ) -> ^( VAR ^( IDS id_list ) type_id ( constant )? ) ( var_declaration_list )? |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==VAR) ) {
				alt5=1;
			}
			else if ( (LA5_0==BEGIN||LA5_0==BREAK||LA5_0==FOR||LA5_0==ID||LA5_0==IF||LA5_0==RETURN||LA5_0==WHILE) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// grammar/Tiger.g:92:4: ( VAR id_list COLON type_id ( ASSIGN constant )? SEMI var_declaration_list )
					{
					// grammar/Tiger.g:92:4: ( VAR id_list COLON type_id ( ASSIGN constant )? SEMI var_declaration_list )
					// grammar/Tiger.g:92:5: VAR id_list COLON type_id ( ASSIGN constant )? SEMI var_declaration_list
					{
					VAR20=(Token)match(input,VAR,FOLLOW_VAR_in_var_declaration_list318);  
					stream_VAR.add(VAR20);

					pushFollow(FOLLOW_id_list_in_var_declaration_list320);
					id_list21=id_list();
					state._fsp--;

					stream_id_list.add(id_list21.getTree());
					COLON22=(Token)match(input,COLON,FOLLOW_COLON_in_var_declaration_list322);  
					stream_COLON.add(COLON22);

					pushFollow(FOLLOW_type_id_in_var_declaration_list324);
					type_id23=type_id();
					state._fsp--;

					stream_type_id.add(type_id23.getTree());
					// grammar/Tiger.g:92:31: ( ASSIGN constant )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ASSIGN) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// grammar/Tiger.g:92:32: ASSIGN constant
							{
							ASSIGN24=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_var_declaration_list327);  
							stream_ASSIGN.add(ASSIGN24);

							pushFollow(FOLLOW_constant_in_var_declaration_list329);
							constant25=constant();
							state._fsp--;

							stream_constant.add(constant25.getTree());
							}
							break;

					}

					SEMI26=(Token)match(input,SEMI,FOLLOW_SEMI_in_var_declaration_list333);  
					stream_SEMI.add(SEMI26);

					pushFollow(FOLLOW_var_declaration_list_in_var_declaration_list335);
					var_declaration_list27=var_declaration_list();
					state._fsp--;

					stream_var_declaration_list.add(var_declaration_list27.getTree());
					}

					// AST REWRITE
					// elements: id_list, var_declaration_list, VAR, type_id, constant
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 92:77: -> ^( VAR ^( IDS id_list ) type_id ( constant )? ) ( var_declaration_list )?
					{
						// grammar/Tiger.g:92:80: ^( VAR ^( IDS id_list ) type_id ( constant )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);
						// grammar/Tiger.g:92:86: ^( IDS id_list )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDS, "IDS"), root_2);
						adaptor.addChild(root_2, stream_id_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_type_id.nextTree());
						// grammar/Tiger.g:92:109: ( constant )?
						if ( stream_constant.hasNext() ) {
							adaptor.addChild(root_1, stream_constant.nextTree());
						}
						stream_constant.reset();

						adaptor.addChild(root_0, root_1);
						}

						// grammar/Tiger.g:92:120: ( var_declaration_list )?
						if ( stream_var_declaration_list.hasNext() ) {
							adaptor.addChild(root_0, stream_var_declaration_list.nextTree());
						}
						stream_var_declaration_list.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:94:2: 
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
	// grammar/Tiger.g:100:1: param_list : ( ID COLON type_id param_list_tail -> ^( PARAM ID type_id ) ( param_list_tail )? |);
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
			// grammar/Tiger.g:101:2: ( ID COLON type_id param_list_tail -> ^( PARAM ID type_id ) ( param_list_tail )? |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
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
					// grammar/Tiger.g:101:4: ID COLON type_id param_list_tail
					{
					ID28=(Token)match(input,ID,FOLLOW_ID_in_param_list374);  
					stream_ID.add(ID28);

					COLON29=(Token)match(input,COLON,FOLLOW_COLON_in_param_list376);  
					stream_COLON.add(COLON29);

					pushFollow(FOLLOW_type_id_in_param_list378);
					type_id30=type_id();
					state._fsp--;

					stream_type_id.add(type_id30.getTree());
					pushFollow(FOLLOW_param_list_tail_in_param_list380);
					param_list_tail31=param_list_tail();
					state._fsp--;

					stream_param_list_tail.add(param_list_tail31.getTree());
					// AST REWRITE
					// elements: param_list_tail, type_id, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 101:38: -> ^( PARAM ID type_id ) ( param_list_tail )?
					{
						// grammar/Tiger.g:101:41: ^( PARAM ID type_id )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_type_id.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// grammar/Tiger.g:101:61: ( param_list_tail )?
						if ( stream_param_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_param_list_tail.nextTree());
						}
						stream_param_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:103:2: 
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
	// grammar/Tiger.g:105:1: param_list_tail : ( COMMA param_list -> param_list |);
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
			// grammar/Tiger.g:106:2: ( COMMA param_list -> param_list |)
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==COMMA) ) {
				alt7=1;
			}
			else if ( (LA7_0==RPAREN) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// grammar/Tiger.g:106:4: COMMA param_list
					{
					COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_param_list_tail410);  
					stream_COMMA.add(COMMA32);

					pushFollow(FOLLOW_param_list_in_param_list_tail412);
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
					// 106:21: -> param_list
					{
						adaptor.addChild(root_0, stream_param_list.nextTree());
					}


					retval.tree = root_0;

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
	// $ANTLR end "param_list_tail"


	public static class block_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_list"
	// grammar/Tiger.g:114:1: block_list : block block_tail ;
	public final TigerParser.block_list_return block_list() throws RecognitionException {
		TigerParser.block_list_return retval = new TigerParser.block_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block34 =null;
		ParserRuleReturnScope block_tail35 =null;


		try {
			// grammar/Tiger.g:115:2: ( block block_tail )
			// grammar/Tiger.g:115:4: block block_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_block_in_block_list435);
			block34=block();
			state._fsp--;

			adaptor.addChild(root_0, block34.getTree());

			pushFollow(FOLLOW_block_tail_in_block_list437);
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
	// grammar/Tiger.g:118:1: block_tail : ( block block_tail |);
	public final TigerParser.block_tail_return block_tail() throws RecognitionException {
		TigerParser.block_tail_return retval = new TigerParser.block_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block36 =null;
		ParserRuleReturnScope block_tail37 =null;


		try {
			// grammar/Tiger.g:119:2: ( block block_tail |)
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BEGIN) ) {
				alt8=1;
			}
			else if ( (LA8_0==END) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// grammar/Tiger.g:119:4: block block_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_block_tail448);
					block36=block();
					state._fsp--;

					adaptor.addChild(root_0, block36.getTree());

					pushFollow(FOLLOW_block_tail_in_block_tail450);
					block_tail37=block_tail();
					state._fsp--;

					adaptor.addChild(root_0, block_tail37.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:121:2: 
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
	// grammar/Tiger.g:123:1: block : ( BEGIN type_declaration_list var_declaration_list stat_list END SEMI ) -> ^( BLOCK ^( TYPES ( type_declaration_list )? ) ^( VARS ( var_declaration_list )? ) ^( STATEMENTS stat_list ) ) ;
	public final TigerParser.block_return block() throws RecognitionException {
		TigerParser.block_return retval = new TigerParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN38=null;
		Token END42=null;
		Token SEMI43=null;
		ParserRuleReturnScope type_declaration_list39 =null;
		ParserRuleReturnScope var_declaration_list40 =null;
		ParserRuleReturnScope stat_list41 =null;

		Object BEGIN38_tree=null;
		Object END42_tree=null;
		Object SEMI43_tree=null;
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_var_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule var_declaration_list");
		RewriteRuleSubtreeStream stream_stat_list=new RewriteRuleSubtreeStream(adaptor,"rule stat_list");
		RewriteRuleSubtreeStream stream_type_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration_list");

		try {
			// grammar/Tiger.g:124:2: ( ( BEGIN type_declaration_list var_declaration_list stat_list END SEMI ) -> ^( BLOCK ^( TYPES ( type_declaration_list )? ) ^( VARS ( var_declaration_list )? ) ^( STATEMENTS stat_list ) ) )
			// grammar/Tiger.g:124:4: ( BEGIN type_declaration_list var_declaration_list stat_list END SEMI )
			{
			// grammar/Tiger.g:124:4: ( BEGIN type_declaration_list var_declaration_list stat_list END SEMI )
			// grammar/Tiger.g:124:5: BEGIN type_declaration_list var_declaration_list stat_list END SEMI
			{
			BEGIN38=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block466);  
			stream_BEGIN.add(BEGIN38);

			pushFollow(FOLLOW_type_declaration_list_in_block468);
			type_declaration_list39=type_declaration_list();
			state._fsp--;

			stream_type_declaration_list.add(type_declaration_list39.getTree());
			pushFollow(FOLLOW_var_declaration_list_in_block470);
			var_declaration_list40=var_declaration_list();
			state._fsp--;

			stream_var_declaration_list.add(var_declaration_list40.getTree());
			pushFollow(FOLLOW_stat_list_in_block472);
			stat_list41=stat_list();
			state._fsp--;

			stream_stat_list.add(stat_list41.getTree());
			END42=(Token)match(input,END,FOLLOW_END_in_block474);  
			stream_END.add(END42);

			SEMI43=(Token)match(input,SEMI,FOLLOW_SEMI_in_block476);  
			stream_SEMI.add(SEMI43);

			}

			// AST REWRITE
			// elements: type_declaration_list, stat_list, var_declaration_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 124:74: -> ^( BLOCK ^( TYPES ( type_declaration_list )? ) ^( VARS ( var_declaration_list )? ) ^( STATEMENTS stat_list ) )
			{
				// grammar/Tiger.g:124:77: ^( BLOCK ^( TYPES ( type_declaration_list )? ) ^( VARS ( var_declaration_list )? ) ^( STATEMENTS stat_list ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// grammar/Tiger.g:124:85: ^( TYPES ( type_declaration_list )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_2);
				// grammar/Tiger.g:124:93: ( type_declaration_list )?
				if ( stream_type_declaration_list.hasNext() ) {
					adaptor.addChild(root_2, stream_type_declaration_list.nextTree());
				}
				stream_type_declaration_list.reset();

				adaptor.addChild(root_1, root_2);
				}

				// grammar/Tiger.g:124:117: ^( VARS ( var_declaration_list )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_2);
				// grammar/Tiger.g:124:124: ( var_declaration_list )?
				if ( stream_var_declaration_list.hasNext() ) {
					adaptor.addChild(root_2, stream_var_declaration_list.nextTree());
				}
				stream_var_declaration_list.reset();

				adaptor.addChild(root_1, root_2);
				}

				// grammar/Tiger.g:124:147: ^( STATEMENTS stat_list )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				adaptor.addChild(root_2, stream_stat_list.nextTree());
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
	// $ANTLR end "block"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// grammar/Tiger.g:131:1: type : ( base_type | ARRAY LBRACK rows= INTLIT RBRACK ( LBRACK columns= INTLIT RBRACK )? OF base_type -> base_type $rows ( $columns)? );
	public final TigerParser.type_return type() throws RecognitionException {
		TigerParser.type_return retval = new TigerParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token rows=null;
		Token columns=null;
		Token ARRAY45=null;
		Token LBRACK46=null;
		Token RBRACK47=null;
		Token LBRACK48=null;
		Token RBRACK49=null;
		Token OF50=null;
		ParserRuleReturnScope base_type44 =null;
		ParserRuleReturnScope base_type51 =null;

		Object rows_tree=null;
		Object columns_tree=null;
		Object ARRAY45_tree=null;
		Object LBRACK46_tree=null;
		Object RBRACK47_tree=null;
		Object LBRACK48_tree=null;
		Object RBRACK49_tree=null;
		Object OF50_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");
		RewriteRuleSubtreeStream stream_base_type=new RewriteRuleSubtreeStream(adaptor,"rule base_type");

		try {
			// grammar/Tiger.g:132:2: ( base_type | ARRAY LBRACK rows= INTLIT RBRACK ( LBRACK columns= INTLIT RBRACK )? OF base_type -> base_type $rows ( $columns)? )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FIXEDPT||LA10_0==INT) ) {
				alt10=1;
			}
			else if ( (LA10_0==ARRAY) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// grammar/Tiger.g:132:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type518);
					base_type44=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type44.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:133:4: ARRAY LBRACK rows= INTLIT RBRACK ( LBRACK columns= INTLIT RBRACK )? OF base_type
					{
					ARRAY45=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_type523);  
					stream_ARRAY.add(ARRAY45);

					LBRACK46=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_type525);  
					stream_LBRACK.add(LBRACK46);

					rows=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_type529);  
					stream_INTLIT.add(rows);

					RBRACK47=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_type531);  
					stream_RBRACK.add(RBRACK47);

					// grammar/Tiger.g:133:36: ( LBRACK columns= INTLIT RBRACK )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==LBRACK) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// grammar/Tiger.g:133:37: LBRACK columns= INTLIT RBRACK
							{
							LBRACK48=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_type534);  
							stream_LBRACK.add(LBRACK48);

							columns=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_type538);  
							stream_INTLIT.add(columns);

							RBRACK49=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_type540);  
							stream_RBRACK.add(RBRACK49);

							}
							break;

					}

					OF50=(Token)match(input,OF,FOLLOW_OF_in_type544);  
					stream_OF.add(OF50);

					pushFollow(FOLLOW_base_type_in_type546);
					base_type51=base_type();
					state._fsp--;

					stream_base_type.add(base_type51.getTree());
					// AST REWRITE
					// elements: columns, rows, base_type
					// token labels: columns, rows
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_columns=new RewriteRuleTokenStream(adaptor,"token columns",columns);
					RewriteRuleTokenStream stream_rows=new RewriteRuleTokenStream(adaptor,"token rows",rows);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:81: -> base_type $rows ( $columns)?
					{
						adaptor.addChild(root_0, stream_base_type.nextTree());
						adaptor.addChild(root_0, stream_rows.nextNode());
						// grammar/Tiger.g:133:101: ( $columns)?
						if ( stream_columns.hasNext() ) {
							adaptor.addChild(root_0, stream_columns.nextNode());
						}
						stream_columns.reset();

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


	public static class return_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "return_type"
	// grammar/Tiger.g:136:1: return_type : ( type_id | VOID );
	public final TigerParser.return_type_return return_type() throws RecognitionException {
		TigerParser.return_type_return retval = new TigerParser.return_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VOID53=null;
		ParserRuleReturnScope type_id52 =null;

		Object VOID53_tree=null;

		try {
			// grammar/Tiger.g:137:2: ( type_id | VOID )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==FIXEDPT||LA11_0==ID||LA11_0==INT) ) {
				alt11=1;
			}
			else if ( (LA11_0==VOID) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// grammar/Tiger.g:137:4: type_id
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_id_in_return_type568);
					type_id52=type_id();
					state._fsp--;

					adaptor.addChild(root_0, type_id52.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:138:4: VOID
					{
					root_0 = (Object)adaptor.nil();


					VOID53=(Token)match(input,VOID,FOLLOW_VOID_in_return_type573); 
					VOID53_tree = (Object)adaptor.create(VOID53);
					adaptor.addChild(root_0, VOID53_tree);

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
	// $ANTLR end "return_type"


	public static class type_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_id"
	// grammar/Tiger.g:141:1: type_id : ( base_type | ID );
	public final TigerParser.type_id_return type_id() throws RecognitionException {
		TigerParser.type_id_return retval = new TigerParser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID55=null;
		ParserRuleReturnScope base_type54 =null;

		Object ID55_tree=null;

		try {
			// grammar/Tiger.g:142:2: ( base_type | ID )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==FIXEDPT||LA12_0==INT) ) {
				alt12=1;
			}
			else if ( (LA12_0==ID) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// grammar/Tiger.g:142:4: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_type_id584);
					base_type54=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type54.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:143:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID55=(Token)match(input,ID,FOLLOW_ID_in_type_id589); 
					ID55_tree = (Object)adaptor.create(ID55);
					adaptor.addChild(root_0, ID55_tree);

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
	// grammar/Tiger.g:146:1: base_type : ( INT | FIXEDPT );
	public final TigerParser.base_type_return base_type() throws RecognitionException {
		TigerParser.base_type_return retval = new TigerParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set56=null;

		Object set56_tree=null;

		try {
			// grammar/Tiger.g:147:2: ( INT | FIXEDPT )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set56=input.LT(1);
			if ( input.LA(1)==FIXEDPT||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set56));
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


	public static class id_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "id_list"
	// grammar/Tiger.g:155:1: id_list : ID id_list_tail ;
	public final TigerParser.id_list_return id_list() throws RecognitionException {
		TigerParser.id_list_return retval = new TigerParser.id_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID57=null;
		ParserRuleReturnScope id_list_tail58 =null;

		Object ID57_tree=null;

		try {
			// grammar/Tiger.g:156:2: ( ID id_list_tail )
			// grammar/Tiger.g:156:4: ID id_list_tail
			{
			root_0 = (Object)adaptor.nil();


			ID57=(Token)match(input,ID,FOLLOW_ID_in_id_list620); 
			ID57_tree = (Object)adaptor.create(ID57);
			adaptor.addChild(root_0, ID57_tree);

			pushFollow(FOLLOW_id_list_tail_in_id_list622);
			id_list_tail58=id_list_tail();
			state._fsp--;

			adaptor.addChild(root_0, id_list_tail58.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// grammar/Tiger.g:159:1: id_list_tail : ( COMMA ID id_list_tail -> ID ( id_list_tail )? |);
	public final TigerParser.id_list_tail_return id_list_tail() throws RecognitionException {
		TigerParser.id_list_tail_return retval = new TigerParser.id_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA59=null;
		Token ID60=null;
		ParserRuleReturnScope id_list_tail61 =null;

		Object COMMA59_tree=null;
		Object ID60_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_id_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule id_list_tail");

		try {
			// grammar/Tiger.g:160:2: ( COMMA ID id_list_tail -> ID ( id_list_tail )? |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==COMMA) ) {
				alt13=1;
			}
			else if ( (LA13_0==COLON) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// grammar/Tiger.g:160:4: COMMA ID id_list_tail
					{
					COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list_tail633);  
					stream_COMMA.add(COMMA59);

					ID60=(Token)match(input,ID,FOLLOW_ID_in_id_list_tail635);  
					stream_ID.add(ID60);

					pushFollow(FOLLOW_id_list_tail_in_id_list_tail637);
					id_list_tail61=id_list_tail();
					state._fsp--;

					stream_id_list_tail.add(id_list_tail61.getTree());
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
					// 160:26: -> ID ( id_list_tail )?
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
						// grammar/Tiger.g:160:32: ( id_list_tail )?
						if ( stream_id_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_id_list_tail.nextTree());
						}
						stream_id_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:162:2: 
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
	// grammar/Tiger.g:168:1: expr_list : ( expr expr_list_tail |);
	public final TigerParser.expr_list_return expr_list() throws RecognitionException {
		TigerParser.expr_list_return retval = new TigerParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr62 =null;
		ParserRuleReturnScope expr_list_tail63 =null;


		try {
			// grammar/Tiger.g:169:2: ( expr expr_list_tail |)
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
					// grammar/Tiger.g:169:4: expr expr_list_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_expr_list662);
					expr62=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr62.getTree());

					pushFollow(FOLLOW_expr_list_tail_in_expr_list664);
					expr_list_tail63=expr_list_tail();
					state._fsp--;

					adaptor.addChild(root_0, expr_list_tail63.getTree());

					}
					break;
				case 2 :
					// grammar/Tiger.g:171:2: 
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
	// grammar/Tiger.g:173:1: expr_list_tail : ( COMMA expr expr_list_tail -> expr ( expr_list_tail )? |);
	public final TigerParser.expr_list_tail_return expr_list_tail() throws RecognitionException {
		TigerParser.expr_list_tail_return retval = new TigerParser.expr_list_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA64=null;
		ParserRuleReturnScope expr65 =null;
		ParserRuleReturnScope expr_list_tail66 =null;

		Object COMMA64_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expr_list_tail=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_tail");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:174:2: ( COMMA expr expr_list_tail -> expr ( expr_list_tail )? |)
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
					// grammar/Tiger.g:174:4: COMMA expr expr_list_tail
					{
					COMMA64=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail679);  
					stream_COMMA.add(COMMA64);

					pushFollow(FOLLOW_expr_in_expr_list_tail681);
					expr65=expr();
					state._fsp--;

					stream_expr.add(expr65.getTree());
					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail683);
					expr_list_tail66=expr_list_tail();
					state._fsp--;

					stream_expr_list_tail.add(expr_list_tail66.getTree());
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
					// 174:30: -> expr ( expr_list_tail )?
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
						// grammar/Tiger.g:174:38: ( expr_list_tail )?
						if ( stream_expr_list_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_expr_list_tail.nextTree());
						}
						stream_expr_list_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:176:2: 
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
	// grammar/Tiger.g:178:1: expr : expr_2 ( ( AND | OR ) ^ expr_2 )* ;
	public final TigerParser.expr_return expr() throws RecognitionException {
		TigerParser.expr_return retval = new TigerParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set68=null;
		ParserRuleReturnScope expr_267 =null;
		ParserRuleReturnScope expr_269 =null;

		Object set68_tree=null;

		try {
			// grammar/Tiger.g:179:2: ( expr_2 ( ( AND | OR ) ^ expr_2 )* )
			// grammar/Tiger.g:179:4: expr_2 ( ( AND | OR ) ^ expr_2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_2_in_expr705);
			expr_267=expr_2();
			state._fsp--;

			adaptor.addChild(root_0, expr_267.getTree());

			// grammar/Tiger.g:179:11: ( ( AND | OR ) ^ expr_2 )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==AND||LA16_0==OR) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// grammar/Tiger.g:179:12: ( AND | OR ) ^ expr_2
					{
					set68=input.LT(1);
					set68=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set68), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr_2_in_expr717);
					expr_269=expr_2();
					state._fsp--;

					adaptor.addChild(root_0, expr_269.getTree());

					}
					break;

				default :
					break loop16;
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


	public static class expr_2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_2"
	// grammar/Tiger.g:182:1: expr_2 : expr_3 ( ( EQ | NEQ | LESSER | GREATER | LEQ | GEQ ) ^ expr_3 )* ;
	public final TigerParser.expr_2_return expr_2() throws RecognitionException {
		TigerParser.expr_2_return retval = new TigerParser.expr_2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set71=null;
		ParserRuleReturnScope expr_370 =null;
		ParserRuleReturnScope expr_372 =null;

		Object set71_tree=null;

		try {
			// grammar/Tiger.g:183:2: ( expr_3 ( ( EQ | NEQ | LESSER | GREATER | LEQ | GEQ ) ^ expr_3 )* )
			// grammar/Tiger.g:183:4: expr_3 ( ( EQ | NEQ | LESSER | GREATER | LEQ | GEQ ) ^ expr_3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_3_in_expr_2730);
			expr_370=expr_3();
			state._fsp--;

			adaptor.addChild(root_0, expr_370.getTree());

			// grammar/Tiger.g:183:11: ( ( EQ | NEQ | LESSER | GREATER | LEQ | GEQ ) ^ expr_3 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==EQ||(LA17_0 >= GEQ && LA17_0 <= GREATER)||(LA17_0 >= LEQ && LA17_0 <= LESSER)||LA17_0==NEQ) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// grammar/Tiger.g:183:12: ( EQ | NEQ | LESSER | GREATER | LEQ | GEQ ) ^ expr_3
					{
					set71=input.LT(1);
					set71=input.LT(1);
					if ( input.LA(1)==EQ||(input.LA(1) >= GEQ && input.LA(1) <= GREATER)||(input.LA(1) >= LEQ && input.LA(1) <= LESSER)||input.LA(1)==NEQ ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set71), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr_3_in_expr_2758);
					expr_372=expr_3();
					state._fsp--;

					adaptor.addChild(root_0, expr_372.getTree());

					}
					break;

				default :
					break loop17;
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
	// $ANTLR end "expr_2"


	public static class expr_3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_3"
	// grammar/Tiger.g:186:1: expr_3 : expr_4 ( ( PLUS | MINUS ) ^ expr_4 )* ;
	public final TigerParser.expr_3_return expr_3() throws RecognitionException {
		TigerParser.expr_3_return retval = new TigerParser.expr_3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set74=null;
		ParserRuleReturnScope expr_473 =null;
		ParserRuleReturnScope expr_475 =null;

		Object set74_tree=null;

		try {
			// grammar/Tiger.g:187:2: ( expr_4 ( ( PLUS | MINUS ) ^ expr_4 )* )
			// grammar/Tiger.g:187:4: expr_4 ( ( PLUS | MINUS ) ^ expr_4 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_4_in_expr_3771);
			expr_473=expr_4();
			state._fsp--;

			adaptor.addChild(root_0, expr_473.getTree());

			// grammar/Tiger.g:187:11: ( ( PLUS | MINUS ) ^ expr_4 )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// grammar/Tiger.g:187:12: ( PLUS | MINUS ) ^ expr_4
					{
					set74=input.LT(1);
					set74=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set74), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr_4_in_expr_3783);
					expr_475=expr_4();
					state._fsp--;

					adaptor.addChild(root_0, expr_475.getTree());

					}
					break;

				default :
					break loop18;
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
	// $ANTLR end "expr_3"


	public static class expr_4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_4"
	// grammar/Tiger.g:190:1: expr_4 : expr_atom ( ( MULT | DIV ) ^ expr_atom )* ;
	public final TigerParser.expr_4_return expr_4() throws RecognitionException {
		TigerParser.expr_4_return retval = new TigerParser.expr_4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set77=null;
		ParserRuleReturnScope expr_atom76 =null;
		ParserRuleReturnScope expr_atom78 =null;

		Object set77_tree=null;

		try {
			// grammar/Tiger.g:191:2: ( expr_atom ( ( MULT | DIV ) ^ expr_atom )* )
			// grammar/Tiger.g:191:4: expr_atom ( ( MULT | DIV ) ^ expr_atom )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_atom_in_expr_4796);
			expr_atom76=expr_atom();
			state._fsp--;

			adaptor.addChild(root_0, expr_atom76.getTree());

			// grammar/Tiger.g:191:14: ( ( MULT | DIV ) ^ expr_atom )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==DIV||LA19_0==MULT) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// grammar/Tiger.g:191:15: ( MULT | DIV ) ^ expr_atom
					{
					set77=input.LT(1);
					set77=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set77), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_expr_atom_in_expr_4808);
					expr_atom78=expr_atom();
					state._fsp--;

					adaptor.addChild(root_0, expr_atom78.getTree());

					}
					break;

				default :
					break loop19;
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
	// $ANTLR end "expr_4"


	public static class expr_atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_atom"
	// grammar/Tiger.g:194:1: expr_atom : ( constant -> ^( CONSTANT constant ) | LPAREN expr RPAREN -> expr | ID ( optional_subscript -> ^( REFERENCE ID ( optional_subscript )? ) | LPAREN expr_list RPAREN -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) ) ) );
	public final TigerParser.expr_atom_return expr_atom() throws RecognitionException {
		TigerParser.expr_atom_return retval = new TigerParser.expr_atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN80=null;
		Token RPAREN82=null;
		Token ID83=null;
		Token LPAREN85=null;
		Token RPAREN87=null;
		ParserRuleReturnScope constant79 =null;
		ParserRuleReturnScope expr81 =null;
		ParserRuleReturnScope optional_subscript84 =null;
		ParserRuleReturnScope expr_list86 =null;

		Object LPAREN80_tree=null;
		Object RPAREN82_tree=null;
		Object ID83_tree=null;
		Object LPAREN85_tree=null;
		Object RPAREN87_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_optional_subscript=new RewriteRuleSubtreeStream(adaptor,"rule optional_subscript");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// grammar/Tiger.g:195:2: ( constant -> ^( CONSTANT constant ) | LPAREN expr RPAREN -> expr | ID ( optional_subscript -> ^( REFERENCE ID ( optional_subscript )? ) | LPAREN expr_list RPAREN -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) ) ) )
			int alt21=3;
			switch ( input.LA(1) ) {
			case FIXEDPTLIT:
			case INTLIT:
				{
				alt21=1;
				}
				break;
			case LPAREN:
				{
				alt21=2;
				}
				break;
			case ID:
				{
				alt21=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// grammar/Tiger.g:195:4: constant
					{
					pushFollow(FOLLOW_constant_in_expr_atom821);
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
					// 195:19: -> ^( CONSTANT constant )
					{
						// grammar/Tiger.g:195:22: ^( CONSTANT constant )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANT, "CONSTANT"), root_1);
						adaptor.addChild(root_1, stream_constant.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:196:4: LPAREN expr RPAREN
					{
					LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_atom840);  
					stream_LPAREN.add(LPAREN80);

					pushFollow(FOLLOW_expr_in_expr_atom842);
					expr81=expr();
					state._fsp--;

					stream_expr.add(expr81.getTree());
					RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_atom844);  
					stream_RPAREN.add(RPAREN82);

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
					// 196:28: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// grammar/Tiger.g:197:4: ID ( optional_subscript -> ^( REFERENCE ID ( optional_subscript )? ) | LPAREN expr_list RPAREN -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) ) )
					{
					ID83=(Token)match(input,ID,FOLLOW_ID_in_expr_atom858);  
					stream_ID.add(ID83);

					// grammar/Tiger.g:197:7: ( optional_subscript -> ^( REFERENCE ID ( optional_subscript )? ) | LPAREN expr_list RPAREN -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) ) )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==AND||LA20_0==ASSIGN||LA20_0==COMMA||(LA20_0 >= DIV && LA20_0 <= DO)||LA20_0==EQ||(LA20_0 >= GEQ && LA20_0 <= GREATER)||(LA20_0 >= LBRACK && LA20_0 <= LESSER)||(LA20_0 >= MINUS && LA20_0 <= NEQ)||LA20_0==OR||LA20_0==PLUS||(LA20_0 >= RPAREN && LA20_0 <= SEMI)||LA20_0==THEN) ) {
						alt20=1;
					}
					else if ( (LA20_0==LPAREN) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// grammar/Tiger.g:198:6: optional_subscript
							{
							pushFollow(FOLLOW_optional_subscript_in_expr_atom867);
							optional_subscript84=optional_subscript();
							state._fsp--;

							stream_optional_subscript.add(optional_subscript84.getTree());
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
							// 198:27: -> ^( REFERENCE ID ( optional_subscript )? )
							{
								// grammar/Tiger.g:198:30: ^( REFERENCE ID ( optional_subscript )? )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								// grammar/Tiger.g:198:45: ( optional_subscript )?
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
						case 2 :
							// grammar/Tiger.g:199:6: LPAREN expr_list RPAREN
							{
							LPAREN85=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_atom887);  
							stream_LPAREN.add(LPAREN85);

							pushFollow(FOLLOW_expr_list_in_expr_atom889);
							expr_list86=expr_list();
							state._fsp--;

							stream_expr_list.add(expr_list86.getTree());
							RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_atom891);  
							stream_RPAREN.add(RPAREN87);

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
							// 199:31: -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) )
							{
								// grammar/Tiger.g:199:34: ^( INVOKE ID ^( EXPRS ( expr_list )? ) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INVOKE, "INVOKE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								// grammar/Tiger.g:199:46: ^( EXPRS ( expr_list )? )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_2);
								// grammar/Tiger.g:199:54: ( expr_list )?
								if ( stream_expr_list.hasNext() ) {
									adaptor.addChild(root_2, stream_expr_list.nextTree());
								}
								stream_expr_list.reset();

								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

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
	// $ANTLR end "expr_atom"


	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// grammar/Tiger.g:203:1: constant : ( INTLIT | FIXEDPTLIT );
	public final TigerParser.constant_return constant() throws RecognitionException {
		TigerParser.constant_return retval = new TigerParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set88=null;

		Object set88_tree=null;

		try {
			// grammar/Tiger.g:204:2: ( INTLIT | FIXEDPTLIT )
			// grammar/Tiger.g:
			{
			root_0 = (Object)adaptor.nil();


			set88=input.LT(1);
			if ( input.LA(1)==FIXEDPTLIT||input.LA(1)==INTLIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set88));
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


	public static class stat_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat_list"
	// grammar/Tiger.g:212:1: stat_list : statement stat_tail ;
	public final TigerParser.stat_list_return stat_list() throws RecognitionException {
		TigerParser.stat_list_return retval = new TigerParser.stat_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope statement89 =null;
		ParserRuleReturnScope stat_tail90 =null;


		try {
			// grammar/Tiger.g:213:2: ( statement stat_tail )
			// grammar/Tiger.g:213:4: statement stat_tail
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_stat_list943);
			statement89=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement89.getTree());

			pushFollow(FOLLOW_stat_tail_in_stat_list945);
			stat_tail90=stat_tail();
			state._fsp--;

			adaptor.addChild(root_0, stat_tail90.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat_list"


	public static class stat_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat_tail"
	// grammar/Tiger.g:216:1: stat_tail : ( statement stat_tail -> statement ( stat_tail )? |);
	public final TigerParser.stat_tail_return stat_tail() throws RecognitionException {
		TigerParser.stat_tail_return retval = new TigerParser.stat_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope statement91 =null;
		ParserRuleReturnScope stat_tail92 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_stat_tail=new RewriteRuleSubtreeStream(adaptor,"rule stat_tail");

		try {
			// grammar/Tiger.g:217:2: ( statement stat_tail -> statement ( stat_tail )? |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==BEGIN||LA22_0==BREAK||LA22_0==FOR||LA22_0==ID||LA22_0==IF||LA22_0==RETURN||LA22_0==WHILE) ) {
				alt22=1;
			}
			else if ( ((LA22_0 >= ELSE && LA22_0 <= ENDIF)) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// grammar/Tiger.g:217:4: statement stat_tail
					{
					pushFollow(FOLLOW_statement_in_stat_tail956);
					statement91=statement();
					state._fsp--;

					stream_statement.add(statement91.getTree());
					pushFollow(FOLLOW_stat_tail_in_stat_tail958);
					stat_tail92=stat_tail();
					state._fsp--;

					stream_stat_tail.add(stat_tail92.getTree());
					// AST REWRITE
					// elements: statement, stat_tail
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 217:24: -> statement ( stat_tail )?
					{
						adaptor.addChild(root_0, stream_statement.nextTree());
						// grammar/Tiger.g:217:37: ( stat_tail )?
						if ( stream_stat_tail.hasNext() ) {
							adaptor.addChild(root_0, stream_stat_tail.nextTree());
						}
						stream_stat_tail.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:219:2: 
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


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// grammar/Tiger.g:226:1: statement : ( IF expr THEN iftrue= stat_list ( options {greedy=true; } : ELSE iffalse= stat_list )? ENDIF SEMI -> ^( IF expr ^( STATEMENTS $iftrue) ^( STATEMENTS ( $iffalse)? ) ) | WHILE expr DO stat_list ENDDO SEMI -> ^( WHILE expr ^( STATEMENTS stat_list ) ) | FOR ID ASSIGN (start= index_expr TO stop= index_expr ) DO stat_list ENDDO SEMI -> ^( FOR $start $stop ^( STATEMENTS stat_list ) ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) ) | optional_subscript ASSIGN expr -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) expr ) ) SEMI );
	public final TigerParser.statement_return statement() throws RecognitionException {
		TigerParser.statement_return retval = new TigerParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF93=null;
		Token THEN95=null;
		Token ELSE96=null;
		Token ENDIF97=null;
		Token SEMI98=null;
		Token WHILE99=null;
		Token DO101=null;
		Token ENDDO103=null;
		Token SEMI104=null;
		Token FOR105=null;
		Token ID106=null;
		Token ASSIGN107=null;
		Token TO108=null;
		Token DO109=null;
		Token ENDDO111=null;
		Token SEMI112=null;
		Token BREAK113=null;
		Token SEMI114=null;
		Token RETURN115=null;
		Token SEMI117=null;
		Token ID119=null;
		Token LPAREN120=null;
		Token RPAREN122=null;
		Token ASSIGN124=null;
		Token SEMI126=null;
		ParserRuleReturnScope iftrue =null;
		ParserRuleReturnScope iffalse =null;
		ParserRuleReturnScope start =null;
		ParserRuleReturnScope stop =null;
		ParserRuleReturnScope expr94 =null;
		ParserRuleReturnScope expr100 =null;
		ParserRuleReturnScope stat_list102 =null;
		ParserRuleReturnScope stat_list110 =null;
		ParserRuleReturnScope expr116 =null;
		ParserRuleReturnScope block118 =null;
		ParserRuleReturnScope expr_list121 =null;
		ParserRuleReturnScope optional_subscript123 =null;
		ParserRuleReturnScope expr125 =null;

		Object IF93_tree=null;
		Object THEN95_tree=null;
		Object ELSE96_tree=null;
		Object ENDIF97_tree=null;
		Object SEMI98_tree=null;
		Object WHILE99_tree=null;
		Object DO101_tree=null;
		Object ENDDO103_tree=null;
		Object SEMI104_tree=null;
		Object FOR105_tree=null;
		Object ID106_tree=null;
		Object ASSIGN107_tree=null;
		Object TO108_tree=null;
		Object DO109_tree=null;
		Object ENDDO111_tree=null;
		Object SEMI112_tree=null;
		Object BREAK113_tree=null;
		Object SEMI114_tree=null;
		Object RETURN115_tree=null;
		Object SEMI117_tree=null;
		Object ID119_tree=null;
		Object LPAREN120_tree=null;
		Object RPAREN122_tree=null;
		Object ASSIGN124_tree=null;
		Object SEMI126_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
		RewriteRuleTokenStream stream_ENDDO=new RewriteRuleTokenStream(adaptor,"token ENDDO");
		RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_optional_subscript=new RewriteRuleSubtreeStream(adaptor,"rule optional_subscript");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_stat_list=new RewriteRuleSubtreeStream(adaptor,"rule stat_list");

		try {
			// grammar/Tiger.g:227:2: ( IF expr THEN iftrue= stat_list ( options {greedy=true; } : ELSE iffalse= stat_list )? ENDIF SEMI -> ^( IF expr ^( STATEMENTS $iftrue) ^( STATEMENTS ( $iffalse)? ) ) | WHILE expr DO stat_list ENDDO SEMI -> ^( WHILE expr ^( STATEMENTS stat_list ) ) | FOR ID ASSIGN (start= index_expr TO stop= index_expr ) DO stat_list ENDDO SEMI -> ^( FOR $start $stop ^( STATEMENTS stat_list ) ) | BREAK SEMI -> BREAK | RETURN expr SEMI -> ^( RETURN expr ) | block | ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) ) | optional_subscript ASSIGN expr -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) expr ) ) SEMI )
			int alt25=7;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt25=1;
				}
				break;
			case WHILE:
				{
				alt25=2;
				}
				break;
			case FOR:
				{
				alt25=3;
				}
				break;
			case BREAK:
				{
				alt25=4;
				}
				break;
			case RETURN:
				{
				alt25=5;
				}
				break;
			case BEGIN:
				{
				alt25=6;
				}
				break;
			case ID:
				{
				alt25=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// grammar/Tiger.g:227:4: IF expr THEN iftrue= stat_list ( options {greedy=true; } : ELSE iffalse= stat_list )? ENDIF SEMI
					{
					IF93=(Token)match(input,IF,FOLLOW_IF_in_statement984);  
					stream_IF.add(IF93);

					pushFollow(FOLLOW_expr_in_statement986);
					expr94=expr();
					state._fsp--;

					stream_expr.add(expr94.getTree());
					THEN95=(Token)match(input,THEN,FOLLOW_THEN_in_statement988);  
					stream_THEN.add(THEN95);

					pushFollow(FOLLOW_stat_list_in_statement992);
					iftrue=stat_list();
					state._fsp--;

					stream_stat_list.add(iftrue.getTree());
					// grammar/Tiger.g:227:34: ( options {greedy=true; } : ELSE iffalse= stat_list )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ELSE) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// grammar/Tiger.g:227:59: ELSE iffalse= stat_list
							{
							ELSE96=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1003);  
							stream_ELSE.add(ELSE96);

							pushFollow(FOLLOW_stat_list_in_statement1007);
							iffalse=stat_list();
							state._fsp--;

							stream_stat_list.add(iffalse.getTree());
							}
							break;

					}

					ENDIF97=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_statement1011);  
					stream_ENDIF.add(ENDIF97);

					SEMI98=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1013);  
					stream_SEMI.add(SEMI98);

					// AST REWRITE
					// elements: iftrue, IF, iffalse, expr
					// token labels: 
					// rule labels: iffalse, iftrue, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_iffalse=new RewriteRuleSubtreeStream(adaptor,"rule iffalse",iffalse!=null?iffalse.getTree():null);
					RewriteRuleSubtreeStream stream_iftrue=new RewriteRuleSubtreeStream(adaptor,"rule iftrue",iftrue!=null?iftrue.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 227:95: -> ^( IF expr ^( STATEMENTS $iftrue) ^( STATEMENTS ( $iffalse)? ) )
					{
						// grammar/Tiger.g:227:98: ^( IF expr ^( STATEMENTS $iftrue) ^( STATEMENTS ( $iffalse)? ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						// grammar/Tiger.g:227:108: ^( STATEMENTS $iftrue)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
						adaptor.addChild(root_2, stream_iftrue.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// grammar/Tiger.g:227:130: ^( STATEMENTS ( $iffalse)? )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
						// grammar/Tiger.g:227:144: ( $iffalse)?
						if ( stream_iffalse.hasNext() ) {
							adaptor.addChild(root_2, stream_iffalse.nextTree());
						}
						stream_iffalse.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:228:4: WHILE expr DO stat_list ENDDO SEMI
					{
					WHILE99=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1041);  
					stream_WHILE.add(WHILE99);

					pushFollow(FOLLOW_expr_in_statement1043);
					expr100=expr();
					state._fsp--;

					stream_expr.add(expr100.getTree());
					DO101=(Token)match(input,DO,FOLLOW_DO_in_statement1045);  
					stream_DO.add(DO101);

					pushFollow(FOLLOW_stat_list_in_statement1047);
					stat_list102=stat_list();
					state._fsp--;

					stream_stat_list.add(stat_list102.getTree());
					ENDDO103=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_statement1049);  
					stream_ENDDO.add(ENDDO103);

					SEMI104=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1051);  
					stream_SEMI.add(SEMI104);

					// AST REWRITE
					// elements: stat_list, expr, WHILE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 228:39: -> ^( WHILE expr ^( STATEMENTS stat_list ) )
					{
						// grammar/Tiger.g:228:42: ^( WHILE expr ^( STATEMENTS stat_list ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						// grammar/Tiger.g:228:55: ^( STATEMENTS stat_list )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
						adaptor.addChild(root_2, stream_stat_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// grammar/Tiger.g:229:4: FOR ID ASSIGN (start= index_expr TO stop= index_expr ) DO stat_list ENDDO SEMI
					{
					FOR105=(Token)match(input,FOR,FOLLOW_FOR_in_statement1070);  
					stream_FOR.add(FOR105);

					ID106=(Token)match(input,ID,FOLLOW_ID_in_statement1072);  
					stream_ID.add(ID106);

					ASSIGN107=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement1074);  
					stream_ASSIGN.add(ASSIGN107);

					// grammar/Tiger.g:229:18: (start= index_expr TO stop= index_expr )
					// grammar/Tiger.g:229:19: start= index_expr TO stop= index_expr
					{
					pushFollow(FOLLOW_index_expr_in_statement1079);
					start=index_expr();
					state._fsp--;

					stream_index_expr.add(start.getTree());
					TO108=(Token)match(input,TO,FOLLOW_TO_in_statement1081);  
					stream_TO.add(TO108);

					pushFollow(FOLLOW_index_expr_in_statement1085);
					stop=index_expr();
					state._fsp--;

					stream_index_expr.add(stop.getTree());
					}

					DO109=(Token)match(input,DO,FOLLOW_DO_in_statement1088);  
					stream_DO.add(DO109);

					pushFollow(FOLLOW_stat_list_in_statement1090);
					stat_list110=stat_list();
					state._fsp--;

					stream_stat_list.add(stat_list110.getTree());
					ENDDO111=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_statement1092);  
					stream_ENDDO.add(ENDDO111);

					SEMI112=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1094);  
					stream_SEMI.add(SEMI112);

					// AST REWRITE
					// elements: stat_list, FOR, start, stop
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
					// 229:80: -> ^( FOR $start $stop ^( STATEMENTS stat_list ) )
					{
						// grammar/Tiger.g:229:83: ^( FOR $start $stop ^( STATEMENTS stat_list ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);
						adaptor.addChild(root_1, stream_start.nextTree());
						adaptor.addChild(root_1, stream_stop.nextTree());
						// grammar/Tiger.g:229:102: ^( STATEMENTS stat_list )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
						adaptor.addChild(root_2, stream_stat_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// grammar/Tiger.g:230:4: BREAK SEMI
					{
					BREAK113=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1117);  
					stream_BREAK.add(BREAK113);

					SEMI114=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1119);  
					stream_SEMI.add(SEMI114);

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
					// 230:15: -> BREAK
					{
						adaptor.addChild(root_0, stream_BREAK.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// grammar/Tiger.g:231:4: RETURN expr SEMI
					{
					RETURN115=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1128);  
					stream_RETURN.add(RETURN115);

					pushFollow(FOLLOW_expr_in_statement1130);
					expr116=expr();
					state._fsp--;

					stream_expr.add(expr116.getTree());
					SEMI117=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1132);  
					stream_SEMI.add(SEMI117);

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
					// 231:21: -> ^( RETURN expr )
					{
						// grammar/Tiger.g:231:24: ^( RETURN expr )
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
					// grammar/Tiger.g:232:4: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_statement1145);
					block118=block();
					state._fsp--;

					adaptor.addChild(root_0, block118.getTree());

					}
					break;
				case 7 :
					// grammar/Tiger.g:233:4: ID ( LPAREN expr_list RPAREN -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) ) | optional_subscript ASSIGN expr -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) expr ) ) SEMI
					{
					ID119=(Token)match(input,ID,FOLLOW_ID_in_statement1150);  
					stream_ID.add(ID119);

					// grammar/Tiger.g:233:8: ( LPAREN expr_list RPAREN -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) ) | optional_subscript ASSIGN expr -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) expr ) )
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
							// grammar/Tiger.g:234:6: LPAREN expr_list RPAREN
							{
							LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1160);  
							stream_LPAREN.add(LPAREN120);

							pushFollow(FOLLOW_expr_list_in_statement1162);
							expr_list121=expr_list();
							state._fsp--;

							stream_expr_list.add(expr_list121.getTree());
							RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1164);  
							stream_RPAREN.add(RPAREN122);

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
							// 234:36: -> ^( INVOKE ID ^( EXPRS ( expr_list )? ) )
							{
								// grammar/Tiger.g:234:39: ^( INVOKE ID ^( EXPRS ( expr_list )? ) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INVOKE, "INVOKE"), root_1);
								adaptor.addChild(root_1, stream_ID.nextNode());
								// grammar/Tiger.g:234:51: ^( EXPRS ( expr_list )? )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_2);
								// grammar/Tiger.g:234:59: ( expr_list )?
								if ( stream_expr_list.hasNext() ) {
									adaptor.addChild(root_2, stream_expr_list.nextTree());
								}
								stream_expr_list.reset();

								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// grammar/Tiger.g:235:6: optional_subscript ASSIGN expr
							{
							pushFollow(FOLLOW_optional_subscript_in_statement1202);
							optional_subscript123=optional_subscript();
							state._fsp--;

							stream_optional_subscript.add(optional_subscript123.getTree());
							ASSIGN124=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement1204);  
							stream_ASSIGN.add(ASSIGN124);

							pushFollow(FOLLOW_expr_in_statement1206);
							expr125=expr();
							state._fsp--;

							stream_expr.add(expr125.getTree());
							// AST REWRITE
							// elements: ASSIGN, expr, ID, optional_subscript
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 235:42: -> ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) expr )
							{
								// grammar/Tiger.g:235:45: ^( ASSIGN ^( REFERENCE ID ( optional_subscript )? ) expr )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
								// grammar/Tiger.g:235:54: ^( REFERENCE ID ( optional_subscript )? )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_2);
								adaptor.addChild(root_2, stream_ID.nextNode());
								// grammar/Tiger.g:235:69: ( optional_subscript )?
								if ( stream_optional_subscript.hasNext() ) {
									adaptor.addChild(root_2, stream_optional_subscript.nextTree());
								}
								stream_optional_subscript.reset();

								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_1, stream_expr.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1237);  
					stream_SEMI.add(SEMI126);

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
	// $ANTLR end "statement"


	public static class optional_subscript_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optional_subscript"
	// grammar/Tiger.g:243:1: optional_subscript : ( LBRACK row= index_expr RBRACK ( LBRACK width= index_expr RBRACK )? -> $row ( $width)? |);
	public final TigerParser.optional_subscript_return optional_subscript() throws RecognitionException {
		TigerParser.optional_subscript_return retval = new TigerParser.optional_subscript_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACK127=null;
		Token RBRACK128=null;
		Token LBRACK129=null;
		Token RBRACK130=null;
		ParserRuleReturnScope row =null;
		ParserRuleReturnScope width =null;

		Object LBRACK127_tree=null;
		Object RBRACK128_tree=null;
		Object LBRACK129_tree=null;
		Object RBRACK130_tree=null;
		RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
		RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");

		try {
			// grammar/Tiger.g:244:2: ( LBRACK row= index_expr RBRACK ( LBRACK width= index_expr RBRACK )? -> $row ( $width)? |)
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==LBRACK) ) {
				alt27=1;
			}
			else if ( (LA27_0==AND||LA27_0==ASSIGN||LA27_0==COMMA||(LA27_0 >= DIV && LA27_0 <= DO)||LA27_0==EQ||(LA27_0 >= GEQ && LA27_0 <= GREATER)||(LA27_0 >= LEQ && LA27_0 <= LESSER)||(LA27_0 >= MINUS && LA27_0 <= NEQ)||LA27_0==OR||LA27_0==PLUS||(LA27_0 >= RPAREN && LA27_0 <= SEMI)||LA27_0==THEN) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// grammar/Tiger.g:244:4: LBRACK row= index_expr RBRACK ( LBRACK width= index_expr RBRACK )?
					{
					LBRACK127=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_optional_subscript1252);  
					stream_LBRACK.add(LBRACK127);

					pushFollow(FOLLOW_index_expr_in_optional_subscript1256);
					row=index_expr();
					state._fsp--;

					stream_index_expr.add(row.getTree());
					RBRACK128=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_optional_subscript1258);  
					stream_RBRACK.add(RBRACK128);

					// grammar/Tiger.g:244:33: ( LBRACK width= index_expr RBRACK )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==LBRACK) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// grammar/Tiger.g:244:34: LBRACK width= index_expr RBRACK
							{
							LBRACK129=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_optional_subscript1261);  
							stream_LBRACK.add(LBRACK129);

							pushFollow(FOLLOW_index_expr_in_optional_subscript1265);
							width=index_expr();
							state._fsp--;

							stream_index_expr.add(width.getTree());
							RBRACK130=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_optional_subscript1267);  
							stream_RBRACK.add(RBRACK130);

							}
							break;

					}

					// AST REWRITE
					// elements: width, row
					// token labels: 
					// rule labels: width, row, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_width=new RewriteRuleSubtreeStream(adaptor,"rule width",width!=null?width.getTree():null);
					RewriteRuleSubtreeStream stream_row=new RewriteRuleSubtreeStream(adaptor,"rule row",row!=null?row.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 244:67: -> $row ( $width)?
					{
						adaptor.addChild(root_0, stream_row.nextTree());
						// grammar/Tiger.g:244:76: ( $width)?
						if ( stream_width.hasNext() ) {
							adaptor.addChild(root_0, stream_width.nextTree());
						}
						stream_width.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:246:2: 
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


	public static class index_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr"
	// grammar/Tiger.g:248:1: index_expr : index_expr_2 ( ( PLUS ^| MINUS ^) index_expr_2 )* ;
	public final TigerParser.index_expr_return index_expr() throws RecognitionException {
		TigerParser.index_expr_return retval = new TigerParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS132=null;
		Token MINUS133=null;
		ParserRuleReturnScope index_expr_2131 =null;
		ParserRuleReturnScope index_expr_2134 =null;

		Object PLUS132_tree=null;
		Object MINUS133_tree=null;

		try {
			// grammar/Tiger.g:249:2: ( index_expr_2 ( ( PLUS ^| MINUS ^) index_expr_2 )* )
			// grammar/Tiger.g:249:4: index_expr_2 ( ( PLUS ^| MINUS ^) index_expr_2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_index_expr_2_in_index_expr1293);
			index_expr_2131=index_expr_2();
			state._fsp--;

			adaptor.addChild(root_0, index_expr_2131.getTree());

			// grammar/Tiger.g:249:17: ( ( PLUS ^| MINUS ^) index_expr_2 )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==MINUS||LA29_0==PLUS) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// grammar/Tiger.g:249:18: ( PLUS ^| MINUS ^) index_expr_2
					{
					// grammar/Tiger.g:249:18: ( PLUS ^| MINUS ^)
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==PLUS) ) {
						alt28=1;
					}
					else if ( (LA28_0==MINUS) ) {
						alt28=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}

					switch (alt28) {
						case 1 :
							// grammar/Tiger.g:249:19: PLUS ^
							{
							PLUS132=(Token)match(input,PLUS,FOLLOW_PLUS_in_index_expr1297); 
							PLUS132_tree = (Object)adaptor.create(PLUS132);
							root_0 = (Object)adaptor.becomeRoot(PLUS132_tree, root_0);

							}
							break;
						case 2 :
							// grammar/Tiger.g:249:27: MINUS ^
							{
							MINUS133=(Token)match(input,MINUS,FOLLOW_MINUS_in_index_expr1302); 
							MINUS133_tree = (Object)adaptor.create(MINUS133);
							root_0 = (Object)adaptor.becomeRoot(MINUS133_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_index_expr_2_in_index_expr1306);
					index_expr_2134=index_expr_2();
					state._fsp--;

					adaptor.addChild(root_0, index_expr_2134.getTree());

					}
					break;

				default :
					break loop29;
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


	public static class index_expr_2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr_2"
	// grammar/Tiger.g:252:1: index_expr_2 : index_expr_atom ( MULT ^ index_expr_atom )* ;
	public final TigerParser.index_expr_2_return index_expr_2() throws RecognitionException {
		TigerParser.index_expr_2_return retval = new TigerParser.index_expr_2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT136=null;
		ParserRuleReturnScope index_expr_atom135 =null;
		ParserRuleReturnScope index_expr_atom137 =null;

		Object MULT136_tree=null;

		try {
			// grammar/Tiger.g:253:2: ( index_expr_atom ( MULT ^ index_expr_atom )* )
			// grammar/Tiger.g:253:4: index_expr_atom ( MULT ^ index_expr_atom )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_index_expr_atom_in_index_expr_21320);
			index_expr_atom135=index_expr_atom();
			state._fsp--;

			adaptor.addChild(root_0, index_expr_atom135.getTree());

			// grammar/Tiger.g:253:20: ( MULT ^ index_expr_atom )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==MULT) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// grammar/Tiger.g:253:21: MULT ^ index_expr_atom
					{
					MULT136=(Token)match(input,MULT,FOLLOW_MULT_in_index_expr_21323); 
					MULT136_tree = (Object)adaptor.create(MULT136);
					root_0 = (Object)adaptor.becomeRoot(MULT136_tree, root_0);

					pushFollow(FOLLOW_index_expr_atom_in_index_expr_21326);
					index_expr_atom137=index_expr_atom();
					state._fsp--;

					adaptor.addChild(root_0, index_expr_atom137.getTree());

					}
					break;

				default :
					break loop30;
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
	// $ANTLR end "index_expr_2"


	public static class index_expr_atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr_atom"
	// grammar/Tiger.g:256:1: index_expr_atom : ( INTLIT -> ^( CONSTANT INTLIT ) | ID -> ^( REFERENCE ID ) );
	public final TigerParser.index_expr_atom_return index_expr_atom() throws RecognitionException {
		TigerParser.index_expr_atom_return retval = new TigerParser.index_expr_atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTLIT138=null;
		Token ID139=null;

		Object INTLIT138_tree=null;
		Object ID139_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_INTLIT=new RewriteRuleTokenStream(adaptor,"token INTLIT");

		try {
			// grammar/Tiger.g:257:2: ( INTLIT -> ^( CONSTANT INTLIT ) | ID -> ^( REFERENCE ID ) )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==INTLIT) ) {
				alt31=1;
			}
			else if ( (LA31_0==ID) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// grammar/Tiger.g:257:4: INTLIT
					{
					INTLIT138=(Token)match(input,INTLIT,FOLLOW_INTLIT_in_index_expr_atom1339);  
					stream_INTLIT.add(INTLIT138);

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
					// 257:11: -> ^( CONSTANT INTLIT )
					{
						// grammar/Tiger.g:257:14: ^( CONSTANT INTLIT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANT, "CONSTANT"), root_1);
						adaptor.addChild(root_1, stream_INTLIT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// grammar/Tiger.g:258:4: ID
					{
					ID139=(Token)match(input,ID,FOLLOW_ID_in_index_expr_atom1352);  
					stream_ID.add(ID139);

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
					// 258:7: -> ^( REFERENCE ID )
					{
						// grammar/Tiger.g:258:10: ^( REFERENCE ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERENCE, "REFERENCE"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
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
	// $ANTLR end "index_expr_atom"

	// Delegated rules



	public static final BitSet FOLLOW_type_declaration_list_in_tiger_program166 = new BitSet(new long[]{0x0000001202000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_list_in_tiger_program168 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_tiger_program170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration_list206 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ID_in_type_declaration_list208 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration_list210 = new BitSet(new long[]{0x0000001002000020L});
	public static final BitSet FOLLOW_type_in_type_declaration_list212 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration_list214 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_type_declaration_list_in_type_declaration_list216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_type_in_function_declaration_list245 = new BitSet(new long[]{0x0000080040000000L});
	public static final BitSet FOLLOW_FUNCTION_in_function_declaration_list248 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ID_in_function_declaration_list252 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_MAIN_in_function_declaration_list258 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function_declaration_list261 = new BitSet(new long[]{0x0100000200000000L});
	public static final BitSet FOLLOW_param_list_in_function_declaration_list263 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_declaration_list265 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_function_declaration_list267 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_function_declaration_list269 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_END_in_function_declaration_list271 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_function_declaration_list273 = new BitSet(new long[]{0x0000001202000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_list_in_function_declaration_list276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration_list318 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration_list320 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_COLON_in_var_declaration_list322 = new BitSet(new long[]{0x0000001202000000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration_list324 = new BitSet(new long[]{0x0200000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_var_declaration_list327 = new BitSet(new long[]{0x0000002004000000L});
	public static final BitSet FOLLOW_constant_in_var_declaration_list329 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration_list333 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_var_declaration_list335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_param_list374 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_COLON_in_param_list376 = new BitSet(new long[]{0x0000001202000000L});
	public static final BitSet FOLLOW_type_id_in_param_list378 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail410 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_param_list_in_param_list_tail412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list435 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail448 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block466 = new BitSet(new long[]{0xA080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_type_declaration_list_in_block468 = new BitSet(new long[]{0x8080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_var_declaration_list_in_block470 = new BitSet(new long[]{0x0080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_stat_list_in_block472 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_END_in_block474 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_block476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type523 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LBRACK_in_type525 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTLIT_in_type529 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_type531 = new BitSet(new long[]{0x0000808000000000L});
	public static final BitSet FOLLOW_LBRACK_in_type534 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_INTLIT_in_type538 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_type540 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_OF_in_type544 = new BitSet(new long[]{0x0000001002000000L});
	public static final BitSet FOLLOW_base_type_in_type546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_return_type568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_return_type573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_id589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list620 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_id_list_tail633 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ID_in_id_list_tail635 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_id_list_tail_in_id_list_tail637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list662 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail679 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail681 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_2_in_expr705 = new BitSet(new long[]{0x0001000000000012L});
	public static final BitSet FOLLOW_set_in_expr708 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_2_in_expr717 = new BitSet(new long[]{0x0001000000000012L});
	public static final BitSet FOLLOW_expr_3_in_expr_2730 = new BitSet(new long[]{0x0000430180400002L});
	public static final BitSet FOLLOW_set_in_expr_2733 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_3_in_expr_2758 = new BitSet(new long[]{0x0000430180400002L});
	public static final BitSet FOLLOW_expr_4_in_expr_3771 = new BitSet(new long[]{0x0008100000000002L});
	public static final BitSet FOLLOW_set_in_expr_3774 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_4_in_expr_3783 = new BitSet(new long[]{0x0008100000000002L});
	public static final BitSet FOLLOW_expr_atom_in_expr_4796 = new BitSet(new long[]{0x0000200000010002L});
	public static final BitSet FOLLOW_set_in_expr_4799 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_atom_in_expr_4808 = new BitSet(new long[]{0x0000200000010002L});
	public static final BitSet FOLLOW_constant_in_expr_atom821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_atom840 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_in_expr_atom842 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_atom844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr_atom858 = new BitSet(new long[]{0x0000048000000000L});
	public static final BitSet FOLLOW_optional_subscript_in_expr_atom867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_atom887 = new BitSet(new long[]{0x0100042204000000L});
	public static final BitSet FOLLOW_expr_list_in_expr_atom889 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_atom891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_stat_list943 = new BitSet(new long[]{0x0080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_stat_tail_in_stat_list945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_stat_tail956 = new BitSet(new long[]{0x0080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_stat_tail_in_stat_tail958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement984 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_in_statement986 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_THEN_in_statement988 = new BitSet(new long[]{0x0080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_stat_list_in_statement992 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_ELSE_in_statement1003 = new BitSet(new long[]{0x0080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_stat_list_in_statement1007 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ENDIF_in_statement1011 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement1041 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_in_statement1043 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DO_in_statement1045 = new BitSet(new long[]{0x0080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_stat_list_in_statement1047 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ENDDO_in_statement1049 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement1070 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ID_in_statement1072 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_statement1074 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_index_expr_in_statement1079 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_TO_in_statement1081 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_index_expr_in_statement1085 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DO_in_statement1088 = new BitSet(new long[]{0x0080000A08000480L,0x0000000000000004L});
	public static final BitSet FOLLOW_stat_list_in_statement1090 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ENDDO_in_statement1092 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_statement1117 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement1128 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_in_statement1130 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_statement1150 = new BitSet(new long[]{0x0000048000000040L});
	public static final BitSet FOLLOW_LPAREN_in_statement1160 = new BitSet(new long[]{0x0100042204000000L});
	public static final BitSet FOLLOW_expr_list_in_statement1162 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_statement1164 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_optional_subscript_in_statement1202 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_statement1204 = new BitSet(new long[]{0x0000042204000000L});
	public static final BitSet FOLLOW_expr_in_statement1206 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_optional_subscript1252 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_index_expr_in_optional_subscript1256 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_optional_subscript1258 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_LBRACK_in_optional_subscript1261 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_index_expr_in_optional_subscript1265 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_optional_subscript1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_2_in_index_expr1293 = new BitSet(new long[]{0x0008100000000002L});
	public static final BitSet FOLLOW_PLUS_in_index_expr1297 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_MINUS_in_index_expr1302 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_index_expr_2_in_index_expr1306 = new BitSet(new long[]{0x0008100000000002L});
	public static final BitSet FOLLOW_index_expr_atom_in_index_expr_21320 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_MULT_in_index_expr_21323 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_index_expr_atom_in_index_expr_21326 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_INTLIT_in_index_expr_atom1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_index_expr_atom1352 = new BitSet(new long[]{0x0000000000000002L});
}
