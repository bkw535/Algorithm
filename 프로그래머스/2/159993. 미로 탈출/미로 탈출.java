import java.util.*;

class Solution {
    boolean[][] visited;
    
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        
        // 시작 지점 찾기
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++) {
            String s = maps[i];
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }
        
        visited = new boolean[n][m];
        int StoL = bfs(n, m, x, y, maps, 'L');
        if(StoL == -1) return -1;
        
        // 레버 찾기
        int lx = 0;
        int ly = 0;
        for(int i=0; i<n; i++) {
            String s = maps[i];
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == 'L') {
                    lx = i;
                    ly = j;
                }
            }
        }
        
        visited = new boolean[n][m];
        int LtoE = bfs(n, m, lx, ly, maps, 'E');
        if(LtoE == -1) return -1;
        
        return StoL + LtoE;
    }
    
    public int bfs(int n, int m, int x, int y, String[] maps, char target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 0});
        visited[x][y] = true;
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int dis = current[2];
            
            if(maps[cx].charAt(cy) == target) {
                return dis;
            }
            
            for(int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m && !visited[nx][ny] && maps[nx].charAt(ny) != 'X') {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, dis+1});
                }
            }
        }
        
        return -1;
    }
}