package vamdcsqlcomparator.tests;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;

import vamdcsqlcomparator.VamdcSqlRequestComparator;


public class CommutativityTest {
	
	@Test
	public void commutativityTest_1(){
		
		boolean result = false;
		
		
		String r1 = "select * where RadTransWavelength>=900.0 AND RadTransWavelength<=3000.0";
		String r2 = "select * where RadTransWavelength<=3000.0 AND RadTransWavelength>=900.0";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Commutativiy Test_1 Failed!!!",result);
		
	}

	

	@Test
	public void commutativityTest_2(){
		
		boolean result = false;
		
		
		String r1 = "select * where RadTransWavelength>=5629.0 AND RadTransWavelength<=5638.0 AND InchiKey='LBVWYGNGGJURHQ-UHFFFAOYSA-N'";
		String r2 = "select * where InchiKey='LBVWYGNGGJURHQ-UHFFFAOYSA-N' AND RadTransWavelength>=5629.0 AND RadTransWavelength<=5638.0";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Commutativiy Test_2 Failed!!!",result);
		
	}
	
	
	@Test
	public void commutativityTest_3(){
		
		boolean result = false;
		
		
		String r1 = "SELECT ALL WHERE SpeciesID=29 OR SpeciesID=31 OR SpeciesID=48 OR InchiKey='QGZKDVFQNNGYKY-UHFFFAOYSA-N'";
		String r2 = "SELECT ALL WHERE InchiKey='QGZKDVFQNNGYKY-UHFFFAOYSA-N' OR SpeciesID=29 OR SpeciesID=31 OR SpeciesID=48";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Commutativiy Test_3 Failed!!!",result);
		
	}
	
	@Test
	public void commutativityTest_4(){
		
		boolean result = false;
		
		
		String r1 = "select * where RadTransWavelength>=3.747405725E7 AND RadTransWavelength<=5.99584916E7 AND upper.StateEnergy>=0.0 AND upper.StateEnergy<=500.0 AND lower.StateEnergy>=0.0 AND lower.StateEnergy<=500.0";
		String r2 = "select * where upper.StateEnergy>=0.0 AND upper.StateEnergy<=500.0 AND lower.StateEnergy>=0.0 AND lower.StateEnergy<=500.0 AND RadTransWavelength>=3.747405725E7 AND RadTransWavelength<=5.99584916E7";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Commutativiy Test_4 Failed!!!",result);
		
	}
	
	
	@Test
	public void commutativityTest_5(){
		
		boolean result = false;
		
		
		String r1 = "SELECT ALL WHERE SpeciesID=19 OR SpeciesID=28";
		String r2 = "SELECT ALL WHERE SpeciesID=28 OR SpeciesID=19";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Commutativiy Test_5 Failed!!!",result);
		
	}
	
	@Test
	public void commutativityTest_6(){
		
		boolean result = false;
		
		
		
		String r1 = "SELECT ALL WHERE SpeciesID=1 OR InchiKey='MRJFCQHWODZEPM-MICDWDOJSA-N' OR InchiKey='KEJOCWOXCDWNID-UHFFFAOYSA-N'";
		String r2 = "SELECT ALL WHERE InchiKey='KEJOCWOXCDWNID-UHFFFAOYSA-N' OR SpeciesID=1 OR InchiKey='MRJFCQHWODZEPM-MICDWDOJSA-N'";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Commutativiy Test_6 Failed!!!",result);
		
	}
	
	
	
	@Test
	public void commutativityTest_7(){
		
		boolean result = false;
		
		
		
		String r1 = "select * where (RadTransWavelength >= 2.4982704833333332E7 AND RadTransWavelength <= 3.3310273111111112E7) AND ((InchiKey IN ('UGFAIRIUMAVXCW-RGIGPVFXSA-N','UGFAIRIUMAVXCW-ZDOIIHCHSA-N','UGFAIRIUMAVXCW-HQMMCQRPSA-N','UGFAIRIUMAVXCW-VQEHIDDOSA-N','UGFAIRIUMAVXCW-UHFFFAOYSA-N','UGFAIRIUMAVXCW-OUBTZVSYSA-N')))";
		String r2 = "select * where ((InchiKey IN ('UGFAIRIUMAVXCW-RGIGPVFXSA-N','UGFAIRIUMAVXCW-ZDOIIHCHSA-N','UGFAIRIUMAVXCW-HQMMCQRPSA-N','UGFAIRIUMAVXCW-VQEHIDDOSA-N','UGFAIRIUMAVXCW-UHFFFAOYSA-N','UGFAIRIUMAVXCW-OUBTZVSYSA-N'))) and (RadTransWavelength >= 2.4982704833333332E7 AND RadTransWavelength <= 3.3310273111111112E7)";

		try{
			result = VamdcSqlRequestComparator.compare(r1, r2);
		}catch(ParseCancellationException ex){
			fail("Grammatical Error!!!");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		assertTrue("Commutativiy Test_7 Failed!!!",result);
		
	}
	
	
			
	
}
