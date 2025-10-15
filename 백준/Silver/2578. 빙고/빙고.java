import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] board = new int[5][5];
        
        // 빙고판
        for(int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 명령 저장
        int[] order = new int[25];
        int index = 0;
        for(int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++) {
                order[index++] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 빙고 시작
        int count = 0;
        int o = 0;
        while(true) {
            count++;
            int line = 0;
            
            // 칸 채우기
            int k = order[o];
            for(int i=0; i<5; i++) {
                boolean tf = false;
                for(int j=0; j<5; j++) {
                    if(k == board[i][j]){
                        board[i][j] = 0;
                        tf = true;
                        break;
                    }
                }
                if(tf) break;
            }
            
            o++;
            
            // 빙고 확인(가로)
            for(int i=0; i<5; i++) {
                boolean width = true;
                for(int j=0; j<5; j++) {
                    if(board[i][j] != 0) {
                        width = false;
                        break;
                    }
                }
                if(width) line++;
            }

            // 빙고 확인(세로)
            for(int i=0; i<5; i++) {
                boolean height = true;
                for(int j=0; j<5; j++) {
                    if(board[j][i] != 0) {
                        height = false;
                        break;
                    }
                }
                if(height) line++;
            }
            
            // 대각선 (왼쪽 위 → 오른쪽 아래)
            boolean crossl = true;
            for (int i = 0; i < 5; i++) {
                if (board[i][i] != 0) crossl = false;
            }
            if (crossl) line++;

            // 대각선 (오른쪽 위 → 왼쪽 아래)
            boolean crossr = true;
            for (int i = 0; i < 5; i++) {
                if (board[i][4 - i] != 0) crossr = false;
            }
            if (crossr) line++;
            
            if(line>=3) break;
        }
        
        System.out.println(count);
    }
}