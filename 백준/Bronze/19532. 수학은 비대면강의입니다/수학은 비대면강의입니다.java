import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int n1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        
        boolean tf = false;
        int x = 0;
        int y = 0;
        for(int i=-999; i<1000; i++) {
            for(int j=-999; j<1000; j++) {
                if(x1*i + y1*j == n1 && x2*i + y2*j == n2) {
                    tf = true;
                    x = i;
                    y = j;
                    break;
                }
            }
            if(tf) break;
        }
        
        System.out.println(x + " " + y);
    }
}