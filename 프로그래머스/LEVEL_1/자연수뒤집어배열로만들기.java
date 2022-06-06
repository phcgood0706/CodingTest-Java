package co.kr.프로그래머스.LEVEL_1;

public class 자연수뒤집어배열로만들기 {
	
	class Solution {
	    public int[] solution(long n) {
	        String st = String.valueOf(n);  
	        // 문자열 타입 변환
	        
	        StringBuilder sb = new StringBuilder(st);
	       
	        sb = sb.reverse();
	        //문자열 뒤집기 
	        
	        String[] arr = sb.toString().split("");
	        //문자열 쪼개서 배열에 넣기
	        
	        int[] ia = new int[st.length()];
	        
	        
	        for(int i=0; i<st.length(); i++ ) {
	            ia[i] = Integer.parseInt(arr[i]);
	        }
	        
	        return ia;
	    }
	}

}
