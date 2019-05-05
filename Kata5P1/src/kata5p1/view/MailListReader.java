package kata5p1.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author doram
 */
public class MailListReader {
    private static List<String> lista = new ArrayList();
    
    public static List<String> read(String fileName) {
        try {
        BufferedReader bufferreader = new BufferedReader(new FileReader("email.txt"));
        String line;
        
        while ((line = bufferreader.readLine()) != null) {
            if (line.contains("@")) {
                lista.add(new String(line));
            }
            
        }

    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    }
       
 
        
        return lista;
    }
}
