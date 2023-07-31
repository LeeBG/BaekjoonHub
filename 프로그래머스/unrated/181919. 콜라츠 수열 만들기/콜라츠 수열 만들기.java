import java.util.ArrayList;
class Solution {
    ArrayList<Integer> list = new ArrayList();
    public Integer[] solution(int n) {
        int count = 0;
        list.add(n);
        while(n != 1){
            if(n%2==0){
                n/=2;
            }else{
                n*=3;
                n+=1;
            }
            list.add(n);
        }
        Integer[] answer = list.toArray(new Integer[list.size()]);
        return answer;
    }
}