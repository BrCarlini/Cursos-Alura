package br.com.alura.bytebank.modelo

class ContaSal(
    val titular: String,
    val numero: Int
): ContaSalario {

    var saldo: Double = 0.0

    override fun deposita(valor: Double) {
        if(valor >= 0){
            saldo += valor
        }
    }

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }

    override fun pegarSaldo(): Double {
        return saldo
    }
}