import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) {
                if(minHeap.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    sb.append(minHeap.poll()).append("\n");
                }
            } else{
                minHeap.add(num);
            }
        }

        System.out.println(sb.toString());
    }
}