import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        for(int i = 0; i < N; i++) {
            Set<Character> alphabet = new HashSet<>();
            String word = br.readLine();
            alphabet.add(word.charAt(0));
            boolean tf = true;
            
            for(int j=1; j<word.length(); j++) {
                char pre = word.charAt(j-1);
                char cur = word.charAt(j);
                    
                if (pre != cur) {
                    if (alphabet.contains(cur)) {
                        tf = false;
                        break;
                    }
                    alphabet.add(cur);
                }
            }
            
            if(tf) count++;
        }
        
        System.out.println(count);
    }
}