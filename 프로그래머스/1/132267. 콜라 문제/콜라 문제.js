function solution(a, b, n) {
    let change = 0
    while(n >= a) {
        change += Math.floor(n/a)*b
        n = Math.floor(n/a)*b + n%a
    }
    return change
}

// 콜라 2개=> 1병 2+1
//20개면?? , 2 미만이면 받을 수 없음

// 빈병 a개 => b병 받음
// 소유중인 병 개수 n개
//(20/2)*1 +20%2
//
