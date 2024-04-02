class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // bandage = [시전시간, 초당 회복량, 추가회복량]
        // health = 최대 체력
        // attack = [몬스너의 공격시간, 피해량];
        int initHealth = health;
        int answer = 0;
        int count = 0; // 연속 성공 횟수;
        int lastIndex = attacks[attacks.length-1][0];
        int attackCount = 0; // 공격을 겪은 횟수;
        int heal = bandage[1]; // 기본회복량
        
        for(int i=0;i<=lastIndex;i++){
            if(attacks[attackCount][0]==i){ // 공격 받기
                health -= attacks[attackCount][1];
                attackCount++;
                count = 0;
            if(health <= 0){ // 체력이 0보다 작은경우에는??
                health = -1;
                break;
            }
            }else{ // 붕대 감기
                if(health < initHealth){ // 피가 최대체력 미만일 때,
                    if(count == bandage[0]){
                        heal = bandage[1] + bandage[2];
                        count = 0;
                    }else{
                        heal = bandage[1];
                    }
    
                    if(health+heal <= initHealth){
                        health += heal;
                    }else{
                        health = initHealth;
                    }
                }
            }
            count++;
        }
        
        answer = health;
        return answer;
    }
}