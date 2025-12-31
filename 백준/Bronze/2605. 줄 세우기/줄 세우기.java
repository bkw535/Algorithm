import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=N; i++) {
            int loc = Integer.parseInt(st.nextToken());
            list.add(list.size() - loc, i);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i : list) {
            sb.append(i).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}