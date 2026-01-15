import java.io.*;
import java.util.*;

public class Main {
    static int T;
    static int N, M, K;
    static int count;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
        
            map = new int[N][M];
            visited = new boolean[N][M];
            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            
            count = 0;
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {
                    if(map[j][k] == 1 && !visited[j][k]) {
                        bfs(j, k);
                        count++;
                    }
                }
            }
            
            sb.append(count).append("\n");
        }
        
        System.out.println(sb.toString());
    }
    
    static void bfs(int y, int x) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cy = cur[0];
            int cx = cur[1];
            
            for(int i=0; i<4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];
                
                if(ny<0 || nx<0 || ny>=N || nx>=M) continue;
                if(visited[ny][nx]) continue;
                if(map[ny][nx] == 0) continue;
                
                visited[ny][nx] = true;
                queue.add(new int[]{ny, nx});
            }
        }
    }
}