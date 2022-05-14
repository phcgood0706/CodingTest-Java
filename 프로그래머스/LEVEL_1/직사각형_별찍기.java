package co.kr.프로그래머스.LEVEL_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//Solution
public class 직사각형_별찍기 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//공백 나누기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		br.close();
		
		// int 변수 변환  ,   nextToken() 공백으로 각각 나누어진 값을 순서대로 변수로 받아 넣어줍니다.
		int n = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<m ; i++) {
			for(int j=0 ; j<n ; j++) {
				wr.write("*");
			}
			wr.newLine();
		}
		
		wr.close();
		
	}

}
