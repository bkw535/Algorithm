import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] board = new String[5][15];
        
        for(int i=0; i<5; i++) {
            String line = br.readLine();
            for (int j=0; j<line.length(); j++) {
                board[i][j] = String.valueOf(line.charAt(j));
            }
        }
        
        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if (board[j][i] != null) {
                    sb.append(board[j][i]);
                }
            }
        }
        
        System.out.println(sb);
    }
}