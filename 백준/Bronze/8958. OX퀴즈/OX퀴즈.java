import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] n = new int[a];
        for(int i=0; i<a; i++) {
            int m = 0;
            String[] b = br.readLine().split("");
            for (int j = 0; j < b.length; j++) {
                if (b[j].equals("O")) {
                    m++;
                    n[i] += m;
                } else
                    m = 0;
            }
        }
        for(int i=0; i<n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
