// Generated from D:/workspace/com/miles-self/miles-common/miles-common-antlr4/src/main/resources/SQLiteLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLiteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, CREAT_=10, TABLE_=11, IF_=12, NOT_=13, NULL_=14, UNIQUE_=15, 
		CHECK_=16, DEFAULT_=17, EXISTS_=18, WITHOUT_=19, TEMP_=20, TEMPORARY_=21, 
		PRIMARY_=22, KEY_=23, COLLATE_=24, GENERATED_=25, ALWAYS_=26, STORED_=27, 
		VIRTUAL_=28, CONSTRAINT_=29, ABORT_=30, ACTION_=31, ADD_=32, AFTER_=33, 
		ALL_=34, ALTER_=35, ANALYZE_=36, AND_=37, AS_=38, ASC_=39, ATTACH_=40, 
		AUTOINCREMENT_=41, BEFORE_=42, BEGIN_=43, BETWEEN_=44, BY_=45, CASCADE_=46, 
		CASE_=47, CAST_=48, DIGIT=49, LETTER=50, ANYDL=51, NON_DIGIT=52, STRING=53, 
		IDENTIFIER=54, BACKQUOTED_IDENTIFIER=55, SIMPLE_COMMENT=56, BRACKETED_EMPTY_COMMENT=57, 
		BRACKETED_COMMENT=58, WS=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", 
			"MINUS", "CREAT_", "TABLE_", "IF_", "NOT_", "NULL_", "UNIQUE_", "CHECK_", 
			"DEFAULT_", "EXISTS_", "WITHOUT_", "TEMP_", "TEMPORARY_", "PRIMARY_", 
			"KEY_", "COLLATE_", "GENERATED_", "ALWAYS_", "STORED_", "VIRTUAL_", "CONSTRAINT_", 
			"ABORT_", "ACTION_", "ADD_", "AFTER_", "ALL_", "ALTER_", "ANALYZE_", 
			"AND_", "AS_", "ASC_", "ATTACH_", "AUTOINCREMENT_", "BEFORE_", "BEGIN_", 
			"BETWEEN_", "BY_", "CASCADE_", "CASE_", "CAST_", "DIGIT", "LETTER", "ANYDL", 
			"NON_DIGIT", "STRING", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'CREATE'", "'TABLE'", "'IF'", "'NOT'", "'NULL'", "'UNIQUE'", "'CHECK'", 
			"'DEFAULT'", "'EXISTS'", "'WITHOUT'", "'TEMP'", "'TEMPORARY'", "'PRIMARY'", 
			"'KEY'", "'COLLATE'", "'GENERATED'", "'ALWAYS'", "'STORED'", "'VIRTUAL'", 
			"'CONSTRAINT'", "'ABORT'", "'ACTION'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", 
			"'ANALYZE'", "'AND'", "'AS'", "'ASC'", "'ATTACH'", "'AUTOINCREMENT'", 
			"'BEFORE'", "'BEGIN'", "'BETWEEN'", "'BY'", "'CASCADE'", "'CASE'", "'CAST'", 
			null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "CREAT_", "TABLE_", "IF_", "NOT_", "NULL_", "UNIQUE_", 
			"CHECK_", "DEFAULT_", "EXISTS_", "WITHOUT_", "TEMP_", "TEMPORARY_", "PRIMARY_", 
			"KEY_", "COLLATE_", "GENERATED_", "ALWAYS_", "STORED_", "VIRTUAL_", "CONSTRAINT_", 
			"ABORT_", "ACTION_", "ADD_", "AFTER_", "ALL_", "ALTER_", "ANALYZE_", 
			"AND_", "AS_", "ASC_", "ATTACH_", "AUTOINCREMENT_", "BEFORE_", "BEGIN_", 
			"BETWEEN_", "BY_", "CASCADE_", "CASE_", "CAST_", "DIGIT", "LETTER", "ANYDL", 
			"NON_DIGIT", "STRING", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS"
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


	public SQLiteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLiteLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000;\u01e4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00014\u00054\u0194"+
		"\b4\n4\f4\u0197\t4\u00014\u00014\u00014\u00014\u00014\u00054\u019e\b4"+
		"\n4\f4\u01a1\t4\u00014\u00034\u01a4\b4\u00015\u00015\u00045\u01a8\b5\u000b"+
		"5\f5\u01a9\u00016\u00016\u00016\u00016\u00056\u01b0\b6\n6\f6\u01b3\t6"+
		"\u00016\u00016\u00017\u00017\u00017\u00017\u00057\u01bb\b7\n7\f7\u01be"+
		"\t7\u00017\u00037\u01c1\b7\u00017\u00037\u01c4\b7\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00019\u00059\u01d4\b9\n9\f9\u01d7\t9\u00019\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0004:\u01df\b:\u000b:\f:\u01e0\u0001:\u0001:\u0001\u01d5\u0000"+
		";\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;\u0001\u0000#\u0002\u0000"+
		"CCcc\u0002\u0000RRrr\u0002\u0000EEee\u0002\u0000AAaa\u0002\u0000TTtt\u0002"+
		"\u0000BBbb\u0002\u0000LLll\u0002\u0000IIii\u0002\u0000FFff\u0002\u0000"+
		"NNnn\u0002\u0000OOoo\u0002\u0000UUuu\u0002\u0000QQqq\u0002\u0000HHhh\u0002"+
		"\u0000KKkk\u0002\u0000DDdd\u0002\u0000XXxx\u0002\u0000SSss\u0002\u0000"+
		"WWww\u0002\u0000MMmm\u0002\u0000PPpp\u0002\u0000YYyy\u0002\u0000GGgg\u0002"+
		"\u0000VVvv\u0002\u0000ZZzz\u0001\u000009\u0002\u0000AZaz\u0004\u00000"+
		"9AZ__az\u0002\u000009^_\u0002\u0000\'\'\\\\\u0002\u0000\"\"\\\\\u0001"+
		"\u0000``\u0002\u0000\n\n\r\r\u0001\u0000++\u0003\u0000\t\n\r\r  \u01f1"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u"+
		"\u0001\u0000\u0000\u0000\u0001w\u0001\u0000\u0000\u0000\u0003y\u0001\u0000"+
		"\u0000\u0000\u0005{\u0001\u0000\u0000\u0000\u0007}\u0001\u0000\u0000\u0000"+
		"\t\u007f\u0001\u0000\u0000\u0000\u000b\u0081\u0001\u0000\u0000\u0000\r"+
		"\u0083\u0001\u0000\u0000\u0000\u000f\u0085\u0001\u0000\u0000\u0000\u0011"+
		"\u0087\u0001\u0000\u0000\u0000\u0013\u0089\u0001\u0000\u0000\u0000\u0015"+
		"\u0090\u0001\u0000\u0000\u0000\u0017\u0096\u0001\u0000\u0000\u0000\u0019"+
		"\u0099\u0001\u0000\u0000\u0000\u001b\u009d\u0001\u0000\u0000\u0000\u001d"+
		"\u00a2\u0001\u0000\u0000\u0000\u001f\u00a9\u0001\u0000\u0000\u0000!\u00af"+
		"\u0001\u0000\u0000\u0000#\u00b7\u0001\u0000\u0000\u0000%\u00be\u0001\u0000"+
		"\u0000\u0000\'\u00c6\u0001\u0000\u0000\u0000)\u00cb\u0001\u0000\u0000"+
		"\u0000+\u00d5\u0001\u0000\u0000\u0000-\u00dd\u0001\u0000\u0000\u0000/"+
		"\u00e1\u0001\u0000\u0000\u00001\u00e9\u0001\u0000\u0000\u00003\u00f3\u0001"+
		"\u0000\u0000\u00005\u00fa\u0001\u0000\u0000\u00007\u0101\u0001\u0000\u0000"+
		"\u00009\u0109\u0001\u0000\u0000\u0000;\u0114\u0001\u0000\u0000\u0000="+
		"\u011a\u0001\u0000\u0000\u0000?\u0121\u0001\u0000\u0000\u0000A\u0125\u0001"+
		"\u0000\u0000\u0000C\u012b\u0001\u0000\u0000\u0000E\u012f\u0001\u0000\u0000"+
		"\u0000G\u0135\u0001\u0000\u0000\u0000I\u013d\u0001\u0000\u0000\u0000K"+
		"\u0141\u0001\u0000\u0000\u0000M\u0144\u0001\u0000\u0000\u0000O\u0148\u0001"+
		"\u0000\u0000\u0000Q\u014f\u0001\u0000\u0000\u0000S\u015d\u0001\u0000\u0000"+
		"\u0000U\u0164\u0001\u0000\u0000\u0000W\u016a\u0001\u0000\u0000\u0000Y"+
		"\u0172\u0001\u0000\u0000\u0000[\u0175\u0001\u0000\u0000\u0000]\u017d\u0001"+
		"\u0000\u0000\u0000_\u0182\u0001\u0000\u0000\u0000a\u0187\u0001\u0000\u0000"+
		"\u0000c\u0189\u0001\u0000\u0000\u0000e\u018b\u0001\u0000\u0000\u0000g"+
		"\u018d\u0001\u0000\u0000\u0000i\u01a3\u0001\u0000\u0000\u0000k\u01a7\u0001"+
		"\u0000\u0000\u0000m\u01ab\u0001\u0000\u0000\u0000o\u01b6\u0001\u0000\u0000"+
		"\u0000q\u01c7\u0001\u0000\u0000\u0000s\u01ce\u0001\u0000\u0000\u0000u"+
		"\u01de\u0001\u0000\u0000\u0000wx\u0005;\u0000\u0000x\u0002\u0001\u0000"+
		"\u0000\u0000yz\u0005.\u0000\u0000z\u0004\u0001\u0000\u0000\u0000{|\u0005"+
		"(\u0000\u0000|\u0006\u0001\u0000\u0000\u0000}~\u0005)\u0000\u0000~\b\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005,\u0000\u0000\u0080\n\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082\f\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005*\u0000\u0000\u0084\u000e\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005+\u0000\u0000\u0086\u0010\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005-\u0000\u0000\u0088\u0012\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0007\u0000\u0000\u0000\u008a\u008b\u0007\u0001\u0000\u0000\u008b\u008c"+
		"\u0007\u0002\u0000\u0000\u008c\u008d\u0007\u0003\u0000\u0000\u008d\u008e"+
		"\u0007\u0004\u0000\u0000\u008e\u008f\u0007\u0002\u0000\u0000\u008f\u0014"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0007\u0004\u0000\u0000\u0091\u0092"+
		"\u0007\u0003\u0000\u0000\u0092\u0093\u0007\u0005\u0000\u0000\u0093\u0094"+
		"\u0007\u0006\u0000\u0000\u0094\u0095\u0007\u0002\u0000\u0000\u0095\u0016"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0007\u0007\u0000\u0000\u0097\u0098"+
		"\u0007\b\u0000\u0000\u0098\u0018\u0001\u0000\u0000\u0000\u0099\u009a\u0007"+
		"\t\u0000\u0000\u009a\u009b\u0007\n\u0000\u0000\u009b\u009c\u0007\u0004"+
		"\u0000\u0000\u009c\u001a\u0001\u0000\u0000\u0000\u009d\u009e\u0007\t\u0000"+
		"\u0000\u009e\u009f\u0007\u000b\u0000\u0000\u009f\u00a0\u0007\u0006\u0000"+
		"\u0000\u00a0\u00a1\u0007\u0006\u0000\u0000\u00a1\u001c\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0007\u000b\u0000\u0000\u00a3\u00a4\u0007\t\u0000\u0000"+
		"\u00a4\u00a5\u0007\u0007\u0000\u0000\u00a5\u00a6\u0007\f\u0000\u0000\u00a6"+
		"\u00a7\u0007\u000b\u0000\u0000\u00a7\u00a8\u0007\u0002\u0000\u0000\u00a8"+
		"\u001e\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0007\r\u0000\u0000\u00ab\u00ac\u0007\u0002\u0000\u0000\u00ac\u00ad"+
		"\u0007\u0000\u0000\u0000\u00ad\u00ae\u0007\u000e\u0000\u0000\u00ae \u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0007\u000f\u0000\u0000\u00b0\u00b1\u0007"+
		"\u0002\u0000\u0000\u00b1\u00b2\u0007\b\u0000\u0000\u00b2\u00b3\u0007\u0003"+
		"\u0000\u0000\u00b3\u00b4\u0007\u000b\u0000\u0000\u00b4\u00b5\u0007\u0006"+
		"\u0000\u0000\u00b5\u00b6\u0007\u0004\u0000\u0000\u00b6\"\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0007\u0002\u0000\u0000\u00b8\u00b9\u0007\u0010\u0000"+
		"\u0000\u00b9\u00ba\u0007\u0007\u0000\u0000\u00ba\u00bb\u0007\u0011\u0000"+
		"\u0000\u00bb\u00bc\u0007\u0004\u0000\u0000\u00bc\u00bd\u0007\u0011\u0000"+
		"\u0000\u00bd$\u0001\u0000\u0000\u0000\u00be\u00bf\u0007\u0012\u0000\u0000"+
		"\u00bf\u00c0\u0007\u0007\u0000\u0000\u00c0\u00c1\u0007\u0004\u0000\u0000"+
		"\u00c1\u00c2\u0007\r\u0000\u0000\u00c2\u00c3\u0007\n\u0000\u0000\u00c3"+
		"\u00c4\u0007\u000b\u0000\u0000\u00c4\u00c5\u0007\u0004\u0000\u0000\u00c5"+
		"&\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007\u0004\u0000\u0000\u00c7\u00c8"+
		"\u0007\u0002\u0000\u0000\u00c8\u00c9\u0007\u0013\u0000\u0000\u00c9\u00ca"+
		"\u0007\u0014\u0000\u0000\u00ca(\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007"+
		"\u0004\u0000\u0000\u00cc\u00cd\u0007\u0002\u0000\u0000\u00cd\u00ce\u0007"+
		"\u0013\u0000\u0000\u00ce\u00cf\u0007\u0014\u0000\u0000\u00cf\u00d0\u0007"+
		"\n\u0000\u0000\u00d0\u00d1\u0007\u0001\u0000\u0000\u00d1\u00d2\u0007\u0003"+
		"\u0000\u0000\u00d2\u00d3\u0007\u0001\u0000\u0000\u00d3\u00d4\u0007\u0015"+
		"\u0000\u0000\u00d4*\u0001\u0000\u0000\u0000\u00d5\u00d6\u0007\u0014\u0000"+
		"\u0000\u00d6\u00d7\u0007\u0001\u0000\u0000\u00d7\u00d8\u0007\u0007\u0000"+
		"\u0000\u00d8\u00d9\u0007\u0013\u0000\u0000\u00d9\u00da\u0007\u0003\u0000"+
		"\u0000\u00da\u00db\u0007\u0001\u0000\u0000\u00db\u00dc\u0007\u0015\u0000"+
		"\u0000\u00dc,\u0001\u0000\u0000\u0000\u00dd\u00de\u0007\u000e\u0000\u0000"+
		"\u00de\u00df\u0007\u0002\u0000\u0000\u00df\u00e0\u0007\u0015\u0000\u0000"+
		"\u00e0.\u0001\u0000\u0000\u0000\u00e1\u00e2\u0007\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0007\n\u0000\u0000\u00e3\u00e4\u0007\u0006\u0000\u0000\u00e4\u00e5"+
		"\u0007\u0006\u0000\u0000\u00e5\u00e6\u0007\u0003\u0000\u0000\u00e6\u00e7"+
		"\u0007\u0004\u0000\u0000\u00e7\u00e8\u0007\u0002\u0000\u0000\u00e80\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0007\u0016\u0000\u0000\u00ea\u00eb\u0007"+
		"\u0002\u0000\u0000\u00eb\u00ec\u0007\t\u0000\u0000\u00ec\u00ed\u0007\u0002"+
		"\u0000\u0000\u00ed\u00ee\u0007\u0001\u0000\u0000\u00ee\u00ef\u0007\u0003"+
		"\u0000\u0000\u00ef\u00f0\u0007\u0004\u0000\u0000\u00f0\u00f1\u0007\u0002"+
		"\u0000\u0000\u00f1\u00f2\u0007\u000f\u0000\u0000\u00f22\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0007\u0003\u0000\u0000\u00f4\u00f5\u0007\u0006\u0000"+
		"\u0000\u00f5\u00f6\u0007\u0012\u0000\u0000\u00f6\u00f7\u0007\u0003\u0000"+
		"\u0000\u00f7\u00f8\u0007\u0015\u0000\u0000\u00f8\u00f9\u0007\u0011\u0000"+
		"\u0000\u00f94\u0001\u0000\u0000\u0000\u00fa\u00fb\u0007\u0011\u0000\u0000"+
		"\u00fb\u00fc\u0007\u0004\u0000\u0000\u00fc\u00fd\u0007\n\u0000\u0000\u00fd"+
		"\u00fe\u0007\u0001\u0000\u0000\u00fe\u00ff\u0007\u0002\u0000\u0000\u00ff"+
		"\u0100\u0007\u000f\u0000\u0000\u01006\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0007\u0017\u0000\u0000\u0102\u0103\u0007\u0007\u0000\u0000\u0103\u0104"+
		"\u0007\u0001\u0000\u0000\u0104\u0105\u0007\u0004\u0000\u0000\u0105\u0106"+
		"\u0007\u000b\u0000\u0000\u0106\u0107\u0007\u0003\u0000\u0000\u0107\u0108"+
		"\u0007\u0006\u0000\u0000\u01088\u0001\u0000\u0000\u0000\u0109\u010a\u0007"+
		"\u0000\u0000\u0000\u010a\u010b\u0007\n\u0000\u0000\u010b\u010c\u0007\t"+
		"\u0000\u0000\u010c\u010d\u0007\u0011\u0000\u0000\u010d\u010e\u0007\u0004"+
		"\u0000\u0000\u010e\u010f\u0007\u0001\u0000\u0000\u010f\u0110\u0007\u0003"+
		"\u0000\u0000\u0110\u0111\u0007\u0007\u0000\u0000\u0111\u0112\u0007\t\u0000"+
		"\u0000\u0112\u0113\u0007\u0004\u0000\u0000\u0113:\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0007\u0003\u0000\u0000\u0115\u0116\u0007\u0005\u0000\u0000"+
		"\u0116\u0117\u0007\n\u0000\u0000\u0117\u0118\u0007\u0001\u0000\u0000\u0118"+
		"\u0119\u0007\u0004\u0000\u0000\u0119<\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0007\u0003\u0000\u0000\u011b\u011c\u0007\u0000\u0000\u0000\u011c\u011d"+
		"\u0007\u0004\u0000\u0000\u011d\u011e\u0007\u0007\u0000\u0000\u011e\u011f"+
		"\u0007\n\u0000\u0000\u011f\u0120\u0007\t\u0000\u0000\u0120>\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0007\u0003\u0000\u0000\u0122\u0123\u0007\u000f"+
		"\u0000\u0000\u0123\u0124\u0007\u000f\u0000\u0000\u0124@\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0007\u0003\u0000\u0000\u0126\u0127\u0007\b\u0000\u0000"+
		"\u0127\u0128\u0007\u0004\u0000\u0000\u0128\u0129\u0007\u0002\u0000\u0000"+
		"\u0129\u012a\u0007\u0001\u0000\u0000\u012aB\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0007\u0003\u0000\u0000\u012c\u012d\u0007\u0006\u0000\u0000\u012d"+
		"\u012e\u0007\u0006\u0000\u0000\u012eD\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0007\u0003\u0000\u0000\u0130\u0131\u0007\u0006\u0000\u0000\u0131\u0132"+
		"\u0007\u0004\u0000\u0000\u0132\u0133\u0007\u0002\u0000\u0000\u0133\u0134"+
		"\u0007\u0001\u0000\u0000\u0134F\u0001\u0000\u0000\u0000\u0135\u0136\u0007"+
		"\u0003\u0000\u0000\u0136\u0137\u0007\t\u0000\u0000\u0137\u0138\u0007\u0003"+
		"\u0000\u0000\u0138\u0139\u0007\u0006\u0000\u0000\u0139\u013a\u0007\u0015"+
		"\u0000\u0000\u013a\u013b\u0007\u0018\u0000\u0000\u013b\u013c\u0007\u0002"+
		"\u0000\u0000\u013cH\u0001\u0000\u0000\u0000\u013d\u013e\u0007\u0003\u0000"+
		"\u0000\u013e\u013f\u0007\t\u0000\u0000\u013f\u0140\u0007\u000f\u0000\u0000"+
		"\u0140J\u0001\u0000\u0000\u0000\u0141\u0142\u0007\u0003\u0000\u0000\u0142"+
		"\u0143\u0007\u0011\u0000\u0000\u0143L\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0007\u0003\u0000\u0000\u0145\u0146\u0007\u0011\u0000\u0000\u0146\u0147"+
		"\u0007\u0000\u0000\u0000\u0147N\u0001\u0000\u0000\u0000\u0148\u0149\u0007"+
		"\u0003\u0000\u0000\u0149\u014a\u0007\u0004\u0000\u0000\u014a\u014b\u0007"+
		"\u0004\u0000\u0000\u014b\u014c\u0007\u0003\u0000\u0000\u014c\u014d\u0007"+
		"\u0000\u0000\u0000\u014d\u014e\u0007\r\u0000\u0000\u014eP\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0007\u0003\u0000\u0000\u0150\u0151\u0007\u000b"+
		"\u0000\u0000\u0151\u0152\u0007\u0004\u0000\u0000\u0152\u0153\u0007\n\u0000"+
		"\u0000\u0153\u0154\u0007\u0007\u0000\u0000\u0154\u0155\u0007\t\u0000\u0000"+
		"\u0155\u0156\u0007\u0000\u0000\u0000\u0156\u0157\u0007\u0001\u0000\u0000"+
		"\u0157\u0158\u0007\u0002\u0000\u0000\u0158\u0159\u0007\u0013\u0000\u0000"+
		"\u0159\u015a\u0007\u0002\u0000\u0000\u015a\u015b\u0007\t\u0000\u0000\u015b"+
		"\u015c\u0007\u0004\u0000\u0000\u015cR\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0007\u0005\u0000\u0000\u015e\u015f\u0007\u0002\u0000\u0000\u015f\u0160"+
		"\u0007\b\u0000\u0000\u0160\u0161\u0007\n\u0000\u0000\u0161\u0162\u0007"+
		"\u0001\u0000\u0000\u0162\u0163\u0007\u0002\u0000\u0000\u0163T\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0007\u0005\u0000\u0000\u0165\u0166\u0007\u0002"+
		"\u0000\u0000\u0166\u0167\u0007\u0016\u0000\u0000\u0167\u0168\u0007\u0007"+
		"\u0000\u0000\u0168\u0169\u0007\t\u0000\u0000\u0169V\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0007\u0005\u0000\u0000\u016b\u016c\u0007\u0002\u0000"+
		"\u0000\u016c\u016d\u0007\u0004\u0000\u0000\u016d\u016e\u0007\u0012\u0000"+
		"\u0000\u016e\u016f\u0007\u0002\u0000\u0000\u016f\u0170\u0007\u0002\u0000"+
		"\u0000\u0170\u0171\u0007\t\u0000\u0000\u0171X\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0007\u0005\u0000\u0000\u0173\u0174\u0007\u0015\u0000\u0000"+
		"\u0174Z\u0001\u0000\u0000\u0000\u0175\u0176\u0007\u0000\u0000\u0000\u0176"+
		"\u0177\u0007\u0003\u0000\u0000\u0177\u0178\u0007\u0011\u0000\u0000\u0178"+
		"\u0179\u0007\u0000\u0000\u0000\u0179\u017a\u0007\u0003\u0000\u0000\u017a"+
		"\u017b\u0007\u000f\u0000\u0000\u017b\u017c\u0007\u0002\u0000\u0000\u017c"+
		"\\\u0001\u0000\u0000\u0000\u017d\u017e\u0007\u0000\u0000\u0000\u017e\u017f"+
		"\u0007\u0003\u0000\u0000\u017f\u0180\u0007\u0011\u0000\u0000\u0180\u0181"+
		"\u0007\u0002\u0000\u0000\u0181^\u0001\u0000\u0000\u0000\u0182\u0183\u0007"+
		"\u0000\u0000\u0000\u0183\u0184\u0007\u0003\u0000\u0000\u0184\u0185\u0007"+
		"\u0011\u0000\u0000\u0185\u0186\u0007\u0004\u0000\u0000\u0186`\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0007\u0019\u0000\u0000\u0188b\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0007\u001a\u0000\u0000\u018ad\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0007\u001b\u0000\u0000\u018cf\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0007\u001c\u0000\u0000\u018eh\u0001\u0000\u0000\u0000\u018f\u0195"+
		"\u0005\'\u0000\u0000\u0190\u0194\b\u001d\u0000\u0000\u0191\u0192\u0005"+
		"\\\u0000\u0000\u0192\u0194\t\u0000\u0000\u0000\u0193\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000"+
		"\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0198\u01a4\u0005\'\u0000\u0000\u0199\u019f\u0005\"\u0000"+
		"\u0000\u019a\u019e\b\u001e\u0000\u0000\u019b\u019c\u0005\\\u0000\u0000"+
		"\u019c\u019e\t\u0000\u0000\u0000\u019d\u019a\u0001\u0000\u0000\u0000\u019d"+
		"\u019b\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a4\u0005\"\u0000\u0000\u01a3\u018f\u0001\u0000\u0000\u0000\u01a3\u0199"+
		"\u0001\u0000\u0000\u0000\u01a4j\u0001\u0000\u0000\u0000\u01a5\u01a8\u0003"+
		"c1\u0000\u01a6\u01a8\u0003g3\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01aal\u0001\u0000\u0000\u0000\u01ab\u01b1\u0005`\u0000\u0000\u01ac\u01b0"+
		"\b\u001f\u0000\u0000\u01ad\u01ae\u0005`\u0000\u0000\u01ae\u01b0\u0005"+
		"`\u0000\u0000\u01af\u01ac\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005`\u0000"+
		"\u0000\u01b5n\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005-\u0000\u0000\u01b7"+
		"\u01b8\u0005-\u0000\u0000\u01b8\u01bc\u0001\u0000\u0000\u0000\u01b9\u01bb"+
		"\b \u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be\u0001"+
		"\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c1\u0005\r\u0000\u0000\u01c0\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c4\u0005\n\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u00067\u0000\u0000\u01c6p\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0005/\u0000\u0000\u01c8\u01c9\u0005*\u0000\u0000\u01c9\u01ca\u0005"+
		"*\u0000\u0000\u01ca\u01cb\u0005/\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u00068\u0000\u0000\u01cdr\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0005/\u0000\u0000\u01cf\u01d0\u0005*\u0000\u0000\u01d0\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d5\b!\u0000\u0000\u01d2\u01d4\t\u0000\u0000"+
		"\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0005*\u0000\u0000\u01d9\u01da\u0005/\u0000\u0000\u01da"+
		"\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u00069\u0000\u0000\u01dct\u0001"+
		"\u0000\u0000\u0000\u01dd\u01df\u0007\"\u0000\u0000\u01de\u01dd\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0006:\u0000\u0000\u01e3v\u0001\u0000\u0000\u0000"+
		"\u000f\u0000\u0193\u0195\u019d\u019f\u01a3\u01a7\u01a9\u01af\u01b1\u01bc"+
		"\u01c0\u01c3\u01d5\u01e0\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}