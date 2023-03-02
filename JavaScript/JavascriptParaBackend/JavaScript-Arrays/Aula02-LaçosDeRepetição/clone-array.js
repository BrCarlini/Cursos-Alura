const notas = [7, 7, 8, 9];

//const novasNotas = notas; --> Esta indicando para o mesmo endereço na memoria, portanod são o mesmo array


// Utilizar a sintaxe abaixo para fazer copia de array, o nome disso é spread operator --> 
//let nomeLet = [...arrayASerCopiado]

const novasNotas = [...notas];

novasNotas.push(10);


console.log(`As notas originais são ${notas}`)
console.log(`As novas notas são ${novasNotas}`)