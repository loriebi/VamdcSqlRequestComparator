// Generated from VamdcSqlRequest.g4 by ANTLR 4.5.3

package vamdcsqlcomparator;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VamdcSqlRequestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BOOLEAN_OP=11, NUM=12, ID=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "BOOLEAN_OP", "NUM", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'select'", "'*'", "'all'", "'where'", "'or'", "'and'", "'('", "')'", 
		"','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "BOOLEAN_OP", 
		"NUM", "ID", "WS"
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


	public VamdcSqlRequestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VamdcSqlRequest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\fM\n\f\3\r\6\rP\n\r\r\r\16\rQ\3\r\3\r\6\rV\n\r\r\r"+
		"\16\rW\5\rZ\n\r\3\r\3\r\5\r^\n\r\3\r\6\ra\n\r\r\r\16\rb\5\re\n\r\3\r\3"+
		"\r\3\r\3\r\5\rk\n\r\3\16\5\16n\n\16\3\16\3\16\7\16r\n\16\f\16\16\16u\13"+
		"\16\3\16\5\16x\n\16\3\16\3\16\3\16\3\16\5\16~\n\16\3\17\6\17\u0081\n\17"+
		"\r\17\16\17\u0082\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\3\2\7\3\2\62;\4\2GGgg\4\2--//\5\2/"+
		"/\62;c|\5\2\13\f\17\17\"\"\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\3\37\3\2\2\2\5&\3\2\2\2\7(\3\2\2\2\t,\3\2\2\2\13\62\3\2\2\2\r\65\3\2"+
		"\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27L\3\2\2\2\31j\3"+
		"\2\2\2\33}\3\2\2\2\35\u0080\3\2\2\2\37 \7u\2\2 !\7g\2\2!\"\7n\2\2\"#\7"+
		"g\2\2#$\7e\2\2$%\7v\2\2%\4\3\2\2\2&\'\7,\2\2\'\6\3\2\2\2()\7c\2\2)*\7"+
		"n\2\2*+\7n\2\2+\b\3\2\2\2,-\7y\2\2-.\7j\2\2./\7g\2\2/\60\7t\2\2\60\61"+
		"\7g\2\2\61\n\3\2\2\2\62\63\7q\2\2\63\64\7t\2\2\64\f\3\2\2\2\65\66\7c\2"+
		"\2\66\67\7p\2\2\678\7f\2\28\16\3\2\2\29:\7*\2\2:\20\3\2\2\2;<\7+\2\2<"+
		"\22\3\2\2\2=>\7.\2\2>\24\3\2\2\2?@\7\60\2\2@\26\3\2\2\2AM\4>@\2BC\7>\2"+
		"\2CM\7?\2\2DE\7@\2\2EM\7?\2\2FG\7k\2\2GM\7p\2\2HI\7n\2\2IJ\7k\2\2JK\7"+
		"m\2\2KM\7g\2\2LA\3\2\2\2LB\3\2\2\2LD\3\2\2\2LF\3\2\2\2LH\3\2\2\2M\30\3"+
		"\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RY\3\2\2\2SU\7"+
		"\60\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YS"+
		"\3\2\2\2YZ\3\2\2\2Zd\3\2\2\2[]\t\3\2\2\\^\t\4\2\2]\\\3\2\2\2]^\3\2\2\2"+
		"^`\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2"+
		"d[\3\2\2\2de\3\2\2\2ek\3\2\2\2fg\7)\2\2gh\5\31\r\2hi\7)\2\2ik\3\2\2\2"+
		"jO\3\2\2\2jf\3\2\2\2k\32\3\2\2\2ln\7`\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2"+
		"\2os\4c|\2pr\t\5\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2"+
		"us\3\2\2\2vx\7\'\2\2wv\3\2\2\2wx\3\2\2\2x~\3\2\2\2yz\7)\2\2z{\5\33\16"+
		"\2{|\7)\2\2|~\3\2\2\2}m\3\2\2\2}y\3\2\2\2~\34\3\2\2\2\177\u0081\t\6\2"+
		"\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\17\2\2\u0085\36\3\2\2\2\20"+
		"\2LQWY]bdjmsw}\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}