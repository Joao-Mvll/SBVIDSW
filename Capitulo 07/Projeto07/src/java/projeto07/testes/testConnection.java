/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto07.testes;

import projeto07.entidades.Fruta;
import projeto07.dao.FrutaDAO;
import java.sql.SQLException;
import projeto07.dao.ProdutoDAO;
import projeto07.entidades.Produto;

/**
 *
 * @author jogom
 */
public class testConnection {
    
    public static void main(String[] args) {
        
        Produto produto = new Produto();
        
        produto.setDescricao("asdhkajsdhas");
        produto.setQuantidade(12);
        
        ProdutoDAO dao = null;
        
        try{
                
                dao = new ProdutoDAO();
                
                dao.salvar(produto);
                
           

                
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
