<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <title>Redes de Computadores</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #121212;
                color: white;
                text-align: center;
                padding: 20px;
            }
            h1 {
                color: #00bcd4;
            }
            ul {
                list-style-type: none;
                padding: 0;
            }
            li {
                margin: 10px 0;
            }
            a {
                text-decoration: none;
                color: #ff9800;
                font-size: 18px;
                padding: 10px;
                display: inline-block;
                border: 1px solid #ff9800;
                border-radius: 5px;
                transition: 0.3s;
            }
            a:hover {
                background-color: #ff9800;
                color: black;
            }
        </style>
    </head>
    <body>
        <h1>Bem-vindo ao Sistema de Redes de Computadores</h1>
        <p>Gerencie suas classificações e gêneros de forma eficiente.</p>
        <ul>
            <li><a href="${cp}/formulario/classificacao/listagem.jsp">📂 Classificações</a></li>
            <li><a href="${cp}/formulario/genero/listagem.jsp">📁 Gêneros</a></li>
        </ul>
    </body>
</html>