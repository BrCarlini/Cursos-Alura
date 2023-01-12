package br.com.alura.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
): Funcionario(nome, cpf, salario){


    override fun bonificacao(): Double {
        return salario * 0.10
    }



}