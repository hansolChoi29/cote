class Solution {
    public String solution(int age) {
        String ageStr = String.valueOf(age);
        String result = "";
        for(char c : ageStr.toCharArray()){
            int digit = c-'0';
            result += (char) ('a' + digit);
        }
     return result;
    }
}