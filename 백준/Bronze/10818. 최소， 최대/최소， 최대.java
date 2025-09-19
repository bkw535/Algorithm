import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int max = m;
        int min = m;
        for(int i=0; i<N-1; i++) {
            int l = Integer.parseInt(st.nextToken());
            if(l>max) max = l;
            if(l<min) min = l;
        }
        
        System.out.println(min + " " + max);
    }
}