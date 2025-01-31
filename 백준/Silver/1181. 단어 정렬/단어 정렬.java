import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];

        for(int i=0; i<n; i++){
            s[i] = br.readLine();
        }

        Arrays.sort(s, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        System.out.println(s[0]);
        for (int i = 1; i < n; i++) {
            if (!s[i].equals(s[i - 1])) {
                System.out.println(s[i]);
            }
        }
    }
}