import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hash = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 1) + 1);
        }
        
        for (String key : hash.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hash.get(key));
        }
        
        int answer = 1;
        
        for (int value: hash.values()) {
            answer *= value;
        }
        return answer-1;
    }
}