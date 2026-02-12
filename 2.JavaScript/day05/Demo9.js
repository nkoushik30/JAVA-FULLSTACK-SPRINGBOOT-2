//Approach-4
let arr = [1, 2, 3, 4, 5]
let result = arr.filter((num) => num % 2 == 0);
console.log(result);



/*
//Approach-3
let arr = [1, 2, 3, 4, 5]
let result = arr.filter(function(num) {
    return num % 2 == 0;
});
console.log(result);
*/

/*
//Approach-2
let arr = [1, 2, 3, 4, 5]
let result = arr.filter(function(num) {
    if (num % 2 == 0) {
        return num;
    }
});
console.log(result);

*/

/*
//Normal Approach
function findEven(arr) {
    let newArr = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            newArr.push(arr[i]);
        }
    }
    return newArr;
}

let arr = [1, 2, 3, 4, 5]
let result = findEven(arr);
console.log(result);
*/