class Solution {
	
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch (n) {
		case 1:
			answer = new int[slicer[1]+1];
			//answer.length == slicer[1]+1;
			for(int i=0;i<slicer[1]+1;i++) {
				answer[i] = num_list[i];
			}
			break;
		case 2:
			int index= 0;
			answer = new int[num_list.length-slicer[0]];
			for(int i=slicer[0];i<num_list.length;i++) {
				answer[index] = num_list[i];
				index++;
			}
			break;
		case 3:
			int index2= 0;
			answer = new int[slicer[1]-slicer[0]+1];
			for(int i=slicer[0];i<slicer[1]+1;i++) {
				answer[index2] = num_list[i];
				index2++;
			}
			break;
		case 4:
			int index3= 0;
			int length  = 0 ;
			if((slicer[1]-slicer[0]+1)%slicer[2] == 0) {
				length = (slicer[1]-slicer[0]+1) / slicer[2];
			}else {
				length = (slicer[1]-slicer[0]+1) / slicer[2]+1;
			}
			answer = new int[length];
			for(int i=slicer[0];i<slicer[1]+1;i+=slicer[2]) {
				answer[index3] = num_list[i];
				index3++;
			}
			break;
		default:
			break;
		}
//        System.out.println(Arrays.toString(answer));
        return answer;
    }
}