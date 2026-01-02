import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, ArrayList<String>> map = new HashMap<>();
        Map<String, String> mapGroup = new HashMap<>();
        
        for(int i=0; i<N; i++) {
            String group = br.readLine();
            int mem = Integer.parseInt(br.readLine());
            
            ArrayList<String> arr = new ArrayList<>();
            for(int j=0; j<mem; j++) {
                String name = br.readLine();
                arr.add(name);
                mapGroup.put(name, group);
            }
            
            Collections.sort(arr);
            
            map.put(group, arr);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++) {
            String q = br.readLine();
            int a = Integer.parseInt(br.readLine());
            
            if(a == 1) {
                sb.append(mapGroup.get(q)).append("\n");
            }
            
            if(a == 0) {
                for(String b : map.get(q)) {
                    sb.append(b).append("\n");
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}