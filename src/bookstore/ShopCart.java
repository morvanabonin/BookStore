/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookstore;

/**
 * 
 * @author Morvana Bonin
 */
public class ShopCart {
    
    public void listProducts(Product[] products) {
        for ( Product product : products) {
            this._getTypeProducts(product);
            System.out.println(product.getDescription());
            System.out.println("=======================");
        }
    }
    
    private void _getTypeProducts(Product product) {
        
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
