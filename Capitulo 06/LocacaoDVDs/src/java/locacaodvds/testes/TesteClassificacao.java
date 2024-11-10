/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locacaodvds.testes;

import java.sql.SQLException;
import locacaodvds.dao.ClassificacaoEtariaDAO;
import locacaodvds.entidades.ClassificacaoEtaria;

/**
 *
 * @author jogom
 */
public class TesteClassificacao {
    
    
    public static void main(String[] args) {
        
        ClassificacaoEtaria classificacao = new ClassificacaoEtaria();
        
        classificacao.setDescricao("+16");
        
        ClassificacaoEtariaDAO dao = null;
        
        try{
            
            dao = new ClassificacaoEtariaDAO();
            dao.salvar(classificacao);
            
        }catch(SQLException exc){
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
