/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto07.testes;

import projeto07.entidades.Fruta;
import projeto07.dao.FrutaDAO;
import java.sql.SQLException;

/**
 *
 * @author jogom
 */
public class testConnection {
    
    public static void main(String[] args) {
        
        Fruta fruta = new Fruta();
        
        fruta.setNome("banana");
        fruta.setCor("amarelo");
        
        FrutaDAO dao = null;
        
        try{
                
                dao = new FrutaDAO();
                
                dao.salvar(fruta);
                
           

                
            } catch(SQLException exc){
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
