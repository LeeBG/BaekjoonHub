class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int length = my_string.length();
        for(int i=length-n;i<length;i++){
            sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}