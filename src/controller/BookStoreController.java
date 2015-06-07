
package controller;

import entity.Client;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import model.BookModel;
import model.DvdModel;

/**
 * Class BookStoreController - main of system
 * @author Morvana
 */
public class BookStoreController {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    
    public void executeAction() throws FileNotFoundException, Exception {
	
	File dataFile = new File(System.getProperty("user.dir") + "/util/dados.csv");
	
	if(dataFile.isFile()){
	    Scanner fileReader = new Scanner(dataFile).useDelimiter(";");
	    if (fileReader.hasNext()) {
		while (fileReader.hasNext()) {
		    String type = fileReader.next();
		    String data = fileReader.nextLine().replaceFirst(";", "");
		    switch (type) {
		    	case "livro":
			    BookModel book = new BookModel();
			    book.createBook(data);
			    break;
		    	case "dvd":
			    DvdModel dvd = new DvdModel();
			    dvd.createDvd(data);
			    break;
		    }
		    fileReader.close();
		}
	    }
	}
       
        /**
         * Instace of Client 
         */
        Client client = new Client("Romeu Bartollo", "94582450058", "romeu.bartollo@gmail.com", "Rua do Arvoredo");
        System.out.println("Compra :");
        System.out.println(client.getClient());
        System.out.println("___________________________");
        //PurchaseController.purchase(products, client);
        PurchaseController.paymentForm(1);
	
    }
}
