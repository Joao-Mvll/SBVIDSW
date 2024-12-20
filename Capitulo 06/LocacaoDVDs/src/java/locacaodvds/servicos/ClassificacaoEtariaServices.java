/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locacaodvds.servicos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import locacaodvds.dao.ClassificacaoEtariaDAO;
import locacaodvds.entidades.ClassificacaoEtaria;

/**
 *
 * @author jogom
 */
public class ClassificacaoEtariaServices {
    
    public List<ClassificacaoEtaria> getTodos() {

       List<ClassificacaoEtaria> lista = new ArrayList<>();
       ClassificacaoEtariaDAO dao = null;

        try {
            dao = new ClassificacaoEtariaDAO();
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
