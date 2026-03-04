class Solution {
    public String solution(
        String my_string, 
        int num1, 
        int num2
    ) {
        // 아래 처럼 되려면 자료형 변환이 필요해 보임
        char[] arr = my_string.toCharArray();
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        return new String(arr);
    }
}