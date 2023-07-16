class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = 0;
        if(num_list.length % n == 0) {
            length = num_list.length / n;
        }else{
            length = num_list.length / n + 1;
        }
        
        int[] answer = new int[length];
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[i*n];
        }
        return answer;
    }
}