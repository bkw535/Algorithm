import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int m = 0;
            int length = 0;

            while (true) {
                m = (m * 10 + 1) % n;
                length++;
                if (m == 0) {
                    System.out.println(length);
                    break;
                }
            }
        }
    }
}