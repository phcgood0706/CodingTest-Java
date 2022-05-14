package co.kr.ezenac.array.test10818;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
5
20 10 35 30 7

 */
public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));



        // 입력,
        int N = Integer.parseInt(r.readLine());
        // 입력값을 배열에 저장 왜냐하면 그 만큼 값을 저장하고 그 값들마다 비교하여 최대값 최소값 구하기
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(r.readLine());

        for(int i=0; i<A.length; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        System.out.println(A[0]+" "+A[N-1]);

        r.close();

    }
}