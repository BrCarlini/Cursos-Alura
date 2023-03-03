const cliente = {
    nome: "João",
    idade: 24,
    email: "joao@firma.com",
    telefone: ["(11)111222333", "(11)444555666"]
}


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


for(let chave in cliente){
    let tipo = typeof cliente[chave]

    if(tipo !== 'object' && tipo !== 'function'){
        console.log(`A chave ${chave} tem o valor ${cliente[chave]}`);
    }
}