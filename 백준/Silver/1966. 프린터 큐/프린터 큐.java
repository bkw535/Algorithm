import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.add(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean tf = false;

                for (int[] q : queue) {
                    if (q[1] > front[1]) {
                        tf = true;
                        break;
                    }
                }

                if (tf) {
                    queue.add(front);
                } else {
                    count++;
                    if (front[0] == M) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
    }
}