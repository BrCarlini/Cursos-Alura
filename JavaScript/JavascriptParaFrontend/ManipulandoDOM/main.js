const pecas = {
    "bracos": {
        "forca": 29,
        "poder": 35,
        "energia": -21,
        "velocidade": -5
    },

    "blindagem": {
        "forca": 41,
        "poder": 20,
        "energia": 0,
        "velocidade": -20
    },
    "nucleos":{
        "forca": 0,
        "poder": 7,
        "energia": 48,
        "velocidade": -24
    },
    "pernas":{
        "forca": 27,
        "poder": 21,
        "energia": -32,
        "velocidade": 42
    },
    "foguetes":{
        "forca": 0,
        "poder": 28,
        "energia": 0,
        "velocidade": -2
    }
}

const controle = document.querySelectorAll("[data-controle]")
const estatisticas = document.querySelectorAll("[data-estatistica]")



controle.forEach( (elemento) => {
    elemento.addEventListener("click", (evento) => {
        manipulaDados(evento.target.dataset.controle, evento.target.parentNode)
        atualizaEstatiscas(evento.target.dataset.peca)
    })
})

function manipulaDados(operacao, controle){
    const peca = controle.querySelector("[data-contador]")


    if(operacao === "-") {
        peca.value = parseInt(peca.value) - 1
    } else {
        peca.value = parseInt(peca.value) + 1
    }

}


function atualizaEstatiscas(peca){

    estatisticas.forEach( (elemento) => {
        elemento.textContent = parseInt(elemento.textContent) + pecas[peca] [elemento.dataset.estatistica]
    })
}


function atualizaImagem() {
    var imgRobo = document.querySelector("#imgRobo")

    var selecao = document.getElementById("listagemCores");
    var opcao = selecao.options[selecao.selectedIndex];


    if(opcao.text == "Azul"){
        imgRobo.setAttribute('src', 'img/Robotron2000-Azul.png');
    }else if(opcao.text == "Amarelo"){
        imgRobo.setAttribute('src', 'img/Robotron2000-Amarelo.png');
    }else if(opcao.text == "Branco"){
        imgRobo.setAttribute('src', 'img/Robotron2000-Branco.png');
    }else if(opcao.text == "Preto"){
        imgRobo.setAttribute('src', 'img/Robotron2000-Preto.png');
    }else if(opcao.text == "Rosa"){
        imgRobo.setAttribute('src', 'img/Robotron2000-Rosa.png');
    }else if(opcao.text == "Vermelho"){
        imgRobo.setAttribute('src', 'img/Robotron2000-Vermelho.png');
    }

    console.log(opcao.value);
}

atualizaImagem();
