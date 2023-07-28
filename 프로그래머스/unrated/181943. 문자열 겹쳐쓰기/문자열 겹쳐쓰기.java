class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int index = 0;
        for(int i=0;i<my_string.length();i++) {
        	if(i >= s && i < s+overwrite_string.length()) {
        		answer+=overwrite_string.charAt(index);
        		index++;
        	}else {
        		answer += my_string.charAt(i);
        	}
        	
        }
        System.out.println(answer);
        return answer;
    }
}
