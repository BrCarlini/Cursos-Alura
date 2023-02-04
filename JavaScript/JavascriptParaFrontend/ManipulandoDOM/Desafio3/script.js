/*
No desafio desta aula, temos uma lista de cores que serão utilizadas para pintar uma loja, porém o cliente informou que não deseja mais pintar com a cor "vermelha". Retire esta cor da lista utilizando um método do JavaScript
*/
var lista = ["Laranja", "Vermelho", "Branco", "Amarelo", "Rosa"]; 

lista = lista.filter(elemento => elemento != "Vermelho");

console.log(lista);