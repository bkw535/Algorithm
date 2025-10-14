import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] num = new int[10];
        for(char c : s.toCharArray()) {
            num[c - '0']++;
        }
        
        num[6] = (num[6]+num[9]+1)/2;
        int max = 0;
        for(int i=0; i<num.length-1; i++) {
            if(max<num[i]){
                max = num[i];
            }
        }
        
        System.out.println(max);
    }
}