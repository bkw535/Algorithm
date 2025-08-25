import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        int[] dp = new int[11];
        
        for(int i=0; i<T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4; i<=10; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        
        for(int i=0; i<T; i++) {
            sb.append(dp[arr[i]]).append("\n");
        }
        
        System.out.println(sb);
    }
}