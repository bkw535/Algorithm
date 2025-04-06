import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long num5 = 0;
        long num3 = 0;

        while (true) {
            if (N % 5 == 0) {
                num5 += N / 5;
                break;
            }
            N-=3;
            num3++;
            if(N<0){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(num5 + num3);
    }
}