import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        LinkedList<Character> list = new LinkedList<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '('){
                list.add(ch);
            }else{
                if(list.isEmpty()){
                    return false;
                }
                list.pollLast();
            }
        }
        
        return list.isEmpty();
    }
}