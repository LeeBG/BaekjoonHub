function solution(myString, pat) {
    var answer = 0;
    let newString = '';

    for(let ch of myString){
        if(ch === 'A'){
            newString += 'B';            
        }else{
            newString += 'A';
        }
    }
    
    if(newString.includes(pat)){
        answer = 1
    }
    
    return answer;
}