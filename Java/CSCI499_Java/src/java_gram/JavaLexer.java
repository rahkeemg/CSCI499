// Generated from Java.g4 by ANTLR 4.5.2
package java_gram;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, NL=104, COMMENT=105, LINE_COMMENT=106;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", 
		"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", 
		"OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", 
		"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", 
		"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"JavaLetter", "JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "NL", "COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", 
		"ELLIPSIS", "WS", "NL", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		public static final int WHITESPACE = 1;
		public static final int COMMENTS = 2;
		public static final int NEWLINES = 3;


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 144:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 145:
			NL_action((RuleContext)_localctx, actionIndex);
			break;
		case 146:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 147:
			LINE_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			_channel = WHITESPACE;
			break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			_channel = NEWLINES;
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			_channel = COMMENTS;
			break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			_channel = COMMENTS;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 140:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 141:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2l\u0437\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\5\64\u0283\n\64\3\65\3\65\5\65\u0287\n\65\3\66\3\66\5\66\u028b\n\66\3"+
		"\67\3\67\5\67\u028f\n\67\38\38\58\u0293\n8\39\39\3:\3:\3:\5:\u029a\n:"+
		"\3:\3:\3:\5:\u029f\n:\5:\u02a1\n:\3;\3;\7;\u02a5\n;\f;\16;\u02a8\13;\3"+
		";\5;\u02ab\n;\3<\3<\5<\u02af\n<\3=\3=\3>\3>\5>\u02b5\n>\3?\6?\u02b8\n"+
		"?\r?\16?\u02b9\3@\3@\3@\3@\3A\3A\7A\u02c2\nA\fA\16A\u02c5\13A\3A\5A\u02c8"+
		"\nA\3B\3B\3C\3C\5C\u02ce\nC\3D\3D\5D\u02d2\nD\3D\3D\3E\3E\7E\u02d8\nE"+
		"\fE\16E\u02db\13E\3E\5E\u02de\nE\3F\3F\3G\3G\5G\u02e4\nG\3H\3H\3H\3H\3"+
		"I\3I\7I\u02ec\nI\fI\16I\u02ef\13I\3I\5I\u02f2\nI\3J\3J\3K\3K\5K\u02f8"+
		"\nK\3L\3L\5L\u02fc\nL\3M\3M\3M\5M\u0301\nM\3M\5M\u0304\nM\3M\5M\u0307"+
		"\nM\3M\3M\3M\5M\u030c\nM\3M\5M\u030f\nM\3M\3M\3M\5M\u0314\nM\3M\3M\3M"+
		"\5M\u0319\nM\3N\3N\3N\3O\3O\3P\5P\u0321\nP\3P\3P\3Q\3Q\3R\3R\3S\3S\3S"+
		"\5S\u032c\nS\3T\3T\5T\u0330\nT\3T\3T\3T\5T\u0335\nT\3T\3T\5T\u0339\nT"+
		"\3U\3U\3U\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0349\nW\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\5X\u0353\nX\3Y\3Y\3Z\3Z\5Z\u0359\nZ\3Z\3Z\3[\6[\u035e\n[\r["+
		"\16[\u035f\3\\\3\\\5\\\u0364\n\\\3]\3]\3]\3]\5]\u036a\n]\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\5^\u0377\n^\3_\3_\3_\3_\3_\3_\3_\3`\3`\3a\3a\3a\3"+
		"a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3"+
		"l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3u\3"+
		"v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177"+
		"\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\7\u008d"+
		"\u03f6\n\u008d\f\u008d\16\u008d\u03f9\13\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u0401\n\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u0409\n\u008f\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0092\6\u0092\u0412\n\u0092\r\u0092\16\u0092"+
		"\u0413\3\u0092\3\u0092\3\u0093\6\u0093\u0419\n\u0093\r\u0093\16\u0093"+
		"\u041a\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u0423\n"+
		"\u0094\f\u0094\16\u0094\u0426\13\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u0431\n\u0095\f\u0095"+
		"\16\u0095\u0434\13\u0095\3\u0095\3\u0095\3\u0424\2\u0096\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m\2o\2q\2s\2u\2w\2"+
		"y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\66\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\67\u00af8\u00b1"+
		"\2\u00b39\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1:\u00c3"+
		";\u00c5<\u00c7=\u00c9>\u00cb?\u00cd@\u00cfA\u00d1B\u00d3C\u00d5D\u00d7"+
		"E\u00d9F\u00dbG\u00ddH\u00dfI\u00e1J\u00e3K\u00e5L\u00e7M\u00e9N\u00eb"+
		"O\u00edP\u00efQ\u00f1R\u00f3S\u00f5T\u00f7U\u00f9V\u00fbW\u00fdX\u00ff"+
		"Y\u0101Z\u0103[\u0105\\\u0107]\u0109^\u010b_\u010d`\u010fa\u0111b\u0113"+
		"c\u0115d\u0117e\u0119f\u011b\2\u011d\2\u011fg\u0121h\u0123i\u0125j\u0127"+
		"k\u0129l\3\2\31\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3"+
		"\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$))^"+
		"^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01"+
		"\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\5\2\f\f\17\17\""+
		"\"\4\2\f\f\17\17\u0446\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b3\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd"+
		"\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2"+
		"\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef"+
		"\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2"+
		"\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101"+
		"\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2"+
		"\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113"+
		"\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011f\3\2\2"+
		"\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129"+
		"\3\2\2\2\3\u012b\3\2\2\2\5\u0134\3\2\2\2\7\u013b\3\2\2\2\t\u0143\3\2\2"+
		"\2\13\u0149\3\2\2\2\r\u014e\3\2\2\2\17\u0153\3\2\2\2\21\u0159\3\2\2\2"+
		"\23\u015e\3\2\2\2\25\u0164\3\2\2\2\27\u016a\3\2\2\2\31\u0173\3\2\2\2\33"+
		"\u017b\3\2\2\2\35\u017e\3\2\2\2\37\u0185\3\2\2\2!\u018a\3\2\2\2#\u018f"+
		"\3\2\2\2%\u0197\3\2\2\2\'\u019d\3\2\2\2)\u01a5\3\2\2\2+\u01ab\3\2\2\2"+
		"-\u01af\3\2\2\2/\u01b2\3\2\2\2\61\u01b7\3\2\2\2\63\u01c2\3\2\2\2\65\u01c9"+
		"\3\2\2\2\67\u01d4\3\2\2\29\u01d8\3\2\2\2;\u01e2\3\2\2\2=\u01e7\3\2\2\2"+
		"?\u01ee\3\2\2\2A\u01f2\3\2\2\2C\u01fa\3\2\2\2E\u0202\3\2\2\2G\u020c\3"+
		"\2\2\2I\u0213\3\2\2\2K\u021a\3\2\2\2M\u0220\3\2\2\2O\u0227\3\2\2\2Q\u0230"+
		"\3\2\2\2S\u0236\3\2\2\2U\u023d\3\2\2\2W\u024a\3\2\2\2Y\u024f\3\2\2\2["+
		"\u0255\3\2\2\2]\u025c\3\2\2\2_\u0266\3\2\2\2a\u026a\3\2\2\2c\u026f\3\2"+
		"\2\2e\u0278\3\2\2\2g\u0282\3\2\2\2i\u0284\3\2\2\2k\u0288\3\2\2\2m\u028c"+
		"\3\2\2\2o\u0290\3\2\2\2q\u0294\3\2\2\2s\u02a0\3\2\2\2u\u02a2\3\2\2\2w"+
		"\u02ae\3\2\2\2y\u02b0\3\2\2\2{\u02b4\3\2\2\2}\u02b7\3\2\2\2\177\u02bb"+
		"\3\2\2\2\u0081\u02bf\3\2\2\2\u0083\u02c9\3\2\2\2\u0085\u02cd\3\2\2\2\u0087"+
		"\u02cf\3\2\2\2\u0089\u02d5\3\2\2\2\u008b\u02df\3\2\2\2\u008d\u02e3\3\2"+
		"\2\2\u008f\u02e5\3\2\2\2\u0091\u02e9\3\2\2\2\u0093\u02f3\3\2\2\2\u0095"+
		"\u02f7\3\2\2\2\u0097\u02fb\3\2\2\2\u0099\u0318\3\2\2\2\u009b\u031a\3\2"+
		"\2\2\u009d\u031d\3\2\2\2\u009f\u0320\3\2\2\2\u00a1\u0324\3\2\2\2\u00a3"+
		"\u0326\3\2\2\2\u00a5\u0328\3\2\2\2\u00a7\u0338\3\2\2\2\u00a9\u033a\3\2"+
		"\2\2\u00ab\u033d\3\2\2\2\u00ad\u0348\3\2\2\2\u00af\u0352\3\2\2\2\u00b1"+
		"\u0354\3\2\2\2\u00b3\u0356\3\2\2\2\u00b5\u035d\3\2\2\2\u00b7\u0363\3\2"+
		"\2\2\u00b9\u0369\3\2\2\2\u00bb\u0376\3\2\2\2\u00bd\u0378\3\2\2\2\u00bf"+
		"\u037f\3\2\2\2\u00c1\u0381\3\2\2\2\u00c3\u0386\3\2\2\2\u00c5\u0388\3\2"+
		"\2\2\u00c7\u038a\3\2\2\2\u00c9\u038c\3\2\2\2\u00cb\u038e\3\2\2\2\u00cd"+
		"\u0390\3\2\2\2\u00cf\u0392\3\2\2\2\u00d1\u0394\3\2\2\2\u00d3\u0396\3\2"+
		"\2\2\u00d5\u0398\3\2\2\2\u00d7\u039a\3\2\2\2\u00d9\u039c\3\2\2\2\u00db"+
		"\u039e\3\2\2\2\u00dd\u03a0\3\2\2\2\u00df\u03a2\3\2\2\2\u00e1\u03a4\3\2"+
		"\2\2\u00e3\u03a6\3\2\2\2\u00e5\u03a9\3\2\2\2\u00e7\u03ac\3\2\2\2\u00e9"+
		"\u03af\3\2\2\2\u00eb\u03b2\3\2\2\2\u00ed\u03b5\3\2\2\2\u00ef\u03b8\3\2"+
		"\2\2\u00f1\u03bb\3\2\2\2\u00f3\u03be\3\2\2\2\u00f5\u03c0\3\2\2\2\u00f7"+
		"\u03c2\3\2\2\2\u00f9\u03c4\3\2\2\2\u00fb\u03c6\3\2\2\2\u00fd\u03c8\3\2"+
		"\2\2\u00ff\u03ca\3\2\2\2\u0101\u03cc\3\2\2\2\u0103\u03ce\3\2\2\2\u0105"+
		"\u03d1\3\2\2\2\u0107\u03d4\3\2\2\2\u0109\u03d7\3\2\2\2\u010b\u03da\3\2"+
		"\2\2\u010d\u03dd\3\2\2\2\u010f\u03e0\3\2\2\2\u0111\u03e3\3\2\2\2\u0113"+
		"\u03e6\3\2\2\2\u0115\u03ea\3\2\2\2\u0117\u03ee\3\2\2\2\u0119\u03f3\3\2"+
		"\2\2\u011b\u0400\3\2\2\2\u011d\u0408\3\2\2\2\u011f\u040a\3\2\2\2\u0121"+
		"\u040c\3\2\2\2\u0123\u0411\3\2\2\2\u0125\u0418\3\2\2\2\u0127\u041e\3\2"+
		"\2\2\u0129\u042c\3\2\2\2\u012b\u012c\7c\2\2\u012c\u012d\7d\2\2\u012d\u012e"+
		"\7u\2\2\u012e\u012f\7v\2\2\u012f\u0130\7t\2\2\u0130\u0131\7c\2\2\u0131"+
		"\u0132\7e\2\2\u0132\u0133\7v\2\2\u0133\4\3\2\2\2\u0134\u0135\7c\2\2\u0135"+
		"\u0136\7u\2\2\u0136\u0137\7u\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2"+
		"\u0139\u013a\7v\2\2\u013a\6\3\2\2\2\u013b\u013c\7d\2\2\u013c\u013d\7q"+
		"\2\2\u013d\u013e\7q\2\2\u013e\u013f\7n\2\2\u013f\u0140\7g\2\2\u0140\u0141"+
		"\7c\2\2\u0141\u0142\7p\2\2\u0142\b\3\2\2\2\u0143\u0144\7d\2\2\u0144\u0145"+
		"\7t\2\2\u0145\u0146\7g\2\2\u0146\u0147\7c\2\2\u0147\u0148\7m\2\2\u0148"+
		"\n\3\2\2\2\u0149\u014a\7d\2\2\u014a\u014b\7{\2\2\u014b\u014c\7v\2\2\u014c"+
		"\u014d\7g\2\2\u014d\f\3\2\2\2\u014e\u014f\7e\2\2\u014f\u0150\7c\2\2\u0150"+
		"\u0151\7u\2\2\u0151\u0152\7g\2\2\u0152\16\3\2\2\2\u0153\u0154\7e\2\2\u0154"+
		"\u0155\7c\2\2\u0155\u0156\7v\2\2\u0156\u0157\7e\2\2\u0157\u0158\7j\2\2"+
		"\u0158\20\3\2\2\2\u0159\u015a\7e\2\2\u015a\u015b\7j\2\2\u015b\u015c\7"+
		"c\2\2\u015c\u015d\7t\2\2\u015d\22\3\2\2\2\u015e\u015f\7e\2\2\u015f\u0160"+
		"\7n\2\2\u0160\u0161\7c\2\2\u0161\u0162\7u\2\2\u0162\u0163\7u\2\2\u0163"+
		"\24\3\2\2\2\u0164\u0165\7e\2\2\u0165\u0166\7q\2\2\u0166\u0167\7p\2\2\u0167"+
		"\u0168\7u\2\2\u0168\u0169\7v\2\2\u0169\26\3\2\2\2\u016a\u016b\7e\2\2\u016b"+
		"\u016c\7q\2\2\u016c\u016d\7p\2\2\u016d\u016e\7v\2\2\u016e\u016f\7k\2\2"+
		"\u016f\u0170\7p\2\2\u0170\u0171\7w\2\2\u0171\u0172\7g\2\2\u0172\30\3\2"+
		"\2\2\u0173\u0174\7f\2\2\u0174\u0175\7g\2\2\u0175\u0176\7h\2\2\u0176\u0177"+
		"\7c\2\2\u0177\u0178\7w\2\2\u0178\u0179\7n\2\2\u0179\u017a\7v\2\2\u017a"+
		"\32\3\2\2\2\u017b\u017c\7f\2\2\u017c\u017d\7q\2\2\u017d\34\3\2\2\2\u017e"+
		"\u017f\7f\2\2\u017f\u0180\7q\2\2\u0180\u0181\7w\2\2\u0181\u0182\7d\2\2"+
		"\u0182\u0183\7n\2\2\u0183\u0184\7g\2\2\u0184\36\3\2\2\2\u0185\u0186\7"+
		"g\2\2\u0186\u0187\7n\2\2\u0187\u0188\7u\2\2\u0188\u0189\7g\2\2\u0189 "+
		"\3\2\2\2\u018a\u018b\7g\2\2\u018b\u018c\7p\2\2\u018c\u018d\7w\2\2\u018d"+
		"\u018e\7o\2\2\u018e\"\3\2\2\2\u018f\u0190\7g\2\2\u0190\u0191\7z\2\2\u0191"+
		"\u0192\7v\2\2\u0192\u0193\7g\2\2\u0193\u0194\7p\2\2\u0194\u0195\7f\2\2"+
		"\u0195\u0196\7u\2\2\u0196$\3\2\2\2\u0197\u0198\7h\2\2\u0198\u0199\7k\2"+
		"\2\u0199\u019a\7p\2\2\u019a\u019b\7c\2\2\u019b\u019c\7n\2\2\u019c&\3\2"+
		"\2\2\u019d\u019e\7h\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1"+
		"\7c\2\2\u01a1\u01a2\7n\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4\7{\2\2\u01a4"+
		"(\3\2\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7n\2\2\u01a7\u01a8\7q\2\2\u01a8"+
		"\u01a9\7c\2\2\u01a9\u01aa\7v\2\2\u01aa*\3\2\2\2\u01ab\u01ac\7h\2\2\u01ac"+
		"\u01ad\7q\2\2\u01ad\u01ae\7t\2\2\u01ae,\3\2\2\2\u01af\u01b0\7k\2\2\u01b0"+
		"\u01b1\7h\2\2\u01b1.\3\2\2\2\u01b2\u01b3\7i\2\2\u01b3\u01b4\7q\2\2\u01b4"+
		"\u01b5\7v\2\2\u01b5\u01b6\7q\2\2\u01b6\60\3\2\2\2\u01b7\u01b8\7k\2\2\u01b8"+
		"\u01b9\7o\2\2\u01b9\u01ba\7r\2\2\u01ba\u01bb\7n\2\2\u01bb\u01bc\7g\2\2"+
		"\u01bc\u01bd\7o\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0"+
		"\7v\2\2\u01c0\u01c1\7u\2\2\u01c1\62\3\2\2\2\u01c2\u01c3\7k\2\2\u01c3\u01c4"+
		"\7o\2\2\u01c4\u01c5\7r\2\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7t\2\2\u01c7"+
		"\u01c8\7v\2\2\u01c8\64\3\2\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7p\2\2\u01cb"+
		"\u01cc\7u\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7c\2\2\u01ce\u01cf\7p\2\2"+
		"\u01cf\u01d0\7e\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7q\2\2\u01d2\u01d3"+
		"\7h\2\2\u01d3\66\3\2\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7p\2\2\u01d6\u01d7"+
		"\7v\2\2\u01d78\3\2\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da\7p\2\2\u01da\u01db"+
		"\7v\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\7t\2\2\u01dd\u01de\7h\2\2\u01de"+
		"\u01df\7c\2\2\u01df\u01e0\7e\2\2\u01e0\u01e1\7g\2\2\u01e1:\3\2\2\2\u01e2"+
		"\u01e3\7n\2\2\u01e3\u01e4\7q\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7i\2\2"+
		"\u01e6<\3\2\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7v\2"+
		"\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7x\2\2\u01ec\u01ed\7g\2\2\u01ed>\3\2"+
		"\2\2\u01ee\u01ef\7p\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1\7y\2\2\u01f1@\3"+
		"\2\2\2\u01f2\u01f3\7r\2\2\u01f3\u01f4\7c\2\2\u01f4\u01f5\7e\2\2\u01f5"+
		"\u01f6\7m\2\2\u01f6\u01f7\7c\2\2\u01f7\u01f8\7i\2\2\u01f8\u01f9\7g\2\2"+
		"\u01f9B\3\2\2\2\u01fa\u01fb\7r\2\2\u01fb\u01fc\7t\2\2\u01fc\u01fd\7k\2"+
		"\2\u01fd\u01fe\7x\2\2\u01fe\u01ff\7c\2\2\u01ff\u0200\7v\2\2\u0200\u0201"+
		"\7g\2\2\u0201D\3\2\2\2\u0202\u0203\7r\2\2\u0203\u0204\7t\2\2\u0204\u0205"+
		"\7q\2\2\u0205\u0206\7v\2\2\u0206\u0207\7g\2\2\u0207\u0208\7e\2\2\u0208"+
		"\u0209\7v\2\2\u0209\u020a\7g\2\2\u020a\u020b\7f\2\2\u020bF\3\2\2\2\u020c"+
		"\u020d\7r\2\2\u020d\u020e\7w\2\2\u020e\u020f\7d\2\2\u020f\u0210\7n\2\2"+
		"\u0210\u0211\7k\2\2\u0211\u0212\7e\2\2\u0212H\3\2\2\2\u0213\u0214\7t\2"+
		"\2\u0214\u0215\7g\2\2\u0215\u0216\7v\2\2\u0216\u0217\7w\2\2\u0217\u0218"+
		"\7t\2\2\u0218\u0219\7p\2\2\u0219J\3\2\2\2\u021a\u021b\7u\2\2\u021b\u021c"+
		"\7j\2\2\u021c\u021d\7q\2\2\u021d\u021e\7t\2\2\u021e\u021f\7v\2\2\u021f"+
		"L\3\2\2\2\u0220\u0221\7u\2\2\u0221\u0222\7v\2\2\u0222\u0223\7c\2\2\u0223"+
		"\u0224\7v\2\2\u0224\u0225\7k\2\2\u0225\u0226\7e\2\2\u0226N\3\2\2\2\u0227"+
		"\u0228\7u\2\2\u0228\u0229\7v\2\2\u0229\u022a\7t\2\2\u022a\u022b\7k\2\2"+
		"\u022b\u022c\7e\2\2\u022c\u022d\7v\2\2\u022d\u022e\7h\2\2\u022e\u022f"+
		"\7r\2\2\u022fP\3\2\2\2\u0230\u0231\7u\2\2\u0231\u0232\7w\2\2\u0232\u0233"+
		"\7r\2\2\u0233\u0234\7g\2\2\u0234\u0235\7t\2\2\u0235R\3\2\2\2\u0236\u0237"+
		"\7u\2\2\u0237\u0238\7y\2\2\u0238\u0239\7k\2\2\u0239\u023a\7v\2\2\u023a"+
		"\u023b\7e\2\2\u023b\u023c\7j\2\2\u023cT\3\2\2\2\u023d\u023e\7u\2\2\u023e"+
		"\u023f\7{\2\2\u023f\u0240\7p\2\2\u0240\u0241\7e\2\2\u0241\u0242\7j\2\2"+
		"\u0242\u0243\7t\2\2\u0243\u0244\7q\2\2\u0244\u0245\7p\2\2\u0245\u0246"+
		"\7k\2\2\u0246\u0247\7|\2\2\u0247\u0248\7g\2\2\u0248\u0249\7f\2\2\u0249"+
		"V\3\2\2\2\u024a\u024b\7v\2\2\u024b\u024c\7j\2\2\u024c\u024d\7k\2\2\u024d"+
		"\u024e\7u\2\2\u024eX\3\2\2\2\u024f\u0250\7v\2\2\u0250\u0251\7j\2\2\u0251"+
		"\u0252\7t\2\2\u0252\u0253\7q\2\2\u0253\u0254\7y\2\2\u0254Z\3\2\2\2\u0255"+
		"\u0256\7v\2\2\u0256\u0257\7j\2\2\u0257\u0258\7t\2\2\u0258\u0259\7q\2\2"+
		"\u0259\u025a\7y\2\2\u025a\u025b\7u\2\2\u025b\\\3\2\2\2\u025c\u025d\7v"+
		"\2\2\u025d\u025e\7t\2\2\u025e\u025f\7c\2\2\u025f\u0260\7p\2\2\u0260\u0261"+
		"\7u\2\2\u0261\u0262\7k\2\2\u0262\u0263\7g\2\2\u0263\u0264\7p\2\2\u0264"+
		"\u0265\7v\2\2\u0265^\3\2\2\2\u0266\u0267\7v\2\2\u0267\u0268\7t\2\2\u0268"+
		"\u0269\7{\2\2\u0269`\3\2\2\2\u026a\u026b\7x\2\2\u026b\u026c\7q\2\2\u026c"+
		"\u026d\7k\2\2\u026d\u026e\7f\2\2\u026eb\3\2\2\2\u026f\u0270\7x\2\2\u0270"+
		"\u0271\7q\2\2\u0271\u0272\7n\2\2\u0272\u0273\7c\2\2\u0273\u0274\7v\2\2"+
		"\u0274\u0275\7k\2\2\u0275\u0276\7n\2\2\u0276\u0277\7g\2\2\u0277d\3\2\2"+
		"\2\u0278\u0279\7y\2\2\u0279\u027a\7j\2\2\u027a\u027b\7k\2\2\u027b\u027c"+
		"\7n\2\2\u027c\u027d\7g\2\2\u027df\3\2\2\2\u027e\u0283\5i\65\2\u027f\u0283"+
		"\5k\66\2\u0280\u0283\5m\67\2\u0281\u0283\5o8\2\u0282\u027e\3\2\2\2\u0282"+
		"\u027f\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283h\3\2\2\2"+
		"\u0284\u0286\5s:\2\u0285\u0287\5q9\2\u0286\u0285\3\2\2\2\u0286\u0287\3"+
		"\2\2\2\u0287j\3\2\2\2\u0288\u028a\5\177@\2\u0289\u028b\5q9\2\u028a\u0289"+
		"\3\2\2\2\u028a\u028b\3\2\2\2\u028bl\3\2\2\2\u028c\u028e\5\u0087D\2\u028d"+
		"\u028f\5q9\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028fn\3\2\2\2\u0290"+
		"\u0292\5\u008fH\2\u0291\u0293\5q9\2\u0292\u0291\3\2\2\2\u0292\u0293\3"+
		"\2\2\2\u0293p\3\2\2\2\u0294\u0295\t\2\2\2\u0295r\3\2\2\2\u0296\u02a1\7"+
		"\62\2\2\u0297\u029e\5y=\2\u0298\u029a\5u;\2\u0299\u0298\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029f\3\2\2\2\u029b\u029c\5}?\2\u029c\u029d\5u;\2"+
		"\u029d\u029f\3\2\2\2\u029e\u0299\3\2\2\2\u029e\u029b\3\2\2\2\u029f\u02a1"+
		"\3\2\2\2\u02a0\u0296\3\2\2\2\u02a0\u0297\3\2\2\2\u02a1t\3\2\2\2\u02a2"+
		"\u02aa\5w<\2\u02a3\u02a5\5{>\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2"+
		"\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a9\u02ab\5w<\2\u02aa\u02a6\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"v\3\2\2\2\u02ac\u02af\7\62\2\2\u02ad\u02af\5y=\2\u02ae\u02ac\3\2\2\2\u02ae"+
		"\u02ad\3\2\2\2\u02afx\3\2\2\2\u02b0\u02b1\t\3\2\2\u02b1z\3\2\2\2\u02b2"+
		"\u02b5\5w<\2\u02b3\u02b5\7a\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2"+
		"\2\u02b5|\3\2\2\2\u02b6\u02b8\7a\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02b9\3"+
		"\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba~\3\2\2\2\u02bb\u02bc"+
		"\7\62\2\2\u02bc\u02bd\t\4\2\2\u02bd\u02be\5\u0081A\2\u02be\u0080\3\2\2"+
		"\2\u02bf\u02c7\5\u0083B\2\u02c0\u02c2\5\u0085C\2\u02c1\u02c0\3\2\2\2\u02c2"+
		"\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2"+
		"\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c8\5\u0083B\2\u02c7\u02c3\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u0082\3\2\2\2\u02c9\u02ca\t\5\2\2\u02ca\u0084\3\2"+
		"\2\2\u02cb\u02ce\5\u0083B\2\u02cc\u02ce\7a\2\2\u02cd\u02cb\3\2\2\2\u02cd"+
		"\u02cc\3\2\2\2\u02ce\u0086\3\2\2\2\u02cf\u02d1\7\62\2\2\u02d0\u02d2\5"+
		"}?\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u02d4\5\u0089E\2\u02d4\u0088\3\2\2\2\u02d5\u02dd\5\u008bF\2\u02d6\u02d8"+
		"\5\u008dG\2\u02d7\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2"+
		"\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02de"+
		"\5\u008bF\2\u02dd\u02d9\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u008a\3\2\2"+
		"\2\u02df\u02e0\t\6\2\2\u02e0\u008c\3\2\2\2\u02e1\u02e4\5\u008bF\2\u02e2"+
		"\u02e4\7a\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e4\u008e\3\2"+
		"\2\2\u02e5\u02e6\7\62\2\2\u02e6\u02e7\t\7\2\2\u02e7\u02e8\5\u0091I\2\u02e8"+
		"\u0090\3\2\2\2\u02e9\u02f1\5\u0093J\2\u02ea\u02ec\5\u0095K\2\u02eb\u02ea"+
		"\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f2\5\u0093J\2\u02f1\u02ed"+
		"\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u0092\3\2\2\2\u02f3\u02f4\t\b\2\2\u02f4"+
		"\u0094\3\2\2\2\u02f5\u02f8\5\u0093J\2\u02f6\u02f8\7a\2\2\u02f7\u02f5\3"+
		"\2\2\2\u02f7\u02f6\3\2\2\2\u02f8\u0096\3\2\2\2\u02f9\u02fc\5\u0099M\2"+
		"\u02fa\u02fc\5\u00a5S\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc"+
		"\u0098\3\2\2\2\u02fd\u02fe\5u;\2\u02fe\u0300\7\60\2\2\u02ff\u0301\5u;"+
		"\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u0304"+
		"\5\u009bN\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\3\2\2"+
		"\2\u0305\u0307\5\u00a3R\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0319\3\2\2\2\u0308\u0309\7\60\2\2\u0309\u030b\5u;\2\u030a\u030c\5\u009b"+
		"N\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d"+
		"\u030f\5\u00a3R\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0319"+
		"\3\2\2\2\u0310\u0311\5u;\2\u0311\u0313\5\u009bN\2\u0312\u0314\5\u00a3"+
		"R\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0319\3\2\2\2\u0315"+
		"\u0316\5u;\2\u0316\u0317\5\u00a3R\2\u0317\u0319\3\2\2\2\u0318\u02fd\3"+
		"\2\2\2\u0318\u0308\3\2\2\2\u0318\u0310\3\2\2\2\u0318\u0315\3\2\2\2\u0319"+
		"\u009a\3\2\2\2\u031a\u031b\5\u009dO\2\u031b\u031c\5\u009fP\2\u031c\u009c"+
		"\3\2\2\2\u031d\u031e\t\t\2\2\u031e\u009e\3\2\2\2\u031f\u0321\5\u00a1Q"+
		"\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323"+
		"\5u;\2\u0323\u00a0\3\2\2\2\u0324\u0325\t\n\2\2\u0325\u00a2\3\2\2\2\u0326"+
		"\u0327\t\13\2\2\u0327\u00a4\3\2\2\2\u0328\u0329\5\u00a7T\2\u0329\u032b"+
		"\5\u00a9U\2\u032a\u032c\5\u00a3R\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2"+
		"\2\2\u032c\u00a6\3\2\2\2\u032d\u032f\5\177@\2\u032e\u0330\7\60\2\2\u032f"+
		"\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0339\3\2\2\2\u0331\u0332\7\62"+
		"\2\2\u0332\u0334\t\4\2\2\u0333\u0335\5\u0081A\2\u0334\u0333\3\2\2\2\u0334"+
		"\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7\60\2\2\u0337\u0339\5"+
		"\u0081A\2\u0338\u032d\3\2\2\2\u0338\u0331\3\2\2\2\u0339\u00a8\3\2\2\2"+
		"\u033a\u033b\5\u00abV\2\u033b\u033c\5\u009fP\2\u033c\u00aa\3\2\2\2\u033d"+
		"\u033e\t\f\2\2\u033e\u00ac\3\2\2\2\u033f\u0340\7v\2\2\u0340\u0341\7t\2"+
		"\2\u0341\u0342\7w\2\2\u0342\u0349\7g\2\2\u0343\u0344\7h\2\2\u0344\u0345"+
		"\7c\2\2\u0345\u0346\7n\2\2\u0346\u0347\7u\2\2\u0347\u0349\7g\2\2\u0348"+
		"\u033f\3\2\2\2\u0348\u0343\3\2\2\2\u0349\u00ae\3\2\2\2\u034a\u034b\7)"+
		"\2\2\u034b\u034c\5\u00b1Y\2\u034c\u034d\7)\2\2\u034d\u0353\3\2\2\2\u034e"+
		"\u034f\7)\2\2\u034f\u0350\5\u00b9]\2\u0350\u0351\7)\2\2\u0351\u0353\3"+
		"\2\2\2\u0352\u034a\3\2\2\2\u0352\u034e\3\2\2\2\u0353\u00b0\3\2\2\2\u0354"+
		"\u0355\n\r\2\2\u0355\u00b2\3\2\2\2\u0356\u0358\7$\2\2\u0357\u0359\5\u00b5"+
		"[\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035b\7$\2\2\u035b\u00b4\3\2\2\2\u035c\u035e\5\u00b7\\\2\u035d\u035c"+
		"\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u00b6\3\2\2\2\u0361\u0364\n\16\2\2\u0362\u0364\5\u00b9]\2\u0363\u0361"+
		"\3\2\2\2\u0363\u0362\3\2\2\2\u0364\u00b8\3\2\2\2\u0365\u0366\7^\2\2\u0366"+
		"\u036a\t\17\2\2\u0367\u036a\5\u00bb^\2\u0368\u036a\5\u00bd_\2\u0369\u0365"+
		"\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036a\u00ba\3\2\2\2\u036b"+
		"\u036c\7^\2\2\u036c\u0377\5\u008bF\2\u036d\u036e\7^\2\2\u036e\u036f\5"+
		"\u008bF\2\u036f\u0370\5\u008bF\2\u0370\u0377\3\2\2\2\u0371\u0372\7^\2"+
		"\2\u0372\u0373\5\u00bf`\2\u0373\u0374\5\u008bF\2\u0374\u0375\5\u008bF"+
		"\2\u0375\u0377\3\2\2\2\u0376\u036b\3\2\2\2\u0376\u036d\3\2\2\2\u0376\u0371"+
		"\3\2\2\2\u0377\u00bc\3\2\2\2\u0378\u0379\7^\2\2\u0379\u037a\7w\2\2\u037a"+
		"\u037b\5\u0083B\2\u037b\u037c\5\u0083B\2\u037c\u037d\5\u0083B\2\u037d"+
		"\u037e\5\u0083B\2\u037e\u00be\3\2\2\2\u037f\u0380\t\20\2\2\u0380\u00c0"+
		"\3\2\2\2\u0381\u0382\7p\2\2\u0382\u0383\7w\2\2\u0383\u0384\7n\2\2\u0384"+
		"\u0385\7n\2\2\u0385\u00c2\3\2\2\2\u0386\u0387\7*\2\2\u0387\u00c4\3\2\2"+
		"\2\u0388\u0389\7+\2\2\u0389\u00c6\3\2\2\2\u038a\u038b\7}\2\2\u038b\u00c8"+
		"\3\2\2\2\u038c\u038d\7\177\2\2\u038d\u00ca\3\2\2\2\u038e\u038f\7]\2\2"+
		"\u038f\u00cc\3\2\2\2\u0390\u0391\7_\2\2\u0391\u00ce\3\2\2\2\u0392\u0393"+
		"\7=\2\2\u0393\u00d0\3\2\2\2\u0394\u0395\7.\2\2\u0395\u00d2\3\2\2\2\u0396"+
		"\u0397\7\60\2\2\u0397\u00d4\3\2\2\2\u0398\u0399\7?\2\2\u0399\u00d6\3\2"+
		"\2\2\u039a\u039b\7@\2\2\u039b\u00d8\3\2\2\2\u039c\u039d\7>\2\2\u039d\u00da"+
		"\3\2\2\2\u039e\u039f\7#\2\2\u039f\u00dc\3\2\2\2\u03a0\u03a1\7\u0080\2"+
		"\2\u03a1\u00de\3\2\2\2\u03a2\u03a3\7A\2\2\u03a3\u00e0\3\2\2\2\u03a4\u03a5"+
		"\7<\2\2\u03a5\u00e2\3\2\2\2\u03a6\u03a7\7?\2\2\u03a7\u03a8\7?\2\2\u03a8"+
		"\u00e4\3\2\2\2\u03a9\u03aa\7>\2\2\u03aa\u03ab\7?\2\2\u03ab\u00e6\3\2\2"+
		"\2\u03ac\u03ad\7@\2\2\u03ad\u03ae\7?\2\2\u03ae\u00e8\3\2\2\2\u03af\u03b0"+
		"\7#\2\2\u03b0\u03b1\7?\2\2\u03b1\u00ea\3\2\2\2\u03b2\u03b3\7(\2\2\u03b3"+
		"\u03b4\7(\2\2\u03b4\u00ec\3\2\2\2\u03b5\u03b6\7~\2\2\u03b6\u03b7\7~\2"+
		"\2\u03b7\u00ee\3\2\2\2\u03b8\u03b9\7-\2\2\u03b9\u03ba\7-\2\2\u03ba\u00f0"+
		"\3\2\2\2\u03bb\u03bc\7/\2\2\u03bc\u03bd\7/\2\2\u03bd\u00f2\3\2\2\2\u03be"+
		"\u03bf\7-\2\2\u03bf\u00f4\3\2\2\2\u03c0\u03c1\7/\2\2\u03c1\u00f6\3\2\2"+
		"\2\u03c2\u03c3\7,\2\2\u03c3\u00f8\3\2\2\2\u03c4\u03c5\7\61\2\2\u03c5\u00fa"+
		"\3\2\2\2\u03c6\u03c7\7(\2\2\u03c7\u00fc\3\2\2\2\u03c8\u03c9\7~\2\2\u03c9"+
		"\u00fe\3\2\2\2\u03ca\u03cb\7`\2\2\u03cb\u0100\3\2\2\2\u03cc\u03cd\7\'"+
		"\2\2\u03cd\u0102\3\2\2\2\u03ce\u03cf\7-\2\2\u03cf\u03d0\7?\2\2\u03d0\u0104"+
		"\3\2\2\2\u03d1\u03d2\7/\2\2\u03d2\u03d3\7?\2\2\u03d3\u0106\3\2\2\2\u03d4"+
		"\u03d5\7,\2\2\u03d5\u03d6\7?\2\2\u03d6\u0108\3\2\2\2\u03d7\u03d8\7\61"+
		"\2\2\u03d8\u03d9\7?\2\2\u03d9\u010a\3\2\2\2\u03da\u03db\7(\2\2\u03db\u03dc"+
		"\7?\2\2\u03dc\u010c\3\2\2\2\u03dd\u03de\7~\2\2\u03de\u03df\7?\2\2\u03df"+
		"\u010e\3\2\2\2\u03e0\u03e1\7`\2\2\u03e1\u03e2\7?\2\2\u03e2\u0110\3\2\2"+
		"\2\u03e3\u03e4\7\'\2\2\u03e4\u03e5\7?\2\2\u03e5\u0112\3\2\2\2\u03e6\u03e7"+
		"\7>\2\2\u03e7\u03e8\7>\2\2\u03e8\u03e9\7?\2\2\u03e9\u0114\3\2\2\2\u03ea"+
		"\u03eb\7@\2\2\u03eb\u03ec\7@\2\2\u03ec\u03ed\7?\2\2\u03ed\u0116\3\2\2"+
		"\2\u03ee\u03ef\7@\2\2\u03ef\u03f0\7@\2\2\u03f0\u03f1\7@\2\2\u03f1\u03f2"+
		"\7?\2\2\u03f2\u0118\3\2\2\2\u03f3\u03f7\5\u011b\u008e\2\u03f4\u03f6\5"+
		"\u011d\u008f\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2"+
		"\2\2\u03f7\u03f8\3\2\2\2\u03f8\u011a\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa"+
		"\u0401\t\21\2\2\u03fb\u03fc\n\22\2\2\u03fc\u0401\6\u008e\2\2\u03fd\u03fe"+
		"\t\23\2\2\u03fe\u03ff\t\24\2\2\u03ff\u0401\6\u008e\3\2\u0400\u03fa\3\2"+
		"\2\2\u0400\u03fb\3\2\2\2\u0400\u03fd\3\2\2\2\u0401\u011c\3\2\2\2\u0402"+
		"\u0409\t\25\2\2\u0403\u0404\n\22\2\2\u0404\u0409\6\u008f\4\2\u0405\u0406"+
		"\t\23\2\2\u0406\u0407\t\24\2\2\u0407\u0409\6\u008f\5\2\u0408\u0402\3\2"+
		"\2\2\u0408\u0403\3\2\2\2\u0408\u0405\3\2\2\2\u0409\u011e\3\2\2\2\u040a"+
		"\u040b\7B\2\2\u040b\u0120\3\2\2\2\u040c\u040d\7\60\2\2\u040d\u040e\7\60"+
		"\2\2\u040e\u040f\7\60\2\2\u040f\u0122\3\2\2\2\u0410\u0412\t\26\2\2\u0411"+
		"\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2"+
		"\2\2\u0414\u0415\3\2\2\2\u0415\u0416\b\u0092\2\2\u0416\u0124\3\2\2\2\u0417"+
		"\u0419\t\27\2\2\u0418\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u0418\3"+
		"\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\b\u0093\3\2"+
		"\u041d\u0126\3\2\2\2\u041e\u041f\7\61\2\2\u041f\u0420\7,\2\2\u0420\u0424"+
		"\3\2\2\2\u0421\u0423\13\2\2\2\u0422\u0421\3\2\2\2\u0423\u0426\3\2\2\2"+
		"\u0424\u0425\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0424"+
		"\3\2\2\2\u0427\u0428\7,\2\2\u0428\u0429\7\61\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042b\b\u0094\4\2\u042b\u0128\3\2\2\2\u042c\u042d\7\61\2\2\u042d\u042e"+
		"\7\61\2\2\u042e\u0432\3\2\2\2\u042f\u0431\n\30\2\2\u0430\u042f\3\2\2\2"+
		"\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0435"+
		"\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\b\u0095\5\2\u0436\u012a\3\2\2"+
		"\2\65\2\u0282\u0286\u028a\u028e\u0292\u0299\u029e\u02a0\u02a6\u02aa\u02ae"+
		"\u02b4\u02b9\u02c3\u02c7\u02cd\u02d1\u02d9\u02dd\u02e3\u02ed\u02f1\u02f7"+
		"\u02fb\u0300\u0303\u0306\u030b\u030e\u0313\u0318\u0320\u032b\u032f\u0334"+
		"\u0338\u0348\u0352\u0358\u035f\u0363\u0369\u0376\u03f7\u0400\u0408\u0413"+
		"\u041a\u0424\u0432\6\3\u0092\2\3\u0093\3\3\u0094\4\3\u0095\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}