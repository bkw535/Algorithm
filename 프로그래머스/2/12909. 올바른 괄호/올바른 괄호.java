import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Deque<Character> deque = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '(') deque.offer(c);
            
            if(deque.isEmpty() && c == ')') {
                answer = false;
                break;
            }
            
            if(c == ')' && deque.isEmpty()) {
                answer = false;
                break;
            }
            
            if(c == ')' && !deque.isEmpty()) {
                deque.poll();
            }
            
        }
        
        if(!deque.isEmpty()) answer = false;

        return answer;
    }
}