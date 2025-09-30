import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] result = new int[N];
        Deque<int[]> deque = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(st.nextToken());
            
            while (!deque.isEmpty() && deque.peekLast()[0] <= height) {
                deque.pollLast();
            }
            
            if (!deque.isEmpty()) {
                result[i] = deque.peekLast()[1];
            } else {
                result[i] = 0;
            }
            
            deque.addLast(new int[]{height, i+1});
        }
        
        for (int x : result) {
            sb.append(x).append(" ");
        }
        
        System.out.println(sb);
    }
}