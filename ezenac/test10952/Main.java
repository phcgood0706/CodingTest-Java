package co.kr.ezenac.test10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		//입력 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 한줄 입력란에 공백  띄어쓰기하면 여러개 String값으로 분리됨
		StringTokenizer st ;
		// 값들을 저장하는 공간 
		StringBuilder sb = new StringBuilder();
		
		//진실이면 나가라 if문에서 
		while(true) {
			
			st= new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {
				br.close();
				break;
			}
			//무한 반복 중 한턴 끝날때마다 값 저장 후 대기 
			sb.append(A+B).append("\n");
		}
		//마지막 0이 되었을 때 대기했던 저장값을 전부 출력 
		System.out.println(sb);
		
	}

}