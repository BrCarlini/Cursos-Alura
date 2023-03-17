async function buscaEndereco(cep) {
    var mensagemErro = document.getElementById('erro');
    mensagemErro.innerHTML = "";
    try {
        var consultaCep = await fetch(`https://viacep.com.br/ws/${cep}/json/`)
        var consoleCepConvertida = await consultaCep.json();

        if(consoleCepConvertida.erro) {
            throw Error ('CEP não existente!');
        }

        var cidade = document.getElementById('cidade');
        var logradouro = document.getElementById('endereco');
        var estado = document.getElementById('estado');

        cidade.value = consoleCepConvertida.localidade;
        logradouro.value = consoleCepConvertida.logradouro;
        estado.value = consoleCepConvertida.uf;

        console.log(consoleCepConvertida)

        return consoleCepConvertida;

    } catch(erro){
        mensagemErro.innerHTML = `<p>CEP inválido. Tente novamente!</p>`
        console.log(erro)
    }
}


let cep = document.getElementById('cep');
cep.addEventListener("focusout", () => buscaEndereco(cep.value));
