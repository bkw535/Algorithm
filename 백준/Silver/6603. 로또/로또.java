import java.io.*;
import java.util.*;

public class Main {
    static int[] list;
    static int[] arr = new int[6];
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            
            if(N == 0) {
                break;
            }
            
            list = new int[N];
            for(int i=0; i<N; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }
            
            dfs(0, 0);
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
    
    static void dfs(int depth, int start) {
        if(depth == arr.length) {
            for(int i=0; i<arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i=start; i<list.length; i++) {
            arr[depth] = list[i];
            dfs(depth+1, i+1);
        }
    }
}