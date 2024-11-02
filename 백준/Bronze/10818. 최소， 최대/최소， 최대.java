import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int m=Integer.parseInt(arr[0]);
        int n=Integer.parseInt(arr[0]);
        for (int i = 0; i < a; i++) {
            if(m<Integer.parseInt(arr[i]))
                m=Integer.parseInt(arr[i]);
            if (n>Integer.parseInt(arr[i]))
                n=Integer.parseInt(arr[i]);
        }
        System.out.printf("%d %d\n",n,m);
    }
}
