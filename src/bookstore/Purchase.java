
package bookstore;

/**
 *
 * @author morvanabonin
 */
public class Purchase {
    
    public static void shopChart(Product[] products) {
        System.out.println("Lista deprodutos do carrinho de compras");
        
        for (Product product : products) {
            
            Purchase._getTypeProducts(product);
            System.out.println(product.getDescription());
            System.out.println(product.getPrice());
            System.out.println("__________________________");
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
    
    public static void getTotal(Product[] products) {
        double count = 0;
                
        for ( Product  p: products) {
            count += p.getPrice();
        }
        System.out.println("Total = R$ "+count);
        
    }
    
    public static void purchase(Product[] products, Client client) {
        
    }
    
}

