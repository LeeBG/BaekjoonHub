class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=10;i>=1;i--){
            if(factorial(i) <= n){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    public int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    
}