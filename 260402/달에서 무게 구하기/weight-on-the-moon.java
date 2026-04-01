public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 추의 무게 저장 변수 
        int 추무게 = 13;
        double 달무게비율 = 0.165;
        // 추 무게와 달에서 중력비율 곱한 식과 결과 출력 소수점 여섯자리까지만 -> %.6f

        System.out.printf("%d * %f = %f", 추무게, 달무게비율, 추무게 * 달무게비율);
    }
}