import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            int r = a.charAt(n) - b.charAt(n);
            if(r == 0) return a.compareTo(b);
                
            return r;
        });
        
        return strings;
    }
}