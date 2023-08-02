class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = new int[query.length];
        int index = 0;
        for(int i : query){
            answer[index] = arr[i];
            index++;
        }
        return answer;
    }
}