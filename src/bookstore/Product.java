
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getDescription(){
        return "Some product description";
    }
}
