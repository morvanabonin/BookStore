
package bookstore;

import controller.BookStoreController;
import java.io.FileNotFoundException;

/**
 * Class BookStore - main of system
 * @author morvanabonin
 */
public class BookStore {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
       BookStoreController.executeAction();
       
    }
}
