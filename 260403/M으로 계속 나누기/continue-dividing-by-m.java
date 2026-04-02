import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Please write your code here.
        // 현재 N 출력
        // N을 M으로 나눈 몫 - 소수점 아래 버림 + N 갱신
        int num = N;

        while(num>0){

            System.out.println(num);
            num /= M;
        }
    }
}
