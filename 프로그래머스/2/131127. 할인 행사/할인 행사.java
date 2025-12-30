import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {   
        int count = 0;
        for(int i=0; i<=discount.length-10; i++) {
            Map<String, Integer> map = new HashMap<>();
            for(int j=0; j<want.length; j++) {
                map.put(want[j], number[j]);
            }
            
            for (int j = i; j < i + 10; j++) {
                map.put(discount[j], map.getOrDefault(discount[j], 0) -1);
            }
            
            boolean tf = true;
            for (int v : map.values()) {
                if (v > 0) {
                    tf = false;
                    break;
                }
            }
            
            if(tf) {
                count++;
            }
        }
        
        return count;
    }
}