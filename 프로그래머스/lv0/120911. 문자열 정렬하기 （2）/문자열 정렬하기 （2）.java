import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] sorted = my_string.split("");
        Arrays.sort(sorted);
        for(String s : sorted){
            answer+=s;
        }
        return answer;
    }
}