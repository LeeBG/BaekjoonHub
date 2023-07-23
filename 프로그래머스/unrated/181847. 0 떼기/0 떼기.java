class Solution {
    public String solution(String n_str) {
        String answer = n_str;
        while(answer.charAt(0) == '0'){
            answer = answer.replaceFirst("0","");
        }
        return answer;
    }
}