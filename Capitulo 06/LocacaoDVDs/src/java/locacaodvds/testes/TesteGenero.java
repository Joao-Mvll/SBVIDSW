/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locacaodvds.testes;

import java.sql.SQLException;
import locacaodvds.dao.GeneroDAO;
import locacaodvds.entidades.Genero;

/**
 *
 * @author jogom
 */
public class TesteGenero {
    
    public static void main(String[] args) {
        
       Genero genero = new Genero();
       
       genero.setDescricao("Terror");
       
       GeneroDAO dao = null;
       
       try{
           
           dao = new GeneroDAO();
           dao.salvar(genero);
           
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
