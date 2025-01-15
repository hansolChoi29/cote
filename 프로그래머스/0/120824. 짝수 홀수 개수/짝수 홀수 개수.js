function solution(num_list) {
    let s=0 //짝수
    let n=0 //홀수
   num_list.forEach(num=>num%2===0? s++:n++)
    return [s, n]
    
}

// 정수가 담긴 리스트 num_list
//[0]=> 짝수 개수
//[1]=> 홀수 개수
//num_list[i]%2===0? 짝수(s)++:홀수(n)++