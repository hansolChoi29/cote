class Solution {
    public int solution(int n) {
      int sum = 0;
        
       //String.valueOf(n)=> 1234를"1234"로 변환하여
        //toCharArray(): String객체를 char 타입의 배열로 변환
        for (char c : String.valueOf(n).toCharArray()) {
            sum += c - '0';  // -0해줌으로써 정수로
        }
        
        return sum;
    }
}