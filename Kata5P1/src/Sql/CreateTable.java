package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    private static String urlDataBase;
    private static String sqlProcess;

    public CreateTable(String urlDataBase, String sqlProcess) {
        this.urlDataBase = urlDataBase;
        this.sqlProcess = sqlProcess;
        createNewTable();
    }
    
    
    public static void createNewTable() {
// Cadena de conexión SQLite
        String url = "jdbc:sqlite:" + urlDataBase;
// Instrucción SQL para crear nueva tabla
        String sql = sqlProcess;
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
// Se crea la nueva tabla
            stmt.execute(sql);
            System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
