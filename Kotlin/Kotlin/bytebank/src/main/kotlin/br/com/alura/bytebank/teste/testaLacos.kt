fun testaLacos() {
    for (i in 5 downTo 1) {
        val titular: String = "Bruno Carlini $i"
        val numeroConta: Int = 2222 + i
        var saldo = 0.0 + i

        //saldo = 100.0 + 2.0
        //saldo += 200
        //saldo -= 1000


        println("Titular: $titular")
        println("Número da modelo.Conta: $numeroConta")
        println("Saldo: $saldo")
        testaCondicoes(saldo)

        println()
    }
}