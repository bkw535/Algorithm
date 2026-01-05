import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        map.put(M, 0);
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<=N-1; j++) {
                if(arr[i] + arr[j] == M) {
                    map.put(M, map.getOrDefault(M, 0) + 1);
                }
            }
        }
        
        System.out.println(map.get(M));
    }
}