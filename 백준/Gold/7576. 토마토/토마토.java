import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] tomato;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        tomato = new int[N][M];
        visited = new boolean[N][M];
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        bfs();
        
        int answer = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(tomato[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                answer = Math.max(answer, tomato[i][j]);
            }
        }

        System.out.println(answer - 1);
    }
    
    static void bfs() {
        Queue<int[]> queue = new ArrayDeque<>();
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(tomato[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            
            for(int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx<0 || ny<0 || nx>=N || ny>=M) continue;
                if(tomato[nx][ny] != 0) continue;
                
                tomato[nx][ny] = tomato[cx][cy] + 1;
                visited[nx][ny] = true;
                queue.add(new int[]{nx, ny});
            }
        }
    }
}