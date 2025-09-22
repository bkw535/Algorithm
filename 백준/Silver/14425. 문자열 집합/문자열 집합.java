import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        String[] arr = new String[N];
        String[] check = new String[M];
        
        for(int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }
        
        for(int i=0; i<M; i++) {
            check[i] = br.readLine();
        }
        
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<check.length; j++) {
                if(check[j].equals(arr[i])) count++;
            }
        }
        
        System.out.println(count);
    }
}