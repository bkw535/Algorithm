import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            
            String input = br.readLine();
            input = input.substring(1, input.length() - 1);
            
            Deque<Integer> dq = new ArrayDeque<>();
            if (!input.isEmpty()) {
                String[] nums = input.split(",");
                for (String num : nums) {
                    dq.add(Integer.parseInt(num));
                }
            }
            
            boolean isReversed = false;
            boolean error = false;
            
            for (char cmd : p.toCharArray()) {
                if (cmd == 'R') {
                    isReversed = !isReversed;
                } else if (cmd == 'D') {
                    if (dq.isEmpty()) {
                        sb.append("error\n");
                        error = true;
                        break;
                    }
                    if (!isReversed) {
                        dq.pollFirst();
                    } else {
                        dq.pollLast();
                    }
                }
            }
            
            if (!error) {
                sb.append("[");
                if (!dq.isEmpty()) {
                    if (!isReversed) {
                        Iterator<Integer> it = dq.iterator();
                        while (it.hasNext()) {
                            sb.append(it.next());
                            if (it.hasNext()) sb.append(",");
                        }
                    } else {
                        Iterator<Integer> it = dq.descendingIterator();
                        while (it.hasNext()) {
                            sb.append(it.next());
                            if (it.hasNext()) sb.append(",");
                        }
                    }
                }
                sb.append("]\n");
            }
        }
        
        System.out.print(sb);
    }
}