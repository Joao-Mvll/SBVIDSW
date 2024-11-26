<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Capitulo 07</title>
        <link rel="stylesheet" href="${cp}/css/estilos.css"/>
        <script src="${cp}/js/exemplo01.js"></script>
        <script src="${cp}/js/exemplo02.js"></script>
        <script src="${cp}/js/exemplo03.js"></script>
    </head>
    <body>
        
        <div class="section">

            <button onclick="executarExemplo01(event)"> Exemplo 01 </button>
            
            <div  id="divExemplo1" class="divExemplo">
                
            </div>

        </div>



        
    </body>
</html>
