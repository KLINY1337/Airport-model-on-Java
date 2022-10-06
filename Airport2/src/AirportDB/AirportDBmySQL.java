package AirportDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AirportDBmySQL {

    private String url;
    private String username;
    private String password;

    public AirportDBmySQL(){
        url="jdbc:mysql://localhost:3306/AirportDB";
        username="root";
        password="RootPassword-1337";
    }

    public void checkConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection= DriverManager.getConnection(url,username,password)){
            System.out.println("connected");
        }
    }
}
