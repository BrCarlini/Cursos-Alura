/* Função normal (declarada)
function minhaFuncao(param){
    bloco de código
}

minhaFuncao("param");
*/


// Arrow Function

const apresentarArrow = (nome) => `Meu nome é ${nome}`
const soma = (num1, num2) => num1 + num2;
console.log(apresentarArrow("Bruno"))
console.log(soma(1, 2))



//Arrow Function com mais de 1 linha de instrução
const somaNumerosPequenos = (num1, num2) => {
    return num1 + num2
}

console.log(somaNumerosPequenos(5, 4))

