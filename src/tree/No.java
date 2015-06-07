
package tree;

/**
 * 
 * @author morvanabonin
 */
public final class No {
  
    private No left;
    private No right;
    private No daddy;
    private int key;
    private int balancing;

    public No(int k) {
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

    public No getDaddy() {
	    return daddy;
    }

    public No setDaddy(No daddy) {
	    this.daddy = daddy;
	    return daddy;
    }

    public No getRight() {
	    return right;
    }

    public No setRight(No right) {
	    this.right = right;
	    return right;
    }

    public No getLeft() {
	    return left;
    }

    public void setLeft(No left) {
	    this.left = left;
    }
}
