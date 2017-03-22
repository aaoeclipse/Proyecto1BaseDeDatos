// Generated from gramaticaDBMS.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class decafAumentadaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, CREATE=16, 
		DATABASE=17, DATABASES=18, ALTER=19, RENAME=20, DROP=21, TO=22, SHOW=23, 
		USE=24, CONSTRAINT=25, PRIMARY=26, FOREIGN=27, KEY=28, REFERENCES=29, 
		CHECK=30, INT=31, FLOAT=32, DATE=33, CHAR=34, AND=35, OR=36, NOT=37, TABLE=38, 
		TABLES=39, ADD=40, COLUMN=41, COLUMNS=42, SHOWX=43, FROM=44, INSERT=45, 
		SELECT=46, VALUES=47, INTO=48, UPDATE=49, SET=50, WHERE=51, DELETE=52, 
		ORDER=53, BY=54, ASC=55, DESC=56, NULL=57, IDX=58, NUMX=59, CHARX=60, 
		SPACEX=61, COMMENTX=62;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "CREATE", "DATABASE", 
		"DATABASES", "ALTER", "RENAME", "DROP", "TO", "SHOW", "USE", "CONSTRAINT", 
		"PRIMARY", "FOREIGN", "KEY", "REFERENCES", "CHECK", "INT", "FLOAT", "DATE", 
		"CHAR", "AND", "OR", "NOT", "TABLE", "TABLES", "ADD", "COLUMN", "COLUMNS", 
		"SHOWX", "FROM", "INSERT", "SELECT", "VALUES", "INTO", "UPDATE", "SET", 
		"WHERE", "DELETE", "ORDER", "BY", "ASC", "DESC", "NULL", "LETTERX", "DIGITX", 
		"VARX", "IDX", "NUMX", "CHARX", "SPACEX", "COMMENTX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'('", "')'", "','", "'='", "'*'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'+'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "CREATE", "DATABASE", "DATABASES", "ALTER", "RENAME", 
		"DROP", "TO", "SHOW", "USE", "CONSTRAINT", "PRIMARY", "FOREIGN", "KEY", 
		"REFERENCES", "CHECK", "INT", "FLOAT", "DATE", "CHAR", "AND", "OR", "NOT", 
		"TABLE", "TABLES", "ADD", "COLUMN", "COLUMNS", "SHOWX", "FROM", "INSERT", 
		"SELECT", "VALUES", "INTO", "UPDATE", "SET", "WHERE", "DELETE", "ORDER", 
		"BY", "ASC", "DESC", "NULL", "IDX", "NUMX", "CHARX", "SPACEX", "COMMENTX"
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


	public decafAumentadaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramaticaDBMS.g4"; }

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
		case 63:
			SPACEX_action((RuleContext)_localctx, actionIndex);
			break;
		case 64:
			COMMENTX_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMMENTX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u03a0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ba\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f1"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0102\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0116\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0124\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u012c\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013a\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0145\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0165\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u017c\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0193\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u019e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u01be\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01cf\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u01da\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u01eb\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01f9"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0207\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u0212\n$\3%\3%\3%\3%\3%\3%\5%\u021a\n%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\5&\u0225\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u0236\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u024a\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0255\n)\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0269\n*\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0280\n+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u028e\n,\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\5-\u029c\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u02b0\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u02c4\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02d8\n\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02e6\n\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u02fa\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u0305\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u0316\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u032a\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u033b\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0343\n\67\38\38\3"+
		"8\38\38\38\38\38\38\58\u034e\n8\39\39\39\39\39\39\39\39\39\39\39\39\5"+
		"9\u035c\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u036a\n:\3;\3;\3<\3"+
		"<\3=\5=\u0371\n=\3>\3>\3>\3>\7>\u0377\n>\f>\16>\u037a\13>\3?\3?\7?\u037e"+
		"\n?\f?\16?\u0381\13?\3@\3@\3@\3@\3@\3@\3@\5@\u038a\n@\3@\3@\3A\3A\3A\3"+
		"A\5A\u0392\nA\3A\3A\3B\3B\3B\3B\7B\u039a\nB\fB\16B\u039d\13B\3B\3B\2\2"+
		"C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u\2w\2y\2{<}=\177>\u0081?\u0083@\3\2\b\4\2C\\c|\4\2\13\f\"\u0080"+
		"\6\2\"\61<B]b}\177\5\2\f\f$$))\5\2\13\f\16\16\"\"\4\2\f\f\17\17\u03fb"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0087\3\2\2\2\7\u0089"+
		"\3\2\2\2\t\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u008f\3\2\2\2\17\u0091\3\2"+
		"\2\2\21\u0093\3\2\2\2\23\u0095\3\2\2\2\25\u0098\3\2\2\2\27\u009b\3\2\2"+
		"\2\31\u009e\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3\2\2\2"+
		"!\u00b9\3\2\2\2#\u00d3\3\2\2\2%\u00f0\3\2\2\2\'\u0101\3\2\2\2)\u0115\3"+
		"\2\2\2+\u0123\3\2\2\2-\u012b\3\2\2\2/\u0139\3\2\2\2\61\u0144\3\2\2\2\63"+
		"\u0164\3\2\2\2\65\u017b\3\2\2\2\67\u0192\3\2\2\29\u019d\3\2\2\2;\u01bd"+
		"\3\2\2\2=\u01ce\3\2\2\2?\u01d9\3\2\2\2A\u01ea\3\2\2\2C\u01f8\3\2\2\2E"+
		"\u0206\3\2\2\2G\u0211\3\2\2\2I\u0219\3\2\2\2K\u0224\3\2\2\2M\u0235\3\2"+
		"\2\2O\u0249\3\2\2\2Q\u0254\3\2\2\2S\u0268\3\2\2\2U\u027f\3\2\2\2W\u028d"+
		"\3\2\2\2Y\u029b\3\2\2\2[\u02af\3\2\2\2]\u02c3\3\2\2\2_\u02d7\3\2\2\2a"+
		"\u02e5\3\2\2\2c\u02f9\3\2\2\2e\u0304\3\2\2\2g\u0315\3\2\2\2i\u0329\3\2"+
		"\2\2k\u033a\3\2\2\2m\u0342\3\2\2\2o\u034d\3\2\2\2q\u035b\3\2\2\2s\u0369"+
		"\3\2\2\2u\u036b\3\2\2\2w\u036d\3\2\2\2y\u0370\3\2\2\2{\u0372\3\2\2\2}"+
		"\u037b\3\2\2\2\177\u0382\3\2\2\2\u0081\u0391\3\2\2\2\u0083\u0395\3\2\2"+
		"\2\u0085\u0086\7/\2\2\u0086\4\3\2\2\2\u0087\u0088\7*\2\2\u0088\6\3\2\2"+
		"\2\u0089\u008a\7+\2\2\u008a\b\3\2\2\2\u008b\u008c\7.\2\2\u008c\n\3\2\2"+
		"\2\u008d\u008e\7?\2\2\u008e\f\3\2\2\2\u008f\u0090\7,\2\2\u0090\16\3\2"+
		"\2\2\u0091\u0092\7>\2\2\u0092\20\3\2\2\2\u0093\u0094\7@\2\2\u0094\22\3"+
		"\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7?\2\2\u0097\24\3\2\2\2\u0098\u0099"+
		"\7@\2\2\u0099\u009a\7?\2\2\u009a\26\3\2\2\2\u009b\u009c\7?\2\2\u009c\u009d"+
		"\7?\2\2\u009d\30\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0\7?\2\2\u00a0\32"+
		"\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7\'\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7e\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7v\2\2"+
		"\u00ac\u00ba\7g\2\2\u00ad\u00ae\7E\2\2\u00ae\u00af\7T\2\2\u00af\u00b0"+
		"\7G\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7V\2\2\u00b2\u00ba\7G\2\2\u00b3"+
		"\u00b4\7E\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2"+
		"\u00b7\u00b8\7v\2\2\u00b8\u00ba\7g\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00ad"+
		"\3\2\2\2\u00b9\u00b3\3\2\2\2\u00ba\"\3\2\2\2\u00bb\u00bc\7f\2\2\u00bc"+
		"\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7d\2\2"+
		"\u00c0\u00c1\7c\2\2\u00c1\u00c2\7u\2\2\u00c2\u00d4\7g\2\2\u00c3\u00c4"+
		"\7F\2\2\u00c4\u00c5\7C\2\2\u00c5\u00c6\7V\2\2\u00c6\u00c7\7C\2\2\u00c7"+
		"\u00c8\7D\2\2\u00c8\u00c9\7C\2\2\u00c9\u00ca\7U\2\2\u00ca\u00d4\7G\2\2"+
		"\u00cb\u00cc\7F\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7u\2\2\u00d2"+
		"\u00d4\7g\2\2\u00d3\u00bb\3\2\2\2\u00d3\u00c3\3\2\2\2\u00d3\u00cb\3\2"+
		"\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8"+
		"\7v\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7c\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\u00dd\7g\2\2\u00dd\u00f1\7u\2\2\u00de\u00df\7F\2\2"+
		"\u00df\u00e0\7C\2\2\u00e0\u00e1\7V\2\2\u00e1\u00e2\7C\2\2\u00e2\u00e3"+
		"\7D\2\2\u00e3\u00e4\7C\2\2\u00e4\u00e5\7U\2\2\u00e5\u00e6\7G\2\2\u00e6"+
		"\u00f1\7U\2\2\u00e7\u00e8\7F\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7v\2\2"+
		"\u00ea\u00eb\7c\2\2\u00eb\u00ec\7d\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee"+
		"\7u\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f1\7u\2\2\u00f0\u00d5\3\2\2\2\u00f0"+
		"\u00de\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f1&\3\2\2\2\u00f2\u00f3\7c\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6\u0102\7t\2\2"+
		"\u00f7\u00f8\7C\2\2\u00f8\u00f9\7N\2\2\u00f9\u00fa\7V\2\2\u00fa\u00fb"+
		"\7G\2\2\u00fb\u0102\7T\2\2\u00fc\u00fd\7C\2\2\u00fd\u00fe\7n\2\2\u00fe"+
		"\u00ff\7v\2\2\u00ff\u0100\7g\2\2\u0100\u0102\7t\2\2\u0101\u00f2\3\2\2"+
		"\2\u0101\u00f7\3\2\2\2\u0101\u00fc\3\2\2\2\u0102(\3\2\2\2\u0103\u0104"+
		"\7t\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7o\2\2\u0108\u0116\7g\2\2\u0109\u010a\7T\2\2\u010a\u010b\7G\2\2"+
		"\u010b\u010c\7P\2\2\u010c\u010d\7C\2\2\u010d\u010e\7O\2\2\u010e\u0116"+
		"\7G\2\2\u010f\u0110\7T\2\2\u0110\u0111\7g\2\2\u0111\u0112\7p\2\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\7o\2\2\u0114\u0116\7g\2\2\u0115\u0103\3\2\2"+
		"\2\u0115\u0109\3\2\2\2\u0115\u010f\3\2\2\2\u0116*\3\2\2\2\u0117\u0118"+
		"\7f\2\2\u0118\u0119\7t\2\2\u0119\u011a\7q\2\2\u011a\u0124\7r\2\2\u011b"+
		"\u011c\7F\2\2\u011c\u011d\7T\2\2\u011d\u011e\7Q\2\2\u011e\u0124\7R\2\2"+
		"\u011f\u0120\7F\2\2\u0120\u0121\7t\2\2\u0121\u0122\7q\2\2\u0122\u0124"+
		"\7r\2\2\u0123\u0117\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011f\3\2\2\2\u0124"+
		",\3\2\2\2\u0125\u0126\7v\2\2\u0126\u012c\7q\2\2\u0127\u0128\7V\2\2\u0128"+
		"\u012c\7Q\2\2\u0129\u012a\7V\2\2\u012a\u012c\7q\2\2\u012b\u0125\3\2\2"+
		"\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012c.\3\2\2\2\u012d\u012e"+
		"\7u\2\2\u012e\u012f\7j\2\2\u012f\u0130\7q\2\2\u0130\u013a\7y\2\2\u0131"+
		"\u0132\7U\2\2\u0132\u0133\7J\2\2\u0133\u0134\7Q\2\2\u0134\u013a\7Y\2\2"+
		"\u0135\u0136\7U\2\2\u0136\u0137\7j\2\2\u0137\u0138\7q\2\2\u0138\u013a"+
		"\7y\2\2\u0139\u012d\3\2\2\2\u0139\u0131\3\2\2\2\u0139\u0135\3\2\2\2\u013a"+
		"\60\3\2\2\2\u013b\u013c\7w\2\2\u013c\u013d\7u\2\2\u013d\u0145\7g\2\2\u013e"+
		"\u013f\7W\2\2\u013f\u0140\7U\2\2\u0140\u0145\7G\2\2\u0141\u0142\7W\2\2"+
		"\u0142\u0143\7u\2\2\u0143\u0145\7g\2\2\u0144\u013b\3\2\2\2\u0144\u013e"+
		"\3\2\2\2\u0144\u0141\3\2\2\2\u0145\62\3\2\2\2\u0146\u0147\7e\2\2\u0147"+
		"\u0148\7q\2\2\u0148\u0149\7p\2\2\u0149\u014a\7u\2\2\u014a\u014b\7v\2\2"+
		"\u014b\u014c\7t\2\2\u014c\u014d\7c\2\2\u014d\u014e\7k\2\2\u014e\u014f"+
		"\7p\2\2\u014f\u0165\7v\2\2\u0150\u0151\7E\2\2\u0151\u0152\7Q\2\2\u0152"+
		"\u0153\7P\2\2\u0153\u0154\7U\2\2\u0154\u0155\7V\2\2\u0155\u0156\7T\2\2"+
		"\u0156\u0157\7C\2\2\u0157\u0158\7K\2\2\u0158\u0159\7P\2\2\u0159\u0165"+
		"\7V\2\2\u015a\u015b\7E\2\2\u015b\u015c\7q\2\2\u015c\u015d\7p\2\2\u015d"+
		"\u015e\7u\2\2\u015e\u015f\7v\2\2\u015f\u0160\7t\2\2\u0160\u0161\7c\2\2"+
		"\u0161\u0162\7k\2\2\u0162\u0163\7p\2\2\u0163\u0165\7v\2\2\u0164\u0146"+
		"\3\2\2\2\u0164\u0150\3\2\2\2\u0164\u015a\3\2\2\2\u0165\64\3\2\2\2\u0166"+
		"\u0167\7r\2\2\u0167\u0168\7t\2\2\u0168\u0169\7k\2\2\u0169\u016a\7o\2\2"+
		"\u016a\u016b\7c\2\2\u016b\u016c\7t\2\2\u016c\u017c\7{\2\2\u016d\u016e"+
		"\7R\2\2\u016e\u016f\7T\2\2\u016f\u0170\7K\2\2\u0170\u0171\7O\2\2\u0171"+
		"\u0172\7C\2\2\u0172\u0173\7T\2\2\u0173\u017c\7[\2\2\u0174\u0175\7R\2\2"+
		"\u0175\u0176\7t\2\2\u0176\u0177\7k\2\2\u0177\u0178\7o\2\2\u0178\u0179"+
		"\7c\2\2\u0179\u017a\7t\2\2\u017a\u017c\7{\2\2\u017b\u0166\3\2\2\2\u017b"+
		"\u016d\3\2\2\2\u017b\u0174\3\2\2\2\u017c\66\3\2\2\2\u017d\u017e\7h\2\2"+
		"\u017e\u017f\7q\2\2\u017f\u0180\7t\2\2\u0180\u0181\7g\2\2\u0181\u0182"+
		"\7k\2\2\u0182\u0183\7i\2\2\u0183\u0193\7p\2\2\u0184\u0185\7H\2\2\u0185"+
		"\u0186\7Q\2\2\u0186\u0187\7T\2\2\u0187\u0188\7G\2\2\u0188\u0189\7K\2\2"+
		"\u0189\u018a\7I\2\2\u018a\u0193\7P\2\2\u018b\u018c\7H\2\2\u018c\u018d"+
		"\7q\2\2\u018d\u018e\7t\2\2\u018e\u018f\7g\2\2\u018f\u0190\7k\2\2\u0190"+
		"\u0191\7i\2\2\u0191\u0193\7p\2\2\u0192\u017d\3\2\2\2\u0192\u0184\3\2\2"+
		"\2\u0192\u018b\3\2\2\2\u01938\3\2\2\2\u0194\u0195\7m\2\2\u0195\u0196\7"+
		"g\2\2\u0196\u019e\7{\2\2\u0197\u0198\7M\2\2\u0198\u0199\7G\2\2\u0199\u019e"+
		"\7[\2\2\u019a\u019b\7M\2\2\u019b\u019c\7g\2\2\u019c\u019e\7{\2\2\u019d"+
		"\u0194\3\2\2\2\u019d\u0197\3\2\2\2\u019d\u019a\3\2\2\2\u019e:\3\2\2\2"+
		"\u019f\u01a0\7t\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7h\2\2\u01a2\u01a3"+
		"\7g\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7p\2\2\u01a6"+
		"\u01a7\7e\2\2\u01a7\u01a8\7g\2\2\u01a8\u01be\7u\2\2\u01a9\u01aa\7T\2\2"+
		"\u01aa\u01ab\7G\2\2\u01ab\u01ac\7H\2\2\u01ac\u01ad\7G\2\2\u01ad\u01ae"+
		"\7T\2\2\u01ae\u01af\7G\2\2\u01af\u01b0\7P\2\2\u01b0\u01b1\7E\2\2\u01b1"+
		"\u01b2\7G\2\2\u01b2\u01be\7U\2\2\u01b3\u01b4\7T\2\2\u01b4\u01b5\7g\2\2"+
		"\u01b5\u01b6\7h\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9"+
		"\7g\2\2\u01b9\u01ba\7p\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7g\2\2\u01bc"+
		"\u01be\7u\2\2\u01bd\u019f\3\2\2\2\u01bd\u01a9\3\2\2\2\u01bd\u01b3\3\2"+
		"\2\2\u01be<\3\2\2\2\u01bf\u01c0\7e\2\2\u01c0\u01c1\7j\2\2\u01c1\u01c2"+
		"\7g\2\2\u01c2\u01c3\7e\2\2\u01c3\u01cf\7m\2\2\u01c4\u01c5\7E\2\2\u01c5"+
		"\u01c6\7J\2\2\u01c6\u01c7\7G\2\2\u01c7\u01c8\7E\2\2\u01c8\u01cf\7M\2\2"+
		"\u01c9\u01ca\7E\2\2\u01ca\u01cb\7j\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd"+
		"\7e\2\2\u01cd\u01cf\7m\2\2\u01ce\u01bf\3\2\2\2\u01ce\u01c4\3\2\2\2\u01ce"+
		"\u01c9\3\2\2\2\u01cf>\3\2\2\2\u01d0\u01d1\7k\2\2\u01d1\u01d2\7p\2\2\u01d2"+
		"\u01da\7v\2\2\u01d3\u01d4\7K\2\2\u01d4\u01d5\7P\2\2\u01d5\u01da\7V\2\2"+
		"\u01d6\u01d7\7K\2\2\u01d7\u01d8\7p\2\2\u01d8\u01da\7v\2\2\u01d9\u01d0"+
		"\3\2\2\2\u01d9\u01d3\3\2\2\2\u01d9\u01d6\3\2\2\2\u01da@\3\2\2\2\u01db"+
		"\u01dc\7h\2\2\u01dc\u01dd\7n\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7c\2\2"+
		"\u01df\u01eb\7v\2\2\u01e0\u01e1\7H\2\2\u01e1\u01e2\7N\2\2\u01e2\u01e3"+
		"\7Q\2\2\u01e3\u01e4\7C\2\2\u01e4\u01eb\7V\2\2\u01e5\u01e6\7H\2\2\u01e6"+
		"\u01e7\7n\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7c\2\2\u01e9\u01eb\7v\2\2"+
		"\u01ea\u01db\3\2\2\2\u01ea\u01e0\3\2\2\2\u01ea\u01e5\3\2\2\2\u01ebB\3"+
		"\2\2\2\u01ec\u01ed\7f\2\2\u01ed\u01ee\7c\2\2\u01ee\u01ef\7v\2\2\u01ef"+
		"\u01f9\7g\2\2\u01f0\u01f1\7F\2\2\u01f1\u01f2\7C\2\2\u01f2\u01f3\7V\2\2"+
		"\u01f3\u01f9\7G\2\2\u01f4\u01f5\7F\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7"+
		"\7v\2\2\u01f7\u01f9\7g\2\2\u01f8\u01ec\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8"+
		"\u01f4\3\2\2\2\u01f9D\3\2\2\2\u01fa\u01fb\7e\2\2\u01fb\u01fc\7j\2\2\u01fc"+
		"\u01fd\7c\2\2\u01fd\u0207\7t\2\2\u01fe\u01ff\7E\2\2\u01ff\u0200\7J\2\2"+
		"\u0200\u0201\7C\2\2\u0201\u0207\7T\2\2\u0202\u0203\7E\2\2\u0203\u0204"+
		"\7j\2\2\u0204\u0205\7c\2\2\u0205\u0207\7t\2\2\u0206\u01fa\3\2\2\2\u0206"+
		"\u01fe\3\2\2\2\u0206\u0202\3\2\2\2\u0207F\3\2\2\2\u0208\u0209\7c\2\2\u0209"+
		"\u020a\7p\2\2\u020a\u0212\7f\2\2\u020b\u020c\7C\2\2\u020c\u020d\7P\2\2"+
		"\u020d\u0212\7F\2\2\u020e\u020f\7C\2\2\u020f\u0210\7p\2\2\u0210\u0212"+
		"\7f\2\2\u0211\u0208\3\2\2\2\u0211\u020b\3\2\2\2\u0211\u020e\3\2\2\2\u0212"+
		"H\3\2\2\2\u0213\u0214\7q\2\2\u0214\u021a\7t\2\2\u0215\u0216\7Q\2\2\u0216"+
		"\u021a\7T\2\2\u0217\u0218\7Q\2\2\u0218\u021a\7t\2\2\u0219\u0213\3\2\2"+
		"\2\u0219\u0215\3\2\2\2\u0219\u0217\3\2\2\2\u021aJ\3\2\2\2\u021b\u021c"+
		"\7p\2\2\u021c\u021d\7q\2\2\u021d\u0225\7v\2\2\u021e\u021f\7P\2\2\u021f"+
		"\u0220\7Q\2\2\u0220\u0225\7V\2\2\u0221\u0222\7P\2\2\u0222\u0223\7q\2\2"+
		"\u0223\u0225\7v\2\2\u0224\u021b\3\2\2\2\u0224\u021e\3\2\2\2\u0224\u0221"+
		"\3\2\2\2\u0225L\3\2\2\2\u0226\u0227\7v\2\2\u0227\u0228\7c\2\2\u0228\u0229"+
		"\7d\2\2\u0229\u022a\7n\2\2\u022a\u0236\7g\2\2\u022b\u022c\7V\2\2\u022c"+
		"\u022d\7C\2\2\u022d\u022e\7D\2\2\u022e\u022f\7N\2\2\u022f\u0236\7G\2\2"+
		"\u0230\u0231\7V\2\2\u0231\u0232\7c\2\2\u0232\u0233\7d\2\2\u0233\u0234"+
		"\7n\2\2\u0234\u0236\7g\2\2\u0235\u0226\3\2\2\2\u0235\u022b\3\2\2\2\u0235"+
		"\u0230\3\2\2\2\u0236N\3\2\2\2\u0237\u0238\7v\2\2\u0238\u0239\7c\2\2\u0239"+
		"\u023a\7d\2\2\u023a\u023b\7n\2\2\u023b\u023c\7g\2\2\u023c\u024a\7u\2\2"+
		"\u023d\u023e\7V\2\2\u023e\u023f\7C\2\2\u023f\u0240\7D\2\2\u0240\u0241"+
		"\7N\2\2\u0241\u0242\7G\2\2\u0242\u024a\7U\2\2\u0243\u0244\7V\2\2\u0244"+
		"\u0245\7c\2\2\u0245\u0246\7d\2\2\u0246\u0247\7n\2\2\u0247\u0248\7g\2\2"+
		"\u0248\u024a\7u\2\2\u0249\u0237\3\2\2\2\u0249\u023d\3\2\2\2\u0249\u0243"+
		"\3\2\2\2\u024aP\3\2\2\2\u024b\u024c\7c\2\2\u024c\u024d\7f\2\2\u024d\u0255"+
		"\7f\2\2\u024e\u024f\7C\2\2\u024f\u0250\7F\2\2\u0250\u0255\7F\2\2\u0251"+
		"\u0252\7C\2\2\u0252\u0253\7f\2\2\u0253\u0255\7f\2\2\u0254\u024b\3\2\2"+
		"\2\u0254\u024e\3\2\2\2\u0254\u0251\3\2\2\2\u0255R\3\2\2\2\u0256\u0257"+
		"\7e\2\2\u0257\u0258\7q\2\2\u0258\u0259\7n\2\2\u0259\u025a\7w\2\2\u025a"+
		"\u025b\7o\2\2\u025b\u0269\7p\2\2\u025c\u025d\7E\2\2\u025d\u025e\7Q\2\2"+
		"\u025e\u025f\7N\2\2\u025f\u0260\7W\2\2\u0260\u0261\7O\2\2\u0261\u0269"+
		"\7P\2\2\u0262\u0263\7E\2\2\u0263\u0264\7q\2\2\u0264\u0265\7n\2\2\u0265"+
		"\u0266\7w\2\2\u0266\u0267\7o\2\2\u0267\u0269\7p\2\2\u0268\u0256\3\2\2"+
		"\2\u0268\u025c\3\2\2\2\u0268\u0262\3\2\2\2\u0269T\3\2\2\2\u026a\u026b"+
		"\7e\2\2\u026b\u026c\7q\2\2\u026c\u026d\7n\2\2\u026d\u026e\7w\2\2\u026e"+
		"\u026f\7o\2\2\u026f\u0270\7p\2\2\u0270\u0280\7u\2\2\u0271\u0272\7E\2\2"+
		"\u0272\u0273\7Q\2\2\u0273\u0274\7N\2\2\u0274\u0275\7W\2\2\u0275\u0276"+
		"\7O\2\2\u0276\u0277\7P\2\2\u0277\u0280\7U\2\2\u0278\u0279\7E\2\2\u0279"+
		"\u027a\7q\2\2\u027a\u027b\7n\2\2\u027b\u027c\7w\2\2\u027c\u027d\7o\2\2"+
		"\u027d\u027e\7p\2\2\u027e\u0280\7u\2\2\u027f\u026a\3\2\2\2\u027f\u0271"+
		"\3\2\2\2\u027f\u0278\3\2\2\2\u0280V\3\2\2\2\u0281\u0282\7u\2\2\u0282\u0283"+
		"\7j\2\2\u0283\u0284\7q\2\2\u0284\u028e\7y\2\2\u0285\u0286\7U\2\2\u0286"+
		"\u0287\7J\2\2\u0287\u0288\7Q\2\2\u0288\u028e\7Y\2\2\u0289\u028a\7U\2\2"+
		"\u028a\u028b\7j\2\2\u028b\u028c\7q\2\2\u028c\u028e\7y\2\2\u028d\u0281"+
		"\3\2\2\2\u028d\u0285\3\2\2\2\u028d\u0289\3\2\2\2\u028eX\3\2\2\2\u028f"+
		"\u0290\7h\2\2\u0290\u0291\7t\2\2\u0291\u0292\7q\2\2\u0292\u029c\7o\2\2"+
		"\u0293\u0294\7H\2\2\u0294\u0295\7T\2\2\u0295\u0296\7Q\2\2\u0296\u029c"+
		"\7O\2\2\u0297\u0298\7H\2\2\u0298\u0299\7t\2\2\u0299\u029a\7q\2\2\u029a"+
		"\u029c\7o\2\2\u029b\u028f\3\2\2\2\u029b\u0293\3\2\2\2\u029b\u0297\3\2"+
		"\2\2\u029cZ\3\2\2\2\u029d\u029e\7k\2\2\u029e\u029f\7p\2\2\u029f\u02a0"+
		"\7u\2\2\u02a0\u02a1\7g\2\2\u02a1\u02a2\7t\2\2\u02a2\u02b0\7v\2\2\u02a3"+
		"\u02a4\7K\2\2\u02a4\u02a5\7P\2\2\u02a5\u02a6\7U\2\2\u02a6\u02a7\7G\2\2"+
		"\u02a7\u02a8\7T\2\2\u02a8\u02b0\7V\2\2\u02a9\u02aa\7K\2\2\u02aa\u02ab"+
		"\7p\2\2\u02ab\u02ac\7u\2\2\u02ac\u02ad\7g\2\2\u02ad\u02ae\7t\2\2\u02ae"+
		"\u02b0\7v\2\2\u02af\u029d\3\2\2\2\u02af\u02a3\3\2\2\2\u02af\u02a9\3\2"+
		"\2\2\u02b0\\\3\2\2\2\u02b1\u02b2\7u\2\2\u02b2\u02b3\7g\2\2\u02b3\u02b4"+
		"\7n\2\2\u02b4\u02b5\7g\2\2\u02b5\u02b6\7e\2\2\u02b6\u02c4\7v\2\2\u02b7"+
		"\u02b8\7U\2\2\u02b8\u02b9\7G\2\2\u02b9\u02ba\7N\2\2\u02ba\u02bb\7G\2\2"+
		"\u02bb\u02bc\7E\2\2\u02bc\u02c4\7V\2\2\u02bd\u02be\7U\2\2\u02be\u02bf"+
		"\7g\2\2\u02bf\u02c0\7n\2\2\u02c0\u02c1\7g\2\2\u02c1\u02c2\7e\2\2\u02c2"+
		"\u02c4\7v\2\2\u02c3\u02b1\3\2\2\2\u02c3\u02b7\3\2\2\2\u02c3\u02bd\3\2"+
		"\2\2\u02c4^\3\2\2\2\u02c5\u02c6\7x\2\2\u02c6\u02c7\7c\2\2\u02c7\u02c8"+
		"\7n\2\2\u02c8\u02c9\7w\2\2\u02c9\u02ca\7g\2\2\u02ca\u02d8\7u\2\2\u02cb"+
		"\u02cc\7X\2\2\u02cc\u02cd\7C\2\2\u02cd\u02ce\7N\2\2\u02ce\u02cf\7W\2\2"+
		"\u02cf\u02d0\7G\2\2\u02d0\u02d8\7U\2\2\u02d1\u02d2\7X\2\2\u02d2\u02d3"+
		"\7c\2\2\u02d3\u02d4\7n\2\2\u02d4\u02d5\7w\2\2\u02d5\u02d6\7g\2\2\u02d6"+
		"\u02d8\7u\2\2\u02d7\u02c5\3\2\2\2\u02d7\u02cb\3\2\2\2\u02d7\u02d1\3\2"+
		"\2\2\u02d8`\3\2\2\2\u02d9\u02da\7k\2\2\u02da\u02db\7p\2\2\u02db\u02dc"+
		"\7v\2\2\u02dc\u02e6\7q\2\2\u02dd\u02de\7K\2\2\u02de\u02df\7P\2\2\u02df"+
		"\u02e0\7V\2\2\u02e0\u02e6\7Q\2\2\u02e1\u02e2\7K\2\2\u02e2\u02e3\7p\2\2"+
		"\u02e3\u02e4\7v\2\2\u02e4\u02e6\7q\2\2\u02e5\u02d9\3\2\2\2\u02e5\u02dd"+
		"\3\2\2\2\u02e5\u02e1\3\2\2\2\u02e6b\3\2\2\2\u02e7\u02e8\7w\2\2\u02e8\u02e9"+
		"\7r\2\2\u02e9\u02ea\7f\2\2\u02ea\u02eb\7c\2\2\u02eb\u02ec\7v\2\2\u02ec"+
		"\u02fa\7g\2\2\u02ed\u02ee\7W\2\2\u02ee\u02ef\7R\2\2\u02ef\u02f0\7F\2\2"+
		"\u02f0\u02f1\7C\2\2\u02f1\u02f2\7V\2\2\u02f2\u02fa\7G\2\2\u02f3\u02f4"+
		"\7W\2\2\u02f4\u02f5\7r\2\2\u02f5\u02f6\7f\2\2\u02f6\u02f7\7c\2\2\u02f7"+
		"\u02f8\7v\2\2\u02f8\u02fa\7g\2\2\u02f9\u02e7\3\2\2\2\u02f9\u02ed\3\2\2"+
		"\2\u02f9\u02f3\3\2\2\2\u02fad\3\2\2\2\u02fb\u02fc\7u\2\2\u02fc\u02fd\7"+
		"g\2\2\u02fd\u0305\7v\2\2\u02fe\u02ff\7U\2\2\u02ff\u0300\7G\2\2\u0300\u0305"+
		"\7V\2\2\u0301\u0302\7U\2\2\u0302\u0303\7g\2\2\u0303\u0305\7v\2\2\u0304"+
		"\u02fb\3\2\2\2\u0304\u02fe\3\2\2\2\u0304\u0301\3\2\2\2\u0305f\3\2\2\2"+
		"\u0306\u0307\7y\2\2\u0307\u0308\7j\2\2\u0308\u0309\7g\2\2\u0309\u030a"+
		"\7t\2\2\u030a\u0316\7g\2\2\u030b\u030c\7Y\2\2\u030c\u030d\7J\2\2\u030d"+
		"\u030e\7G\2\2\u030e\u030f\7T\2\2\u030f\u0316\7G\2\2\u0310\u0311\7Y\2\2"+
		"\u0311\u0312\7j\2\2\u0312\u0313\7g\2\2\u0313\u0314\7t\2\2\u0314\u0316"+
		"\7g\2\2\u0315\u0306\3\2\2\2\u0315\u030b\3\2\2\2\u0315\u0310\3\2\2\2\u0316"+
		"h\3\2\2\2\u0317\u0318\7f\2\2\u0318\u0319\7g\2\2\u0319\u031a\7n\2\2\u031a"+
		"\u031b\7g\2\2\u031b\u031c\7v\2\2\u031c\u032a\7g\2\2\u031d\u031e\7F\2\2"+
		"\u031e\u031f\7G\2\2\u031f\u0320\7N\2\2\u0320\u0321\7G\2\2\u0321\u0322"+
		"\7V\2\2\u0322\u032a\7G\2\2\u0323\u0324\7F\2\2\u0324\u0325\7g\2\2\u0325"+
		"\u0326\7n\2\2\u0326\u0327\7g\2\2\u0327\u0328\7v\2\2\u0328\u032a\7g\2\2"+
		"\u0329\u0317\3\2\2\2\u0329\u031d\3\2\2\2\u0329\u0323\3\2\2\2\u032aj\3"+
		"\2\2\2\u032b\u032c\7q\2\2\u032c\u032d\7t\2\2\u032d\u032e\7f\2\2\u032e"+
		"\u032f\7g\2\2\u032f\u033b\7t\2\2\u0330\u0331\7Q\2\2\u0331\u0332\7T\2\2"+
		"\u0332\u0333\7F\2\2\u0333\u0334\7G\2\2\u0334\u033b\7T\2\2\u0335\u0336"+
		"\7Q\2\2\u0336\u0337\7t\2\2\u0337\u0338\7f\2\2\u0338\u0339\7g\2\2\u0339"+
		"\u033b\7t\2\2\u033a\u032b\3\2\2\2\u033a\u0330\3\2\2\2\u033a\u0335\3\2"+
		"\2\2\u033bl\3\2\2\2\u033c\u033d\7d\2\2\u033d\u0343\7{\2\2\u033e\u033f"+
		"\7D\2\2\u033f\u0343\7[\2\2\u0340\u0341\7D\2\2\u0341\u0343\7{\2\2\u0342"+
		"\u033c\3\2\2\2\u0342\u033e\3\2\2\2\u0342\u0340\3\2\2\2\u0343n\3\2\2\2"+
		"\u0344\u0345\7c\2\2\u0345\u0346\7u\2\2\u0346\u034e\7e\2\2\u0347\u0348"+
		"\7C\2\2\u0348\u0349\7U\2\2\u0349\u034e\7E\2\2\u034a\u034b\7C\2\2\u034b"+
		"\u034c\7u\2\2\u034c\u034e\7e\2\2\u034d\u0344\3\2\2\2\u034d\u0347\3\2\2"+
		"\2\u034d\u034a\3\2\2\2\u034ep\3\2\2\2\u034f\u0350\7f\2\2\u0350\u0351\7"+
		"g\2\2\u0351\u0352\7u\2\2\u0352\u035c\7e\2\2\u0353\u0354\7F\2\2\u0354\u0355"+
		"\7G\2\2\u0355\u0356\7U\2\2\u0356\u035c\7E\2\2\u0357\u0358\7F\2\2\u0358"+
		"\u0359\7g\2\2\u0359\u035a\7u\2\2\u035a\u035c\7e\2\2\u035b\u034f\3\2\2"+
		"\2\u035b\u0353\3\2\2\2\u035b\u0357\3\2\2\2\u035cr\3\2\2\2\u035d\u035e"+
		"\7p\2\2\u035e\u035f\7w\2\2\u035f\u0360\7n\2\2\u0360\u036a\7n\2\2\u0361"+
		"\u0362\7P\2\2\u0362\u0363\7W\2\2\u0363\u0364\7N\2\2\u0364\u036a\7N\2\2"+
		"\u0365\u0366\7P\2\2\u0366\u0367\7w\2\2\u0367\u0368\7n\2\2\u0368\u036a"+
		"\7n\2\2\u0369\u035d\3\2\2\2\u0369\u0361\3\2\2\2\u0369\u0365\3\2\2\2\u036a"+
		"t\3\2\2\2\u036b\u036c\t\2\2\2\u036cv\3\2\2\2\u036d\u036e\4\62;\2\u036e"+
		"x\3\2\2\2\u036f\u0371\t\3\2\2\u0370\u036f\3\2\2\2\u0371z\3\2\2\2\u0372"+
		"\u0378\5u;\2\u0373\u0377\5u;\2\u0374\u0377\5w<\2\u0375\u0377\7a\2\2\u0376"+
		"\u0373\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u037a\3\2"+
		"\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379|\3\2\2\2\u037a\u0378"+
		"\3\2\2\2\u037b\u037f\5w<\2\u037c\u037e\5w<\2\u037d\u037c\3\2\2\2\u037e"+
		"\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380~\3\2\2\2"+
		"\u0381\u037f\3\2\2\2\u0382\u0389\7)\2\2\u0383\u038a\5u;\2\u0384\u038a"+
		"\5w<\2\u0385\u038a\t\4\2\2\u0386\u0387\7\u0080\2\2\u0387\u038a\7\13\2"+
		"\2\u0388\u038a\t\5\2\2\u0389\u0383\3\2\2\2\u0389\u0384\3\2\2\2\u0389\u0385"+
		"\3\2\2\2\u0389\u0386\3\2\2\2\u0389\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038c\7)\2\2\u038c\u0080\3\2\2\2\u038d\u0392\t\6\2\2\u038e\u038f\7\17"+
		"\2\2\u038f\u0392\7\f\2\2\u0390\u0392\7\17\2\2\u0391\u038d\3\2\2\2\u0391"+
		"\u038e\3\2\2\2\u0391\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\bA"+
		"\2\2\u0394\u0082\3\2\2\2\u0395\u0396\7\61\2\2\u0396\u0397\7\61\2\2\u0397"+
		"\u039b\3\2\2\2\u0398\u039a\n\7\2\2\u0399\u0398\3\2\2\2\u039a\u039d\3\2"+
		"\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039e\u039f\bB\3\2\u039f\u0084\3\2\2\2\64\2\u00b9\u00d3"+
		"\u00f0\u0101\u0115\u0123\u012b\u0139\u0144\u0164\u017b\u0192\u019d\u01bd"+
		"\u01ce\u01d9\u01ea\u01f8\u0206\u0211\u0219\u0224\u0235\u0249\u0254\u0268"+
		"\u027f\u028d\u029b\u02af\u02c3\u02d7\u02e5\u02f9\u0304\u0315\u0329\u033a"+
		"\u0342\u034d\u035b\u0369\u0370\u0376\u0378\u037f\u0389\u0391\u039b\4\3"+
		"A\2\3B\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}