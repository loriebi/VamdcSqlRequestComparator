/**
 * Created by Levan Loria on 14/09/16.
 */

package vamdcsqlcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class is an implementation of almost binary tree.
 */
public class VamdcRequestTree {
	
	/**
	 * Root of the tree.
	 */
    private VamdcRequestNode root;
    
    /**
     * 	
     */
    private List<String> columnList;


    public VamdcRequestTree(){
        columnList = new ArrayList<String>();
    }


    /**
     * Adding column to list.
     * @param column Column to add.
     */
    public void addColumnList(String column){

        this.columnList.add(column);

    }



    /**
     * Adds new node to root.
     * @param node Node to add.
     */
    public void addNode(VamdcRequestNode node){



        if(this.root == null){
            this.root = node;
            return;
        }



        VamdcRequestNode current = root;
        VamdcRequestNode parent = null;

        //System.out.println(current.getValue());
        while(true) {

            parent = current;


            if (current.getLeft() == null) {

                current.setLeft(node);

                if(node.getValue().equals("and") || node.getValue().equals("or")){
                    parent.setNbrChild(parent.getNbrChild() + 1);
                    parent.setNbrAndOrChild(parent.getNbrAndOrChild() + 1);
                }else{
                    parent.setNbrChild(parent.getNbrChild() + 1);
                }

                return;

            } else {


                if(!current.getLeft().getValue().equals("and") && !current.getLeft().getValue().equals("or")){
                    current = current.getRight();

                    if(current == null){
                        parent.setRight(node);


                        if(node.getValue().equals("and") || node.getValue().equals("or")){
                            parent.setNbrChild(parent.getNbrChild() + 1);
                            parent.setNbrAndOrChild(parent.getNbrAndOrChild() + 1);
                        }else{
                            parent.setNbrChild(parent.getNbrChild() + 1);
                        }

                        return;
                    }

                    if(node.getValue().equals("and") || node.getValue().equals("or")){
                        parent.setNbrChild(parent.getNbrChild() + 1);
                        parent.setNbrAndOrChild(parent.getNbrAndOrChild() + 1);
                    }else{
                        parent.setNbrChild(parent.getNbrChild() + 1);
                    }



                }else{


                    //if left part is full, new node will be added to the right sub-tree

                    if((current.getLeft().getNbrAndOrChild() + 1) * 2 == current.getLeft().getNbrChild()) {
                        current = current.getRight();

                        if(current == null){
                            parent.setRight(node);

                            if(node.getValue().equals("and") || node.getValue().equals("or")){
                                parent.setNbrChild(parent.getNbrChild() + 1);
                                parent.setNbrAndOrChild(parent.getNbrAndOrChild() + 1);
                            }else{
                                parent.setNbrChild(parent.getNbrChild() + 1);
                            }

                            return;
                        }

                        if(node.getValue().equals("and") || node.getValue().equals("or")){
                            parent.setNbrChild(parent.getNbrChild() + 1);
                            parent.setNbrAndOrChild(parent.getNbrAndOrChild() + 1);
                        }else{
                            parent.setNbrChild(parent.getNbrChild() + 1);
                        }

                    }else{ // if left in not full, new node will be added to the left sub-tree

                        current = current.getLeft();

                        if(node.getValue().equals("and") || node.getValue().equals("or")){
                            parent.setNbrChild(parent.getNbrChild() + 1);
                            parent.setNbrAndOrChild(parent.getNbrAndOrChild() + 1);
                        }else{
                            parent.setNbrChild(parent.getNbrChild() + 1);
                        }

                    }


                }



            }

        }

    }




    /**
     * Function applies distributive property to node.
     * @param node Node to apply distributive property.
     * @return VamdcRequestNode
     */
    public VamdcRequestNode distributivity(VamdcRequestNode node){


        if(isLeaf(node)) return node;

        if(node.getValue().equals("or")){
            node.setLeft(distributivity(node.getLeft()));
            node.setRight(distributivity(node.getRight()));
            return node;
        }

        if(node.getValue().equals("and")){


            if(node.getLeft().getValue().equals("or")){

                VamdcRequestNode tmpNode = new VamdcRequestNode();

                tmpNode.setValue("or");
                tmpNode.setLeft(new VamdcRequestNode());
                tmpNode.setRight(new VamdcRequestNode());


                tmpNode.getLeft().setValue("and");
                tmpNode.getLeft().setLeft(distributivity(node.getLeft().getLeft()));
                tmpNode.getLeft().setRight(distributivity(node.getRight()));

                tmpNode.getRight().setValue("and");
                tmpNode.getRight().setLeft(distributivity(node.getLeft().getRight()));
                tmpNode.getRight().setRight(distributivity(node.getRight()));


                node.setValue(tmpNode.getValue());
                node.setLeft(tmpNode.getLeft());
                node.setRight(tmpNode.getRight());
                node.setLeft(distributivity(node.getLeft()));
                node.setRight(distributivity(node.getRight()));


            }else if(node.getRight().getValue().equals("or")){

                VamdcRequestNode tmpNode = new VamdcRequestNode();

                tmpNode.setValue("or");
                tmpNode.setLeft(new VamdcRequestNode());
                tmpNode.setRight(new VamdcRequestNode());

                tmpNode.getLeft().setValue("and");
                tmpNode.getLeft().setLeft(distributivity(node.getRight().getLeft()));
                tmpNode.getLeft().setRight(distributivity(node.getLeft()));

                tmpNode.getRight().setValue("and");
                tmpNode.getRight().setLeft(distributivity(node.getRight().getRight()));
                tmpNode.getRight().setRight(distributivity(node.getLeft()));


                node.setValue(tmpNode.getValue());
                node.setLeft(tmpNode.getLeft());
                node.setRight(tmpNode.getRight());
                node.setLeft(distributivity(node.getLeft()));
                node.setRight(distributivity(node.getRight()));


            }else {
                node.setLeft(distributivity(node.getLeft()));
                node.setRight(distributivity(node.getRight()));

                if(node.getLeft().getValue().equals("or") || node.getRight().getValue().equals("or")){
                    return distributivity(node);
                }
            }

        }

        return node;
    }


    /**
     * Generates list of boolean expressions. (expressions are separated by 'OR').
     * @param node Generates list of boolean expressions from node.
     * @return List
     */
    public List<String> generateOrElements(VamdcRequestNode node){

        List<String> list;

        if(isLeaf(node)){
            list = new ArrayList<String>();
            list.add(node.getValue());

            return list;
        }


        if(node.getValue().equals("or")){
            List<String> list1 = generateOrElements(node.getLeft());
            List<String> list2 = generateOrElements(node.getRight());


            list = new ArrayList<String>();
            list.addAll(list1);
            list.addAll(list2);


        }else{

            list = new ArrayList<String>();
            String multString = "";

            List<String> listMult = mult(node);
            Collections.sort(listMult);
            
            
            for(int i=0;i<listMult.size();i++){
            	multString += listMult.get(i);
            	if(i != (listMult.size() - 1)){
            		multString += " and ";
            	}
            }


            list.add(multString);
            
        }

        

        return list;
    }


    /**
     * Returns sorted list (lexicographically) of boolean expressions.
     * Called for 'AND' node!!!
     * @param node Generates list of boolean expressions from node (for 'AND' operations).
     * @return List
     */
    public List<String> mult(VamdcRequestNode node){

        List<String> list;

        if(isLeaf(node)){

            list = new ArrayList<String>();
            list.add(node.getValue());

            return list;

        }else{

            list = new ArrayList<String>();

            list.addAll(mult(node.getLeft()));
            list.addAll(mult(node.getRight()));

        }

        return list;
    }




    /**
     * Checks if node is an operation and/or.
     * @param node Checks if node is an operation ('AND' / 'OR').
     * @return boolean
     */
    public boolean isOperation(VamdcRequestNode node){

        if(node.getValue().equals("and") || node.getValue().equals("or")){
            return true;
        }

        return false;
    }


    /**
     * Checks if node is a leaf.
     * @param node Checks if node is a leaf.
     * @return boolean
     */
    public boolean isLeaf(VamdcRequestNode node){

        if(node.getLeft() == null) return true;

        return false;
    }


    public VamdcRequestNode getRoot(){
        return this.root;
    }

    public List<String> getColumnList(){
        return this.columnList;
    }

}
