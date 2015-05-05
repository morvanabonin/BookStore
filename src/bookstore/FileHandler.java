
package bookstore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class to open and read files, return lines in objects
 * 
 * @author morvanabonin
 */
public class FileHandler {
    
    private final String PATH;

    public FileHandler() {
        this.PATH = "util/dados.txt";
    }
    
    public void readFile() throws FileNotFoundException, IOException {
        File file = new File(this.PATH);
        
        if(file.exists()) {
            BufferedReader line = new BufferedReader(new FileReader(file));
            System.out.println(line.readLine());
        }
        
    }

    
//    public Product[] readFile() throws java.lang.Exception {
//            
//        File file = new File(this.PATH);
//        
//        if (file.exists()) {
//            BufferedReader reader = new BufferedReader(new FileReader(file));
//            System.out.println(reader.readLine());
//          
//            Product line = ProductParser.parse(reader.readLine());
//            
//        } else {
//            throw new FileNotFoundException("File not found!");
//        }
//        
//        Product[] p = new Product[3];
//        return p;
//    }
    
    
}
