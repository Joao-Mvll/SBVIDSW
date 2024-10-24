/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientes.testes;

import cadastroclientes.entidades.Estado;
import cadastroclientes.dao.EstadoDAO;
import java.sql.SQLException;
import java.util.List;
import cadastroclientes.servicos.EstadoServices;

public class TesteEstadoDAO {
    
    public static void main(String[] args) {
        
        /*Estado estado = new Estado();
        
        estado.setNome("Sao Paulo");
        estado.setSigla("SP");
        
        EstadoDAO dao = null;*/
        
        EstadoServices estadoServices = new EstadoServices();
        List<Estado> estados = estadoServices.getTodos();
        
        
        if (estados.isEmpty()) {
            System.out.println("Nenhum estado encontrado.");
        } else {
            for (Estado estado : estados) {
                System.out.println("ID: " + estado.getId() + ", Nome: " + estado.getNome() + ", Sigla: " + estado.getSigla());
            }
        }
        
        
        /*try{
                
                dao = new EstadoDAO();
                dao.salvar(estado);
                
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
            }*/
        
    }
    
    
}
