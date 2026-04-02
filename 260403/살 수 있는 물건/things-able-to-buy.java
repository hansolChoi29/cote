import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int book = 3000;
        int mask = 1000;

        String 결과 = n >= book ? "book" : n == mask ? "mask" : "no";
        System.out.println(결과);
    }
}