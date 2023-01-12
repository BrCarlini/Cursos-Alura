package br.com.alura.bytebank.modelo

class ContaPoupanca(
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
        if(this.saldo >= valor){
            this.saldo -= valor
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