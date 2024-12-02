function executarProduto( event ){
    
    let descricao = prompt("Diga a descricao do produto");
    let quantidade = Number( prompt("Diga a quantidade do produto"));
    
    $.ajax("processaProduto", {
       type: "post",
       data: {
           acao: "inserir",
           descricao: descricao,
           quantidade: quantidade
       },
       dataType: "json"
    }).done((data,textStatus ) =>{
        console.log(data); 
        let $div = $( "#exemploProduto" );
        $div.html( "" );
        
        data.forEach( produto => {
            $div.append( 
                `<div class="listagem">Produto:
                 <p>Descricao: ${produto.descricao}</p>`+
                `<p>Quantidade: ${produto.quantidade}</p>`);
        });
        
    }).fail( ( jqXHR, textStatus, errorThrown ) => {
        alert( "Erro: " + errorThrown + "\n" +
               "Status: " + textStatus );
    });
    
}