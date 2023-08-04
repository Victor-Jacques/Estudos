/*const notas = [10, 6.5, 8, 7.5];

let somaDasNotas = 0;

for(let i = 0; i < notas.length; i++){
    somaDasNotas += notas[i]
}

let media = somaDasNotas / notas.length;

console.log(`A média das notas é ${media}.`) */


// const notas1 = [10, 6.5, 8, 7.5];
// const notas2 = [9, 6, 5, 7];
// const notas3 = [3, 5]

// const notasGerais = [notas1, notas2, notas3]

// media = 0;

// for (i = 0; i < notasGerais.length; i++) {
//     for(j = 0; j < notasGerais[i].length; j++) {
//         media += notasGerais[i][j] / notasGerais[i].length;
//     }
// }

// media = media/notasGerais.length
// console.log(media)



// const notas = [10, 6.5, 8, 7.5]

// let somaDasNotas = 0

// for(let i of notas){
//      somaDasNotas += i
//  }

// let media = somaDasNotas / notas.length

// console.log(`A média das notas é ${media}`);



// spread operator

// const notas = [7, 7, 8, 9]

// const novasNotas = [...notas]  = [7, 7, 8, 9]
// const novasNotas = [...notas, 10]  = [7, 7, 8, 9, 10]
// const novasNotas = [5, ...notas, 10]  = [5, 7, 7, 8, 9, 10]
// novasNotas.push(10);
// novasNotas = [7, 7, 8, 9, 10]  notas = [7, 7, 8, 9]



const notas = [10, 9.5, 8, 7, 6];

const notasAtualizadas = notas.map((nota)=>{
    return nota + 1 >= 10 ? 10 : nota + 1
});

console.log(notasAtualizadas)
