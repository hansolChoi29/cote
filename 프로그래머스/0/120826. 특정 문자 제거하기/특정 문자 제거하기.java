class Solution {
    public String solution(String my_string, String letter) {
        //빈 문자열 ""로 바꾼다는 것은 해당 문자를 삭제한다는 의미
        return my_string.replace(letter,"");
    }
}