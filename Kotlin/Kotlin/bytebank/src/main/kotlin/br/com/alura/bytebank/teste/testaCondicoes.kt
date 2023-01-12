fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("modelo.Conta é positiva")
    } else if (saldo == 0.0) {
        println("modelo.Conta é neutra")
    } else {
        println("Não é positiva")
    }
}