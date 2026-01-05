import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[L];
        for (int i = 0; i < L; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int answer = map.size();
        if (!map.containsKey(M)) answer++;

        for (int i = 1; i < L; i++) {
            int remove = arr[i - 1];
            int add = arr[(i + N - 1) % L];

            map.put(remove, map.get(remove) - 1);
            if (map.get(remove) == 0) {
                map.remove(remove);
            }

            map.put(add, map.getOrDefault(add, 0) + 1);

            int count = map.size();
            if (!map.containsKey(M)) count++;

            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }
}