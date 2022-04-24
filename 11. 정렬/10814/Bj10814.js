const fs = require('fs'); 
const [n, ...arr] = fs.readFileSync(__dirname + "/example.txt").toString().trim().split('\n');
// const [n, ...arr] = fs.readFileSync("/dev/stdin").toString().trim().split('\n');

arr.sort((a, b)=> parseInt(a) - parseInt(b));

console.log(arr.join('\n'));

/* 10814 나이순 정렬 v2
arr.sort((a, b)=> a.split(' ')[0] - b.split(' ')[0]);

console.log(arr.join('\n'));
*/

/* 10814 나이순 정렬 v1
const result = Array.from(Array(Number(n)), () => Array(2).fill(null))

arr.map((v, i)=>{
    result[i][0] = Number(v.split(' ')[0])
    result[i][1] = v.split(' ')[1]
})

result.sort((a, b) => a[0] - b[0])

result.map((v)=>{console.log(v[0], v[1])})
*/