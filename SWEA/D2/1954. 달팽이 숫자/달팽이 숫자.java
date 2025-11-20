import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] board = new int[N][N];

            int num = 1;
            int top = 0, bottom = N - 1;
            int left = 0, right = N - 1;

            while (num <= N * N) {
                for (int i = left; i <= right; i++)
                    board[top][i] = num++;
                top++;

                for (int i = top; i <= bottom; i++)
                    board[i][right] = num++;
                right--;

                if (top <= bottom) {
                    for (int i = right; i >= left; i--)
                        board[bottom][i] = num++;
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--)
                        board[i][left] = num++;
                    left++;
                }
            }

            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(board[i][j]);
                    if (j < N - 1) System.out.print(" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}