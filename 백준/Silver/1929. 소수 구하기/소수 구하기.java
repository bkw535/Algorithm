import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb =  new StringBuilder();
        long M = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        for (int i = (int) M; i <= N; i++) {
            if (i == 1) continue;
            boolean tf = true;
            int sqrt = (int) Math.sqrt(i);

            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    tf = false;
                    break;
                }
            }

            if (tf) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}