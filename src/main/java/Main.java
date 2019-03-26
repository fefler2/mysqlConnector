import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {



        String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
        String user;
        String password;
        Connection myConn = DriverManager.getConnection(url, user, password);

    }
}
