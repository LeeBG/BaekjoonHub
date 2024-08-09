function solution(rank, attendance) {
    var answer = 0;
    let start = 10000;
    let arr = [];
    attendance.forEach((item,index) => {
        if(item){
            arr.push({ rank:rank[index], index:index});
        }
    })

    arr.sort((a,b) => a.rank - b.rank)
    
    arr.forEach(item => {
        answer += item.index*start;
        start = Math.floor(start / 100);
    })
    
    return answer;
}