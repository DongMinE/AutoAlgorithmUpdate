function solution(s){
    var answer = true;
    var stack = 0;
    
    for (let i=0; i<s.length; i++) {
        if(s[i] === '(') {
            stack++;
        } else {
            stack--;
        }
        if (stack < 0) {
            return false;
        }
    }
    
    if(stack != 0) {
        return false;
    }
    return true;
}