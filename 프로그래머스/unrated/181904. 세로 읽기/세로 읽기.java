class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] test = my_string.split("");
        int count = 0;
        for(int i=c-1;i<test.length;i+=m){
            answer += test[i];
        }
        
        return answer;
    }
}