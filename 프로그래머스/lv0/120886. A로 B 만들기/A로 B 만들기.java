import java.util.HashMap;
import java.util.Set;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        HashMap<String, Integer> beforemap = new HashMap<>();
        HashMap<String, Integer> aftermap = new HashMap<>();
        for(String s : before.split("")){
            if(beforemap.containsKey(s)){
                beforemap.put(s,beforemap.get(s)+1);
            }else{
                beforemap.put(s,1);
            }
        }
        
        for(String s : after.split("")){
            if(aftermap.containsKey(s)){
                aftermap.put(s,aftermap.get(s)+1);
            }else{
                aftermap.put(s,1);
            }
        }
        
        for(String s : beforemap.keySet()){
            if(beforemap.get(s)!=aftermap.get(s)){
                answer = 0;
                break;
            }
        }
   
        return answer;
    }
}