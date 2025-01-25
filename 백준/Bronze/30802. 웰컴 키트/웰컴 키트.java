import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer tp = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(tp.nextToken());
        int p = Integer.parseInt(tp.nextToken());

        int T = 0;
        for (int i = 0; i < 6; i++) {
            T += (num[i] + t - 1) / t;
        }

        int P1 = a / p;
        int P2 = a % p;

        System.out.println(T);
        System.out.println(P1 + " " + P2);
    }
}