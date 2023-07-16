import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Set<Character> skipset = new HashSet<Character>();
        for(int i=0;i<skip.length();i++) {
        	skipset.add(skip.charAt(i));
        }
        
        for(int i=0;i<s.length();i++) {
        	char c = s.charAt(i);
        	for(int j=0;j<index;j++) {
        		c = (char)(c+1);
        		if(c > 'z') {
    				c = 'a';
    			}
        		for(Character cset : skipset) {	
        			if(c == cset) {
        				j -= 1;
        				break;
        			}
        		}
        	}
        	sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}