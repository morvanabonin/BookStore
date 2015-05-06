
package bookstore;

/**
 * Node to manipulate the nodos of the list and your elements
 * @author morvanabonin
 */
public class Nodo {
        
    // o acesso a um elemento de uma lista é de forma indireta, sempre percorrendo a lista
    
    /**
     * The element of list is a object of Product
     */
    private Product element;
    
    /**
     * Indicates the previous reference of a list node
     */
    private Nodo previous;
    
    /**
     * Indicates the next reference of a list node
     */
    private Nodo next;
    
    public Nodo(Nodo previous, Nodo next, Product element) {
        this.previous = previous;
        this.next = next;
    }
    
    public Product getElement() {
        return element;
    }

    public void setElement(Product element) {
        this.element = element;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}

