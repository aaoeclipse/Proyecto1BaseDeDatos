// Generated from gramaticaDBMS.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaDBMSParser extends Parser {
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
		SPACEX=61, COMMENTX=62, DIGITX=63;
	public static final int
		RULE_literal = 0, RULE_fecha = 1, RULE_programa = 2, RULE_database = 3, 
		RULE_createDatabase = 4, RULE_alterDatabase = 5, RULE_dropDatabase = 6, 
		RULE_showDatabase = 7, RULE_useDatabase = 8, RULE_opTable = 9, RULE_tipo = 10, 
		RULE_createTable = 11, RULE_constraint = 12, RULE_primaryKey = 13, RULE_foreignKey = 14, 
		RULE_check = 15, RULE_exp = 16, RULE_expression = 17, RULE_andExpr = 18, 
		RULE_eqExpr = 19, RULE_relationExpr = 20, RULE_unaryExpr = 21, RULE_alterTable = 22, 
		RULE_action = 23, RULE_dropTable = 24, RULE_showTables = 25, RULE_showColumns = 26, 
		RULE_insertInto = 27, RULE_updateSet = 28, RULE_deleteFrom = 29, RULE_selectFrom = 30, 
		RULE_sep = 31, RULE_rel_op = 32, RULE_eq_op = 33, RULE_add_op = 34, RULE_mult_op = 35;
	public static final String[] ruleNames = {
		"literal", "fecha", "programa", "database", "createDatabase", "alterDatabase", 
		"dropDatabase", "showDatabase", "useDatabase", "opTable", "tipo", "createTable", 
		"constraint", "primaryKey", "foreignKey", "check", "exp", "expression", 
		"andExpr", "eqExpr", "relationExpr", "unaryExpr", "alterTable", "action", 
		"dropTable", "showTables", "showColumns", "insertInto", "updateSet", "deleteFrom", 
		"selectFrom", "sep", "rel_op", "eq_op", "add_op", "mult_op"
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
		"BY", "ASC", "DESC", "NULL", "IDX", "NUMX", "CHARX", "SPACEX", "COMMENTX", 
		"DIGITX"
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

	@Override
	public String getGrammarFileName() { return "gramaticaDBMS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaDBMSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public TerminalNode NUMX() { return getToken(gramaticaDBMSParser.NUMX, 0); }
		public TerminalNode CHARX() { return getToken(gramaticaDBMSParser.CHARX, 0); }
		public FechaContext fecha() {
			return getRuleContext(FechaContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDX:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(IDX);
				}
				break;
			case NUMX:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(NUMX);
				}
				break;
			case CHARX:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(CHARX);
				}
				break;
			case DIGITX:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				fecha();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FechaContext extends ParserRuleContext {
		public List<TerminalNode> DIGITX() { return getTokens(gramaticaDBMSParser.DIGITX); }
		public TerminalNode DIGITX(int i) {
			return getToken(gramaticaDBMSParser.DIGITX, i);
		}
		public FechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitFecha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FechaContext fecha() throws RecognitionException {
		FechaContext _localctx = new FechaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(DIGITX);
			setState(79);
			match(DIGITX);
			setState(80);
			match(DIGITX);
			setState(81);
			match(DIGITX);
			setState(82);
			match(T__0);
			setState(83);
			match(DIGITX);
			setState(84);
			match(DIGITX);
			setState(85);
			match(T__0);
			setState(86);
			match(DIGITX);
			setState(87);
			match(DIGITX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<DatabaseContext> database() {
			return getRuleContexts(DatabaseContext.class);
		}
		public DatabaseContext database(int i) {
			return getRuleContext(DatabaseContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programa);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP) | (1L << SHOW) | (1L << USE) | (1L << INSERT) | (1L << SELECT) | (1L << UPDATE) | (1L << DELETE))) != 0)) {
					{
					{
					setState(90);
					database();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseContext extends ParserRuleContext {
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public AlterDatabaseContext alterDatabase() {
			return getRuleContext(AlterDatabaseContext.class,0);
		}
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public ShowDatabaseContext showDatabase() {
			return getRuleContext(ShowDatabaseContext.class,0);
		}
		public UseDatabaseContext useDatabase() {
			return getRuleContext(UseDatabaseContext.class,0);
		}
		public OpTableContext opTable() {
			return getRuleContext(OpTableContext.class,0);
		}
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(98);
				createDatabase();
				}
				break;
			case 2:
				{
				setState(99);
				alterDatabase();
				}
				break;
			case 3:
				{
				setState(100);
				dropDatabase();
				}
				break;
			case 4:
				{
				setState(101);
				showDatabase();
				}
				break;
			case 5:
				{
				setState(102);
				useDatabase();
				}
				break;
			case 6:
				{
				setState(103);
				opTable();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(gramaticaDBMSParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(gramaticaDBMSParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(CREATE);
			setState(107);
			match(DATABASE);
			setState(108);
			match(IDX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(gramaticaDBMSParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(gramaticaDBMSParser.DATABASE, 0); }
		public List<TerminalNode> IDX() { return getTokens(gramaticaDBMSParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(gramaticaDBMSParser.IDX, i);
		}
		public TerminalNode RENAME() { return getToken(gramaticaDBMSParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(gramaticaDBMSParser.TO, 0); }
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitAlterDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alterDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ALTER);
			setState(111);
			match(DATABASE);
			setState(112);
			match(IDX);
			setState(113);
			match(RENAME);
			setState(114);
			match(TO);
			setState(115);
			match(IDX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(gramaticaDBMSParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(gramaticaDBMSParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(DROP);
			setState(118);
			match(DATABASE);
			setState(119);
			match(IDX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDatabaseContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(gramaticaDBMSParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(gramaticaDBMSParser.DATABASES, 0); }
		public ShowDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitShowDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDatabaseContext showDatabase() throws RecognitionException {
		ShowDatabaseContext _localctx = new ShowDatabaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_showDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(SHOW);
			setState(122);
			match(DATABASES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDatabaseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(gramaticaDBMSParser.USE, 0); }
		public TerminalNode DATABASE() { return getToken(gramaticaDBMSParser.DATABASE, 0); }
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public UseDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDatabase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitUseDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDatabaseContext useDatabase() throws RecognitionException {
		UseDatabaseContext _localctx = new UseDatabaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(USE);
			setState(125);
			match(DATABASE);
			setState(126);
			match(IDX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpTableContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public ShowTablesContext showTables() {
			return getRuleContext(ShowTablesContext.class,0);
		}
		public ShowColumnsContext showColumns() {
			return getRuleContext(ShowColumnsContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public UpdateSetContext updateSet() {
			return getRuleContext(UpdateSetContext.class,0);
		}
		public DeleteFromContext deleteFrom() {
			return getRuleContext(DeleteFromContext.class,0);
		}
		public SelectFromContext selectFrom() {
			return getRuleContext(SelectFromContext.class,0);
		}
		public OpTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitOpTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpTableContext opTable() throws RecognitionException {
		OpTableContext _localctx = new OpTableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_opTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(128);
				createTable();
				}
				break;
			case 2:
				{
				setState(129);
				alterTable();
				}
				break;
			case 3:
				{
				setState(130);
				dropTable();
				}
				break;
			case 4:
				{
				setState(131);
				showTables();
				}
				break;
			case 5:
				{
				setState(132);
				showColumns();
				}
				break;
			case 6:
				{
				setState(133);
				insertInto();
				}
				break;
			case 7:
				{
				setState(134);
				updateSet();
				}
				break;
			case 8:
				{
				setState(135);
				deleteFrom();
				}
				break;
			case 9:
				{
				setState(136);
				selectFrom();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramaticaDBMSParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gramaticaDBMSParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(gramaticaDBMSParser.DATE, 0); }
		public TerminalNode CHAR() { return getToken(gramaticaDBMSParser.CHAR, 0); }
		public TerminalNode NUMX() { return getToken(gramaticaDBMSParser.NUMX, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(FLOAT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(DATE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(CHAR);
				setState(143);
				match(T__1);
				setState(144);
				match(NUMX);
				setState(145);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(gramaticaDBMSParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(gramaticaDBMSParser.TABLE, 0); }
		public List<TerminalNode> IDX() { return getTokens(gramaticaDBMSParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(gramaticaDBMSParser.IDX, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> CONSTRAINT() { return getTokens(gramaticaDBMSParser.CONSTRAINT); }
		public TerminalNode CONSTRAINT(int i) {
			return getToken(gramaticaDBMSParser.CONSTRAINT, i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CREATE);
			setState(149);
			match(TABLE);
			setState(150);
			match(IDX);
			setState(151);
			match(T__1);
			setState(152);
			match(IDX);
			setState(153);
			tipo();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(154);
				match(T__3);
				setState(155);
				match(IDX);
				setState(156);
				tipo();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(162);
				match(CONSTRAINT);
				setState(163);
				constraint();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(164);
					match(T__3);
					setState(165);
					match(CONSTRAINT);
					setState(166);
					constraint();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(174);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public List<ForeignKeyContext> foreignKey() {
			return getRuleContexts(ForeignKeyContext.class);
		}
		public ForeignKeyContext foreignKey(int i) {
			return getRuleContext(ForeignKeyContext.class,i);
		}
		public List<CheckContext> check() {
			return getRuleContexts(CheckContext.class);
		}
		public CheckContext check(int i) {
			return getRuleContext(CheckContext.class,i);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constraint);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				primaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				foreignKey();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDX) {
					{
					{
					setState(178);
					foreignKey();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				check();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDX) {
					{
					{
					setState(185);
					check();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(gramaticaDBMSParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(gramaticaDBMSParser.IDX, i);
		}
		public TerminalNode PRIMARY() { return getToken(gramaticaDBMSParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(gramaticaDBMSParser.KEY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(IDX);
			setState(194);
			match(PRIMARY);
			setState(195);
			match(KEY);
			setState(196);
			match(T__1);
			setState(197);
			match(IDX);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(198);
				match(T__3);
				setState(199);
				match(IDX);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(gramaticaDBMSParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(gramaticaDBMSParser.IDX, i);
		}
		public TerminalNode FOREIGN() { return getToken(gramaticaDBMSParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(gramaticaDBMSParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(gramaticaDBMSParser.REFERENCES, 0); }
		public ForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitForeignKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyContext foreignKey() throws RecognitionException {
		ForeignKeyContext _localctx = new ForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_foreignKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IDX);
			setState(208);
			match(FOREIGN);
			setState(209);
			match(KEY);
			setState(210);
			match(T__1);
			setState(211);
			match(IDX);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(212);
				match(T__3);
				setState(213);
				match(IDX);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__2);
			setState(220);
			match(REFERENCES);
			setState(221);
			match(IDX);
			setState(222);
			match(T__1);
			setState(223);
			match(IDX);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(224);
				match(T__3);
				setState(225);
				match(IDX);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckContext extends ParserRuleContext {
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public TerminalNode CHECK() { return getToken(gramaticaDBMSParser.CHECK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IDX);
			setState(234);
			match(CHECK);
			{
			setState(235);
			exp();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				expression(0);
				}
				break;
			case EOF:
			case T__2:
			case T__3:
			case CREATE:
			case ALTER:
			case DROP:
			case SHOW:
			case USE:
			case INSERT:
			case SELECT:
			case UPDATE:
			case DELETE:
			case ORDER:
			case ASC:
			case DESC:
			case IDX:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(gramaticaDBMSParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(242);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(244);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(245);
					match(OR);
					setState(246);
					andExpr(0);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(gramaticaDBMSParser.AND, 0); }
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253);
			eqExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(255);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(256);
					match(AND);
					setState(257);
					eqExpr(0);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqExprContext extends ParserRuleContext {
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		return eqExpr(0);
	}

	private EqExprContext eqExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExprContext _localctx = new EqExprContext(_ctx, _parentState);
		EqExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_eqExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			relationExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eqExpr);
					setState(266);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(267);
					eq_op();
					setState(268);
					relationExpr(0);
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		return relationExpr(0);
	}

	private RelationExprContext relationExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationExprContext _localctx = new RelationExprContext(_ctx, _parentState);
		RelationExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_relationExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpr);
					setState(278);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(279);
					rel_op();
					setState(280);
					unaryExpr();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public TerminalNode NOT() { return getToken(gramaticaDBMSParser.NOT, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__1);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(288);
				match(NOT);
				}
			}

			setState(291);
			match(IDX);
			setState(292);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(gramaticaDBMSParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(gramaticaDBMSParser.TABLE, 0); }
		public List<TerminalNode> IDX() { return getTokens(gramaticaDBMSParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(gramaticaDBMSParser.IDX, i);
		}
		public TerminalNode RENAME() { return getToken(gramaticaDBMSParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(gramaticaDBMSParser.TO, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alterTable);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(ALTER);
				setState(295);
				match(TABLE);
				setState(296);
				match(IDX);
				setState(297);
				match(RENAME);
				setState(298);
				match(TO);
				setState(299);
				match(IDX);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(ALTER);
				setState(301);
				match(TABLE);
				setState(302);
				match(IDX);
				setState(303);
				action();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(304);
					match(T__3);
					setState(305);
					action();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(gramaticaDBMSParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(gramaticaDBMSParser.COLUMN, 0); }
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(gramaticaDBMSParser.CONSTRAINT, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public TerminalNode DROP() { return getToken(gramaticaDBMSParser.DROP, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_action);
		int _la;
		try {
			int _alt;
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(ADD);
				setState(314);
				match(COLUMN);
				setState(315);
				match(IDX);
				setState(316);
				tipo();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(317);
					match(CONSTRAINT);
					setState(318);
					constraint();
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(319);
							match(T__3);
							setState(320);
							constraint();
							}
							} 
						}
						setState(325);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(ADD);
				setState(329);
				match(CONSTRAINT);
				setState(330);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(DROP);
				setState(332);
				match(COLUMN);
				setState(333);
				match(IDX);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(DROP);
				setState(335);
				match(CONSTRAINT);
				setState(336);
				match(IDX);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(gramaticaDBMSParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(gramaticaDBMSParser.TABLE, 0); }
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(DROP);
			setState(340);
			match(TABLE);
			setState(341);
			match(IDX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(gramaticaDBMSParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(gramaticaDBMSParser.TABLES, 0); }
		public ShowTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTablesContext showTables() throws RecognitionException {
		ShowTablesContext _localctx = new ShowTablesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_showTables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(SHOW);
			setState(344);
			match(TABLES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowColumnsContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(gramaticaDBMSParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(gramaticaDBMSParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(gramaticaDBMSParser.FROM, 0); }
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public ShowColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumns; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowColumnsContext showColumns() throws RecognitionException {
		ShowColumnsContext _localctx = new ShowColumnsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_showColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(SHOW);
			setState(347);
			match(COLUMNS);
			setState(348);
			match(FROM);
			setState(349);
			match(IDX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(gramaticaDBMSParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(gramaticaDBMSParser.INTO, 0); }
		public List<TerminalNode> IDX() { return getTokens(gramaticaDBMSParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(gramaticaDBMSParser.IDX, i);
		}
		public TerminalNode VALUES() { return getToken(gramaticaDBMSParser.VALUES, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insertInto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(INSERT);
			setState(352);
			match(INTO);
			setState(353);
			match(IDX);
			setState(354);
			match(T__1);
			setState(355);
			match(IDX);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(356);
				match(T__3);
				setState(357);
				match(IDX);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(T__2);
			setState(364);
			match(VALUES);
			setState(365);
			match(T__1);
			setState(366);
			literal();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(367);
				match(T__3);
				setState(368);
				literal();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSetContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(gramaticaDBMSParser.UPDATE, 0); }
		public List<TerminalNode> IDX() { return getTokens(gramaticaDBMSParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(gramaticaDBMSParser.IDX, i);
		}
		public TerminalNode SET() { return getToken(gramaticaDBMSParser.SET, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(gramaticaDBMSParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UpdateSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitUpdateSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSetContext updateSet() throws RecognitionException {
		UpdateSetContext _localctx = new UpdateSetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_updateSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(UPDATE);
			setState(377);
			match(IDX);
			setState(378);
			match(SET);
			setState(379);
			match(IDX);
			setState(380);
			match(T__4);
			setState(381);
			tipo();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(382);
				match(T__3);
				setState(383);
				tipo();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(389);
				match(WHERE);
				setState(390);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteFromContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(gramaticaDBMSParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(gramaticaDBMSParser.FROM, 0); }
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public TerminalNode WHERE() { return getToken(gramaticaDBMSParser.WHERE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeleteFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFrom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitDeleteFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteFromContext deleteFrom() throws RecognitionException {
		DeleteFromContext _localctx = new DeleteFromContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deleteFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(DELETE);
			setState(394);
			match(FROM);
			setState(395);
			match(IDX);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(396);
				match(WHERE);
				setState(397);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectFromContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(gramaticaDBMSParser.SELECT, 0); }
		public SepContext sep() {
			return getRuleContext(SepContext.class,0);
		}
		public TerminalNode FROM() { return getToken(gramaticaDBMSParser.FROM, 0); }
		public TerminalNode IDX() { return getToken(gramaticaDBMSParser.IDX, 0); }
		public TerminalNode WHERE() { return getToken(gramaticaDBMSParser.WHERE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(gramaticaDBMSParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(gramaticaDBMSParser.BY, 0); }
		public List<TerminalNode> ASC() { return getTokens(gramaticaDBMSParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(gramaticaDBMSParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(gramaticaDBMSParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(gramaticaDBMSParser.DESC, i);
		}
		public SelectFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectFrom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitSelectFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectFromContext selectFrom() throws RecognitionException {
		SelectFromContext _localctx = new SelectFromContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selectFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(SELECT);
			setState(401);
			sep();
			setState(402);
			match(FROM);
			setState(403);
			match(IDX);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(404);
				match(WHERE);
				setState(405);
				exp();
				setState(422);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ORDER:
					{
					setState(406);
					match(ORDER);
					setState(407);
					match(BY);
					setState(408);
					exp();
					setState(409);
					match(ASC);
					}
					break;
				case DESC:
					{
					setState(411);
					match(DESC);
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3 || _la==DESC) {
						{
						setState(417);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__3:
							{
							setState(412);
							match(T__3);
							setState(413);
							exp();
							setState(414);
							match(ASC);
							}
							break;
						case DESC:
							{
							setState(416);
							match(DESC);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(421);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case EOF:
				case CREATE:
				case ALTER:
				case DROP:
				case SHOW:
				case USE:
				case INSERT:
				case SELECT:
				case UPDATE:
				case DELETE:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SepContext extends ParserRuleContext {
		public List<TerminalNode> IDX() { return getTokens(gramaticaDBMSParser.IDX); }
		public TerminalNode IDX(int i) {
			return getToken(gramaticaDBMSParser.IDX, i);
		}
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sep);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(T__5);
				}
				break;
			case IDX:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(IDX);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(428);
					match(T__3);
					setState(429);
					match(IDX);
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_opContext extends ParserRuleContext {
		public Mult_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaDBMSVisitor ) return ((gramaticaDBMSVisitor<? extends T>)visitor).visitMult_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 19:
			return eqExpr_sempred((EqExprContext)_localctx, predIndex);
		case 20:
			return relationExpr_sempred((RelationExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExpr_sempred(EqExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationExpr_sempred(RelationExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u01c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\5\2O\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\5\4c\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0095\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a0\n\r\f\r"+
		"\16\r\u00a3\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r"+
		"\5\r\u00af\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u00b6\n\16\f\16\16\16\u00b9"+
		"\13\16\3\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0\13\16\5\16\u00c2\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d9\n\20\f\20"+
		"\16\20\u00dc\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00e5\n\20"+
		"\f\20\16\20\u00e8\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00f2"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00fa\n\23\f\23\16\23\u00fd\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0105\n\24\f\24\16\24\u0108\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0111\n\25\f\25\16\25\u0114"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011d\n\26\f\26\16\26\u0120"+
		"\13\26\3\27\3\27\5\27\u0124\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0135\n\30\f\30\16\30\u0138"+
		"\13\30\5\30\u013a\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0144"+
		"\n\31\f\31\16\31\u0147\13\31\5\31\u0149\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0154\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0169"+
		"\n\35\f\35\16\35\u016c\13\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0174"+
		"\n\35\f\35\16\35\u0177\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\7\36\u0183\n\36\f\36\16\36\u0186\13\36\3\36\3\36\5\36\u018a\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u0191\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \7 \u01a4\n \f \16 \u01a7\13 \5 \u01a9\n \5 "+
		"\u01ab\n \3!\3!\3!\3!\7!\u01b1\n!\f!\16!\u01b4\13!\5!\u01b6\n!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3%\2\6$&(*&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFH\2\6\4\2\7\7\t\f\3\2\r\16\4\2\3\3\17\17"+
		"\4\2\b\b\20\21\u01d3\2N\3\2\2\2\4P\3\2\2\2\6b\3\2\2\2\bj\3\2\2\2\nl\3"+
		"\2\2\2\fp\3\2\2\2\16w\3\2\2\2\20{\3\2\2\2\22~\3\2\2\2\24\u008b\3\2\2\2"+
		"\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u00c1\3\2\2\2\34\u00c3\3\2\2\2\36"+
		"\u00d1\3\2\2\2 \u00eb\3\2\2\2\"\u00f1\3\2\2\2$\u00f3\3\2\2\2&\u00fe\3"+
		"\2\2\2(\u0109\3\2\2\2*\u0115\3\2\2\2,\u0121\3\2\2\2.\u0139\3\2\2\2\60"+
		"\u0153\3\2\2\2\62\u0155\3\2\2\2\64\u0159\3\2\2\2\66\u015c\3\2\2\28\u0161"+
		"\3\2\2\2:\u017a\3\2\2\2<\u018b\3\2\2\2>\u0192\3\2\2\2@\u01b5\3\2\2\2B"+
		"\u01b7\3\2\2\2D\u01b9\3\2\2\2F\u01bb\3\2\2\2H\u01bd\3\2\2\2JO\7<\2\2K"+
		"O\7=\2\2LO\7>\2\2MO\5\4\3\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\3"+
		"\3\2\2\2PQ\7A\2\2QR\7A\2\2RS\7A\2\2ST\7A\2\2TU\7\3\2\2UV\7A\2\2VW\7A\2"+
		"\2WX\7\3\2\2XY\7A\2\2YZ\7A\2\2Z\5\3\2\2\2[c\5\b\5\2\\^\5\b\5\2]\\\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2b[\3\2\2\2b_\3\2"+
		"\2\2c\7\3\2\2\2dk\5\n\6\2ek\5\f\7\2fk\5\16\b\2gk\5\20\t\2hk\5\22\n\2i"+
		"k\5\24\13\2jd\3\2\2\2je\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2"+
		"\2k\t\3\2\2\2lm\7\22\2\2mn\7\23\2\2no\7<\2\2o\13\3\2\2\2pq\7\25\2\2qr"+
		"\7\23\2\2rs\7<\2\2st\7\26\2\2tu\7\30\2\2uv\7<\2\2v\r\3\2\2\2wx\7\27\2"+
		"\2xy\7\23\2\2yz\7<\2\2z\17\3\2\2\2{|\7\31\2\2|}\7\24\2\2}\21\3\2\2\2~"+
		"\177\7\32\2\2\177\u0080\7\23\2\2\u0080\u0081\7<\2\2\u0081\23\3\2\2\2\u0082"+
		"\u008c\5\30\r\2\u0083\u008c\5.\30\2\u0084\u008c\5\62\32\2\u0085\u008c"+
		"\5\64\33\2\u0086\u008c\5\66\34\2\u0087\u008c\58\35\2\u0088\u008c\5:\36"+
		"\2\u0089\u008c\5<\37\2\u008a\u008c\5> \2\u008b\u0082\3\2\2\2\u008b\u0083"+
		"\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
		"\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\25\3\2\2\2\u008d\u0095\7!\2\2\u008e\u0095\7\"\2\2\u008f\u0095"+
		"\7#\2\2\u0090\u0091\7$\2\2\u0091\u0092\7\4\2\2\u0092\u0093\7=\2\2\u0093"+
		"\u0095\7\5\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2"+
		"\2\2\u0094\u0090\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\7\22\2\2\u0097\u0098"+
		"\7(\2\2\u0098\u0099\7<\2\2\u0099\u009a\7\4\2\2\u009a\u009b\7<\2\2\u009b"+
		"\u00a1\5\26\f\2\u009c\u009d\7\6\2\2\u009d\u009e\7<\2\2\u009e\u00a0\5\26"+
		"\f\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00ae\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\33"+
		"\2\2\u00a5\u00ab\5\32\16\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\7\33\2\2\u00a8"+
		"\u00aa\5\32\16\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00a4\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\5"+
		"\2\2\u00b1\31\3\2\2\2\u00b2\u00c2\5\34\17\2\u00b3\u00b7\5\36\20\2\u00b4"+
		"\u00b6\5\36\20\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c2\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00be\5 \21\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1\u00ba\3\2"+
		"\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\7\34\2\2\u00c5\u00c6"+
		"\7\36\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00cc\7<\2\2\u00c8\u00c9\7\6\2\2\u00c9"+
		"\u00cb\7<\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7\5\2\2\u00d0\35\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2\u00d3\7\35\2"+
		"\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00da\7<\2\2\u00d6\u00d7"+
		"\7\6\2\2\u00d7\u00d9\7<\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\5\2\2\u00de\u00df\7\37\2\2\u00df\u00e0\7<\2\2\u00e0"+
		"\u00e1\7\4\2\2\u00e1\u00e6\7<\2\2\u00e2\u00e3\7\6\2\2\u00e3\u00e5\7<\2"+
		"\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\5\2\2\u00ea"+
		"\37\3\2\2\2\u00eb\u00ec\7<\2\2\u00ec\u00ed\7 \2\2\u00ed\u00ee\5\"\22\2"+
		"\u00ee!\3\2\2\2\u00ef\u00f2\5$\23\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f0\3\2\2\2\u00f2#\3\2\2\2\u00f3\u00f4\b\23\1\2\u00f4\u00f5"+
		"\5&\24\2\u00f5\u00fb\3\2\2\2\u00f6\u00f7\f\3\2\2\u00f7\u00f8\7&\2\2\u00f8"+
		"\u00fa\5&\24\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc%\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff"+
		"\b\24\1\2\u00ff\u0100\5(\25\2\u0100\u0106\3\2\2\2\u0101\u0102\f\3\2\2"+
		"\u0102\u0103\7%\2\2\u0103\u0105\5(\25\2\u0104\u0101\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\'\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\b\25\1\2\u010a\u010b\5*\26\2\u010b\u0112\3"+
		"\2\2\2\u010c\u010d\f\3\2\2\u010d\u010e\5D#\2\u010e\u010f\5*\26\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010c\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113)\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116"+
		"\b\26\1\2\u0116\u0117\5,\27\2\u0117\u011e\3\2\2\2\u0118\u0119\f\3\2\2"+
		"\u0119\u011a\5B\"\2\u011a\u011b\5,\27\2\u011b\u011d\3\2\2\2\u011c\u0118"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"+\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\7\4\2\2\u0122\u0124\7\'\2\2"+
		"\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\7<\2\2\u0126\u0127\7\5\2\2\u0127-\3\2\2\2\u0128\u0129\7\25\2\2\u0129"+
		"\u012a\7(\2\2\u012a\u012b\7<\2\2\u012b\u012c\7\26\2\2\u012c\u012d\7\30"+
		"\2\2\u012d\u013a\7<\2\2\u012e\u012f\7\25\2\2\u012f\u0130\7(\2\2\u0130"+
		"\u0131\7<\2\2\u0131\u0136\5\60\31\2\u0132\u0133\7\6\2\2\u0133\u0135\5"+
		"\60\31\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u0128\3\2"+
		"\2\2\u0139\u012e\3\2\2\2\u013a/\3\2\2\2\u013b\u013c\7*\2\2\u013c\u013d"+
		"\7+\2\2\u013d\u013e\7<\2\2\u013e\u0148\5\26\f\2\u013f\u0140\7\33\2\2\u0140"+
		"\u0145\5\32\16\2\u0141\u0142\7\6\2\2\u0142\u0144\5\32\16\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u0154\3\2\2\2\u014a\u014b\7*\2\2\u014b\u014c\7\33\2\2\u014c"+
		"\u0154\5\32\16\2\u014d\u014e\7\27\2\2\u014e\u014f\7+\2\2\u014f\u0154\7"+
		"<\2\2\u0150\u0151\7\27\2\2\u0151\u0152\7\33\2\2\u0152\u0154\7<\2\2\u0153"+
		"\u013b\3\2\2\2\u0153\u014a\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0150\3\2"+
		"\2\2\u0154\61\3\2\2\2\u0155\u0156\7\27\2\2\u0156\u0157\7(\2\2\u0157\u0158"+
		"\7<\2\2\u0158\63\3\2\2\2\u0159\u015a\7\31\2\2\u015a\u015b\7)\2\2\u015b"+
		"\65\3\2\2\2\u015c\u015d\7\31\2\2\u015d\u015e\7,\2\2\u015e\u015f\7.\2\2"+
		"\u015f\u0160\7<\2\2\u0160\67\3\2\2\2\u0161\u0162\7/\2\2\u0162\u0163\7"+
		"\62\2\2\u0163\u0164\7<\2\2\u0164\u0165\7\4\2\2\u0165\u016a\7<\2\2\u0166"+
		"\u0167\7\6\2\2\u0167\u0169\7<\2\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\7\5\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7"+
		"\4\2\2\u0170\u0175\5\2\2\2\u0171\u0172\7\6\2\2\u0172\u0174\5\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\5\2\2\u0179"+
		"9\3\2\2\2\u017a\u017b\7\63\2\2\u017b\u017c\7<\2\2\u017c\u017d\7\64\2\2"+
		"\u017d\u017e\7<\2\2\u017e\u017f\7\7\2\2\u017f\u0184\5\26\f\2\u0180\u0181"+
		"\7\6\2\2\u0181\u0183\5\26\f\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2"+
		"\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u0188\7\65\2\2\u0188\u018a\5\"\22\2\u0189\u0187\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a;\3\2\2\2\u018b\u018c\7\66\2\2\u018c\u018d\7"+
		".\2\2\u018d\u0190\7<\2\2\u018e\u018f\7\65\2\2\u018f\u0191\5\"\22\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191=\3\2\2\2\u0192\u0193\7\60\2\2"+
		"\u0193\u0194\5@!\2\u0194\u0195\7.\2\2\u0195\u01aa\7<\2\2\u0196\u0197\7"+
		"\65\2\2\u0197\u01a8\5\"\22\2\u0198\u0199\7\67\2\2\u0199\u019a\78\2\2\u019a"+
		"\u019b\5\"\22\2\u019b\u019c\79\2\2\u019c\u01a9\3\2\2\2\u019d\u01a5\7:"+
		"\2\2\u019e\u019f\7\6\2\2\u019f\u01a0\5\"\22\2\u01a0\u01a1\79\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a4\7:\2\2\u01a3\u019e\3\2\2\2\u01a3\u01a2\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u0198\3\2\2\2\u01a8\u019d\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u0196\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab?\3\2\2\2\u01ac\u01b6\7\b\2\2\u01ad\u01b2\7<\2\2\u01ae"+
		"\u01af\7\6\2\2\u01af\u01b1\7<\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01ac\3\2\2\2\u01b5\u01ad\3\2\2\2\u01b6A\3\2\2\2"+
		"\u01b7\u01b8\t\2\2\2\u01b8C\3\2\2\2\u01b9\u01ba\t\3\2\2\u01baE\3\2\2\2"+
		"\u01bb\u01bc\t\4\2\2\u01bcG\3\2\2\2\u01bd\u01be\t\5\2\2\u01beI\3\2\2\2"+
		"\'N_bj\u008b\u0094\u00a1\u00ab\u00ae\u00b7\u00be\u00c1\u00cc\u00da\u00e6"+
		"\u00f1\u00fb\u0106\u0112\u011e\u0123\u0136\u0139\u0145\u0148\u0153\u016a"+
		"\u0175\u0184\u0189\u0190\u01a3\u01a5\u01a8\u01aa\u01b2\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}