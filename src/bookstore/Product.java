/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookstore;

/**
 *
 * @author Morvana Bonin
 */
public class Product {
    
    private double price;
    private int quantity;
    
    //TO DO list of products (array) here

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
    
    public String description(){
        return "Some product description";
    }
}
