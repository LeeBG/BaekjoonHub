import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answerList = new ArrayList();
        for(int i=0;i<my_string.length();i++){
            answerList.add(my_string.substring(i));
        }
        answerList.sort(null);
        
        String answer[] = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}