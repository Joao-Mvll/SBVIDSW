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
import java.util.Scanner;
import locacaodvds.dao.DvdDAO;
import locacaodvds.entidades.Ator;
import locacaodvds.entidades.ClassificacaoEtaria;
import locacaodvds.entidades.Dvd;
import locacaodvds.entidades.Genero;

/**
 *
 * @author jogom
 */
@WebServlet(name = "DvdServlet", 
        urlPatterns = {"/processaDvd"})
public class DvdServlet extends HttpServlet {


    protected void processRequest(
            HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String acao = request.getParameter("acao");
        DvdDAO dao = null;
        RequestDispatcher disp = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        try{
            
            dao = new DvdDAO();
            
            if(acao.equals("inserir")){

                String titulo = request.getParameter("titulo");
                int anoLancamento = Integer.parseInt(request.getParameter("anoLancamento"));
                int idAtorPrincipal = Integer.parseInt(request.getParameter("idAtorPrincipal"));
                int idAtorCoadjuvante = Integer.parseInt(request.getParameter("idAtorCoadjuvante"));
                String dataLancamento = request.getParameter("dataLancamento");
                int duracao = Integer.parseInt(request.getParameter("duracao"));
                int idClassificacao = Integer.parseInt(request.getParameter("idClassificacao"));
                int idGenero = Integer.parseInt(request.getParameter("idGenero"));
                
                
                try {
                    if (anoLancamento < 1) {
                        disp = request.getRequestDispatcher("formularios/dvd/erros/string.jsp");
                    }
                } catch (NumberFormatException e) {
                    disp = request.getRequestDispatcher("formularios/dvd/erros/string.jsp");
                }
                
                try{
                    if(duracao< 1){
                         disp = request.getRequestDispatcher("formularios/dvd/erros/string.jsp");
                    }
                }catch (NumberFormatException e) {
                    disp = request.getRequestDispatcher("formularios/dvd/erros/string.jsp");
                }
                
                if(titulo == null || titulo.length()<1){
                    
                        disp = request.getRequestDispatcher("formularios/dvd/erros/string.jsp");
                    
                } else if(anoLancamento < 1 || idGenero < 1 || idAtorPrincipal < 1 || idAtorCoadjuvante < 1 
                        || duracao < 1 || idClassificacao < 1){
                    
                        disp = request.getRequestDispatcher("formularios/dvd/erros/string.jsp");
                    
                }else if(dataLancamento.matches("\\d{4}-\\d{2}-\\d{2}")){
                    
                    Genero g = new Genero();
                    Ator aP = new Ator();
                    Ator aC = new Ator();
                    ClassificacaoEtaria c = new ClassificacaoEtaria();

                    aP.setId(idAtorPrincipal);
                    aC.setId(idAtorCoadjuvante);
                    g.setId(idGenero);
                    c.setId(idClassificacao);

                    Dvd d = new Dvd();

                    d.setTitulo(titulo);
                    d.setAno_lancamento(anoLancamento);
                    d.setAtor_principal(aP);
                    d.setAtor_coadjuvante(aC);
                    d.setData_lancamento(Date.valueOf(LocalDate.parse( dataLancamento, dtf ) ));
                    d.setDuracao_minutos(duracao);
                    d.setClassificacao(c);
                    d.setGenero(g);

                    dao.salvar(d);

                    disp = request.getRequestDispatcher("formularios/dvd/listagem.jsp");
                    
                }else{
                    
                    disp = request.getRequestDispatcher("formularios/dvd/erros/data.jsp");
                    
                }

                



            }else if(acao.equals("alterar")){

                int id = Integer.parseInt(request.getParameter("id"));
                String titulo = request.getParameter("titulo");
                int anoLancamento = Integer.parseInt(request.getParameter("anoLancamento"));
                int idAtorPrincipal = Integer.parseInt(request.getParameter("idAtorPrincipal"));
                int idAtorCoadjuvante = Integer.parseInt(request.getParameter("idAtorCoadjuvante"));
                String dataLancamento = request.getParameter("dataLancamento");
                int duracao = Integer.parseInt(request.getParameter("duracao"));
                int idClassificacao = Integer.parseInt(request.getParameter("idClassificacao"));
                int idGenero = Integer.parseInt(request.getParameter("idGenero"));
                
                
                if(titulo == null || titulo.length()<1){
                    
                        disp = request.getRequestDispatcher("formularios/dvd/erros/string.jsp");
                    
                } else if(anoLancamento < 1 || idGenero < 1 || idAtorPrincipal < 1 || idAtorCoadjuvante < 1 
                        || duracao < 1 || idClassificacao < 1){
                    
                        disp = request.getRequestDispatcher("formularios/dvd/erros/string.jsp");
                    
                }else if(dataLancamento.matches("\\d{4}-\\d{2}-\\d{2}")){
                    
                    Genero g = new Genero();
                    Ator aP = new Ator();
                    Ator aC = new Ator();
                    ClassificacaoEtaria c = new ClassificacaoEtaria();

                    aP.setId(idAtorPrincipal);
                    aC.setId(idAtorCoadjuvante);
                    g.setId(idGenero);
                    c.setId(idClassificacao);

                    Dvd d = new Dvd();

                    d.setId(id);
                    d.setTitulo(titulo);
                    d.setAno_lancamento(anoLancamento);
                    d.setAtor_principal(aP);
                    d.setAtor_coadjuvante(aC);
                    d.setData_lancamento(Date.valueOf(LocalDate.parse( dataLancamento, dtf ) ));
                    d.setDuracao_minutos(duracao);
                    d.setClassificacao(c);
                    d.setGenero(g);

                    dao.atualizar(d);

                    disp = request.getRequestDispatcher("formularios/dvd/listagem.jsp");
                    
                }

                


            }else if(acao.equals("excluir")){
                
                int id = Integer.parseInt(request.getParameter("id"));
                
                Dvd d = new Dvd();
                d.setId(id);
                
                dao.excluir(d);
                
                disp = request.getRequestDispatcher("formularios/dvd/listagem.jsp");

            }else{

                int id = Integer.parseInt(request.getParameter( "id" ));
                Dvd d = dao.obterPorId( id );
                request.setAttribute("dvd", d );

                if ( acao.equals( "prepararAlteracao" ) ) {
                        disp = request.getRequestDispatcher(
                                "/formularios/dvd/alterar.jsp" );
                } else if ( acao.equals( "prepararExclusao" ) ) {
                        disp = request.getRequestDispatcher(
                                "/formularios/dvd/excluir.jsp" );
                }

            }
            
        } catch (SQLException exc) {
            exc.printStackTrace();
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
       return "DvdServlet";
       }
    
    
}
