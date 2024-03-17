class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(A);
        int count = 0;
        while (!A.equals(B)) {
            char last = sb.charAt(A.length()-1);
            sb.deleteCharAt(A.length()-1);
            sb.insert(0,last);
            A = sb.toString();
            count++;
            if(A.equals(B)){
                answer = count;
            }

            if(count > A.length()){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
