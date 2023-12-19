class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int count = 0;
        int max = -1;
        for(int[] e : queries) {
            for(int i=e[0];i<=e[1];i++) {
                if(e[2] < arr[i] && max == -1) {
                    max = arr[i];
                }
                if(e[2] < arr[i] && max != -1) {
                    if(arr[i] < max){
                        max = arr[i];
                    }
                }
            }
            answer[count] = max;
            max = -1;
            count++;
        }
        
        return answer;
    }
}