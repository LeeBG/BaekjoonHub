class Solution {
    public int[][] solution(int[][] arr) {

        int maxY=0, maxX=0;
        int max = 0;
        maxY=arr.length;
        
        for(int i=0;i<arr.length;i++){
            if(maxX < arr[i].length){
                maxX = arr[i].length;
            }
        }
        
        if(maxY < maxX){
            max = maxX;
        }else{
            max = maxY;
        }
        
        int[][] answer = new int[max][max];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}