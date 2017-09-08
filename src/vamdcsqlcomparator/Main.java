package vamdcsqlcomparator;

import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Main {
	
	
	public static void main(String args[]) {

		// two sql requests
        //String req1 = args[0];
        //String req2 = args[1];
        
        
        
        // VamdcSqlRequestComparator.compare --> throws ParseCancellationException
        /*
        try{
        	System.out.println(VamdcSqlRequestComparator.compare(req1,req2));
        }catch(ParseCancellationException ex){
            //ex.printStackTrace();
        	System.out.println(ex.getMessage());
        }catch (Exception ex) {
        	ex.printStackTrace();
        	//System.out.println(ex.getMessage());
		}
        */
        
        
        String req = "select f1,f2,f3 where RadTransWavelength<=5.6380000000000000E3 and RadTransWavelength<=56000000000 and InchiKey='LBVWYGNGGJURHQ-UHFFFAOYSA-N' or a<1";
        
        
        try{
        	System.out.println(VamdcSqlRequestComparator.canonicalForm(req));
        }catch(ParseCancellationException ex){
            //ex.printStackTrace();
        	System.out.println(ex.getMessage());
        }catch (Exception ex) {
        	ex.printStackTrace();
        	//System.out.println(ex.getMessage());
		}
        
	}
	
}




