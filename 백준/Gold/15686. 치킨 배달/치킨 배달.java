import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int min = Integer.MAX_VALUE;
    static List<int[]> homes = new ArrayList<>();
    static List<int[]> chickens = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) homes.add(new int[]{i, j});
                else if (map[i][j] == 2) chickens.add(new int[]{i, j});
            }
        }

        visited = new boolean[chickens.size()];
        combination(0, 0);
        System.out.println(min);
    }

    static void combination(int start, int depth) {
        if (depth == M) {
            min = Math.min(min, getCityChickenDistance());
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            visited[i] = true;
            combination(i + 1, depth + 1);
            visited[i] = false;
        }
    }

    static int getCityChickenDistance() {
        int sum = 0;
        for (int[] h : homes) {
            int dist = Integer.MAX_VALUE;
            for (int i = 0; i < chickens.size(); i++) {
                if (visited[i]) {
                    int[] c = chickens.get(i);
                    dist = Math.min(dist, Math.abs(h[0] - c[0]) + Math.abs(h[1] - c[1]));
                }
            }
            sum += dist;
        }
        return sum;
    }
}