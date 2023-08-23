import java.util.Arrays;
import java.util.HashMap;
class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		// name과 yearning의 길이는 같다.
		
		HashMap<String, Integer> memoryMap = new HashMap<String, Integer>();
		
		for(int i=0;i<name.length;i++) {
			memoryMap.put(name[i], yearning[i]);
		}
		
		for(int i=0;i<photo.length;i++) {
			for(int j=0;j<photo[i].length;j++) {
				if(memoryMap.containsKey(photo[i][j])) {
					answer[i] += memoryMap.get(photo[i][j]);
				}else {
					continue;
				}
			}
		}
		return answer;
	}
}