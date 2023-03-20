import express from "express";
import db from "./config/dbConnect.js"
import livros from "./models/Livro.js"

db.on("error", console.log.bind(console, 'Erro de conexão'))
db.once("open", () => {
    console.log('conexão com o banco feita com sucesso')
})

const app = express();

app.use(express.json())

/*
const livros = [
    {id: 1, "titulo": "Senhor dos Aneis"},
    {id: 2, "titulo": "O Hobbit"}
]
*/

app.get('/', (req, res) => {
    res.status(200).send('Curso de Node');

});


// Busca todos os livros
app.get('/livros', (req, res) => {

    livros.find((err, livros) => {
        res.status(200).json(livros)

    })
    
});


// Busca livro por ID
app.get('/livros/:id', (req, res) => {

    let index = buscaLivro(req.params.id)
    res.json(livros[index]);
});


// Posta um livro
app.post('/livros', (req, res) => {
    livros.push(req.body);
    res.status(201).send('Livro foi cadastrado com sucesso')
});


// Atualiza um livro
app.put('/livros/:id', (req, res) => {
    let index = buscaLivro(req.params.id)
    livros[index].titulo = req.body.titulo;
    res.json(livros);
});


app.delete('/livros/:id', (req, res) => {
    let {id} = req.params
    let index = buscaLivro(id)
    livros.splice(index, 1);
    res.send(`Livro ${id} removido com sucesso.`);
});


// Função que buscar livro pelo ID e retorna o indice onde se encontra 
function buscaLivro(id){
    return livros.findIndex(livro => livro.id == id) 
}



export default app