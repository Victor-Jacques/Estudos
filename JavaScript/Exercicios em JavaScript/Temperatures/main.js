function cToF()
{ 
    num = document.getElementById('getTemperature').value;
    document.getElementById('result').innerHTML = (num * 9 / 5) + 32;
    num = Number(num);
}

function fToC()
{
    num = document.getElementById('getTemperature').value;
    document.getElementById('result').innerHTML = 5 / 9 * (num - 32);
    num = Number(num);
}
