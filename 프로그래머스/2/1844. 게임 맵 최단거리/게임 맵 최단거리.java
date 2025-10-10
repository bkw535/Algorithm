import java.util.*;

class Solution {
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        // 방문 여부
        boolean[][] visited = new boolean[n][m];
        
        // BFS 큐 (x, y, distance)
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dis = current[2];
            
            if(x == n-1 && y == m-1) {
                return dis;
            }
            
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx<0 || ny<0|| nx>=n || ny>=m) {
                    continue;
                }
                
                if(maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dis+1});
                }
            }
        }
        
        return -1;
    }
}