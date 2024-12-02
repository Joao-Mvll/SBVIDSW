
function executarCarro( event ){
    
    let nome = prompt("Diga o nome do Carro:");
    let modelo = prompt("Diga o modelo do Carro:");
    let ano = Number(prompt("Diga o ano do carro"));
    
    $.ajax("processaCarro", {
        type: "POST",
        data: {
            acao: "inserir",
            nome: nome,
            modelo: modelo,
            ano: ano   
        },
        dataType: "json"

    }).done((data,textStatus ) =>{
        console.log(data); 
        let $div = $( "exemploCarro" );
        $div.html( "" );
        
        data.forEach( carro => {
            $div.append( 
                `<div class="listagem">Carro:
                 <p>Nome: ${carro.nome}</p>`+
                `<p>Modelo: ${carro.modelo}</p>`+
                `<p>Ano Fabricacao: ${carro.ano}</p></div>`);
        });
        
    }).fail( ( jqXHR, textStatus, errorThrown ) => {
        alert( "Erro: " + errorThrown + "\n" +
               "Status: " + textStatus );
    });
    
}