//Approach-3
let arr = [1, 2, 3, 4, 5]
let result = arr.reduce((sum, num) => sum + num, 0);
console.log("Total: " + result);



/*
//Approach-2
let arr = [1, 2, 3, 4, 5]
let result = arr.reduce(function(sum, num) {
    return sum + num;
}, 0);
console.log("Total: " + result);

*/




/*
//Normal Approach
function findSum(arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

let arr = [1, 2, 3, 4, 5]
let result = findSum(arr);
console.log("Total: " + result);
*/

