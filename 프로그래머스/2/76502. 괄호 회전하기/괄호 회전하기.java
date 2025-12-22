import java.util.*;

class Solution {
    public int solution(String s) {
        if(s.length() % 2 != 0) return 0;
        
        Deque<String> deque = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++) {
            String n = s.charAt(i) + "";
            deque.addLast(n);
        }
        
        int count = 0;
        for(int i=0; i<deque.size(); i++) {
            Stack<String> stack = new Stack<>();
            boolean tf = true;
            for(String a : deque) {
                if(a.equals("[") || a.equals("(") || a.equals("{")) {
                    stack.push(a);
                } else {
                    if (stack.isEmpty()) {
                        tf = false;
                        break;
                    }

                    String top = stack.pop();
                    if (a.equals(")") && !top.equals("(") ||
                        a.equals("]") && !top.equals("[") ||
                        a.equals("}") && !top.equals("{")) {
                        tf = false;
                        break;
                    }
                }
            }
            
            if (tf && stack.isEmpty()) {
                count++;
            }
            
            deque.addLast(deque.pollFirst());
        }
        
        return count;
    }
}