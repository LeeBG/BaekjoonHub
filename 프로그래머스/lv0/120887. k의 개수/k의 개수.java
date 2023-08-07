class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        for(int l = i;l<=j;l++){
            s += l;
        }
        String t = s.replace(""+k, "");
        
        
        return s.length()-t.length();
    }
}