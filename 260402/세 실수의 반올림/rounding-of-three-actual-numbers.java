import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Please write your code here.
        // 3개 입력 받고 반올림하여 셋째 자리까지 출력
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        String result1 = String.format("%.3f", a);
        System.out.println(result1); 
        
        double b = sc.nextDouble();
        String result2 = String.format("%.3f", b);
        System.out.println(result2);

        double c = sc.nextDouble();
        String result3 = String.format("%.3f", c);
        System.out.println(result3);
    }
}