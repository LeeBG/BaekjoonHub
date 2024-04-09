class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k]; // 정답
        int count = 0;

        for(int i = 0; i < picture.length;i++){
            String tmp = "";
            //
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<picture[i].length();j++){
                for(int t=0; t < k; t++){
                    sb.append(picture[i].charAt(j)); // 글자 반복
                }
            }
            tmp = sb.toString();
            // 반복
            // count ==0 0~2
            // count ==1 3~5
            // count ==2 6~8
            for(int l=0;l<k;l++){
                answer[count*k + l] = tmp;
            }
            count++;
        }
        return answer;
    }
}