import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Long> stack = new Stack<>();
        long N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            if (!stack.empty()&& num == 0) {
                stack.pop();
            } else{
                stack.push(num);
            }
        }

        long sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}