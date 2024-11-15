function solution(s) {
     let answer = '';
    if(s.length%2===0){
        answer=s[s.length/2-1]+s[s.length/2]
    }else{
        answer=s[Math.floor(s.length/2)]
     }
     return answer
 }

// 길이만큼 2로 나눠서 0이면 answer에 

// function solution(s){
//     if(s.length%2===0){
//         answer=s[s.length/2-1]+s[s.length/2]
//     }else{
//         answer=s[Math.floor(s.length/2)]
//     }
//     return answer
// }

// function solution(s){
//     return substr
// }

//길이만큼 2로 나눠서 절사-1, 길이만큼2로 나눈 배열 두 개 나열.
//substr(Math.ceil)


// function solution(s) {
//     return s.substr(Math.ceil(s.length / 2) - 1, s.length % 2 === 0 ? 2 : 1);
// }



//substr로 뽑아낼 수 있음 길이만큼 나눠서 /2-1 절사, 길이만큼 2로 나눈 거 두개 
//Math.ceil로 절사하기 
// function solution(s){
//     return s.substr(Math.ceil(s.length/2)-1, s.length%2===0? 2:1);
// }

// function solution(s){
//     return s.substr(Math.ceil(s.length/2)-1,s.length%2===0? 2:1) 
// }


// function solution(s){
//     return s.substr(Math.ceil(s.length/2)-1,s.length%2===0?2:1)
// }


// function solution(s){
//     return s.substr(Math.ceil(s.length/2)-1,s.length%2===0?2:1)
// }

// function solution(s){
//     result=''
//     if(s.length%2===0){
//         result=s[s.length/2-1]+ s[s.length/2]
//     }else{
//         result=s[Math.floor(s.length/2)]
//     }
//     return result;
// }


// function solution(s){
//     result=''
//     if(s.length%2===0){
//         result=s[s.length/2-1]+s[s.length/2]
//     }else{
//         result=s[Math.floor(s.length/2)]
//     }
//     return result;
// }

// function solution(s){
//     return s.substr(Math.ceil(s.length/2)-1,s.length%2===0? 2:1)
// }



// function solution(s){
//     return s.substr(Math.ceil(s.length/2)-1,s.length%2===0?2:1)
// }


// function solution(s){
//     return s.substr(Math.ceil(s.length/2)-1,s.length%2===0?2:1)
// }



function solution(s){
    return s.substr(Math.ceil(s.length/2)-1,s.length%2===0 ?2:1)
}