import mongoose from "mongoose";

const livroSchema = new mongoose.Schema({
  id: 
    { type: mongoose.Schema.Types.ObjectId },
  titulo: 
  { 
    type: String, 
    required: [true, "O título do livro é obrigatório"]
  },
  editora: 
  { 
    type: String
  },
  preco: 
    { 
      type: Number,
      min: [0, "Não é possível inserir um valor negativo. Valor fornecido: {VALUE}"]
    },
  paginas: 
    { 
      type: Number,
      min: [10, "O número de páginas deve estar entre 10 e 5000. Valor fornecido: {VALUE}"],
      max: [5000, "O número de páginas deve estar entre 10 e 5000. Valor fornecido: {VALUE}"] 
    },
  autor: { 
    type: mongoose.Schema.Types.ObjectId,
    ref: "autores",
    required: [true, "O nome do autor é obrigatório"]
  }
}, { versionKey: false });

const livro = mongoose.model("livros", livroSchema);

export default livro;