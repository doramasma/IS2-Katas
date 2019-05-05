package kata2;

import java.util.Map;

/**
 *
 * @author Doramas Báez Bernal
 * @version 1.0
 */
public class Kata2 {
    
    public static void main(String[] args) {
        String [] data = {"Kevin","Hector","Borja","Kevin","Adrian niño rata",
                          "Borja","Adrian","Kevin","Kevin","Hector","Adrian"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for(String key : histogr.keySet()) {
            if (histogr.get(key) < 2) {
              System.out.println(key  + " está " 
                    + histogr.get(key) + " vez");  
            } else {
            
            System.out.println(key  + " está " 
                    + histogr.get(key) + " veces");
            }
        } 
        
    }
    
}
