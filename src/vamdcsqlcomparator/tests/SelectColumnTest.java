package vamdcsqlcomparator.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

import vamdcsqlcomparator.VamdcSqlRequestComparator;

public class SelectColumnTest {

	
	@Test
	public void selectColumnTest_1(){
		
		boolean result = false;
		
		
		String r1 = "SELECT ALL WHERE SpeciesID=19 OR SpeciesID=28";
		String r2 = "SELECT * WHERE SpeciesID=19 OR SpeciesID=28";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("SelectColumn Test_1 Failled!!!",result);
		
	}
	
	@Test
	public void selectColumnTest_2(){
		
		boolean result = false;
		
		
		String r1 = "SELECT f1,f2,f3,f4 WHERE SpeciesID=19 OR SpeciesID=28";
		String r2 = "SELECT f4,f2,f3,f1 WHERE SpeciesID=19 OR SpeciesID=28";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("SelectColumn Test_2 Failled!!!",result);
		
	}
	
	@Test
	public void selectColumnTest_3(){
		
		boolean result = false;
		
		
		String r1 = "SELECT f1,f2,f3,f4";
		String r2 = "SELECT f4,f2,f3,f1";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("SelectColumn Test_3 Failled!!!",result);
		
	}
	
}
