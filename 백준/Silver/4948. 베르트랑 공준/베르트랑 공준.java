import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        boolean[] arr = new boolean[123456*2+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for(int i=2; i*i<123456*2; i++) {
            if(arr[i]) {
                for (int j = i * i; j <= 123456 * 2; j += i) {
                    arr[j] = false;
                }
            }
        }
        
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            
            int count = 0;
            for(int i=n+1; i<=2*n; i++){
                if (arr[i]) count++;
            }
            sb.append(count).append("\n");
        }
        
        System.out.println(sb);
    }
}