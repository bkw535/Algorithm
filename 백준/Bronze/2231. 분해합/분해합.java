import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        boolean found = false;

        for (int i = 1; i < a; i++) {
            int n = i;
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            if ((sum + i) == a) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(0);
        }
    }
}