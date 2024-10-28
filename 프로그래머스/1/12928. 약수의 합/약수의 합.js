function solution(n) {
 let arr =[]
    for(i=1; i<=n; i++){
       if(n%i===0) {
           arr.push(i)
       }
   }
    return arr.reduce((acc,cur)=> acc+cur,0)
}


//약수. 몫을 누적 연산
// 12를 1로나누면 12, 
// 2로 나누면, 6,3,1, 
//3으로 나누면 4, 
//4로 나누면 3 
//...