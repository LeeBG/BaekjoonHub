import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] nonsorted = new int[emergency.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        System.arraycopy(emergency, 0,nonsorted , 0, emergency.length);
        
        Arrays.sort(emergency);
        
        for(int i=0;i<emergency.length;i++) {
        	map.put(emergency[i],emergency.length-i);
        }
        
        for(int i=0;i<nonsorted.length;i++) {
        	answer[i] = map.get(nonsorted[i]);
        }

        return answer;
    }
}