package vamdcsqlcomparator.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

import vamdcsqlcomparator.VamdcSqlRequestComparator;

public class AssociativityTest {

	@Test
	public void associativityTest_1(){
		
		boolean result = false;
		
		String r1 = "select * where (a<2 or (a<3 or a<1))or a<4";
		String r2 = "select * where (a<1 or (a<2 or a<3))or a<4";
		

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Associativity Test_1 Failed!!!",result);
		
	}
	
	@Test
	public void associativityTest_2(){
		
		boolean result = false;
		
		String r1 = "select * where (a<2 and (a<3 and a<1))or a<4";
		String r2 = "select * where (a<1 and (a<2 and a<3))or a<4";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Associativity Test_2 Failed!!!",result);
		
	}
	
	
	@Test
	public void associativityTest_3(){
		
		boolean result = false;
		
		
		String r1 = "select * where ((e<1 and (c<1 and d<1 or (a<1 or b<1))) and ((f<1 or g<1) and x<1 and y<1)) and z<1";
		String r2 = "select * where (z<1 and (e<1 and ((a<1 or b<1) or c<1 and d<1))) and ((g<1 or f<1) and y<1 and x<1)" ;

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Associativity Test_3 Failed!!!",result);
		
	}
}
