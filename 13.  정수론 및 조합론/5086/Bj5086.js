const fs = require('fs'); 
const arr = fs.readFileSync(__dirname + "/example.txt").toString().trim().split('\n');
// const arr = fs.readFileSync(__dirname + "/dev/stdin").toString().trim().split('\n');

arr.forEach((item)=>{
    if(item === '0 0') return;
    let temp = item.split(' ');
    if(temp[1] % temp[0] === 0) console.log('factor')
    else if(temp[0] % temp[1] === 0) console.log('multiple')
    else console.log('neither')
})