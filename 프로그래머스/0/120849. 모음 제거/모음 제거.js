function solution(my_string) {
    return my_string.replace(/[aeiou]/g, '');
}
// function solution(my_string) {
//     const vowels = ['a', 'e', 'i', 'o', 'u'];
//     return my_string.split('').filter(char => !vowels.includes(char)).join('');
// }
// aeiou 모음
// my_string에서 모음 제거..아 이럴수가
//my_string [0]