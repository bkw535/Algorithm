import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            Deque<Character> deque = new ArrayDeque<>();
            String s = br.readLine();
            boolean tf = true;
            
            for(char c : s.toCharArray()) {
                if(c == '(') {
                    deque.addLast(c);
                } else if(c == ')') {
                    if(deque.isEmpty()) {
                        tf = false;
                        break;
                    }
                    deque.pollFirst();
                }
            }
            
            if(!deque.isEmpty()) tf = false;
            
            if(tf) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        
        System.out.println(sb);
    }
}