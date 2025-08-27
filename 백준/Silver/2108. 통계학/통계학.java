import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        int avg = 0;
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            avg+=arr[i];
        }
        sb.append((int) Math.round((double)avg / n)).append("\n");
        
        Arrays.sort(arr);
        sb.append(arr[arr.length/2]).append("\n");
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Collections.max(freq.values());

        ArrayList<Integer> candidates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                candidates.add(entry.getKey());
            }
        }

        Collections.sort(candidates);

        int mode;
        if (candidates.size() > 1) {
            mode = candidates.get(1);
        } else {
            mode = candidates.get(0);
        }
        sb.append(mode).append("\n");
        
        sb.append(arr[n-1] - arr[0]);
        
        System.out.println(sb);
    }
}