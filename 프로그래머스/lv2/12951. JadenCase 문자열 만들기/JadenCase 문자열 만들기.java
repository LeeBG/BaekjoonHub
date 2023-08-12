import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] test = s.split("");
        ArrayList<String> list = new ArrayList<>();
        for(String t : test){
            if(list.isEmpty()){
                list.add(t.toUpperCase());
            }
            else{
                if(list.get(list.size()-1).equals(" ")){
                    list.add(t.toUpperCase());
                }else{
                    list.add(t);
                }
            }
        }
        
        for(int i=0;i<list.size();i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}