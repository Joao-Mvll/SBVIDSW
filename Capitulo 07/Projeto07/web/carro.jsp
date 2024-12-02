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
    <script src="${cp}/js/libs/jquery/jquery.min.js"></script>
    <script src="${cp}/js/carroJS.js"></script>
</head>
<body>

<div class="navbar">
    <a href="${cp}/index.jsp">Frutas</a>
    <a href="${cp}/carro.jsp">Carros</a>
    <a href="${cp}/produto.jsp">Produtos</a>
</div>

<div class="container">

    <div class="lado-esquerdo">
        <div class="card">
            <p style="font-size: 20px; font-weight: 800; color: rgb(26, 26, 26);">Carros</p>
            <p style="text-align: center; font-size: 0.7em; font-weight: 600; color: rgb(99, 99, 99);">
                Adicione um Carro para mostrar a listagem
            </p>
            <button class="adicionar" onclick="executarCarro(event)">Adicionar</button>
        </div>
    </div>

    <div class="lado-direito">
        <div id="exemploCarro" class="exemploDIV" style="width: 1000px; height: 500px;">
            
            
        </div>
    </div>

</div>

</body>
</html>
