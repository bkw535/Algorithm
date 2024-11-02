import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int m = arr[0];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(m<arr[i]) {
                m = arr[i];
                n = i+1;
            }
        }
        br.close();
        System.out.println(m);
        System.out.println(n);
    }
}
