import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }
        
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        Arrays.fill(result, -1);
        
        stack.push(0);
        for(int i=1; i<n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        
        for(int i=0; i<result.length; i++) {
            sb.append(result[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}