function solution(arr) {
    var answer = [];
    let startIndex = -1;
    let endIndex = -1;
    
    for(let i=0; i<arr.length;i++){
        if(startIndex === -1 && arr[i] === 2){
            startIndex = i;
            continue;
        }
        if(startIndex !== -1  && arr[i] === 2){
            endIndex = i;
            continue;
        }
    }
    
    if(startIndex === -1 && endIndex === -1){
        answer.push(-1);
    }else if(startIndex !== -1 && endIndex === -1){
        answer.push(arr[startIndex]);
    }else {
        for(let i = startIndex; i<=endIndex; i++){
            answer.push(arr[i]);
        }
    }
    
    return answer;
}