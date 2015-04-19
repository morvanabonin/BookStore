
package bookstore;

/**
 * Class Product
 * @author Morvana Bonin
 */
public class Product {
    
    private double price;
    private int quantity;
    
    public double getPrice() {
        return price;
    }
    
    public void setQuantity() {
        
    }

    public int getQuantity() {
        return --this.quantity;
    }
    
    public String getDescription(){
        return "Some product description";
    }
}
