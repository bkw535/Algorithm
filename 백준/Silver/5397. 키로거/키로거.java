import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++) {
            String[] arr = br.readLine().split("");
            Stack<String> left = new Stack<>();
            Stack<String> right = new Stack<>();
            
            for(String s : arr) {
                if (s.equals("<")) {
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                } else if (s.equals(">")) {
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                } else if (s.equals("-")) {
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                } else {
                    left.push(s);
                }
            }
        
            while(!left.isEmpty()) {
                right.push(left.pop());
            }

            while(!right.isEmpty()) {
                sb.append(right.pop());
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}