<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <script src="main.js"></script>
</head>
<body>

<div class="navbar">

    <a href="index..html">Frutas</a>
    <a href="carros.html">Carros</a>
    <a href="produtos.html">Produtos</a>


</div>

<div class="container">


    <div class="lado-esquerdo">

        
        <div class="card">

            <p style="font-size: 20px; font-weight: 800; color: rgb(26, 26, 26);">Frutas</p>
            <p style="text-align: center;
            font-size: 0.7em;
            font-weight: 600;
            color: rgb(99, 99, 99);">Adicione uma fruta para a listagem</p>

            <button class="adicionar">Adicionar</button>

        </div>

        
    </div>


    <div class="lado-direito">

        <div class="exemploDiv">

        </div>


    </div>

</div>

    
</body>
</html>
