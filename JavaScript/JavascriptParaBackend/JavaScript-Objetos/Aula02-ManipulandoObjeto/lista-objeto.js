const cliente = {
    nome: "João",
    idade: 24,
    email: "bruno@firma.com",
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

cliente.endereco.push({
    rua: "Av. Brasil",
    numero: 354,
    apartamento: false,
    complemento: "Proximo ao Shopping"
})

console.log(cliente.endereco)

const listaApenasApt = cliente.endereco.filter(endereco => endereco.apartamento === true)

console.log(listaApenasApt)