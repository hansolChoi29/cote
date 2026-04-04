import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        // 문자 10개 저장 배열 선언
        // 문자들을 역순으로 출력하자
       char[] 문자배열 = new char[10];
       for(int i = 0; i < 10; i++){
        문자배열[i] = sc.next().charAt(0);
       }
        for(int i = 9; i > -1; i--){
            System.out.printf("%c", 문자배열[i]);
        }
    }
}