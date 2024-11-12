/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package locacaodvds.controladores;


import java.io.IOException;
import java.sql.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import locacaodvds.dao.AtorDAO;
import locacaodvds.entidades.Ator;
import locacaodvds.servicos.AtorServices;

/**
 *
 * @author jogom
 */
@WebServlet(name = "AtorServlets", 
urlPatterns = {"/processaAtor"})
public class AtorServlet extends HttpServlet {

    protected void processRequest(
            HttpServletRequest request,
            HttpServletResponse response )
            throws ServletException, IOException {
        
        String acao = request.getParameter("acao");
        AtorDAO dao = null;
        RequestDispatcher disp = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        AtorServices atorServices = new AtorServices();
        
            try {
                
                dao = new AtorDAO();
                
                if(acao.equals("inserir")) {
                    
                    String nome = request.getParameter("nome");
                    String sobrenome = request.getParameter("sobrenome");
                    String data_estreia = request.getParameter("data_estreia");
                    
                    
                    if(nome == null || nome.length()<1){
                    
                        disp = request.getRequestDispatcher("formularios/ator/erros/string.jsp");
                    
                    }else if(sobrenome == null || sobrenome.length()<1){
                    
                        disp = request.getRequestDispatcher("formularios/ator/erros/string.jsp");
                    
                    }else if(data_estreia.matches("\\d{4}-\\d{2}-\\d{2}")){
                    
                        Ator a = new Ator();
                    
                        a.setNome(nome);
                        a.setSobrenome(sobrenome);
                        a.setData_estreia( Date.valueOf(LocalDate.parse( data_estreia, dtf ) ) );

                        dao.salvar(a);

                        disp = request.getRequestDispatcher("formularios/ator/home.jsp");
                    
                    }else{
                        
                        disp = request.getRequestDispatcher("formularios/ator/erros/data.jsp");
                        
                        
                    }
                    
                    
                    
                } else if ( acao.equals( "alterar" ) ) {
                    
                    int id = Integer.parseInt(request.getParameter("id"));
                    String nome = request.getParameter("nome");
                    String sobrenome = request.getParameter("sobrenome");
                    String data_estreia = request.getParameter("data_estreia");
                    
                    if(nome == null || nome.length()<1){
                    
                        disp = request.getRequestDispatcher("formularios/ator/erros/string.jsp");
                    
                    }else if(sobrenome == null || sobrenome.length()<1){
                    
                        disp = request.getRequestDispatcher("formularios/ator/erros/string.jsp");
                    
                    }else if(data_estreia.matches("\\d{4}-\\d{2}-\\d{2}")){
                        
                        Ator a = new Ator();
                        a.setId(id);
                        a.setNome(nome);
                        a.setSobrenome(sobrenome);
                        a.setData_estreia( Date.valueOf(LocalDate.parse( data_estreia, dtf ) ) );

                        dao.atualizar(a);

                        disp = request.getRequestDispatcher("formularios/ator/home.jsp");

                        
                        
                    }else{
                        
                        disp = request.getRequestDispatcher("formularios/ator/erros/data.jsp");
                        
                    }
                    
                    
                    
                    
                } else if ( acao.equals( "excluir" ) ) {
                    
                    int id = Integer.parseInt(request.getParameter("id"));
                    
                    Ator a = new Ator();
                    a.setId(id);
                    
                    dao.excluir(a);
                    
                    disp = request.getRequestDispatcher(
                        "/formularios/ator/listagem.jsp" );
                    
                } else {
                    
                    
                    int id = Integer.parseInt(request.getParameter( "id" ));
                        Ator a = dao.obterPorId(id);
                        request.setAttribute("ator", a);

                    if ( acao.equals( "prepararAlteracao" ) ) {
                            disp = request.getRequestDispatcher( "/formularios/ator/alterar.jsp" );
                    } else if ( acao.equals( "prepararExclusao" ) ) {
                            disp = request.getRequestDispatcher( "/formularios/ator/excluir.jsp" );
                    }
                }
                
            }catch ( SQLException exc ) {
                exc.printStackTrace();
            }finally {
                if ( dao != null ) {
                    try {
                        dao.fecharConexao();
                } catch ( SQLException exc ) {
                    exc.printStackTrace();
                    }
                }
            }

            if ( disp != null ) {
                disp.forward( request, response );
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
       return "AtorServlet";
       }


}
