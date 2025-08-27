class Solution {
    public int[] solution(int[] array) {
        //가장 큰 수 비교해서 자릿수와 함께
        // 자리는 0부터 카운트
         int index = 0;
        // 큰 수는 0위치부터 비교해서 넣을 공간
        int max = array[0];
       for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  
                index = i;    
            }
       }

        // 결과 배열 [최댓값, 인덱스] 리턴
        return new int[]{max, index};
    }
}