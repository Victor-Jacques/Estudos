// const cliente = {
//     nome: "Andre",
//     idade: 32,
//     cpf: "1111222333",
//     email: "andre@dominio.com"
// }

// console.log(`O nome do cliente é ${cliente.nome} e essa pessoa tem ${cliente.idade} anos.`)

// console.log(`Os 3 ultimos digitos do CPF são ${cliente.cpf.substring(7, 10)}`);

const cliente = {
    nome: "Andre",
    idade: 32,
    cpf: "1111222333",
    email: "andre@dominio.com"
}

console.log(`O nome do cliente é ${cliente["nome"]} e essa pessoa tem ${cliente["idade"]} anos.`)

const chaves = ["nome", "idade", "cpf", "email", "altura"];

chaves.forEach((chave) => {
    console.log(`A chave ${chave} tem valor ${cliente[chave]}`);
});
