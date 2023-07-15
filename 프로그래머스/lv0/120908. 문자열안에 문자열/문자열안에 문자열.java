class Solution {
	public int solution(String str1, String str2) {
		int answer =2;
		int count = 0;
		loop:for(int i=0;i<str1.length()-str2.length()+1;i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					count++;
					i+=1;
					if(count == str2.length()) {
						answer = 1;
						break loop;
					}
					continue;
				}else {
					i-=count;
					count=0;
					break;
				}
			}
		}
		
        return answer;
    }
}