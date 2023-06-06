function mirror_bits(n) {
    let t = n.toString(2).split("");
    let str_len = t.length;
    for (let i = 0; i < 8 - str_len; i++){
        t.unshift("0");
    }
    return parseInt(t.reverse().join(""), 2);
}
console.log(mirror_bits(14))