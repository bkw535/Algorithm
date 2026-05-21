import java.util.*;

class Solution {
    int answer = 0;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(i, computers, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int node, int[][]computers, int n) {
        visited[node] = true;
        
        for(int i=0; i<n; i++) {
            if(computers[node][i] == 1 && !visited[i]) {
                dfs(i, computers, n);
            }
        }
    }
}