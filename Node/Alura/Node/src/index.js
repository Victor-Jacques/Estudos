import fs from 'fs'; //Nativo do node
import chalk from 'chalk'; //Não é nativo do node


function extraiLink (texto) {
    const regex = /\[([^[\]]*?)\]\((https?:\/\/[^\s?#.].[^\s]*)\)/gm; // Expressão regular
    const capturas = [...texto.matchAll
    (regex)];
    const resultados = capturas.map(captura => ({[captura[1]]: captura[2]}));
    return resultados.length !== 0 ? resultados : 'Não há links no arquivo';
}

function trataErro(erro) {
    throw new Error (chalk.red(erro.code, 'Não há arquivos no diretório.'));
}

// async/await

async function pegaArquivo (caminhoArquivo) {
    try {
        const encoding = 'utf-8';
        const texto = await fs.promises.readFile(caminhoArquivo, encoding)
        return extraiLink(texto);
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

export default pegaArquivo;
