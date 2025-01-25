package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/chinchonAnotador";
    private static final String USER = "root";
    private static final String PASSWORD = "localhost";

    // Método para obtener una conexión
    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Establecer la conexión
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            // Mostrar el error si algo sale mal
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }

        return connection;
    }

}
