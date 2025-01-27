import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int c = 0;

        for (int i = 0; i < a; i++) {
            int d = input.charAt(i) - 'a' + 1;
            c += d * Math.pow(31, i);
        }

        System.out.println(c);
    }
}