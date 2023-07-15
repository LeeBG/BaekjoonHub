class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int index = 0;
        for(int i=answer.length-1;i>=0;i--){
            answer[index] = end - i;
            index++;
        }
        return answer;
    }
}