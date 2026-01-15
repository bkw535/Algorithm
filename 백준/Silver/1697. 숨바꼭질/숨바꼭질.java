import java.io.*;
import java.util.*;

public class Main {
    static int N, K, time;
    static int[] list = new int[100001];
    static boolean[] visited = new boolean[100001];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        bfs(N);
        
        System.out.println(time);
    }
    
    static void bfs(int n) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(n);
        visited[n] = true;
        list[n] = 0;
        
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            if(cur == K) {
                time = list[cur];
                return;
            }
            
            int[] next = new int[]{cur-1, cur+1, cur*2};
            for(int i : next) {
                if(i < 0 || i > 100000) continue;
                
                if(visited[i]) continue;
                
                visited[i] = true;
                list[i] = list[cur] + 1;
                queue.add(i);
            }
        }
    }
}