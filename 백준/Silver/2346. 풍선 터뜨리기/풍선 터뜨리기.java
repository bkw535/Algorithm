import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            deque.addLast(new int[]{Integer.parseInt(st.nextToken()),i+1});
        }
        
        while(!deque.isEmpty()) {
            int[] m = deque.pollFirst();
            int a = m[0];
            int b = m[1];
            sb.append(b).append(" ");
            
            if (deque.isEmpty()) break;
            
            if(a>0) {
                for(int j=0; j<a-1; j++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for(int j=0; j<Math.abs(a); j++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        
        System.out.println(sb);
    }
}