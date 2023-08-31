import fs from 'fs'; //Nativo do node
import chalk from 'chalk'; //Não é nativo do node
import { log } from 'console';


function trataErro(erro) {
    throw new Error (chalk.red(erro.code, 'Não há arquivos no diretório.'));
}

// async/await

async function pegaArquivo (caminhoArquivo) {
    try {
        const encoding = 'utf-8';
        const texto = await fs.promises.readFile(caminhoArquivo, encoding)
        console.log(chalk.green(texto));
    } catch (erro) {
        trataErro(erro)
    }
}

// promises com then()

// function pegaArquivo(caminhoArquivo) {
//     const encoding = 'utf-8';
//     fs.promises
//         .readFile(caminhoArquivo, encoding)
//         .then((texto) => console.log(chalk.green(texto)))
//         .catch(trataErro)
// }



pegaArquivo('./arquivos/texto.md');
pegaArquivo('./arquivos/')


// Expressões regulares
// \[[^[\]]*?\]
// \(https?:\/\/[^\s?#.].[^\s]*\)