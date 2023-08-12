import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String type = "RTCFJMAN";
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<type.length();i++){
            map.put(type.substring(i,i+1),0);
        }
        
        for(int i=0;i<survey.length;i++){
            if(choices[i] < 4){
                map.put(survey[i].substring(0,1),map.get(survey[i].substring(0,1))+(4-choices[i]));
            }else if(choices[i] > 4){
                map.put(survey[i].substring(1,2),map.get(survey[i].substring(1,2))+(choices[i]-4));
            }
        }
        
        for(int i=0;i<type.length();i+=2){
            if(map.get(type.substring(i,i+1)) < map.get(type.substring(i+1,i+2))){
                answer += type.substring(i+1,i+2);
            }else{
                answer += type.substring(i,i+1);
            }
        }
        return answer;
    }
}