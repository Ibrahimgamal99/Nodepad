package Notepad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {

//    private final String name = "hema";
//    private final String pass = "1234";
    private final String url = "jdbc:sqlite:notepad.db";
    public Connection connection() throws SQLException {
       Connection c = DriverManager.getConnection(url);
        return c;
    }
}

