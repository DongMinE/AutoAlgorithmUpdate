function solution(prices) {
    const length = prices.length;
    const answer = [];
    
    for (let i = 0; i < length; i++) {
        let stack = 0;
        let current = prices[i];
        
        for(let j = i+1; j < length; j++) {
            stack++;
            if(prices[j] < current) break;
            
        }
        answer.push(stack);
    }
    return answer;
}