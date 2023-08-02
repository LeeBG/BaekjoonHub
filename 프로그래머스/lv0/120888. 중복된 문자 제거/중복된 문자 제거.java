import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] elements = my_string.split("");
        Set<String> eset = new HashSet();
        for(String s : elements){
        	if(!eset.contains(s)) {
        		eset.add(s);
        		answer += s;
        	}
        }
        return answer;
    }
}
