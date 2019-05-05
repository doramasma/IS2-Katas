package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import static kata4.view.MailHistogramBuilder.build;
import static kata4.view.MailListReader.read;

/**
 * @author Doramas Báez Bernal
 */
public class Kata4 {
    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    private  Kata4 aux;
 
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Kata4().execute();
       

    }
    
    private void execute () {
        input();
        process();
        output();
    }
    
    private void input () {
        fileName = "email.txt";
        mailList = read(fileName);
    }
    
    private void process() {
        histogram = build(mailList);
    }
    
    private void output() {
        histoDisplay = new HistogramDisplay(histogram);
         histoDisplay.execute();
    }
    
}
