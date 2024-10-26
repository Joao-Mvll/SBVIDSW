package cadastroclientes.servicos;

import cadastroclientes.dao.EstadoDAO;
import cadastroclientes.entidades.Estado;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoServices {
    
    public List<Estado> getTodos() {

        List<Estado> lista = new ArrayList<>();
        EstadoDAO dao = null;

        try {
            dao = new EstadoDAO();
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

    public boolean existeSigla(String sigla) throws SQLException{
        
        EstadoDAO dao = new EstadoDAO();
        List<Estado> estados = dao.listarTodos();
        
        for( Estado estado : estados){
            if(estado.getSigla().equalsIgnoreCase(sigla)){
                return true;
            }
            
        }
        return false;
    }
    
    
}
