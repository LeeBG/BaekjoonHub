// 기사단원의 무기
class Solution {
	public int solution(int number, int limit, int power) {
		int answer = 0;
		int[] weapons = new int[number];
		
		for(int i=0;i<weapons.length;i++) {
			weapons[i] = measureOfNumber(i+1);
		}
		
		for(int i=0;i<weapons.length;i++) {
			if(weapons[i] > limit) {
				weapons[i] = power;
			}
			answer += weapons[i];
		}
		return answer;
	}
	// 약수의 갯수를 구하는 식
	public int measureOfNumber(int number) {
		int count = 0;
		for(int i=1;i*i<=number;i++) {
			
			if(i*i == number) {
				count++;
			}
			else if(number%i==0) {
				count+=2;
			}
		}
		return count;
	}
}