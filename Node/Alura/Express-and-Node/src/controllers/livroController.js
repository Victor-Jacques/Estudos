import { livro } from "../models/index.js";
import NaoEncontrado from "../erros/NaoEncontrado.js";

class LivroController {

  static async listarLivros (req, res, next) {
    try{
      const listaLivros = await livro.find()
        .populate("autor")
        .exec();
        
      res.status(200).json(listaLivros);
    } catch (erro) {
      next(erro);
    }
  }

  static async listarLivroPorId(req, res, next) {
    try{
      const id = req.params.id;
      const livroEncontrado = await livro.findById(id)
        .populate("autor", "nome")
        .exec();
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

  static async listarLivrosPorEditora(req, res, next) {
    const editora = req.query.editora;
    try {
      const livrosPorEditora = await livro.find({ editora: editora });
      res.status(200).json(livrosPorEditora);
    } catch (erro) {
      next(erro);
    }
  }

}

export default LivroController;