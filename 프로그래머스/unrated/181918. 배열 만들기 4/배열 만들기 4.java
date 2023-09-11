import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stkList = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stkList.isEmpty()){
                stkList.push(arr[i]);
            }else{
                if(stkList.peek() < arr[i]){
                    stkList.push(arr[i]);
                }else{
                    stkList.pop();
                    i--;
                }
            }
        }
    
        int[] stk = new int[stkList.size()];
        for(int i=stk.length-1;i>=0;i--){
            stk[i] = stkList.pop();
        }
        
        return stk;
    }
}