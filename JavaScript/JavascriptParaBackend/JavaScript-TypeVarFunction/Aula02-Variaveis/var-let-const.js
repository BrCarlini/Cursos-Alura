// var --> É uma variavel global, sendo possivel voce utilizalá antes de ser declarada de fato.
/*
var altura = 5;
var comprimento = 7;

area = altura * comprimento;
console.log(area);

var area;
*/




// let --> É uma variavel que se limita ao escopo no bloco,  o inverso da variavel 'var'
/*
let forma = 'retângulo'
let altura = 5;
let comprimento = 7;
let area;

if(forma === 'retângulo') {
    area = altura * comprimento;
} else {
    area = (altura * comprimento) / 2;
}
console.log(area);
*/


// const --> É uma variavel constante onde não pode ter seu valor alterado.
// Possui limitação de escopo de bloco

/*
const forma = 'quadrado';
const altura = 5;
const comprimento = 7;
let area;

if(forma === 'quadrado') {
    area = altura * comprimento;
} else {
    area = (altura * comprimento) / 2;
}

console.log(area)
*/