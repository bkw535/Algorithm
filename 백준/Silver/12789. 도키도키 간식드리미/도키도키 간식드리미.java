import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int index = 1;
        Deque<Integer> deque = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<N; i++) {
            deque.addLast(Integer.parseInt(st.nextToken()));
        }
        
        boolean tf = false;
        while(!deque.isEmpty()) {
            int cur = deque.peekFirst();
            
            if(cur == index) {
                deque.pollFirst();
                index++;
            } else {
                stack.push(deque.pollFirst());
            }
            
            while(!stack.isEmpty() && stack.peek() == index) {
                stack.pop();
                index++;
            }
        }
        
        while(!stack.isEmpty() && stack.peek() == index) {
            stack.pop();
            index++;
        }
        
        if(index == N + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}