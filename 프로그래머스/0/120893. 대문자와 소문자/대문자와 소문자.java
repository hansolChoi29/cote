class Solution {
    public String solution(String my_string) {
        String answer = "";
        // toCharArray()해서 my_string을 배열로 만들어 하나 씩 꺼내고
        // 문자가 소문자인 경우 대문자로, 대문자인 경우 소문자로 변환
        // toUpperCase(), toLowerCase()
        for(char c : my_string.toCharArray()){
            answer += Character.isUpperCase(c)
                ? Character.toLowerCase(c)
                : Character.toUpperCase(c);
        }
        return answer;
    }
}