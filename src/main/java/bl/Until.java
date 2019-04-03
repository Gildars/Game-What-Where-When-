package bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Until {
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/game;database_to_upper=false";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PASSWORD = "";

    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            System.out.println("Connection: OK");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROR" + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
