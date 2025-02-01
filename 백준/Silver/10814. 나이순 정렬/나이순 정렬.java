import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = new String[n];

        for(int i=0; i<n; i++){
            input[i] = br.readLine();
        }

        Arrays.sort(input, Comparator.comparingInt(s -> Integer.parseInt(s.split(" ")[0])));

        for(int i=0; i<n; i++){
            System.out.println(input[i]);
        }
    }
}