import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            
            if(order.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            }
            if(order.equals("pop")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.pop()).append("\n");
            }
            if(order.equals("front")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.peekFirst()).append("\n");
            }
            if(order.equals("back")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.peekLast()).append("\n");
            }
            if(order.equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            if(order.equals("empty")) {
                if(deque.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}