class Solution {
    public int solution(int[] box, int n) {
         return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
//직육면체 모양의 상자 하나
// 이 상자에 정육면체 모양의주사위를 최대한 많이 채우고 싶다=>???
// 상자의 가로, 세로, 높이가 저장된 배열 box
// 주사위 모서리 길이 정수 n이 매개변수
// 상자에 들어갈 수 있는 주사위의 최대 개수. 아하

// 주사위
// 가로:box[0]/n
// 세로: box[1]/n
// 높이: box[2]/n
// 부피 *