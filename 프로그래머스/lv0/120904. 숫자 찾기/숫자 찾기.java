class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String snum = num + "";
        for(int i=0;i<snum.length();i++){
            if(snum.charAt(i) == (char)(k+48)){
                answer = i+1;
                break;
            }
        }
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
}