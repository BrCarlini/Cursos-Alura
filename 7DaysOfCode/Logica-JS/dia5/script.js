/*
input: deseja adicionar alimento (sim ou nao)

input: nome do alimento

input: categoria que o alimento se encaixa (categoria já pre-definida)

exibir lista agrupados por categoria

*/

let listaFrutas = [];
let listaLaticinios = [];
let listaCongelados = [];
let listaDoces = [];

let frutas = "";
let laticinios = "";
let congelados = "";
let doces = "";


function criaLista() {
    while (true) {

        let flag = prompt("Deseja adicionar algum alimento a lista ? \n[1 para Sim] - [2 para Não]");

        if (flag != 1) {
            alert("Lista Encerrada");

            listaFrutas.forEach(fruta => frutas += fruta + ", ");
            listaLaticinios.forEach(laticinio => laticinios += laticinio + ", ");
            listaCongelados.forEach(congelado => congelados += congelado + ", ");
            listaDoces.forEach(doce => doces += doce + ", ");


            alert(`Lista de Frutas: ${frutas}\nLista de Laticínios: ${laticinios}\nLista de Congelados: ${congelados}\nLista de Doces: ${doces}`)

            break;

        } else {
            adicionaItem()
        }


    }
}




function adicionaItem() {

    while (true) {
        let nomeAlimento = prompt("Insira o nome do alimento: ");
        let categoriaAlimento = prompt("Escolha a categoria do alimento: \n[1 para Fruta] \n[2 para Laticínio] \n[3 para Congelado] \n[4 para Doce]");

        if (categoriaAlimento == 1) {
            listaFrutas.push(nomeAlimento);
            break;

        } else if (categoriaAlimento == 2) {
            listaLaticinios.push(nomeAlimento);
            break;

        } else if (categoriaAlimento == 3) {
            listaCongelados.push(nomeAlimento);
            break;

        } else if (categoriaAlimento == 4) {
            listaDoces.push(nomeAlimento);
            break;

        } else {
            alert("*** CATEGORIA DESCONHECIDA ***")
        }
    }
}

criaLista()