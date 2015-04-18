
package bookstore;

/**
 *
 * @author Morvana Bonin
 */
public class DVD extends Product {
    
    private String type;
    private String title;
    private String genre;   
   
    public DVD() {
        super();
    }
    
    public DVD(String type, String title, String genre) {
        this.type = type;
        this.title = title;
        this.genre = genre;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public String getDescription() {
        return "Type: " + type + "\n" + "Titulo: " + title;
    }
    
    @Override
    public int getQuantity() {
        return this.quantity--;
    }
}
