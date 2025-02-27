import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            if (queue.size() == 1) {
                break;
            }
            int temp = queue.peek();
            queue.poll();
            queue.offer(temp);
        }

        System.out.println(queue.peek());
    }
}