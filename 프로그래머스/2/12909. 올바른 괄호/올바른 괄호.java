import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(0) == ')') return false;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') stack.push(s.charAt(i));
            if(!stack.isEmpty()) {
                if(s.charAt(i) == ')') stack.pop();
            }
        }
        
        if(!stack.isEmpty()) return false;

        return answer;
    }
}