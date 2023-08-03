import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> arrStack = new Stack<Integer>();
        
        for(int i=0;i<arr.length;i++) {
        	if(arrStack.isEmpty() || (!arrStack.isEmpty() && arr[i] != arrStack.peek())) {
        		arrStack.push(arr[i]);
        	}
        }
        
        int[] answer = new int[arrStack.size()];
        
        for(int i=answer.length-1;i>=0;i--) {
        	answer[i] = arrStack.pop();
        }

        return answer;
    }
}