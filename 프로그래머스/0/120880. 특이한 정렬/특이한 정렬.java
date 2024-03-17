
import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Map<Integer,Integer> lengthMap = new HashMap<>();
        for(int i=0;i<numlist.length;i++){
            lengthMap.put(numlist[i],Math.abs(numlist[i]-n));
        }

        ArrayList<Map.Entry<Integer,Integer>> entries = new ArrayList<>(lengthMap.entrySet());
        Collections.sort(entries, (a,b) -> {
            int valueCompare = a.getValue().compareTo(b.getValue()); // 비교값
            if (valueCompare == 0) {
                // 값이 같을 경우, 키(원래의 숫자)를 비교하여 내림차순 정렬합니다.
                return b.getKey().compareTo(a.getKey());
            }
            return valueCompare;
        });

        for(int i =0; i<entries.size();i++){
            answer[i] = entries.get(i).getKey();
        }

        return answer;
    }
}