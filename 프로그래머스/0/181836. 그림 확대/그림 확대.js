function solution(picture, k) {
    var answer = [];
        for(let ch of picture){
            var a = '';
            for(let c of ch){
                a += c.repeat(k); 
            }
            for(let i=0;i<k;i++){
                answer.push(a);
            }
        }
    return answer;
}