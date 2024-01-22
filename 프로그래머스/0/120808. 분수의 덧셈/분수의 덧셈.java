class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = numer1*denom2+ numer2*denom1;
        answer[1] = denom1*denom2;
        int gnum = gcd(answer[0], answer[1]);
        answer[0] = answer[0]/gnum;
        answer[1] = answer[1]/gnum;
        
        return answer;
    }
    public static int gcd(int num1, int num2){
        if(num1 < num2){
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        
        int n = 0;
        
        while(num2 != 0){
            n = num1 % num2;
            num1 = num2;
            num2 = n;
        }
        
        return num1;
    }
}