import java.util.Stack;

class Solution {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		Integer[][] locations = { { 3, 1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 },
				{ 2, 2 }, { 3, 0 }, { 3, 2 } };
		StringBuilder sb = new StringBuilder();
		Stack<Integer[]> l_location = new Stack<Integer[]>();
		Stack<Integer[]> r_location = new Stack<Integer[]>();
		
		l_location.push(locations[10]);
		r_location.push(locations[11]);
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%3==1) {
				l_location.push(locations[numbers[i]]);
				sb.append("L");
			}else if(numbers[i]%3==0 && numbers[i]!=0) {
				r_location.push(locations[numbers[i]]);
				sb.append("R");
			}else {
				int rightx = Math.abs(locations[numbers[i]][0]-r_location.peek()[0]);
				int righty = Math.abs(locations[numbers[i]][1]-r_location.peek()[1]);
						
				int leftx = Math.abs(locations[numbers[i]][0]-l_location.peek()[0]);
				int lefty = Math.abs(locations[numbers[i]][1]-l_location.peek()[1]);
			
				int r = rightx+righty;
				int l = leftx+lefty;
				
				if(r < l) {
					r_location.push(locations[numbers[i]]);
					sb.append("R");
				}else if(l < r) {
					l_location.push(locations[numbers[i]]);
					sb.append("L");
				}else if(l == r){				
					if(hand.equals("left")) {
						System.out.println(numbers[i]);
						l_location.push(locations[numbers[i]]);
						sb.append("L");
					}else{
						System.out.println(numbers[i]);
						r_location.push(locations[numbers[i]]);
						sb.append("R");
					}
				}
			}
		}
		
		answer = sb.toString();
		return answer;

	}
}