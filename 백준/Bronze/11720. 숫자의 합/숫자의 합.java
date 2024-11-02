import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split("");
        int n=0;
        for(int i=0; i<a.length; i++){
            n+=Integer.parseInt(a[i]);
        }
        System.out.println(n);
    }
}