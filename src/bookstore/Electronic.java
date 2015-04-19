
package bookstore;

/**
 *
 * @author Morvana Bonin
 */
public class Electronic extends Product {
    
    private String type;
    private String brand_name;
    private String detailing;
   
    public Electronic() {
        super();
    }
    
    public Electronic(String type, String brand_name, String detailing) {
        this.type = type;
        this.brand_name = brand_name;
        this.detailing = detailing;
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

    public String getDetailing() {
        return detailing;
    }

    public void setDetailing(String detailing) {
        this.detailing = detailing;
    }
    
    @Override
    public String getDescription() {
        return "Tipo: " + type + "\n" + "Marca: " + brand_name + "\n" + "Descrição: " + detailing;
    }

}
