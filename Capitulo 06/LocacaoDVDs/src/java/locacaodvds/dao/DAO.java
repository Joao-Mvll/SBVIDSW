package locacaodvds.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import locacaodvds.jdbc.ConnectionFactory;

public abstract class DAO <tipo> {
    
    
    private Connection conexao;
    
    
    public DAO() throws SQLException{
        
        conexao = ConnectionFactory.getConnection();
        
        
    }
    
    
    public Connection getConnection(){
        
        return conexao;
        
    }
    
    
    public void fecharConexao() throws SQLException {
        
        conexao.close();
        
    }
    
    
    public abstract void salvar(tipo obj) throws SQLException;
    
    public abstract void atualizar(tipo obj) throws SQLException;

    public abstract void excluir(tipo obj) throws SQLException;
    
    public abstract List<tipo> listarTodos() throws SQLException;
    
    public abstract tipo obterPorId(int id) throws SQLException;
    
    
}