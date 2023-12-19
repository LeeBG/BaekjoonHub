class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] direction = {{0,-1},{0,1},{-1,0},{1,0}}; // 상하좌우
        
        String color = board[h][w];
        
        for(int i=0;i<direction.length;i++) {
            int mov_x = h + direction[i][0];
            int mov_y = w + direction[i][1];
            
            if((mov_x >= 0) && (mov_y >= 0)&& (mov_x < board.length) && (mov_y < board[0].length)){
                if(color.equals(board[h+direction[i][0]][w+direction[i][1]])) {
                    answer++;
                }    
            }
            
           
        }
        
        return answer;
    }
}