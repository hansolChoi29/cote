function solution(num_list) {
    const 합제곱=num_list.reduce((acc,cur)=>acc+cur ,0)
    const 곱=num_list.reduce((acc, cur)=>acc*cur,1)
    return 곱<합제곱*합제곱?1:0
}
// 모든 원소들의 곱이 <
// 모든 원소들의 합의 제곱 ?1:0