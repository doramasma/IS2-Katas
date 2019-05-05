package Kata5p2.main;

import Kata5P2.view.HistogramDisplay;
import static Kata5P2.view.MailHistogramBuilder.build;
import Kata5p2.model.Histogram;
import Kata5p2.model.Mail;
import java.io.IOException;
import java.util.List;
import static kata5p2.view.MailListReaderBD.read;


/**
 * @author Doramas Báez Bernal
 */
public class Kata5p2 {
    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    private Kata5p2 aux;
 
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Kata5p2().execute();
       

    }
    
    private void execute () {
        input();
        process();
        output();
    }
    
    private void input () {
        mailList = read();
    }
    
    private void process() {
        histogram = build(mailList);
    }
    
    private void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
