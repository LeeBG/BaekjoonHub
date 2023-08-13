import java.util.ArrayList;
class Solution {
    public Integer[] solution(String today, String[] terms, String[] privacies) {
    	
        int[][] expires = new int [privacies.length][3];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
       loop: for(int i=0;i<privacies.length;i++){
            for(String t : terms){
                if(privacies[i].contains(t.split(" ")[0])){
                    expires[i][0] = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[0]);
                    expires[i][1] = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[1])+Integer.parseInt(t.split(" ")[1]);
                    expires[i][2] = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[2]);
                    
                    if(expires[i][1] > 12){
                    	int add = expires[i][1]/12;
                    	if(expires[i][1]%12 == 0) {
                    		add--;
                    		expires[i][1] = 12;
                    	}else {
                    		expires[i][1] %= 12;
                    	}
                        expires[i][0] += add;
                    }
                    
                    for(int k=0;k<3;k++) {
                    	if(Integer.parseInt(today.split("\\.")[k])<expires[i][k]) {
                    		continue loop;
                    	}else if(Integer.parseInt(today.split("\\.")[k]) == expires[i][k]) {
                    		if(k == 2) {
                    			list.add(i+1);
                    		}
                    	}else {
                    		list.add(i+1);
                    		continue loop;
                    	}
                    }
                }
            }//inner for
        }//ext for
 
       Integer[] answer = list.toArray(new Integer[list.size()]);
        
        return answer;
    }
}