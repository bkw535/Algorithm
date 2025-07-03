import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int m = Integer.parseInt(br.readLine());
            for(int j = 0; j < m; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                String ss = st.nextToken();

                map.put(ss, map.getOrDefault(ss, 0) + 1);
            }

            int sum = 1;
            for(String key : map.keySet()) {
                sum*=(map.get(key)+1);
            }
            sb.append(sum-1).append("\n");
        }

        System.out.println(sb.toString());
    }
}