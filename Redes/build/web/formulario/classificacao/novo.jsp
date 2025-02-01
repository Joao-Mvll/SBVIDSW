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
            .form-container {
                background-color: #1e1e1e;
                padding: 20px;
                border-radius: 10px;
                width: 50%;
                margin: 20px auto;
                box-shadow: 0px 0px 10px rgba(255, 255, 255, 0.2);
            }
            .form-input {
                width: 100%;
                padding: 10px;
                margin-top: 10px;
                border-radius: 5px;
                border: none;
            }
            .button-container-inline {
                margin-top: 20px;
            }
            .button-primary, .button-secondary {
                padding: 10px 15px;
                margin: 5px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
            }
            .button-primary {
                background-color: #ff9800;
                color: black;
            }
            .button-secondary {
                background-color: #555;
                color: white;
            }
        </style>
    </head>
    <body>
        <p>Gerencie suas classificações de forma eficiente.</p>
        <!-- Nova Classificação Formulário -->
        <div class="form-container">
            <h2>Nova Classificação</h2>
            <form method="post" action="${cp}/processaClassificacao">
                <input type="hidden" name="acao" value="inserir" />
                <label for="descricao">Descrição:</label>
                <input type="text" id="descricao" name="descricao" required class="form-input"/>
                <div class="button-container-inline">
                    <button type="button" onclick="window.location.href = '${cp}/formulario/classificacao/listagem.jsp'" class="button-secondary">Voltar</button>
                    <input type="submit" value="Salvar" class="button-primary"/>
                </div>
            </form>
        </div>
    </body>
</html>