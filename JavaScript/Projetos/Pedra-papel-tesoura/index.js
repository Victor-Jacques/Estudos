          //The localStorage is how we "save" the results in the page even if we refreash the page, it only saves strings, that's why we use JSON.stringify.
          //And then, to return a number we use JSON.parse, to get the numbers.


          //const score = JSON.parse(localStorage.getItem('score'));
          //If we use const, it will give us an error, cause const saves an unique value,
          //we can't change const, so we have to use let to change the value inside the variable

let score = JSON.parse(localStorage.getItem('score')) || 
{
  wins: 0,
  losses: 0,
  ties: 0
};
          
          //if() do the same thing as ||
          //!score is the same as score === null, both return the same value

              /* if(!score){
            score = {
              wins: 0,
              losses: 0,
              ties: 0
            };
          } */

          //Call for the function that instantly updates the score in the page
          
updateScoreElement();
               
          //The main function of the game, how it works, player moves, computer moves and results.
    
          //setInterval makes a function do something repeatedly according to the time you choose

          //setTimeout makes something appears or some function works after the time you choose
        
let isAutoPlaying = false;
let intervalId;

function autoPlay(){
  if (!isAutoPlaying) {
    intervalId = setInterval(() => {
      const playerMove = pickComputerMove();
      playGame(playerMove);
    }, 2000);
    isAutoPlaying = true;

  } else {
    clearInterval(intervalId);
    isAutoPlaying = false;
  }
}

          //Game buttons

document.querySelector('.js-rock-button')
  .addEventListener('click', () => {
    playGame('Rock');
  })

document.querySelector('.js-paper-button')
  .addEventListener('click', () => {
    playGame('Paper');
  })

document.querySelector('.js-scissors-button')
  .addEventListener('click', () => {
    playGame('Scissors');
  })

document.querySelector('.js-reset-button')
  .addEventListener('click', () => {
    score.wins = 0;
    score.losses = 0;
    score.ties = 0;
    localStorage.removeItem('score');
    updateScoreElement();
  })

document.querySelector('.js-autoplay-button')
  .addEventListener('click', () => {
    autoPlay();
  })

document.body.addEventListener('keydown', (event) => {
  //console.log(event.key);
  if (event.key === 'r') {
    playGame('Rock');
  } else if (event.key === 'p') {
    playGame('Paper');
  } else if (event.key === 's') {
    playGame('Scissors');
  }
});

function playGame(playerMove){

  const computerMove = pickComputerMove();

  let result = '';
    if(playerMove === 'Scissors'){
      if(computerMove === 'Rock'){
        result = 'You lose.';
      } else if (computerMove === 'Paper'){
        result = 'You win.';
      } else if (computerMove === 'Scissors'){
        result = 'Tie.';
      }
  } else if (playerMove === 'Paper') {
    if (computerMove === 'Rock') {
        result = 'You win.';
      } else if (computerMove === 'Paper'){
        result = 'Tie.';
      } else if (computerMove === 'Scissors') {
        result = 'You lose.';
      }
  } else if (playerMove === 'Rock'){
      if (computerMove === 'Rock') {
        result = 'Tie.';
      } else if (computerMove === 'Paper'){
        result = 'You lose.';
      } else if (computerMove === 'Scissors') {
        result = 'You win.';
      }
    }

  if(result === 'You win.'){
    score.wins += 1;
  } else if(result === 'You lose.'){
    score.losses += 1;
  } else if(result === 'Tie.'){
    score.ties += 1;
  }

  localStorage.setItem('score', JSON.stringify(score));

  updateScoreElement();


          //The results is down here

  document.querySelector('.js-moves').
  innerHTML = `You 
  <img src="styles/${playerMove}-emoji.png" class="move-icon">
  <img src="styles/${computerMove}-emoji.png" class="move-icon">
  Computer`


  document.querySelector('.js-result').
  innerHTML = `${result}`}


  function updateScoreElement() {
  document.querySelector('.js-score')
    .innerHTML = `Wins: ${score.wins}, Losses: ${score.losses}, Ties: ${score.ties}`
  }

          //Here we have the random move from the computer.
//In functions there's a scope, so the computerMove here doesn't conflict with the others in the buttons
function pickComputerMove() {
  const randomNumber = Math.random();
  let computerMove = '';

  if (randomNumber >= 0 && randomNumber < 1/3) {
    computerMove = 'Rock';
  } else if (randomNumber >= 1/3 && randomNumber < 2/3) {
    computerMove = 'Paper';
  } else if (randomNumber >= 2/3 && randomNumber < 1) {
    computerMove = 'Scissors';
  }

  return computerMove;
}