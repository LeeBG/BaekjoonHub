import java.util.ArrayList;

class Solution {
    public Integer[] solution(int[] arr, int[] query) {
    
    	ArrayList<Integer>  list = new ArrayList<Integer>();
    	
    	for(int i=0;i<arr.length;i++) {
    		list.add(arr[i]);
    	}
    	// arr에서 잘라낼 기준 index를 담고 있는 query
    	for(int i=0;i<query.length;i++) {
    		if(i % 2== 0) {
    			for(int j = list.size()-1;j>=query[i]+1;j--) {
    				list.remove(list.size()-1);
    			}
    		}else {
    			for(int j=0;j<query[i];j++) {
    				list.remove(0);
    			}
    		}
    	}
        
    	Integer[] answer = list.toArray(new Integer[list.size()]);
    	
        return answer;
    }
}
