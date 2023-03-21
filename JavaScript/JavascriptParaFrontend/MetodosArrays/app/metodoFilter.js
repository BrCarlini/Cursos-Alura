const btnTagCategoria = document.querySelectorAll('.btn');

btnTagCategoria.forEach(btn => btn.addEventListener('click', filtrarLivros))

function filtrarLivros(){
    const elementoBtn = document.getElementById(this.id)
    const categoria = elementoBtn.value
    let livrosFiltrados = livros.filter(livro => livro.categoria == categoria)

    exibirOsLivrosNaTela(livrosFiltrados)
}