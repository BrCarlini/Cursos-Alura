const notas = [10, 9.5, 8, 7, 6];

//  Map() pode receber 3 Argumentos -> Elemento, Indice, o Array inteiro
const notasAtualizadas = notas.map((nota) => {
    return nota + 1 >= 10 ? 10 : nota + 1;
});

console.log(notasAtualizadas);