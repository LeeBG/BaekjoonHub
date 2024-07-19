function solution(my_string) {
    var answer = '';
    // answer = my_string.replace(/[ioeu]/g,'')
    answer = my_string.replaceAll('i','').replaceAll('o','').replaceAll('u','').replaceAll('e','').replaceAll('a','');
    return answer;
}