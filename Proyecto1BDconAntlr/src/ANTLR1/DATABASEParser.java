// Generated from DATABASE.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DATABASEParser extends Parser {
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
	public static final int
		RULE_query = 0, RULE_ddlQuery = 1, RULE_createDbStmt = 2, RULE_alterDbStmt = 3, 
		RULE_dbName = 4, RULE_newDbName = 5, RULE_dropDbStmt = 6, RULE_showDbStmt = 7, 
		RULE_useDbStmt = 8, RULE_createTableStmt = 9, RULE_tableName = 10, RULE_columnDecl = 11, 
		RULE_tipo = 12, RULE_colName = 13, RULE_colConstraint = 14, RULE_localids = 15, 
		RULE_refids = 16, RULE_chNombre = 17, RULE_idTabla = 18, RULE_fkNombre = 19, 
		RULE_pkNombre = 20, RULE_alterTableStmt = 21, RULE_alterName = 22, RULE_newName = 23, 
		RULE_accion = 24, RULE_columnName = 25, RULE_singleColConstraint = 26, 
		RULE_dropTableStmt = 27, RULE_showTableStmt = 28, RULE_showColumnsStmt = 29, 
		RULE_expression = 30, RULE_andexpr = 31, RULE_factor = 32, RULE_primary = 33, 
		RULE_compareExpr = 34, RULE_term = 35, RULE_column = 36, RULE_table = 37, 
		RULE_rel_op = 38, RULE_dmlQuery = 39, RULE_multiInsert = 40, RULE_insertStmt = 41, 
		RULE_columnList = 42, RULE_valueList = 43, RULE_val = 44, RULE_updateStmt = 45, 
		RULE_columnsUpdate = 46, RULE_deleteStmt = 47, RULE_selectStmt = 48, RULE_selectList = 49, 
		RULE_orderExpr = 50, RULE_orderTerm = 51;
	public static final String[] ruleNames = {
		"query", "ddlQuery", "createDbStmt", "alterDbStmt", "dbName", "newDbName", 
		"dropDbStmt", "showDbStmt", "useDbStmt", "createTableStmt", "tableName", 
		"columnDecl", "tipo", "colName", "colConstraint", "localids", "refids", 
		"chNombre", "idTabla", "fkNombre", "pkNombre", "alterTableStmt", "alterName", 
		"newName", "accion", "columnName", "singleColConstraint", "dropTableStmt", 
		"showTableStmt", "showColumnsStmt", "expression", "andexpr", "factor", 
		"primary", "compareExpr", "term", "column", "table", "rel_op", "dmlQuery", 
		"multiInsert", "insertStmt", "columnList", "valueList", "val", "updateStmt", 
		"columnsUpdate", "deleteStmt", "selectStmt", "selectList", "orderExpr", 
		"orderTerm"
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

	@Override
	public String getGrammarFileName() { return "DATABASE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DATABASEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public DdlQueryContext ddlQuery() {
			return getRuleContext(DdlQueryContext.class,0);
		}
		public DmlQueryContext dmlQuery() {
			return getRuleContext(DmlQueryContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case ALTER:
			case DROP:
			case SHOW:
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				ddlQuery();
				}
				break;
			case INSERT:
			case UPDATE:
			case DELETE:
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				dmlQuery();
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

	public static class DdlQueryContext extends ParserRuleContext {
		public CreateDbStmtContext createDbStmt() {
			return getRuleContext(CreateDbStmtContext.class,0);
		}
		public AlterDbStmtContext alterDbStmt() {
			return getRuleContext(AlterDbStmtContext.class,0);
		}
		public DropDbStmtContext dropDbStmt() {
			return getRuleContext(DropDbStmtContext.class,0);
		}
		public ShowDbStmtContext showDbStmt() {
			return getRuleContext(ShowDbStmtContext.class,0);
		}
		public UseDbStmtContext useDbStmt() {
			return getRuleContext(UseDbStmtContext.class,0);
		}
		public CreateTableStmtContext createTableStmt() {
			return getRuleContext(CreateTableStmtContext.class,0);
		}
		public AlterTableStmtContext alterTableStmt() {
			return getRuleContext(AlterTableStmtContext.class,0);
		}
		public DropTableStmtContext dropTableStmt() {
			return getRuleContext(DropTableStmtContext.class,0);
		}
		public ShowTableStmtContext showTableStmt() {
			return getRuleContext(ShowTableStmtContext.class,0);
		}
		public ShowColumnsStmtContext showColumnsStmt() {
			return getRuleContext(ShowColumnsStmtContext.class,0);
		}
		public DdlQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterDdlQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitDdlQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitDdlQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlQueryContext ddlQuery() throws RecognitionException {
		DdlQueryContext _localctx = new DdlQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ddlQuery);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				createDbStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				alterDbStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				dropDbStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				showDbStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				useDbStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				createTableStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				alterTableStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				dropTableStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(116);
				showTableStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(117);
				showColumnsStmt();
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

	public static class CreateDbStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DATABASEParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(DATABASEParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public CreateDbStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDbStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterCreateDbStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitCreateDbStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitCreateDbStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDbStmtContext createDbStmt() throws RecognitionException {
		CreateDbStmtContext _localctx = new CreateDbStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createDbStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CREATE);
			setState(121);
			match(DATABASE);
			setState(122);
			match(ID);
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

	public static class AlterDbStmtContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(DATABASEParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(DATABASEParser.DATABASE, 0); }
		public DbNameContext dbName() {
			return getRuleContext(DbNameContext.class,0);
		}
		public TerminalNode RENAMETO() { return getToken(DATABASEParser.RENAMETO, 0); }
		public NewDbNameContext newDbName() {
			return getRuleContext(NewDbNameContext.class,0);
		}
		public AlterDbStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDbStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterAlterDbStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitAlterDbStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitAlterDbStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDbStmtContext alterDbStmt() throws RecognitionException {
		AlterDbStmtContext _localctx = new AlterDbStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterDbStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ALTER);
			setState(125);
			match(DATABASE);
			setState(126);
			dbName();
			setState(127);
			match(RENAMETO);
			setState(128);
			newDbName();
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

	public static class DbNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public DbNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterDbName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitDbName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitDbName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbNameContext dbName() throws RecognitionException {
		DbNameContext _localctx = new DbNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dbName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
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

	public static class NewDbNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public NewDbNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDbName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterNewDbName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitNewDbName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitNewDbName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDbNameContext newDbName() throws RecognitionException {
		NewDbNameContext _localctx = new NewDbNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_newDbName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
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

	public static class DropDbStmtContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(DATABASEParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(DATABASEParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public DropDbStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDbStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterDropDbStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitDropDbStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitDropDbStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDbStmtContext dropDbStmt() throws RecognitionException {
		DropDbStmtContext _localctx = new DropDbStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropDbStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DROP);
			setState(135);
			match(DATABASE);
			setState(136);
			match(ID);
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

	public static class ShowDbStmtContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(DATABASEParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(DATABASEParser.DATABASES, 0); }
		public ShowDbStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDbStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterShowDbStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitShowDbStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitShowDbStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDbStmtContext showDbStmt() throws RecognitionException {
		ShowDbStmtContext _localctx = new ShowDbStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_showDbStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(SHOW);
			setState(139);
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

	public static class UseDbStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(DATABASEParser.USE, 0); }
		public TerminalNode DATABASE() { return getToken(DATABASEParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public UseDbStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDbStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterUseDbStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitUseDbStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitUseDbStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDbStmtContext useDbStmt() throws RecognitionException {
		UseDbStmtContext _localctx = new UseDbStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDbStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(USE);
			setState(142);
			match(DATABASE);
			setState(143);
			match(ID);
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

	public static class CreateTableStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DATABASEParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DATABASEParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<ColumnDeclContext> columnDecl() {
			return getRuleContexts(ColumnDeclContext.class);
		}
		public ColumnDeclContext columnDecl(int i) {
			return getRuleContext(ColumnDeclContext.class,i);
		}
		public List<TerminalNode> CONSTRAINT() { return getTokens(DATABASEParser.CONSTRAINT); }
		public TerminalNode CONSTRAINT(int i) {
			return getToken(DATABASEParser.CONSTRAINT, i);
		}
		public List<ColConstraintContext> colConstraint() {
			return getRuleContexts(ColConstraintContext.class);
		}
		public ColConstraintContext colConstraint(int i) {
			return getRuleContext(ColConstraintContext.class,i);
		}
		public CreateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableStmtContext createTableStmt() throws RecognitionException {
		CreateTableStmtContext _localctx = new CreateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createTableStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(CREATE);
			setState(146);
			match(TABLE);
			setState(147);
			tableName();
			setState(148);
			match(T__0);
			{
			setState(149);
			columnDecl();
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					match(T__1);
					setState(151);
					columnDecl();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(157);
					match(T__1);
					setState(158);
					match(CONSTRAINT);
					setState(159);
					colConstraint();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(167);
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
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

	public static class ColumnDeclContext extends ParserRuleContext {
		public ColNameContext colName() {
			return getRuleContext(ColNameContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ColumnDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterColumnDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitColumnDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitColumnDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDeclContext columnDecl() throws RecognitionException {
		ColumnDeclContext _localctx = new ColumnDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columnDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			colName();
			setState(172);
			tipo();
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
		public TerminalNode INT() { return getToken(DATABASEParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DATABASEParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(DATABASEParser.DATE, 0); }
		public TerminalNode CHAR() { return getToken(DATABASEParser.CHAR, 0); }
		public TerminalNode NUM() { return getToken(DATABASEParser.NUM, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(FLOAT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(DATE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(CHAR);
				setState(178);
				match(T__0);
				setState(179);
				match(NUM);
				setState(180);
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

	public static class ColNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public ColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColNameContext colName() throws RecognitionException {
		ColNameContext _localctx = new ColNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_colName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ID);
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

	public static class ColConstraintContext extends ParserRuleContext {
		public PkNombreContext pkNombre() {
			return getRuleContext(PkNombreContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(DATABASEParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(DATABASEParser.KEY, 0); }
		public FkNombreContext fkNombre() {
			return getRuleContext(FkNombreContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(DATABASEParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(DATABASEParser.REFERENCES, 0); }
		public IdTablaContext idTabla() {
			return getRuleContext(IdTablaContext.class,0);
		}
		public ChNombreContext chNombre() {
			return getRuleContext(ChNombreContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(DATABASEParser.CHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<LocalidsContext> localids() {
			return getRuleContexts(LocalidsContext.class);
		}
		public LocalidsContext localids(int i) {
			return getRuleContext(LocalidsContext.class,i);
		}
		public List<RefidsContext> refids() {
			return getRuleContexts(RefidsContext.class);
		}
		public RefidsContext refids(int i) {
			return getRuleContext(RefidsContext.class,i);
		}
		public ColConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterColConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitColConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitColConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColConstraintContext colConstraint() throws RecognitionException {
		ColConstraintContext _localctx = new ColConstraintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_colConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(185);
				pkNombre();
				setState(186);
				match(PRIMARY);
				setState(187);
				match(KEY);
				setState(188);
				match(T__0);
				{
				setState(189);
				localids();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(190);
					match(T__1);
					setState(191);
					localids();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(197);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(199);
				fkNombre();
				setState(200);
				match(FOREIGN);
				setState(201);
				match(KEY);
				setState(202);
				match(T__0);
				{
				setState(203);
				localids();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(204);
					match(T__1);
					setState(205);
					localids();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(211);
				match(T__2);
				setState(212);
				match(REFERENCES);
				setState(213);
				idTabla();
				setState(214);
				match(T__0);
				{
				setState(215);
				refids();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(216);
					match(T__1);
					setState(217);
					refids();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(223);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(225);
				chNombre();
				setState(226);
				match(CHECK);
				setState(227);
				match(T__0);
				setState(228);
				expression(0);
				setState(229);
				match(T__2);
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

	public static class LocalidsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public LocalidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterLocalids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitLocalids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitLocalids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalidsContext localids() throws RecognitionException {
		LocalidsContext _localctx = new LocalidsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_localids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ID);
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

	public static class RefidsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public RefidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterRefids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitRefids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitRefids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefidsContext refids() throws RecognitionException {
		RefidsContext _localctx = new RefidsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_refids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ID);
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

	public static class ChNombreContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public ChNombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chNombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterChNombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitChNombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitChNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChNombreContext chNombre() throws RecognitionException {
		ChNombreContext _localctx = new ChNombreContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chNombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
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

	public static class IdTablaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public IdTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterIdTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitIdTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitIdTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdTablaContext idTabla() throws RecognitionException {
		IdTablaContext _localctx = new IdTablaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_idTabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
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

	public static class FkNombreContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public FkNombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fkNombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterFkNombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitFkNombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitFkNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FkNombreContext fkNombre() throws RecognitionException {
		FkNombreContext _localctx = new FkNombreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fkNombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
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

	public static class PkNombreContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public PkNombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkNombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterPkNombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitPkNombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitPkNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkNombreContext pkNombre() throws RecognitionException {
		PkNombreContext _localctx = new PkNombreContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pkNombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ID);
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

	public static class AlterTableStmtContext extends ParserRuleContext {
		public AlterTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableStmt; }
	 
		public AlterTableStmtContext() { }
		public void copyFrom(AlterTableStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RenameAlterContext extends AlterTableStmtContext {
		public TerminalNode ALTER() { return getToken(DATABASEParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DATABASEParser.TABLE, 0); }
		public AlterNameContext alterName() {
			return getRuleContext(AlterNameContext.class,0);
		}
		public TerminalNode RENAMETO() { return getToken(DATABASEParser.RENAMETO, 0); }
		public NewNameContext newName() {
			return getRuleContext(NewNameContext.class,0);
		}
		public RenameAlterContext(AlterTableStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterRenameAlter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitRenameAlter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitRenameAlter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AccionAlterContext extends AlterTableStmtContext {
		public TerminalNode ALTER() { return getToken(DATABASEParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(DATABASEParser.TABLE, 0); }
		public AlterNameContext alterName() {
			return getRuleContext(AlterNameContext.class,0);
		}
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public AccionAlterContext(AlterTableStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterAccionAlter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitAccionAlter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitAccionAlter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableStmtContext alterTableStmt() throws RecognitionException {
		AlterTableStmtContext _localctx = new AlterTableStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alterTableStmt);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new RenameAlterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(ALTER);
				setState(246);
				match(TABLE);
				setState(247);
				alterName();
				setState(248);
				match(RENAMETO);
				setState(249);
				newName();
				}
				break;
			case 2:
				_localctx = new AccionAlterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(ALTER);
				setState(252);
				match(TABLE);
				setState(253);
				alterName();
				setState(254);
				accion();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(255);
					match(T__1);
					setState(256);
					accion();
					}
					}
					setState(261);
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

	public static class AlterNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public AlterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterAlterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitAlterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitAlterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterNameContext alterName() throws RecognitionException {
		AlterNameContext _localctx = new AlterNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
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

	public static class NewNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public NewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterNewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitNewName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitNewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewNameContext newName() throws RecognitionException {
		NewNameContext _localctx = new NewNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ID);
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

	public static class AccionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(DATABASEParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(DATABASEParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<SingleColConstraintContext> singleColConstraint() {
			return getRuleContexts(SingleColConstraintContext.class);
		}
		public SingleColConstraintContext singleColConstraint(int i) {
			return getRuleContext(SingleColConstraintContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(DATABASEParser.CONSTRAINT, 0); }
		public ColConstraintContext colConstraint() {
			return getRuleContext(ColConstraintContext.class,0);
		}
		public TerminalNode DROP() { return getToken(DATABASEParser.DROP, 0); }
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterAccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitAccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitAccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_accion);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(ADD);
				setState(269);
				match(COLUMN);
				setState(270);
				columnName();
				setState(271);
				tipo();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(272);
					singleColConstraint();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(ADD);
				setState(279);
				match(CONSTRAINT);
				setState(280);
				colConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(DROP);
				setState(282);
				match(COLUMN);
				setState(283);
				columnName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(DROP);
				setState(285);
				match(CONSTRAINT);
				setState(286);
				match(ID);
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ID);
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

	public static class SingleColConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(DATABASEParser.CONSTRAINT, 0); }
		public PkNombreContext pkNombre() {
			return getRuleContext(PkNombreContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(DATABASEParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(DATABASEParser.KEY, 0); }
		public FkNombreContext fkNombre() {
			return getRuleContext(FkNombreContext.class,0);
		}
		public TerminalNode REFERENCES() { return getToken(DATABASEParser.REFERENCES, 0); }
		public IdTablaContext idTabla() {
			return getRuleContext(IdTablaContext.class,0);
		}
		public RefidsContext refids() {
			return getRuleContext(RefidsContext.class,0);
		}
		public ChNombreContext chNombre() {
			return getRuleContext(ChNombreContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(DATABASEParser.CHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleColConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleColConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterSingleColConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitSingleColConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitSingleColConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleColConstraintContext singleColConstraint() throws RecognitionException {
		SingleColConstraintContext _localctx = new SingleColConstraintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_singleColConstraint);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(CONSTRAINT);
				setState(292);
				pkNombre();
				setState(293);
				match(PRIMARY);
				setState(294);
				match(KEY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(CONSTRAINT);
				setState(297);
				fkNombre();
				setState(298);
				match(REFERENCES);
				setState(299);
				idTabla();
				setState(300);
				match(T__0);
				setState(301);
				refids();
				setState(302);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(CONSTRAINT);
				setState(305);
				chNombre();
				setState(306);
				match(CHECK);
				setState(307);
				match(T__0);
				setState(308);
				expression(0);
				setState(309);
				match(T__2);
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

	public static class DropTableStmtContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(DATABASEParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(DATABASEParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public DropTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterDropTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitDropTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitDropTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableStmtContext dropTableStmt() throws RecognitionException {
		DropTableStmtContext _localctx = new DropTableStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dropTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(DROP);
			setState(314);
			match(TABLE);
			setState(315);
			match(ID);
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

	public static class ShowTableStmtContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(DATABASEParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(DATABASEParser.TABLES, 0); }
		public ShowTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterShowTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitShowTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitShowTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTableStmtContext showTableStmt() throws RecognitionException {
		ShowTableStmtContext _localctx = new ShowTableStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_showTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(SHOW);
			setState(318);
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

	public static class ShowColumnsStmtContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(DATABASEParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(DATABASEParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(DATABASEParser.FROM, 0); }
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public ShowColumnsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumnsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterShowColumnsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitShowColumnsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitShowColumnsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowColumnsStmtContext showColumnsStmt() throws RecognitionException {
		ShowColumnsStmtContext _localctx = new ShowColumnsStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_showColumnsStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(SHOW);
			setState(321);
			match(COLUMNS);
			setState(322);
			match(FROM);
			setState(323);
			match(ID);
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
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(DATABASEParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			andexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(328);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(329);
					match(OR);
					setState(330);
					andexpr(0);
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class AndexprContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public TerminalNode AND() { return getToken(DATABASEParser.AND, 0); }
		public AndexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterAndexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitAndexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitAndexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndexprContext andexpr() throws RecognitionException {
		return andexpr(0);
	}

	private AndexprContext andexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexprContext _localctx = new AndexprContext(_ctx, _parentState);
		AndexprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_andexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(337);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpr);
					setState(339);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(340);
					match(AND);
					setState(341);
					factor();
					}
					} 
				}
				setState(346);
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

	public static class FactorContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DATABASEParser.NOT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NULL:
			case DATE_VAL:
			case NUM:
			case ID:
			case CHAR_VAL:
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				primary();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(NOT);
				setState(349);
				primary();
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

	public static class PrimaryContext extends ParserRuleContext {
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primary);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case DATE_VAL:
			case NUM:
			case ID:
			case CHAR_VAL:
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				compareExpr();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(T__0);
				setState(354);
				expression(0);
				setState(355);
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

	public static class CompareExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_compareExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			term();
			setState(360);
			rel_op();
			setState(361);
			term();
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

	public static class TermContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode NUM() { return getToken(DATABASEParser.NUM, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(DATABASEParser.FLOAT_VAL, 0); }
		public TerminalNode DATE_VAL() { return getToken(DATABASEParser.DATE_VAL, 0); }
		public TerminalNode CHAR_VAL() { return getToken(DATABASEParser.CHAR_VAL, 0); }
		public TerminalNode NULL() { return getToken(DATABASEParser.NULL, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_term);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				column();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(NUM);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(FLOAT_VAL);
				}
				break;
			case DATE_VAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(DATE_VAL);
				}
				break;
			case CHAR_VAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				match(CHAR_VAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				match(NULL);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_column);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				table();
				setState(373);
				match(T__3);
				setState(374);
				match(ID);
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(ID);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class DmlQueryContext extends ParserRuleContext {
		public MultiInsertContext multiInsert() {
			return getRuleContext(MultiInsertContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public DmlQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterDmlQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitDmlQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitDmlQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlQueryContext dmlQuery() throws RecognitionException {
		DmlQueryContext _localctx = new DmlQueryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dmlQuery);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				multiInsert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				updateStmt();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				deleteStmt();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				selectStmt();
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

	public static class MultiInsertContext extends ParserRuleContext {
		public List<InsertStmtContext> insertStmt() {
			return getRuleContexts(InsertStmtContext.class);
		}
		public InsertStmtContext insertStmt(int i) {
			return getRuleContext(InsertStmtContext.class,i);
		}
		public MultiInsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterMultiInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitMultiInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitMultiInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertContext multiInsert() throws RecognitionException {
		MultiInsertContext _localctx = new MultiInsertContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_multiInsert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(388);
			insertStmt();
			}
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(389);
				match(T__10);
				setState(390);
				insertStmt();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(DATABASEParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(DATABASEParser.INTO, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(DATABASEParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitInsertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_insertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(INSERT);
			setState(397);
			match(INTO);
			setState(398);
			table();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(399);
				columnList();
				}
			}

			setState(402);
			match(VALUES);
			setState(403);
			valueList();
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

	public static class ColumnListContext extends ParserRuleContext {
		public List<ColNameContext> colName() {
			return getRuleContexts(ColNameContext.class);
		}
		public ColNameContext colName(int i) {
			return getRuleContext(ColNameContext.class,i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__0);
			setState(406);
			colName();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(407);
				match(T__1);
				setState(408);
				colName();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
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

	public static class ValueListContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__0);
			setState(417);
			val();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(418);
				match(T__1);
				setState(419);
				val();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DATABASEParser.NUM, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(DATABASEParser.FLOAT_VAL, 0); }
		public TerminalNode DATE_VAL() { return getToken(DATABASEParser.DATE_VAL, 0); }
		public TerminalNode CHAR_VAL() { return getToken(DATABASEParser.CHAR_VAL, 0); }
		public TerminalNode NULL() { return getToken(DATABASEParser.NULL, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << DATE_VAL) | (1L << NUM) | (1L << CHAR_VAL) | (1L << FLOAT_VAL))) != 0)) ) {
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

	public static class UpdateStmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(DATABASEParser.UPDATE, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode SET() { return getToken(DATABASEParser.SET, 0); }
		public List<ColumnsUpdateContext> columnsUpdate() {
			return getRuleContexts(ColumnsUpdateContext.class);
		}
		public ColumnsUpdateContext columnsUpdate(int i) {
			return getRuleContext(ColumnsUpdateContext.class,i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(DATABASEParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterUpdateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitUpdateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitUpdateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(UPDATE);
			setState(430);
			table();
			setState(431);
			match(SET);
			setState(432);
			columnsUpdate();
			setState(433);
			match(T__8);
			setState(434);
			val();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(435);
				match(T__1);
				setState(436);
				columnsUpdate();
				setState(437);
				match(T__8);
				setState(438);
				val();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(445);
				match(WHERE);
				setState(446);
				expression(0);
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

	public static class ColumnsUpdateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DATABASEParser.ID, 0); }
		public ColumnsUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterColumnsUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitColumnsUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitColumnsUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsUpdateContext columnsUpdate() throws RecognitionException {
		ColumnsUpdateContext _localctx = new ColumnsUpdateContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_columnsUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(ID);
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

	public static class DeleteStmtContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DATABASEParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(DATABASEParser.FROM, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DATABASEParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterDeleteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitDeleteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitDeleteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(DELETE);
			setState(452);
			match(FROM);
			setState(453);
			table();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(454);
				match(WHERE);
				setState(455);
				expression(0);
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

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(DATABASEParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(DATABASEParser.FROM, 0); }
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DATABASEParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrderExprContext orderExpr() {
			return getRuleContext(OrderExprContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(SELECT);
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(459);
				match(T__11);
				}
				break;
			case ID:
				{
				setState(460);
				selectList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(463);
			match(FROM);
			setState(464);
			table();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(465);
				match(T__1);
				setState(466);
				table();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(472);
				match(WHERE);
				setState(473);
				expression(0);
				}
			}

			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(476);
				orderExpr();
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

	public static class SelectListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DATABASEParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DATABASEParser.ID, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(ID);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(480);
				match(T__1);
				setState(481);
				match(ID);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OrderExprContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(DATABASEParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DATABASEParser.BY, 0); }
		public List<OrderTermContext> orderTerm() {
			return getRuleContexts(OrderTermContext.class);
		}
		public OrderTermContext orderTerm(int i) {
			return getRuleContext(OrderTermContext.class,i);
		}
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterOrderExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitOrderExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitOrderExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(ORDER);
			setState(488);
			match(BY);
			{
			setState(489);
			orderTerm();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(490);
				match(T__1);
				setState(491);
				orderTerm();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OrderTermContext extends ParserRuleContext {
		public ColNameContext colName() {
			return getRuleContext(ColNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(DATABASEParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DATABASEParser.DESC, 0); }
		public OrderTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).enterOrderTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DATABASEListener ) ((DATABASEListener)listener).exitOrderTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DATABASEVisitor ) return ((DATABASEVisitor<? extends T>)visitor).visitOrderTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderTermContext orderTerm() throws RecognitionException {
		OrderTermContext _localctx = new OrderTermContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_orderTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			colName();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(498);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 31:
			return andexpr_sempred((AndexprContext)_localctx, predIndex);
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
	private boolean andexpr_sempred(AndexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u01f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\5\2m\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3y\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u009b\n\13\f\13\16\13\u009e\13\13\3\13\3\13\3\13\7\13\u00a3"+
		"\n\13\f\13\16\13\u00a6\13\13\5\13\u00a8\n\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b8\n\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c3\n\20\f\20\16\20\u00c6\13\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d1\n\20\f\20\16"+
		"\20\u00d4\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00dd\n\20\f\20"+
		"\16\20\u00e0\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ea"+
		"\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0104\n\27"+
		"\f\27\16\27\u0107\13\27\5\27\u0109\n\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0114\n\32\f\32\16\32\u0117\13\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0122\n\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u013a\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u014e\n \f \16 \u0151\13 \3"+
		"!\3!\3!\3!\3!\3!\7!\u0159\n!\f!\16!\u015c\13!\3\"\3\"\3\"\5\"\u0161\n"+
		"\"\3#\3#\3#\3#\3#\5#\u0168\n#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0174\n"+
		"%\3&\3&\3&\3&\3&\5&\u017b\n&\3\'\3\'\3(\3(\3)\3)\3)\3)\5)\u0185\n)\3*"+
		"\3*\3*\7*\u018a\n*\f*\16*\u018d\13*\3+\3+\3+\3+\5+\u0193\n+\3+\3+\3+\3"+
		",\3,\3,\3,\7,\u019c\n,\f,\16,\u019f\13,\3,\3,\3-\3-\3-\3-\7-\u01a7\n-"+
		"\f-\16-\u01aa\13-\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u01bb"+
		"\n/\f/\16/\u01be\13/\3/\3/\5/\u01c2\n/\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u01cb\n\61\3\62\3\62\3\62\5\62\u01d0\n\62\3\62\3\62\3\62\3\62"+
		"\7\62\u01d6\n\62\f\62\16\62\u01d9\13\62\3\62\3\62\5\62\u01dd\n\62\3\62"+
		"\5\62\u01e0\n\62\3\63\3\63\3\63\7\63\u01e5\n\63\f\63\16\63\u01e8\13\63"+
		"\3\64\3\64\3\64\3\64\3\64\7\64\u01ef\n\64\f\64\16\64\u01f2\13\64\3\65"+
		"\3\65\5\65\u01f6\n\65\3\65\2\4>@\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\5\3\2\7\f\5\2\64"+
		"\6489;<\4\2\63\63\65\65\u01fb\2l\3\2\2\2\4x\3\2\2\2\6z\3\2\2\2\b~\3\2"+
		"\2\2\n\u0084\3\2\2\2\f\u0086\3\2\2\2\16\u0088\3\2\2\2\20\u008c\3\2\2\2"+
		"\22\u008f\3\2\2\2\24\u0093\3\2\2\2\26\u00ab\3\2\2\2\30\u00ad\3\2\2\2\32"+
		"\u00b7\3\2\2\2\34\u00b9\3\2\2\2\36\u00e9\3\2\2\2 \u00eb\3\2\2\2\"\u00ed"+
		"\3\2\2\2$\u00ef\3\2\2\2&\u00f1\3\2\2\2(\u00f3\3\2\2\2*\u00f5\3\2\2\2,"+
		"\u0108\3\2\2\2.\u010a\3\2\2\2\60\u010c\3\2\2\2\62\u0121\3\2\2\2\64\u0123"+
		"\3\2\2\2\66\u0139\3\2\2\28\u013b\3\2\2\2:\u013f\3\2\2\2<\u0142\3\2\2\2"+
		">\u0147\3\2\2\2@\u0152\3\2\2\2B\u0160\3\2\2\2D\u0167\3\2\2\2F\u0169\3"+
		"\2\2\2H\u0173\3\2\2\2J\u017a\3\2\2\2L\u017c\3\2\2\2N\u017e\3\2\2\2P\u0184"+
		"\3\2\2\2R\u0186\3\2\2\2T\u018e\3\2\2\2V\u0197\3\2\2\2X\u01a2\3\2\2\2Z"+
		"\u01ad\3\2\2\2\\\u01af\3\2\2\2^\u01c3\3\2\2\2`\u01c5\3\2\2\2b\u01cc\3"+
		"\2\2\2d\u01e1\3\2\2\2f\u01e9\3\2\2\2h\u01f3\3\2\2\2jm\5\4\3\2km\5P)\2"+
		"lj\3\2\2\2lk\3\2\2\2m\3\3\2\2\2ny\5\6\4\2oy\5\b\5\2py\5\16\b\2qy\5\20"+
		"\t\2ry\5\22\n\2sy\5\24\13\2ty\5,\27\2uy\58\35\2vy\5:\36\2wy\5<\37\2xn"+
		"\3\2\2\2xo\3\2\2\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2x"+
		"u\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\5\3\2\2\2z{\7\17\2\2{|\7\20\2\2|}\7:\2"+
		"\2}\7\3\2\2\2~\177\7\22\2\2\177\u0080\7\20\2\2\u0080\u0081\5\n\6\2\u0081"+
		"\u0082\7\23\2\2\u0082\u0083\5\f\7\2\u0083\t\3\2\2\2\u0084\u0085\7:\2\2"+
		"\u0085\13\3\2\2\2\u0086\u0087\7:\2\2\u0087\r\3\2\2\2\u0088\u0089\7\24"+
		"\2\2\u0089\u008a\7\20\2\2\u008a\u008b\7:\2\2\u008b\17\3\2\2\2\u008c\u008d"+
		"\7\25\2\2\u008d\u008e\7\21\2\2\u008e\21\3\2\2\2\u008f\u0090\7\26\2\2\u0090"+
		"\u0091\7\20\2\2\u0091\u0092\7:\2\2\u0092\23\3\2\2\2\u0093\u0094\7\17\2"+
		"\2\u0094\u0095\7\27\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7\3\2\2\u0097"+
		"\u009c\5\30\r\2\u0098\u0099\7\4\2\2\u0099\u009b\5\30\r\2\u009a\u0098\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a7\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\7\34"+
		"\2\2\u00a1\u00a3\5\36\20\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\7\5\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7:\2\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00ae\5\34\17\2\u00ae\u00af\5\32\16\2\u00af\31\3\2\2\2\u00b0\u00b8\7"+
		"\30\2\2\u00b1\u00b8\7\31\2\2\u00b2\u00b8\7\32\2\2\u00b3\u00b4\7\33\2\2"+
		"\u00b4\u00b5\7\3\2\2\u00b5\u00b6\79\2\2\u00b6\u00b8\7\5\2\2\u00b7\u00b0"+
		"\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00ba\7:\2\2\u00ba\35\3\2\2\2\u00bb\u00bc\5*\26\2\u00bc"+
		"\u00bd\7\35\2\2\u00bd\u00be\7\36\2\2\u00be\u00bf\7\3\2\2\u00bf\u00c4\5"+
		" \21\2\u00c0\u00c1\7\4\2\2\u00c1\u00c3\5 \21\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00ea\3\2\2\2\u00c9"+
		"\u00ca\5(\25\2\u00ca\u00cb\7\37\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd\7"+
		"\3\2\2\u00cd\u00d2\5 \21\2\u00ce\u00cf\7\4\2\2\u00cf\u00d1\5 \21\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\5\2\2\u00d6"+
		"\u00d7\7!\2\2\u00d7\u00d8\5&\24\2\u00d8\u00d9\7\3\2\2\u00d9\u00de\5\""+
		"\22\2\u00da\u00db\7\4\2\2\u00db\u00dd\5\"\22\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\5\2\2\u00e2\u00ea\3\2\2\2\u00e3"+
		"\u00e4\5$\23\2\u00e4\u00e5\7 \2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e7\5> "+
		"\2\u00e7\u00e8\7\5\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00bb\3\2\2\2\u00e9\u00c9"+
		"\3\2\2\2\u00e9\u00e3\3\2\2\2\u00ea\37\3\2\2\2\u00eb\u00ec\7:\2\2\u00ec"+
		"!\3\2\2\2\u00ed\u00ee\7:\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7:\2\2\u00f0%"+
		"\3\2\2\2\u00f1\u00f2\7:\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\7:\2\2\u00f4)"+
		"\3\2\2\2\u00f5\u00f6\7:\2\2\u00f6+\3\2\2\2\u00f7\u00f8\7\22\2\2\u00f8"+
		"\u00f9\7\27\2\2\u00f9\u00fa\5.\30\2\u00fa\u00fb\7\23\2\2\u00fb\u00fc\5"+
		"\60\31\2\u00fc\u0109\3\2\2\2\u00fd\u00fe\7\22\2\2\u00fe\u00ff\7\27\2\2"+
		"\u00ff\u0100\5.\30\2\u0100\u0105\5\62\32\2\u0101\u0102\7\4\2\2\u0102\u0104"+
		"\5\62\32\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u00f7"+
		"\3\2\2\2\u0108\u00fd\3\2\2\2\u0109-\3\2\2\2\u010a\u010b\7:\2\2\u010b/"+
		"\3\2\2\2\u010c\u010d\7:\2\2\u010d\61\3\2\2\2\u010e\u010f\7&\2\2\u010f"+
		"\u0110\7#\2\2\u0110\u0111\5\64\33\2\u0111\u0115\5\32\16\2\u0112\u0114"+
		"\5\66\34\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0122\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119"+
		"\7&\2\2\u0119\u011a\7\34\2\2\u011a\u0122\5\36\20\2\u011b\u011c\7\24\2"+
		"\2\u011c\u011d\7#\2\2\u011d\u0122\5\64\33\2\u011e\u011f\7\24\2\2\u011f"+
		"\u0120\7\34\2\2\u0120\u0122\7:\2\2\u0121\u010e\3\2\2\2\u0121\u0118\3\2"+
		"\2\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122\63\3\2\2\2\u0123\u0124"+
		"\7:\2\2\u0124\65\3\2\2\2\u0125\u0126\7\34\2\2\u0126\u0127\5*\26\2\u0127"+
		"\u0128\7\35\2\2\u0128\u0129\7\36\2\2\u0129\u013a\3\2\2\2\u012a\u012b\7"+
		"\34\2\2\u012b\u012c\5(\25\2\u012c\u012d\7!\2\2\u012d\u012e\5&\24\2\u012e"+
		"\u012f\7\3\2\2\u012f\u0130\5\"\22\2\u0130\u0131\7\5\2\2\u0131\u013a\3"+
		"\2\2\2\u0132\u0133\7\34\2\2\u0133\u0134\5$\23\2\u0134\u0135\7 \2\2\u0135"+
		"\u0136\7\3\2\2\u0136\u0137\5> \2\u0137\u0138\7\5\2\2\u0138\u013a\3\2\2"+
		"\2\u0139\u0125\3\2\2\2\u0139\u012a\3\2\2\2\u0139\u0132\3\2\2\2\u013a\67"+
		"\3\2\2\2\u013b\u013c\7\24\2\2\u013c\u013d\7\27\2\2\u013d\u013e\7:\2\2"+
		"\u013e9\3\2\2\2\u013f\u0140\7\25\2\2\u0140\u0141\7\"\2\2\u0141;\3\2\2"+
		"\2\u0142\u0143\7\25\2\2\u0143\u0144\7$\2\2\u0144\u0145\7%\2\2\u0145\u0146"+
		"\7:\2\2\u0146=\3\2\2\2\u0147\u0148\b \1\2\u0148\u0149\5@!\2\u0149\u014f"+
		"\3\2\2\2\u014a\u014b\f\3\2\2\u014b\u014c\7(\2\2\u014c\u014e\5@!\2\u014d"+
		"\u014a\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150?\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b!\1\2\u0153\u0154"+
		"\5B\"\2\u0154\u015a\3\2\2\2\u0155\u0156\f\3\2\2\u0156\u0157\7\'\2\2\u0157"+
		"\u0159\5B\"\2\u0158\u0155\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015bA\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161"+
		"\5D#\2\u015e\u015f\7)\2\2\u015f\u0161\5D#\2\u0160\u015d\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161C\3\2\2\2\u0162\u0168\5F$\2\u0163\u0164\7\3\2\2\u0164"+
		"\u0165\5> \2\u0165\u0166\7\5\2\2\u0166\u0168\3\2\2\2\u0167\u0162\3\2\2"+
		"\2\u0167\u0163\3\2\2\2\u0168E\3\2\2\2\u0169\u016a\5H%\2\u016a\u016b\5"+
		"N(\2\u016b\u016c\5H%\2\u016cG\3\2\2\2\u016d\u0174\5J&\2\u016e\u0174\7"+
		"9\2\2\u016f\u0174\7<\2\2\u0170\u0174\78\2\2\u0171\u0174\7;\2\2\u0172\u0174"+
		"\7\64\2\2\u0173\u016d\3\2\2\2\u0173\u016e\3\2\2\2\u0173\u016f\3\2\2\2"+
		"\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174I\3"+
		"\2\2\2\u0175\u017b\7:\2\2\u0176\u0177\5L\'\2\u0177\u0178\7\6\2\2\u0178"+
		"\u0179\7:\2\2\u0179\u017b\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u0176\3\2"+
		"\2\2\u017bK\3\2\2\2\u017c\u017d\7:\2\2\u017dM\3\2\2\2\u017e\u017f\t\2"+
		"\2\2\u017fO\3\2\2\2\u0180\u0185\5R*\2\u0181\u0185\5\\/\2\u0182\u0185\5"+
		"`\61\2\u0183\u0185\5b\62\2\u0184\u0180\3\2\2\2\u0184\u0181\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185Q\3\2\2\2\u0186\u018b\5T+\2\u0187"+
		"\u0188\7\r\2\2\u0188\u018a\5T+\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2"+
		"\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cS\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018e\u018f\7*\2\2\u018f\u0190\7+\2\2\u0190\u0192\5L\'\2\u0191"+
		"\u0193\5V,\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2"+
		"\2\u0194\u0195\7\66\2\2\u0195\u0196\5X-\2\u0196U\3\2\2\2\u0197\u0198\7"+
		"\3\2\2\u0198\u019d\5\34\17\2\u0199\u019a\7\4\2\2\u019a\u019c\5\34\17\2"+
		"\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\5\2\2\u01a1"+
		"W\3\2\2\2\u01a2\u01a3\7\3\2\2\u01a3\u01a8\5Z.\2\u01a4\u01a5\7\4\2\2\u01a5"+
		"\u01a7\5Z.\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac"+
		"\7\5\2\2\u01acY\3\2\2\2\u01ad\u01ae\t\3\2\2\u01ae[\3\2\2\2\u01af\u01b0"+
		"\7-\2\2\u01b0\u01b1\5L\'\2\u01b1\u01b2\7.\2\2\u01b2\u01b3\5^\60\2\u01b3"+
		"\u01b4\7\13\2\2\u01b4\u01bc\5Z.\2\u01b5\u01b6\7\4\2\2\u01b6\u01b7\5^\60"+
		"\2\u01b7\u01b8\7\13\2\2\u01b8\u01b9\5Z.\2\u01b9\u01bb\3\2\2\2\u01ba\u01b5"+
		"\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01c1\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c2\5> "+
		"\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2]\3\2\2\2\u01c3\u01c4"+
		"\7:\2\2\u01c4_\3\2\2\2\u01c5\u01c6\7/\2\2\u01c6\u01c7\7%\2\2\u01c7\u01ca"+
		"\5L\'\2\u01c8\u01c9\7,\2\2\u01c9\u01cb\5> \2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cba\3\2\2\2\u01cc\u01cf\7\60\2\2\u01cd\u01d0\7\16\2"+
		"\2\u01ce\u01d0\5d\63\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\u01d2\7%\2\2\u01d2\u01d7\5L\'\2\u01d3\u01d4\7\4\2\2\u01d4"+
		"\u01d6\5L\'\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01db\7,\2\2\u01db\u01dd\5> \2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01df\3\2\2\2\u01de\u01e0\5f\64\2\u01df\u01de\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0c\3\2\2\2\u01e1\u01e6\7:\2\2\u01e2\u01e3\7\4\2\2\u01e3\u01e5"+
		"\7:\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7e\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\7\61\2\2"+
		"\u01ea\u01eb\7\62\2\2\u01eb\u01f0\5h\65\2\u01ec\u01ed\7\4\2\2\u01ed\u01ef"+
		"\5h\65\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1g\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\5\34\17"+
		"\2\u01f4\u01f6\t\4\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6i"+
		"\3\2\2\2&lx\u009c\u00a4\u00a7\u00b7\u00c4\u00d2\u00de\u00e9\u0105\u0108"+
		"\u0115\u0121\u0139\u014f\u015a\u0160\u0167\u0173\u017a\u0184\u018b\u0192"+
		"\u019d\u01a8\u01bc\u01c1\u01ca\u01cf\u01d7\u01dc\u01df\u01e6\u01f0\u01f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}