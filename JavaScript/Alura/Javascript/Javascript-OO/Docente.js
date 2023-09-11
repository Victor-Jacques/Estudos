import User from "./user.js";

export default class Docente extends User {
    constructor (nome, email, nascimento, role = 'docente', ativo = true) {
        super(nome, email, nascimento, role, ativo)
    }

    aprovaEstudante(estudante, curso){
        return `O aluno ${estudante} foi aprovado no curso ${curso}.`
    }
}

