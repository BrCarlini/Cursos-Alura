const nome = prompt("Qual seu nome ? ");
const idade = prompt("Quantos anos você tem ? ");
const linguagem = prompt("Qual linguagem de programação você está estudando ? ");

alert(`Olá ${nome}, você tem ${idade} anos e já está aprendendo ${linguagem}`);



const pergunta = prompt(`Você gosta de estudar ${linguagem} ?\n Responda com o número [1 para SIM] ou [2 para NÃO].`);

let pergunta2;

if(pergunta == "1"){
    alert("Muito bom! Continue estudando e você terá muito sucesso.");
} else if(pergunta == "2"){
    pergunta2 = prompt("Ahh que pena... Já tentou aprender outras linguagens?\n Responda com o número [1 para SIM] ou [2 para NÃO].");
}else{
    alert("Valor inserido é desconhecido.");
}

if(pergunta == "2"){
    if(pergunta2 == "1"){
        alert("Muito bom... Sucesso!")
    }else if(pergunta2 == "2"){
        alert("Vai no seu tempo. Sucesso!")
    }else {
        alert("Valor inserido é desconhecido.");
    }
}