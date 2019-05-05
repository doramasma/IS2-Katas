package kata4.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

/**
 *
 * @author doram
 */
public class MailListReader {
    private static List<Mail> lista = new ArrayList();
    
    public static List<Mail> read(String fileName) {
        try {
        BufferedReader bufferreader = new BufferedReader(new FileReader(fileName));
        String line;
        
        while ((line = bufferreader.readLine()) != null) {
            if (line.contains("@")) {
                lista.add(new Mail(line));
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
