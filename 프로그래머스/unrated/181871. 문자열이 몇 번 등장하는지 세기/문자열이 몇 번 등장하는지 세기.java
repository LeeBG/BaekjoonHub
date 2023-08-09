class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        while(myString.length()>=pat.length()){
        	
            if(myString.substring(myString.length()-pat.length(),myString.length()).contains(pat)){
                answer++;
            }
            myString = myString.substring(0,myString.length()-1);
        }
        return answer;
    }
}