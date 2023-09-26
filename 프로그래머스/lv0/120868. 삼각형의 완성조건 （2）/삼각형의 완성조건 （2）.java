// 삼각형의 완성 조건
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for(int i=1;i<sides[0]+sides[1];i++) {
        	if(sides[0] < sides[1]) {
        		if(sides[1]<sides[0]+i) {
        			answer++;
        		}
        	}else if(sides[0] > sides[1]){
        		if(sides[0]<sides[1]+i) {
        			answer++;
        		}
        	}else {
        		if(i<sides[0]+sides[1]) {
        			answer++;
        		}
        	}
        }
        return answer;
    }
}