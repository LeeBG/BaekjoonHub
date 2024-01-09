class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int count = 0;
        
        for(int i=0;i<picture.length;i++){
            StringBuilder result = new StringBuilder();
            String[] arr = picture[i].split("");
            for(int j=0;j<arr.length;j++){
                result.append(arr[j].repeat(k));
            }
            for(int l=0;l<k;l++){
                answer[count+l] = result.toString();
            }
            count+=k;
        }
        return answer;
    }
}