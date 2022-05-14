package co.kr.ezenac.test4673;
/*
	n+a+b = d(n)
			
	n/10 = a  
	n%10 = b
	n= 생성자
	셀프넘버=생성자가 없는 숫자
	10000 보다 작거나 같은 셀프 넘버를 한줄에 하나씩 출력 하는 프로그램 함수 
	셀프넘버가아닌수를 찾아서 불리언배열에 true로 넣어주고 나중에 false문이 셀프넘버이니 호출해준다. 
	*/

public class Main {
	
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];  
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n<10001) {
				check[n] =true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	
	}
	
	public static int d(int number) {//함수  ex) 123이 들어왔다.
		int sum = number;
		
		while(!(number==0)) {
			sum = sum + (number%10);
			number = number/10;
		}
		return sum;
		
	}

}
