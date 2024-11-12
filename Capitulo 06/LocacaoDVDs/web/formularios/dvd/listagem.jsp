<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<c:set var="prefixo" value="processaDvd?acao=preparar"/>
<!DOCTYPE html>

<html>



    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DVD</title>

        <link rel="stylesheet" href="${cp}/css/style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <style>



    </style>
    
    </head>


    <body class="bg-fundo">
        
        <!-- Nav bar -->

            <nav class="navbar navbar-expand-lg navbar-light bg-light shadow">

                
                <div class="container-fluid d-flex">
                        
                    
                    <div class="d-flex align-items-center">

                        <ul class="navbar-nav me-auto flex-row">

                            <li class="nav-item me-3">
                                <a class="nav-link " aria-current="page" href="${cp}/index.jsp">Home</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link active" href="${cp}/formularios/dvd/home.jsp">Dvd</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link" href="${cp}/formularios/ator/home.jsp">Ator</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link" href="${cp}/formularios/genero/home.jsp">Genero</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link" href="${cp}/formularios/classificacao/home.jsp">Classificacao</a>
                            </li>

                        </ul>

                    </div>


                    
                    
                    <div class="" style="position: absolute; left: 50%; translate: -50%;">
                    <a href="${cp}/index.jsp" class="nav-brand" >
                        <img src="${cp}/imgs/logo.png" alt="" width="50" height="50" style="border-radius: 25%" class="d-inline-block align-text-center">
                    </a>
                    </div>


                
                </div>

            </nav>
        
        
        
        <!-- Formulario-->
        <div class="container border my-4 shadow p-4 bg-light">

            
        <div class="row">
            <div class="col-12 text-center mb-4">
                <h1>Dvd's Cadastrados</h1>
            </div>
        </div>


        <div class="row justify-content-center">
            <div class="container mt-4">
                <table class="table table-striped table-bordered text-center">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Titulo</th>
                            <th>Ano Lançamento</th>
                            <th>Ator Principal</th>
                            <th>Ator Coadjuvante</th>
                            <th>Data Lançamento</th>
                            <th>Duração</th>
                            <th>Classificação Etária</th>
                            <th>Genero</th>
                            <th>Alterar</th>
                            <th>Excluir</th>
                        </tr>
                    </thead>

                    <tbody>
                        <jsp:useBean id="servicos"scope="page"class="locacaodvds.servicos.DvdServices"/> 
                         <c:forEach items="${servicos.todos}" var="dvd">
                            <tr>
                                <td>${dvd.id}</td>
                                <td>${dvd.titulo}</td>
                                <td>${dvd.ano_lancamento}</td>
                                <td>${dvd.ator_principal.nome}  ${dvd.ator_principal.sobrenome}</td>
                                <td>${dvd.ator_coadjuvante.nome}  ${dvd.ator_coadjuvante.sobrenome}</td>
                                <td>${dvd.data_lancamento}</td>
                                <td>${dvd.duracao_minutos}</td>
                                <td>${dvd.classificacao.descricao}</td>
                                <td>${dvd.genero.descricao}</td>
                                <td>
                                    <a href="${cp}/${prefixo}Alteracao&id=${dvd.id}">
                                        <img src="${cp}/imgs/acoes/alterar.png" style="height: 20px; width: 20px">
                                    </a>
                                </td>
                                <td>
                                    <a href="${cp}/${prefixo}Exclusao&id=${dvd.id}">
                                        <img src="${cp}/imgs/acoes/excluir.png" style="height: 20px; width: 20px">
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                         
                <a href="${cp}/formularios/dvd/home.jsp" class="btn btn-secondary">Voltar</a>
            </div>
        </div>
    </div>




    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>     
    </body>
</html>
