import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                count++;
            } else{
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
                count--;
            }
        }

        if (count != 0) {
            answer = false;
        }

        return answer;
    }
}