import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) throws IOException{
        boolean[] check = new boolean[2000001];
        int res = 0;
        int chance = nums.length/2;
        
        for (int i=0; i < nums.length; i++) {
            if (chance == 0) {
                break;
            }
            if (!check[nums[i]]) {
                check[nums[i]] = true;
                chance--;
                res++;
            }
        }
        
        return res;
    }
}