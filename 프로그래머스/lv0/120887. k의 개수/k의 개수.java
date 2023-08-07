class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        for(int l = i;l<=j;l++){
            s += l;
        }
        
        for(int t=0;t<s.length();t++){
            if(s.charAt(t) == (char)(48+k)){
                answer++;
            }
        }
        return answer;
    }
}