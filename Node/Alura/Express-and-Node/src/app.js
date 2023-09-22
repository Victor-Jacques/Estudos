import express from "express";
import conectaDatabase from "./config/dbConnect.js";
import routes from "./routes/index.js";
import manipuladorDeErros from "./middlewares/manipuladorDeErros.js";
import manipulador404 from "./middlewares/manipulador404.js";

const conexao = await conectaDatabase();

conexao.on("error", (erro) => {
  console.error("erro de conexão", erro);
});

conexao.once("open", () => {
  console.log("Conexão com o banco feita com sucesso");
});

const app = express();
routes(app);

app.use(manipulador404);

// Uso de Middleware para tratar erros, sendo importado do manipuladorDeErros

// eslint-disable-next-line no-unused-vars
app.use(manipuladorDeErros);

export default app;
