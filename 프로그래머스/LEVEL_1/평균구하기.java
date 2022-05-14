package co.kr.프로그래머스.LEVEL_1;
//Solution
class  평균구하기 {
    public double solution(int[] arr) {
    	//총합 변수
        double sum = 0;
        
        // 반복문을 통해 배열의 크기를 모르는 각 수를 sum에 계속 더해준다.
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        // 평균 변수를 구한다.(소수점이 나올 수 있으므로 double 변수)
        double avg = sum/arr.length;
        
    
        return avg;
    }
}
