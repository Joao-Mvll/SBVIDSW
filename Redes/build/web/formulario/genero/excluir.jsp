<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
        <title>Excluir Gênero</title>
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
                color: #ff9800;
            }
            .form-container {
                background-color: #1e1e1e;
                padding: 20px;
                border-radius: 10px;
                display: inline-block;
                box-shadow: 0px 0px 10px rgba(255, 255, 255, 0.2);
            }
            table {
                margin: auto;
                color: white;
            }
            td {
                padding: 10px;
            }
            .button-container-inline {
                margin-top: 20px;
            }
            .button-primary, .button-secondary, .button-danger {
                padding: 10px 15px;
                margin: 5px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                text-decoration: none;
                display: inline-block;
            }
            .button-primary {
                background-color: #ff9800;
                color: black;
            }
            .button-secondary {
                background-color: #555;
                color: white;
            }
            .button-danger {
                background-color: #d32f2f;
                color: white;
            }
        </style>
    </head>
    <body>
        <h1>Excluir Gênero</h1>
        <div class="form-container">
            <form method="post" action="${cp}/processaGenero">
                <input name="acao" type="hidden" value="excluir"/>
                <input name="id" type="hidden" value="${requestScope.genero.id}"/>
                <table>
                    <tr>
                        <td><strong>Descrição:</strong></td>
                        <td>${requestScope.genero.descricao}</td>
                    </tr>
                </table>
                <div class="button-container-inline">
                    <a href="${cp}/formulario/genero/listagem.jsp" class="button-secondary">⬅️ Voltar</a>
                    <input type="submit" value="🗑️ Excluir" class="button-danger"/>
                </div>
            </form>
        </div>
    </body>
</html>