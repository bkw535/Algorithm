import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        
        Map<String, Integer> map = new HashMap<>();
        
        for (char s : N.toCharArray()) {
            String m = String.valueOf(Character.toLowerCase(s));
            map.put(m, map.getOrDefault(m, 0) + 1);
        }
        
        int max = 0;
        String a = "";
        boolean tf = false;
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            String key = entry.getKey();
            
            if (count > max) {
                max = count;
                a = key.toUpperCase();
                tf = false;
            } else if (count == max) {
                tf = true;
            }
        }
        
        System.out.println(tf ? "?" : a);
    }
}