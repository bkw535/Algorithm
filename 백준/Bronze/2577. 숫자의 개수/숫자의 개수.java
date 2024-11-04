import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        int b = 1;
        int[] c =new int[10];
        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(br.readLine());
            b*=a[i];
        }
        while(b>0){
            int count = b%10;
            c[count]++;
            b/=10;
        }
        for(int i=0; i<c.length; i++)
            System.out.println(c[i]);
    }
}
