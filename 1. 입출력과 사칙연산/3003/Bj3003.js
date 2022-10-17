const fs = require('fs');
const arr = fs.readFileSync(__dirname + "/example.txt").toString().trim().split(" ").map(n => +n);
// const arr = fs.readFileSync(__dirname + "/dev/stdin").toString().trim().split(" ").map(n => +n);
const stdArr = [1, 1, 2, 2, 2, 8]

console.log(arr.map((n, i) => stdArr[i] - n).join(" "))