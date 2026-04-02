import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int 합 = A + B;
        String 평균 = String.format("%.1f", 합 / 2.0);
        System.out.printf("%d %s", 합, 평균);
    }
}