package co.kr.프로그래머스.LEVEL_1;
class Solution {
    public int[] solution(long n) {
        String st = String.valueOf(n);
        
        StringBuilder sb = new StringBuilder(st);
        
        sb = sb.reverse();
        
        String[] arr = sb.toString().split("");
        
        int[] ia = new int[st.length()];
        
        for(int i=0; i<st.length(); i++ ) {
            ia[i] = Integer.parseInt(arr[i]);
        }
        
        return ia;
    }
}