const cliente = {
    nome: "João",
    idade: 24,
    email: "joao@firma.com",
    telefone: ["(11)111222333", "(11)444555666"]
}

/*
cliente.endereco = [
    {
        rua: "R. Joseph Climber",
        numero: 1337,
        apartamento: true,
        complemento: "ap 934"
    },
    {
        rua: "R. Jubileu Rei",
        numero: 2004,
        apartamento: true,
        complemento: "ap 1934"
    }
];
*/

// Retorna a Chaves do Objeto através de um array
//console.log(Object.keys(cliente))


// Retorna o Valor do Objeto através de um array
//console.log(Object.values(cliente))

const chave = Object.keys(cliente)
const valor = Object.values(cliente)


const chaveValor = [[...chave], [...valor]]

//console.log(chaveValor)

for(let i = 0; i < chave.length; i++){
    console.log(`${chaveValor[0][i]}: ${chaveValor[1][i]}`)
}


