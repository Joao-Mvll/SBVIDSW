/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locacaodvds.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import locacaodvds.entidades.Dvd;
import locacaodvds.entidades.Ator;
import locacaodvds.entidades.ClassificacaoEtaria;
import locacaodvds.entidades.Genero;

/**
 *
 * @author bv3024903
 */
public class DvdDAO extends DAO<Dvd>{
    
    public DvdDAO() throws SQLException{     
    }

    @Override
    public void salvar(Dvd obj) throws SQLException {
        
        
        PreparedStatement stmt = getConnection().prepareStatement(
        "INSERT INTO "+
        "dvd( titulo, ano_lancamento, ator_principal_id, ator_coadjuvante_id, data_lancamento, duracao_minutos, classificacao_id, genero_id) " +
        "VALUES(?,?,?,?,?,?,?,?);");
        
        stmt.setString(1, obj.getTitulo());
        stmt.setString(2, obj.getAno_lancamento());
        stmt.setInt(3, obj.getAtor_principal().getId());
        stmt.setInt(4, obj.getAtor_coadjuvante().getId());
        stmt.setDate(5, obj.getData_lancamento());
        stmt.setString(6, obj.getDuracao_minutos());
        stmt.setInt(7, obj.getClassificacao().getId());
        stmt.setInt(8, obj.getGenero().getId());
            
        stmt.executeUpdate();
        stmt.close();
      

    }

    @Override
    public void atualizar(Dvd obj) throws SQLException {
        
    
        PreparedStatement stmt = getConnection().prepareStatement(
            "UPDATE dvd " +
            "SET" +
            " titulo = ? " +
            " ano_lancamento = ? " +
            " ator_principal_id = ? " +
            " ator_coadjuvante_id = ? " +
            " data_lancamento = ? " +
            " duracao_minutos = ? " +
            " classificacao_id = ? " +
            " genero_id = ? " +
            " WHERE" +
            " ID = ?; "); 
                  
        
        
        
        stmt.setString(1, obj.getTitulo());
        stmt.setString(2, obj.getAno_lancamento());
        stmt.setInt(3, obj.getAtor_principal().getId());
        stmt.setInt(4, obj.getAtor_coadjuvante().getId());
        stmt.setDate(5, obj.getData_lancamento());
        stmt.setString(6, obj.getDuracao_minutos());
        stmt.setInt(7, obj.getClassificacao().getId());
        stmt.setInt(8, obj.getGenero().getId());
        
        stmt.executeUpdate();
        stmt.close();
        
    }

    @Override
    public void excluir(Dvd obj) throws SQLException {
        
        PreparedStatement stmt = getConnection().prepareStatement(
        "DELETE FROM dvd " +
        "WHERE" +
        " id = ?;" );
        
        stmt.setInt( 1, obj.getId() );
        
        stmt.executeUpdate();
        stmt.close();
    
    }

    @Override
    public List<Dvd> listarTodos() throws SQLException {
        
        
        List<Dvd> lista = new ArrayList<>();

        PreparedStatement stmt = getConnection().prepareStatement(
        "SELECT" +
        " d.id idDvd, " +
        " d.titulo tituloDvd " + 
        " d.ano_lancamento anoLancamentoDvd, " +
        " d.data_lancamento dataLancamentoDvd, " +
        " d.duracao_minutos duracaoMinutosDvd, " +
        " a.id atorPrincipalId, " +
        " a.nome atorPrincipalNome, " + 
        " a.id atorCoadjuvanteId, " +
        " a.nome atorCoadjuvanteNome, " + 
        " g.id generoId, " +
        " g.descricao generoDescricao, " + 
        " c.id classificacaoId, " +
        " c.descricao classificaoDescricao, " +         
        "FROM" +
        " dvd d, " +
        " ator a, " +
        " genero g, " +
        " classificacao_etaria c " +
        "WHERE" +
        " d.ator_principal_id = a.id AND " +
        " d.ator_coadjuvante_id = a.id AND " +        
        " d.classificacao_etaria_id = c.id AND " +        
        " d.genero_id = g.id ");

        ResultSet rs = stmt.executeQuery();

        while ( rs.next() ) {
            
        Dvd d = new Dvd();
        Ator a_principal = new Ator();
        Ator a_coadjuvante = new Ator();
        Genero g = new Genero();
        ClassificacaoEtaria c = new ClassificacaoEtaria();

        d.setId( rs.getInt( "idDvd" ) );
        d.setTitulo( rs.getString( "tituloDvd" ) );
        d.setAno_lancamento( rs.getString( "anoLancamentoDvd" ) );
        d.setData_lancamento( rs.getDate( "dataLancamentoDvd" ) );
        d.setDuracao_minutos( rs.getString( "duracaoMinutosDvd" ) );
        d.setAtor_coadjuvante( a_coadjuvante );
        d.setAtor_principal( a_principal );
        d.setGenero(g);
        d.setClassificacao(c);

        a_principal.setId( rs.getInt( "atorPrincipalId" ) );
        a_principal.setNome( rs.getString( "atorPrincipalNome" ) );
        a_coadjuvante.setId( rs.getInt( "atorCoadjuvanteId" ) );
        a_coadjuvante.setNome( rs.getString( "atorCoadjuvanteNome" ) );

        g.setId( rs.getInt( "generoId" ) );
        g.setDescricao( rs.getString( "generoDescricao" ) );
        
        c.setId( rs.getInt( " classificacaoId " ) );
        c.setDescricao( rs.getString( " classificaoDescricao " ) );

        lista.add( d );

        }

        rs.close();
        stmt.close();

        return lista;
    
    
    
    }

    @Override
    public Dvd obterPorId(int id) throws SQLException {
        
        
        Dvd dvd = null;

        PreparedStatement stmt = getConnection().prepareStatement(
        "SELECT" +
        " d.id idDvd, " +
        " d.titulo tituloDvd " + 
        " d.ano_lancamento anoLancamentoDvd, " +
        " d.data_lancamento dataLancamentoDvd, " +
        " d.duracao_minutos duracaoMinutosDvd, " +
        " a.id atorPrincipalId, " +
        " a.nome atorPrincipalNome, " + 
        " a.id atorCoadjuvanteId, " +
        " a.nome atorCoadjuvanteNome, " + 
        " g.id generoId, " +
        " g.descricao generoDescricao, " + 
        " c.id classificacaoId, " +
        " c.descricao classificaoDescricao, " +         
        "FROM" +
        " dvd d, " +
        " ator a, " +
        " genero g, " +
        " classificacao_etaria c " +
        "WHERE" +
        " d.ator_principal_id = a.id AND " +
        " d.ator_coadjuvante_id = a.id AND " +        
        " d.classificacao_etaria_id = c.id AND " +        
        " d.genero_id = g.id ");

        ResultSet rs = stmt.executeQuery();

        if ( rs.next() ) {
            
        dvd = new Dvd();
        Ator a_principal = new Ator();
        Ator a_coadjuvante = new Ator();
        Genero g = new Genero();
        ClassificacaoEtaria c = new ClassificacaoEtaria();

        dvd.setId( rs.getInt( "idDvd" ) );
        dvd.setTitulo( rs.getString( "tituloDvd" ) );
        dvd.setAno_lancamento( rs.getString( "anoLancamentoDvd" ) );
        dvd.setData_lancamento( rs.getDate( "dataLancamentoDvd" ) );
        dvd.setDuracao_minutos( rs.getString( "duracaoMinutosDvd" ) );
        dvd.setAtor_coadjuvante( a_coadjuvante );
        dvd.setAtor_principal( a_principal );
        dvd.setGenero(g);
        dvd.setClassificacao(c);

        a_principal.setId( rs.getInt( "atorPrincipalId" ) );
        a_principal.setNome( rs.getString( "atorPrincipalNome" ) );
        a_coadjuvante.setId( rs.getInt( "atorCoadjuvanteId" ) );
        a_coadjuvante.setNome( rs.getString( "atorCoadjuvanteNome" ) );

        g.setId( rs.getInt( "generoId" ) );
        g.setDescricao( rs.getString( "generoDescricao" ) );
        
        c.setId( rs.getInt( " classificacaoId " ) );
        c.setDescricao( rs.getString( " classificaoDescricao " ) );


        }

        rs.close();
        stmt.close();

        return dvd;
    
    }
    
}
