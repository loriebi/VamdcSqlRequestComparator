/**
 * Created by Levan Loria on 14/09/16.
 */

package vamdcsqlcomparator;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class is a listener that handles a subset of the available methods.
 * Constructs an almost complete binary tree from AST.
 */
public class VamdcSqlRequestWalker extends VamdcSqlRequestBaseListener{
	
	/**
	 * Almost complete binary tree.
	 * A tree in which each node that has a right child also has a left child.
	 */
    private VamdcRequestTree tree; 

    public VamdcSqlRequestWalker(){
        this.tree = new VamdcRequestTree();
    }


    /**
     * Checks case of Select * ... / Select ALL ...
     * @param ctx Listening to SelectContext.
     */
    public void enterSelect(VamdcSqlRequestParser.SelectContext ctx){
        if(ctx.selectList == null){
            this.tree.addColumnList("*");
        }

    }
 

    /**
     * Adds column into columnList of VamdcRequestTree.
     * @param ctx Listening to ListContext.
     */
    public void enterList(VamdcSqlRequestParser.ListContext ctx) {
        this.tree.addColumnList(ctx.getChild(0).toString());
    }


    /**
     * Adds new node into a binary tree.
     * If ExprContext has three childs, adding 'OR'.
     * @param ctx Listening to ExprContext.
     */
    public void enterExpr(VamdcSqlRequestParser.ExprContext ctx){

        if(ctx.children.size() == 3){

            String txt = ctx.getChild(1).getText();
            VamdcRequestNode node = new VamdcRequestNode(txt);

            this.tree.addNode(node);

        }
    }


    /**
     * Adds new node into a binary tree.
     * If FactorContext has three childs, adding 'AND'.
     * @param ctx Listening to FactorContext.
     */
    public void enterFactor(VamdcSqlRequestParser.FactorContext ctx){

        if(ctx.children.size() == 3){
            VamdcRequestNode node = new VamdcRequestNode(ctx.getChild(1).getText());

            this.tree.addNode(node);
        }
    }




    /**
     * Adds new node into a binary tree.
     * Adding binary expression (left BINARY_OP right).
     * @param ctx  Listening to CompexpContext.
     */
    public void enterCompexp(VamdcSqlRequestParser.CompexpContext ctx){


        String left = ctx.left.getText();
        String right = ctx.right.getText();
        String op = ctx.BOOLEAN_OP().toString();
        
        Format format = new DecimalFormat("0.0000000000000000E0");
        Double d;
        
        
        
        VamdcRequestNode node;
        
        
        TerminalNode terminal_node = ctx.right.NUM();
        if(terminal_node != null){
        	//d = Double.parseDouble(terminal_node.getText());
        	String d_tmp = String.valueOf(Double.parseDouble(terminal_node.getText()));
            
            
        	if(d_tmp.indexOf('E') == -1){
        		while(d_tmp.endsWith("0") && d_tmp.indexOf('.') != -1 ){
                	d_tmp = (d_tmp.substring(0, d_tmp.length() - 1));
                }
                if(d_tmp.endsWith(".")){
                	d_tmp = d_tmp.substring(0, d_tmp.length() - 1);
                }
        	}
            
            
            
            node = new VamdcRequestNode(left + " " + op + " " + d_tmp);
            
        	//node = new VamdcRequestNode(left + " " + op + " " + format.format(d));
        }else if((terminal_node = ctx.right.ID()) != null){
            //System.out.println("ID : " + terminal_node);
            node = new VamdcRequestNode(left + " " + op + " " + right);
        }else{
        	//System.out.println("List : " + right);
        	List<String> inList = new ArrayList<String>();
        	inList = Arrays.asList(right.replace("(", "").replace(")", "").split("\\s*,\\s*"));
        	Collections.sort(inList);
        	//System.out.println(inList.toString() +"\n\n");
        	node = new VamdcRequestNode(left + " " + op + " " + inList);
        	
        }
        
        
         

        this.tree.addNode(node);
    }


    public VamdcRequestTree getTree(){
        return this.tree;
    }

}
