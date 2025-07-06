import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, (a,b) -> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            } else{
                return a[1] - b[1];
            }
        });

        for(int i = 0; i < n; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb.toString());
    }
}