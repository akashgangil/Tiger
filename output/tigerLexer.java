<<<<<<< HEAD
// $ANTLR 3.5.1 /Users/twb/repos/Tiger/tiger.g 2014-10-03 13:27:02
=======
// $ANTLR 3.5 /home/gangil/dev/Tiger/tiger.g 2014-10-03 13:25:59
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tigerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tigerLexer() {} 
	public tigerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tigerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
<<<<<<< HEAD
	@Override public String getGrammarFileName() { return "/Users/twb/repos/Tiger/tiger.g"; }
=======
	@Override public String getGrammarFileName() { return "/home/gangil/dev/Tiger/tiger.g"; }
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:200:10: ( 'function' )
			// /Users/twb/repos/Tiger/tiger.g:200:12: 'function'
=======
			// /home/gangil/dev/Tiger/tiger.g:200:10: ( 'function' )
			// /home/gangil/dev/Tiger/tiger.g:200:12: 'function'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:201:8: ( 'begin' )
			// /Users/twb/repos/Tiger/tiger.g:201:10: 'begin'
=======
			// /home/gangil/dev/Tiger/tiger.g:201:8: ( 'begin' )
			// /home/gangil/dev/Tiger/tiger.g:201:10: 'begin'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:202:7: ( 'end' )
			// /Users/twb/repos/Tiger/tiger.g:202:9: 'end'
=======
			// /home/gangil/dev/Tiger/tiger.g:202:7: ( 'end' )
			// /home/gangil/dev/Tiger/tiger.g:202:9: 'end'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:203:7: ( 'void' )
			// /Users/twb/repos/Tiger/tiger.g:203:9: 'void'
=======
			// /home/gangil/dev/Tiger/tiger.g:203:7: ( 'void' )
			// /home/gangil/dev/Tiger/tiger.g:203:9: 'void'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:204:7: ( 'main' )
			// /Users/twb/repos/Tiger/tiger.g:204:9: 'main'
=======
			// /home/gangil/dev/Tiger/tiger.g:204:7: ( 'main' )
			// /home/gangil/dev/Tiger/tiger.g:204:9: 'main'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:205:7: ( 'type' )
			// /Users/twb/repos/Tiger/tiger.g:205:9: 'type'
=======
			// /home/gangil/dev/Tiger/tiger.g:205:7: ( 'type' )
			// /home/gangil/dev/Tiger/tiger.g:205:9: 'type'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "ARRAY"
	public final void mARRAY() throws RecognitionException {
		try {
			int _type = ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:206:8: ( 'array' )
			// /Users/twb/repos/Tiger/tiger.g:206:10: 'array'
=======
			// /home/gangil/dev/Tiger/tiger.g:206:8: ( 'array' )
			// /home/gangil/dev/Tiger/tiger.g:206:10: 'array'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY"

	// $ANTLR start "OF"
	public final void mOF() throws RecognitionException {
		try {
			int _type = OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:207:6: ( 'of' )
			// /Users/twb/repos/Tiger/tiger.g:207:8: 'of'
=======
			// /home/gangil/dev/Tiger/tiger.g:207:6: ( 'of' )
			// /home/gangil/dev/Tiger/tiger.g:207:8: 'of'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:208:7: ( 'int' )
			// /Users/twb/repos/Tiger/tiger.g:208:9: 'int'
=======
			// /home/gangil/dev/Tiger/tiger.g:208:7: ( 'int' )
			// /home/gangil/dev/Tiger/tiger.g:208:9: 'int'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FIXEDPT"
	public final void mFIXEDPT() throws RecognitionException {
		try {
			int _type = FIXEDPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:209:10: ( 'fixedpt' )
			// /Users/twb/repos/Tiger/tiger.g:209:12: 'fixedpt'
=======
			// /home/gangil/dev/Tiger/tiger.g:209:10: ( 'fixedpt' )
			// /home/gangil/dev/Tiger/tiger.g:209:12: 'fixedpt'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("fixedpt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIXEDPT"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:210:7: ( 'var' )
			// /Users/twb/repos/Tiger/tiger.g:210:9: 'var'
=======
			// /home/gangil/dev/Tiger/tiger.g:210:7: ( 'var' )
			// /home/gangil/dev/Tiger/tiger.g:210:9: 'var'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:211:6: ( 'if' )
			// /Users/twb/repos/Tiger/tiger.g:211:8: 'if'
=======
			// /home/gangil/dev/Tiger/tiger.g:211:6: ( 'if' )
			// /home/gangil/dev/Tiger/tiger.g:211:8: 'if'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:212:7: ( 'then' )
			// /Users/twb/repos/Tiger/tiger.g:212:9: 'then'
=======
			// /home/gangil/dev/Tiger/tiger.g:212:7: ( 'then' )
			// /home/gangil/dev/Tiger/tiger.g:212:9: 'then'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ENDIF"
	public final void mENDIF() throws RecognitionException {
		try {
			int _type = ENDIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:213:8: ( 'endif' )
			// /Users/twb/repos/Tiger/tiger.g:213:10: 'endif'
=======
			// /home/gangil/dev/Tiger/tiger.g:213:8: ( 'endif' )
			// /home/gangil/dev/Tiger/tiger.g:213:10: 'endif'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("endif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:214:7: ( 'else' )
			// /Users/twb/repos/Tiger/tiger.g:214:9: 'else'
=======
			// /home/gangil/dev/Tiger/tiger.g:214:7: ( 'else' )
			// /home/gangil/dev/Tiger/tiger.g:214:9: 'else'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:215:8: ( 'while' )
			// /Users/twb/repos/Tiger/tiger.g:215:10: 'while'
=======
			// /home/gangil/dev/Tiger/tiger.g:215:8: ( 'while' )
			// /home/gangil/dev/Tiger/tiger.g:215:10: 'while'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "ENDDO"
	public final void mENDDO() throws RecognitionException {
		try {
			int _type = ENDDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:216:8: ( 'enddo' )
			// /Users/twb/repos/Tiger/tiger.g:216:10: 'enddo'
=======
			// /home/gangil/dev/Tiger/tiger.g:216:8: ( 'enddo' )
			// /home/gangil/dev/Tiger/tiger.g:216:10: 'enddo'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("enddo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDDO"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:217:7: ( 'for' )
			// /Users/twb/repos/Tiger/tiger.g:217:9: 'for'
=======
			// /home/gangil/dev/Tiger/tiger.g:217:7: ( 'for' )
			// /home/gangil/dev/Tiger/tiger.g:217:9: 'for'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:218:6: ( 'to' )
			// /Users/twb/repos/Tiger/tiger.g:218:8: 'to'
=======
			// /home/gangil/dev/Tiger/tiger.g:218:6: ( 'to' )
			// /home/gangil/dev/Tiger/tiger.g:218:8: 'to'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:219:6: ( 'do' )
			// /Users/twb/repos/Tiger/tiger.g:219:8: 'do'
=======
			// /home/gangil/dev/Tiger/tiger.g:219:6: ( 'do' )
			// /home/gangil/dev/Tiger/tiger.g:219:8: 'do'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:220:8: ( 'break' )
			// /Users/twb/repos/Tiger/tiger.g:220:10: 'break'
=======
			// /home/gangil/dev/Tiger/tiger.g:220:8: ( 'break' )
			// /home/gangil/dev/Tiger/tiger.g:220:10: 'break'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:221:9: ( 'return' )
			// /Users/twb/repos/Tiger/tiger.g:221:11: 'return'
=======
			// /home/gangil/dev/Tiger/tiger.g:221:9: ( 'return' )
			// /home/gangil/dev/Tiger/tiger.g:221:11: 'return'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:223:8: ( ',' )
			// /Users/twb/repos/Tiger/tiger.g:223:10: ','
=======
			// /home/gangil/dev/Tiger/tiger.g:223:8: ( ',' )
			// /home/gangil/dev/Tiger/tiger.g:223:10: ','
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:224:8: ( ':' )
			// /Users/twb/repos/Tiger/tiger.g:224:10: ':'
=======
			// /home/gangil/dev/Tiger/tiger.g:224:8: ( ':' )
			// /home/gangil/dev/Tiger/tiger.g:224:10: ':'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:225:7: ( ';' )
			// /Users/twb/repos/Tiger/tiger.g:225:9: ';'
=======
			// /home/gangil/dev/Tiger/tiger.g:225:7: ( ';' )
			// /home/gangil/dev/Tiger/tiger.g:225:9: ';'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:226:9: ( '(' )
			// /Users/twb/repos/Tiger/tiger.g:226:11: '('
=======
			// /home/gangil/dev/Tiger/tiger.g:226:9: ( '(' )
			// /home/gangil/dev/Tiger/tiger.g:226:11: '('
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:227:9: ( ')' )
			// /Users/twb/repos/Tiger/tiger.g:227:11: ')'
=======
			// /home/gangil/dev/Tiger/tiger.g:227:9: ( ')' )
			// /home/gangil/dev/Tiger/tiger.g:227:11: ')'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:228:9: ( '[' )
			// /Users/twb/repos/Tiger/tiger.g:228:11: '['
=======
			// /home/gangil/dev/Tiger/tiger.g:228:9: ( '[' )
			// /home/gangil/dev/Tiger/tiger.g:228:11: '['
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:229:9: ( ']' )
			// /Users/twb/repos/Tiger/tiger.g:229:11: ']'
=======
			// /home/gangil/dev/Tiger/tiger.g:229:9: ( ']' )
			// /home/gangil/dev/Tiger/tiger.g:229:11: ']'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:230:8: ( '+' )
			// /Users/twb/repos/Tiger/tiger.g:230:10: '+'
=======
			// /home/gangil/dev/Tiger/tiger.g:230:8: ( '+' )
			// /home/gangil/dev/Tiger/tiger.g:230:10: '+'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:231:9: ( '-' )
			// /Users/twb/repos/Tiger/tiger.g:231:11: '-'
=======
			// /home/gangil/dev/Tiger/tiger.g:231:9: ( '-' )
			// /home/gangil/dev/Tiger/tiger.g:231:11: '-'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:232:8: ( '*' )
			// /Users/twb/repos/Tiger/tiger.g:232:10: '*'
=======
			// /home/gangil/dev/Tiger/tiger.g:232:8: ( '*' )
			// /home/gangil/dev/Tiger/tiger.g:232:10: '*'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:233:7: ( '/' )
			// /Users/twb/repos/Tiger/tiger.g:233:9: '/'
=======
			// /home/gangil/dev/Tiger/tiger.g:233:7: ( '/' )
			// /home/gangil/dev/Tiger/tiger.g:233:9: '/'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:234:6: ( '=' )
			// /Users/twb/repos/Tiger/tiger.g:234:8: '='
=======
			// /home/gangil/dev/Tiger/tiger.g:234:6: ( '=' )
			// /home/gangil/dev/Tiger/tiger.g:234:8: '='
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:235:7: ( '<>' )
			// /Users/twb/repos/Tiger/tiger.g:235:9: '<>'
=======
			// /home/gangil/dev/Tiger/tiger.g:235:7: ( '<>' )
			// /home/gangil/dev/Tiger/tiger.g:235:9: '<>'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "LESSER"
	public final void mLESSER() throws RecognitionException {
		try {
			int _type = LESSER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:236:10: ( '<' )
			// /Users/twb/repos/Tiger/tiger.g:236:12: '<'
=======
			// /home/gangil/dev/Tiger/tiger.g:236:10: ( '<' )
			// /home/gangil/dev/Tiger/tiger.g:236:12: '<'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSER"

	// $ANTLR start "LESSEREQ"
	public final void mLESSEREQ() throws RecognitionException {
		try {
			int _type = LESSEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:237:11: ( '<=' )
			// /Users/twb/repos/Tiger/tiger.g:237:13: '<='
=======
			// /home/gangil/dev/Tiger/tiger.g:237:11: ( '<=' )
			// /home/gangil/dev/Tiger/tiger.g:237:13: '<='
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSEREQ"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:238:10: ( '>' )
			// /Users/twb/repos/Tiger/tiger.g:238:12: '>'
=======
			// /home/gangil/dev/Tiger/tiger.g:238:10: ( '>' )
			// /home/gangil/dev/Tiger/tiger.g:238:12: '>'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "GREATEREQ"
	public final void mGREATEREQ() throws RecognitionException {
		try {
			int _type = GREATEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:239:13: ( '>=' )
			// /Users/twb/repos/Tiger/tiger.g:239:15: '>='
=======
			// /home/gangil/dev/Tiger/tiger.g:239:13: ( '>=' )
			// /home/gangil/dev/Tiger/tiger.g:239:15: '>='
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATEREQ"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:240:7: ( '&' )
			// /Users/twb/repos/Tiger/tiger.g:240:9: '&'
=======
			// /home/gangil/dev/Tiger/tiger.g:240:7: ( '&' )
			// /home/gangil/dev/Tiger/tiger.g:240:9: '&'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:241:7: ( '|' )
			// /Users/twb/repos/Tiger/tiger.g:241:9: '|'
=======
			// /home/gangil/dev/Tiger/tiger.g:241:7: ( '|' )
			// /home/gangil/dev/Tiger/tiger.g:241:9: '|'
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:242:9: ( ':=' )
			// /Users/twb/repos/Tiger/tiger.g:242:11: ':='
=======
			// /home/gangil/dev/Tiger/tiger.g:242:9: ( ':=' )
			// /home/gangil/dev/Tiger/tiger.g:242:11: ':='
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:244:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /Users/twb/repos/Tiger/tiger.g:244:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
=======
			// /home/gangil/dev/Tiger/tiger.g:244:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/gangil/dev/Tiger/tiger.g:244:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:244:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
=======
			// /home/gangil/dev/Tiger/tiger.g:244:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:
=======
					// /home/gangil/dev/Tiger/tiger.g:
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:245:10: ( '/*' ( . )* '*/' )
			// /Users/twb/repos/Tiger/tiger.g:245:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// /Users/twb/repos/Tiger/tiger.g:245:17: ( . )*
=======
			// /home/gangil/dev/Tiger/tiger.g:245:10: ( '/*' ( . )* '*/' )
			// /home/gangil/dev/Tiger/tiger.g:245:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// /home/gangil/dev/Tiger/tiger.g:245:17: ( . )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='*') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='/') ) {
						alt2=2;
					}
					else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:245:17: .
=======
					// /home/gangil/dev/Tiger/tiger.g:245:17: .
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			match("*/"); 

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:246:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/twb/repos/Tiger/tiger.g:246:8: ( ' ' | '\\t' | '\\r' | '\\n' )
=======
			// /home/gangil/dev/Tiger/tiger.g:246:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/gangil/dev/Tiger/tiger.g:246:8: ( ' ' | '\\t' | '\\r' | '\\n' )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "INTLIT"
	public final void mINTLIT() throws RecognitionException {
		try {
			int _type = INTLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:247:9: ( ( '0' .. '9' ) ( '0' .. '9' )* )
			// /Users/twb/repos/Tiger/tiger.g:247:11: ( '0' .. '9' ) ( '0' .. '9' )*
=======
			// /home/gangil/dev/Tiger/tiger.g:247:9: ( ( '0' .. '9' ) ( '0' .. '9' )* )
			// /home/gangil/dev/Tiger/tiger.g:247:11: ( '0' .. '9' ) ( '0' .. '9' )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:247:22: ( '0' .. '9' )*
=======
			// /home/gangil/dev/Tiger/tiger.g:247:22: ( '0' .. '9' )*
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:
=======
					// /home/gangil/dev/Tiger/tiger.g:
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTLIT"

	// $ANTLR start "FIXEDPTLIT"
	public final void mFIXEDPTLIT() throws RecognitionException {
		try {
			int _type = FIXEDPTLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:248:12: ( INTLIT '.' ( '0' .. '9' ) ( options {greedy=true; } : ( '0' .. '9' ) )? ( '0' .. '9' )? )
			// /Users/twb/repos/Tiger/tiger.g:248:14: INTLIT '.' ( '0' .. '9' ) ( options {greedy=true; } : ( '0' .. '9' ) )? ( '0' .. '9' )?
=======
			// /home/gangil/dev/Tiger/tiger.g:248:12: ( INTLIT '.' ( '0' .. '9' ) ( options {greedy=true; } : ( '0' .. '9' ) )? ( '0' .. '9' )? )
			// /home/gangil/dev/Tiger/tiger.g:248:14: INTLIT '.' ( '0' .. '9' ) ( options {greedy=true; } : ( '0' .. '9' ) )? ( '0' .. '9' )?
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			{
			mINTLIT(); 

			match('.'); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:248:36: ( options {greedy=true; } : ( '0' .. '9' ) )?
=======
			// /home/gangil/dev/Tiger/tiger.g:248:36: ( options {greedy=true; } : ( '0' .. '9' ) )?
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:248:60: ( '0' .. '9' )
=======
					// /home/gangil/dev/Tiger/tiger.g:248:60: ( '0' .. '9' )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

<<<<<<< HEAD
			// /Users/twb/repos/Tiger/tiger.g:248:73: ( '0' .. '9' )?
=======
			// /home/gangil/dev/Tiger/tiger.g:248:73: ( '0' .. '9' )?
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
<<<<<<< HEAD
					// /Users/twb/repos/Tiger/tiger.g:
=======
					// /home/gangil/dev/Tiger/tiger.g:
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIXEDPTLIT"

	@Override
	public void mTokens() throws RecognitionException {
<<<<<<< HEAD
		// /Users/twb/repos/Tiger/tiger.g:1:8: ( FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | ENDDO | FOR | TO | DO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ | AND | OR | ASSIGN | ID | COMMENT | WS | INTLIT | FIXEDPTLIT )
=======
		// /home/gangil/dev/Tiger/tiger.g:1:8: ( FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | ENDDO | FOR | TO | DO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ | AND | OR | ASSIGN | ID | COMMENT | WS | INTLIT | FIXEDPTLIT )
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
		int alt6=47;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:10: FUNCTION
=======
				// /home/gangil/dev/Tiger/tiger.g:1:10: FUNCTION
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mFUNCTION(); 

				}
				break;
			case 2 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:19: BEGIN
=======
				// /home/gangil/dev/Tiger/tiger.g:1:19: BEGIN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mBEGIN(); 

				}
				break;
			case 3 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:25: END
=======
				// /home/gangil/dev/Tiger/tiger.g:1:25: END
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mEND(); 

				}
				break;
			case 4 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:29: VOID
=======
				// /home/gangil/dev/Tiger/tiger.g:1:29: VOID
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mVOID(); 

				}
				break;
			case 5 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:34: MAIN
=======
				// /home/gangil/dev/Tiger/tiger.g:1:34: MAIN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mMAIN(); 

				}
				break;
			case 6 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:39: TYPE
=======
				// /home/gangil/dev/Tiger/tiger.g:1:39: TYPE
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mTYPE(); 

				}
				break;
			case 7 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:44: ARRAY
=======
				// /home/gangil/dev/Tiger/tiger.g:1:44: ARRAY
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mARRAY(); 

				}
				break;
			case 8 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:50: OF
=======
				// /home/gangil/dev/Tiger/tiger.g:1:50: OF
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mOF(); 

				}
				break;
			case 9 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:53: INT
=======
				// /home/gangil/dev/Tiger/tiger.g:1:53: INT
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mINT(); 

				}
				break;
			case 10 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:57: FIXEDPT
=======
				// /home/gangil/dev/Tiger/tiger.g:1:57: FIXEDPT
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mFIXEDPT(); 

				}
				break;
			case 11 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:65: VAR
=======
				// /home/gangil/dev/Tiger/tiger.g:1:65: VAR
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mVAR(); 

				}
				break;
			case 12 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:69: IF
=======
				// /home/gangil/dev/Tiger/tiger.g:1:69: IF
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mIF(); 

				}
				break;
			case 13 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:72: THEN
=======
				// /home/gangil/dev/Tiger/tiger.g:1:72: THEN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mTHEN(); 

				}
				break;
			case 14 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:77: ENDIF
=======
				// /home/gangil/dev/Tiger/tiger.g:1:77: ENDIF
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mENDIF(); 

				}
				break;
			case 15 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:83: ELSE
=======
				// /home/gangil/dev/Tiger/tiger.g:1:83: ELSE
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mELSE(); 

				}
				break;
			case 16 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:88: WHILE
=======
				// /home/gangil/dev/Tiger/tiger.g:1:88: WHILE
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mWHILE(); 

				}
				break;
			case 17 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:94: ENDDO
=======
				// /home/gangil/dev/Tiger/tiger.g:1:94: ENDDO
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mENDDO(); 

				}
				break;
			case 18 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:100: FOR
=======
				// /home/gangil/dev/Tiger/tiger.g:1:100: FOR
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mFOR(); 

				}
				break;
			case 19 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:104: TO
=======
				// /home/gangil/dev/Tiger/tiger.g:1:104: TO
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mTO(); 

				}
				break;
			case 20 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:107: DO
=======
				// /home/gangil/dev/Tiger/tiger.g:1:107: DO
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mDO(); 

				}
				break;
			case 21 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:110: BREAK
=======
				// /home/gangil/dev/Tiger/tiger.g:1:110: BREAK
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mBREAK(); 

				}
				break;
			case 22 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:116: RETURN
=======
				// /home/gangil/dev/Tiger/tiger.g:1:116: RETURN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mRETURN(); 

				}
				break;
			case 23 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:123: COMMA
=======
				// /home/gangil/dev/Tiger/tiger.g:1:123: COMMA
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mCOMMA(); 

				}
				break;
			case 24 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:129: COLON
=======
				// /home/gangil/dev/Tiger/tiger.g:1:129: COLON
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mCOLON(); 

				}
				break;
			case 25 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:135: SEMI
=======
				// /home/gangil/dev/Tiger/tiger.g:1:135: SEMI
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mSEMI(); 

				}
				break;
			case 26 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:140: LPAREN
=======
				// /home/gangil/dev/Tiger/tiger.g:1:140: LPAREN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mLPAREN(); 

				}
				break;
			case 27 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:147: RPAREN
=======
				// /home/gangil/dev/Tiger/tiger.g:1:147: RPAREN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mRPAREN(); 

				}
				break;
			case 28 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:154: LBRACK
=======
				// /home/gangil/dev/Tiger/tiger.g:1:154: LBRACK
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mLBRACK(); 

				}
				break;
			case 29 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:161: RBRACK
=======
				// /home/gangil/dev/Tiger/tiger.g:1:161: RBRACK
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mRBRACK(); 

				}
				break;
			case 30 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:168: PLUS
=======
				// /home/gangil/dev/Tiger/tiger.g:1:168: PLUS
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mPLUS(); 

				}
				break;
			case 31 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:173: MINUS
=======
				// /home/gangil/dev/Tiger/tiger.g:1:173: MINUS
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mMINUS(); 

				}
				break;
			case 32 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:179: MULT
=======
				// /home/gangil/dev/Tiger/tiger.g:1:179: MULT
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mMULT(); 

				}
				break;
			case 33 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:184: DIV
=======
				// /home/gangil/dev/Tiger/tiger.g:1:184: DIV
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mDIV(); 

				}
				break;
			case 34 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:188: EQ
=======
				// /home/gangil/dev/Tiger/tiger.g:1:188: EQ
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mEQ(); 

				}
				break;
			case 35 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:191: NEQ
=======
				// /home/gangil/dev/Tiger/tiger.g:1:191: NEQ
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mNEQ(); 

				}
				break;
			case 36 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:195: LESSER
=======
				// /home/gangil/dev/Tiger/tiger.g:1:195: LESSER
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mLESSER(); 

				}
				break;
			case 37 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:202: LESSEREQ
=======
				// /home/gangil/dev/Tiger/tiger.g:1:202: LESSEREQ
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mLESSEREQ(); 

				}
				break;
			case 38 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:211: GREATER
=======
				// /home/gangil/dev/Tiger/tiger.g:1:211: GREATER
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mGREATER(); 

				}
				break;
			case 39 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:219: GREATEREQ
=======
				// /home/gangil/dev/Tiger/tiger.g:1:219: GREATEREQ
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mGREATEREQ(); 

				}
				break;
			case 40 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:229: AND
=======
				// /home/gangil/dev/Tiger/tiger.g:1:229: AND
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mAND(); 

				}
				break;
			case 41 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:233: OR
=======
				// /home/gangil/dev/Tiger/tiger.g:1:233: OR
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mOR(); 

				}
				break;
			case 42 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:236: ASSIGN
=======
				// /home/gangil/dev/Tiger/tiger.g:1:236: ASSIGN
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mASSIGN(); 

				}
				break;
			case 43 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:243: ID
=======
				// /home/gangil/dev/Tiger/tiger.g:1:243: ID
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mID(); 

				}
				break;
			case 44 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:246: COMMENT
=======
				// /home/gangil/dev/Tiger/tiger.g:1:246: COMMENT
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mCOMMENT(); 

				}
				break;
			case 45 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:254: WS
=======
				// /home/gangil/dev/Tiger/tiger.g:1:254: WS
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mWS(); 

				}
				break;
			case 46 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:257: INTLIT
=======
				// /home/gangil/dev/Tiger/tiger.g:1:257: INTLIT
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mINTLIT(); 

				}
				break;
			case 47 :
<<<<<<< HEAD
				// /Users/twb/repos/Tiger/tiger.g:1:264: FIXEDPTLIT
=======
				// /home/gangil/dev/Tiger/tiger.g:1:264: FIXEDPTLIT
>>>>>>> 4ba6c6f64b1a350c02528b522d94095f821f968a
				{
				mFIXEDPTLIT(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\uffff\14\35\1\uffff\1\65\10\uffff\1\67\1\uffff\1\72\1\74\4\uffff\1"+
		"\76\14\35\1\114\1\35\1\116\1\35\1\120\1\35\1\122\1\35\11\uffff\1\76\2"+
		"\uffff\2\35\1\126\2\35\1\133\2\35\1\136\3\35\1\uffff\1\35\1\uffff\1\143"+
		"\1\uffff\1\35\1\uffff\3\35\1\uffff\4\35\1\uffff\1\154\1\155\1\uffff\1"+
		"\156\1\157\1\160\1\35\1\uffff\4\35\1\166\1\167\1\170\1\171\5\uffff\1\172"+
		"\1\173\3\35\6\uffff\1\177\1\35\1\u0081\1\uffff\1\u0082\2\uffff";
	static final String DFA6_eofS =
		"\u0083\uffff";
	static final String DFA6_minS =
		"\1\11\1\151\1\145\1\154\2\141\1\150\1\162\2\146\1\150\1\157\1\145\1\uffff"+
		"\1\75\10\uffff\1\52\1\uffff\2\75\4\uffff\1\56\1\156\1\170\1\162\1\147"+
		"\1\145\1\144\1\163\1\151\1\162\1\151\1\160\1\145\1\60\1\162\1\60\1\164"+
		"\1\60\1\151\1\60\1\164\11\uffff\1\56\2\uffff\1\143\1\145\1\60\1\151\1"+
		"\141\1\60\1\145\1\144\1\60\1\156\1\145\1\156\1\uffff\1\141\1\uffff\1\60"+
		"\1\uffff\1\154\1\uffff\1\165\1\164\1\144\1\uffff\1\156\1\153\1\146\1\157"+
		"\1\uffff\2\60\1\uffff\3\60\1\171\1\uffff\1\145\1\162\1\151\1\160\4\60"+
		"\5\uffff\2\60\1\156\1\157\1\164\6\uffff\1\60\1\156\1\60\1\uffff\1\60\2"+
		"\uffff";
	static final String DFA6_maxS =
		"\1\174\1\165\1\162\1\156\1\157\1\141\1\171\1\162\1\146\1\156\1\150\1\157"+
		"\1\145\1\uffff\1\75\10\uffff\1\52\1\uffff\1\76\1\75\4\uffff\1\71\1\156"+
		"\1\170\1\162\1\147\1\145\1\144\1\163\1\151\1\162\1\151\1\160\1\145\1\172"+
		"\1\162\1\172\1\164\1\172\1\151\1\172\1\164\11\uffff\1\71\2\uffff\1\143"+
		"\1\145\1\172\1\151\1\141\1\172\1\145\1\144\1\172\1\156\1\145\1\156\1\uffff"+
		"\1\141\1\uffff\1\172\1\uffff\1\154\1\uffff\1\165\1\164\1\144\1\uffff\1"+
		"\156\1\153\1\146\1\157\1\uffff\2\172\1\uffff\3\172\1\171\1\uffff\1\145"+
		"\1\162\1\151\1\160\4\172\5\uffff\2\172\1\156\1\157\1\164\6\uffff\1\172"+
		"\1\156\1\172\1\uffff\1\172\2\uffff";
	static final String DFA6_acceptS =
		"\15\uffff\1\27\1\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\uffff"+
		"\1\42\2\uffff\1\50\1\51\1\53\1\55\25\uffff\1\52\1\30\1\54\1\41\1\43\1"+
		"\45\1\44\1\47\1\46\1\uffff\1\56\1\57\14\uffff\1\23\1\uffff\1\10\1\uffff"+
		"\1\14\1\uffff\1\24\3\uffff\1\22\4\uffff\1\3\2\uffff\1\13\4\uffff\1\11"+
		"\10\uffff\1\17\1\4\1\5\1\6\1\15\5\uffff\1\2\1\25\1\16\1\21\1\7\1\20\3"+
		"\uffff\1\26\1\uffff\1\12\1\1";
	static final String DFA6_specialS =
		"\u0083\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\5\uffff\1\33\1\uffff\1\20\1\21\1\26"+
			"\1\24\1\15\1\25\1\uffff\1\27\12\37\1\16\1\17\1\31\1\30\1\32\2\uffff\32"+
			"\35\1\22\1\uffff\1\23\3\uffff\1\7\1\2\1\35\1\13\1\3\1\1\2\35\1\11\3\35"+
			"\1\5\1\35\1\10\2\35\1\14\1\35\1\6\1\35\1\4\1\12\3\35\1\uffff\1\34",
			"\1\41\5\uffff\1\42\5\uffff\1\40",
			"\1\43\14\uffff\1\44",
			"\1\46\1\uffff\1\45",
			"\1\50\15\uffff\1\47",
			"\1\51",
			"\1\53\6\uffff\1\54\11\uffff\1\52",
			"\1\55",
			"\1\56",
			"\1\60\7\uffff\1\57",
			"\1\61",
			"\1\62",
			"\1\63",
			"",
			"\1\64",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\66",
			"",
			"\1\71\1\70",
			"\1\73",
			"",
			"",
			"",
			"",
			"\1\77\1\uffff\12\75",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\115",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\117",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\121",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\123",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\77\1\uffff\12\75",
			"",
			"",
			"\1\124",
			"\1\125",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\127",
			"\1\130",
			"\12\35\7\uffff\32\35\6\uffff\3\35\1\132\4\35\1\131\21\35",
			"\1\134",
			"\1\135",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"\1\142",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"\1\144",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\161",
			"",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\174",
			"\1\175",
			"\1\176",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\u0080",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | ENDDO | FOR | TO | DO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | LESSEREQ | GREATER | GREATEREQ | AND | OR | ASSIGN | ID | COMMENT | WS | INTLIT | FIXEDPTLIT );";
		}
	}

}
