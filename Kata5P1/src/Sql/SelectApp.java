package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author doram
 */
public class SelectApp {
    private String dataBaseRute;
    private String tableName;

    public SelectApp(String dataBaseRute, String tableName) {
        this.dataBaseRute = dataBaseRute;
        this.tableName = tableName;
    }
    
    
    private Connection connect() {
        String url = "jdbc:sqlite:" + dataBaseRute;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }

    public void selectAll() {
        String sql = tableName;
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t"
                        + rs.getString("Name") + "\t"
                        + rs.getString("Apellidos") + "\t"
                        + rs.getString("Departamento") + "\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
