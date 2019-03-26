import java.sql.*;

public class Main {
    public static void main(String[] args) {



        String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
        String user = "root"; // nazwa usera w bazie danych
        String password = "secret";
        try {
            Connection myConn =
                    DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql;
            ResultSet rs = myStmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
