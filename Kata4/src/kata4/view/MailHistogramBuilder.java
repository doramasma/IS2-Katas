package kata4.view;

import java.util.Iterator;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

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
