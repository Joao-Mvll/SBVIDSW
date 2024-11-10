<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>

<html>
<head>
    <title>Novo Estado</title>
    <meta charset="UTF-8">
     <meta name="viewport"
     content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet"
        href="${cp}/css/style.css"/>
</head>

<body>

    <h1>Novo Ator</h1>

    <form method="post" action="${cp}/processaEstados">

    <input name="acao" type="hidden" value="inserir"/>
    <input name="teste" type="hidden" value="inserir"/>

    <table>
        
        <tr>
            <td class="alinharDireita">Nome:</td>
            <td>
                <input name="nome"
                       type="text"
                       size="20"
                       maxlength="30"
                       required/>
            </td>
        </tr>
        
        <tr>
            <td class="alinharDireita">Sigla:</td>
            <td>
            <input name="sigla"
                   type="text"
                   size="3"
                   maxlength="3"
                   required/>
            </td>
        </tr>
        
        <tr>
            <td>
                <a href="${cp}/formularios/estados/listagem.jsp">
                Voltar
                </a>
            </td>
            
            <td class="alinharDireita">
                <input type="submit" value="Salvar"/>
            </td>
            
        </tr>
        
    </table>

    </form>

</body>

 </html>