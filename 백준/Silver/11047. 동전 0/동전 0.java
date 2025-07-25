import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }
        
        for(int i=N-1; i>=0; i--) {
            int c = 0;
            if(arr[i]>K){
                continue;
            } else {
                c+=(K/arr[i]);
                count+=c;
            }
            K -=arr[i]*c;
        }
        
        System.out.println(count);
    }
}