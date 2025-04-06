import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            boolean tf = true;

            if(input.charAt(0)=='.'){
                break;
            }

            Stack<Character> stack = new Stack<>();

            for(int i = 0; i<input.length(); i++){
                char c = input.charAt(i);
                if(c == '(' || c == '['){
                    stack.push(c);
                } else if(c == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        tf = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if(c == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        tf = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if(tf && stack.isEmpty()){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}