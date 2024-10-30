
package locacaodvds.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException{
        
        String url = "jdbc:mariadb://localhost/locacao_dvds";
        String user = "root";
        String password = "";
        
        return DriverManager.getConnection(url,user,password);
        
        
    }
    
}
