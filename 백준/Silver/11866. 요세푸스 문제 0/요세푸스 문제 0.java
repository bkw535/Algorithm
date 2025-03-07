import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        sb.append("<");
        int index = 0;
        while (!list.isEmpty()) {
            index = (index + (m - 1)) % list.size(); // m번째 위치 계산
            sb.append(list.get(index));

            list.remove(index);

            if (!list.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}