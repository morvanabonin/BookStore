
package model;

import entity.DVD;
import java.util.Scanner;

/**
 * Model of DVD class
 * @author morvanabonin
 */
public class DvdModel {
    
    public DVD createDvd(String data) throws Exception {
	if(data.isEmpty()) {
	    throw new Exception("Data cannot be empty");
	}
	
	Scanner dt = new Scanner(data).useDelimiter("\\;+");
	String type = dt.next();
	String title = dt.next();
	String genre = dt.next();
	System.out.println(title);
	DVD dvd = new DVD(type, title, genre); 
	return dvd;
    }
}