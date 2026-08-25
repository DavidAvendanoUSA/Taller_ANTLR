// Generated from ScientificCalc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ScientificCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MUL=12, DIV=13, ADD=14, SUB=15, POW=16, NUMBER=17, 
		ID=18, NEWLINE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "MUL", "DIV", "ADD", "SUB", "POW", "NUMBER", "ID", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'sin'", "'cos'", "'tan'", "'sqrt'", "'log'", 
			"'ln'", "'abs'", "'exp'", "'*'", "'/'", "'+'", "'-'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MUL", "DIV", "ADD", "SUB", "POW", "NUMBER", "ID", "NEWLINE", "WS"
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


	public ScientificCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ScientificCalc.g4"; }

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
		"\u0004\u0000\u0014y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010[\b\u0010\u000b\u0010\f\u0010\\\u0001\u0010\u0001\u0010\u0004"+
		"\u0010a\b\u0010\u000b\u0010\f\u0010b\u0003\u0010e\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011i\b\u0011\n\u0011\f\u0011l\t\u0011\u0001\u0012"+
		"\u0003\u0012o\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013"+
		"t\b\u0013\u000b\u0013\f\u0013u\u0001\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0004"+
		"\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\t\t "+
		" ~\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000"+
		"\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/"+
		"\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000f@\u0001\u0000\u0000\u0000"+
		"\u0011D\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015K"+
		"\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000"+
		"\u0000\u0000\u001bS\u0001\u0000\u0000\u0000\u001dU\u0001\u0000\u0000\u0000"+
		"\u001fW\u0001\u0000\u0000\u0000!Z\u0001\u0000\u0000\u0000#f\u0001\u0000"+
		"\u0000\u0000%n\u0001\u0000\u0000\u0000\'s\u0001\u0000\u0000\u0000)*\u0005"+
		"=\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0004"+
		"\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\u0006\u0001\u0000\u0000"+
		"\u0000/0\u0005s\u0000\u000001\u0005i\u0000\u000012\u0005n\u0000\u0000"+
		"2\b\u0001\u0000\u0000\u000034\u0005c\u0000\u000045\u0005o\u0000\u0000"+
		"56\u0005s\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005t\u0000\u0000"+
		"89\u0005a\u0000\u00009:\u0005n\u0000\u0000:\f\u0001\u0000\u0000\u0000"+
		";<\u0005s\u0000\u0000<=\u0005q\u0000\u0000=>\u0005r\u0000\u0000>?\u0005"+
		"t\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@A\u0005l\u0000\u0000AB\u0005"+
		"o\u0000\u0000BC\u0005g\u0000\u0000C\u0010\u0001\u0000\u0000\u0000DE\u0005"+
		"l\u0000\u0000EF\u0005n\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005"+
		"a\u0000\u0000HI\u0005b\u0000\u0000IJ\u0005s\u0000\u0000J\u0014\u0001\u0000"+
		"\u0000\u0000KL\u0005e\u0000\u0000LM\u0005x\u0000\u0000MN\u0005p\u0000"+
		"\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005*\u0000\u0000P\u0018\u0001"+
		"\u0000\u0000\u0000QR\u0005/\u0000\u0000R\u001a\u0001\u0000\u0000\u0000"+
		"ST\u0005+\u0000\u0000T\u001c\u0001\u0000\u0000\u0000UV\u0005-\u0000\u0000"+
		"V\u001e\u0001\u0000\u0000\u0000WX\u0005^\u0000\u0000X \u0001\u0000\u0000"+
		"\u0000Y[\u0007\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]d\u0001"+
		"\u0000\u0000\u0000^`\u0005.\u0000\u0000_a\u0007\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000d^\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000e\"\u0001\u0000\u0000\u0000fj\u0007\u0001"+
		"\u0000\u0000gi\u0007\u0002\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"k$\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0005\r\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0005\n\u0000\u0000q&\u0001\u0000\u0000\u0000rt\u0007\u0003\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0006"+
		"\u0013\u0000\u0000x(\u0001\u0000\u0000\u0000\u0007\u0000\\bdjnu\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}