import java.util.*;


public class Solution {
    public Stack solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.add(arr[i]);
            } else {
                int top = stack.peek();

                if (top != arr[i]) {
                    stack.add(arr[i]);
                }
            }
        }
        // int[] res = new int[stack.size()];
        // for (int i = res.length - 1; i >= 0; i--) {
        //     res[i] = stack.pop();
        // }
        
        return stack;
    }
}