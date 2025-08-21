import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        ArrayList<Integer>[] graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        
        Stack<Integer> stack = new Stack<>();
        boolean[] dcheck = new boolean[N+1];
        stack.push(V);
        
        while(!stack.isEmpty()) {
            int node = stack.pop();
            if(!dcheck[node]) {
                dcheck[node] = true;
                sb.append(node).append(" ");
        
                Collections.sort(graph[node], Collections.reverseOrder());
                for(int next : graph[node]) {
                    if(!dcheck[next]) {
                        stack.push(next);
                    }
                }
            }
        }
        
        sb.append("\n");
        
        Queue<Integer> queue = new LinkedList<>();
        boolean[] bcheck = new boolean[N+1];
        queue.add(V);
        bcheck[V] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(" ");
    
            Collections.sort(graph[node]);
            for(int next : graph[node]) {
                if(!bcheck[next]) {
                    bcheck[next] = true;
                    queue.add(next);
                }
            }
        }
        
        System.out.println(sb);
    }
}