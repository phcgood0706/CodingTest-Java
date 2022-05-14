package co.kr.백준자바.if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 문제2525 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력값
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out)); //출력값
		
		
		//입력 시 띄어쓰기로 st.nextToken()로 나눌 수 있음. 
		StringTokenizer st = new StringTokenizer(br.readLine()); //입력 공간에 공백 개수 띄어쓰기
		
		int N = Integer.parseInt(br.readLine()); // 필요한 시간 변수
		
		br.close();
		
		int H = Integer.parseInt(st.nextToken()); // 시 변수
		
		int M = Integer.parseInt(st.nextToken()); // 분 변수 

		// 입력한 분과 필요한 시간 합이 60분 이상 일 때
		if((M+N)>=60) {

		  H += (M+N)/60;  // 60분으로 나눈 몫을 추가로 더해준다.
		  M = (M+N)%60;  // 60분으로  나눈 나머지를 분 값에 넣어준다.
		  
		// 입력한 시 가 23시 이상 일 때 
			if(H>23) {
				H = H-24;   // 한 사이클 24시간을 빼준다.
			}
			
		}else {
			M = (M+N);  // 60분 이하 일 때  필요한시간과 입력한 분을 더한다. 
		}
		
		

		
		wr.write(H +" "+M);
		
		wr.close();
	}

}
