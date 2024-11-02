import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }
        int m = b[0]*60 + b[1];
        m-=45;
        int h = m/60;
        int n = m%60;
        if(n<0) {
            h = 23;
            n = (n + 60) % 60;
        }
        System.out.printf("%d %d", h, n);
    }
}
