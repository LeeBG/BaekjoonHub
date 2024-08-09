function solution(dots) {
    var answer = 1;
    let map1 = new Map();
    let map2 = new Map();
    let lengthX = 0;
    let lengthY = 0;
    
    dots.forEach(item => {
        if(map1.has(item[1])){
            lengthX = Math.abs(map1.get(item[1]) - item[0]);
        }else{
            map1.set(item[1],item[0])
        }
        
        if(map2.has(item[0])){
            lengthY = Math.abs(map2.get(item[0]) - item[1]);
        }else{
            map2.set(item[0],item[1])
        }
    })
    
    return answer*lengthX*lengthY;
}