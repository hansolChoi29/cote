import java.util.*; 

class Solution {
    public int[] solution(int n, int[] numlist) {
        // 새 배열리스트를 만들어서add후 return해주면 되는 구조.
        
        // 결과를 담을 리스트
        List<Integer> resultList = new ArrayList<>();

        // 반복문: n의 배수만 resultList에 추가
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                resultList.add(numlist[i]);
            }
        }
// 바로 resultList반환해주면 에러남.
        //다시 배열로 변환해주ㅓ여함.
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
