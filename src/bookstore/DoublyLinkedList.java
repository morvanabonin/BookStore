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
    
    /**
     * Define nodo as first of list
     * @return first
     */
    public Nodo getFirst() {
        return first;
    }

    /**
     * Returns the first nodo of the list
     * @param first 
     */
    public void setFirst(Nodo first) {
        this.first = first;
    }
    
    public void add(Product element) {}
    
}
