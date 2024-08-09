function solution(id_pw, db) {
    var answer = 'fail';
    db.forEach((item) => {
        if(item[0] === id_pw[0]){
            answer = 'wrong pw'
            if(item[1] === id_pw[1])
                answer = 'login'
        }
    });
    return answer;
}