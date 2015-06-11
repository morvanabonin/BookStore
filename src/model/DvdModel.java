
package model;

import entity.DVD;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Model of DVD class
 * @author morvanabonin
 */
public class DvdModel {
    
    public DVD createDvd(String data) throws FileNotFoundException, Exception {
	if(data.isEmpty()) {
	    throw new Exception("Data cannot be empty");
	}
	
	String type;
	String title;
	String genre;
	try (Scanner dt = new Scanner(data).useDelimiter(";")) {
	    type = dt.next();
	    title = dt.next();
	    genre = dt.next();
	}
	DVD dvd = new DVD(type, title, genre); 
	return dvd;
    }
}
