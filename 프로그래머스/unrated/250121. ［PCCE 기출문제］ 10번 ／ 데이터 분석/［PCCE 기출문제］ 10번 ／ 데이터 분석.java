import java.util.Arrays;
import java.util.Comparator;
class Solution {
    	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

		int count = 0;
		int standard = value(data, ext);
		int sort = sort(data, sort_by);
		for (int[] arr : data) {
			if (arr[standard] < val_ext) {
				count++;
			}
		}

		int[][] answer = new int[count][];
		count = 0;
		for (int[] arr : data) {
			if (arr[standard] < val_ext) {
				answer[count] = arr;
				count++;
			}
		}
		
		
		Arrays.sort(answer,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[sort] - o2[sort];
			}
		});
		
		
		return answer;
	}

	private int sort(int[][] data, String sort_by) {
		int standard = -1;
		
		switch (sort_by) {
		case "code":
			standard = 0;
			break;
		case "date":
			standard = 1;
			break;
		case "maximum":
			standard = 2;
			break;
		case "remain":
			standard = 3;
			break;
		}
		return standard;
	}

	public static int value(int[][] data, String ext) {
		int standard = -1;

		switch (ext) {
		case "code":
			standard = 0;
			break;
		case "date":
			standard = 1;
			break;
		case "maximum":
			standard = 2;
			break;
		case "remain":
			standard = 3;
			break;
		}
		return standard;
	}
}