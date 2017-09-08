// Generated from VamdcSqlRequest.g4 by ANTLR 4.5.3

package vamdcsqlcomparator;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VamdcSqlRequestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BOOLEAN_OP=11, NUM=12, ID=13, WS=14;
	public static final int
		RULE_select = 0, RULE_expr = 1, RULE_factor = 2, RULE_term = 3, RULE_compexp = 4, 
		RULE_list = 5, RULE_name = 6;
	public static final String[] ruleNames = {
		"select", "expr", "factor", "term", "compexp", "list", "name"
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

	@Override
	public String getGrammarFileName() { return "VamdcSqlRequest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VamdcSqlRequestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SelectContext extends ParserRuleContext {
		public ListContext selectList;
		public Token where;
		public TerminalNode EOF() { return getToken(VamdcSqlRequestParser.EOF, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(18);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(15);
				((SelectContext)_localctx).selectList = list();
				}
				break;
			case T__1:
				{
				setState(16);
				match(T__1);
				}
				break;
			case T__2:
				{
				setState(17);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(22);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(20);
				((SelectContext)_localctx).where = match(T__3);
				setState(21);
				expr(0);
				}
			}

			setState(24);
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

	public static class ExprContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(27);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(29);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(30);
					match(T__4);
					setState(31);
					factor();
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_factor);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				term();
				setState(38);
				match(T__5);
				setState(39);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CompexpContext compexp() {
			return getRuleContext(CompexpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				compexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(T__6);
				setState(47);
				expr(0);
				setState(48);
				match(T__7);
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

	public static class CompexpContext extends ParserRuleContext {
		public NameContext left;
		public NameContext right;
		public TerminalNode BOOLEAN_OP() { return getToken(VamdcSqlRequestParser.BOOLEAN_OP, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public CompexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).enterCompexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).exitCompexp(this);
		}
	}

	public final CompexpContext compexp() throws RecognitionException {
		CompexpContext _localctx = new CompexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((CompexpContext)_localctx).left = name();
			setState(53);
			match(BOOLEAN_OP);
			setState(54);
			((CompexpContext)_localctx).right = name();
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VamdcSqlRequestParser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(57);
				match(ID);
				setState(58);
				match(T__8);
				setState(59);
				list();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VamdcSqlRequestParser.ID, 0); }
		public TerminalNode NUM() { return getToken(VamdcSqlRequestParser.NUM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VamdcSqlRequestListener ) ((VamdcSqlRequestListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_name);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(64);
				match(ID);
				setState(65);
				match(T__9);
				setState(66);
				name();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(T__6);
				setState(68);
				name();
				setState(69);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(71);
				match(ID);
				setState(72);
				match(T__8);
				setState(73);
				name();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\2\3\2\5\2\31\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3"+
		"&\13\3\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\65\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\b\2\3\4\t\2\4\6\b\n\f\16\2\2S\2\20\3\2"+
		"\2\2\4\34\3\2\2\2\6,\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f>\3\2\2\2\16L"+
		"\3\2\2\2\20\24\7\3\2\2\21\25\5\f\7\2\22\25\7\4\2\2\23\25\7\5\2\2\24\21"+
		"\3\2\2\2\24\22\3\2\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26\27\7\6\2\2\27\31"+
		"\5\4\3\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\7\2\2\3\33\3"+
		"\3\2\2\2\34\35\b\3\1\2\35\36\5\6\4\2\36$\3\2\2\2\37 \f\3\2\2 !\7\7\2\2"+
		"!#\5\6\4\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3"+
		"\2\2\2\'(\5\b\5\2()\7\b\2\2)*\5\6\4\2*-\3\2\2\2+-\5\b\5\2,\'\3\2\2\2,"+
		"+\3\2\2\2-\7\3\2\2\2.\65\5\16\b\2/\65\5\n\6\2\60\61\7\t\2\2\61\62\5\4"+
		"\3\2\62\63\7\n\2\2\63\65\3\2\2\2\64.\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2"+
		"\65\t\3\2\2\2\66\67\5\16\b\2\678\7\r\2\289\5\16\b\29\13\3\2\2\2:?\7\17"+
		"\2\2;<\7\17\2\2<=\7\13\2\2=?\5\f\7\2>:\3\2\2\2>;\3\2\2\2?\r\3\2\2\2@M"+
		"\7\17\2\2AM\7\16\2\2BC\7\17\2\2CD\7\f\2\2DM\5\16\b\2EF\7\t\2\2FG\5\16"+
		"\b\2GH\7\n\2\2HM\3\2\2\2IJ\7\17\2\2JK\7\13\2\2KM\5\16\b\2L@\3\2\2\2LA"+
		"\3\2\2\2LB\3\2\2\2LE\3\2\2\2LI\3\2\2\2M\17\3\2\2\2\t\24\30$,\64>L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}