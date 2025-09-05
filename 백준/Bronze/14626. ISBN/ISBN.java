import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();
        
        int sum = 0;
        int t = -1;
        int l = 0;
        for(int i=0; i<13; i++) {
            if(arr[i] == '*') {
                t = i;
                continue;
            }
            int num = arr[i] - '0';
            if(i%2 == 0) {
                sum+=num;
            } else if(i%2 == 1) {
                sum+=num*3;
            }
        }
        
        for(int i=0; i<10; i++) {
            int weight = (t % 2 == 0 ? 1 : 3);
            if((sum + i * weight) % 10 == 0) {
                l = i;
                break;
            }
        }
        
        System.out.println(l);
    }
}