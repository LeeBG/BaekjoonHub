import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int mode = 0;
        Map<Integer, Integer> countMap = new HashMap();
        for(int i : array) {
            if(!countMap.containsKey(i)){
                countMap.put(i,1);
            }else{
                countMap.put(i,countMap.get(i)+1);
            }
        }

        Iterator<Integer> keys = countMap.keySet().iterator();
        while(keys.hasNext()){
            Integer key = keys.next();
            if(answer < countMap.get(key)){
                answer = countMap.get(key);
                mode = key;
            }
        }
        
        int freqCount = 0;
        keys = countMap.keySet().iterator();
        while(keys.hasNext()){
            Integer key = keys.next();
            if(countMap.get(key) == answer){
                freqCount++;
            }
        }

        if(freqCount > 1){
            return -1;
        } else {
            return mode;
        }
    }
}