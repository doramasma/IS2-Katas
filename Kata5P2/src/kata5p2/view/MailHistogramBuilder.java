package Kata5P2.view;

import java.util.Iterator;
import java.util.List;
import Kata5p2.model.Histogram;
import Kata5p2.model.Mail;

/**
 *
 * @author doram
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build (List<Mail> lista) {
        Histogram<String> histogram = new Histogram();
        for (Mail i : lista) {
            histogram.increment(i.getDomain());
        }
        
        
        return histogram;
    }
}
