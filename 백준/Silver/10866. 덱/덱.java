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
            String s = st.nextToken();
            
            switch(s) {
                case "push_front":
                    int m1 = Integer.parseInt(st.nextToken());
                    deque.addFirst(m1);
                    break;
                case "push_back":
                    int m2 = Integer.parseInt(st.nextToken());
                    deque.addLast(m2);
                    break;
                case "pop_front":
                    if(!deque.isEmpty()) {
                        sb.append(deque.pollFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "pop_back":
                    if(!deque.isEmpty()) {
                        sb.append(deque.pollLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if(!deque.isEmpty()) {
                        sb.append(0).append("\n");
                    } else {
                        sb.append(1).append("\n");
                    }
                    break;
                case "front":
                    if(!deque.isEmpty()) {
                        sb.append(deque.peekFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "back":
                    if(!deque.isEmpty()) {
                        sb.append(deque.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        
        System.out.println(sb);
    }
}