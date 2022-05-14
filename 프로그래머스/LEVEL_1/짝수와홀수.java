package co.kr.프로그래머스.LEVEL_1;

public class 짝수와홀수 {
    public String solution(int num) {
        
        if((num%2)==0){ //2로 나눈 나머지가 없을 경우 짝수 
            return "Even";
        }else{
            return "Odd"; //나머지는 홀수 
        }
    }
}

