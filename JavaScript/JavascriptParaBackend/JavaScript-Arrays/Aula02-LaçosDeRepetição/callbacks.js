const nomes = ['Bruno', 'Bia', 'Mari'];


// callback com function anonimo
nomes.forEach(function(nome) {
    console.log(nome)
})


// callback com arrow function
nomes.forEach(nome => console.log(nome))


function imprimeNome(nome){
    console.log(nome)
}


// callback com function padrão
nomes.forEach(imprimeNome)