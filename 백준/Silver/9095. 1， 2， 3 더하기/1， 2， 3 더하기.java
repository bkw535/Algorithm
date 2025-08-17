import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        int [] dp = new int[11]; 
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for(int i=4; i<11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        
        int[] arr = new int[T];
        for(int i=0; i<T; i++) {
            int M = Integer.parseInt(br.readLine());
            sb.append(dp[M]).append("\n");
        }
        
        System.out.println(sb);
    }
}