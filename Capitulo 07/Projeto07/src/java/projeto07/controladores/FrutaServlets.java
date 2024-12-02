/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package projeto07.controladores;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import projeto07.servicos.FrutaServices;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto07.dao.FrutaDAO;
import projeto07.entidades.Fruta;

/**
 *
 * @author jogom
 */
@WebServlet(name = "frutaServlets", urlPatterns = {"/processaFruta"})
public class FrutaServlets extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        response.setContentType( "application/json;charset=UTF-8" );
        
        Jsonb jb = JsonbBuilder.create();
        String acao = request.getParameter("acao");
        FrutaDAO dao = null;
        FrutaServices frutas = new FrutaServices();
        
        try ( PrintWriter out = response.getWriter() ) {
             
            dao = new FrutaDAO();;
            System.out.println(jb.toJson(frutas.getTodos()));
            
            if (acao.equals("inserir")) {

                String nome = request.getParameter("nome");
                String cor = request.getParameter("cor");

                Fruta f = new Fruta();
                
                f.setNome(nome);
                f.setCor(cor);
                dao.salvar(f); 
                
            out.print( jb.toJson( frutas.getTodos() ) );

            } 
            
            
            
        } catch (SQLException e) {

        }
      
         
        
        
       
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FrutaServlets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FrutaServlets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
