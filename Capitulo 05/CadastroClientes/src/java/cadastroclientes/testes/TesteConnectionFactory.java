package cadastroclientes.testes;

import java.sql.SQLException;
import java.sql.Connection;
import cadastroclientes.jdbc.ConnectionFactory;

public class TesteConnectionFactory {
    
    public static void main(String[] args) {
        try{
    
            Connection conexao = ConnectionFactory.getConnection();
            System.out.println("Conexao deu certo");
        } catch(SQLException exc){
    
            System.err.println("Conexao nao deu certo");
            exc.printStackTrace();
        }
    }
    
    
    
}
