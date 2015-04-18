
package bookstore;

/**
 *
 * @author Morvana
 */
public class Book extends Product {
    
    private String title;
    private String author;
    private String ISBN;
    
    public Book() {
        super();
    }
    
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    @Override
    public String getDescription() {
        return "Autor: " + author + "\n"+ "Titulo: " + title;
    }
    
    @Override
    public int getQuantity() {
        return this.quantity--;
    }

}
