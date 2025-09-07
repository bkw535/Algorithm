import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> board;
    static boolean[][] visited; 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        visited = new boolean[N][M];
        
        board = new ArrayList<>();
        for(int i=0; i<N; i++) {
            board.add(new ArrayList<>());
        }
        
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                board.get(i).add(str.charAt(j) - '0');
            }
        }
        
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0});
        visited[0][0] = true; // 방문 여부
        int[][] distance = new int[N][M]; // 거리 계산
        distance[0][0] = 1;
        
        // 방향(상하좌우)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재 위치
            int x = current[0];
            int y = current[1];
            
            for(int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                
                if(nx>=0 && nx<N && ny>=0 && ny<M
                  && board.get(nx).get(ny) == 1 && !visited[nx][ny]) { // 방문 x
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[x][y] + 1; // 거리 갱신
                }
            }
        }
        
        System.out.println(distance[N-1][M-1]);
    }
}