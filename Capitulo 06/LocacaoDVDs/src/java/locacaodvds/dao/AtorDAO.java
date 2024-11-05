package locacaodvds.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import locacaodvds.entidades.Ator;


public class AtorDAO extends DAO<Ator> {
    
    public AtorDAO() throws SQLException{        
    }

    @Override
    public void salvar(Ator obj) throws SQLException {
       
        PreparedStatement stmt = getConnection().prepareStatement(
        "INSERT INTO " + 
        "ator( nome, sobrenome) " +
        "VALUES( ?, ?, ?); " );
        
        stmt.setString( 1, obj.getNome() );
        stmt.setString(2, obj.getSobrenome());
        stmt.setDate(3, obj.getData_estreia());
        
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public void atualizar(Ator obj) throws SQLException {
        
        PreparedStatement stmt = getConnection().prepareStatement(
        "UPDATE ator "+
        "SET "+
        "nome = ? "+
        "sobrenome = ? "+
        "data_estreia = ? "+
        "WHERE "+
        "id = ? ");
        
        stmt.setString(1, obj.getNome());
        stmt.setString(2, obj.getSobrenome());
        stmt.setDate(3, obj.getData_estreia());
        stmt.setInt(4, obj.getId());
        
        stmt.executeUpdate();
        stmt.close();
        
    }

    @Override
    public void excluir(Ator obj) throws SQLException {
        
    }

    @Override
    public List<Ator> listarTodos() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ator obterPorId(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
