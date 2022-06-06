package co.kr.프로그래머스.LEVEL_1;

public class 이상한문자만들기 {
	
	class Solution {
	    public String solution(String s) {

	        String[] arr = s.split("");
	        //문자열 쪼개서 배열에 넣기
	        
	        
	        int index = 0; //공백마다 새롭게 초기화
	        String result =""; // 결과 값 
	        
	        for(int i=0; i<arr.length; i++){
	            
	            if (arr[i].equals(" ")) { // 공백이 있을 경우 초기화 // 공백마다 홀짝 여부를 따로 지정해서 변환 할 수 있다. 
	                index = 0;
	            }
	            else if(index%2 == 0 ){ // index가 0 혹은 짝수 일 경우 index 증가 / 그리고 다음 턴에 index가 홀수
	               index++; 
	               arr[i] = arr[i].toUpperCase(); //대문자 
	            } else if (index%2 != 0 ) { // index가 0이 아닌 홀수 일 경우 index 증가 / 그리고 다음 턴에 index가 짝수
	                index++; 
	                arr[i] = arr[i].toLowerCase(); // 소문자 
	            } 
	            
	            result += arr[i];
	        }
	        
	      return result;
	    }
	}

	

}
