class Solution {
    public String solution(String my_string, int[] index_list) {
         String str = "";
        // charAt():  String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
        for(int i=0; i<index_list.length; i++){
            str += my_string.charAt(index_list[i]);
        }
        
        return str;
    }
}