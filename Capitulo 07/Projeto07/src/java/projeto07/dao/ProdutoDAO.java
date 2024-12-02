/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto07.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto07.entidades.Produto;

/**
 *
 * @author jogom
 */
public class ProdutoDAO extends DAO<Produto>{

    public ProdutoDAO() throws SQLException{
        super();
    }
    
    
    @Override
    public void salvar(Produto obj) throws SQLException {
    
        String sql = "INSERT INTO produto( descricao, quantidade)" + 
                     "VALUES(?, ?);";
        
        PreparedStatement stmt = getConnection().prepareStatement(sql);
        stmt.setString(1, obj.getDescricao());
        stmt.setInt(2, obj.getQuantidade());
        
        stmt.executeUpdate();
        stmt.close();
        
        
    }

    @Override
    public void atualizar(Produto obj) throws SQLException {
       String sql = "UPDATE produto " +
       "SET" +
       " descricao = ?, " +
       " quantidade = ? " +
       "WHERE" +
       " id = ?;";

       PreparedStatement stmt = getConnection().prepareStatement( sql );
       stmt.setString( 1, obj.getDescricao() );
       stmt.setInt( 2, obj.getQuantidade() );
       stmt.setInt( 3, obj.getId() );

       stmt.executeUpdate();
       stmt.close();

    }

    @Override
    public void excluir(Produto obj) throws SQLException {
        String sql = "DELETE FROM produto WHERE id = ?;";

        PreparedStatement stmt = getConnection().prepareStatement( sql );
        stmt.setInt( 1, obj.getId() );

        stmt.executeUpdate();
        stmt.close();

    }

    @Override
    public List<Produto> listarTodos() throws SQLException {
       List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto;";

        PreparedStatement stmt = getConnection().prepareStatement( sql );
        ResultSet rs = stmt.executeQuery();
        while ( rs.next() ) {

        Produto produto = new Produto();
        produto.setId( rs.getInt( "id" ) );
        produto.setDescricao( rs.getString( "descricao" ) );
        produto.setQuantidade( rs.getInt( "quantidade" ) );

        lista.add( produto );

        }

        rs.close();
        stmt.close();

       return lista;

    }

    @Override
    public Produto obterPorId(int id) throws SQLException {
        Produto produto = null;
            String sql = "SELECT * FROM produto WHERE id = ?;";

            PreparedStatement stmt = getConnection().prepareStatement( sql );
            stmt.setInt( 1, id );

            ResultSet rs = stmt.executeQuery();

            if ( rs.next() ) {

            produto = new Produto();
            produto.setId( rs.getInt( "id" ) );
            produto.setDescricao( rs.getString( "descricao" ) );
            produto.setQuantidade( rs.getInt( "quantidade" ) );

            }

        rs.close();
        stmt.close();
        return produto;
        }
    
}
