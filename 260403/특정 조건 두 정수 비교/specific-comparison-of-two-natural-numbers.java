import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt(); 
        int 첫번째결과 = A < B ? 1 : 0;
        int 두번째결과 = A == B ? 1 : 0; 
        System.out.println(첫번째결과 + " " + 두번째결과);
    }
}