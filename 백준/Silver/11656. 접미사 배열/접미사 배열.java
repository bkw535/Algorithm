import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        
        String[] arr = new String[S.length()];
        for(int i=0; i<S.length(); i++) {
            arr[i] = S.substring(i);
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.println(sb);
    }
}