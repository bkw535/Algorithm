import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        ArrayList<Long[]> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            String[] m = br.readLine().split(" ");
            long x = Long.parseLong(m[0]);
            long y = Long.parseLong(m[1]);
            arr.add(new Long[]{x, y});
        }

        arr.sort(Comparator.comparing((Long[] a) -> a[0]).thenComparing(a -> a[1]));

        for(Long[] i : arr){
            System.out.println(i[0] + " " + i[1]);
        }
    }
}