class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        int length = 0;
        for(String e : intStrs){
            int num = Integer.parseInt(e.substring(s,l+s));
            System.out.println(num);
            if(num > k){
                length++;
            }
        }        

        int[] answer = new int[length];
        int index = 0;
        for(String e : intStrs){
            int num = Integer.parseInt(e.substring(s,l+s));
            if(num > k){
                answer[index] = num;
                index++;
            }
        }
        
        return answer;
    }
}