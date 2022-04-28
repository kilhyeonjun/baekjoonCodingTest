const fs = require('fs'); 
const [n, ...arr] = fs.readFileSync(__dirname + "/example.txt").toString().trim().split(/\s/);
// const [n, ...arr] = fs.readFileSync(__dirname + "/dev/stdin").toString().trim().split(/\s/);

arr.sort((a, b) => a - b)
console.log(arr[0] * arr[n-1])