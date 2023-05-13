const user = {
    nome: "Juliana",
    email: "j@j.com",
    nascimento: "2021/01/01",
    role: "admin",
    ativo: true,
    exibirInfos: function(){
        console.log(this.nome, this.email)
    }
}

const admin = {
    nome: "Mariana",
    email: "m@m.com",
    role: "admin",
    criarUmCurso: function(){
        console.log('Curso criado')
    }
}


Object.setPrototypeOf(admin, user)
admin.criarUmCurso()
admin.exibirInfos()