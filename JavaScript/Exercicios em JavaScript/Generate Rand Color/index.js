const getRandomHexNumber = () =>
    Math.floor(Math.random() * 16).toString(16);

const getRandomHexColor = () => "#" + Array.from(
    {length: 6}).map(getRandomHexNumber).join('');


console.log(getRandomHexColor());
console.log(getRandomHexColor());
console.log(getRandomHexColor());
console.log(getRandomHexColor());
console.log(getRandomHexColor());