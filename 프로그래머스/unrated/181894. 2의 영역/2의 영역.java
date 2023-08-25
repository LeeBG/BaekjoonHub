class Solution {
    public int[] solution(int[] arr) {
        int startindex = -1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 2){
                startindex = i;
                break;
            }
        }
        
        int endindex = startindex;
        
        for(int i=arr.length-1;i>startindex;i--){
            if(arr[i] == 2){
                endindex = i;
                break;
            }
        }
        
        int[] answer = new int[endindex-startindex+1];
        int index = 0;
        
        
       if(endindex!=-1 &&endindex == startindex) {
    	   answer[0] = 2;
       }else if(endindex ==-1) {
    	   answer[0] = -1;
       }else {
    	   for(int i=0;i<answer.length;i++){
               answer[i] = arr[i+startindex];
           }
       }
              
        return answer;
    }
}