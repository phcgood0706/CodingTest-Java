package co.kr.프로그래머스.LEVEL_1;

public class 자릿수더하기 {
	
	public class Solution {
	    public long solution(long n) {
	        long answer = 0;

	        while(n!=0){ 
	            answer += n%10; //일의자리 수를 계속 answer에 넣기
	            n = n/10; //나눈 몫값이 0이 될때까지 진행 
	            //왜냐하면 예를들어 범위가 100,000 수 일 경우 계속해서 반복적으로 일의자리수를 나머지 계산으로
	            // answer 에 더해주고 10으로 나누면 10,000 이 된다. 나머지가 빠진 몫값을 다시 반복하면 
	            // 마지막에 0이 되어 모든 각 자릿수를 더 할 수 있다. 
	        }

	        return answer;
	    }
	}

}
