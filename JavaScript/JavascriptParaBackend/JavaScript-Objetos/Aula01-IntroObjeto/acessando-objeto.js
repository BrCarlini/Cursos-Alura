// Acessando com Ponto
const cliente = {
    nome: "Bruno", 
    cpf: '234.456.345-21',
    email: 'bruno@dominio.com'
}

console.log(`CPF do meu cliente ${cliente.nome} é ${cliente.cpf}`)

// Acessando com Colchete

console.log(`O email do ${cliente['nome']} é ${cliente['email']}`)

const chaves = ["nome", "cpf", "email"]

chaves.forEach( chave => {
    console.log(`A chave ${chave} tem valor ${cliente[chave]}`)
})