<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <title>Alterar Classificação</title>
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
            .button-secondary {
                padding: 10px 15px;
                margin: 5px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                text-decoration: none;
                background-color: #555;
                color: white;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <h1>Alterar Classificação</h1>
            <form method="post" action="${cp}/processaClassificacao">
                <input name="acao" type="hidden" value="alterar"/>
                <input name="id" type="hidden" value="${requestScope.classificacao.id}"/>
                <table>
                    <tr>
                        <td><strong>Descrição:</strong></td>
                        <td>
                            <input name="descricao" type="text" size="20" maxlength="30" value="${requestScope.classificacao.descricao}"/>
                        </td>
                    </tr>
                </table>
                <div class="button-container-inline">
                    <a href="${cp}/formulario/classificacao/listagem.jsp" class="button-secondary">⬅ Voltar</a>
                    <input type="submit" value="Alterar" class="button-primary"/>
                </div>
            </form>
        </div>
    </body>
</html>
