function solution(array) {
    var answer = 0;
    var str = '';
    
    for(let e of array){
        str += e;    
    }

    return str.length - str.replaceAll('7','').length;
}