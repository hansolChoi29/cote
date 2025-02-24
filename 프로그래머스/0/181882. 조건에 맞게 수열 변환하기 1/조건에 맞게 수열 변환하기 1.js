function solution(arr) {
   return arr.map((a) => {
      return (a >= 50 && a % 2 === 0) ? Math.floor(a / 2) : (a < 50 && a % 2 === 1) ? a * 2 : a;
   });
}


// arr원소=a >=50 &&짝수(%2===0)? /2
// arr원소 <50  홀수(%2!==0)? *2