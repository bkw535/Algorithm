import java.util.*;
import java.io.*;

public class Main {
    static Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
    static boolean[] visited;
    static StringBuilder sbDfs = new StringBuilder();
    static StringBuilder sbBfs = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 정점
        int M = Integer.parseInt(st.nextToken()); // 간선 
        int V = Integer.parseInt(st.nextToken()); // 시작
        
        // 그래프 초기화
        for(int i=1; i<=N; i++) {
            graph.put(i, new ArrayList<>());
        }
        
        // 간선 입력(양방향 그래프)
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        // 정점 번호가 작은 것부터 방문하기 위해 정렬
        for(int i=1; i<=N; i++) {
            Collections.sort(graph.get(i));
        }
        
        // DFS
        visited = new boolean[N+1];
        dfs(V);
        
        // BFS (DFS에서 사용한 visited 배열 초기화 후 재사용)
        visited = new boolean[N+1];
        bfs(V);
        
        System.out.println(sbDfs.toString().trim());
        System.out.println(sbBfs.toString().trim());
    }
    
    // DFS 함수
    static void dfs(int v) {
        visited[v] = true;
        sbDfs.append(v).append(' ');
        for(int i : graph.get(v)) {
            if(!visited[i]) {
                dfs(i);
            }
        }
    }
    
    // BFS 함수(큐)
    static void bfs(int v) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        visited[v] = true;
        queue.offer(v);
        
        while(!queue.isEmpty()) {
            int c = queue.poll();
            sbBfs.append(c).append(' ');
            for(int i : graph.get(c)) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}