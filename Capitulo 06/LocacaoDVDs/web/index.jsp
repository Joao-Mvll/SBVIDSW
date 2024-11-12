<%-- 
    Document   : index
    Created on : 30 de out. de 2024, 14:07:12
    Author     : bv3024903
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>

<html>



    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WebLoca</title>

        <link rel="stylesheet" href="${cp}/css/style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <style>

        .bg-roxo{

        background-color: #7542f5 !important;

        }
        
        

    </style>
    
    </head>


    <body class="bg-fundo">
        
        <!-- Nav bar -->

            <nav class="navbar navbar-expand-lg navbar-light bg-light shadow">

                
                <div class="container-fluid d-flex">
                        
                    <!-- lado esquerdo -->
                    <div class="d-flex align-items-center">

                        <ul class="navbar-nav me-auto flex-row">

                            <li class="nav-item me-3">
                                <a class="nav-link active" aria-current="page" href="#">Home</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link" href="${cp}/formularios/dvd/home.jsp">Dvd</a>
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


                    
                    <!-- logo centrilizada -->
                    <div class="" style="position: absolute; left: 50%; translate: -50%;">
                    <a href="${cp}/index.jsp" class="nav-brand" >
                        <img src="${cp}/imgs/logo.png" alt="" width="50" height="50" style="border-radius: 25%" class="d-inline-block align-text-center">
                    </a>
                    </div>


                
                </div>

            </nav>
        <!-- Nav bar -->

        <div class="container mt-4  bg-light shadow">
            <div class="row">
                <!-- Imagem à esquerda -->
                <div class="col-lg-4 d-flex justify-content-center align-items-center m-0 bg-roxo">
                    <img src="${cp}/imgs/bg.png" alt="" class="img-fluid">
                </div>
                
                <!-- Caixas de Texto à direita -->
                <div class="col-lg-8 d-flex justify-content-center my-5 align-items-center">
                    <div class="row">
                        <!-- Primeira linha de caixas -->
                        <div class="col-md-6 p-3 px-2 text-center border btn btn-light" style="border-radius: 5%;">
                            <a href="${cp}/formularios/ator/home.jsp">
                            <img src="${cp}/imgs/actor.png" alt="">
                            <h5 class="mt-3" >Ator</h5>
                            </a>
                        </div>
                        <div class="col-md-6 p-3 px-2 text-center border btn btn-light" style="border-radius: 5%;">
                            <a href="${cp}/formularios/dvd/home.jsp">
                            <img src="${cp}/imgs/dvd-player.png" alt="">
                            <h5 class="mt-3">Dvd</h5>
                            </a>
                        </div>
                        
                        <!-- Segunda linha de caixas -->
                        <div class="col-md-6 p-3 px-2 text-center border btn btn-light" style="border-radius: 5%;">
                            <a href="${cp}/formularios/genero/home.jsp">
                            <img src="${cp}/imgs/drama.png" alt="">
                            <h5 class="mt-3">Genero</h5>
                            </a>
                        </div>
                        <div class="col-md-6 p-3 px-2 text-center border btn btn-light" style="border-radius: 5%;">
                            <a href="${cp}/formularios/classificacao/home.jsp">
                            <img src="${cp}/imgs/-18.png" alt="">
                            <h5 class="mt-3">Classificacao</h5>
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
