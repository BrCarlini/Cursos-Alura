import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.ContaSal

fun testaComportamentosConta(){
    val contaBruno = ContaCorrente("Bruno", 1000)
    contaBruno.confSaldo(200.0)

    //println(contaBruno.titular)
    //println(contaBruno.numero)
    //println(contaBruno.saldo)


    val contaFran = ContaPoupanca("Fran", 1001)
    contaFran.deposita(300.0)

    val contaGui = ContaSal("Gui", 1002)

    println(contaGui.titular)
    println(contaGui.numero)
    println(contaGui.pegarSaldo())
    contaGui.deposita(1000.0)
    println(contaGui.pegarSaldo())
    contaGui.saca(50.0)
    println(contaGui.pegarSaldo())
    println("===================================")

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.pegarSaldo())

    println("Depositando na conta do Bruno")
    contaBruno.deposita(50.0)
    println(contaBruno.pegarSaldo())

    println("Depositando na conta do Fran")
    contaFran.deposita(70.0)
    println(contaFran.pegarSaldo())

    println("Sacando na conta do Bruno")
    contaBruno.saca(250.0)
    println(contaBruno.pegarSaldo())

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.pegarSaldo())


    println("Saque em excesso na conta do Bruno")
    contaBruno.saca(100.0)
    println(contaBruno.saldo)

    println("Saque em excesso na conta da Fran")
    contaBruno.saca(500.0)
    println(contaFran.saldo)

    println("Tranferência da conta da Fran para o Alex")

    if(contaFran.transfere(100.0, contaBruno)){
        println("Tranferência sucedida.")
    }else{
        println("Falha na transferência.")
    }

    println(contaBruno.saldo)
    println(contaFran.saldo)
}