const pessoa = {
    nome: "Bruno",
    idade: 25,
}

//const pessoa2 = pessoa

//pessoa2.nome = "Lucas" ---> As duas const estão apontando para a mesma referencia

// Para criar um novo Object apartir do Obj que ja temos, utiliza-se Object.create()

const pessoa2 = Object.create(pessoa)
pessoa2.nome = "Lucas"
pessoa2.idade = 24

console.log(pessoa)

console.log(pessoa2)