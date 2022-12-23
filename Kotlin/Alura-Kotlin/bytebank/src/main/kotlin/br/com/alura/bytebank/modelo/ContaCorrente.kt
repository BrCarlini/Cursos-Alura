package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
), ContaSalario {

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

    override fun confSaldo(valor: Double) {
        if(valor > 0){
            saldo = valor
        }
    }



}