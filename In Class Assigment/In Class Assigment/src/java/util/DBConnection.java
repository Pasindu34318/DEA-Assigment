
package util;

import java.sql.*;

public class DBConnection {
    
    private static final String DBURL = "jdbc:mysql://localhost:3306/dea";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        
        try {
            //Load the MYSQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabilish the Connection
            connection = DriverManager.getConnection(DBURL, USER, PASS);
            System.out.println("Connection Successfull");
        } catch(ClassNotFoundException e) {
            System.err.println("JDBC Driver not found " + e.getMessage());
        } catch(SQLException e) {
            System.err.println("Database Connection error " + e.getMessage());
        }
        
        return connection;
    }
}
