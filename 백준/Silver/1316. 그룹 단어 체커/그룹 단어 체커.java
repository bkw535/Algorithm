import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        char m = ' ';
        for(int i=0; i<n; i++) {
            Set<Character> set = new HashSet<>();
            
            String s = br.readLine();
            boolean dp = false;
            for(char c : s.toCharArray()) {
                if(set.contains(c) && m != c) {
                    dp = true;
                    break;
                }
                m = c;
                set.add(c);
            }
            
            if(dp) {
                continue;
            }
            
            count++;
        }
        
        System.out.println(count);
    }
}