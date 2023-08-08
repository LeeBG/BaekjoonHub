import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int count = 0;
		int[] arr = null;

		for (int i = 0; i < commands.length; i++) {
			arr = new int[commands[i][1] - commands[i][0] + 1];
			for (int k = 0; k < arr.length; k++) {
				arr[k] = array[commands[i][0] - 1 + k];
			}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			answer[count] = arr[commands[i][2]-1];
			
			count++;
		}
		return answer;
	}
}