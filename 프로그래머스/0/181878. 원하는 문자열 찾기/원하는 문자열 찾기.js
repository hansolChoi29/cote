function solution(myString, pat) {
    const items = pat.toLowerCase()
    return myString.toLowerCase().includes(items) ? 1 : 0
}
// 대소문자 구분없으면 차라리 하나도 통일해서 1:0