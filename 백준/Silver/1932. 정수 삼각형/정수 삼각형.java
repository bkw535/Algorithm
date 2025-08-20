import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][n];
        int[][] dp = new int[n][n];
        
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        dp[0][0] = arr[0][0];
        
        for(int i=1; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if (j == 0) {
                    dp[i][j] = arr[i][j] + dp[i-1][j];
                } else if (j == i) {
                    dp[i][j] = arr[i][j] + dp[i-1][j-1];
                } else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
                }
            }
        }
        
        int result = 0;
        for (int j=0; j<n; j++) {
            result = Math.max(result, dp[n-1][j]);
        }
        
        System.out.println(result);
    }
}