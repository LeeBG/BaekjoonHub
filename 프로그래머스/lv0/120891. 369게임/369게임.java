class Solution {
    public int solution(int order) {
        int answer = 0;
        String sorder = ""+order;
        
        while(!sorder.equals("")){
            if(sorder.substring(0,1).equals("3")|| sorder.substring(0,1).equals("6")|| sorder.substring(0,1).equals("9")){
            answer++;
        }
        
        sorder = sorder.substring(1);
        }
        
        
        return answer;
    }
}