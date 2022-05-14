package co.kr.프로그래머스.LEVEL_1;

//Solution

public class 핸드폰번호가리기 {

	public String solution(String phone_number) {

		// 핸드폰,전화기 등 숫자크기가 다르므로 substring을 활용하여 뒤 4자리 끝어줍니다.
		String N = phone_number.substring(phone_number.length() - 4, phone_number.length());

		// 문자열 별의 크기를 담을 횟수를 int 변수 선언합니다.
		int S = phone_number.length() - 4;

		// 문자열 별을 받을 String 변수 선언합니다.
		String star = "";

		// 반복문을 통해 별을 계속 넣어줍니다.
		for (int i = 0; i < S; i++) {
			star += "*";
		}

		// 지역변수 star를 A에 선언하여 리턴해줍니다.
		String A = star;

		return A + N;
	}
}
