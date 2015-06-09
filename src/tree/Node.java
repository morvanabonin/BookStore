
package tree;

/**
 * 
 * @author morvanabonin
 */
public final class Node {
  
    private Node left;
    private Node right;
    private Node daddy;
    private int key;
    private int balancing;

    public Node(int k) {
	setLeft(setRight(setDaddy(null)));
	setBalancing(0);
	setKey(k);
    }

    @Override
    public String toString() {
	    return Integer.toString(getKey());
    }

    public int getKey() {
	    return key;
    }

    public void setKey(int key) {
	    this.key = key;
    }

    public int getBalancing() {
	return balancing;
    }

    public void setBalancing(int balancing) {
	this.balancing = balancing;
    }

    public Node getDaddy() {
	return daddy;
    }

    public Node setDaddy(Node daddy) {
	this.daddy = daddy;
	return daddy;
    }

    public Node getRight() {
	return right;
    }

    public Node setRight(Node right) {
	this.right = right;
	return right;
    }

    public Node getLeft() {
	return left;
    }

    public void setLeft(Node left) {
	this.left = left;
    }
}
