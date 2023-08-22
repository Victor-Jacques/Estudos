function sla(num) {
    if (num >= 1){
        console.log("Contador em " + num)
        let novoNumero = --num;
        sla(novoNumero)
    }
    return num;
}

sla(10);