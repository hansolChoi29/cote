const solution = (myString, pat) => 
myString.split("")
.map((items) => items === "A" ? "B" : "A")
.join("")
.includes(pat)? 1 : 0;

// myString, pat이 주어짐
// myString의 A -> B, B-> A 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1, 아니면 0
// 부분문자열?1:0