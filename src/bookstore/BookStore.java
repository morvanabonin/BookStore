/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

/**
 *
 * @author Morvana
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Book objBook = new Book("O poder cósmico do homem", "Vernon Howard", "1234");
        DVD objDvd = new DVD("Music", "Imagine Dragons", "Rock");
        Electronic objElectronic = new Electronic("Celular", "LG", "Moto X");
       
        Product[] products = {objBook, objDvd, objElectronic};

        ShopCart obj = new ShopCart();
        obj.listProducts(products);
        
        Client objClient = new Client("Romeu Bartollo", "94582450058", "romeu.bartollo@gmail.com", "Rua do Arvoredo");
        System.out.println(objClient.getClient());
       
       
    }
    
}
