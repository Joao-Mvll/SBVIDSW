<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<c:set var="prefixo" value="processaGenero?acao=preparar"/>

<!DOCTYPE html>
<html>
    <head>
        <title>Redes de Computadores - Gêneros</title>
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
            h1, h2 {
                color: #00bcd4;
            }
            table {
                width: 80%;
                margin: 20px auto;
                border-collapse: collapse;
                background-color: #1e1e1e;
                border-radius: 10px;
                overflow: hidden;
                box-shadow: 0px 0px 10px rgba(255, 255, 255, 0.2);
            }
            th, td {
                padding: 10px;
                border-bottom: 1px solid #444;
            }
            th {
                background-color: #00bcd4;
                color: black;
            }
            td a {
                text-decoration: none;
                color: #ff9800;
                font-weight: bold;
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
        <h1>Bem-vindo ao Sistema de Redes de Computadores</h1>
        <p>Gerencie suas classificações e gêneros de forma eficiente.</p>
        <!-- Listagem de Gêneros -->
        <div class="main-content">
            <h2>Gêneros Cadastrados</h2>
            <table>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Descrição</th>
                        <th>Alterar</th>
                        <th>Excluir</th>
                    </tr>
                </thead>
                <tbody>
                    <jsp:useBean id="servicos" scope="page" class="locacaodvds.servicos.GeneroServices"/>
                    <c:forEach items="${servicos.todos}" var="genero">
                        <tr>
                            <td>${genero.id}</td>
                            <td>${genero.descricao}</td>
                            <td>
                                <a href="${cp}/${prefixo}Alteracao&id=${genero.id}" class="button-secondary">✏️ Alterar</a>
                            </td>
                            <td>
                                <a href="${cp}/${prefixo}Exclusao&id=${genero.id}" class="button-danger">🗑️ Excluir</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="button-container-inline">
                <a href="${cp}/index.jsp" class="button-primary">🏠 Tela Principal</a>
                <a href="${cp}/formulario/genero/novo.jsp" class="button-primary">➕ Novo Gênero</a>
            </div>
        </div>
    </body>
</html>