class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        for(int i=n;i<num_list.length+n;i++){
            if(i<num_list.length)
                answer[index] = num_list[i];
            else
                answer[index] = num_list[i-num_list.length];
            index++;
        }
        return answer;
    }
}