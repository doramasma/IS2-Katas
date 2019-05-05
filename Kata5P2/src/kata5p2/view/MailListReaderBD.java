package kata5p2.view;

import Kata5p2.model.Mail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author doram
 */
public class MailListReaderBD {
    private static List<Mail> lista = new ArrayList();
    
    private static Connection connect() {
        String url = "jdbc:sqlite:prueba.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    
    public static List<Mail> read() {
        
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("Select Direccion from email")) {
            while (rs.next()) {
                lista.add(new Mail(rs.getString("Direccion")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
