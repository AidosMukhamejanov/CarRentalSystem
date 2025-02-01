import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManagement {
    private static final String URL = "jdbc:postgresql://localhost:5432/CarRent";
    private static final String USER = "postgres";
    private static final String PASSWORD = "72331476";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}