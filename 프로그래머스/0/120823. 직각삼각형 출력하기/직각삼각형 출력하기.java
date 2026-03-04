import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 즉 n은 밑단, n=-2; n<=n; n++;
       // 줄 수, 그 줄에 * 몇 개
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int n = 1; n <=num; n++){
            for(int i = 1; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}