import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // numbers의 원소 중 두 개를 곱하여 만들 수 있는
        // 최대값
        Arrays.sort(numbers); 
        
        int 왼쪽두개곱 = numbers[0] * numbers[1];
        int 오른쪽두개곱 = 
            numbers[numbers.length - 1]
            * numbers[numbers.length -  2];

        return Math.max(왼쪽두개곱, 오른쪽두개곱);
    }
}