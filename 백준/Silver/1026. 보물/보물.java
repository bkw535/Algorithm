import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] a = new int[N];
        Integer[] b = new Integer[N];
        
        StringTokenizer sta = new StringTokenizer(br.readLine());
        StringTokenizer stb = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++){
            a[i] = Integer.parseInt(sta.nextToken());
        }
        
        Arrays.sort(a);
        
        for(int i=0; i<N; i++){
            b[i] = Integer.parseInt(stb.nextToken());
        }

        Arrays.sort(b, Collections.reverseOrder());

        int result = 0;
        for(int i=0; i<N; i++){
            result+=a[i]*b[i];
        }
        
        System.out.println(result);
    }
}