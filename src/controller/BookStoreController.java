
package controller;

import entity.Product;
import entity.Client;
import entity.Book;
import entity.DVD;
import entity.Electronic;

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
    
    public static void executeAction() {
	/**
         * Objetos instances and add new Book, DVD and Eletronic
         */
        Book book = new Book("O poder cósmico do homem", "Vernon Howard", "1234");
        book.setQuantity(5);
        book.setPrice(30.00);
        
        DVD dvd = new DVD("Music", "Imagine Dragons", "Rock");
        dvd.setQuantity(3);
        dvd.setPrice(35.00);
        
        Electronic electronic = new Electronic("Celular", "LG", "Moto X");
        electronic.setQuantity(2);
        electronic.setPrice(1200.00);
        
        /**
         * Create a list of products with array
         */
        Product[] products = {book, dvd};
       
        /**
         * Instace of Client 
         */
        Client client = new Client("Romeu Bartollo", "94582450058", "romeu.bartollo@gmail.com", "Rua do Arvoredo");
        System.out.println("Compra :");
        System.out.println(client.getClient());
        System.out.println("___________________________");
        PurchaseController.purchase(products, client);
        PurchaseController.paymentForm(1);
    }
}