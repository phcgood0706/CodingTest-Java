package co.kr.프로그래머스.LEVEL_1;

import java.util.Arrays;

public class 제일작은수제거하기 {

	class Solution {
		public int[] solution(int[] arr) throws Exception{
			int[] Narr = new int[arr.length-1]; // 새로운 배열에 원하는 배열 값 넣기 
            
			if(arr[arr.length-1] == 0 || arr == null || arr.length <=1 ) { // -1 리턴 값 조건식
			int[] Tarr = new int[1];
				Tarr[0] = -1;
				return Tarr;
			} else {
                			
			
			for (int i = 0 ; i<arr.length-1 ; i++ ) { // 배열 마지막 수 제외하고 Narr 배열에 담기 
				Narr[i] = arr[i];
			}
			
			return Narr;
                
            }
			
        
		}
}
}
