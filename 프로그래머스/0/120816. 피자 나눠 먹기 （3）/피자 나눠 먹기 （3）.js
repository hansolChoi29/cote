function solution(slice, n) {
    return n % slice === 0 ? n / slice : Math.floor(n / slice) + 1;
}

// 머쓱아 그만 먹자!!!!
// 2~10조각 가능
//Q.n분일 때 최소한 몇 판을 시켜야함?
// 10명%7판===0? 10명/7판: 절사
