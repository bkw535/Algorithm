import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String input = br.readLine();

        final int r = 31;
        final int m = 1234567891;
        long c = 0;
        long power = 1;

        for (int i = 0; i < a; i++) {
            long d = input.charAt(i) - 'a' + 1;
            c = (c + (d * power) % m) % m;
            power = (power * r) % m;
        }

        System.out.println(c);
    }
}