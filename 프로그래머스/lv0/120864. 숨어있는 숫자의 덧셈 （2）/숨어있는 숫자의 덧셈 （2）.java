class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i) > 57){
                my_string = my_string.replaceFirst(my_string.charAt(i)+""," ");
            }
        }
        System.out.println(my_string);
        
        while(my_string.contains("  ")){
            my_string = my_string.replace("  "," ");
        }
        
        String[] sum = my_string.split(" ");
        
        for(String s : sum){
            if(!s.equals("")){
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}