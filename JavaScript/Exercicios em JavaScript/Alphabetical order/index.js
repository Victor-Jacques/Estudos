const alphabeticalOrder = (str) => 
    str.split('').sort((a,b) => a > b ? 1 : -1).join('');

console.log(alphabeticalOrder('webmaster'));
