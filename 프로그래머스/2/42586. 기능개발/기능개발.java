import java.util.*;

class Solution {
    public List solution(int[] pro, int[] spe) {
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < pro.length; i++) {
            if ((100-pro[i])%spe[i] == 0) {
                q.add((100-pro[i])/spe[i]);
            } else {
                q.add((100-pro[i])/spe[i]+1);
            }
        }
        
        int cur = q.poll();
        int cnt = 1;
        while (!q.isEmpty()) {
            if (cur >= q.peek()) {
                cnt++;
                q.poll();
            } else {
                answer.add(cnt);
                cnt = 1;
                cur = q.poll();
            }
        }
        answer.add(cnt);
       
        return answer;
    }
}