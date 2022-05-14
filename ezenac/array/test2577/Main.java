package co.kr.ezenac.array.test2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())
				*Integer.parseInt(br.readLine());
	
		int[] A = new int[10];
		
		String st = String.valueOf(N);
		
		for(int i=0; i<st.length(); i++) {
			A[st.charAt(i)-48]++;
		}
		
		for(int v : A) {
			System.out.println(v);
		}
	}
}





























































