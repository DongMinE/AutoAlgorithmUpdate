import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int rowMax = 0;
        int colMax = 0;
        for (int i = 0; i < sizes.length; i++) {
            int row = Math.max(sizes[i][0],sizes[i][1]);
            int col = Math.min(sizes[i][0],sizes[i][1]);
            rowMax = Math.max(rowMax, row);
            colMax = Math.max(colMax, col);
        }
        
        return rowMax*colMax;
    }
}