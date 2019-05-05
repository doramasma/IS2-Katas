
package kata3;

/**
 *
 * @author Doramas Báez Bernal
 * @Version 1.0
 * 
 */
public class Kata3 {

  
    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        new HistogramDisplay(histogram).execute();
    }
    
}
