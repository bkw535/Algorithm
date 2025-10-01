import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String s = br.readLine();
            if(s.equals(".")) break;
            
            Stack<Character> stack = new Stack<>();
            boolean valid = true;
            
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        valid = false;
                        break;
                    }
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        valid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            if (valid && stack.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        
        System.out.println(sb);
    }
}