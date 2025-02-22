function solution (strArr) {
return strArr.map((str, i) => {
    if(i%2 ===0) {
        return str.toLowerCase()
    } else {
        return str.toUpperCase()
    }
})
}

// strArr 홀수번째? 대문자:소문자