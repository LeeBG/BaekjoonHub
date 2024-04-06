import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arrs = s.split(" ");
        List<Integer> list = new ArrayList<>();
        
        for(String e : arrs) {
            list.add(Integer.parseInt(e));
        }
        
        list.sort((a,b) -> a-b);
        
        answer = list.get(0)+" "+list.get(list.size()-1);
        return answer;
    }
}