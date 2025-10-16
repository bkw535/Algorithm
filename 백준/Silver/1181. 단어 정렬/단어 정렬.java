import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<n; i++) {
            set.add(br.readLine());
        }
        
        List<String> arr = new ArrayList<>(set);
        
        arr.sort((a,b) -> {
            if(a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
         
        for(int i=0; i<arr.size(); i++) {
            sb.append(arr.get(i));
            if(i<n-1) sb.append("\n");
        }
        
        System.out.println(sb);
    }
}