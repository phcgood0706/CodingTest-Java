package co.kr.ezenac.test2439;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws  IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	//BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));	
	 
	  int N = Integer.parseInt(br.readLine());
	  
	 for(int i=1; i<=N; i++) {
		 
		 for(int j=1; j<=N-i; j++) {
			 System.out.print(" ");
		 }
		 for(int k=1; k<=i ;k++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	  
	  
	 
	  
	 // wr.flush();
	 // wr.close();
	  br.close();
	  
}

}
