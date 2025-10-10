import java.util.*;

class Solution {
    public String solution(String p) {
        if(p.isEmpty()) return "";
        
        int balance = 0;
        int index = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') balance++;
            else balance--;
            if (balance == 0) {
                index = i + 1;
                break;
            }
        }
        
        String u = p.substring(0,index);
        String v = p.substring(index);
        
        if(isCorrect(u)) {
            return u + solution(v);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(solution(v));
            sb.append(")");
            
            for (int i = 1; i < u.length() - 1; i++) {
                char c = u.charAt(i);
                if (c == '(') sb.append(')');
                else sb.append('(');
            }
            return sb.toString();
        }
        
    }
    
    private boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}