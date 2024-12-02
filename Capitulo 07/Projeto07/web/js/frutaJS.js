function executarFruta(event){
    
    let n = prompt("Nome da Fruta:");
    let c = prompt("Cor da Fruta:");
    
    $.ajax("processaFruta", {
        type: "POST",
        data: {
            acao: "inserir",
            nome: n,
            cor: c
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