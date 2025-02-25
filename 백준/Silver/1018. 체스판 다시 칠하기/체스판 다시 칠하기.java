import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE;

        for (int r = 0; r <= N - 8; r++) {
            for (int c = 0; c <= M - 8; c++) {
                minPaint = Math.min(minPaint, countRepaints(board, r, c));
            }
        }

        System.out.println(minPaint);
    }

    private static int countRepaints(char[][] board, int r, int c) {
        int count1 = 0;
        int count2 = 0;

        char[] start = {'B', 'W'};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expected1 = start[(i + j) % 2];
                char expected2 = start[(i + j + 1) % 2];

                if (board[r + i][c + j] != expected1) count1++;
                if (board[r + i][c + j] != expected2) count2++;
            }
        }

        return Math.min(count1, count2);
    }
}