function solution(arr, queries) {
    var answer = [];
;
    queries.forEach(item => {
        for(let i = item[0];i<=item[1];i++){
            if(i%item[2] === 0){
                arr[i]+=1;
            }
        }
    })
    answer = arr;
    
    return answer;
}