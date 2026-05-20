import java.util.*;

class Solution {
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        int answer = 0;
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                bfs(i, computers, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void bfs(int start, int[][]computers, int n) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(start);
        visited[start] = true;
        
        while(!deque.isEmpty()) {
            int cur = deque.poll();
            
            for(int i=0; i<n; i++) {
                if(computers[cur][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    deque.offer(i);
                }
            }
        }
    } 
}