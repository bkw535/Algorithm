import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int b = 0;
        while (!q.isEmpty()) {
            if(q.size()==1){
                b = q.poll();
                break;
            }
            q.poll();
            int a = q.poll();
            q.offer(a);
        }

        System.out.println(b);
    }
}