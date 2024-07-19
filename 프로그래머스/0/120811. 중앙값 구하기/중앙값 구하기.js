function solution(array) {
    let answer = 0;
    array.sort((a,b) => a - b)
    let index = Math.floor(array.length / 2)
    answer = array[index]
    return answer;
}