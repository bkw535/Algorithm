import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[4][2];
        
        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            arr[i][0] = N;
            arr[i][1] = M;
        }
        
        int x = 0;
        int y = 0;
        
        if(arr[1][0] == arr[0][0]) {
            x = arr[2][0];
        } else if(arr[2][0] == arr[0][0]) {
            x = arr[1][0];
        } else {
            x = arr[0][0];
        }
        
        if(arr[1][1] == arr[0][1]) {
            y = arr[2][1];
        } else if(arr[2][1] == arr[0][1]) {
            y = arr[1][1];
        } else {
            y = arr[0][1];
        }
        
        System.out.println(x + " " + y);
    }
}