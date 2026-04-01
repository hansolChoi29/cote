import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 실수 N, 소수점 둘째자리까지 반올림 출력
         Scanner sc = new Scanner(System.in);
         double N = sc.nextDouble();
         String result = String.format("%.2f", N);
         System.out.println(result);
    }
}