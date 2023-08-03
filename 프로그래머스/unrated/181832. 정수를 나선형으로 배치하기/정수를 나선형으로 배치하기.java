class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int size = n;	// 그리는 한 변 사이즈
        int[][] arr = new int[size][size];

        int sign = 1; // 1부터 끝까지 증가하는 변수

        int right = -1;	// [0][-1]시작 
        int bottom = 0;
        int top = 1;

        for(int i=size; i>0; i--) {
        	//수평
            for(int j=0; j<size; j++) {
                right += top;
                answer[bottom][right] = sign;
                sign++;
            }

            size--;	// 5 4 3 2 1

            // 수직
            for(int j=0; j<size; j++) {
                bottom += top;
                answer[bottom][right] = sign;
                sign++;
            }            
            top = top * (-1);
        }
        return answer;
    }
}