function solution(strings, n) {
    let result=[];
    for (let i=0; i< strings.length; i++) {
      strings[i] = strings[i][n] + strings[i];
    }
    strings.sort();
    for(let i= 0; i< strings.length; i++) {
      strings[i]= strings[i].replace(strings[i][0],"");
      result.push(strings[i]);
    }
    return result;
}