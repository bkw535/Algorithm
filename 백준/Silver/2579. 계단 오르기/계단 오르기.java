import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] stairs = new int[N+1];
        for(int i=1; i<N+1; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        
        if(N<=1) {
            System.out.println(stairs[N]);
            return;
        } else if(N == 2) {
            System.out.println(stairs[N] + stairs[N-1]);
            return;
        } else {
            int[] dp = new int[N+1];
            Arrays.fill(dp, 0);
            dp[1] += stairs[1];
            dp[2] += stairs[1] + stairs[2];
            for(int i=3; i<N+1; i++) {
                dp[i] = Math.max(dp[i-2], dp[i-3] + stairs[i-1]) + stairs[i];
            }
        
            System.out.println(dp[N]);
        }
    }
}