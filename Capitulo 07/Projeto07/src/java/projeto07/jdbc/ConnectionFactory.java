
package projeto07.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jogom
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException{
        
        String url = "jdbc:mariadb://localhost/projeto";
        String user = "root";
        String password = "";
  
        return DriverManager.getConnection( url, user, password );
        
        
    }
    
    
}
