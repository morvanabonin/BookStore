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
public class Electronic extends Product {
    
    private String type;
    private String brand_name;
    private String description;
    
    public Electronic(String type, String brand_name) {
        this.type = type;
        this.brand_name = brand_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
