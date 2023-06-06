//const getUniqueChars = (str) =>
//    str.split("").filter((item, index, arr) =>
//        arr.slice(index + 1).indexOf(item) === -1);


const getUniqueChars = (str) =>
   [... new Set(str.split(""))];

console.log(getUniqueChars("aaaabbbcccdeffffffgg"))