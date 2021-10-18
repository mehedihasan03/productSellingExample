package sellingDropdown.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/pms47";
    private static final String USER = "root";
    private static final String PSWD = "123456";
    private static Connection con = null;

    public static Connection connect() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection(URL, USER, PSWD);
                System.out.println("Connection successfull");

            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }
        return con;
    }
}
