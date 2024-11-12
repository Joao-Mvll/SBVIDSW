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
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import locacaodvds.dao.GeneroDAO;
import locacaodvds.entidades.Genero;

/**
 *
 * @author jogom
 */
@WebServlet(name = "GeneroServlet", 
        urlPatterns = {"/processaGenero"})
public class GeneroServlet extends HttpServlet {

     protected void processRequest(
            HttpServletRequest request,
            HttpServletResponse response )
            throws ServletException, IOException {
         
         
         
         String acao = request.getParameter("acao");
         GeneroDAO dao = null;
         RequestDispatcher disp = null;
         
         
         try {

            dao = new GeneroDAO();

            if (acao.equals("inserir")) {

                String descricao = request.getParameter("descricao");
                
                if(descricao == null || descricao.length()<1){
                    
                    disp = request.getRequestDispatcher("formularios/genero/erros/string.jsp");
                    
                }else{
                    
                    Genero g = new Genero();
                            
                    g.setDescricao(descricao);

                    dao.salvar(g);

                    disp = request.getRequestDispatcher("/formularios/genero/home.jsp");
                
                    
                }
                
            } else if (acao.equals("alterar")) {

                int id = Integer.parseInt(request.getParameter("id"));      
                String descricao = request.getParameter("descricao");
                
                if(descricao == null || descricao.length()<1){
                    
                    disp = request.getRequestDispatcher("formularios/genero/erros/string.jsp");
                    
                }else{
                    
                    Genero g = new Genero();
                
                    g.setId(id);
                    g.setDescricao(descricao);

                    dao.atualizar(g);

                    disp = request.getRequestDispatcher("/formularios/genero/listagem.jsp");
                    
                }
                
                

            } else if (acao.equals("excluir")) {

                int id = Integer.parseInt(request.getParameter("id"));

                Genero g = new Genero();
                g.setId(id);

                dao.excluir(g);

                disp = request.getRequestDispatcher("/formularios/genero/listagem.jsp");

            } else {

                int id = Integer.parseInt(request.getParameter("id"));
                Genero g = dao.obterPorId(id);
                request.setAttribute("genero", g);

                if (acao.equals("prepararAlteracao")) {
                    disp = request.getRequestDispatcher("/formularios/genero/alterar.jsp");
                } else if (acao.equals("prepararExclusao")) {
                    disp = request.getRequestDispatcher("/formularios/genero/excluir.jsp");
                }
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
            disp = request.getRequestDispatcher("formularios/genero/erros/string.jsp");
        } finally {
            if (dao != null) {
                try {
                    dao.fecharConexao();
                } catch (SQLException exc) {
                    exc.printStackTrace();
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
       return "GeneroServlet";
       }


}
