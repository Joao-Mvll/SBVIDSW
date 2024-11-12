<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>

<html>



    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Classificacao</title>

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
                                <a class="nav-link" href="${cp}/formularios/dvd/home.jsp">Dvd</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link" href="${cp}/formularios/ator/home.jsp">Ator</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link " href="${cp}/formularios/genero/home.jsp">Genero</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link active" href="${cp}/formularios/classificacao/home.jsp">Classificacao</a>
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
                <h1>Alterar Classificacao</h1>
            </div>
        </div>


        <div class="row justify-content-center">
            <div class="col-md-8 col-lg-6">
                <form method="post" action="${cp}/processaClassificacao" class="mb-4">
                    
                    
                    <input name="acao" type="hidden" value="alterar"/>
                    <input name="id" type="hidden" value="${requestScope.classificacao.id}"/>
                    

                    
                    <div class="form-group">
                        <label for="descricao">Descricacao</label>
                        <input type="text" class="form-control" name="descricao" placeholder="Digite a descricao" value="${requestScope.classificacao.descricao}" required>
                    </div>

                   

                    
                    <div class="d-flex justify-content-between">
                        <a href="${cp}/formularios/classificacao/listagem.jsp" class="btn btn-secondary">Voltar</a>
                        <button type="submit" class="btn btn-primary" value="alterar">Alterar</button>
                    </div>
                </form>
            </div>
        </div>
    </div>




    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>     
    </body>
</html>
