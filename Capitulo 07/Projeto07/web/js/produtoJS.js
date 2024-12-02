function executarProduto( event ){
    
    let descricao = prompt("Diga a descricao do produto");
    let quantidade = Number( prompt("Diga a quantidade do produto"));
    
    $.ajax("processaProduto", {
       type: "post",
       data: {
           descricao = descricao,
           quantidade = quantidade
       },
       dataTyp: "json"
    }).done((data,textStatus ) =>{
        console.log(data); 
        let $div = $( "#exemploDIV" );
        $div.html( "" );
        
        data.forEach( produto => {
            $div.append( 
                `<div class="listagem">Carro:
                 <p>Nome: ${produto.descricao}</p>`+
                `<p>Modelo: ${produto.quantidade}</p>`);
        });
        
    }).fail( ( jqXHR, textStatus, errorThrown ) => {
        alert( "Erro: " + errorThrown + "\n" +
               "Status: " + textStatus );
    });
    
}