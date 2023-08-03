import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        String answer = "";
        String reverse = "";
        Stack<String> st = new Stack<String>();
        String[] arrs = s.split("");
        for(int i=0;i<arrs.length;i++){
            st.push(arrs[i]);
        }
        System.out.println(st);
        
        int count = 0;
        int size = st.size();
        
        for(int i=0;i<size;i++){
	          if(st.peek().equals("*")) {
	        	  st.pop();
	        	  count++;
	          }else {
	        	  if(count != 0) {
	        		  st.pop();
	        		  count--;
	        	  }else {
	        		  reverse += st.pop();
	        	  }
	          }
        }
        for(int i=reverse.length()-1;i>=0;i--) {
        	answer += reverse.charAt(i);
        }
        return answer;
    }
}