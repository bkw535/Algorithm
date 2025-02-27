import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[][] matrix = new int[9][9];
        int max = Integer.MIN_VALUE;
        int row = 0, col = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        sb.append(max).append("\n").append(row).append(" ").append(col);
        System.out.print(sb);
    }
}