//let firstName = "Victor Jacques"
//let Idade = 20;
//let student = true;

//console.log("Bom dia", firstName);
//console.log("Sua idade é", Idade);
//console.log(student);

//document.getElementById("p1").innerHTML = "Bom dia " + firstName
//document.getElementById("p2").innerHTML = "Sua idade é " + Idade
//document.getElementById("p3").innerHTML = "Você é um estudante ? " + student



//let fullName = "Snoop Dogg";
//let firstName;
//let lastName;

//firstName = fullName.slice(0, 3);
//lastName = fullName.slice(4);

//firstName = fullName.slice(0, fullName.indexOf(" "));
//lastName = fullName.slice(fullName.indexOf(" ") + 1);

//console.log(firstName);
//console.log(lastName);



//let userName = "Victor";

//let letter = userName.charAt(0);
//letter = letter.toUpperCase();
//It's the same as
//let letter = userName.charAt(0).toUpperCase().trim();

//console.log(letter);


/*var today = new Date();      
    var day = today.getDay();
    var daylist = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    console.log("Today is: " + daylist[day] + ".");
    var hour = today.getHours();
    var minute = today.getMinutes();
    var second = today.getSeconds();
    var prepand = (hour >= 12)? " PM ":" AM ";
    hour = (hour >= 12)? hour - 12: hour;
    if (hour ===0 && prepand ===" PM ")
    {
    if (minute === 0 && second===0)
    {
    hour = 12;
    prepand =" Noon";
    }
    else
    {
    hour = 12;
    prepand =" PM";
    }
    }
    if (hour === 0 && prepand === " AM ")
    {
    if (minute === 0 && second === 0)
    {
    hour = 12;
    prepand =" Midnight";
    }
    else
    {
    hour = 12;
    prepand = "AM";
    }
    }
console.log("Current Time: " + hour + prepand + " : " + minute + ":" + second);*/


            //Calculadora com interface gráfica
function multiplyBy()
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
