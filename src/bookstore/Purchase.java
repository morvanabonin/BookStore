
package bookstore;

/**
 *
 * @author morvanabonin
 */
public class Purchase {
    
    public static final int CREDID_CARD = 1;
    public static final int BANK_SLIP = 2;
    
    public static void purchase(Product[] products, Client client) {
        Purchase._shopChart(products);
        Purchase._getTotal(products);
    }
    
    private static void _shopChart(Product[] products) {
        System.out.println("Lista deprodutos do carrinho de compras");
        
        for (Product product : products) {
            
            Purchase._getTypeProducts(product);
            if (product.getStock() == 0 ) {
                System.out.println("Não há produto em estoque");
            } else {
                System.out.println(product.getDescription());
                System.out.println(product.getPrice());
            }
            
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
    
    private static void _getTotal(Product[] products) {
        double count = 0;
                
        for ( Product  p: products) {
            count += p.getPrice();
        }
        System.out.println("Total = R$ "+count);
        
    }
    
    public static void paymentForm(int paymentForm) {
        if (paymentForm == CREDID_CARD) {
            System.out.println("Pagamento com Cartão de Crédito");
        } else if (paymentForm == BANK_SLIP) {
            System.out.println("Pagamento com Boleto");
        }
    }
    
    
}

