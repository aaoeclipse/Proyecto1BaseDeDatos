// Generated from DATABASE.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DATABASELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, CREATE=13, DATABASE=14, DATABASES=15, ALTER=16, 
		RENAMETO=17, DROP=18, SHOW=19, USE=20, TABLE=21, INT=22, FLOAT=23, DATE=24, 
		CHAR=25, CONSTRAINT=26, PRIMARY=27, KEY=28, FOREIGN=29, CHECK=30, REFERENCES=31, 
		TABLES=32, COLUMN=33, COLUMNS=34, FROM=35, ADD=36, AND=37, OR=38, NOT=39, 
		INSERT=40, INTO=41, WHERE=42, UPDATE=43, SET=44, DELETE=45, SELECT=46, 
		ORDER=47, BY=48, ASC=49, NULL=50, DESC=51, VALUES=52, WS=53, DATE_VAL=54, 
		NUM=55, ID=56, CHAR_VAL=57, FLOAT_VAL=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "CREATE", "DATABASE", "DATABASES", "ALTER", 
		"RENAMETO", "DROP", "SHOW", "USE", "TABLE", "INT", "FLOAT", "DATE", "CHAR", 
		"CONSTRAINT", "PRIMARY", "KEY", "FOREIGN", "CHECK", "REFERENCES", "TABLES", 
		"COLUMN", "COLUMNS", "FROM", "ADD", "AND", "OR", "NOT", "INSERT", "INTO", 
		"WHERE", "UPDATE", "SET", "DELETE", "SELECT", "ORDER", "BY", "ASC", "NULL", 
		"DESC", "VALUES", "LETTER", "DIGIT", "WS", "DATE_VAL", "NUM", "ID", "CHAR_VAL", 
		"FLOAT_VAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'.'", "'<'", "'>'", "'<='", "'>='", "'='", 
		"'<>'", "';'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "CREATE", "DATABASE", "DATABASES", "ALTER", "RENAMETO", "DROP", 
		"SHOW", "USE", "TABLE", "INT", "FLOAT", "DATE", "CHAR", "CONSTRAINT", 
		"PRIMARY", "KEY", "FOREIGN", "CHECK", "REFERENCES", "TABLES", "COLUMN", 
		"COLUMNS", "FROM", "ADD", "AND", "OR", "NOT", "INSERT", "INTO", "WHERE", 
		"UPDATE", "SET", "DELETE", "SELECT", "ORDER", "BY", "ASC", "NULL", "DESC", 
		"VALUES", "WS", "DATE_VAL", "NUM", "ID", "CHAR_VAL", "FLOAT_VAL"
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


	public DATABASELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DATABASE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2<\u0382\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a9"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c3\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00e0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00f1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u010e\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011c\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u012a\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0135\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0146\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0151\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0162\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0170"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u017e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u019e\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01b5\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01c0"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01d7\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01e8"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0208\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u021c\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0230\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0247\n#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u0255\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0260"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u026b\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u0273\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u027e\n(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0292\n)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u02a0\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\5+\u02b1\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5"+
		",\u02c5\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02d0\n-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02e4\n.\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02f8\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0309\n\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u0311\n\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u031c\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u032a\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u0338\n\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u034c"+
		"\n\65\3\66\3\66\3\67\3\67\38\68\u0353\n8\r8\168\u0354\38\38\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\3:\3:\7:\u0368\n:\f:\16:\u036b\13:\3;\3;"+
		"\3;\3;\7;\u0371\n;\f;\16;\u0374\13;\3<\3<\7<\u0378\n<\f<\16<\u037b\13"+
		"<\3<\3<\3=\3=\3=\3=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\2m\2o\67q8s9u:w;y<\3\2\6\4\2C\\c|\5\2\13\f\16\17\"\""+
		"\4\2//aa\5\2\f\f\17\17))\u03d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3"+
		"\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u008a\3\2\2\2\23\u008d\3\2"+
		"\2\2\25\u008f\3\2\2\2\27\u0092\3\2\2\2\31\u0094\3\2\2\2\33\u00a8\3\2\2"+
		"\2\35\u00c2\3\2\2\2\37\u00df\3\2\2\2!\u00f0\3\2\2\2#\u010d\3\2\2\2%\u011b"+
		"\3\2\2\2\'\u0129\3\2\2\2)\u0134\3\2\2\2+\u0145\3\2\2\2-\u0150\3\2\2\2"+
		"/\u0161\3\2\2\2\61\u016f\3\2\2\2\63\u017d\3\2\2\2\65\u019d\3\2\2\2\67"+
		"\u01b4\3\2\2\29\u01bf\3\2\2\2;\u01d6\3\2\2\2=\u01e7\3\2\2\2?\u0207\3\2"+
		"\2\2A\u021b\3\2\2\2C\u022f\3\2\2\2E\u0246\3\2\2\2G\u0254\3\2\2\2I\u025f"+
		"\3\2\2\2K\u026a\3\2\2\2M\u0272\3\2\2\2O\u027d\3\2\2\2Q\u0291\3\2\2\2S"+
		"\u029f\3\2\2\2U\u02b0\3\2\2\2W\u02c4\3\2\2\2Y\u02cf\3\2\2\2[\u02e3\3\2"+
		"\2\2]\u02f7\3\2\2\2_\u0308\3\2\2\2a\u0310\3\2\2\2c\u031b\3\2\2\2e\u0329"+
		"\3\2\2\2g\u0337\3\2\2\2i\u034b\3\2\2\2k\u034d\3\2\2\2m\u034f\3\2\2\2o"+
		"\u0352\3\2\2\2q\u0358\3\2\2\2s\u0365\3\2\2\2u\u036c\3\2\2\2w\u0375\3\2"+
		"\2\2y\u037e\3\2\2\2{|\7*\2\2|\4\3\2\2\2}~\7.\2\2~\6\3\2\2\2\177\u0080"+
		"\7+\2\2\u0080\b\3\2\2\2\u0081\u0082\7\60\2\2\u0082\n\3\2\2\2\u0083\u0084"+
		"\7>\2\2\u0084\f\3\2\2\2\u0085\u0086\7@\2\2\u0086\16\3\2\2\2\u0087\u0088"+
		"\7>\2\2\u0088\u0089\7?\2\2\u0089\20\3\2\2\2\u008a\u008b\7@\2\2\u008b\u008c"+
		"\7?\2\2\u008c\22\3\2\2\2\u008d\u008e\7?\2\2\u008e\24\3\2\2\2\u008f\u0090"+
		"\7>\2\2\u0090\u0091\7@\2\2\u0091\26\3\2\2\2\u0092\u0093\7=\2\2\u0093\30"+
		"\3\2\2\2\u0094\u0095\7,\2\2\u0095\32\3\2\2\2\u0096\u0097\7e\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\u009a\7c\2\2\u009a\u009b\7v\2\2"+
		"\u009b\u00a9\7g\2\2\u009c\u009d\7E\2\2\u009d\u009e\7T\2\2\u009e\u009f"+
		"\7G\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7V\2\2\u00a1\u00a9\7G\2\2\u00a2"+
		"\u00a3\7E\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2"+
		"\u00a6\u00a7\7v\2\2\u00a7\u00a9\7g\2\2\u00a8\u0096\3\2\2\2\u00a8\u009c"+
		"\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7d\2\2"+
		"\u00af\u00b0\7c\2\2\u00b0\u00b1\7u\2\2\u00b1\u00c3\7g\2\2\u00b2\u00b3"+
		"\7F\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7V\2\2\u00b5\u00b6\7C\2\2\u00b6"+
		"\u00b7\7D\2\2\u00b7\u00b8\7C\2\2\u00b8\u00b9\7U\2\2\u00b9\u00c3\7G\2\2"+
		"\u00ba\u00bb\7F\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be"+
		"\7c\2\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c3\7g\2\2\u00c2\u00aa\3\2\2\2\u00c2\u00b2\3\2\2\2\u00c2\u00ba\3\2"+
		"\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7"+
		"\7v\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\u00e0\7u\2\2\u00cd\u00ce\7F\2\2"+
		"\u00ce\u00cf\7C\2\2\u00cf\u00d0\7V\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2"+
		"\7D\2\2\u00d2\u00d3\7C\2\2\u00d3\u00d4\7U\2\2\u00d4\u00d5\7G\2\2\u00d5"+
		"\u00e0\7U\2\2\u00d6\u00d7\7F\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9\u00da\7c\2\2\u00da\u00db\7d\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00de\7g\2\2\u00de\u00e0\7u\2\2\u00df\u00c4\3\2\2\2\u00df"+
		"\u00cd\3\2\2\2\u00df\u00d6\3\2\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7c\2\2\u00e2"+
		"\u00e3\7n\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00f1\7t\2\2"+
		"\u00e6\u00e7\7C\2\2\u00e7\u00e8\7N\2\2\u00e8\u00e9\7V\2\2\u00e9\u00ea"+
		"\7G\2\2\u00ea\u00f1\7T\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7n\2\2\u00ed"+
		"\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f1\7t\2\2\u00f0\u00e1\3\2\2"+
		"\2\u00f0\u00e6\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1\"\3\2\2\2\u00f2\u00f3"+
		"\7T\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5\7P\2\2\u00f5\u00f6\7C\2\2\u00f6"+
		"\u00f7\7O\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\7V\2"+
		"\2\u00fa\u010e\7Q\2\2\u00fb\u00fc\7T\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe"+
		"\7p\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7g\2\2\u0101"+
		"\u0102\7\"\2\2\u0102\u0103\7V\2\2\u0103\u010e\7q\2\2\u0104\u0105\7t\2"+
		"\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107\u0108\7c\2\2\u0108\u0109"+
		"\7o\2\2\u0109\u010a\7g\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010e\7q\2\2\u010d\u00f2\3\2\2\2\u010d\u00fb\3\2\2\2\u010d\u0104\3\2"+
		"\2\2\u010e$\3\2\2\2\u010f\u0110\7f\2\2\u0110\u0111\7t\2\2\u0111\u0112"+
		"\7q\2\2\u0112\u011c\7r\2\2\u0113\u0114\7F\2\2\u0114\u0115\7T\2\2\u0115"+
		"\u0116\7Q\2\2\u0116\u011c\7R\2\2\u0117\u0118\7F\2\2\u0118\u0119\7t\2\2"+
		"\u0119\u011a\7q\2\2\u011a\u011c\7r\2\2\u011b\u010f\3\2\2\2\u011b\u0113"+
		"\3\2\2\2\u011b\u0117\3\2\2\2\u011c&\3\2\2\2\u011d\u011e\7u\2\2\u011e\u011f"+
		"\7j\2\2\u011f\u0120\7q\2\2\u0120\u012a\7y\2\2\u0121\u0122\7U\2\2\u0122"+
		"\u0123\7J\2\2\u0123\u0124\7Q\2\2\u0124\u012a\7Y\2\2\u0125\u0126\7U\2\2"+
		"\u0126\u0127\7j\2\2\u0127\u0128\7q\2\2\u0128\u012a\7y\2\2\u0129\u011d"+
		"\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u0125\3\2\2\2\u012a(\3\2\2\2\u012b"+
		"\u012c\7w\2\2\u012c\u012d\7u\2\2\u012d\u0135\7g\2\2\u012e\u012f\7W\2\2"+
		"\u012f\u0130\7U\2\2\u0130\u0135\7G\2\2\u0131\u0132\7W\2\2\u0132\u0133"+
		"\7u\2\2\u0133\u0135\7g\2\2\u0134\u012b\3\2\2\2\u0134\u012e\3\2\2\2\u0134"+
		"\u0131\3\2\2\2\u0135*\3\2\2\2\u0136\u0137\7V\2\2\u0137\u0138\7C\2\2\u0138"+
		"\u0139\7D\2\2\u0139\u013a\7N\2\2\u013a\u0146\7G\2\2\u013b\u013c\7V\2\2"+
		"\u013c\u013d\7c\2\2\u013d\u013e\7d\2\2\u013e\u013f\7n\2\2\u013f\u0146"+
		"\7g\2\2\u0140\u0141\7v\2\2\u0141\u0142\7c\2\2\u0142\u0143\7d\2\2\u0143"+
		"\u0144\7n\2\2\u0144\u0146\7g\2\2\u0145\u0136\3\2\2\2\u0145\u013b\3\2\2"+
		"\2\u0145\u0140\3\2\2\2\u0146,\3\2\2\2\u0147\u0148\7k\2\2\u0148\u0149\7"+
		"p\2\2\u0149\u0151\7v\2\2\u014a\u014b\7K\2\2\u014b\u014c\7P\2\2\u014c\u0151"+
		"\7V\2\2\u014d\u014e\7K\2\2\u014e\u014f\7p\2\2\u014f\u0151\7v\2\2\u0150"+
		"\u0147\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014d\3\2\2\2\u0151.\3\2\2\2"+
		"\u0152\u0153\7H\2\2\u0153\u0154\7N\2\2\u0154\u0155\7Q\2\2\u0155\u0156"+
		"\7C\2\2\u0156\u0162\7V\2\2\u0157\u0158\7H\2\2\u0158\u0159\7n\2\2\u0159"+
		"\u015a\7q\2\2\u015a\u015b\7c\2\2\u015b\u0162\7v\2\2\u015c\u015d\7h\2\2"+
		"\u015d\u015e\7n\2\2\u015e\u015f\7q\2\2\u015f\u0160\7c\2\2\u0160\u0162"+
		"\7v\2\2\u0161\u0152\3\2\2\2\u0161\u0157\3\2\2\2\u0161\u015c\3\2\2\2\u0162"+
		"\60\3\2\2\2\u0163\u0164\7F\2\2\u0164\u0165\7C\2\2\u0165\u0166\7V\2\2\u0166"+
		"\u0170\7G\2\2\u0167\u0168\7F\2\2\u0168\u0169\7c\2\2\u0169\u016a\7v\2\2"+
		"\u016a\u0170\7g\2\2\u016b\u016c\7f\2\2\u016c\u016d\7c\2\2\u016d\u016e"+
		"\7v\2\2\u016e\u0170\7g\2\2\u016f\u0163\3\2\2\2\u016f\u0167\3\2\2\2\u016f"+
		"\u016b\3\2\2\2\u0170\62\3\2\2\2\u0171\u0172\7E\2\2\u0172\u0173\7J\2\2"+
		"\u0173\u0174\7C\2\2\u0174\u017e\7T\2\2\u0175\u0176\7E\2\2\u0176\u0177"+
		"\7j\2\2\u0177\u0178\7c\2\2\u0178\u017e\7t\2\2\u0179\u017a\7e\2\2\u017a"+
		"\u017b\7j\2\2\u017b\u017c\7c\2\2\u017c\u017e\7t\2\2\u017d\u0171\3\2\2"+
		"\2\u017d\u0175\3\2\2\2\u017d\u0179\3\2\2\2\u017e\64\3\2\2\2\u017f\u0180"+
		"\7E\2\2\u0180\u0181\7Q\2\2\u0181\u0182\7P\2\2\u0182\u0183\7U\2\2\u0183"+
		"\u0184\7V\2\2\u0184\u0185\7T\2\2\u0185\u0186\7C\2\2\u0186\u0187\7K\2\2"+
		"\u0187\u0188\7P\2\2\u0188\u019e\7V\2\2\u0189\u018a\7E\2\2\u018a\u018b"+
		"\7q\2\2\u018b\u018c\7p\2\2\u018c\u018d\7u\2\2\u018d\u018e\7v\2\2\u018e"+
		"\u018f\7t\2\2\u018f\u0190\7c\2\2\u0190\u0191\7k\2\2\u0191\u0192\7p\2\2"+
		"\u0192\u019e\7v\2\2\u0193\u0194\7e\2\2\u0194\u0195\7q\2\2\u0195\u0196"+
		"\7p\2\2\u0196\u0197\7u\2\2\u0197\u0198\7v\2\2\u0198\u0199\7t\2\2\u0199"+
		"\u019a\7c\2\2\u019a\u019b\7k\2\2\u019b\u019c\7p\2\2\u019c\u019e\7v\2\2"+
		"\u019d\u017f\3\2\2\2\u019d\u0189\3\2\2\2\u019d\u0193\3\2\2\2\u019e\66"+
		"\3\2\2\2\u019f\u01a0\7R\2\2\u01a0\u01a1\7T\2\2\u01a1\u01a2\7K\2\2\u01a2"+
		"\u01a3\7O\2\2\u01a3\u01a4\7C\2\2\u01a4\u01a5\7T\2\2\u01a5\u01b5\7[\2\2"+
		"\u01a6\u01a7\7R\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa"+
		"\7o\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7t\2\2\u01ac\u01b5\7{\2\2\u01ad"+
		"\u01ae\7r\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1\7o\2\2"+
		"\u01b1\u01b2\7c\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b5\7{\2\2\u01b4\u019f"+
		"\3\2\2\2\u01b4\u01a6\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b58\3\2\2\2\u01b6"+
		"\u01b7\7M\2\2\u01b7\u01b8\7G\2\2\u01b8\u01c0\7[\2\2\u01b9\u01ba\7M\2\2"+
		"\u01ba\u01bb\7g\2\2\u01bb\u01c0\7{\2\2\u01bc\u01bd\7m\2\2\u01bd\u01be"+
		"\7g\2\2\u01be\u01c0\7{\2\2\u01bf\u01b6\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf"+
		"\u01bc\3\2\2\2\u01c0:\3\2\2\2\u01c1\u01c2\7H\2\2\u01c2\u01c3\7Q\2\2\u01c3"+
		"\u01c4\7T\2\2\u01c4\u01c5\7G\2\2\u01c5\u01c6\7K\2\2\u01c6\u01c7\7I\2\2"+
		"\u01c7\u01d7\7P\2\2\u01c8\u01c9\7H\2\2\u01c9\u01ca\7q\2\2\u01ca\u01cb"+
		"\7t\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce\7i\2\2\u01ce"+
		"\u01d7\7p\2\2\u01cf\u01d0\7h\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7t\2\2"+
		"\u01d2\u01d3\7g\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7i\2\2\u01d5\u01d7"+
		"\7p\2\2\u01d6\u01c1\3\2\2\2\u01d6\u01c8\3\2\2\2\u01d6\u01cf\3\2\2\2\u01d7"+
		"<\3\2\2\2\u01d8\u01d9\7E\2\2\u01d9\u01da\7J\2\2\u01da\u01db\7G\2\2\u01db"+
		"\u01dc\7E\2\2\u01dc\u01e8\7M\2\2\u01dd\u01de\7E\2\2\u01de\u01df\7j\2\2"+
		"\u01df\u01e0\7g\2\2\u01e0\u01e1\7e\2\2\u01e1\u01e8\7m\2\2\u01e2\u01e3"+
		"\7e\2\2\u01e3\u01e4\7j\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7e\2\2\u01e6"+
		"\u01e8\7m\2\2\u01e7\u01d8\3\2\2\2\u01e7\u01dd\3\2\2\2\u01e7\u01e2\3\2"+
		"\2\2\u01e8>\3\2\2\2\u01e9\u01ea\7T\2\2\u01ea\u01eb\7G\2\2\u01eb\u01ec"+
		"\7H\2\2\u01ec\u01ed\7G\2\2\u01ed\u01ee\7T\2\2\u01ee\u01ef\7G\2\2\u01ef"+
		"\u01f0\7P\2\2\u01f0\u01f1\7E\2\2\u01f1\u01f2\7G\2\2\u01f2\u0208\7U\2\2"+
		"\u01f3\u01f4\7T\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7h\2\2\u01f6\u01f7"+
		"\7g\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7p\2\2\u01fa"+
		"\u01fb\7e\2\2\u01fb\u01fc\7g\2\2\u01fc\u0208\7u\2\2\u01fd\u01fe\7t\2\2"+
		"\u01fe\u01ff\7g\2\2\u01ff\u0200\7h\2\2\u0200\u0201\7g\2\2\u0201\u0202"+
		"\7t\2\2\u0202\u0203\7g\2\2\u0203\u0204\7p\2\2\u0204\u0205\7e\2\2\u0205"+
		"\u0206\7g\2\2\u0206\u0208\7u\2\2\u0207\u01e9\3\2\2\2\u0207\u01f3\3\2\2"+
		"\2\u0207\u01fd\3\2\2\2\u0208@\3\2\2\2\u0209\u020a\7V\2\2\u020a\u020b\7"+
		"C\2\2\u020b\u020c\7D\2\2\u020c\u020d\7N\2\2\u020d\u020e\7G\2\2\u020e\u021c"+
		"\7U\2\2\u020f\u0210\7V\2\2\u0210\u0211\7c\2\2\u0211\u0212\7d\2\2\u0212"+
		"\u0213\7n\2\2\u0213\u0214\7g\2\2\u0214\u021c\7u\2\2\u0215\u0216\7v\2\2"+
		"\u0216\u0217\7c\2\2\u0217\u0218\7d\2\2\u0218\u0219\7n\2\2\u0219\u021a"+
		"\7g\2\2\u021a\u021c\7u\2\2\u021b\u0209\3\2\2\2\u021b\u020f\3\2\2\2\u021b"+
		"\u0215\3\2\2\2\u021cB\3\2\2\2\u021d\u021e\7E\2\2\u021e\u021f\7Q\2\2\u021f"+
		"\u0220\7N\2\2\u0220\u0221\7W\2\2\u0221\u0222\7O\2\2\u0222\u0230\7P\2\2"+
		"\u0223\u0224\7E\2\2\u0224\u0225\7q\2\2\u0225\u0226\7n\2\2\u0226\u0227"+
		"\7w\2\2\u0227\u0228\7o\2\2\u0228\u0230\7p\2\2\u0229\u022a\7e\2\2\u022a"+
		"\u022b\7q\2\2\u022b\u022c\7n\2\2\u022c\u022d\7w\2\2\u022d\u022e\7o\2\2"+
		"\u022e\u0230\7p\2\2\u022f\u021d\3\2\2\2\u022f\u0223\3\2\2\2\u022f\u0229"+
		"\3\2\2\2\u0230D\3\2\2\2\u0231\u0232\7E\2\2\u0232\u0233\7Q\2\2\u0233\u0234"+
		"\7N\2\2\u0234\u0235\7W\2\2\u0235\u0236\7O\2\2\u0236\u0237\7P\2\2\u0237"+
		"\u0247\7U\2\2\u0238\u0239\7E\2\2\u0239\u023a\7q\2\2\u023a\u023b\7n\2\2"+
		"\u023b\u023c\7w\2\2\u023c\u023d\7o\2\2\u023d\u023e\7p\2\2\u023e\u0247"+
		"\7u\2\2\u023f\u0240\7e\2\2\u0240\u0241\7q\2\2\u0241\u0242\7n\2\2\u0242"+
		"\u0243\7w\2\2\u0243\u0244\7o\2\2\u0244\u0245\7p\2\2\u0245\u0247\7u\2\2"+
		"\u0246\u0231\3\2\2\2\u0246\u0238\3\2\2\2\u0246\u023f\3\2\2\2\u0247F\3"+
		"\2\2\2\u0248\u0249\7H\2\2\u0249\u024a\7T\2\2\u024a\u024b\7Q\2\2\u024b"+
		"\u0255\7O\2\2\u024c\u024d\7H\2\2\u024d\u024e\7t\2\2\u024e\u024f\7q\2\2"+
		"\u024f\u0255\7o\2\2\u0250\u0251\7h\2\2\u0251\u0252\7t\2\2\u0252\u0253"+
		"\7q\2\2\u0253\u0255\7o\2\2\u0254\u0248\3\2\2\2\u0254\u024c\3\2\2\2\u0254"+
		"\u0250\3\2\2\2\u0255H\3\2\2\2\u0256\u0257\7C\2\2\u0257\u0258\7F\2\2\u0258"+
		"\u0260\7F\2\2\u0259\u025a\7C\2\2\u025a\u025b\7f\2\2\u025b\u0260\7f\2\2"+
		"\u025c\u025d\7c\2\2\u025d\u025e\7f\2\2\u025e\u0260\7f\2\2\u025f\u0256"+
		"\3\2\2\2\u025f\u0259\3\2\2\2\u025f\u025c\3\2\2\2\u0260J\3\2\2\2\u0261"+
		"\u0262\7C\2\2\u0262\u0263\7P\2\2\u0263\u026b\7F\2\2\u0264\u0265\7C\2\2"+
		"\u0265\u0266\7p\2\2\u0266\u026b\7f\2\2\u0267\u0268\7c\2\2\u0268\u0269"+
		"\7p\2\2\u0269\u026b\7f\2\2\u026a\u0261\3\2\2\2\u026a\u0264\3\2\2\2\u026a"+
		"\u0267\3\2\2\2\u026bL\3\2\2\2\u026c\u026d\7Q\2\2\u026d\u0273\7T\2\2\u026e"+
		"\u026f\7Q\2\2\u026f\u0273\7t\2\2\u0270\u0271\7q\2\2\u0271\u0273\7t\2\2"+
		"\u0272\u026c\3\2\2\2\u0272\u026e\3\2\2\2\u0272\u0270\3\2\2\2\u0273N\3"+
		"\2\2\2\u0274\u0275\7P\2\2\u0275\u0276\7Q\2\2\u0276\u027e\7V\2\2\u0277"+
		"\u0278\7P\2\2\u0278\u0279\7q\2\2\u0279\u027e\7v\2\2\u027a\u027b\7p\2\2"+
		"\u027b\u027c\7q\2\2\u027c\u027e\7v\2\2\u027d\u0274\3\2\2\2\u027d\u0277"+
		"\3\2\2\2\u027d\u027a\3\2\2\2\u027eP\3\2\2\2\u027f\u0280\7K\2\2\u0280\u0281"+
		"\7P\2\2\u0281\u0282\7U\2\2\u0282\u0283\7G\2\2\u0283\u0284\7T\2\2\u0284"+
		"\u0292\7V\2\2\u0285\u0286\7K\2\2\u0286\u0287\7p\2\2\u0287\u0288\7u\2\2"+
		"\u0288\u0289\7g\2\2\u0289\u028a\7t\2\2\u028a\u0292\7v\2\2\u028b\u028c"+
		"\7k\2\2\u028c\u028d\7p\2\2\u028d\u028e\7u\2\2\u028e\u028f\7g\2\2\u028f"+
		"\u0290\7t\2\2\u0290\u0292\7v\2\2\u0291\u027f\3\2\2\2\u0291\u0285\3\2\2"+
		"\2\u0291\u028b\3\2\2\2\u0292R\3\2\2\2\u0293\u0294\7K\2\2\u0294\u0295\7"+
		"P\2\2\u0295\u0296\7V\2\2\u0296\u02a0\7Q\2\2\u0297\u0298\7K\2\2\u0298\u0299"+
		"\7p\2\2\u0299\u029a\7v\2\2\u029a\u02a0\7q\2\2\u029b\u029c\7k\2\2\u029c"+
		"\u029d\7p\2\2\u029d\u029e\7v\2\2\u029e\u02a0\7q\2\2\u029f\u0293\3\2\2"+
		"\2\u029f\u0297\3\2\2\2\u029f\u029b\3\2\2\2\u02a0T\3\2\2\2\u02a1\u02a2"+
		"\7Y\2\2\u02a2\u02a3\7J\2\2\u02a3\u02a4\7G\2\2\u02a4\u02a5\7T\2\2\u02a5"+
		"\u02b1\7G\2\2\u02a6\u02a7\7Y\2\2\u02a7\u02a8\7j\2\2\u02a8\u02a9\7g\2\2"+
		"\u02a9\u02aa\7t\2\2\u02aa\u02b1\7g\2\2\u02ab\u02ac\7y\2\2\u02ac\u02ad"+
		"\7j\2\2\u02ad\u02ae\7g\2\2\u02ae\u02af\7t\2\2\u02af\u02b1\7g\2\2\u02b0"+
		"\u02a1\3\2\2\2\u02b0\u02a6\3\2\2\2\u02b0\u02ab\3\2\2\2\u02b1V\3\2\2\2"+
		"\u02b2\u02b3\7W\2\2\u02b3\u02b4\7R\2\2\u02b4\u02b5\7F\2\2\u02b5\u02b6"+
		"\7C\2\2\u02b6\u02b7\7V\2\2\u02b7\u02c5\7G\2\2\u02b8\u02b9\7W\2\2\u02b9"+
		"\u02ba\7r\2\2\u02ba\u02bb\7f\2\2\u02bb\u02bc\7c\2\2\u02bc\u02bd\7v\2\2"+
		"\u02bd\u02c5\7g\2\2\u02be\u02bf\7w\2\2\u02bf\u02c0\7r\2\2\u02c0\u02c1"+
		"\7f\2\2\u02c1\u02c2\7c\2\2\u02c2\u02c3\7v\2\2\u02c3\u02c5\7g\2\2\u02c4"+
		"\u02b2\3\2\2\2\u02c4\u02b8\3\2\2\2\u02c4\u02be\3\2\2\2\u02c5X\3\2\2\2"+
		"\u02c6\u02c7\7U\2\2\u02c7\u02c8\7G\2\2\u02c8\u02d0\7V\2\2\u02c9\u02ca"+
		"\7U\2\2\u02ca\u02cb\7g\2\2\u02cb\u02d0\7v\2\2\u02cc\u02cd\7u\2\2\u02cd"+
		"\u02ce\7g\2\2\u02ce\u02d0\7v\2\2\u02cf\u02c6\3\2\2\2\u02cf\u02c9\3\2\2"+
		"\2\u02cf\u02cc\3\2\2\2\u02d0Z\3\2\2\2\u02d1\u02d2\7F\2\2\u02d2\u02d3\7"+
		"G\2\2\u02d3\u02d4\7N\2\2\u02d4\u02d5\7G\2\2\u02d5\u02d6\7V\2\2\u02d6\u02e4"+
		"\7G\2\2\u02d7\u02d8\7F\2\2\u02d8\u02d9\7g\2\2\u02d9\u02da\7n\2\2\u02da"+
		"\u02db\7g\2\2\u02db\u02dc\7v\2\2\u02dc\u02e4\7g\2\2\u02dd\u02de\7f\2\2"+
		"\u02de\u02df\7g\2\2\u02df\u02e0\7n\2\2\u02e0\u02e1\7g\2\2\u02e1\u02e2"+
		"\7v\2\2\u02e2\u02e4\7g\2\2\u02e3\u02d1\3\2\2\2\u02e3\u02d7\3\2\2\2\u02e3"+
		"\u02dd\3\2\2\2\u02e4\\\3\2\2\2\u02e5\u02e6\7U\2\2\u02e6\u02e7\7G\2\2\u02e7"+
		"\u02e8\7N\2\2\u02e8\u02e9\7G\2\2\u02e9\u02ea\7E\2\2\u02ea\u02f8\7V\2\2"+
		"\u02eb\u02ec\7U\2\2\u02ec\u02ed\7g\2\2\u02ed\u02ee\7n\2\2\u02ee\u02ef"+
		"\7g\2\2\u02ef\u02f0\7e\2\2\u02f0\u02f8\7v\2\2\u02f1\u02f2\7u\2\2\u02f2"+
		"\u02f3\7g\2\2\u02f3\u02f4\7n\2\2\u02f4\u02f5\7g\2\2\u02f5\u02f6\7e\2\2"+
		"\u02f6\u02f8\7v\2\2\u02f7\u02e5\3\2\2\2\u02f7\u02eb\3\2\2\2\u02f7\u02f1"+
		"\3\2\2\2\u02f8^\3\2\2\2\u02f9\u02fa\7Q\2\2\u02fa\u02fb\7T\2\2\u02fb\u02fc"+
		"\7F\2\2\u02fc\u02fd\7G\2\2\u02fd\u0309\7T\2\2\u02fe\u02ff\7Q\2\2\u02ff"+
		"\u0300\7t\2\2\u0300\u0301\7f\2\2\u0301\u0302\7g\2\2\u0302\u0309\7t\2\2"+
		"\u0303\u0304\7q\2\2\u0304\u0305\7t\2\2\u0305\u0306\7f\2\2\u0306\u0307"+
		"\7g\2\2\u0307\u0309\7t\2\2\u0308\u02f9\3\2\2\2\u0308\u02fe\3\2\2\2\u0308"+
		"\u0303\3\2\2\2\u0309`\3\2\2\2\u030a\u030b\7D\2\2\u030b\u0311\7[\2\2\u030c"+
		"\u030d\7D\2\2\u030d\u0311\7{\2\2\u030e\u030f\7d\2\2\u030f\u0311\7{\2\2"+
		"\u0310\u030a\3\2\2\2\u0310\u030c\3\2\2\2\u0310\u030e\3\2\2\2\u0311b\3"+
		"\2\2\2\u0312\u0313\7C\2\2\u0313\u0314\7U\2\2\u0314\u031c\7E\2\2\u0315"+
		"\u0316\7C\2\2\u0316\u0317\7u\2\2\u0317\u031c\7e\2\2\u0318\u0319\7c\2\2"+
		"\u0319\u031a\7u\2\2\u031a\u031c\7e\2\2\u031b\u0312\3\2\2\2\u031b\u0315"+
		"\3\2\2\2\u031b\u0318\3\2\2\2\u031cd\3\2\2\2\u031d\u031e\7P\2\2\u031e\u031f"+
		"\7W\2\2\u031f\u0320\7N\2\2\u0320\u032a\7N\2\2\u0321\u0322\7P\2\2\u0322"+
		"\u0323\7w\2\2\u0323\u0324\7n\2\2\u0324\u032a\7n\2\2\u0325\u0326\7p\2\2"+
		"\u0326\u0327\7w\2\2\u0327\u0328\7n\2\2\u0328\u032a\7n\2\2\u0329\u031d"+
		"\3\2\2\2\u0329\u0321\3\2\2\2\u0329\u0325\3\2\2\2\u032af\3\2\2\2\u032b"+
		"\u032c\7F\2\2\u032c\u032d\7G\2\2\u032d\u032e\7U\2\2\u032e\u0338\7E\2\2"+
		"\u032f\u0330\7F\2\2\u0330\u0331\7g\2\2\u0331\u0332\7u\2\2\u0332\u0338"+
		"\7e\2\2\u0333\u0334\7f\2\2\u0334\u0335\7g\2\2\u0335\u0336\7u\2\2\u0336"+
		"\u0338\7e\2\2\u0337\u032b\3\2\2\2\u0337\u032f\3\2\2\2\u0337\u0333\3\2"+
		"\2\2\u0338h\3\2\2\2\u0339\u033a\7X\2\2\u033a\u033b\7C\2\2\u033b\u033c"+
		"\7N\2\2\u033c\u033d\7W\2\2\u033d\u033e\7G\2\2\u033e\u034c\7U\2\2\u033f"+
		"\u0340\7X\2\2\u0340\u0341\7c\2\2\u0341\u0342\7n\2\2\u0342\u0343\7w\2\2"+
		"\u0343\u0344\7g\2\2\u0344\u034c\7u\2\2\u0345\u0346\7x\2\2\u0346\u0347"+
		"\7c\2\2\u0347\u0348\7n\2\2\u0348\u0349\7w\2\2\u0349\u034a\7g\2\2\u034a"+
		"\u034c\7u\2\2\u034b\u0339\3\2\2\2\u034b\u033f\3\2\2\2\u034b\u0345\3\2"+
		"\2\2\u034cj\3\2\2\2\u034d\u034e\t\2\2\2\u034el\3\2\2\2\u034f\u0350\4\62"+
		";\2\u0350n\3\2\2\2\u0351\u0353\t\3\2\2\u0352\u0351\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0357\b8\2\2\u0357p\3\2\2\2\u0358\u0359\7)\2\2\u0359\u035a\5m\67\2\u035a"+
		"\u035b\5m\67\2\u035b\u035c\5m\67\2\u035c\u035d\5m\67\2\u035d\u035e\7/"+
		"\2\2\u035e\u035f\5m\67\2\u035f\u0360\5m\67\2\u0360\u0361\7/\2\2\u0361"+
		"\u0362\5m\67\2\u0362\u0363\5m\67\2\u0363\u0364\7)\2\2\u0364r\3\2\2\2\u0365"+
		"\u0369\5m\67\2\u0366\u0368\5m\67\2\u0367\u0366\3\2\2\2\u0368\u036b\3\2"+
		"\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036at\3\2\2\2\u036b\u0369"+
		"\3\2\2\2\u036c\u0372\5k\66\2\u036d\u0371\5k\66\2\u036e\u0371\5m\67\2\u036f"+
		"\u0371\t\4\2\2\u0370\u036d\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u036f\3\2"+
		"\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"v\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0379\7)\2\2\u0376\u0378\n\5\2\2\u0377"+
		"\u0376\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2"+
		"\2\2\u037a\u037c\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037d\7)\2\2\u037d"+
		"x\3\2\2\2\u037e\u037f\5s:\2\u037f\u0380\7\60\2\2\u0380\u0381\5s:\2\u0381"+
		"z\3\2\2\2\60\2\u00a8\u00c2\u00df\u00f0\u010d\u011b\u0129\u0134\u0145\u0150"+
		"\u0161\u016f\u017d\u019d\u01b4\u01bf\u01d6\u01e7\u0207\u021b\u022f\u0246"+
		"\u0254\u025f\u026a\u0272\u027d\u0291\u029f\u02b0\u02c4\u02cf\u02e3\u02f7"+
		"\u0308\u0310\u031b\u0329\u0337\u034b\u0354\u0369\u0370\u0372\u0379\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}