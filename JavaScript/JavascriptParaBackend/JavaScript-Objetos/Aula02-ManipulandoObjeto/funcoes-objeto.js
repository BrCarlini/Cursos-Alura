const cliente = {
    nome: "João",
    idade: 24,
    email: "bruno@firma.com",
    telefone: ["(11)111222333", "(11)444555666"],
    saldo: 200,
    efetuaPagamento: function(valor){
        if(valor > this.saldo) {
            console.log("Saldo insuficiente")
        }else {
            this.saldo -= valor
            console.log(`Pagamento realizado. Novo saldo: ${this.saldo}`)
        }
    }
};

cliente.efetuaPagamento(130);