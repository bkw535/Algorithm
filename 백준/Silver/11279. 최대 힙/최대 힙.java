import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if(m == 0){
                if(maxHeap.isEmpty()){
                    sb.append(m).append("\n");
                } else{
                    sb.append(maxHeap.peek()).append("\n");
                    maxHeap.poll();
                }
            } else {
                maxHeap.add(m);
            }
        }

        System.out.println(sb.toString());
    }
}