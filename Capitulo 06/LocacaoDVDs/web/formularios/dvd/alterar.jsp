<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>

<html>



    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DVD</title>

        <link rel="stylesheet" href="${cp}/css/style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <style>



    </style>
    
    </head>


    <body class="bg-fundo">
        
        <!-- Nav bar -->

            <nav class="navbar navbar-expand-lg navbar-light bg-light shadow">

                
                <div class="container-fluid d-flex">
                        
                    
                    <div class="d-flex align-items-center">

                        <ul class="navbar-nav me-auto flex-row">

                            <li class="nav-item me-3">
                                <a class="nav-link " aria-current="page" href="${cp}/index.jsp">Home</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link active" href="${cp}/formularios/dvd/home.jsp">Dvd</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link " href="${cp}/formularios/ator/home.jsp">Ator</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link " href="${cp}/formularios/genero/home.jsp">Genero</a>
                            </li>
                            <li class="nav-item me-3">
                                <a class="nav-link" href="${cp}/formularios/classificacao/home.jsp">Classificacao</a>
                            </li>

                        </ul>

                    </div>


                    
                    
                    <div class="" style="position: absolute; left: 50%; translate: -50%;">
                    <a href="${cp}/index.jsp" class="nav-brand" >
                        <img src="${cp}/imgs/logo.png" alt="" width="50" height="50" style="border-radius: 25%" class="d-inline-block align-text-center">
                    </a>
                    </div>


                
                </div>

            </nav>
        
        
        
        <!-- Formulario-->
        <div class="container border my-4 shadow p-4 bg-light">

            
        <div class="row">
            <div class="col-12 text-center mb-4">
                <h1>Alterar DVD</h1>
            </div>
        </div>


        <div class="row justify-content-center">
            <div class="col-md-8 col-lg-6">
                <form method="post" action="${cp}/processaDvd" class="mb-4">
                    
                    <input type="hidden" name="acao" value="alterar"/>
                    <input type="hidden" name="id" value="${requestScope.dvd.id}">

                    
                    <div class="form-group">
                        <label for="titulo">Título</label>
                        <input type="text" class="form-control" name="titulo" placeholder="Digite o título" value="${requestScope.dvd.titulo}" required>
                    </div>

                    <div class="form-group">
                        <label for="anoLancamento">Ano de Lançamento</label>
                        <input type="number" class="form-control" name="anoLancamento" maxlength = "4" placeholder="Digite o ano de lançamento" value="${requestScope.dvd.ano_lancamento}" required>
                    </div>

                    <jsp:useBean id="servicosAtor" scope="page" class="locacaodvds.servicos.AtorServices"/>

                    <div class="form-group">
                        <label for="idAtorPrincipal">Ator Principal</label>
                        <select name="idAtorPrincipal" class="form-control" value="${requestScope.dvd.ator_principal}" required>
                            <c:forEach items="${servicosAtor.getTodos()}" var="ator">
                                <option value="${ator.id}" ${ator.id == requestScope.dvd.ator_principal.id ? 'selected' : ''}>
                                    ${ator.nome}  ${ator.sobrenome}
                                </option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="idAtorCoadjuvante">Ator Coadjuvante</label>
                        <select name="idAtorCoadjuvante" class="form-control" value="${requestScope.dvd.ator_coadjuvante}" required>
                            <c:forEach items="${servicosAtor.getTodos()}" var="ator">
                                <option value="${ator.id}" ${ator.id == requestScope.dvd.ator_coadjuvante.id ? 'selected' : ''}>
                                    ${ator.nome}  ${ator.sobrenome}
                                </option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="dataLancamento">Data de Lançamento</label>
                        <input type="date" class="form-control" name="dataLancamento" placeholder="Digite a data de lançamento" value="${requestScope.dvd.data_lancamento}"  required>
                    </div>

                    <div class="form-group">
                        <label for="duracao">Duração (em minutos)</label>
                        <input type="number" class="form-control" name="duracao" maxlength="4" placeholder="Digite a duração em minutos" value="${requestScope.dvd.duracao_minutos}" required>
                    </div>

                    <jsp:useBean id="servicosClassificacao" scope="page" class="locacaodvds.servicos.ClassificacaoEtariaServices"/>

                    <div class="form-group">
                        <label for="idClassificacao">Classificação Etária</label>
                        <select name="idClassificacao" class="form-control" value="${requestScope.dvd.classificacao}" required>
                            <c:forEach items="${servicosClassificacao.getTodos()}" var="classificacao">
                                <option value="${classificacao.id}" ${classificacao.id == requestScope.dvd.classificacao.id ? 'selected' : ''}>
                                    ${classificacao.descricao}
                                </option>
                            </c:forEach>
                        </select>
                    </div>


                    <jsp:useBean id="servicosGenero" scope="page" class="locacaodvds.servicos.GeneroServices"/>

                    <div class="form-group">
                        <label for="idGenero">Gênero</label>
                        <select name="idGenero" class="form-control" value="${requestScope.dvd.genero}" required>
                            <c:forEach items="${servicosGenero.getTodos()}" var="genero">
                                <option value="${genero.id}" ${genero.id == requestScope.dvd.genero.id ? 'selected' : ''}>
                                    ${genero.descricao}
                                </option>
                            </c:forEach>
                        </select>
                    </div>

                    

                    
                    <div class="d-flex justify-content-between">
                        <a href="${cp}/formularios/dvd/home.jsp" class="btn btn-secondary">Voltar</a>
                        <button type="submit" class="btn btn-primary" value="alterar">Alterar</button>
                    </div>
                </form>
            </div>
        </div>
    </div>




    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>     
    </body>
</html>
