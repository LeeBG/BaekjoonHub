function solution(array) {
    var answer = [];
    
    // 배열 중 가장 큰 값을 찾는 방법
    let biggest = Math.max(...array)
    // index값 반환 indexOf(index)
    answer.push(biggest,array.indexOf(biggest));
    
    return answer;
}