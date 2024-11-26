
function executarExemplo01(event){
    
    let f = prompt("Nome da Fruta: ");
    
    $.ajax("listarFruta", {
        data:{
            fruta: f
        },
        dataType: "json"
    }).done( ( data, textStatus ) =>{
        
        let $div = $( "#divExemplo1" );
        $div.html( "" );
        
        data.forEach( fruta => {
            $div.append( 
                `<p>Nome: ${fruta.nome}</p>` +
                `<p>Cor: ${fruta.cor}</p></div>` );
        });
        
    }).fail( ( jqXHR, textStatus, errorThrown ) => {
        alert( "Erro: " + errorThrown + "\n" +
               "Status: " + textStatus );
    });
}