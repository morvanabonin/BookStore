
package bookstore;

/**
 * 
 * @author Morvana Bonin
 */
public class ShopCart {
    
    public static void listProducts(Product[] products) {
        for ( Product product : products) {
            ShopCart._getTypeProducts(product);
            System.out.println(product.getDescription());
            System.out.println(product.getQuantity());
            System.out.println("=======================");
        }
    }
    
    private static void _getTypeProducts(Product product) {
        System.out.print("Produto: ");
        if(product instanceof Book) {
            System.out.println("Livro");
        } else if (product instanceof DVD) {
            System.out.println("DVD");
        } else {
            System.out.println("Eletrônico");
        }
    }
    
}
