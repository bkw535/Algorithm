import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String s = br.readLine();
        int M = Integer.parseInt(br.readLine());
        Stack<Character> stackLeft = new Stack<>();
        Stack<Character> stackRight = new Stack<>();
        
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            stackLeft.push(arr[i]);
        }
        
        for(int i=0; i<M; i++) {
            String o = br.readLine();
            String[] order = o.split(" ");
            if(order[0].equals("L")) {
                if(!stackLeft.isEmpty()) stackRight.push(stackLeft.pop());
            } else if(order[0].equals("D")) {
                if(!stackRight.isEmpty()) stackLeft.push(stackRight.pop());
            } else if(order[0].equals("B")) {
                if(!stackLeft.isEmpty()) stackLeft.pop();
            } else if(order[0].equals("P")){
                stackLeft.push(order[1].charAt(0));
            }
        }
        
        while(!stackLeft.isEmpty()) {
            stackRight.push(stackLeft.pop());
        }

        while(!stackRight.isEmpty()) {
            sb.append(stackRight.pop());
        }

        System.out.println(sb);
    }
}