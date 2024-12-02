<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${cp}/css/estilos.css">
    <script src="main.js"></script>
</head>
<body>

<div class="navbar">

    <a href="${cp}/index.jsp">Frutas</a>
    <a href="${cp}/formularios/carro.jsp">Carros</a>
    <a href="${cp}/formularios/produto.jsp">Produtos</a>


</div>

<div class="container">


    <div class="lado-esquerdo">

        
        <div class="card">

            <p style="font-size: 20px; font-weight: 800; color: rgb(26, 26, 26);">Carros</p>
            <p style="text-align: center;
            font-size: 0.7em;
            font-weight: 600;
            color: rgb(99, 99, 99);">Adicione um carro para a listagem</p>

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
