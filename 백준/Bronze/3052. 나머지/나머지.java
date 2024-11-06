import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(br.readLine())%42;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i: a)
            set.add(i);
        System.out.println(set.size());
    }
}
