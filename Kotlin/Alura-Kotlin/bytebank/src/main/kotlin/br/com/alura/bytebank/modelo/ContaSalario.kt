package br.com.alura.bytebank.modelo

interface ContaSalario {

    fun deposita(valor: Double)

    fun saca(valor: Double)

    fun pegarSaldo(): Double
}