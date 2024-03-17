class Solution {
    public int solution(int a, int b) {
        // 소인수 분해 한 값을 HashMap에 담아서 2와 5만 있으면 된다는 것
        int answer = 1;
        int gcd = 1;
        if(a > b){
            gcd = gcd(a,b);
        }else{
            gcd = gcd(b,a);
        }
        b /= gcd;
        while(b % 2 ==0 || b % 5 == 0){
            if(b%2 ==0){
                b /= 2;
            }
            if(b%5 == 0){
                b /= 5;
            }
        }
        if(b != 1){
            answer = 2;
        }
        return answer;
    }
    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        return gcd(q, p%q);
    }
}