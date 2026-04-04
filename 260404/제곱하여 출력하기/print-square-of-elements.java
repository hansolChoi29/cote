import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] 정수배열 = new int[N];

        for(int i = 0; i < 정수배열.length; i++){
            정수배열[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 정수배열.length; i++){
            System.out.printf("%d ", 정수배열[i] * 정수배열[i]);
        }
    }
}