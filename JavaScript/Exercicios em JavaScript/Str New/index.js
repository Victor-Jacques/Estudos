const addNew = (str) => 
    str.indexOf('New!') === 0 ? str : 'New ${str}';

console.log(addNew('New! Offers'));