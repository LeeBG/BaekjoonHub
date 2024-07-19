function solution(array, height) {
    var answer = array.length;
    console.log(array)
    for(let i of array){
        if(i <= height){
            answer--;
        }
    }    
    return answer;
}