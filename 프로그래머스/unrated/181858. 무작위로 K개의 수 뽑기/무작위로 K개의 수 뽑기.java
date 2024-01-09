import java.util.Arrays;
import java.util.*;


class Solution {
    public Integer[] solution(int[] arr, int k) {
        Integer[] answer = new Integer[k];
        int count = 0;
        for(int i=0;i<answer.length;i++){
            answer[i] = -1;
        }
        
        List<Integer> intList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            intList.add(arr[i]);
        }
        
        for(Integer i : intList) {
            if(!intList.contains(answer[count])){
                List<Integer> answerList = Arrays.asList(answer);
                if(answerList.contains(i)){
                    continue;
                }
                answer[count] = i;
                count++;
            }
            if(count >= k){
                break;
            }
        }
        return answer;
    }
}