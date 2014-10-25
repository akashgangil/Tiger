// $ANTLR 3.5.1 /Users/twb/Repos/Class/Tiger/grammar/Tiger.g 2014-10-25 10:49:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TigerLexer extends Lexer {
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
	public static final int DIMENSION=13;
	public static final int DIV=14;
	public static final int DO=15;
	public static final int ELSE=16;
	public static final int END=17;
	public static final int ENDDO=18;
	public static final int ENDIF=19;
	public static final int EQ=20;
	public static final int EXPR=21;
	public static final int EXPRS=22;
	public static final int FIXEDPT=23;
	public static final int FIXEDPTLIT=24;
	public static final int FOR=25;
	public static final int FUNCTION=26;
	public static final int FUNCTIONS=27;
	public static final int GEQ=28;
	public static final int GREATER=29;
	public static final int ID=30;
	public static final int IDS=31;
	public static final int IF=32;
	public static final int IFFALSE=33;
	public static final int IFTRUE=34;
	public static final int INT=35;
	public static final int INTLIT=36;
	public static final int INVOKE=37;
	public static final int LBRACK=38;
	public static final int LEQ=39;
	public static final int LESSER=40;
	public static final int LPAREN=41;
	public static final int MAIN=42;
	public static final int MINUS=43;
	public static final int MULT=44;
	public static final int NEQ=45;
	public static final int OF=46;
	public static final int OR=47;
	public static final int PARAMS=48;
	public static final int PLUS=49;
	public static final int PROGRAM=50;
	public static final int RANGE=51;
	public static final int RBRACK=52;
	public static final int REFERENCE=53;
	public static final int RETURN=54;
	public static final int RPAREN=55;
	public static final int SEMI=56;
	public static final int STATEMENTS=57;
	public static final int THEN=58;
	public static final int TO=59;
	public static final int TYPE=60;
	public static final int TYPES=61;
	public static final int VAR=62;
	public static final int VARS=63;
	public static final int VOID=64;
	public static final int WHILE=65;
	public static final int WS=66;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TigerLexer() {} 
	public TigerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TigerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/twb/Repos/Class/Tiger/grammar/Tiger.g"; }

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:269:10: ( 'function' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:269:12: 'function'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:270:8: ( 'begin' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:270:10: 'begin'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:271:7: ( 'end' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:271:9: 'end'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:272:7: ( 'void' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:272:9: 'void'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:273:7: ( 'main' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:273:9: 'main'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:274:7: ( 'type' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:274:9: 'type'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:275:8: ( 'array' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:275:10: 'array'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:276:6: ( 'of' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:276:8: 'of'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:277:7: ( 'int' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:277:9: 'int'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:278:10: ( 'fixedpt' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:278:12: 'fixedpt'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:279:7: ( 'var' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:279:9: 'var'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:280:6: ( 'if' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:280:8: 'if'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:281:7: ( 'then' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:281:9: 'then'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:282:8: ( 'endif' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:282:10: 'endif'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:283:7: ( 'else' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:283:9: 'else'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:284:8: ( 'while' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:284:10: 'while'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:285:8: ( 'enddo' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:285:10: 'enddo'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:286:7: ( 'for' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:286:9: 'for'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:287:6: ( 'to' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:287:8: 'to'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:288:6: ( 'do' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:288:8: 'do'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:289:8: ( 'break' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:289:10: 'break'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:290:9: ( 'return' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:290:11: 'return'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:292:8: ( ',' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:292:10: ','
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:293:8: ( ':' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:293:10: ':'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:294:7: ( ';' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:294:9: ';'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:295:9: ( '(' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:295:11: '('
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:296:9: ( ')' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:296:11: ')'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:297:9: ( '[' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:297:11: '['
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:298:9: ( ']' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:298:11: ']'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:299:8: ( '+' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:299:10: '+'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:300:9: ( '-' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:300:11: '-'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:301:8: ( '*' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:301:10: '*'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:302:7: ( '/' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:302:9: '/'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:303:6: ( '=' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:303:8: '='
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:304:7: ( '<>' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:304:9: '<>'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:305:10: ( '<' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:305:12: '<'
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

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:306:10: ( '>' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:306:12: '>'
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

	// $ANTLR start "LEQ"
	public final void mLEQ() throws RecognitionException {
		try {
			int _type = LEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:307:7: ( '<=' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:307:9: '<='
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
	// $ANTLR end "LEQ"

	// $ANTLR start "GEQ"
	public final void mGEQ() throws RecognitionException {
		try {
			int _type = GEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:308:7: ( '>=' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:308:9: '>='
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
	// $ANTLR end "GEQ"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:309:7: ( '&' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:309:9: '&'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:310:7: ( '|' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:310:9: '|'
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:311:9: ( ':=' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:311:11: ':='
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:313:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:313:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:313:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:314:10: ( '/*' ( . )* '*/' )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:314:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:314:17: ( . )*
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
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:314:17: .
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:315:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:315:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:316:9: ( ( '0' .. '9' ) ( '0' .. '9' )* )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:316:11: ( '0' .. '9' ) ( '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:316:22: ( '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:317:12: ( INTLIT '.' ( '0' .. '9' ) ( options {greedy=true; } : ( '0' .. '9' ) )? ( '0' .. '9' )? )
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:317:14: INTLIT '.' ( '0' .. '9' ) ( options {greedy=true; } : ( '0' .. '9' ) )? ( '0' .. '9' )?
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
			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:317:36: ( options {greedy=true; } : ( '0' .. '9' ) )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:317:60: ( '0' .. '9' )
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

			// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:317:73: ( '0' .. '9' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:
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
		// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:8: ( FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | ENDDO | FOR | TO | DO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR | ASSIGN | ID | COMMENT | WS | INTLIT | FIXEDPTLIT )
		int alt6=47;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:10: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 2 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:19: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 3 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:25: END
				{
				mEND(); 

				}
				break;
			case 4 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:29: VOID
				{
				mVOID(); 

				}
				break;
			case 5 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:34: MAIN
				{
				mMAIN(); 

				}
				break;
			case 6 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:39: TYPE
				{
				mTYPE(); 

				}
				break;
			case 7 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:44: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 8 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:50: OF
				{
				mOF(); 

				}
				break;
			case 9 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:53: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:57: FIXEDPT
				{
				mFIXEDPT(); 

				}
				break;
			case 11 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:65: VAR
				{
				mVAR(); 

				}
				break;
			case 12 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:69: IF
				{
				mIF(); 

				}
				break;
			case 13 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:72: THEN
				{
				mTHEN(); 

				}
				break;
			case 14 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:77: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 15 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:83: ELSE
				{
				mELSE(); 

				}
				break;
			case 16 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:88: WHILE
				{
				mWHILE(); 

				}
				break;
			case 17 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:94: ENDDO
				{
				mENDDO(); 

				}
				break;
			case 18 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:100: FOR
				{
				mFOR(); 

				}
				break;
			case 19 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:104: TO
				{
				mTO(); 

				}
				break;
			case 20 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:107: DO
				{
				mDO(); 

				}
				break;
			case 21 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:110: BREAK
				{
				mBREAK(); 

				}
				break;
			case 22 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:116: RETURN
				{
				mRETURN(); 

				}
				break;
			case 23 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:123: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 24 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:129: COLON
				{
				mCOLON(); 

				}
				break;
			case 25 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:135: SEMI
				{
				mSEMI(); 

				}
				break;
			case 26 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:140: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 27 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:147: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 28 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:154: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 29 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:161: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 30 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:168: PLUS
				{
				mPLUS(); 

				}
				break;
			case 31 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:173: MINUS
				{
				mMINUS(); 

				}
				break;
			case 32 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:179: MULT
				{
				mMULT(); 

				}
				break;
			case 33 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:184: DIV
				{
				mDIV(); 

				}
				break;
			case 34 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:188: EQ
				{
				mEQ(); 

				}
				break;
			case 35 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:191: NEQ
				{
				mNEQ(); 

				}
				break;
			case 36 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:195: LESSER
				{
				mLESSER(); 

				}
				break;
			case 37 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:202: GREATER
				{
				mGREATER(); 

				}
				break;
			case 38 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:210: LEQ
				{
				mLEQ(); 

				}
				break;
			case 39 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:214: GEQ
				{
				mGEQ(); 

				}
				break;
			case 40 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:218: AND
				{
				mAND(); 

				}
				break;
			case 41 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:222: OR
				{
				mOR(); 

				}
				break;
			case 42 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:225: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 43 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:232: ID
				{
				mID(); 

				}
				break;
			case 44 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:235: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 45 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:243: WS
				{
				mWS(); 

				}
				break;
			case 46 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:246: INTLIT
				{
				mINTLIT(); 

				}
				break;
			case 47 :
				// /Users/twb/Repos/Class/Tiger/grammar/Tiger.g:1:253: FIXEDPTLIT
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
		"\46\1\44\1\47\1\45\1\uffff\1\56\1\57\14\uffff\1\23\1\uffff\1\10\1\uffff"+
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
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\115",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\117",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\121",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\127",
			"\1\130",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\3\35\1\132\4\35\1\131\21\35",
			"\1\134",
			"\1\135",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"\1\142",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\161",
			"",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\174",
			"\1\175",
			"\1\176",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\u0080",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
			return "1:1: Tokens : ( FUNCTION | BEGIN | END | VOID | MAIN | TYPE | ARRAY | OF | INT | FIXEDPT | VAR | IF | THEN | ENDIF | ELSE | WHILE | ENDDO | FOR | TO | DO | BREAK | RETURN | COMMA | COLON | SEMI | LPAREN | RPAREN | LBRACK | RBRACK | PLUS | MINUS | MULT | DIV | EQ | NEQ | LESSER | GREATER | LEQ | GEQ | AND | OR | ASSIGN | ID | COMMENT | WS | INTLIT | FIXEDPTLIT );";
		}
	}

}
