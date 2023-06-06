const closetTo100 = (a,b) =>
    (100 - a) < (100 - b) ? a : b;

console.log(closetTo100(99,1));
console.log(closetTo100(1,99));
console.log(closetTo100(50,50));
console.log(closetTo100(49,51));