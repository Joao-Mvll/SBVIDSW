/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locacaodvds.testes;

import locacaodvds.dao.DvdDAO;
import locacaodvds.entidades.Dvd;
import java.sql.SQLException;
import locacaodvds.entidades.Ator;
import locacaodvds.entidades.ClassificacaoEtaria;
import locacaodvds.entidades.Genero;

/**
 *
 * @author jogom
 */
public class TesteDvd {
    
    public static void main(String[] args) {
        
        Dvd dvd = new Dvd();
        Ator ator_principal = new Ator();
        Ator ator_coadjuvante = new Ator();
        Genero genero = new Genero();
        ClassificacaoEtaria classificacao = new ClassificacaoEtaria();
        
        ator_principal.setId(1);
        
        ator_coadjuvante.setId(2);
        
        genero.setId(1);
        
        classificacao.setId(1);
        
        dvd.setTitulo("ola");
        dvd.setAno_lancamento(2014);
        dvd.setAtor_coadjuvante(ator_coadjuvante);
        dvd.setAtor_principal(ator_principal);
        dvd.setDuracao_minutos(40);
        dvd.setData_lancamento(java.sql.Date.valueOf("2024-11-01"));
        dvd.setGenero(genero);
        dvd.setClassificacao(classificacao);
        
        
        DvdDAO dao = null;
        
        try{
            
            dao = new DvdDAO();
            dao.salvar(dvd);
            
        }  catch(SQLException exc){
                exc.printStackTrace();
            } finally{
                    
                if(dao != null){
                    
                    try {
                        dao.fecharConexao();
                    } catch(SQLException exc){
                        exc.printStackTrace();
                    }
                    
                }                   
            }
        
        
        
    }
    
}
