// 이 모듈은 사용자로부터 한 줄씩 입력을 받는 기능을 제공함
const readline = require('readline');

//readline 인터페이스를 생성, 사용자로부터 입력을 받고, 출력을 화면에 표시함
const rl = readline.createInterface({
    input: process.stdin, //사용자 입력을 받기 위해 stdin
    output: process.stdout  // 입력받은 내용을 출력하기 위해 stdout
});

let input = [];


rl.on('line', function (line) {
    //입력받은 한 줄을 공백 기준으로 나누어 배열에 저장함
    // 예: 'apple orange' -> ['apple', 'orange']
    input = line.split(' ');
}).on('close', function () {
    str1 = input[0];
    str2 = input[1];
    console.log(str1+str2)
});
