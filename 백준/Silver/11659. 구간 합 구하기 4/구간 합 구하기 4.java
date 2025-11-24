import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] numArr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            numArr[i] = numArr[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            sb.append(numArr[end] - numArr[start - 1]).append("\n");
        }
        
        System.out.print(sb);
    }
}