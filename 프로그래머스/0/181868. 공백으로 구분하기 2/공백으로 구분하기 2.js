function solution(my_string) {
    var answer = [];
    my_string = my_string.trim() // 양쪽 공백 해결
    
    while(my_string.includes('  ')){
        my_string = my_string.replaceAll('  ',' ');
    }
    
    answer = my_string.split(' ');
        
    return answer;
}