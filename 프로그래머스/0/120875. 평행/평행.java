import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        List<Double> doubleList = new ArrayList<>();
        // ab - cd
        // ac - bd
        // ad - bc
        int count = 0;
        // ab -cd
        int x1 = Math.abs(dots[0][0]-dots[1][0]);
        int y1 = Math.abs(dots[0][1]-dots[1][1]);
        int x2 = Math.abs(dots[2][0]-dots[3][0]);
        int y2 = Math.abs(dots[2][1]-dots[3][1]);

        // ac - bd
        int x3 = Math.abs(dots[0][0]-dots[2][0]);
        int y3 = Math.abs(dots[0][1]-dots[2][1]);
        int x4 = Math.abs(dots[1][0]-dots[3][0]);
        int y4 = Math.abs(dots[1][1]-dots[3][1]);

        // ad - bc
        int x5 = Math.abs(dots[0][0]-dots[3][0]);
        int y5 = Math.abs(dots[0][1]-dots[3][1]);
        int x6 = Math.abs(dots[1][0]-dots[2][0]);
        int y6 = Math.abs(dots[1][1]-dots[2][1]);


        double num1 = (double)y1/x1;
        double num2 = (double)y2/x2;
        double num3 = (double)y3/x3;
        double num4 = (double)y4/x4;
        double num5 = (double)y5/x5;
        double num6 = (double)y6/x6;

        if(num1 == num2 || num3 == num4 || num5 == num6){
            answer = 1;
        }

        return answer;
    }
}
