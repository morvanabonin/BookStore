
package bookstore;

/**
 * Class Product
 * @author Morvana Bonin
 */
public class Product {
    
    private double price;
    int quantity;
    
    public Product() {
        this.quantity = 3;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return this.quantity--;
    }
    
    public String getDescription(){
        return "Some product description";
    }
}
