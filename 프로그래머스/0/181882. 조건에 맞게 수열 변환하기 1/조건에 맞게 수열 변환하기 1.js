function solution(arr) {
    var answer = [];
    for(let e of arr){
        if(e >= 50 && e % 2 === 0){
            answer.push(Math.floor(e / 2))
        }else if(e < 50 && e % 2 === 1){
            answer.push(e * 2)
        }else{
            answer.push(e)
        }
    }
    return answer;
}