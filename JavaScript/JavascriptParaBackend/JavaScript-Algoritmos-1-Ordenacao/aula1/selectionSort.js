const livros = require('./listaLivros');
const menorValor = require('./menorValor');


/*
Selection Sort com For tradicional

for (let atual = 0; atual < livros.length - 1; atual++){
    let menor = menorValor(livros, atual)

    let livroAtual = livros[atual];
    console.log('posicao  atual', atual)
    console.log('livro atual', livros[atual])
    
    let livroMenorPreco = livros[menor];
    console.log('livro menor', livros[menor])

    livros[atual] = livroMenorPreco;
    livros[menor] = livroAtual;
}
*/


// Selection Sort com forEach

livros.forEach((_, indice) => {

    let menor = menorValor(livros, indice)

    let livroAtual = livros[indice];
    let livroMenorPreco = livros[menor];


    livros[indice] = livroMenorPreco;
    livros[menor] = livroAtual;
})

console.log(livros)