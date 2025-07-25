import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }

        int minCount = 64;

        for (int r = 0; r < N - 7; r++) {
            for (int c = 0; c < M - 7; c++) {
                int count1 = 0;
                int count2 = 0;

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char current = board[r + i][c + j];
                        if ((i + j) % 2 == 0) {
                            if (current != 'W') count1++;
                            if (current != 'B') count2++;
                        } else {
                            if (current != 'B') count1++;
                            if (current != 'W') count2++;
                        }
                    }
                }
                minCount = Math.min(minCount, Math.min(count1, count2));
            }
        }

        System.out.println(minCount);
    }
}