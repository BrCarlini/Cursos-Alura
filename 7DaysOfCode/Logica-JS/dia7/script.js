function main() {

    while (true) {

        let operacao = prompt("Qual operação gostaria de fazer ?\n[+ para somar]\n[- para subtrair]\n[* para multiplicar]\n[/ para dividir]\n['sair' para sair]")




        if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/') {

            let valor1 = parseFloat(prompt("Informe o primeiro valor: "))
            let valor2 = parseFloat(prompt("Informe o segundo valor: "))

            switch (operacao) {

                case '+':
                    alert(somar(valor1, valor2))
                    break;

                case '-':
                    alert(subtrair(valor1, valor2))
                    break;

                case '*':
                    alert(multiplicar(valor1, valor2))
                    break;

                case '/':
                    alert(dividir(valor1, valor2))
                    break;

                default:
                    alert("Operação não encontrada")
            }
        } else if (operacao == 'sair') {
            alert("Operação finalizada")
            break;
        } else {
            alert("Opção desconhecida.")
        }



    }



}

main()


function somar(n1, n2) {
    return n1 + n2
}

function subtrair(n1, n2) {
    return n1 - n2
}

function multiplicar(n1, n2) {
    return n1 * n2
}

function dividir(n1, n2) {
    return n1 / n2
}


