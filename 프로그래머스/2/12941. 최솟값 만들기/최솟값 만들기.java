import java.util.Arrays;
import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Integer[] B2 = new Integer[B.length];

        for(int i=0;i<B2.length;i++){
            B2[i] = B[i];
        }

        Arrays.sort(A);
        Arrays.sort(B2, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int i=0;i<A.length;i++){
            answer += A[i]*B2[i];
        }

        return answer;
    }
}