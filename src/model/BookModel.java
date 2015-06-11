
package model;
import entity.Book;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Model of Book class
 * @author morvanabonin
 */
public class BookModel {
    
    public Book createBook(String data) throws FileNotFoundException, Exception {
		
	if(data.isEmpty()) {
	    throw new Exception("Data cannot be empty");
	}
	
	Scanner dt = new Scanner(data).useDelimiter(";");
	System.out.println(data);
	String title = dt.next();
	String author = "Não tem!";
	String ISBN = dt.next();
	dt.close();
	System.out.println(title);
	Book book = new Book(title, author, ISBN); 
	return book;
    }
}
