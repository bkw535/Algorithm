import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] paper = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            paper[i][0] = Integer.parseInt(st.nextToken());
            paper[i][1] = Integer.parseInt(st.nextToken());
        }
        
        boolean[][] board = new boolean[100][100];
        
        for(int i=0; i<N; i++) {
            int x = paper[i][0];
            int y = paper[i][1];
            
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    board[x + j][y + k] = true;
                }
            }
        }
        
        int count = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(board[i][j] == true) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}