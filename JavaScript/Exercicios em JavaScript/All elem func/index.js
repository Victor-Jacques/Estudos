const isEveryElem = (arr, fn) => {
    for (let i = 0; i < arr.length; i++){
        if (!fn(arr[i])) {
            return false;
        }
    }
    return true;
};

console.log(isEveryElem([1,2,3,4,5], (x) => x > 0));
console.log(isEveryElem([1,2,3,4,5], (x) => x > 3));

//Same way to do the exercise with another way

console.log([1,2,3,4,5].every (x => x > 0));
console.log([1,2,3,4,5].every (x => x > 3));