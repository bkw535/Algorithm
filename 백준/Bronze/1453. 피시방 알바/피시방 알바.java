import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<Integer> set = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        
        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(set.contains(a)) {
                count++;
            }
            set.add(a);
        }
        
        System.out.println(count);
    }
}