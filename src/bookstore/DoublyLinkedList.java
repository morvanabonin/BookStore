    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author morvana.bonin
 */
public class DoublyLinkedList {

    private Nodo first = null;
    private Nodo last = null;

    /**
     * Returns the first nodo of the list
     *
     * @return first
     */
    public Nodo getFirst() {
	   return first;
    }

    /**
     * Define nodo as first of list
     *
     * @param first
     */
    public void setFirst(Nodo first) {
	   this.first = first;
    }

    /**
     * Define nodo as last of list
     *
     * @return last
     */
    public Nodo getLast() {
	   return last;
    }

    /**
     * Returns the last nodo of the list
     *
     * @param last
     */
    public void setLast(Nodo last) {
	   this.last = last;
    }

    public void add(Product element) {
        
    }

}
