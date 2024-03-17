class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] answerElements = polynomial.split(" ");
        int hang = 0;
        int num = 0;
        for(String e : answerElements) {
            if(e.contains("x")){
                hang += (e.equals("x")) ? 1 : Integer.parseInt(e.split("x")[0]);
            }else if(e.equals("+")){
                continue;
            }else {
                num += Integer.parseInt(e);
            }
        }
        answer += (hang == 0 ? "" : (hang != 1 ? hang+"" : "")+"x")+(hang != 0 && num != 0 ? " + " : "")+ (num == 0 ? "" : num);
        return answer;
    }
}