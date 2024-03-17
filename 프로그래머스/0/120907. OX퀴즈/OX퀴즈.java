class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;
        for(String q : quiz){
            String[] element = q.split(" ");
            int quizAnswer = Integer.parseInt(element[4]);
            if(element[1].equals("+")){
                if(Integer.parseInt(element[0]) + Integer.parseInt(element[2]) == quizAnswer){
                    answer[index] = "O";
                }else{
                    answer[index] = "X";
                }
                index++;
            }else{
                if(Integer.parseInt(element[0]) - Integer.parseInt(element[2]) == quizAnswer){
                    answer[index] = "O";
                }else{
                    answer[index] = "X";
                }
                index++;
            }
        }
        return answer;
    }
}