class Solution {
    public int solution(int[] array) {
        int answer = 0;
         for(int i : array){
             String a = ""+i;
            while(a.contains("7")){
                answer++;
                a=a.replaceFirst("7","");
            }
         }
        return answer;
    }
}