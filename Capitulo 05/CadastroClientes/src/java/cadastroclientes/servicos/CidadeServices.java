package cadastroclientes.servicos;

import cadastroclientes.dao.CidadeDAO;
import cadastroclientes.entidades.Cidade;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


 public class CidadeServices {
     
    public List<Cidade> getTodos() {

       List<Cidade> lista = new ArrayList<>();
       CidadeDAO dao = null;

        try {
            dao = new CidadeDAO();
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
 
 public boolean existeNome(String nome) throws SQLException{
        
        CidadeDAO dao = new CidadeDAO();
        List<Cidade> cidades = dao.listarTodos();
        
        for( Cidade cidade : cidades){
            if(cidade.getNome().equalsIgnoreCase(nome)){
                return true;
            }
            
        }
        return false;
    }
    

 }