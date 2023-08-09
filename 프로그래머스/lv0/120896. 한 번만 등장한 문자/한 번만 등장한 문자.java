import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s) {
        String answer = "";
        Set<String> stringset = new HashSet<String>();
        for(String e :  s.split("")) {
        	stringset.add(e);
        }
        
        for(String e : stringset) {
        	if(s.length() - s.replace(e, "").length() == 1) {
        		answer+= e;
        	}
        }
       
        String[] test= answer.split("");
        answer = "";
        Arrays.sort(test);
        
        for(String e : test) {
        	answer += e;
        }
        
        return answer;
    }
}