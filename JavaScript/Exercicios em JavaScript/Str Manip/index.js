const makeNewString = (str) => 
    str.length < 3 ? str : str.slice(0, 3) + str.slice(-3);


console.log(makeNewString('abc'));
console.log(makeNewString('abcdef'));
console.log(makeNewString('abc123abc123'));