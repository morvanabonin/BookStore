
package model;
import entity.Book;
import java.util.Scanner;

/**
 * Model of Book class
 * @author morvanabonin
 */
public class BookModel {
    
    public Book createBook(String data) throws Exception {
	if(data.isEmpty()) {
	    throw new Exception("Data cannot be empty");
	}
	
	Scanner dt = new Scanner(data).useDelimiter("\\;+");
	String title = dt.next();
	String author = dt.next();
	String ISBN = dt.next();
	System.out.println(title);
	Book book = new Book(title, author, ISBN); 
	return book;
    }
}
