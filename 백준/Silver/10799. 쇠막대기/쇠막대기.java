import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        char b = arr[0];
        int result = 0;

        for (char a : arr) {
            if (a == '(') {
                stack.push(a);
            } else { // ')'
                stack.pop();
                if (b == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }
            b = a;
        }

        System.out.println(result);
    }
}