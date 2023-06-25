import java.util.Arrays;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int step = 1;				// 1단계부터 시작
        int people = 0;				// 사람
        String prev = "";			// 이전 단어 privious
        // map
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < words.length; i++){
            String now = words[i];					// now는 현재 체크 단어
            people++;
            
            if(i > 0){
                //끝말 비교체크
                char prevChar = prev.charAt(prev.length()-1);
                char nowChar = now.charAt(0);
                if(prevChar != nowChar || map.containsKey(now)){		// 끝말 체크 실패 혹은
                    answer[0] = people;									// 중복 오류
                    answer[1] = step;
                    break;
                }          
            }
            map.put(now, 0);											// <단어, 0>
            prev = now;
            
            if(people == n){
            	people = 0;
                step ++;
            }
        }

        return answer;
    }
}
