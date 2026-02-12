//Approach-3
let arr = [1, 2, 3, 4, 5]
let result = arr.map((num) => num * num);
console.log(result);



/*
//Approach-2
let arr = [1, 2, 3, 4, 5]
let result = arr.map(function(num) {
    return num * num;
});
console.log(result);
*/

/*
//Normal Approach
function findSquare(arr) {
    let newArr = [];
    for (let i = 0; i < arr.length; i++) {
        newArr[i] = arr[i] * arr[i];
    }
    return newArr;
}

let arr = [1, 2, 3, 4, 5]
let result = findSquare(arr);
console.log(result);
*/