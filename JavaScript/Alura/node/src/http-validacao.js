export default async function listaValidada (listaDeLinks) {
    const links = extraiLinks(listaDeLinks);
    const status = await checaStatus(links);
    
    return listaDeLinks.map((objeto, indice) => ({
        ...objeto, 
        status: status[indice]
    }))
}

async function checaStatus (listaURL) {
    const arrStatus = await Promise.all(
        listaURL.map(async (url) => {
            try {
                const response = await fetch(url)
                return response.status;
            } catch (erro) {
                return manejaErros(erro);
            }
        })
    );
    return arrStatus;
}

function extraiLinks (arrayLinks) {
    return arrayLinks.map((objetoLink) => Object.values(objetoLink).join());
}

function manejaErros (erro) {
    if (erro.cause.code === 'ENOTFOUND') {
        return 'Link não encontrado';
    } else {
        return 'Ocorreu algum erro';
    }
}