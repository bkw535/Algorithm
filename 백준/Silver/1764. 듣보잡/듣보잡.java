import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            String word = br.readLine();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> people = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) > 1) {
                people.add(word);
            }
        }

        Collections.sort(people);

        sb.append(people.size()).append("\n");
        for(String word : people) {
            sb.append(word).append("\n");
        }

        System.out.println(sb.toString());
    }
}