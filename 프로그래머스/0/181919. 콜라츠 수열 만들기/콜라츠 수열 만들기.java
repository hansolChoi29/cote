//임포트까지 넣어줘야 함.
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
     ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);
        while (n != 1) { // n이 1이 아닌 동안
            if (n % 2 == 0) { // n이 짝수면
                n /= 2;
            } else { // n이 홀수면
                n = 3 * n + 1;
            }
            answer.add(n);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}


// 1이 될 때까지 반복문을 타는 거 : 콜라츠 문제
// x%2==0? x/2 :3*x+1 <= while
// 수열문제.
// resulte <1000|| n