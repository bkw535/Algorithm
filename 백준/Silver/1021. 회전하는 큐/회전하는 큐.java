import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int count = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<=N; i++) {
            deque.addLast(i);
        }
        
        for (int i=0; i<M; i++) {
            int a = Integer.parseInt(st.nextToken());
            
            int index = 0;
            for(int j:deque) {
                if(a == j) {
                    break;
                }
                index++;
            }
            
            int left = index;
            int right = deque.size() - index;
            
            if(left <= right) {
                while(deque.peekFirst() != a) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else {
                while (deque.peekFirst() != a) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }
            
            deque.pollFirst();
        }
        
        System.out.println(count);
    }
}