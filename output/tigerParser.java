<<<<<<< HEAD
// $ANTLR 3.5.1 /Users/twb/repos/Tiger/tiger.g 2014-10-03 13:27:02
=======
// $ANTLR 3.5 /home/gangil/dev/Tiger/tiger.g 2014-10-03 13:25:58
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tigerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY", "ASSIGN", "BEGIN", 
		"BREAK", "COLON", "COMMA", "COMMENT", "DIV", "DO", "ELSE", "END", "ENDDO", 
		"ENDIF", "EQ", "FIXEDPT", "FIXEDPTLIT", "FOR", "FUNCTION", "GREATER", 
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
	public static final int BREAK=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int DIV=12;
	public static final int DO=13;
	public static final int ELSE=14;
	public static final int END=15;
	public static final int ENDDO=16;
	public static final int ENDIF=17;
	public static final int EQ=18;
	public static final int FIXEDPT=19;
	public static final int FIXEDPTLIT=20;
	public static final int FOR=21;
	public static final int FUNCTION=22;
	public static final int GREATER=23;
	public static final int GREATEREQ=24;
	public static final int ID=25;
	public static final int IF=26;
	public static final int INT=27;
	public static final int INTLIT=28;
	public static final int LBRACK=29;
	public static final int LESSER=30;
	public static final int LESSEREQ=31;
	public static final int LPAREN=32;
	public static final int MAIN=33;
	public static final int MINUS=34;
	public static final int MULT=35;
	public static final int NEQ=36;
	public static final int OF=37;
	public static final int OR=38;
	public static final int PLUS=39;
	public static final int RBRACK=40;
	public static final int RETURN=41;
	public static final int RPAREN=42;
	public static final int SEMI=43;
	public static final int THEN=44;
	public static final int TO=45;
	public static final int TYPE=46;
	public static final int VAR=47;
	public static final int VOID=48;
	public static final int WHILE=49;
	public static final int WS=50;

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

	@Override public String[] getTokenNames() { return tigerParser.tokenNames; }
<<<<<<< HEAD
	@Override public String getGrammarFileName() { return "/Users/twb/repos/Tiger/tiger.g"; }
=======
	@Override public String getGrammarFileName() { return "/home/gangil/dev/Tiger/tiger.g"; }
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a



	// $ANTLR start "tiger_program"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:11:1: tiger_program : type_declaration_list funct_declaration_list main_function ;
	public final void tiger_program() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:11:14: ( type_declaration_list funct_declaration_list main_function )
			// /Users/twb/repos/Tiger/tiger.g:11:16: type_declaration_list funct_declaration_list main_function
=======
	// /home/gangil/dev/Tiger/tiger.g:11:1: tiger_program : type_declaration_list funct_declaration_list main_function ;
	public final void tiger_program() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:11:14: ( type_declaration_list funct_declaration_list main_function )
			// /home/gangil/dev/Tiger/tiger.g:11:16: type_declaration_list funct_declaration_list main_function
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			pushFollow(FOLLOW_type_declaration_list_in_tiger_program27);
			type_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_funct_declaration_list_in_tiger_program29);
			funct_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_main_function_in_tiger_program31);
			main_function();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tiger_program"



	// $ANTLR start "type_declaration_list"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:13:1: type_declaration_list : ( type_declaration type_declaration_list |);
	public final void type_declaration_list() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:14:2: ( type_declaration type_declaration_list |)
=======
	// /home/gangil/dev/Tiger/tiger.g:13:1: type_declaration_list : ( type_declaration type_declaration_list |);
	public final void type_declaration_list() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:14:2: ( type_declaration type_declaration_list |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TYPE) ) {
				alt1=1;
			}
			else if ( ((LA1_0 >= BEGIN && LA1_0 <= BREAK)||(LA1_0 >= ELSE && LA1_0 <= ENDIF)||LA1_0==FIXEDPT||LA1_0==FOR||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==RETURN||(LA1_0 >= VAR && LA1_0 <= WHILE)) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:14:4: type_declaration type_declaration_list
=======
					// /home/gangil/dev/Tiger/tiger.g:14:4: type_declaration type_declaration_list
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_type_declaration_in_type_declaration_list40);
					type_declaration();
					state._fsp--;

					pushFollow(FOLLOW_type_declaration_list_in_type_declaration_list42);
					type_declaration_list();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:16:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:16:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_declaration_list"



	// $ANTLR start "type_declaration"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:18:1: type_declaration : TYPE ID EQ type SEMI ;
	public final void type_declaration() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:19:2: ( TYPE ID EQ type SEMI )
			// /Users/twb/repos/Tiger/tiger.g:19:4: TYPE ID EQ type SEMI
=======
	// /home/gangil/dev/Tiger/tiger.g:18:1: type_declaration : TYPE ID EQ type SEMI ;
	public final void type_declaration() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:19:2: ( TYPE ID EQ type SEMI )
			// /home/gangil/dev/Tiger/tiger.g:19:4: TYPE ID EQ type SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(input,TYPE,FOLLOW_TYPE_in_type_declaration57); 
			match(input,ID,FOLLOW_ID_in_type_declaration59); 
			match(input,EQ,FOLLOW_EQ_in_type_declaration61); 
			pushFollow(FOLLOW_type_in_type_declaration63);
			type();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_type_declaration65); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_declaration"



	// $ANTLR start "funct_declaration_list"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:22:1: funct_declaration_list : ( funct_declaration funct_declaration_list |);
	public final void funct_declaration_list() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:23:2: ( funct_declaration funct_declaration_list |)
=======
	// /home/gangil/dev/Tiger/tiger.g:22:1: funct_declaration_list : ( funct_declaration funct_declaration_list |);
	public final void funct_declaration_list() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:23:2: ( funct_declaration funct_declaration_list |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:23:4: funct_declaration funct_declaration_list
=======
					// /home/gangil/dev/Tiger/tiger.g:23:4: funct_declaration funct_declaration_list
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_funct_declaration_in_funct_declaration_list76);
					funct_declaration();
					state._fsp--;

					pushFollow(FOLLOW_funct_declaration_list_in_funct_declaration_list78);
					funct_declaration_list();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:25:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:25:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funct_declaration_list"



	// $ANTLR start "funct_declaration"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:27:1: funct_declaration : ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ;
	public final void funct_declaration() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:28:2: ( ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			// /Users/twb/repos/Tiger/tiger.g:28:4: ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
=======
	// /home/gangil/dev/Tiger/tiger.g:27:1: funct_declaration : ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI ;
	public final void funct_declaration() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:28:2: ( ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI )
			// /home/gangil/dev/Tiger/tiger.g:28:4: ret_type FUNCTION ID LPAREN param_list RPAREN BEGIN block_list END SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			pushFollow(FOLLOW_ret_type_in_funct_declaration93);
			ret_type();
			state._fsp--;

			match(input,FUNCTION,FOLLOW_FUNCTION_in_funct_declaration95); 
			match(input,ID,FOLLOW_ID_in_funct_declaration97); 
			match(input,LPAREN,FOLLOW_LPAREN_in_funct_declaration99); 
			pushFollow(FOLLOW_param_list_in_funct_declaration101);
			param_list();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_funct_declaration103); 
			match(input,BEGIN,FOLLOW_BEGIN_in_funct_declaration105); 
			pushFollow(FOLLOW_block_list_in_funct_declaration107);
			block_list();
			state._fsp--;

			match(input,END,FOLLOW_END_in_funct_declaration109); 
			match(input,SEMI,FOLLOW_SEMI_in_funct_declaration111); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funct_declaration"



	// $ANTLR start "main_function"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:31:1: main_function : VOID MAIN LPAREN RPAREN block_list EOF ;
	public final void main_function() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:32:2: ( VOID MAIN LPAREN RPAREN block_list EOF )
			// /Users/twb/repos/Tiger/tiger.g:32:4: VOID MAIN LPAREN RPAREN block_list EOF
=======
	// /home/gangil/dev/Tiger/tiger.g:31:1: main_function : VOID MAIN LPAREN RPAREN block_list EOF ;
	public final void main_function() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:32:2: ( VOID MAIN LPAREN RPAREN block_list EOF )
			// /home/gangil/dev/Tiger/tiger.g:32:4: VOID MAIN LPAREN RPAREN block_list EOF
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(input,VOID,FOLLOW_VOID_in_main_function123); 
			match(input,MAIN,FOLLOW_MAIN_in_main_function125); 
			match(input,LPAREN,FOLLOW_LPAREN_in_main_function127); 
			match(input,RPAREN,FOLLOW_RPAREN_in_main_function129); 
			pushFollow(FOLLOW_block_list_in_main_function131);
			block_list();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_main_function133); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "main_function"



	// $ANTLR start "ret_type"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:35:1: ret_type : ( VOID | type_id );
	public final void ret_type() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:36:2: ( VOID | type_id )
=======
	// /home/gangil/dev/Tiger/tiger.g:35:1: ret_type : ( VOID | type_id );
	public final void ret_type() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:36:2: ( VOID | type_id )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:36:5: VOID
=======
					// /home/gangil/dev/Tiger/tiger.g:36:5: VOID
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,VOID,FOLLOW_VOID_in_ret_type146); 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:37:5: type_id
=======
					// /home/gangil/dev/Tiger/tiger.g:37:5: type_id
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_type_id_in_ret_type152);
					type_id();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ret_type"



	// $ANTLR start "param_list"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:40:1: param_list : ( param param_list_tail |);
	public final void param_list() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:41:2: ( param param_list_tail |)
=======
	// /home/gangil/dev/Tiger/tiger.g:40:1: param_list : ( param param_list_tail |);
	public final void param_list() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:41:2: ( param param_list_tail |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:41:4: param param_list_tail
=======
					// /home/gangil/dev/Tiger/tiger.g:41:4: param param_list_tail
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_param_in_param_list163);
					param();
					state._fsp--;

					pushFollow(FOLLOW_param_list_tail_in_param_list165);
					param_list_tail();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:43:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:43:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param_list"



	// $ANTLR start "param_list_tail"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:45:1: param_list_tail : ( COMMA param param_list_tail |);
	public final void param_list_tail() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:46:2: ( COMMA param param_list_tail |)
=======
	// /home/gangil/dev/Tiger/tiger.g:45:1: param_list_tail : ( COMMA param param_list_tail |);
	public final void param_list_tail() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:46:2: ( COMMA param param_list_tail |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:46:4: COMMA param param_list_tail
=======
					// /home/gangil/dev/Tiger/tiger.g:46:4: COMMA param param_list_tail
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,COMMA,FOLLOW_COMMA_in_param_list_tail181); 
					pushFollow(FOLLOW_param_in_param_list_tail183);
					param();
					state._fsp--;

					pushFollow(FOLLOW_param_list_tail_in_param_list_tail185);
					param_list_tail();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:48:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:48:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param_list_tail"



	// $ANTLR start "param"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:50:1: param : ID COLON type_id ;
	public final void param() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:51:2: ( ID COLON type_id )
			// /Users/twb/repos/Tiger/tiger.g:51:4: ID COLON type_id
=======
	// /home/gangil/dev/Tiger/tiger.g:50:1: param : ID COLON type_id ;
	public final void param() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:51:2: ( ID COLON type_id )
			// /home/gangil/dev/Tiger/tiger.g:51:4: ID COLON type_id
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(input,ID,FOLLOW_ID_in_param202); 
			match(input,COLON,FOLLOW_COLON_in_param204); 
			pushFollow(FOLLOW_type_id_in_param206);
			type_id();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param"



	// $ANTLR start "block_list"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:54:1: block_list : block block_tail ;
	public final void block_list() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:55:2: ( block block_tail )
			// /Users/twb/repos/Tiger/tiger.g:55:4: block block_tail
=======
	// /home/gangil/dev/Tiger/tiger.g:54:1: block_list : block block_tail ;
	public final void block_list() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:55:2: ( block block_tail )
			// /home/gangil/dev/Tiger/tiger.g:55:4: block block_tail
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			pushFollow(FOLLOW_block_in_block_list218);
			block();
			state._fsp--;

			pushFollow(FOLLOW_block_tail_in_block_list220);
			block_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_list"



	// $ANTLR start "block_tail"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:58:1: block_tail : block block_tail ;
	public final void block_tail() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:59:2: ( block block_tail )
			// /Users/twb/repos/Tiger/tiger.g:59:4: block block_tail
=======
	// /home/gangil/dev/Tiger/tiger.g:58:1: block_tail : block block_tail ;
	public final void block_tail() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:59:2: ( block block_tail )
			// /home/gangil/dev/Tiger/tiger.g:59:4: block block_tail
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			pushFollow(FOLLOW_block_in_block_tail231);
			block();
			state._fsp--;

			pushFollow(FOLLOW_block_tail_in_block_tail233);
			block_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_tail"



	// $ANTLR start "block"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:62:1: block : BEGIN declaration_segment stat_seq END SEMI ;
	public final void block() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:63:2: ( BEGIN declaration_segment stat_seq END SEMI )
			// /Users/twb/repos/Tiger/tiger.g:63:4: BEGIN declaration_segment stat_seq END SEMI
=======
	// /home/gangil/dev/Tiger/tiger.g:62:1: block : BEGIN declaration_segment stat_seq END SEMI ;
	public final void block() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:63:2: ( BEGIN declaration_segment stat_seq END SEMI )
			// /home/gangil/dev/Tiger/tiger.g:63:4: BEGIN declaration_segment stat_seq END SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(input,BEGIN,FOLLOW_BEGIN_in_block244); 
			pushFollow(FOLLOW_declaration_segment_in_block246);
			declaration_segment();
			state._fsp--;

			pushFollow(FOLLOW_stat_seq_in_block248);
			stat_seq();
			state._fsp--;

			match(input,END,FOLLOW_END_in_block250); 
			match(input,SEMI,FOLLOW_SEMI_in_block252); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"



	// $ANTLR start "declaration_segment"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:66:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final void declaration_segment() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:67:2: ( type_declaration_list var_declaration_list )
			// /Users/twb/repos/Tiger/tiger.g:67:4: type_declaration_list var_declaration_list
=======
	// /home/gangil/dev/Tiger/tiger.g:66:1: declaration_segment : type_declaration_list var_declaration_list ;
	public final void declaration_segment() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:67:2: ( type_declaration_list var_declaration_list )
			// /home/gangil/dev/Tiger/tiger.g:67:4: type_declaration_list var_declaration_list
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			pushFollow(FOLLOW_type_declaration_list_in_declaration_segment263);
			type_declaration_list();
			state._fsp--;

			pushFollow(FOLLOW_var_declaration_list_in_declaration_segment265);
			var_declaration_list();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration_segment"



	// $ANTLR start "var_declaration_list"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:70:1: var_declaration_list : ( var_declaration var_declaration_list |);
	public final void var_declaration_list() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:71:2: ( var_declaration var_declaration_list |)
=======
	// /home/gangil/dev/Tiger/tiger.g:70:1: var_declaration_list : ( var_declaration var_declaration_list |);
	public final void var_declaration_list() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:71:2: ( var_declaration var_declaration_list |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==VAR) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= BEGIN && LA6_0 <= BREAK)||(LA6_0 >= ELSE && LA6_0 <= ENDIF)||LA6_0==FOR||(LA6_0 >= ID && LA6_0 <= IF)||LA6_0==RETURN||LA6_0==WHILE) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:71:4: var_declaration var_declaration_list
=======
					// /home/gangil/dev/Tiger/tiger.g:71:4: var_declaration var_declaration_list
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_var_declaration_in_var_declaration_list276);
					var_declaration();
					state._fsp--;

					pushFollow(FOLLOW_var_declaration_list_in_var_declaration_list278);
					var_declaration_list();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:73:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:73:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "var_declaration_list"



	// $ANTLR start "type"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:75:1: type : ( base_type | ARRAY LBRACK INTLIT RBRACK OF base_type | ARRAY LBRACK INTLIT RBRACK LPAREN INTLIT RPAREN OF base_type );
	public final void type() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:76:2: ( base_type | ARRAY LBRACK INTLIT RBRACK OF base_type | ARRAY LBRACK INTLIT RBRACK LPAREN INTLIT RPAREN OF base_type )
=======
	// /home/gangil/dev/Tiger/tiger.g:75:1: type : ( base_type | ARRAY LBRACK INTLIT RBRACK OF base_type | ARRAY LBRACK INTLIT RBRACK LPAREN INTLIT RPAREN OF base_type );
	public final void type() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:76:2: ( base_type | ARRAY LBRACK INTLIT RBRACK OF base_type | ARRAY LBRACK INTLIT RBRACK LPAREN INTLIT RPAREN OF base_type )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==FIXEDPT||LA7_0==INT) ) {
				alt7=1;
			}
			else if ( (LA7_0==ARRAY) ) {
				int LA7_2 = input.LA(2);
				if ( (LA7_2==LBRACK) ) {
					int LA7_3 = input.LA(3);
					if ( (LA7_3==INTLIT) ) {
						int LA7_4 = input.LA(4);
						if ( (LA7_4==RBRACK) ) {
							int LA7_5 = input.LA(5);
							if ( (LA7_5==OF) ) {
								alt7=2;
							}
							else if ( (LA7_5==LPAREN) ) {
								alt7=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 5, input);
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
									new NoViableAltException("", 7, 4, input);
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
								new NoViableAltException("", 7, 3, input);
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
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:76:4: base_type
=======
					// /home/gangil/dev/Tiger/tiger.g:76:4: base_type
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_base_type_in_type293);
					base_type();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:77:4: ARRAY LBRACK INTLIT RBRACK OF base_type
=======
					// /home/gangil/dev/Tiger/tiger.g:77:4: ARRAY LBRACK INTLIT RBRACK OF base_type
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_type298); 
					match(input,LBRACK,FOLLOW_LBRACK_in_type300); 
					match(input,INTLIT,FOLLOW_INTLIT_in_type302); 
					match(input,RBRACK,FOLLOW_RBRACK_in_type304); 
					match(input,OF,FOLLOW_OF_in_type306); 
					pushFollow(FOLLOW_base_type_in_type308);
					base_type();
					state._fsp--;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:78:4: ARRAY LBRACK INTLIT RBRACK LPAREN INTLIT RPAREN OF base_type
=======
					// /home/gangil/dev/Tiger/tiger.g:78:4: ARRAY LBRACK INTLIT RBRACK LPAREN INTLIT RPAREN OF base_type
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_type313); 
					match(input,LBRACK,FOLLOW_LBRACK_in_type315); 
					match(input,INTLIT,FOLLOW_INTLIT_in_type317); 
					match(input,RBRACK,FOLLOW_RBRACK_in_type319); 
					match(input,LPAREN,FOLLOW_LPAREN_in_type321); 
					match(input,INTLIT,FOLLOW_INTLIT_in_type323); 
					match(input,RPAREN,FOLLOW_RPAREN_in_type325); 
					match(input,OF,FOLLOW_OF_in_type327); 
					pushFollow(FOLLOW_base_type_in_type329);
					base_type();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "type_id"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:81:1: type_id : ( base_type | ID );
	public final void type_id() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:82:2: ( base_type | ID )
=======
	// /home/gangil/dev/Tiger/tiger.g:81:1: type_id : ( base_type | ID );
	public final void type_id() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:82:2: ( base_type | ID )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:82:4: base_type
=======
					// /home/gangil/dev/Tiger/tiger.g:82:4: base_type
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_base_type_in_type_id340);
					base_type();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:83:4: ID
=======
					// /home/gangil/dev/Tiger/tiger.g:83:4: ID
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ID,FOLLOW_ID_in_type_id345); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_id"



	// $ANTLR start "base_type"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:86:1: base_type : ( INT | FIXEDPT );
	public final void base_type() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:87:2: ( INT | FIXEDPT )
			// /Users/twb/repos/Tiger/tiger.g:
=======
	// /home/gangil/dev/Tiger/tiger.g:86:1: base_type : ( INT | FIXEDPT );
	public final void base_type() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:87:2: ( INT | FIXEDPT )
			// /home/gangil/dev/Tiger/tiger.g:
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			if ( input.LA(1)==FIXEDPT||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "base_type"



	// $ANTLR start "var_declaration"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:91:1: var_declaration : VAR id_list COLON type_id optional_init SEMI ;
	public final void var_declaration() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:92:2: ( VAR id_list COLON type_id optional_init SEMI )
			// /Users/twb/repos/Tiger/tiger.g:92:4: VAR id_list COLON type_id optional_init SEMI
=======
	// /home/gangil/dev/Tiger/tiger.g:91:1: var_declaration : VAR id_list COLON type_id optional_init SEMI ;
	public final void var_declaration() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:92:2: ( VAR id_list COLON type_id optional_init SEMI )
			// /home/gangil/dev/Tiger/tiger.g:92:4: VAR id_list COLON type_id optional_init SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(input,VAR,FOLLOW_VAR_in_var_declaration372); 
			pushFollow(FOLLOW_id_list_in_var_declaration374);
			id_list();
			state._fsp--;

			match(input,COLON,FOLLOW_COLON_in_var_declaration376); 
			pushFollow(FOLLOW_type_id_in_var_declaration378);
			type_id();
			state._fsp--;

			pushFollow(FOLLOW_optional_init_in_var_declaration380);
			optional_init();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_var_declaration382); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "var_declaration"



	// $ANTLR start "optional_init"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:95:1: optional_init : ( ASSIGN const |);
	public final void optional_init() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:96:2: ( ASSIGN const |)
=======
	// /home/gangil/dev/Tiger/tiger.g:95:1: optional_init : ( ASSIGN const |);
	public final void optional_init() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:96:2: ( ASSIGN const |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:96:4: ASSIGN const
=======
					// /home/gangil/dev/Tiger/tiger.g:96:4: ASSIGN const
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_init393); 
					pushFollow(FOLLOW_const_in_optional_init395);
					const();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:98:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:98:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "optional_init"



	// $ANTLR start "id_list"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:100:1: id_list : ( ID | ID COMMA id_list );
	public final void id_list() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:101:2: ( ID | ID COMMA id_list )
=======
	// /home/gangil/dev/Tiger/tiger.g:100:1: id_list : ( ID | ID COMMA id_list );
	public final void id_list() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:101:2: ( ID | ID COMMA id_list )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==COMMA) ) {
					alt10=2;
				}
				else if ( (LA10_1==COLON||LA10_1==RPAREN) ) {
					alt10=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:101:4: ID
=======
					// /home/gangil/dev/Tiger/tiger.g:101:4: ID
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ID,FOLLOW_ID_in_id_list410); 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:102:4: ID COMMA id_list
=======
					// /home/gangil/dev/Tiger/tiger.g:102:4: ID COMMA id_list
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ID,FOLLOW_ID_in_id_list415); 
					match(input,COMMA,FOLLOW_COMMA_in_id_list417); 
					pushFollow(FOLLOW_id_list_in_id_list419);
					id_list();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "id_list"



	// $ANTLR start "optional_int"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:105:1: optional_int : ( ASSIGN const |);
	public final void optional_int() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:106:2: ( ASSIGN const |)
=======
	// /home/gangil/dev/Tiger/tiger.g:105:1: optional_int : ( ASSIGN const |);
	public final void optional_int() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:106:2: ( ASSIGN const |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ASSIGN) ) {
				alt11=1;
			}
			else if ( (LA11_0==EOF) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:106:4: ASSIGN const
=======
					// /home/gangil/dev/Tiger/tiger.g:106:4: ASSIGN const
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_optional_int430); 
					pushFollow(FOLLOW_const_in_optional_int432);
					const();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:108:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:108:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "optional_int"



	// $ANTLR start "stat_seq"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:110:1: stat_seq : ( stat )* ;
	public final void stat_seq() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:111:2: ( ( stat )* )
			// /Users/twb/repos/Tiger/tiger.g:111:4: ( stat )*
			{
			// /Users/twb/repos/Tiger/tiger.g:111:4: ( stat )*
=======
	// /home/gangil/dev/Tiger/tiger.g:110:1: stat_seq : ( stat )* ;
	public final void stat_seq() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:111:2: ( ( stat )* )
			// /home/gangil/dev/Tiger/tiger.g:111:4: ( stat )*
			{
			// /home/gangil/dev/Tiger/tiger.g:111:4: ( stat )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= BEGIN && LA12_0 <= BREAK)||LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= IF)||LA12_0==RETURN||LA12_0==WHILE) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:111:5: stat
=======
					// /home/gangil/dev/Tiger/tiger.g:111:5: stat
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_stat_in_stat_seq448);
					stat();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat_seq"



	// $ANTLR start "expr"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:114:1: expr : ( const | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator expr )* ;
	public final void expr() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:115:2: ( ( const | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator expr )* )
			// /Users/twb/repos/Tiger/tiger.g:115:4: ( const | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator expr )*
			{
			// /Users/twb/repos/Tiger/tiger.g:115:4: ( const | value | LPAREN expr RPAREN )
=======
	// /home/gangil/dev/Tiger/tiger.g:114:1: expr : ( const | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator expr )* ;
	public final void expr() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:115:2: ( ( const | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator expr )* )
			// /home/gangil/dev/Tiger/tiger.g:115:4: ( const | value | LPAREN expr RPAREN ) ( options {greedy=true; } : binary_operator expr )*
			{
			// /home/gangil/dev/Tiger/tiger.g:115:4: ( const | value | LPAREN expr RPAREN )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt13=3;
			switch ( input.LA(1) ) {
			case FIXEDPTLIT:
			case INTLIT:
				{
				alt13=1;
				}
				break;
			case ID:
				{
				alt13=2;
				}
				break;
			case LPAREN:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:115:5: const
=======
					// /home/gangil/dev/Tiger/tiger.g:115:5: const
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_const_in_expr462);
					const();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:115:13: value
=======
					// /home/gangil/dev/Tiger/tiger.g:115:13: value
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_value_in_expr466);
					value();
					state._fsp--;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:115:21: LPAREN expr RPAREN
=======
					// /home/gangil/dev/Tiger/tiger.g:115:21: LPAREN expr RPAREN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_expr470); 
					pushFollow(FOLLOW_expr_in_expr472);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_expr474); 
					}
					break;

			}

<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:115:41: ( options {greedy=true; } : binary_operator expr )*
=======
			// /home/gangil/dev/Tiger/tiger.g:115:41: ( options {greedy=true; } : binary_operator expr )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			loop14:
			while (true) {
				int alt14=2;
				switch ( input.LA(1) ) {
				case PLUS:
					{
					alt14=1;
					}
					break;
				case MINUS:
					{
					alt14=1;
					}
					break;
				case MULT:
					{
					alt14=1;
					}
					break;
				case DIV:
					{
					alt14=1;
					}
					break;
				case EQ:
					{
					alt14=1;
					}
					break;
				case NEQ:
					{
					alt14=1;
					}
					break;
				case LESSER:
					{
					alt14=1;
					}
					break;
				case GREATER:
					{
					alt14=1;
					}
					break;
				case AND:
					{
					alt14=1;
					}
					break;
				case OR:
					{
					alt14=1;
					}
					break;
				}
				switch (alt14) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:115:64: binary_operator expr
=======
					// /home/gangil/dev/Tiger/tiger.g:115:64: binary_operator expr
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_binary_operator_in_expr485);
					binary_operator();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr487);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "expr_list"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:118:1: expr_list : ( expr expr_list_tail |);
	public final void expr_list() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:119:2: ( expr expr_list_tail |)
=======
	// /home/gangil/dev/Tiger/tiger.g:118:1: expr_list : ( expr expr_list_tail |);
	public final void expr_list() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:119:2: ( expr expr_list_tail |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==FIXEDPTLIT||LA15_0==ID||LA15_0==INTLIT||LA15_0==LPAREN) ) {
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:119:4: expr expr_list_tail
=======
					// /home/gangil/dev/Tiger/tiger.g:119:4: expr expr_list_tail
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_expr_in_expr_list500);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_list_tail_in_expr_list502);
					expr_list_tail();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:121:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:121:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_list"



	// $ANTLR start "expr_list_tail"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:123:1: expr_list_tail : ( COMMA expr expr_list_tail |);
	public final void expr_list_tail() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:124:2: ( COMMA expr expr_list_tail |)
=======
	// /home/gangil/dev/Tiger/tiger.g:123:1: expr_list_tail : ( COMMA expr expr_list_tail |);
	public final void expr_list_tail() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:124:2: ( COMMA expr expr_list_tail |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==COMMA) ) {
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:124:4: COMMA expr expr_list_tail
=======
					// /home/gangil/dev/Tiger/tiger.g:124:4: COMMA expr expr_list_tail
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,COMMA,FOLLOW_COMMA_in_expr_list_tail517); 
					pushFollow(FOLLOW_expr_in_expr_list_tail519);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail521);
					expr_list_tail();
					state._fsp--;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:126:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:126:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_list_tail"



	// $ANTLR start "stat"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:128:1: stat : ( value ASSIGN ( expr SEMI | IF LPAREN expr_list RPAREN SEMI ) | if_stmt | WHILE expr DO stat_seq ENDDO SEMI | FOR ID ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI | BREAK SEMI | RETURN expr SEMI | block | funct_call SEMI );
	public final void stat() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:129:2: ( value ASSIGN ( expr SEMI | IF LPAREN expr_list RPAREN SEMI ) | if_stmt | WHILE expr DO stat_seq ENDDO SEMI | FOR ID ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI | BREAK SEMI | RETURN expr SEMI | block | funct_call SEMI )
=======
	// /home/gangil/dev/Tiger/tiger.g:128:1: stat : ( value ASSIGN ( expr SEMI | IF LPAREN expr_list RPAREN SEMI ) | if_stmt | WHILE expr DO stat_seq ENDDO SEMI | FOR ID ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI | BREAK SEMI | RETURN expr SEMI | block_list | funct_call SEMI );
	public final void stat() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:129:2: ( value ASSIGN ( expr SEMI | IF LPAREN expr_list RPAREN SEMI ) | if_stmt | WHILE expr DO stat_seq ENDDO SEMI | FOR ID ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI | BREAK SEMI | RETURN expr SEMI | block_list | funct_call SEMI )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
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
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:129:4: value ASSIGN ( expr SEMI | IF LPAREN expr_list RPAREN SEMI )
=======
					// /home/gangil/dev/Tiger/tiger.g:129:4: value ASSIGN ( expr SEMI | IF LPAREN expr_list RPAREN SEMI )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_value_in_stat536);
					value();
					state._fsp--;

					match(input,ASSIGN,FOLLOW_ASSIGN_in_stat538); 
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:129:17: ( expr SEMI | IF LPAREN expr_list RPAREN SEMI )
=======
					// /home/gangil/dev/Tiger/tiger.g:129:17: ( expr SEMI | IF LPAREN expr_list RPAREN SEMI )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==FIXEDPTLIT||LA17_0==ID||LA17_0==INTLIT||LA17_0==LPAREN) ) {
						alt17=1;
					}
					else if ( (LA17_0==IF) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
<<<<<<< HEAD
							// /Users/twb/repos/Tiger/tiger.g:129:18: expr SEMI
=======
							// /home/gangil/dev/Tiger/tiger.g:129:18: expr SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
							{
							pushFollow(FOLLOW_expr_in_stat541);
							expr();
							state._fsp--;

							match(input,SEMI,FOLLOW_SEMI_in_stat543); 
							}
							break;
						case 2 :
<<<<<<< HEAD
							// /Users/twb/repos/Tiger/tiger.g:129:30: IF LPAREN expr_list RPAREN SEMI
=======
							// /home/gangil/dev/Tiger/tiger.g:129:30: IF LPAREN expr_list RPAREN SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
							{
							match(input,IF,FOLLOW_IF_in_stat547); 
							match(input,LPAREN,FOLLOW_LPAREN_in_stat549); 
							pushFollow(FOLLOW_expr_list_in_stat551);
							expr_list();
							state._fsp--;

							match(input,RPAREN,FOLLOW_RPAREN_in_stat553); 
							match(input,SEMI,FOLLOW_SEMI_in_stat555); 
							}
							break;

					}

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:130:4: if_stmt
=======
					// /home/gangil/dev/Tiger/tiger.g:130:4: if_stmt
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_if_stmt_in_stat561);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:131:4: WHILE expr DO stat_seq ENDDO SEMI
=======
					// /home/gangil/dev/Tiger/tiger.g:131:4: WHILE expr DO stat_seq ENDDO SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,WHILE,FOLLOW_WHILE_in_stat566); 
					pushFollow(FOLLOW_expr_in_stat568);
					expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_stat570); 
					pushFollow(FOLLOW_stat_seq_in_stat572);
					stat_seq();
					state._fsp--;

					match(input,ENDDO,FOLLOW_ENDDO_in_stat574); 
					match(input,SEMI,FOLLOW_SEMI_in_stat576); 
					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:132:4: FOR ID ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI
=======
					// /home/gangil/dev/Tiger/tiger.g:132:4: FOR ID ASSIGN index_expr TO index_expr DO stat_seq ENDDO SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,FOR,FOLLOW_FOR_in_stat581); 
					match(input,ID,FOLLOW_ID_in_stat583); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_stat585); 
					pushFollow(FOLLOW_index_expr_in_stat587);
					index_expr();
					state._fsp--;

					match(input,TO,FOLLOW_TO_in_stat589); 
					pushFollow(FOLLOW_index_expr_in_stat591);
					index_expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_stat593); 
					pushFollow(FOLLOW_stat_seq_in_stat595);
					stat_seq();
					state._fsp--;

					match(input,ENDDO,FOLLOW_ENDDO_in_stat597); 
					match(input,SEMI,FOLLOW_SEMI_in_stat599); 
					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:133:4: BREAK SEMI
=======
					// /home/gangil/dev/Tiger/tiger.g:133:4: BREAK SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,BREAK,FOLLOW_BREAK_in_stat604); 
					match(input,SEMI,FOLLOW_SEMI_in_stat606); 
					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:134:4: RETURN expr SEMI
=======
					// /home/gangil/dev/Tiger/tiger.g:134:4: RETURN expr SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,RETURN,FOLLOW_RETURN_in_stat611); 
					pushFollow(FOLLOW_expr_in_stat613);
					expr();
					state._fsp--;

					match(input,SEMI,FOLLOW_SEMI_in_stat615); 
					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:135:4: block
					{
					pushFollow(FOLLOW_block_in_stat620);
					block();
=======
					// /home/gangil/dev/Tiger/tiger.g:135:4: block_list
					{
					pushFollow(FOLLOW_block_list_in_stat620);
					block_list();
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					state._fsp--;

					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:136:4: funct_call SEMI
=======
					// /home/gangil/dev/Tiger/tiger.g:136:4: funct_call SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_funct_call_in_stat625);
					funct_call();
					state._fsp--;

					match(input,SEMI,FOLLOW_SEMI_in_stat627); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "if_stmt"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:139:1: if_stmt : IF expr THEN stat_seq if_tail ;
	public final void if_stmt() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:140:2: ( IF expr THEN stat_seq if_tail )
			// /Users/twb/repos/Tiger/tiger.g:140:4: IF expr THEN stat_seq if_tail
=======
	// /home/gangil/dev/Tiger/tiger.g:139:1: if_stmt : IF expr THEN stat_seq if_tail ;
	public final void if_stmt() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:140:2: ( IF expr THEN stat_seq if_tail )
			// /home/gangil/dev/Tiger/tiger.g:140:4: IF expr THEN stat_seq if_tail
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(input,IF,FOLLOW_IF_in_if_stmt638); 
			pushFollow(FOLLOW_expr_in_if_stmt640);
			expr();
			state._fsp--;

			match(input,THEN,FOLLOW_THEN_in_if_stmt642); 
			pushFollow(FOLLOW_stat_seq_in_if_stmt644);
			stat_seq();
			state._fsp--;

			pushFollow(FOLLOW_if_tail_in_if_stmt646);
			if_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_stmt"



	// $ANTLR start "if_tail"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:143:1: if_tail : ( ELSE stat_seq ENDIF SEMI | ENDIF SEMI );
	public final void if_tail() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:144:2: ( ELSE stat_seq ENDIF SEMI | ENDIF SEMI )
=======
	// /home/gangil/dev/Tiger/tiger.g:143:1: if_tail : ( ELSE stat_seq ENDIF SEMI | ENDIF SEMI );
	public final void if_tail() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:144:2: ( ELSE stat_seq ENDIF SEMI | ENDIF SEMI )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ELSE) ) {
				alt19=1;
			}
			else if ( (LA19_0==ENDIF) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:144:4: ELSE stat_seq ENDIF SEMI
=======
					// /home/gangil/dev/Tiger/tiger.g:144:4: ELSE stat_seq ENDIF SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_tail657); 
					pushFollow(FOLLOW_stat_seq_in_if_tail659);
					stat_seq();
					state._fsp--;

					match(input,ENDIF,FOLLOW_ENDIF_in_if_tail661); 
					match(input,SEMI,FOLLOW_SEMI_in_if_tail663); 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:145:4: ENDIF SEMI
=======
					// /home/gangil/dev/Tiger/tiger.g:145:4: ENDIF SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,ENDIF,FOLLOW_ENDIF_in_if_tail668); 
					match(input,SEMI,FOLLOW_SEMI_in_if_tail670); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_tail"



	// $ANTLR start "opt_prefix"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:148:1: opt_prefix : ( value ASSIGN |);
	public final void opt_prefix() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:149:2: ( value ASSIGN |)
=======
	// /home/gangil/dev/Tiger/tiger.g:148:1: opt_prefix : ( value ASSIGN |);
	public final void opt_prefix() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:149:2: ( value ASSIGN |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ID) ) {
				alt20=1;
			}
			else if ( (LA20_0==EOF) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:149:4: value ASSIGN
=======
					// /home/gangil/dev/Tiger/tiger.g:149:4: value ASSIGN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_value_in_opt_prefix681);
					value();
					state._fsp--;

					match(input,ASSIGN,FOLLOW_ASSIGN_in_opt_prefix683); 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:151:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:151:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "opt_prefix"



	// $ANTLR start "const"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:153:1: const : ( INTLIT | FIXEDPTLIT );
	public final void const() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:154:2: ( INTLIT | FIXEDPTLIT )
			// /Users/twb/repos/Tiger/tiger.g:
=======
	// /home/gangil/dev/Tiger/tiger.g:153:1: const : ( INTLIT | FIXEDPTLIT );
	public final void const() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:154:2: ( INTLIT | FIXEDPTLIT )
			// /home/gangil/dev/Tiger/tiger.g:
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			if ( input.LA(1)==FIXEDPTLIT||input.LA(1)==INTLIT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "const"



	// $ANTLR start "binary_operator"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:158:1: binary_operator : ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LESSER EQ | GREATER EQ | AND | OR );
	public final void binary_operator() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:159:2: ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LESSER EQ | GREATER EQ | AND | OR )
=======
	// /home/gangil/dev/Tiger/tiger.g:158:1: binary_operator : ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LESSER EQ | GREATER EQ | AND | OR );
	public final void binary_operator() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:159:2: ( PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LESSER EQ | GREATER EQ | AND | OR )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt21=12;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt21=1;
				}
				break;
			case MINUS:
				{
				alt21=2;
				}
				break;
			case MULT:
				{
				alt21=3;
				}
				break;
			case DIV:
				{
				alt21=4;
				}
				break;
			case EQ:
				{
				alt21=5;
				}
				break;
			case NEQ:
				{
				alt21=6;
				}
				break;
			case LESSER:
				{
				int LA21_7 = input.LA(2);
				if ( (LA21_7==EQ) ) {
					alt21=9;
				}
				else if ( (LA21_7==FIXEDPTLIT||LA21_7==ID||LA21_7==INTLIT||LA21_7==LPAREN) ) {
					alt21=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case GREATER:
				{
				int LA21_8 = input.LA(2);
				if ( (LA21_8==EQ) ) {
					alt21=10;
				}
				else if ( (LA21_8==FIXEDPTLIT||LA21_8==ID||LA21_8==INTLIT||LA21_8==LPAREN) ) {
					alt21=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AND:
				{
				alt21=11;
				}
				break;
			case OR:
				{
				alt21=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:159:4: PLUS
=======
					// /home/gangil/dev/Tiger/tiger.g:159:4: PLUS
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,PLUS,FOLLOW_PLUS_in_binary_operator715); 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:160:4: MINUS
=======
					// /home/gangil/dev/Tiger/tiger.g:160:4: MINUS
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,MINUS,FOLLOW_MINUS_in_binary_operator720); 
					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:161:4: MULT
=======
					// /home/gangil/dev/Tiger/tiger.g:161:4: MULT
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,MULT,FOLLOW_MULT_in_binary_operator725); 
					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:162:4: DIV
=======
					// /home/gangil/dev/Tiger/tiger.g:162:4: DIV
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,DIV,FOLLOW_DIV_in_binary_operator730); 
					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:163:4: EQ
=======
					// /home/gangil/dev/Tiger/tiger.g:163:4: EQ
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,EQ,FOLLOW_EQ_in_binary_operator735); 
					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:164:4: NEQ
=======
					// /home/gangil/dev/Tiger/tiger.g:164:4: NEQ
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,NEQ,FOLLOW_NEQ_in_binary_operator740); 
					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:165:4: LESSER
=======
					// /home/gangil/dev/Tiger/tiger.g:165:4: LESSER
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,LESSER,FOLLOW_LESSER_in_binary_operator745); 
					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:166:4: GREATER
=======
					// /home/gangil/dev/Tiger/tiger.g:166:4: GREATER
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,GREATER,FOLLOW_GREATER_in_binary_operator750); 
					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:167:4: LESSER EQ
=======
					// /home/gangil/dev/Tiger/tiger.g:167:4: LESSER EQ
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,LESSER,FOLLOW_LESSER_in_binary_operator755); 
					match(input,EQ,FOLLOW_EQ_in_binary_operator757); 
					}
					break;
				case 10 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:168:4: GREATER EQ
=======
					// /home/gangil/dev/Tiger/tiger.g:168:4: GREATER EQ
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,GREATER,FOLLOW_GREATER_in_binary_operator762); 
					match(input,EQ,FOLLOW_EQ_in_binary_operator764); 
					}
					break;
				case 11 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:169:4: AND
=======
					// /home/gangil/dev/Tiger/tiger.g:169:4: AND
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,AND,FOLLOW_AND_in_binary_operator769); 
					}
					break;
				case 12 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:170:4: OR
=======
					// /home/gangil/dev/Tiger/tiger.g:170:4: OR
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,OR,FOLLOW_OR_in_binary_operator774); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "binary_operator"



	// $ANTLR start "value"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:173:1: value : ID value_tail ;
	public final void value() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:174:2: ( ID value_tail )
			// /Users/twb/repos/Tiger/tiger.g:174:4: ID value_tail
=======
	// /home/gangil/dev/Tiger/tiger.g:173:1: value : ID value_tail ;
	public final void value() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:174:2: ( ID value_tail )
			// /home/gangil/dev/Tiger/tiger.g:174:4: ID value_tail
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(input,ID,FOLLOW_ID_in_value785); 
			pushFollow(FOLLOW_value_tail_in_value787);
			value_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "value"



	// $ANTLR start "value_tail"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:177:1: value_tail : ( LBRACK index_expr RBRACK ( LBRACK index_expr RBRACK )? |);
	public final void value_tail() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:178:2: ( LBRACK index_expr RBRACK ( LBRACK index_expr RBRACK )? |)
=======
	// /home/gangil/dev/Tiger/tiger.g:177:1: value_tail : ( LBRACK index_expr RBRACK ( LBRACK index_expr RBRACK )? |);
	public final void value_tail() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:178:2: ( LBRACK index_expr RBRACK ( LBRACK index_expr RBRACK )? |)
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==LBRACK) ) {
				alt23=1;
			}
			else if ( (LA23_0==AND||LA23_0==ASSIGN||LA23_0==COMMA||(LA23_0 >= DIV && LA23_0 <= DO)||LA23_0==EQ||LA23_0==GREATER||LA23_0==LESSER||(LA23_0 >= MINUS && LA23_0 <= NEQ)||(LA23_0 >= OR && LA23_0 <= PLUS)||(LA23_0 >= RPAREN && LA23_0 <= THEN)) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:178:4: LBRACK index_expr RBRACK ( LBRACK index_expr RBRACK )?
=======
					// /home/gangil/dev/Tiger/tiger.g:178:4: LBRACK index_expr RBRACK ( LBRACK index_expr RBRACK )?
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_value_tail798); 
					pushFollow(FOLLOW_index_expr_in_value_tail800);
					index_expr();
					state._fsp--;

					match(input,RBRACK,FOLLOW_RBRACK_in_value_tail802); 
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:178:29: ( LBRACK index_expr RBRACK )?
=======
					// /home/gangil/dev/Tiger/tiger.g:178:29: ( LBRACK index_expr RBRACK )?
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==LBRACK) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
<<<<<<< HEAD
							// /Users/twb/repos/Tiger/tiger.g:178:30: LBRACK index_expr RBRACK
=======
							// /home/gangil/dev/Tiger/tiger.g:178:30: LBRACK index_expr RBRACK
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
							{
							match(input,LBRACK,FOLLOW_LBRACK_in_value_tail805); 
							pushFollow(FOLLOW_index_expr_in_value_tail807);
							index_expr();
							state._fsp--;

							match(input,RBRACK,FOLLOW_RBRACK_in_value_tail809); 
							}
							break;

					}

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:180:2: 
=======
					// /home/gangil/dev/Tiger/tiger.g:180:2: 
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "value_tail"



	// $ANTLR start "index_expr"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:182:1: index_expr : ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* ;
	public final void index_expr() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:183:2: ( ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* )
			// /Users/twb/repos/Tiger/tiger.g:183:4: ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )*
=======
	// /home/gangil/dev/Tiger/tiger.g:182:1: index_expr : ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* ;
	public final void index_expr() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:183:2: ( ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )* )
			// /home/gangil/dev/Tiger/tiger.g:183:4: ( INTLIT | ID ) ( options {greedy=true; } : index_oper index_expr )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			if ( input.LA(1)==ID||input.LA(1)==INTLIT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:183:18: ( options {greedy=true; } : index_oper index_expr )*
=======
			// /home/gangil/dev/Tiger/tiger.g:183:18: ( options {greedy=true; } : index_oper index_expr )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= MINUS && LA24_0 <= MULT)||LA24_0==PLUS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:183:42: index_oper index_expr
=======
					// /home/gangil/dev/Tiger/tiger.g:183:42: index_oper index_expr
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					pushFollow(FOLLOW_index_oper_in_index_expr843);
					index_oper();
					state._fsp--;

					pushFollow(FOLLOW_index_expr_in_index_expr845);
					index_expr();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_expr"



	// $ANTLR start "index_oper"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:186:1: index_oper : ( PLUS | MINUS | MULT );
	public final void index_oper() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:187:2: ( PLUS | MINUS | MULT )
			// /Users/twb/repos/Tiger/tiger.g:
=======
	// /home/gangil/dev/Tiger/tiger.g:186:1: index_oper : ( PLUS | MINUS | MULT );
	public final void index_oper() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:187:2: ( PLUS | MINUS | MULT )
			// /home/gangil/dev/Tiger/tiger.g:
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			if ( (input.LA(1) >= MINUS && input.LA(1) <= MULT)||input.LA(1)==PLUS ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index_oper"



	// $ANTLR start "funct_call"
<<<<<<< HEAD
	// /Users/twb/repos/Tiger/tiger.g:192:1: funct_call : ID LPAREN id_list RPAREN ;
	public final void funct_call() throws RecognitionException {
		try {
			// /Users/twb/repos/Tiger/tiger.g:193:2: ( ID LPAREN id_list RPAREN )
			// /Users/twb/repos/Tiger/tiger.g:193:4: ID LPAREN id_list RPAREN
=======
	// /home/gangil/dev/Tiger/tiger.g:192:1: funct_call : ID LPAREN id_list RPAREN ;
	public final void funct_call() throws  {
		try {
			// /home/gangil/dev/Tiger/tiger.g:193:2: ( ID LPAREN id_list RPAREN )
			// /home/gangil/dev/Tiger/tiger.g:193:4: ID LPAREN id_list RPAREN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(input,ID,FOLLOW_ID_in_funct_call879); 
			match(input,LPAREN,FOLLOW_LPAREN_in_funct_call881); 
			pushFollow(FOLLOW_id_list_in_funct_call883);
			id_list();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_funct_call885); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funct_call"

	// Delegated rules



	public static final BitSet FOLLOW_type_declaration_list_in_tiger_program27 = new BitSet(new long[]{0x000100000A080000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_tiger_program29 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_main_function_in_tiger_program31 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_type_declaration_list40 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_type_declaration_list_in_type_declaration_list42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type_declaration57 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_type_declaration59 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_type_declaration61 = new BitSet(new long[]{0x0000000008080020L});
	public static final BitSet FOLLOW_type_in_type_declaration63 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_type_declaration65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funct_declaration_in_funct_declaration_list76 = new BitSet(new long[]{0x000100000A080000L});
	public static final BitSet FOLLOW_funct_declaration_list_in_funct_declaration_list78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_type_in_funct_declaration93 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_FUNCTION_in_funct_declaration95 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_funct_declaration97 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_declaration99 = new BitSet(new long[]{0x0000040002000000L});
	public static final BitSet FOLLOW_param_list_in_funct_declaration101 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_declaration103 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BEGIN_in_funct_declaration105 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_funct_declaration107 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_END_in_funct_declaration109 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_funct_declaration111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_main_function123 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_MAIN_in_main_function125 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_main_function127 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_main_function129 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_list_in_main_function131 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_main_function133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_ret_type146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_ret_type152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list163 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_param_list_tail181 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_param_in_param_list_tail183 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_param_list_tail_in_param_list_tail185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_param202 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_in_param204 = new BitSet(new long[]{0x000000000A080000L});
	public static final BitSet FOLLOW_type_id_in_param206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_list218 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_list220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_block_tail231 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_tail_in_block_tail233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block244 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_declaration_segment_in_block246 = new BitSet(new long[]{0x0002020006208180L});
	public static final BitSet FOLLOW_stat_seq_in_block248 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_END_in_block250 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_block252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_list_in_declaration_segment263 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_declaration_segment265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_declaration_in_var_declaration_list276 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_var_declaration_list_in_var_declaration_list278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type298 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LBRACK_in_type300 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_INTLIT_in_type302 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RBRACK_in_type304 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_OF_in_type306 = new BitSet(new long[]{0x0000000008080000L});
	public static final BitSet FOLLOW_base_type_in_type308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_type313 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LBRACK_in_type315 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_INTLIT_in_type317 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RBRACK_in_type319 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_type321 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_INTLIT_in_type323 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_type325 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_OF_in_type327 = new BitSet(new long[]{0x0000000008080000L});
	public static final BitSet FOLLOW_base_type_in_type329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_type_id340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_id345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var_declaration372 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_id_list_in_var_declaration374 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COLON_in_var_declaration376 = new BitSet(new long[]{0x000000000A080000L});
	public static final BitSet FOLLOW_type_id_in_var_declaration378 = new BitSet(new long[]{0x0000080000000040L});
	public static final BitSet FOLLOW_optional_init_in_var_declaration380 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_var_declaration382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_init393 = new BitSet(new long[]{0x0000000010100000L});
	public static final BitSet FOLLOW_const_in_optional_init395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list415 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_id_list417 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_id_list_in_id_list419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_optional_int430 = new BitSet(new long[]{0x0000000010100000L});
	public static final BitSet FOLLOW_const_in_optional_int432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_seq448 = new BitSet(new long[]{0x0002020006200182L});
	public static final BitSet FOLLOW_const_in_expr462 = new BitSet(new long[]{0x000000DC40841012L});
	public static final BitSet FOLLOW_value_in_expr466 = new BitSet(new long[]{0x000000DC40841012L});
	public static final BitSet FOLLOW_LPAREN_in_expr470 = new BitSet(new long[]{0x0000000112100000L});
	public static final BitSet FOLLOW_expr_in_expr472 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr474 = new BitSet(new long[]{0x000000DC40841012L});
	public static final BitSet FOLLOW_binary_operator_in_expr485 = new BitSet(new long[]{0x0000000112100000L});
	public static final BitSet FOLLOW_expr_in_expr487 = new BitSet(new long[]{0x000000DC40841012L});
	public static final BitSet FOLLOW_expr_in_expr_list500 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list_tail517 = new BitSet(new long[]{0x0000000112100000L});
	public static final BitSet FOLLOW_expr_in_expr_list_tail519 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_stat536 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat538 = new BitSet(new long[]{0x0000000116100000L});
	public static final BitSet FOLLOW_expr_in_stat541 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_stat547 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_stat549 = new BitSet(new long[]{0x0000040112100000L});
	public static final BitSet FOLLOW_expr_list_in_stat551 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_stat553 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_stat561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stat566 = new BitSet(new long[]{0x0000000112100000L});
	public static final BitSet FOLLOW_expr_in_stat568 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_stat570 = new BitSet(new long[]{0x0002020006210180L});
	public static final BitSet FOLLOW_stat_seq_in_stat572 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ENDDO_in_stat574 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_stat581 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_stat583 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_stat585 = new BitSet(new long[]{0x0000000012000000L});
	public static final BitSet FOLLOW_index_expr_in_stat587 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_TO_in_stat589 = new BitSet(new long[]{0x0000000012000000L});
	public static final BitSet FOLLOW_index_expr_in_stat591 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_stat593 = new BitSet(new long[]{0x0002020006210180L});
	public static final BitSet FOLLOW_stat_seq_in_stat595 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ENDDO_in_stat597 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_stat604 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_stat611 = new BitSet(new long[]{0x0000000112100000L});
	public static final BitSet FOLLOW_expr_in_stat613 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat615 = new BitSet(new long[]{0x0000000000000002L});
<<<<<<< HEAD
	public static final BitSet FOLLOW_block_in_stat620 = new BitSet(new long[]{0x0000000000000002L});
=======
	public static final BitSet FOLLOW_block_list_in_stat620 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
	public static final BitSet FOLLOW_funct_call_in_stat625 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_stat627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt638 = new BitSet(new long[]{0x0000000112100000L});
	public static final BitSet FOLLOW_expr_in_if_stmt640 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_THEN_in_if_stmt642 = new BitSet(new long[]{0x0002020006224180L});
	public static final BitSet FOLLOW_stat_seq_in_if_stmt644 = new BitSet(new long[]{0x0000000000024000L});
	public static final BitSet FOLLOW_if_tail_in_if_stmt646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_tail657 = new BitSet(new long[]{0x0002020006220180L});
	public static final BitSet FOLLOW_stat_seq_in_if_tail659 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDIF_in_if_tail661 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_tail663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENDIF_in_if_tail668 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_if_tail670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_opt_prefix681 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_opt_prefix683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_binary_operator715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_binary_operator720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_binary_operator725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIV_in_binary_operator730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_binary_operator735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_binary_operator740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_binary_operator745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_binary_operator750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSER_in_binary_operator755 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_binary_operator757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_binary_operator762 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQ_in_binary_operator764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_binary_operator769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_binary_operator774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value785 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_value_tail_in_value787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_value_tail798 = new BitSet(new long[]{0x0000000012000000L});
	public static final BitSet FOLLOW_index_expr_in_value_tail800 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RBRACK_in_value_tail802 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_LBRACK_in_value_tail805 = new BitSet(new long[]{0x0000000012000000L});
	public static final BitSet FOLLOW_index_expr_in_value_tail807 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RBRACK_in_value_tail809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_index_expr826 = new BitSet(new long[]{0x0000008C00000002L});
	public static final BitSet FOLLOW_index_oper_in_index_expr843 = new BitSet(new long[]{0x0000000012000000L});
	public static final BitSet FOLLOW_index_expr_in_index_expr845 = new BitSet(new long[]{0x0000008C00000002L});
	public static final BitSet FOLLOW_ID_in_funct_call879 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_funct_call881 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_id_list_in_funct_call883 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_funct_call885 = new BitSet(new long[]{0x0000000000000002L});
}
