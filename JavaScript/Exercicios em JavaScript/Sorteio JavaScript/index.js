
let cards = ["Victor", "Ricardo", "Cinthia", "Alice"]
shuffle(cards);

console.log(teams(cards));

function shuffle(array){
    let currentIndex = array.length;

    while(currentIndex != 0){
        let randomIndex = Math.floor(Math.random() * array.length);
        currentIndex -= 1;

        let temp = array[currentIndex];
        array[currentIndex] = array[randomIndex];
        array[randomIndex] = temp;
    }

    return array;
}

function teams(array){
    teamA = array.length / 2;
        return teamA
}