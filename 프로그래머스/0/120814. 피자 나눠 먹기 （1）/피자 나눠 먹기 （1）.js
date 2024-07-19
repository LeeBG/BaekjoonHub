function solution(n) {
    var answer = Math.floor(n / 7);
    if(n % 7 > 0){
        answer++;
    }
    return answer;
}