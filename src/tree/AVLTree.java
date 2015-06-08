
package tree;

/**
 *
 * @author morvanabonin
 */
public class AVLTree {
    
    private No root;
    
    public void insert(int k) {
	No no = new No(k);
	insertAVL(this.root, no);
    }
    
    public void insertAVL(No toCompare, No toInsert) {
	
	/**
	 * If compare equals null the root receive toInsert
	 */
	if(toCompare == null) {
	    this.root = toInsert;
	} else {
	    if (toInsert.getKey() < toCompare.getKey()) {
		if(toCompare.getLeft() == null) {
		    toCompare.setLeft(toInsert);
		    toInsert.setDaddy(toCompare);
		    verifyBalancig(toCompare);
		} else {
		    insertAVL(toCompare.getLeft(), toInsert);
		}
	    } else if(toInsert.getKey() > toCompare.getKey()) {
		if (toCompare.getRight() == null ) {
		    toCompare.setRight(toInsert);
		    toInsert.setDaddy(toCompare);
		    verifyBalancig(toCompare);
		} else {
		    insertAVL(toCompare.getRight(), toInsert);
		}
	    }
	}
    }

    private void verifyBalancig(No current) {
	setBalancing(current);
	int balancing = current.getBalancing();
	
	if (balancing == -2) {
	    if(height(current.getLeft().getLeft()) >= height(current.getLeft().getRight())) {
		
	    }
	}
    }
    
    public No rightRotation(No init) {
	
	No right = init.getRight();
	right.setDaddy(init.getDaddy());
	
	init.setRight(right.getLeft());
	
	if (init.getRight() != null) {
	    init.getRight().setDaddy(init);
	}
	
	right.setLeft(init);
	init.setDaddy(right);
	
	if (right.getDaddy() != null) {
	    
	    if(right.getDaddy().getRight() == init) {
		right.getDaddy().setDaddy(right);
	    } else if (right.getDaddy().getLeft() == init) {
		right.getDaddy().getLeft().setDaddy(right);
	    }
	}
	
	setBalancing(init);
	setBalancing(right);
	
	return right;
    }

    private int height(No current) {
	if (current == null) {
	    return -1;
	}
	
	if (current.getLeft() == null && current.getRight() == null) {
	    return 0;
	} else if (current.getLeft() == null) {
	    return 1 + height(current.getRight());
	} else if (current.getRight() == null) {
	    return 1 + height(current.getLeft());
	} else {
	    return 1 + Math.max(height(current.getLeft()), height(current.getRight()));
	}
    }
    
    private void setBalancing(No no) {
	no.setBalancing(height(no.getRight()) - height(no.getLeft()));
    }

}
