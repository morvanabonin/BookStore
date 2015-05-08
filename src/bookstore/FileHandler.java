
package bookstore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    
    public Product[] readFile() throws java.lang.Exception {

        File file = new File(this.PATH);

        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println(reader.readLine());
            Scanner sReader = new Scanner(reader.readLine()).useDelimiter("\\s*;\\s*");
            while (sReader.hasNext()) {
                System.out.println(sReader.next());
            }
            sReader.close();

            //Product line = ProductParser.parse(reader.readLine());
            //System.out.println(line);

        } else {
            throw new FileNotFoundException("File not found!");
        }

        Product[] p = new Product[3];
        return p;
    }
    
}
