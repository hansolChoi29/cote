import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 성별과 나이 입력 받기
        // MAN 성인남자
        // WOMAN 성인 여자
        // BOY 미성년남자
        // GIRL 미성년여자
        Scanner sc = new Scanner(System.in);
        int 성별 = sc.nextInt(); // 남자 -> 0, 여자 -> 1
        int 나이 = sc.nextInt();
        String[] 성인 = {"MAN", "WOMAN"};
        String[] 미성년 = {"BOY", "GIRL"};
        System.out.println(나이 >= 19? 성인[성별] : 미성년[성별]);
    }
}