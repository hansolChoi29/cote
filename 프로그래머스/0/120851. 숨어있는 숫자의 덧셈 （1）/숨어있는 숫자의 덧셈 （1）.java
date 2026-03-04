class Solution {
    public int solution(String my_string) {
        int num = 0;
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                num += c - '0';
            }
        }
            return num;
    }
}