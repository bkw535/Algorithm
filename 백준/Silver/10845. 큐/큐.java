import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        LinkedList<String> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")) {
                queue.offer(st.nextToken());
            } else if(command.equals("pop")) {
                if(queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if(command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if(command.equals("empty")) {
                if(queue.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if(command.equals("front")) {
                if(queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if(command.equals("back")) {
                if(queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.getLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}