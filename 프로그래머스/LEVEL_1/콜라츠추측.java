package co.kr.프로그래머스.LEVEL_1;

// Solution
public class 콜라츠추측 {
	public int solution(int num) {
		
		long n = num; //범위값 예방
		int cnt = 0; // 몇번 작업이 되었는가(횟수)
		
		while(n!=1) { // n 값이 1일 때 빠져나가기
			if(n%2 == 0) { // n 값이 짝수일 때
				n /=2;
			}else { // n 값이 홀수일 때
				n =(3*n)+1;
			} //둘다 계산되는 값을 계속 n에 넣어서 1이 될때까지 작업을 진행한다. 
			
			cnt++; // 횟수 세기
			if(cnt==500) { //만약 500번 횟수가 되었을때 -1 값을 반환해주고 break 끝내기 
				cnt = -1;
				break;
			}
		}
		
		return cnt;  // 횟수 값 반환
		
	}
}
