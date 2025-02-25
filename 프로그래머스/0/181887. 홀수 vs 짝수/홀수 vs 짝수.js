function solution(num_list) {
    const 짝수 =[]
    const 홀수 =[]
   num_list.map((num,i)=>i%2===0?홀수.push(num):짝수.push(num))
    const 짝수합 = 짝수.reduce((acc,cur)=>acc+cur)
    const 홀수합 =홀수.reduce((acc,cur)=>acc+cur)
    
    return Math.max(짝수합,홀수합)
}
//  누적 더하기 reducer((acc, cur)=>acc+cur)
// num_list.map((num, i)=>{i%2===0? 홀수.push(num)?:짝수.push(num)})
// const 홀수.reducer((acc, cur)=>acc+cur)
// const 짝수.reducer((acc, cur)=>acc+cur)