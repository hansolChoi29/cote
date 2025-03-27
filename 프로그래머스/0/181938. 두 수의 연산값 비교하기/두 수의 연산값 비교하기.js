function solution(a, b) {
    const aplusb=String(a)+String(b)
    const ab=2*a*b
    
    return aplusb>=ab? Number(aplusb): Number(ab)
}
    