import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] cr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = 0;

        for (int i = 0; i < input.length(); i++) {
            boolean found = false;

            for (String croatian : cr) {
                if (i + croatian.length() <= input.length() && input.substring(i, i + croatian.length()).equals(croatian)) {
                    n++;
                    i += croatian.length() - 1;
                    found = true;
                    break;
                }
            }

            if (!found) {
                n++;
            }
        }

        System.out.println(n);
    }
}