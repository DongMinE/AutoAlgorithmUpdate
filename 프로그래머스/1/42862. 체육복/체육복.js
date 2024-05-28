function solution(n, lost, reserve) {
    let reLost = lost.filter(n => !reserve.includes(n)).sort((a,b) => a-b);
    let reReserve = reserve.filter(m => !lost.includes(m)).sort((a,b) => a-b);
    
    let answer = n - reLost.length;
    
    for (let i = 0; i < reLost.length; i++) {
        for (let j = 0; j < reReserve.length; j++) {
            if (reLost[i] == reReserve[j]+1 || reLost[i] == reReserve[j]-1) {
                answer++;
                reReserve[j] = -1;
                break;
            }
        }
    }
        
    return answer;
}