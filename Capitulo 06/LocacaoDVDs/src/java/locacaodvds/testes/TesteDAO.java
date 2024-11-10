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
import java.util.ArrayList;
import java.util.List;
import locacaodvds.servicos.AtorServices;


        
public class TesteDAO {
    
    
    public static void main(String[] args) {
        
        
        /*Ator ator = new Ator();
        
        ator.setNome("Morgan");
        ator.setSobrenome("Freeman");
        ator.setData_estreia(java.sql.Date.valueOf("2012-01-11"));
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
        
        */
        
        AtorServices atorServices = new AtorServices();
        List<Ator> atores = atorServices.getTodos();
        

        if(atores.isEmpty()){
            System.out.println("Nenhum ator");
        }else{
            for(Ator ator : atores) {
                System.out.println("ID: " + ator.getId() + ", Nome: " + ator.getNome() + " " + ator.getSobrenome() + 
                ", Data de Estreia: " + ator.getData_estreia()); 
            }
        }
        
        
        
        
        
        
        
        
    }
}
