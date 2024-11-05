/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locacaodvds.testes;

/**
 *
 * @author jogom
 **/

import locacaodvds.entidades.Ator;
import java.sql.SQLException;
import locacaodvds.dao.AtorDAO;
import java.sql.Date;


        
public class TesteDAO {
    
    
    public static void main(String[] args) {
        
        
        Ator ator = new Ator();
        
        ator.setNome("brad");
        ator.setSobrenome("pit");
        
        AtorDAO dao = null;
        
            try{
                
                dao = new AtorDAO();   
                dao.salvar(ator);
                
                
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
