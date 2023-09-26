import { autor, livro } from "../models/index.js";
import NaoEncontrado from "../erros/NaoEncontrado.js";


class LivroController {

  static async listarLivros (req, res, next) {
    try{
      const buscaLivros = livro.find();

      req.resultado = buscaLivros;

      next();
    } catch (erro) {
      next(erro);
    }
  }

  static async listarLivroPorId(req, res, next) {
    try{
      const id = req.params.id;
      const livroEncontrado = await livro.findById(id);
        
      if (livroEncontrado !== null) {
        res.status(200).json(livroEncontrado);
      } else {
        next(new NaoEncontrado("Id do livro não localizado"));
      }
    } catch (erro) {
      next(erro);
    }
  }

  static async cadastrarLivro (req, res, next) {
    try {
      let livroNovo = new livro(req.body);
  
      const livroResultado = await livroNovo.save();
  
      res.status(201).send(livroResultado.toJSON());
    } catch (erro) {
      next(erro);
    }
  }

  static async atualizarLivro(req, res, next) {
    try{
      const id = req.params.id;
      const livroResultado = await livro.findByIdAndUpdate(id, {$set: req.body});
      console.log(livroResultado);
      if(livroResultado!== null) {
        res.status(200).json({ message: "Livro atualizado" });
      } else {
        next(new NaoEncontrado("Id do livro não localizado"));
      }
    } catch (erro) {
      next(erro);
    }
  }

  static async excluirLivro(req, res, next) {
    try {
      const id = req.params.id;
      const livroResultado = await livro.findByIdAndDelete(id);
      if (livroResultado !== null) {
        res.status(200).json({ message: "Livro excluído com sucesso" });
      } else {
        next(new NaoEncontrado("Id do livro não localizado"));
      }
    } catch (erro) {
      next(erro);
    }
  }

  static async listarLivrosPorFiltro(req, res, next) {
    try {
      const busca = await processaBusca(req.query);

      if (busca !== null) {
        const livrosPorFiltro = livro.find(busca);

        req.resultado = livrosPorFiltro;

        next();
      } else {
        res.status(200).send([]);
      }
    } catch (erro) {
      next(erro);
    }
  }
}


async function processaBusca(params) {
  const { editora, titulo, minPaginas, maxPaginas, nomeAutor } = params;

  let busca = {};

  if (editora) busca.editora = editora;
  if (titulo)  busca.titulo = { $regex: titulo, $options: "i" };

  if (minPaginas || maxPaginas) busca.paginas = {};

  // gte = Greater than or Equal
  if (minPaginas) busca.paginas.$gte = minPaginas;
  // lte = Less than or Equal
  if (maxPaginas) busca.paginas.$lte = maxPaginas;

  if (nomeAutor) {
    const autores = await autor.findOne({ nome: nomeAutor });

    if (autores !== null) {
      busca.autor = autores._id;
    } else {
      busca = null;
    }
  }

  return busca;
}

export default LivroController;