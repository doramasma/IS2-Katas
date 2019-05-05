package kata5p1;

/**
 * @author Doramas Báez Bernal
 */
import Sql.CreateTable;
import java.util.List;
import static kata5p1.view.MailListReader.read;
import sql.InsertData;

public class Kata5P1 {
    private static String fileName;
    private static List<String> mailList;
    private static CreateTable email;
    
    public static void main(String[] args) {
        fileName = "email.txt";
        mailList = read(fileName);
        InsertData dates = new InsertData();
        for (String i : mailList) {
            dates.insert(i);
        }
        
        //email = new CreateTable("prueba.db","CREATE TABLE IF NOT EXISTS email (\n"
        //    + " id integer PRIMARY KEY AUTOINCREMENT,\n"
        //    + " direccion text NOT NULL)");
        //SelectApp app1 = new SelectApp("PRUEBA.db","select * from people");
        //app1.selectAll();
        //SelectApp app2 = new SelectApp("PRUEBA.db","select * from email");
        //app2.selectAll();
        
        
    }
    
    

}


