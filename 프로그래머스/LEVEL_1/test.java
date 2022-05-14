package co.kr.프로그래머스.LEVEL_1;

import java.io.*;

import java.util.*;


public class test {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		
		String B = st.nextToken();
		
		boolean Check = true;
		
		Set<String> h = new HashSet<String>();
		
		String[] C = A.split("");
		String[] D = B.split("");
		
		
		for(int i=0; i<C.length; i++) {
			h.add(C[i]);
		}
		
		
			for(int k=0; k<D.length; k++) {
				if(h.contains(D[k])==false) {
					Check = false;
					break;
				}else {
					continue;
				}
			}
			
			System.out.println(Check);
			
		
		
	}

}
