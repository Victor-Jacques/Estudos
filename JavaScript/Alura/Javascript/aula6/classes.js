const livro = function (nome, editora, paginas) {
    gNome = nome,
    gEditora = editora,
    gPaginas = paginas

    this.getNome = () => {
        return gNome;
    }
    this.getEditora = () => {
        return gEditora;
    }
    this.getPaginas = () => {
        return gPaginas;
    }
}

const infernoDeDante = new livro("Inferno de Dante", "Dante Alighieri", 240);

console.log(infernoDeDante.getNome());
console.log(infernoDeDante.getEditora());
console.log(infernoDeDante.getPaginas());

///////////////


class book {
    constructor (nome, editora, paginas) {
        this.nome = nome;
        this.editora = editora;
        this.paginas = paginas;
    }
    anunciarTitulo () {
        console.log(`Título: ${this.nome}`);
    }
    descreverTitulo () {
        console.log(`${this.nome} é um livro da editora ${this.editora} e tem ${this.paginas} páginas`);
    }
}

const nodeJS = new book ("Primeiros passos com NodeJS", "Casa do Código", 195);

nodeJS.anunciarTitulo();
nodeJS.descreverTitulo();

class novaColecao extends book {
    constructor(nome, nomeColecao) {
        super(nome)
        this.nomeColecao = nomeColecao;
    }
    descreverColecao () {
        console.log(`O livro ${this.nome} faz parte da coleção ${this.nomeColecao}`);
    }
}

const logicaDeProgramacao = new novaColecao ("Lógica de programação", "Comece a programar");

logicaDeProgramacao.descreverColecao();
