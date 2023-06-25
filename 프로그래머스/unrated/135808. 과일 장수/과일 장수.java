import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] score2 = new int[score.length]; 
        int length = score.length;
        
        Arrays.sort(score);// 내림차순

        // 역순
        for(int i=0;i<score2.length;i++) {
        	score2[i] = score[length-i-1];
        }
        
        int total = score2.length/m; // 팔 수 있는 상자 갯수
        int min = 0;
        for(int i=0;i < total;i++) {	// 상자의 갯수
        	min = score2[(m*(i+1))-1];
        	answer += min*m;
        }
        return answer;
    }
}