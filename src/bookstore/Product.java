
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
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public int getStock() {
        if (quantity != 0) {
            this.quantity = --quantity;
        } 
        return this.quantity;
    }
    
    public String getDescription(){
        return "Some product description";
    }
}
