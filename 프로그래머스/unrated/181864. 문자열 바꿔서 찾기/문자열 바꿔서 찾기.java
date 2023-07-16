class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] convert = myString.split("");
        
        for(int i=0;i<convert.length; i++){
            if(convert[i].equals("A")) {
            	convert[i] = "B";
            }
            else {
            	convert[i] = "A";
            }  	
        }
        StringBuilder sb = new StringBuilder();
        
        for(String s : convert){
            sb.append(s);
        }
        
        
        if(sb.toString().contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}