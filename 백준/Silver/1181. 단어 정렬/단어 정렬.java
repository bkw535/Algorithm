import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(br.readLine());
        }

        String[] arr = new String[set.size()];
        arr = set.toArray(arr);

        Arrays.sort(arr, Comparator
                .comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb.toString());
    }
}