package vamdcsqlcomparator.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

import vamdcsqlcomparator.VamdcSqlRequestComparator;

public class GeneralTest {

	@Test
	public void numberTest_1(){
		
		boolean result = false;
		
		
		String r1 = "select * where x>=128.14 AND y<=1";
		String r2 = "select * where x>=1.2814e2 AND y<=1.000";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Number Test_1 Failed!!!",result);
		
	}
	
}
