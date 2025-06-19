function solution(n, bans) {
  const alpha = 'abcdefghijklmnopqrstuvwxyz';

  // 1) 문자열 → 숫자(1-based) 변환 헬퍼
  const strToIndex = s =>
    [...s].reduce((acc, c) => acc * 26 + (c.charCodeAt(0) - 96), 0);

  // 2) bans를 순서(숫자)대로 정렬
  bans.sort((a, b) => strToIndex(a) - strToIndex(b));

  // 3) 금지된 주문 인덱스가 n 이하라면 n을 뒤로 한 칸씩 밀어준다
  for (const b of bans) {
    const banIdx = strToIndex(b);
    if (banIdx <= n) n++;
    else break;         
  }

  // 4) 보정된 n을 26진법(알파벳)으로 변환
  let answer = '';
  while (n > 0) {
    n--;//0-based                
    answer = alpha[n % 26] + answer;
    n = Math.floor(n / 26);
  }

  return answer;
}

// ???뭔소리지
// 비밀주문서-> 알파벳 소문자 11글자 이하로 구성됨, 
// 마법효과 지니지 않는 의미없는 주문들-> 알파벳 소문자 11글자 이하
// 모든 문자열 고대 규칙
//1) 글자 수 적은 주문부터 기록
//2) 글자 수 같으면 사전 순서대로 기록


// 저주받은 주문이 숨겨있음-> 악용하려는 자 막아야 함
// 주문서 삭제; 삭제 완료된 주문서에는 n번째 주문을 찾아야 함-> 이게 뭔 소리지

//a,b,c 각각 123번째
// d,e삭제 4~24번째 주문은 f~z 엥?
// aa삭제됐으므로 25~27번째 주문은 ab,ac, ad
// ae 삭제 됐으므로 28~30번째 주문은 af, ag, ah
// 주문은 1부터 시작하며, 특정 규칙에 따라 26진수와 유사한 방식으로 생성


// 따라서 주어진 주문서에서 유효한 주문이 몇 개인지를 구하는 것이 문제의 핵심




