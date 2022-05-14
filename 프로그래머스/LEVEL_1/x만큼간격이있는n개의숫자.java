package co.kr.프로그래머스.LEVEL_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//Solution
public class x만큼간격이있는n개의숫자 {

	public long[] solution(long x, int n) {

		// 출력 값을 for문으로 배열에 담아준다.
		long[] a = new long[n];

		for (int i = 1; i < n + 1; i++) {

			a[i - 1] = x * i;
		}

		return a;
	}

}
