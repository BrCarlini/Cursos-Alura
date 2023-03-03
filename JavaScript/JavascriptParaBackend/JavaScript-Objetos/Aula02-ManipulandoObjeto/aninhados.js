const cliente = {
    nome: "João",
    idade: 24,
    email: "bruno@firma.com",
    telefone: ["(11)111222333", "(11)444555666"]
}


cliente.endereco = {
    rua: "R. Joseph Climber",
    numero: 1337,
    apartamento: true,
    complemento: "ap 934"
};

console.log(cliente.endereco.apartamento)