import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    
    static int count;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        map = new int[N][N];
        visited = new boolean[N][N];
        for(int i=0; i<N; i++) {
            String s = br.readLine();
            for(int j=0; j<N; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    bfs(i, j);
                    list.add(count);
                }
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for(int x : list) {
            sb.append(x).append("\n");
        }

        System.out.print(sb.toString());
    }
    
    static void bfs(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        count = 1;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            
            for(int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if(visited[nx][ny]) continue;
                if(map[nx][ny] == 0) continue;
                
                visited[nx][ny] = true;
                queue.add(new int[]{nx, ny});
                count++;
            }
        }
    }
}