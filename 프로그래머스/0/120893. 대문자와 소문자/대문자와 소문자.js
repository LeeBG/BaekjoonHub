function solution(my_string) {
    var answer = '';
    for(let i=0;i<my_string.length;i++){
        if('a' <= my_string.charAt(i) && my_string[i].charAt(i) <= 'z'){
            answer += my_string.charAt(i).toUpperCase();
        }else if('A' <= my_string.charAt(i) && my_string[i].charAt(i) <= 'Z'){
            answer += my_string.charAt(i).toLowerCase();
        }
    }
    return answer;
}