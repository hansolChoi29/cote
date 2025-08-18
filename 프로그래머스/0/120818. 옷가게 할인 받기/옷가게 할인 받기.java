class Solution {
    public int solution(int price) {
       // 머쓱이네 옷가게 10만원 이상 사면 5%
        // 30만원 10%
        // 50만원 20%
        
          return (price >= 500000) ? (int)(price * 0.8) :
               (price >= 300000) ? (int)(price * 0.9) :
               (price >= 100000) ? (int)(price * 0.95) :
               price;
    }
}