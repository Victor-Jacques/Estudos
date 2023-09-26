import mongoose from "mongoose";
import ErroBase from "../erros/ErroBase.js";
import RequisicaoIncorreta from "../erros/RequisicaoIncorreta.js";
import ErroValidacao from "../erros/ErroValidacao.js";

// Tratamento de erros, Express pega o erro do arquivo autorController e livroController através do parametro next e puxa para a função manipuladorDeErros

// eslint-disable-next-line no-unused-vars
function manipuladorDeErros(erro, req, res, next) {
  if (erro instanceof mongoose.Error.CastError) {
    new RequisicaoIncorreta().enviarRespostas(res);
  } else if (erro instanceof mongoose.Error.ValidationError) {
    new ErroValidacao(erro).enviarRespostas(res);
  }else if (erro instanceof ErroBase) {
    erro.enviarRespostas(res);
  } else {
    new ErroBase().enviarRespostas(res);
  }
}


export default manipuladorDeErros;