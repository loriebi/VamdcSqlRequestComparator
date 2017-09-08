package vamdcsqlcomparator;
/**
 * Created by Levan Loria on 14/09/16.
 */


import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



/**
 * This class contains only one static method, which compares two VAMDC SQL requests.
 */
public class VamdcSqlRequestComparator {
	
	/**
	 * Compares two sql requests.
	 * @param req1 First Sql request to compare.
	 * @param req2 Second Sql request to compare.
	 * @return boolean Returns true if the comparator founds that requests are equal.
	 * @throws ParseCancellationException Cancellation of parsing, after syntax error occurred.
	 * @throws Exception Other exception.
	 */
    public static boolean compare(String req1, String req2) throws ParseCancellationException,Exception {


        String request1 = req1.replace('\n',' ').toLowerCase();
        String request2 = req2.replace('\n',' ').toLowerCase();
        
        
        
 
        ANTLRInputStream stream;
        VamdcSqlRequestLexer lexer;
        CommonTokenStream tokens;
        VamdcSqlRequestParser parser;
        ParseTree tree;
        ParseTreeWalker walker;
        VamdcSqlRequestWalker parserWalker;

 

        VamdcRequestTree requestTree1 = new VamdcRequestTree();
        VamdcRequestTree requestTree2 = new VamdcRequestTree();
        VamdcRequestNode root1 = new VamdcRequestNode();
        VamdcRequestNode root2 = new VamdcRequestNode();

        /* --------------------------------- First request ------------------------------------------------------------- */

        try{
            stream = new ANTLRInputStream(request1);
            lexer = new VamdcSqlRequestLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.instance);
            tokens = new CommonTokenStream(lexer);
            parser = new VamdcSqlRequestParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.instance);
            tree = parser.select();   // parsing select
            walker = new ParseTreeWalker(); 
            parserWalker = new VamdcSqlRequestWalker();
            walker.walk(parserWalker,tree);  // constructing VamdcRequestTree

            requestTree1 = parserWalker.getTree();
            root1 = requestTree1.getRoot();
        }catch(Exception ex){
        	throw ex;
        }


        /* --------------------------------- Second request ------------------------------------------------------------- */

        try{
            stream = new ANTLRInputStream(request2);
            lexer = new VamdcSqlRequestLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.instance);
            tokens = new CommonTokenStream(lexer);
            parser = new VamdcSqlRequestParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.instance);
            tree = parser.select();   // parsing select
            walker = new ParseTreeWalker();
            parserWalker = new VamdcSqlRequestWalker();
            walker.walk(parserWalker,tree);  // constructing VamdcRequestTree

            requestTree2 = parserWalker.getTree();
            root2 = requestTree2.getRoot();
        }catch(Exception ex){
        	throw ex;
        }


        /* --------------------------------- End of initialization ------------------------------------------------------------- */
        	
        
        if(request1.equals(request2) && request1 != null){
            return true;
        }
            
        /* comparing list of columns */
        List<String> columns1 = requestTree1.getColumnList();
        List<String> columns2 = requestTree2.getColumnList();

        Collections.sort(columns1);
        Collections.sort(columns2);

        if(columns1.size() != columns2.size()) {
        	return false;
        }

        for(int i=0;i<columns1.size();i++){
        	if(!columns1.get(i).equals(columns2.get(i))){
        		return false;
        	}
        }
            

        /* comparing "where" part of "select" */
        
        if(root1 == null && root2 == null)
        	return true;

        if(root1 == null && root2 != null) return false;

        if(root1 != null && root2 == null) return false;
        

        VamdcRequestNode tmpNode1 = requestTree1.distributivity(root1);
        VamdcRequestNode tmpNode2 = requestTree2.distributivity(root2);


        List<String> list1 = requestTree1.generateOrElements(tmpNode1);
        List<String> list2 = requestTree2.generateOrElements(tmpNode2);

        // result from request ----> expr1 OR expr2 OR ... OR exprN
        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.size() != list2.size()) {
            return false;
        }

        for(int i=0;i<list1.size();i++){
            if(!list1.get(i).equals(list2.get(i))){
                return false;
            } 
        }

        

        return true;

        
    }
    
    
    
    /**
     * Returns canonical form of Vamdc Sql Request.
     * @param req Vamdc Sql request.
     * @return String canonical form of Vamdc Sql request.
     * @throws ParseCancellationException Cancellation of parsing, after syntax error occurred.
     * @throws Exception Other Exception.
     */
    public static String canonicalForm(String req) throws ParseCancellationException,Exception {
    	
    	String canonicalForm = "";
    	
    	String request = req.replace('\n',' ').toLowerCase();
        
        

        ANTLRInputStream stream;
        VamdcSqlRequestLexer lexer;
        CommonTokenStream tokens;
        VamdcSqlRequestParser parser;
        ParseTree tree;
        ParseTreeWalker walker;
        VamdcSqlRequestWalker parserWalker;

 

        VamdcRequestTree requestTree = new VamdcRequestTree();
        VamdcRequestNode root = new VamdcRequestNode();
    	
    	
    	try{
            stream = new ANTLRInputStream(request);
            lexer = new VamdcSqlRequestLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.instance);
            tokens = new CommonTokenStream(lexer);
            parser = new VamdcSqlRequestParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.instance);
            tree = parser.select();   // parsing select
            walker = new ParseTreeWalker(); 
            parserWalker = new VamdcSqlRequestWalker();
            walker.walk(parserWalker,tree);  // constructing VamdcRequestTree

            requestTree = parserWalker.getTree();
            root = requestTree.getRoot();
        }catch(Exception ex){
        	throw ex;
        }
    	
    	
            
        /* list of columns */
        List<String> columns = requestTree.getColumnList();

        Collections.sort(columns);
        
        canonicalForm += "select ";
    	for(int i=0;i<columns.size();i++){
    		canonicalForm += columns.get(i);
    		if(i != (columns.size() -1)){
    			canonicalForm += ',';
    		}
    	}
            

        /* comparing "where" part of "select" */
        
        if(root == null){
            canonicalForm += ";";
        	return canonicalForm;
        }else{
        	canonicalForm += " where ";
        }
        
        

        VamdcRequestNode tmpNode = requestTree.distributivity(root);


        List<String> list = requestTree.generateOrElements(tmpNode);

        // result from request ----> expr1 OR expr2 OR ... OR exprN
        Collections.sort(list);


        for(int i=0;i<list.size();i++){
            canonicalForm += "( " + list.get(i);
            if(i != (list.size() -1)){
            	canonicalForm += " ) or ";
            }else{
            	canonicalForm += " )";
            }
        }
    	
        canonicalForm += ";";
        
    	return canonicalForm;
    }




}
