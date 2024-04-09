class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;

        for(int i=0;i<lottos.length;i++){
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                    break;
                }
            }
            if(lottos[i] == 0){
                zero++;
            }
        }

        answer[0] = rank(zero+count);
        answer[1] = rank(count);

        return answer;
    }

    static int rank(int count){
        int rank = 6;
        switch (count){
            case 6:
                rank = 1;
                break;
            case 5:
                rank = 2;
                break;
            case 4:
                rank = 3;
                break;
            case 3:
                rank = 4;
                break;
            case 2:
                rank = 5;
                break;
            default:
                break;
        }
        return rank;
    }
}