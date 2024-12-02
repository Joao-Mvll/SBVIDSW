/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto07.servicos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto07.dao.FrutaDAO;
import projeto07.entidades.Fruta;

/**
 *
 * @author bv3024903
 */
public class FrutaServices {
    
    
    public List<Fruta> getTodos(){
            
    List<Fruta> lista = new ArrayList<>();
    FrutaDAO dao = null;
    
        try {
            dao = new FrutaDAO();
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
