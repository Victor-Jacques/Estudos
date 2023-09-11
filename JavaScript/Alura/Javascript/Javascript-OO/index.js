import User from "./user.js";
import Docente from "./Docente.js";
import Admin from "./admin.js";

const novoUser = new User('Mariana', 'm@m.com', '2021-02-03')

console.log(novoUser.exibirInfos());