function solution(array, commands) {
    var answer = [];
    for (let i = 0; i < commands.length; i++) {
        const a = commands[i][0]-1;
        const b = commands[i][1];
        const c = commands[i][2]-1;

        const newArray = array.slice(a,b).sort((a,b)=> a-b);
        answer.push(newArray[c])
        // console.log();
    }
    
    
    return answer;
}