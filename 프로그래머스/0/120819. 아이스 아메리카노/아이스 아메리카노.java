class Solution {
    public int[] solution(int money) {
        int num=money/5500;
        int change=money%5500;
        
        return new int[]{num, change};
    }
}
// 머쓱타드.
// 아아 한잔에 5500원 되게 비쌈.
//money: 머쓱타드의 소지금액
//최대로 마실 수 있는 아아 개수와 
// 돈을 순서대로 담은 배열? 뭔소리임<= 잔돈 얼마임
// result=money%5500 (잔돈)
//     num=money/5500 (가능한 잔 개수)
//위 두 개 배열로 담기.
    
