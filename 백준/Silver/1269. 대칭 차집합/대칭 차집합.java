import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            set2.add(Integer.parseInt(st.nextToken()));
        }

        int set1count = 0;
        for(int num : set2){
            if(set1.contains(num)){
                set1count++;
            }
        }

        int set2count = 0;
        for(int num : set1){
            if(set2.contains(num)){
                set2count++;
            }
        }
        
        sb.append(set1.size()-set1count + set2.size()-set2count).append("\n");
        System.out.println(sb.toString());
    }
}