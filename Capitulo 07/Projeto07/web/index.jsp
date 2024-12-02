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
    <script src="${cp}/js/frutaJS.js"></script>
    <script src="${cp}/js/libs/jquery/jquery.min.js"></script>
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
            
            

                    <p style="font-size: 20px; font-weight: 800; color: rgb(26, 26, 26);">Frutas</p>
                    <p style="text-align: center;
                    font-size: 0.7em;
                    font-weight: 600;
                    color: rgb(99, 99, 99);">Adicione uma fruta para a listagem</p>

                    <button class="adicionar" onclick="executarFruta( event )">
                        Adicionar
                    </button>
            
        </div>

        
    </div>


    <div class="lado-direito">

        <div class="exemploDIV" id="exemploDIV" style=" width: 1000px; height:700px;">

        </div>


    </div>

</div>

    
</body>
</html>
