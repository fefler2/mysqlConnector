import java.sql.*;

public class ConnectionManager {
    private static String url = "jdbc:mysql://localhost:3306/prototypeeop";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "triala";
    private static Connection con = null;
    private static String urlstring;

    private Statement stmt = null;
    private ResultSet rs = null;


    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlstring, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        ConnectionManager connectionManager = new ConnectionManager();
        con = ConnectionManager.getConnection();
        connectionManager.stmt = con.createStatement();
//        connectionManager.rs = connectionManager.stmt.executeQuery("select * from tabel");

    }
}