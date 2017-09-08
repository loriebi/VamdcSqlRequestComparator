/**
 * Created by Levan Loria on 14/09/16.
 */

package vamdcsqlcomparator;


/**
 * This class is a node of the binary tree.
 */
public class VamdcRequestNode {

    private String value;
    private VamdcRequestNode left;
    private VamdcRequestNode right;
    private int nbrChild;
    private int nbrAndOrChild;



    public VamdcRequestNode(){

    }

    public VamdcRequestNode(String value){
        this.value = value;
        this.nbrChild = 0;
        this.nbrAndOrChild = 0;
    }


    public VamdcRequestNode(String value,VamdcRequestNode left, VamdcRequestNode right){
        this.value = value;
        this.left = left;
        this.right = right;
        this.nbrChild = 0;
        this.nbrAndOrChild = 0;
    }

    public VamdcRequestNode getLeft() {
        return left;
    }

    public void setLeft(VamdcRequestNode left) {
        this.left = left;
    }

    public String getValue() {
        return value;
    }
 
    public void setValue(String value) {
        this.value = value;
    }

    public VamdcRequestNode getRight() {
        return right;
    }

    public void setRight(VamdcRequestNode right) {
        this.right = right;
    }

    public int getNbrAndOrChild() {
        return nbrAndOrChild;
    }

    public void setNbrAndOrChild(int nbrAndOrChild) {
        this.nbrAndOrChild = nbrAndOrChild;
    }

    public int getNbrChild() {
        return nbrChild;
    }

    public void setNbrChild(int nbrChild) {
        this.nbrChild = nbrChild;
    }

}
