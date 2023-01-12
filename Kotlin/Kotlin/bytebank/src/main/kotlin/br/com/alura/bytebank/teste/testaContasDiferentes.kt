import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes(){
    val contaCorrente = ContaCorrente(
        "Alex",
        1000
    )

    val contaPoupanca = ContaPoupanca(
        "Fran",
        1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Corrente: ${contaCorrente.saldo}")
    println("Saldo Poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo após saque Corrente: ${contaCorrente.saldo}")
    println("Saldo após saque Poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo Corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após receber tranferência: ${contaPoupanca.saldo}")
}