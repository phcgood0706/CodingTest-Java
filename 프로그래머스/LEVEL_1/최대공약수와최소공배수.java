package co.kr.프로그래머스.LEVEL_1;

public class 최대공약수와최소공배수 {
	
	class Solution { // 유클리드 호제법 
		public int[] solution(int n, int m) {
			int A = n; // 변수 
			int B = m;  // 변수 
			int G = 0; // 최대 공약수
			int L = 0; // 최소 공배수
			int[] result = new int[2];
			if (n > m) { // 유클리드 호제법 증명조건 (구글 검색 참고요망)
				while (m != 0) {
					int N = n % m; // 나눈나머지
					n = m;
					m = N;
					G = n;
				}
				L = (A * B) / G;

			} else {
				while (m != 0) {
					int N = n % m; // 나눈나머지
					n = m;
					m = N;
					G = n;
				}
				L = (A * B) / G;

			}
			result[0] = G;
			result[1] = L;

			return result;
		}
	}

}
