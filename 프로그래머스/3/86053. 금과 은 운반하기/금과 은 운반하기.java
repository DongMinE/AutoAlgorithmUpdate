class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        //금과 은 최대 무게 * 최대 시간
        long max = (long) (10e9 * 2 * 10e5 * 2);
        long min = 1;
        int town = g.length;
        long res = -1;
        
        while(max >= min) {
            long mid = (max + min)/2;
            
            //초기화
            int newG = 0, newS = 0, sum = 0;
            for (int i = 0; i < town; i++) {
                
                //왕복 가능한 횟수
                long cnt = mid/(t[i]*2);
                //왕복하고 남은 시간이 편도로 한번 가능한지 체크
                if ((mid%(t[i]*2)) >= t[i]) {
                    cnt++;
                }
                
                //각 마을에 보유한 금과 은의 운반 가능한 양을 더함
                newG += Math.min(g[i], w[i]*cnt);
                newS += Math.min(s[i], w[i]*cnt);
                sum += Math.min(g[i]+ s[i], w[i]*cnt);
            }
            
            //확보한 금과 은의 양이 목표치보다 많다면 중간 값을 변경
            if (newG >= a && newS >= b && sum >= a+b) {
                res = mid;
                //더 많다면 왼쪽으로 감소
                max = mid - 1;
            } else {
                //더 적다면 오른쪽으로 증가
                min = mid + 1;
            }
            // System.out.println(mid +" "+newG +" "+ newS);
            
        }
        return res;
    }
}