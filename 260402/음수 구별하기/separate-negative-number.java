import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int 과연음수일까정수일까 = sc.nextInt();
        System.out.println(과연음수일까정수일까);
        if(과연음수일까정수일까 < 0){
            System.out.println("minus");
        }
    }

}