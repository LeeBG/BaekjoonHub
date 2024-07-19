function solution(num_str) {
    var answer = 0;
    for(let ch of num_str){
        answer += parseInt(ch);
    }
    return answer;
}