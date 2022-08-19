import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.sql.*;

public class Hello {

    private static void  insert(Connection connection){
        try {

            PreparedStatement ps = connection.prepareStatement("INSERT INTO `customers` (`username`,`last_name`,`first_name`,  `phone`, `address`, `city`, `country`) VALUES  (?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1, "popescux");
            ps.setString(2, "popescu");
            ps.setString(3, "x");
            ps.setString(4,"07219875462");
            ps.setString(5,"Cluj");
            ps.setString(6,"Cluj");
            ps.setString(7,"Romania");

            int noInserted = ps.executeUpdate();
            System.out.println((noInserted > 0 ? noInserted : "Not executed") + "SQL query");
        } catch (SQLException e) {
            System.err.println("There was a problem with SQL: "+ e.getMessage());
            e.printStackTrace();
        }
    }

    private static void select(Connection connection) throws SQLException {
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM `customers`");
        StringBuilder sb = new StringBuilder();
        while (rs.next()){
            String phone = rs.getString("phone");
            String username = rs.getString("username");
            sb.append(username + " (" + phone + ")" + "\n");
        }
        System.out.println(sb);
    }

    private static Connection connect() throws SQLException {
        String connectionUrl = "jdbc:mysql://localhost:3306/tema1";
        String usename = "root";
        String password = "Root";
        Connection connection = DriverManager.getConnection(connectionUrl, usename, password);
        return connection;
    }

    public static void main(String[] args) {
        Pair pair = new ImmutablePair<String, String>("test", "altceva");
        try {
            Connection connection = Hello.connect();
            //Hello.insert(connection);
            Hello.select(connection);

            Customer.getById();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
