class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int i : arr){
            length+= i;
        }
        int index = 0;
        int count = 0;
        int[] answer = new int[length];
        
        for(int i=0;i<arr.length;i++){
            for(int j=index;j<answer.length;j++){
                answer[j] = arr[i];
                index++;
                count++;
                if(count == arr[i]){
                    count = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}