// Generated from D:/workspace/com/miles-self/miles-common/miles-common-antlr4/src/main/resources/Mysql.g4 by ANTLR 4.13.1

    package self.miles.common.antlr4.mysql;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MysqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SCOL=11, DOT=12, OPEN_PAR=13, CLOSE_PAR=14, COMMA=15, ASSIGN=16, 
		STAR=17, PLUS=18, MINUS=19, CREAT_=20, TABLE_=21, IF_=22, NOT_=23, NULL_=24, 
		UNIQUE_=25, CHECK_=26, DEFAULT_=27, EXISTS_=28, WITHOUT_=29, TEMP_=30, 
		TEMPORARY_=31, PRIMARY_=32, KEY_=33, COLLATE_=34, GENERATED_=35, ALWAYS_=36, 
		STORED_=37, VIRTUAL_=38, CONSTRAINT_=39, ABORT_=40, ACTION_=41, ADD_=42, 
		AFTER_=43, ALL_=44, ALTER_=45, ANALYZE_=46, AND_=47, AS_=48, ASC_=49, 
		ATTACH_=50, AUTOINCREMENT_=51, BEFORE_=52, BEGIN_=53, BETWEEN_=54, BY_=55, 
		CASCADE_=56, CASE_=57, CAST_=58, COMMENT_=59, DIGIT=60, LETTER=61, ANYDL=62, 
		STRING_IDEENTIFIRE=63, STRING=64, IDENTIFIER=65, BACKQUOTED_IDENTIFIER=66, 
		SIMPLE_COMMENT=67, BRACKETED_EMPTY_COMMENT=68, BRACKETED_COMMENT=69, WS=70;
	public static final int
		RULE_parse = 0, RULE_sql_stat = 1, RULE_mysql_crt_stmt = 2, RULE_c_table = 3, 
		RULE_c_column = 4, RULE_table_constraint = 5, RULE_column_constraint = 6, 
		RULE_schema_name = 7, RULE_tableName = 8, RULE_column_name = 9, RULE_collation_name = 10, 
		RULE_indexed_column = 11, RULE_commonStr = 12, RULE_type_name = 13, RULE_identifier = 14, 
		RULE_quotedIdentifier = 15, RULE_signed_number = 16, RULE_string = 17, 
		RULE_asc_desc = 18, RULE_conflict_clause = 19, RULE_update_clause = 20, 
		RULE_expr = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stat", "mysql_crt_stmt", "c_table", "c_column", "table_constraint", 
			"column_constraint", "schema_name", "tableName", "column_name", "collation_name", 
			"indexed_column", "commonStr", "type_name", "identifier", "quotedIdentifier", 
			"signed_number", "string", "asc_desc", "conflict_clause", "update_clause", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'unsigned'", "'signed'", "'DESC'", "'ON DELETE CASCADE'", "'ON UPDATE CASCADE'", 
			"'ON DELETE SET NULL'", "'ON UPDATE SET NULL'", "'ON UPDATE CURRENT_TIMESTAMP'", 
			"'>'", "'<'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", 
			"'-'", "'CREATE'", "'TABLE'", "'IF'", "'NOT'", "'NULL'", "'UNIQUE'", 
			"'CHECK'", "'DEFAULT'", "'EXISTS'", "'WITHOUT'", "'TEMP'", "'TEMPORARY'", 
			"'PRIMARY'", "'KEY'", "'COLLATE'", "'GENERATED'", "'ALWAYS'", "'STORED'", 
			"'VIRTUAL'", "'CONSTRAINT'", "'ABORT'", "'ACTION'", "'ADD'", "'AFTER'", 
			"'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'AS'", "'ASC'", "'ATTACH'", 
			"'AUTO_INCREMENT'", "'BEFORE'", "'BEGIN'", "'BETWEEN'", "'BY'", "'CASCADE'", 
			"'CASE'", "'CAST'", "'COMMENT'", null, null, null, null, null, null, 
			null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SCOL", 
			"DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", 
			"CREAT_", "TABLE_", "IF_", "NOT_", "NULL_", "UNIQUE_", "CHECK_", "DEFAULT_", 
			"EXISTS_", "WITHOUT_", "TEMP_", "TEMPORARY_", "PRIMARY_", "KEY_", "COLLATE_", 
			"GENERATED_", "ALWAYS_", "STORED_", "VIRTUAL_", "CONSTRAINT_", "ABORT_", 
			"ACTION_", "ADD_", "AFTER_", "ALL_", "ALTER_", "ANALYZE_", "AND_", "AS_", 
			"ASC_", "ATTACH_", "AUTOINCREMENT_", "BEFORE_", "BEGIN_", "BETWEEN_", 
			"BY_", "CASCADE_", "CASE_", "CAST_", "COMMENT_", "DIGIT", "LETTER", "ANYDL", 
			"STRING_IDEENTIFIRE", "STRING", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
			"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Mysql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MysqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MysqlParser.EOF, 0); }
		public Sql_statContext sql_stat() {
			return getRuleContext(Sql_statContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			sql_stat();
			}
			setState(45);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_statContext extends ParserRuleContext {
		public Mysql_crt_stmtContext mysql_crt_stmt() {
			return getRuleContext(Mysql_crt_stmtContext.class,0);
		}
		public Sql_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterSql_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitSql_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitSql_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_statContext sql_stat() throws RecognitionException {
		Sql_statContext _localctx = new Sql_statContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			mysql_crt_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mysql_crt_stmtContext extends ParserRuleContext {
		public Token row_ROW_ID;
		public C_tableContext c_table() {
			return getRuleContext(C_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(MysqlParser.OPEN_PAR, 0); }
		public List<C_columnContext> c_column() {
			return getRuleContexts(C_columnContext.class);
		}
		public C_columnContext c_column(int i) {
			return getRuleContext(C_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MysqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MysqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MysqlParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode WITHOUT_() { return getToken(MysqlParser.WITHOUT_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MysqlParser.IDENTIFIER, 0); }
		public Mysql_crt_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysql_crt_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterMysql_crt_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitMysql_crt_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitMysql_crt_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mysql_crt_stmtContext mysql_crt_stmt() throws RecognitionException {
		Mysql_crt_stmtContext _localctx = new Mysql_crt_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mysql_crt_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			c_table();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(50);
				match(OPEN_PAR);
				setState(51);
				c_column();
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(52);
						match(COMMA);
						setState(53);
						c_column();
						}
						} 
					}
					setState(58);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(59);
					match(COMMA);
					setState(60);
					table_constraint();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(CLOSE_PAR);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHOUT_) {
					{
					setState(67);
					match(WITHOUT_);
					setState(68);
					((Mysql_crt_stmtContext)_localctx).row_ROW_ID = match(IDENTIFIER);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_tableContext extends ParserRuleContext {
		public TerminalNode CREAT_() { return getToken(MysqlParser.CREAT_, 0); }
		public TerminalNode TABLE_() { return getToken(MysqlParser.TABLE_, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF_() { return getToken(MysqlParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(MysqlParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(MysqlParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MysqlParser.DOT, 0); }
		public TerminalNode TEMP_() { return getToken(MysqlParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(MysqlParser.TEMPORARY_, 0); }
		public C_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterC_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitC_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitC_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_tableContext c_table() throws RecognitionException {
		C_tableContext _localctx = new C_tableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_c_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(CREAT_);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(77);
			match(TABLE_);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF_) {
				{
				setState(78);
				match(IF_);
				setState(79);
				match(NOT_);
				setState(80);
				match(EXISTS_);
				}
			}

			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(83);
				schema_name();
				setState(84);
				match(DOT);
				}
				break;
			}
			setState(88);
			tableName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class C_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public TerminalNode COMMENT_() { return getToken(MysqlParser.COMMENT_, 0); }
		public CommonStrContext commonStr() {
			return getRuleContext(CommonStrContext.class,0);
		}
		public C_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterC_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitC_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitC_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_columnContext c_column() throws RecognitionException {
		C_columnContext _localctx = new C_columnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_c_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			column_name();
			setState(91);
			type_name();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2533330885017600L) != 0)) {
				{
				{
				setState(95);
				column_constraint();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT_) {
				{
				setState(101);
				match(COMMENT_);
				setState(102);
				commonStr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(MysqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MysqlParser.CLOSE_PAR, 0); }
		public TerminalNode CHECK_() { return getToken(MysqlParser.CHECK_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT_() { return getToken(MysqlParser.CONSTRAINT_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(MysqlParser.PRIMARY_, 0); }
		public TerminalNode KEY_() { return getToken(MysqlParser.KEY_, 0); }
		public TerminalNode UNIQUE_() { return getToken(MysqlParser.UNIQUE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MysqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MysqlParser.COMMA, i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(105);
				match(CONSTRAINT_);
				setState(106);
				identifier();
				}
			}

			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE_:
			case PRIMARY_:
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY_:
					{
					setState(109);
					match(PRIMARY_);
					setState(110);
					match(KEY_);
					}
					break;
				case UNIQUE_:
					{
					setState(111);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114);
				match(OPEN_PAR);
				setState(115);
				indexed_column();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(116);
					match(COMMA);
					setState(117);
					indexed_column();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(CLOSE_PAR);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					setState(124);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(127);
				match(CHECK_);
				setState(128);
				match(OPEN_PAR);
				setState(129);
				expr();
				setState(130);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY_() { return getToken(MysqlParser.PRIMARY_, 0); }
		public TerminalNode KEY_() { return getToken(MysqlParser.KEY_, 0); }
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode AUTOINCREMENT_() { return getToken(MysqlParser.AUTOINCREMENT_, 0); }
		public TerminalNode NULL_() { return getToken(MysqlParser.NULL_, 0); }
		public TerminalNode UNIQUE_() { return getToken(MysqlParser.UNIQUE_, 0); }
		public TerminalNode NOT_() { return getToken(MysqlParser.NOT_, 0); }
		public TerminalNode CHECK_() { return getToken(MysqlParser.CHECK_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MysqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MysqlParser.CLOSE_PAR, 0); }
		public TerminalNode DEFAULT_() { return getToken(MysqlParser.DEFAULT_, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode LETTER() { return getToken(MysqlParser.LETTER, 0); }
		public Update_clauseContext update_clause() {
			return getRuleContext(Update_clauseContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(MysqlParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(MysqlParser.AS_, 0); }
		public TerminalNode GENERATED_() { return getToken(MysqlParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(MysqlParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(MysqlParser.STORED_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(MysqlParser.VIRTUAL_, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_constraint);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(134);
				match(PRIMARY_);
				setState(135);
				match(KEY_);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==ASC_) {
					{
					setState(136);
					asc_desc();
					}
				}

				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					setState(139);
					conflict_clause();
					}
				}

				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(142);
					match(AUTOINCREMENT_);
					}
					break;
				}
				}
				}
				break;
			case AUTOINCREMENT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(AUTOINCREMENT_);
				}
				break;
			case NOT_:
			case NULL_:
			case UNIQUE_:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT_:
				case NULL_:
					{
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(146);
						match(NOT_);
						}
					}

					setState(149);
					match(NULL_);
					}
					break;
				case UNIQUE_:
					{
					setState(150);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) {
					{
					setState(153);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(CHECK_);
				setState(157);
				match(OPEN_PAR);
				setState(158);
				expr();
				setState(159);
				match(CLOSE_PAR);
				}
				break;
			case DEFAULT_:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(DEFAULT_);
				setState(168);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(162);
					signed_number();
					}
					break;
				case LETTER:
					{
					setState(163);
					match(LETTER);
					}
					break;
				case OPEN_PAR:
					{
					setState(164);
					match(OPEN_PAR);
					setState(165);
					expr();
					setState(166);
					match(CLOSE_PAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(170);
					update_clause();
					}
				}

				}
				break;
			case COLLATE_:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(COLLATE_);
				setState(174);
				collation_name();
				}
				break;
			case GENERATED_:
			case AS_:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERATED_) {
					{
					setState(175);
					match(GENERATED_);
					setState(176);
					match(ALWAYS_);
					}
				}

				setState(179);
				match(AS_);
				setState(180);
				match(OPEN_PAR);
				setState(181);
				expr();
				setState(182);
				match(CLOSE_PAR);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED_ || _la==VIRTUAL_) {
					{
					setState(183);
					_la = _input.LA(1);
					if ( !(_la==STORED_ || _la==VIRTUAL_) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Schema_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Collation_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Indexed_columnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_indexed_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommonStrContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommonStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterCommonStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitCommonStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitCommonStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonStrContext commonStr() throws RecognitionException {
		CommonStrContext _localctx = new CommonStrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commonStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(198);
				string();
				}
				break;
			case STRING_IDEENTIFIRE:
			case IDENTIFIER:
				{
				setState(199);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(MysqlParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MysqlParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(MysqlParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			identifier();
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(203);
				match(OPEN_PAR);
				setState(204);
				signed_number();
				setState(205);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(207);
				match(OPEN_PAR);
				setState(208);
				signed_number();
				setState(209);
				match(COMMA);
				setState(210);
				signed_number();
				setState(211);
				match(CLOSE_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MysqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_IDEENTIFIRE() { return getToken(MysqlParser.STRING_IDEENTIFIRE, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==STRING_IDEENTIFIRE || _la==IDENTIFIER) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(MysqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(BACKQUOTED_IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MysqlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MysqlParser.DIGIT, i);
		}
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				match(DIGIT);
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MysqlParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Asc_descContext extends ParserRuleContext {
		public TerminalNode ASC_() { return getToken(MysqlParser.ASC_, 0); }
		public Asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterAsc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitAsc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitAsc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asc_descContext asc_desc() throws RecognitionException {
		Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==ASC_) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Conflict_clauseContext extends ParserRuleContext {
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Update_clauseContext extends ParserRuleContext {
		public Update_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterUpdate_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitUpdate_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitUpdate_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_clauseContext update_clause() throws RecognitionException {
		Update_clauseContext _localctx = new Update_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_update_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ANYDL() { return getToken(MysqlParser.ANYDL, 0); }
		public TerminalNode DIGIT() { return getToken(MysqlParser.DIGIT, 0); }
		public TerminalNode ASSIGN() { return getToken(MysqlParser.ASSIGN, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MysqlListener ) ((MysqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MysqlVisitor ) return ((MysqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ANYDL);
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
			match(DIGIT);
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

	public static final String _serializedATN =
		"\u0004\u0001F\u00ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00027\b\u0002"+
		"\n\u0002\f\u0002:\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b\u0002"+
		"\n\u0002\f\u0002A\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"F\b\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003L\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003R\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003W\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004^\b"+
		"\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004\f\u0004d\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005l\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005q\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005w\b\u0005"+
		"\n\u0005\f\u0005z\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005~\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0085\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008a\b"+
		"\u0006\u0001\u0006\u0003\u0006\u008d\b\u0006\u0001\u0006\u0003\u0006\u0090"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0098\b\u0006\u0001\u0006\u0003\u0006\u009b\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00a9\b\u0006\u0001\u0006\u0003\u0006\u00ac\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b2\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00b9\b\u0006\u0003\u0006\u00bb\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0003\f\u00c9\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d6\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u00dd\b\u0010"+
		"\u000b\u0010\f\u0010\u00de\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u00018\u0000\u0016\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*\u0000\u0007\u0001\u0000\u001e\u001f\u0001\u0000\u0001\u0002\u0001"+
		"\u0000%&\u0002\u0000??AA\u0002\u0000\u0003\u000311\u0001\u0000\u0004\u0007"+
		"\u0002\u0000\t\n\u0010\u0010\u00fa\u0000,\u0001\u0000\u0000\u0000\u0002"+
		"/\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006I\u0001"+
		"\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000"+
		"\f\u00ba\u0001\u0000\u0000\u0000\u000e\u00bc\u0001\u0000\u0000\u0000\u0010"+
		"\u00be\u0001\u0000\u0000\u0000\u0012\u00c0\u0001\u0000\u0000\u0000\u0014"+
		"\u00c2\u0001\u0000\u0000\u0000\u0016\u00c4\u0001\u0000\u0000\u0000\u0018"+
		"\u00c8\u0001\u0000\u0000\u0000\u001a\u00ca\u0001\u0000\u0000\u0000\u001c"+
		"\u00d7\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000\u0000 \u00dc"+
		"\u0001\u0000\u0000\u0000\"\u00e0\u0001\u0000\u0000\u0000$\u00e2\u0001"+
		"\u0000\u0000\u0000&\u00e4\u0001\u0000\u0000\u0000(\u00e6\u0001\u0000\u0000"+
		"\u0000*\u00e8\u0001\u0000\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0005"+
		"\u0000\u0000\u0001.\u0001\u0001\u0000\u0000\u0000/0\u0003\u0004\u0002"+
		"\u00000\u0003\u0001\u0000\u0000\u00001G\u0003\u0006\u0003\u000023\u0005"+
		"\r\u0000\u000038\u0003\b\u0004\u000045\u0005\u000f\u0000\u000057\u0003"+
		"\b\u0004\u000064\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009?\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000;<\u0005\u000f\u0000\u0000<>\u0003\n\u0005\u0000"+
		"=;\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000BE\u0005\u000e\u0000\u0000CD\u0005\u001d\u0000\u0000DF\u0005"+
		"A\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001"+
		"\u0000\u0000\u0000G2\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"H\u0005\u0001\u0000\u0000\u0000IK\u0005\u0014\u0000\u0000JL\u0007\u0000"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MQ\u0005\u0015\u0000\u0000NO\u0005\u0016\u0000\u0000"+
		"OP\u0005\u0017\u0000\u0000PR\u0005\u001c\u0000\u0000QN\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RV\u0001\u0000\u0000\u0000ST\u0003\u000e"+
		"\u0007\u0000TU\u0005\f\u0000\u0000UW\u0001\u0000\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0003"+
		"\u0010\b\u0000Y\u0007\u0001\u0000\u0000\u0000Z[\u0003\u0012\t\u0000[]"+
		"\u0003\u001a\r\u0000\\^\u0007\u0001\u0000\u0000]\\\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^b\u0001\u0000\u0000\u0000_a\u0003\f\u0006\u0000"+
		"`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cg\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000ef\u0005;\u0000\u0000fh\u0003\u0018\f\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000\u0000ij\u0005"+
		"\'\u0000\u0000jl\u0003\u001c\u000e\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l\u0084\u0001\u0000\u0000\u0000mn\u0005 \u0000\u0000"+
		"nq\u0005!\u0000\u0000oq\u0005\u0019\u0000\u0000pm\u0001\u0000\u0000\u0000"+
		"po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\r\u0000\u0000"+
		"sx\u0003\u0016\u000b\u0000tu\u0005\u000f\u0000\u0000uw\u0003\u0016\u000b"+
		"\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{}\u0005\u000e\u0000\u0000|~\u0003&\u0013\u0000}|\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0085\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u001a\u0000\u0000\u0080\u0081\u0005\r\u0000\u0000"+
		"\u0081\u0082\u0003*\u0015\u0000\u0082\u0083\u0005\u000e\u0000\u0000\u0083"+
		"\u0085\u0001\u0000\u0000\u0000\u0084p\u0001\u0000\u0000\u0000\u0084\u007f"+
		"\u0001\u0000\u0000\u0000\u0085\u000b\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005 \u0000\u0000\u0087\u0089\u0005!\u0000\u0000\u0088\u008a\u0003$"+
		"\u0012\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u008d\u0003&\u0013"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0090\u00053\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u00bb\u0001\u0000\u0000\u0000\u0091\u00bb\u00053\u0000\u0000\u0092"+
		"\u0094\u0005\u0017\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0005\u0018\u0000\u0000\u0096\u0098\u0005\u0019\u0000\u0000\u0097"+
		"\u0093\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0001\u0000\u0000\u0000\u0099\u009b\u0003&\u0013\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00bb"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001a\u0000\u0000\u009d\u009e"+
		"\u0005\r\u0000\u0000\u009e\u009f\u0003*\u0015\u0000\u009f\u00a0\u0005"+
		"\u000e\u0000\u0000\u00a0\u00bb\u0001\u0000\u0000\u0000\u00a1\u00a8\u0005"+
		"\u001b\u0000\u0000\u00a2\u00a9\u0003 \u0010\u0000\u00a3\u00a9\u0005=\u0000"+
		"\u0000\u00a4\u00a5\u0005\r\u0000\u0000\u00a5\u00a6\u0003*\u0015\u0000"+
		"\u00a6\u00a7\u0005\u000e\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0003(\u0014\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00bb\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\"\u0000\u0000\u00ae\u00bb\u0003\u0014\n\u0000\u00af\u00b0"+
		"\u0005#\u0000\u0000\u00b0\u00b2\u0005$\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u00050\u0000\u0000\u00b4\u00b5\u0005\r\u0000"+
		"\u0000\u00b5\u00b6\u0003*\u0015\u0000\u00b6\u00b8\u0005\u000e\u0000\u0000"+
		"\u00b7\u00b9\u0007\u0002\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000"+
		"\u00ba\u0086\u0001\u0000\u0000\u0000\u00ba\u0091\u0001\u0000\u0000\u0000"+
		"\u00ba\u0097\u0001\u0000\u0000\u0000\u00ba\u009c\u0001\u0000\u0000\u0000"+
		"\u00ba\u00a1\u0001\u0000\u0000\u0000\u00ba\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b1\u0001\u0000\u0000\u0000\u00bb\r\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0003\u001c\u000e\u0000\u00bd\u000f\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0003\u001c\u000e\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0003\u001c\u000e\u0000\u00c1\u0013\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0003\u001c\u000e\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0003\u001c\u000e\u0000\u00c5\u0017\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c9\u0003\"\u0011\u0000\u00c7\u00c9\u0003\u001c\u000e\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u0019"+
		"\u0001\u0000\u0000\u0000\u00ca\u00d5\u0003\u001c\u000e\u0000\u00cb\u00cc"+
		"\u0005\r\u0000\u0000\u00cc\u00cd\u0003 \u0010\u0000\u00cd\u00ce\u0005"+
		"\u000e\u0000\u0000\u00ce\u00d6\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\r\u0000\u0000\u00d0\u00d1\u0003 \u0010\u0000\u00d1\u00d2\u0005\u000f"+
		"\u0000\u0000\u00d2\u00d3\u0003 \u0010\u0000\u00d3\u00d4\u0005\u000e\u0000"+
		"\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000"+
		"\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u001b\u0001\u0000\u0000\u0000\u00d7\u00d8\u0007\u0003\u0000"+
		"\u0000\u00d8\u001d\u0001\u0000\u0000\u0000\u00d9\u00da\u0005B\u0000\u0000"+
		"\u00da\u001f\u0001\u0000\u0000\u0000\u00db\u00dd\u0005<\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"!\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005@\u0000\u0000\u00e1#\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0007\u0004\u0000\u0000\u00e3%\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0007\u0005\u0000\u0000\u00e5\'\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\b\u0000\u0000\u00e7)\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005>\u0000\u0000\u00e9\u00ea\u0007\u0006\u0000\u0000\u00ea"+
		"\u00eb\u0005<\u0000\u0000\u00eb+\u0001\u0000\u0000\u0000\u001d8?EGKQV"+
		"]bgkpx}\u0084\u0089\u008c\u008f\u0093\u0097\u009a\u00a8\u00ab\u00b1\u00b8"+
		"\u00ba\u00c8\u00d5\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}