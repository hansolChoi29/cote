class Solution {
    public int solution(int[] num_list) {
        String 홀수담을문자열 = "";
        String 짝수담을문자열 = "";
        for(int num : num_list){
            if(num % 2 == 0){
                짝수담을문자열 += num;
            }else{
                홀수담을문자열 += num;
            }
        }
        return Integer.parseInt(홀수담을문자열) + Integer.parseInt(짝수담을문자열);
    }
}