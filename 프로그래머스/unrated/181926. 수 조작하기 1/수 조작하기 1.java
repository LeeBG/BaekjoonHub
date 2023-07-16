class Solution {
    public int solution(int n, String control) {
        int answer = n;
        int i = 0;
        while(control.length() != 0){
        	String first = control.substring(0,1);
            if(first.equals("w")) {
            	answer += 1;
            	i++;
            }else if(first.equals("s")) {
            	answer -= 1;
            	i++;
            }else if(first.equals("d")) {
            	answer += 10;
            }else {
            	answer -= 10;
            }
            control = control.replaceFirst(first, "");
        }
        
        return answer;
    }
}