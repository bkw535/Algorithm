import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int M = Integer.parseInt(br.readLine());
        
        Stack<String> stackLeft = new Stack<>();
        Stack<String> stackRight = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            stackLeft.push(s.charAt(i) + "");
        }
        
        for(int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            
            if(a.equals("L")) {
                if(!stackLeft.isEmpty()) {
                    stackRight.push(stackLeft.pop());   
                }
            }
            if(a.equals("D")) {
                if(!stackRight.isEmpty()) {
                    stackLeft.push(stackRight.pop());   
                }
            }
            if(a.equals("B")) {
                if(!stackLeft.isEmpty()) {
                    stackLeft.pop();
                }
            }
            if(a.equals("P")) {
                String b = st.nextToken();
                stackLeft.push(b);
            }
        }
        
        while(!stackLeft.isEmpty()) {
            stackRight.push(stackLeft.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stackRight.isEmpty()) {
            sb.append(stackRight.pop());
        }
        
        System.out.println(sb.toString());
    }
}