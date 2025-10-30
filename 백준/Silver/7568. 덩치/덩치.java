import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        int[][] spec = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            spec[i][0] = weight;
            spec[i][1] = height;
        }
        
        for(int i=0; i<N; i++) {
            int weight = spec[i][0];
            int height = spec[i][1];
            int count = 0;
            
            for(int j=0; j<N; j++) {
                if(i==j) continue;
                if(weight<spec[j][0] && height<spec[j][1]) count++;
            }
            
            count++;
            sb.append(count).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}