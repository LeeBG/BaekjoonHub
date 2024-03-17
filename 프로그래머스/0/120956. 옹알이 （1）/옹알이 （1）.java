class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babblingList = {"aya", "ye", "woo", "ma"};
        for(String s : babbling){
            for(String b : babblingList){
                if(s.contains(b)){
                    s = s.replace(b," ");
                }
            }
            s = s.replace(" ","");
            if(s.equals("")){
               answer++;
            }
        }
        return answer;
    }
}