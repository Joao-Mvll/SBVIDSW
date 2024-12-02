/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto07.servicos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto07.dao.ProdutoDAO;
import projeto07.entidades.Produto;

/**
 *
 * @author jogom
 */
public class ProdutoServices {
    
    public List<Produto> getTodos(){
            
    List<Produto> lista = new ArrayList<>();
    ProdutoDAO dao = null;
    
        try {
            dao = new ProdutoDAO();
            lista = dao.listarTodos();
        } catch ( SQLException exc ) {
            exc.printStackTrace();
        } finally {
            if ( dao != null ) {
                try {
                    dao.fecharConexao();
                } catch ( SQLException exc ) {
                        exc.printStackTrace();
                }
            }
        }

       return lista;
       
    }
    
}
