/*const lista = document.querySelector("ul");

const botaoMostrar = document.querySelector("#botao")

const botaoEsconder = document.querySelector(".close")


botaoMostrar.addEventListener("click", () => {
    lista.setAttribute("data-lista", "mostrar");
});

botaoEsconder.addEventListener("click", () => {
    lista.setAttribute("data-lista", "esconder");
});
*/

const lista = document.querySelector("ul");
document.querySelector("#botao").addEventListener("click", () => {
  lista.setAttribute("data-lista", "mostrar");
});

document.querySelector(".close").addEventListener("click", () => {
  lista.setAttribute("data-lista", "esconder");
});
