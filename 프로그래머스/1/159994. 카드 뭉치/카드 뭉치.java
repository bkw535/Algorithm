import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        
        for(int i=0; i<cards1.length; i++) {
            queue1.add(cards1[i]);
        }
        
        for(int i=0; i<cards2.length; i++) {
            queue2.add(cards2[i]);
        }
        
        for(String s : goal) {
            if(!queue1.isEmpty() && s.equals(queue1.peek())) {
                queue1.poll();
            } else if(!queue2.isEmpty() && s.equals(queue2.peek())) {
                queue2.poll();
            } else {
                return "No";
            }
            
        }
        
        return "Yes";
    }
}