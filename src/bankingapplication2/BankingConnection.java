package bankingapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankingConnection {
    public static Connection connect(){
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "password";
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
