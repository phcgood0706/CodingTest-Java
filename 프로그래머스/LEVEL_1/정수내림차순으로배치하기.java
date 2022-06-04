package co.kr.프로그래머스.LEVEL_1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

	class Solution {
	    public long solution(long n) {
	        
	        String[] arr = String.valueOf(n).split("");
	        //valueOf 로 문자열로 변환하면서 동시에 split으로 ""각각 쪼개서 배열에 넣기
	        
	        Arrays.sort(arr,Collections.reverseOrder());
	        //내림차순으로 
	        
	        StringBuilder st = new StringBuilder();
	        //문자열 연결하기위해
	        
	        for(int i=0;i<arr.length;i++){
	            st.append(arr[i]);
	        } //반복문으로 append 기능으로 문자열 연결하기 

	        
	        
	        return Long.parseLong(st.toString()) ;
	    }
	}
}
