import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            String n = s.charAt(i) + "";
            
            if(n.equals("(")) stack.push(n);
            
            if(!stack.isEmpty() && n.equals(")")) {
                stack.pop();
            } else if(stack.isEmpty() && n.equals(")")) {
                answer = false;
                break;
            }
        }
        
        if(!stack.isEmpty()) answer = false;

        return answer;
    }
}