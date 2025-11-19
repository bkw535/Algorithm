import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        boolean[] set = new boolean[21];  // 1~20 사용

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = true;
            } else if (order.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = false;
            } else if (order.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                sb.append(set[x] ? 1 : 0).append("\n");
            } else if (order.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                set[x] = !set[x];
            } else if (order.equals("all")) {
                Arrays.fill(set, true);
            } else {
                Arrays.fill(set, false);
            }
        }

        System.out.print(sb);
    }
}