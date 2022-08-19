import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {
    static String tabelName = "customers"
    int id;
    String username;
    String phone;
    String city;

    public Customer(int id, String username, String phone, String city) {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.city = city;
    }



    public static Customer getById(Connection connection, int id) throws SQLException {
        // SELECT * FROM `customers` WHERE id = ?

        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM `" + Customer.tabelName + "` WHRE `id` = '" + id + "' LIMIT 1");

        if (rs.next()){
            int selId = rs.getInt("id");
            String phone = rs.getString("phone");
            String username = rs.getString("username");
            String city = rs.getString("city");

            return new Customer(selId, username, phone, city);
        }

        return null;
    }
}
