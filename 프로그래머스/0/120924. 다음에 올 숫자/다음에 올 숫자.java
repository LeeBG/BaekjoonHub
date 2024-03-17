class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // 등차인지 등비인지 판단하기
        // 등차 또는 등비가 아닌 경우는 없다.

        if(common[common.length-1] - common[common.length-2] == common[common.length-2] - common[common.length-3]){
            // 등차
            answer = common[common.length-1] + (common[common.length-1]-common[common.length-2]);

        }else {
            // 등비
            answer = common[common.length-1] * (common[common.length-1] / common[common.length-2]);
        }

        return answer;
    }
}