function solution(n, k) {
    return n*12000+k*2000-(Math.floor(n/10)*2000)
}

//양꼬치*12000+음료수*2000
//만약 n%10==0이면 k-1

//n*12000-(1*2000)