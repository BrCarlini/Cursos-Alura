const notas = [2, 4];

// push() para adicionar um elemento ao final do array
notas.push(10);


// pop() para remover um elemento ao final do array
notas.pop();

console.log(notas)


//////////////////////////////////////////////////////////////////////////////


const alunos = ['Bruno', 'Breno', 'Brian', 'Beatriz', 'Carlos', 'Coelho', 'Carla', 'Eduardo', 'Edna', 'Felipe'];

// slice() server para "fatiar"/ dividir o array, 1° Arg é por onde quero começar e o 2° é até onde eu quero ir/terminar

const sala1 = alunos.slice(0, 5)
const sala2 = alunos.slice(5, alunos.length)
console.log(sala1)
console.log(sala2)


//////////////////////////////////////////////////////////////////////////////


const nomes = ['João', 'Ana', 'Caio', 'Lara', 'Marjorie', 'Leo'];


// splice() remove elemento indicando no 1° Arg o indice do elemento que gostaria de remover, e no 2° Arg até onde gostaria de remover(quantidade de elementos apartir do indice indicado no 1° arg).
// O 3° parametro adiciona/ substitui o conteudo posto no 1° e 2° Arg
nomes.splice(1, 2, "Rodrigo");

//nomes.push('Rodrigo');

console.log(nomes);