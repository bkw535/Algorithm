import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long K = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        long[] arr = new long[(int) K];

        for (int i = 0; i < K; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);
        long s = 1;
        long e = arr[arr.length - 1];
        while (s <= e) {
            long m = (s + e) / 2;
            long count = 0;
            for (int i = 0; i < arr.length; i++) {
                count += arr[i] / m;
            }
            if (count >= N) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        System.out.println(e);
    }
}