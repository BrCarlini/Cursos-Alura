import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios(){

    val alex = Analista(
        "Alex",
        "111.111.111-11",
        1000.00
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao()}")

    println("============================================")


    val fran = Gerente(
        "Fran",
        "222.222.222-22",
        2000.00,
        1234
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao()}")

    println("============================================")

    if(fran.autentica(1234)){
        println("${fran.nome} Se autenticou com sucesso.")
    }else{
        println("Falha na autenticação.")
    }

    println("============================================")

    val gui = Diretor(
        "Gui",
        "333.333.333-33",
        4000.00,
        4321,
        200.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao()}")
    println("PLR: ${gui.plr}")

    println("============================================")

    if(gui.autentica(4321)){
        println("${gui.nome} Se autenticou com sucesso.")
    }else{
        println("Falha na autenticação.")
    }
    println("============================================")

    val maria = Analista(
        "Gui",
        "333.333.333-33",
        4000.00,
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificação: ${calculadora.total}")
}