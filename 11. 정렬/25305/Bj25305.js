const fs = require('fs');
const [n, k, ...arr] = fs.readFileSync(__dirname + "/example.txt").toString().trim().split(/\s/);
// const [n, k, ...arr] = fs.readFileSync(__dirname + "/dev/stdin").toString().trim().split(/\s/);

console.log(arr.map(n => +n).sort((a, b) => b - a)[k - 1])