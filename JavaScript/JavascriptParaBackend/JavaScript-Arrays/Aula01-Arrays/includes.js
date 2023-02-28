const alunos = ['João', 'Juliana', 'Caio', 'Ana'];
const medias = [10, 8, 7.5, 9];

const listaDeAlunosEMedias = [alunos, medias];

function buscaAlunoENota(aluno){

    // includes() verifica se o elemento posto em Arg esta no Array e retorna True ou False
    if(listaDeAlunosEMedias[0].includes(aluno)){
        console.log(`${aluno} está cadastrado.`);

        // indexOf() retorna o indice do elemento posto como Arg
        //const alunos = listaDeAlunosEMedias[0];
        //const medias = listaDeAlunosEMedias[1];
        const [alunos, medias] = listaDeAlunosEMedias;
        const indice = alunos.indexOf(aluno);

        const mediaAluno = medias[indice];

        console.log(`Sua média é ${mediaAluno}`)
    }else {
        console.log("Aluno não cadastrado!");
    }
}

buscaAlunoENota("João")