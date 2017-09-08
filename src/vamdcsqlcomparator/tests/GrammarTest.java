package vamdcsqlcomparator.tests;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

import vamdcsqlcomparator.VamdcSqlRequestComparator;

public class GrammarTest {

	/*
	 * must throw ParseCancellationException, otherwise error
	 */
	@Test (expected = ParseCancellationException.class)
	public void syntaxTest() throws Exception {
		
		VamdcSqlRequestComparator.compare("select f1 where ...", "select f2 where...");
		
	}
		
}
