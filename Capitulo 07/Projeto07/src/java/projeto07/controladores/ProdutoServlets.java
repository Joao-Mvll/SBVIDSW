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
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto07.dao.ProdutoDAO;
import projeto07.entidades.Produto;
import projeto07.servicos.ProdutoServices;

/**
 *
 * @author jogom
 */
@WebServlet(name = "ProdutoServlets", urlPatterns = {"/processaProduto"})
public class ProdutoServlets extends HttpServlet {

    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        response.setContentType( "application/json;charset=UTF-8" );
        
        Jsonb jb = JsonbBuilder.create();
        String acao = request.getParameter("acao");
        ProdutoDAO dao = new ProdutoDAO();
        ProdutoServices produtos = new ProdutoServices();
        
        try ( PrintWriter out = response.getWriter() ) {
            
            dao = new ProdutoDAO();
            
            if(acao.equals("inserir")){
                
                String descricao = request.getParameter("descricao");
                int quantidade = Integer.parseInt(request.getParameter("quantidade"));
                
                Produto p = new Produto();
                
                p.setDescricao(descricao);
                p.setQuantidade(quantidade);
                dao.salvar(p);
                
                out.print( jb.toJson( produtos.getTodos() ) );
                
            }
            
        }catch( SQLException e ){
            
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoServlets.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ProdutoServlets.class.getName()).log(Level.SEVERE, null, ex);
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
