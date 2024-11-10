<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>

<html>



    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <style>



    </style>
    
    </head>


    <body>
        
        <!-- Nav bar -->

            <nav class="navbar navbar-expand-lg navbar-light bg-light shadow">

                
                <div class="container-fluid d-flex">
                        
                    <!-- lado esquerdo -->
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
                                <a class="nav-link active" href="${cp}/formularios/genero/home.jsp">Genero</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link" href="${cp}/formularios/classificacao/home.jsp">Classificacao</a>
                            </li>

                        </ul>

                    </div>


                    
                    <!-- logo centrilizada -->
                    <div class="" style="position: absolute; left: 50%; translate: -50%;">
                    <a href="${cp}/index.jsp" class="nav-brand" >
                        <img src="${cp}/imgs/logo.png" alt="" width="50" height="50" style="border-radius: 25%" class="d-inline-block align-text-center">
                    </a>
                    </div>


                
                </div>

            </nav>
        <!-- Nav bar -->
        
        
        <div class="container border my-2 shadow" >
            <div class="row">
                <div class="col-sm-12 d-flex justify-content-center my-5 align-items-center" >
                <h1 > Genero </h1>
                </div>
                
                <!-- Caixas de Texto -->
                <div class="col-lg-12 d-flex justify-content-center  align-items-center">
                    <div class="row p-5">
                        <!-- Primeira linha de caixas -->
                        <div class="col-md-6 p-3 px-2 text-center border btn btn-light" style="border-radius: 5%;">
                            <a href="${cp}/formularios/ator/novo.jsp">
                            <img src="${cp}/imgs/acoes/adicionar.png" alt="">
                            <h5 class="mt-3 buttom" >Adicionar</h5>
                            </a>
                        </div>
                        <div class="col-md-6 p-3 px-2 text-center border btn btn-light" style="border-radius: 5%;">
                            <a href="${cp}/formularios/dvd/novo.jsp">
                            <img src="${cp}/imgs/acoes/excluir.png" alt="">
                            <h5 class="mt-3">Excluir</h5>
                            </a>
                        </div>
                        
                        <!-- Segunda linha de caixas -->
                        <div class="col-md-6 p-3 px-2 text-center border btn btn-light" style="border-radius: 5%;">
                            <a href="${cp}/formularios/genero/novo.jsp">
                            <img src="${cp}/imgs/acoes/alterar.png" alt="">
                            <h5 class="mt-3">Alterar</h5>
                            </a>
                        </div>
                        <div class="col-md-6 p-3 px-2 text-center border btn btn-light" style="border-radius: 5%;">
                            <a href="${cp}/formularios/classificacao/novo.jsp">
                            <img src="${cp}/imgs/acoes/listar.png" alt="">
                            <h5 class="mt-3">Listar</h5>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>




    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>     
    </body>
</html>
