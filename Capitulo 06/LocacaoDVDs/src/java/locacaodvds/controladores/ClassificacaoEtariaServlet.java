/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package locacaodvds.controladores;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import locacaodvds.dao.ClassificacaoEtariaDAO;
import locacaodvds.entidades.ClassificacaoEtaria;

/**
 *
 * @author jogom
 */
@WebServlet(name = "ClassificacaoServlet", 
        urlPatterns = {"/processaClassificacao"})
public class ClassificacaoEtariaServlet extends HttpServlet {

    
    protected void processRequest(
            HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
            
        String acao = request.getParameter("acao");
        ClassificacaoEtariaDAO dao = null;
        RequestDispatcher disp = null;
        
        try{
            
            dao = new ClassificacaoEtariaDAO();
            
            if ( acao.equals("inserir")){
                
                String descricao = request.getParameter("descricao");
                
                if(descricao == null || descricao.length()<1){
                    
                    disp = request.getRequestDispatcher("formularios/classificacao/erros/string.jsp");
                    
                }else{
                    ClassificacaoEtaria c = new ClassificacaoEtaria();
                
                    c.setDescricao(descricao);

                    dao.salvar(c);

                    disp = request.getRequestDispatcher("formularios/classificacao/home.jsp");
                }
                
                
            }else if(acao.equals("alterar")){
                
                int id = Integer.parseInt(request.getParameter("id"));
                String descricao = request.getParameter("descricao");
                
                
                if(descricao == null || descricao.length()<1){
                    
                    disp = request.getRequestDispatcher("formularios/classificacao/erros/string.jsp");
                    
                }else{
                    
                    ClassificacaoEtaria c = new ClassificacaoEtaria();
                
                    c.setId(id);
                    c.setDescricao(descricao);

                    dao.atualizar(c);

                    disp = request.getRequestDispatcher("formularios/classificacao/listagem.jsp");
                    
                }
                
            
            }else if(acao.equals("excluir")){
                
                int id = Integer.parseInt(request.getParameter("id"));
                
                ClassificacaoEtaria c = new ClassificacaoEtaria();
                
                c.setId(id);
                
                dao.excluir(c);
                
                disp = request.getRequestDispatcher("formularios/classificacao/listagem.jsp");
                
                
            }else{
                
                int id = Integer.parseInt(request.getParameter("id"));
                ClassificacaoEtaria c = dao.obterPorId(id);
                request.setAttribute("classificacao", c);
                
                if(acao.equals("prepararAlteracao")){
                    disp = request.getRequestDispatcher("/formularios/classificacao/alterar.jsp");
                }else if(acao.equals("prepararExclusao")){
                    disp = request.getRequestDispatcher("/formularios/classificacao/excluir.jsp");
                }
                
            }
            
        }catch(SQLException exc) {
            exc.printStackTrace();
        } finally {
            if (dao != null) {
                try {
                    dao.fecharConexao();
                } catch (SQLException exc) {
                    exc.printStackTrace();
                    disp = request.getRequestDispatcher("formularios/classificacao/erros/string.jsp");
                }
            }
        }

        if (disp != null) {
            disp.forward(request, response);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }

    @Override
       protected void doGet(
       HttpServletRequest request,
       HttpServletResponse response )
       throws ServletException, IOException {
       processRequest( request, response );
       }

       @Override
       protected void doPost(
       HttpServletRequest request,
       HttpServletResponse response )
       throws ServletException, IOException {
       processRequest( request, response );
       }

       @Override
       public String getServletInfo() {
       return "ClassificacaoServlet";
       }

}
