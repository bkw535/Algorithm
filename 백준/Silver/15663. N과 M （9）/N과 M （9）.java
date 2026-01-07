import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] list;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        list = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(list);
        
        arr = new int[M];
        visited = new boolean[N];
        dfs(0);
        
        System.out.println(sb.toString());
    }
    
    static void dfs(int depth) {
        if(depth == arr.length) {
            for(int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        int prev = -1;
        
        for(int i=0; i<N; i++) {
            if(visited[i]) continue;
            if(list[i] == prev) continue;
            
            visited[i] = true;
            arr[depth] = list[i];
            prev = list[i];
            
            dfs(depth + 1);
            visited[i] = false;
        }
    }
}