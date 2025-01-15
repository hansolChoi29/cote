function solution(sides) {
    sides=sides.sort((a,b)=>a-b)
    return sides[0]+sides[1]>sides[2]?1:2
}

// 삼각형 가장 긴 변의 길이<다른 변의 길이 ? 1:2
// sides=각 세 변의 길이
// sides[0], sides[1], sides[2]
// 정렬해서 가장 긴 거, 뒤로 앞으로 가져오기sort((a,b)=>a-b)