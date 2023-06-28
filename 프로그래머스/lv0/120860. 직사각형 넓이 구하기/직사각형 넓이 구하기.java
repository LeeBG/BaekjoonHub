
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        
        for(int i=0;i<dots.length;i++){
            if(dots[i][0] != x) w = Math.abs(x-dots[i][0]);
            if(dots[i][1] != y) h = Math.abs(y-dots[i][1]); 
        }
        
        answer = w * h;
        
        return answer;
    }
}