const fs = require('fs'); 
const [n, ...arr] = fs.readFileSync(__dirname + "/example.txt").toString().trim().split(/\s/);
// const [n, ...arr] = fs.readFileSync("/dev/stdin").toString().trim().split(/\s/);

const setSort = [...new Set([...arr].sort((a, b) => a - b))]
const obj = {};
setSort.forEach((k, i)=> obj[k]=i)
const result = arr.map(v=> obj[v])
console.log(result.join(" "))

/* 시간 초과
const setSort = [...new Set([...arr].sort((a, b) => a - b))]
const result = arr.map(v=>setSort.indexOf(v))
console.log(result.join(" "))
*/