import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        int[][] dp = new int[30][30];
        for(int i=0; i<30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        
        for (int n = 1; n < 30; n++) {
            for (int r = 1; r < n; r++) {
                dp[n][r] = dp[n-1][r-1] + dp[n-1][r];
            }
        }
        
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(dp[M][N]).append("\n");
        }
        
        System.out.println(sb);
    }
}