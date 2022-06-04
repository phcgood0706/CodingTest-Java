package co.kr.test;

import java.util.Arrays;

public class testt {

	public static void main(String[] args) {
		String[] arr = String.valueOf(51287234).split("");
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++ ) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb.toString());
		System.out.println(Arrays.toString(arr));
	}
}
