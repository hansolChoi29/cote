import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String 등급 = N >= 90 ? "A" : N >= 80 ? "B" : N >= 70 ? "C" : N >=  60 ? "D" : "F";
        System.out.println(등급);

    }
}