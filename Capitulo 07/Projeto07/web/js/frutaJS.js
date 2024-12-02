function executarFruta( event ){
    
    let nome = prompt("Nome da Fruta:");
    let cor = prompt("Cor da Fruta:");
    
    $.ajax("processaFruta", {
        type: "POST",
        data: {
            acao: "inserir",
            nome: nome,
            cor: cor
        },
        dataType: "json"
    }).done((data,textStatus ) =>{
        
        let $div = $( "#exemploDIV" );
        $div.html( "" );
        
        data.forEach( fruta => {
            $div.append( 
                `<div class="listagem">Fruta:
                 <p>Nome: ${fruta.nome}</p>`+
                `<p>Cor: ${fruta.cor}</p>`);
        });
        
    }).fail( ( jqXHR, textStatus, errorThrown ) => {
        alert( "Erro: " + errorThrown + "\n" +
               "Status: " + textStatus );
    });
    
}