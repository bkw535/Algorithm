import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int count = 0;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        dfs(0, 0);
        
        if (M == 0) count--;
        System.out.println(count);
    }
    
    static void dfs(int depth, int sum) {
        if(depth == N) {
            if(sum == M)count++;
            return;
        }
        
        dfs(depth + 1, sum + arr[depth]);
        dfs(depth + 1, sum);
    }
}