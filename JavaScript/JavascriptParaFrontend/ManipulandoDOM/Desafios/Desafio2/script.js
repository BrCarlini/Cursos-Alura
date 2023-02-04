const botaoEnviarNota = document.querySelector("#calcular");
const resultado = document.querySelector(".resultado")

botaoEnviarNota.addEventListener("click", function (){
    resultado.innerHTML = "Fui clicado"
})