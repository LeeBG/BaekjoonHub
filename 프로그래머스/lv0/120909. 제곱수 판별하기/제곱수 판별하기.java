class Solution {
    public int solution(int n) {
        int answer = 2;
        int count = 0;
        for(int i=2;i*i<=n;i++){
            if(i*i == n){
                count++;
            }
        }
        if(count == 1){
            answer = 1;
        }
        return answer;
    }
}