import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();

        // 윤년인지 판단하는 프로그램
        //  Y % 4 == 0 ? 윤년 : 평년
        // 100으로 나누어 떨어져도 400으로 나누어 떨어지지 않는 해는 평년
        // 400의 배수이거나, 100의 배수아니면서 4의 배수
        boolean isLeap = (Y % 400 == 0) || (Y % 100 != 0 && Y % 4 ==0);
        System.out.println(isLeap ? "true":"false");
    }
}