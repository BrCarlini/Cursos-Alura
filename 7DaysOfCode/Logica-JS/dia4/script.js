let cont = 3


function getRandomIntInclusive() {
    const min = 1;
    const max = 10;
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

let numAleat = getRandomIntInclusive();


while(cont >= 1){
    alert(numAleat)
    let numUser = prompt("Insera um número entre 1 e 10: ");

    if(numUser == numAleat){
        alert(`Numero do Usuario: ${numUser}\nNumero do Computador: ${numAleat}\nParabéns você acertou.`);
        break
    }else {
        alert(`Você errou, tem mais ${cont - 1} tentativas`)
        cont--
    }
}
  