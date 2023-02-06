/*
input para escolher front ou back

se escolher front poderá optar por React ou Vue
se escolher back poderá optar por C# ou Java

input para saber se o usuario quer se especializar pela area escolhida ou fullstack (exibir msg personalizada para opção escolhida)

input para coletar quais tech ela gostaria de se especializar ou de conhecer:
    - Pode escolher uma tech por vez;
    - Enquanto a resposta for "ok" para a pergunta "Tem mais alguma tecnologia que você gostaria de aprender?"

exibir a lista de aprendizado
*/

const area = document.querySelector("#inputEscolhaArea");
const botao = document.querySelector("#botao");
const selecaoArea = document.querySelector("#select-area");
let listaTech = [];

let seguirFront;
let seguirBack;


botao.addEventListener("click", () => {
    caminhoDaAreaEscolhida()
    escolhaEspecializacao()
    listagemTech()

});


function caminhoDaAreaEscolhida() {
    if (area.value == "Frontend") {

        while (true) {
            let seguirFront = prompt("Escolha:\n[1 para React] - [2 para Vue]")
            if (seguirFront == "1") {
                alert("Parabéns, você irá se sair muito bem com React");
                break;
            } else if (seguirFront == "2") {
                alert("Parabéns, você irá se sair muito bem com Vue");
                break;
            } else {
                alert("Valor desconhecido");

            }
        }

    } else if (area.value == "Backend") {
        
        while(true){
            let seguirBack = prompt("Escolha:\n[1 para C#] - [2 para Java]")
            if (seguirBack == "1") {
                alert("Parabéns, você irá se sair muito bem com C#");
                break;
            }else if(seguirBack == "2"){
                alert("Parabéns, você irá se sair muito bem com Java");
                break;
            }else {
                alert("Valor desconhecido");
            }
        }



    } else {
        alert("Valor desconhecido.")
    }
}

function escolhaEspecializacao(){
    let opcao = selecaoArea.options[selecaoArea.selectedIndex];

    if(opcao.text == "Area Escolhida"){
        alert(`Muito bem, você continuará se especializando na área ${area.value}`);
    }else if(opcao.text == "FullStack"){
        alert("Muito bem, você irá seguir a especialização FullStack");
    }
}


function listagemTech(){
    
    while(true){
        let itemTech = prompt("Tem mais alguma tecnologia que você gostaria de aprender ?\n Digite [1 para sair.]");

        if(itemTech != "1"){
            listaTech.push(itemTech);
        }else {
            break
        }
    }

    let organizaExibicao = ""

    listaTech.forEach(tech => organizaExibicao += tech + "/ ")

    alert(`Listagem de Aprendizagem: ${organizaExibicao}`)
}



