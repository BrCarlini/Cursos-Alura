import chalk from "chalk";
import fs from 'fs';

function trataErro(erro) {
    throw new Error(chalk.red(erro.code, 'Não há arquivo no diretório'))

}

//async / await

async function pegaArquivo(caminhoDoArquivo){
    try {
        const encoding = 'utf-8';
        const texto = await fs.promises.readFile(caminhoDoArquivo, encoding)
        console.log(chalk.green(texto))
    }catch(erro){
        trataErro(erro)
    } finally {
        console.log(chalk.yellow('Operação concluída'))
    }
}


/*

-> função assincrona = promises com then()

function pegaArquivo(caminhoDoArquivo) {
    const encoding = 'utf-8';
    fs.promises
        .readFile(caminhoDoArquivo, encoding)
        .then((texto) => console.log(chalk.green(texto)))
        .catch(trataErro)
}



-> Função sincrona
function pegaArquivo(caminhoDoArquivo) {
    const encoding = 'utf-8';
    fs.readFile(caminhoDoArquivo, encoding, (erro, texto) => {

        if(erro){
            trataErro(erro);
        }


        console.log(chalk.green(texto));
    })
}
*/

pegaArquivo('./arquivos/texto.md');
pegaArquivo('./arquivos/');