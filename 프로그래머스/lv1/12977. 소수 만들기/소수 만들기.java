class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++) {
        	for(int j=i+1;j<nums.length-1;j++) {
        		for(int k=j+1;k<nums.length;k++) {
        			int sum =nums[i]+nums[j]+nums[k]; 
        			if(verify(sum)) {
        				answer++;
        			}
        		}
        	}
        }
        return answer;
    }
    
    // 소수 판별
    public boolean verify(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }
        
        return count == 2 ? true : false;
    }
}