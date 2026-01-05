import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String s = br.readLine();
        
        while(s != null) {
            if (s.length() == 0) continue;
            map.put(s, map.getOrDefault(s, 0) +1);
            s = br.readLine();
        }
        
        int total = 0;
        for(int v : map.values()) {
            total += v;
        }
        
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            double ratio = (double) map.get(key) / total * 100;
            sb.append(String.format(Locale.US, "%s %.4f\n", key, ratio));
        }
        
        System.out.println(sb.toString());
    }
}