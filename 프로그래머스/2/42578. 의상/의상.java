import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] s : clothes) {
            String type = s[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        for(int i : map.values()) {
            answer *= (i+1);
        }
        
        return answer - 1;
    }
}