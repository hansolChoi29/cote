class Solution {
    public int solution(String t, String p) {
        // 추출:substring(start, end-1)
        
        
        
        int answer = 0;
        // p를 숫자로 변환하여 비교할 기준 값을 설정
        // p를 long 타입으로 변환
        //만약 int를 사용한다면 18자리 이상의 숫자가 들어올 경우
        // int 타입의 범위를 초과하게 되어 오류가 발생하거나 잘못된 결과를 도출
        long pNum = Long.parseLong(p);
        
        // t에서 p의 길이만큼 자르면서 비교
        for (int i = 0; i <= t.length() - p.length(); i++) {
            // 부분 문자열을 뽑아서 숫자로 변환
            long tNum = Long.parseLong(t.substring(i, i + p.length()));
            
            // 부분 문자열이 p보다 작거나 같으면 카운트
            if (tNum <= pNum) {
                answer++;
            }
        }
         return answer;
    }
}