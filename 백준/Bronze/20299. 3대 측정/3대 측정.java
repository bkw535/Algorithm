import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(); 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        int count = 0;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int m1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int m3 = Integer.parseInt(st.nextToken());
            if(m1 >= L && m2 >= L && m3 >= L && (m1 + m2 + m3) >= K) {
                count++;
                sb.append(m1).append(" ")
                  .append(m2).append(" ")
                  .append(m3).append(" ");
            }
        }
        
        System.out.println(count);
        System.out.println(sb.toString().trim());
    }
}