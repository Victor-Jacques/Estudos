function addKey(num) {
  const number = document.querySelector('.result').innerHTML;
  document.querySelector('.result').innerHTML = number + num;
}

function cleanNum() {
  document.querySelector('.result').innerHTML = "";
}

function back(){
  const result = document.querySelector('.result').innerHTML;
  document.querySelector('.result').innerHTML = result.substring(0,result.length -1);
}

function calculateNum(){
  const result = document.querySelector('.result').innerHTML;
  if (result) {
    document.querySelector('.result').innerHTML = eval(result)
  }
  else {
    document.querySelector('.result').innerHTML = "Nada..."
  }
}








/*function multiplyBy()
{
    num1 = document.getElementById("firstNumber").value;
    num2 = document.getElementById("secondNumber").value;
    document.getElementById("result").innerHTML = num1 * num2;
    num1 = Number(num1);
    num2 = Number(num2);
}

function divideBy()
{
    num1 = document.getElementById("firstNumber").value;
    num2 = document.getElementById("secondNumber").value;
    document.getElementById("result").innerHTML = num1 / num2;
    num1 = Number(num1);
    num2 = Number(num2);
}

function sumBy()
{
    num1 = document.getElementById("firstNumber").value;
    num2 = document.getElementById("secondNumber").value;
    num1 = Number(num1);
    num2 = Number(num2);
    document.getElementById("result").innerHTML = num1 + num2;
}

function reduceBy()
{
    num1 = document.getElementById("firstNumber").value;
    num2 = document.getElementById("secondNumber").value;
    document.getElementById("result").innerHTML = num1 - num2;
    num1 = Number(num1);
    num2 = Number(num2);
}
*/
