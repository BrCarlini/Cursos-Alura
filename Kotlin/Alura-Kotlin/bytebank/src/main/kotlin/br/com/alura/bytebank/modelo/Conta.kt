package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: String,
    val numero: Int
) {
     var saldo = 0.0
        protected set

    abstract fun deposita(valor: Double)

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor){
            saldo -= valor
            destino.saldo += valor
            return true
        } else {
            return false
        }
    }

    abstract fun pegarSaldo(): Double


    abstract fun confSaldo(valor: Double)


}