function solution(a, b) {
  let result = 0;
    for (let i in a) {
        result += a[i] * b[i]
    }
    return result
}

// 내적???? 아~


// 1*(-3)=-3
//2*(-1)=-2
//...
// result +=a[i]*b[i]