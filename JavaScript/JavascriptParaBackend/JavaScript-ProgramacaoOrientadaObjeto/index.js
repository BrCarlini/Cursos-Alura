import Admin from "./Admin.js";
import Docente from "./Docente.js";
import User from "./User.js";

const novoUser = new User('Mariana', 'm@m.com', '2021-01-01')
console.log(novoUser.nome)
novoUser.nome = 'Lucas'
//console.log(novoUser.nome)