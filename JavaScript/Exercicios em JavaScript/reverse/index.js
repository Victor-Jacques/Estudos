let x = 1497263
function descendingOrder(n){
    return parseInt(String(n).split('').sort().reverse().join(''))
  }

console.log(descendingOrder(x))