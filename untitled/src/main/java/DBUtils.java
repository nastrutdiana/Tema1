import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tema1","root","Root");
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
