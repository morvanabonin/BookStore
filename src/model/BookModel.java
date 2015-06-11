
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
	
	String title;
	String author;
	String ISBN;
	try (Scanner dt = new Scanner(data).useDelimiter(";")) {
	    System.out.println(data);
	    title = dt.next();
	    author = "Não tem!";
	    ISBN = dt.next();
	}
	System.out.println(title);
	Book book = new Book(title, author, ISBN); 
	return book;
    }
}
