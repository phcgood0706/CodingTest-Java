package co.kr.프로그래머스.LEVEL_1;

//Solution
public class 하샤드수 {

	public static boolean solution(int x) {

		
		int sum = 0;//자릿수 합
		int A = 0;// 변수
		int result = x;//x 변수
		while (x != 0) { // 0. while문 괄호가 거짓일때 반복문이 끝난다. 0이면 빠져나온다.
			A = x / 10;  // 1. 10으로 나누어 일의자리를 없앤다(ex = 123이면 12가 된다.)
			int units = x % 10; // 2. 10으로 나누고 나머지 값(일의자리)을 units 변수에 넣는다.
			sum += units; // 3. 자릿수 합 변수에 0이 될때까지 반복되면서 변경되는 units 값을 더해준다.
			x = A; // 4. 12가 된 A 값을 x에 넣어 조건식을 진행한다. 
		} // 5. 계속 반복하여 일의자리 수를 만들어서 sum 변수에 계속 더해준다.

		if ((result % sum) == 0) { // x 값을 sum으로 나누어 0이되면 true(햐사드수) 아니면 false
			return true;
		} else {
			return false;
		}

	}

}
