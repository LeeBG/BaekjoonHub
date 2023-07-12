class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z|A-Z]","");
        String[] answers = my_string.split("");
        for(int i=0;i<answers.length;i++){
            answer+=Integer.parseInt(answers[i]);
        }
        return answer;
    }
}