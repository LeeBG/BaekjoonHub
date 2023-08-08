class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char ch = ' ';
        for(int i=0;i<indices.length;i++){
            my_string = my_string.substring(0,indices[i])+ch+my_string.substring(indices[i]+1);
        }
        
        answer= my_string.replace(" ","");
        return answer;
    }
}